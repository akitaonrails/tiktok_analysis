package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.widgets.PropertyResolver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0eI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1083090eI7 extends C1083100eI8 {
    public static boolean hasInit;
    public static Field renderNode;
    public static Method setOverlapMethod;
    public boolean enableOpt;
    public float mAlpha;
    public ConstraintLayout mContainer;
    public int mFlags;
    public boolean mForceHasOverlappingRenderingCompat;
    public PropertyResolver mPropertyResolver;
    public float mTranslationX;
    public float mTranslationY;
    public int mVisibility;

    public static boolean canOptAlpha() {
        return true;
    }

    private void clearFlags() {
        this.mFlags = 0;
    }

    public void reset() {
        this.mTranslationX = 0.0f;
        this.mTranslationY = 0.0f;
        this.mAlpha = 1.0f;
        this.mVisibility = 0;
        this.mFlags = 0;
        this.mForceHasOverlappingRenderingCompat = true;
        super.setVisibility(0);
        super.setTranslationX(this.mTranslationX);
        super.setTranslationY(this.mTranslationY);
        super.setAlpha(this.mAlpha);
        this.mIdSet.clear();
    }

    private void transform() {
        if (this.mContainer == null || this.mFlags == 0) {
            return;
        }
        for (int i = 0; i < this.mCount; i++) {
            View view = getViews(this.mContainer)[i];
            if (view != null) {
                if (hasFlag(2)) {
                    transformTranslationX(view);
                }
                if (hasFlag(4)) {
                    transformTranslationY(view);
                }
                if (hasFlag(1)) {
                    transformAlpha(view);
                }
                if (hasFlag(8)) {
                    resolveVisibility(view);
                }
            }
        }
        clearFlags();
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.enableOpt ? this.mAlpha : super.getAlpha();
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.enableOpt ? this.mTranslationX : super.getTranslationX();
    }

    @Override // android.view.View
    public float getTranslationY() {
        return this.enableOpt ? this.mTranslationY : super.getTranslationY();
    }

    @Override // android.view.View
    public int getVisibility() {
        return this.enableOpt ? this.mVisibility : super.getVisibility();
    }

    public static void initAlphaOpt() {
        if (canOptAlpha()) {
            try {
                Field declaredField = View.class.getDeclaredField("mRenderNode");
                renderNode = declaredField;
                declaredField.setAccessible(true);
                Method declaredMethod = renderNode.getType().getDeclaredMethod("setHasOverlappingRendering", Boolean.TYPE);
                setOverlapMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C19MX, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
    }

    public boolean isEnableOpt() {
        return this.enableOpt;
    }

    public C1083090eI7(Context context) {
        super(context);
        this.mAlpha = 1.0f;
        this.mForceHasOverlappingRenderingCompat = true;
    }

    private boolean hasFlag(int i) {
        if ((this.mFlags & i) == i) {
            return true;
        }
        return false;
    }

    private void resolveVisibility(View view) {
        int resolvedVisibility;
        boolean z;
        int visibility = view.getVisibility();
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            resolvedVisibility = propertyResolver.getResolvedVisibility(view.getId());
        } else {
            resolvedVisibility = this.mVisibility;
        }
        C786410Ut5.LJLLLLLL(resolvedVisibility, view);
        if (resolvedVisibility != visibility) {
            PropertyResolver propertyResolver2 = this.mPropertyResolver;
            int id = view.getId();
            if (resolvedVisibility == 8) {
                z = true;
            } else {
                z = false;
            }
            propertyResolver2.onHiddenChanged(id, z);
        }
    }

    private void transformAlpha(View view) {
        float resolvedAlpha;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            resolvedAlpha = propertyResolver.getResolvedAlpha(view.getId());
        } else {
            resolvedAlpha = this.mAlpha;
        }
        C786410Ut5.T4(view, resolvedAlpha);
    }

    private void transformTranslationX(View view) {
        float transformedTranslationX;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            transformedTranslationX = propertyResolver.getResolvedTranslationX(view.getId());
        } else {
            transformedTranslationX = getTransformedTranslationX(view);
        }
        C786410Ut5.Jc(view, transformedTranslationX);
    }

    private void transformTranslationY(View view) {
        float transformedTranslationY;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            transformedTranslationY = propertyResolver.getResolvedTranslationY(view.getId());
        } else {
            transformedTranslationY = getTransformedTranslationY(view);
        }
        C786410Ut5.ed(view, transformedTranslationY);
    }

    public void addReferencedId(int i) {
        if (isReferenced(i)) {
            return;
        }
        if (i != getId()) {
            int i2 = this.mCount + 1;
            int[] iArr = this.mIds;
            if (i2 > iArr.length) {
                this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.mIds;
            int i3 = this.mCount;
            iArr2[i3] = i;
            this.mCount = i3 + 1;
            if (this.enableOpt) {
                invalidateHelper();
            }
        }
        this.mIdSet.add(Integer.valueOf(i));
    }

    public void forceHasOverlappingRenderingCompat(boolean z) throws Throwable {
        boolean zHasOverlappingRendering;
        int iIntValue;
        int iMax;
        if (!hasInit) {
            initAlphaOpt();
            hasInit = true;
        }
        if (this.mContainer != null && canOptAlpha() && this.mForceHasOverlappingRenderingCompat != z) {
            this.mForceHasOverlappingRenderingCompat = z;
            if (setOverlapMethod != null && renderNode != null) {
                for (int i = 0; i < this.mCount; i++) {
                    View view = getViews(this.mContainer)[i];
                    if (view != null) {
                        Object tag = view.getTag(R.id.n9c);
                        if (!(tag instanceof Boolean) || ((Boolean) tag).booleanValue()) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                zHasOverlappingRendering = view.getHasOverlappingRendering();
                            } else {
                                zHasOverlappingRendering = view.hasOverlappingRendering();
                            }
                            try {
                                Object obj = renderNode.get(view);
                                Object tag2 = view.getTag(R.id.n9b);
                                if (tag2 instanceof Integer) {
                                    iIntValue = ((Integer) tag2).intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                if (z) {
                                    int i2 = iIntValue - 1;
                                    if (obj != null && i2 == 0) {
                                        C2204961BRm.a0(setOverlapMethod, obj, new Object[]{Boolean.valueOf(zHasOverlappingRendering)}, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ytm9Driz5ePP6APtYO/PnzT+1gfQKOUvq1W01KbgD", null));
                                    }
                                    iMax = Math.max(i2, 0);
                                } else {
                                    iMax = iIntValue + 1;
                                    if (obj != null) {
                                        C2204961BRm.a0(setOverlapMethod, obj, new Object[]{Boolean.FALSE}, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ytm9Driz5ePP6APtYO/PnzT+1gfQKOUvq1W01KbgD", null));
                                    }
                                }
                                view.setTag(R.id.n9b, Integer.valueOf(iMax));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            }
        }
    }

    public float getTransformedTranslationX(View view) {
        return this.mTranslationX;
    }

    public float getTransformedTranslationY(View view) {
        return this.mTranslationY;
    }

    @Override // X.C19MX
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
    }

    @Override // X.C1083100eI8
    public void onViewAdded(View view) {
        if (isReferenced(view.getId())) {
            invalidateHelper();
            if (this.mTranslationX != 0.0f) {
                transformTranslationX(view);
            }
            if (this.mTranslationY != 0.0f) {
                transformTranslationY(view);
            }
            if (this.mAlpha < 1.0f) {
                transformAlpha(view);
            }
            if (this.mVisibility == 8) {
                resolveVisibility(view);
            }
        }
    }

    @Override // X.C1083100eI8
    public void onViewRemoved(View view) {
        if (isReferenced(view.getId())) {
            invalidateHelper();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (this.mAlpha != f) {
            super.setAlpha(f);
            this.mAlpha = f;
            this.mFlags |= 1;
            transform();
        }
    }

    public void setEnableOpt(boolean z) {
        this.enableOpt = z;
    }

    public void setPropertyResolver(PropertyResolver propertyResolver) {
        this.mPropertyResolver = propertyResolver;
    }

    @Override // X.C1083100eI8, X.C19MX
    public void setReferencedIds(int[] iArr) {
        super.setReferencedIds(iArr);
        if (this.enableOpt) {
            invalidateHelper();
        }
        if (this.mTranslationX != 0.0f) {
            this.mFlags |= 2;
        }
        if (this.mTranslationY != 0.0f) {
            this.mFlags |= 4;
        }
        if (this.mAlpha < 1.0f) {
            this.mFlags |= 1;
        }
        if (this.mVisibility == 8) {
            this.mFlags |= 8;
        }
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (this.mTranslationX != f) {
            super.setTranslationX(f);
            this.mTranslationX = f;
            this.mFlags |= 2;
            transform();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (this.mTranslationY != f) {
            super.setTranslationY(f);
            this.mTranslationY = f;
            this.mFlags |= 4;
            transform();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.mVisibility != i) {
            super.setVisibility(i);
            this.mVisibility = i;
            this.mFlags |= 8;
            transform();
        }
    }

    public void updateContainer(ConstraintLayout constraintLayout) {
        this.mContainer = constraintLayout;
    }

    @Override // X.C19MX
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        transform();
    }

    @Override // X.C1083100eI8, X.C19MX
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.mContainer = constraintLayout;
    }

    public C1083090eI7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAlpha = 1.0f;
        this.mForceHasOverlappingRenderingCompat = true;
    }

    public C1083090eI7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAlpha = 1.0f;
        this.mForceHasOverlappingRenderingCompat = true;
    }
}

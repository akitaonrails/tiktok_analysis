package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u4.q0;

/* JADX INFO: renamed from: X.14Ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20247014Ke extends FrameLayout {
    public final List<View> LL;
    public final List<View> LLILLJJLI;
    public View.OnApplyWindowInsetsListener LLILLL;
    public boolean LLILZ;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.LJJJLL(this).LJJJJZ(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            LIZ(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public C20247014Ke(Context context) {
        super(context);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILZ = true;
    }

    public final void LIZ(View view) {
        if (this.LLILLJJLI.contains(view)) {
            this.LL.add(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C20246014Ju c20246014JuLJIIL;
        C20246014Ju c20246014JuLJIIJJI = C20246014Ju.LJIIJJI(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.LLILLL;
        if (onApplyWindowInsetsListener != null) {
            c20246014JuLJIIL = C20246014Ju.LJIIJJI(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            c20246014JuLJIIL = q0.LJIIL(this, c20246014JuLJIIJJI);
        }
        if (!c20246014JuLJIIL.LJII()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                q0.LIZJ(getChildAt(i), c20246014JuLJIIL);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLILZ) {
            Iterator<View> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                super.drawChild(canvas, it2.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.LLILLJJLI.remove(view);
        if (this.LL.remove(view)) {
            this.LLILZ = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        LIZ(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        LIZ(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        LIZ(view);
        super.removeViewInLayout(view);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.LLILZ = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.LLILLL = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.LLILLJJLI.add(view);
        }
        super.startViewTransition(view);
    }

    public C20247014Ke(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILZ = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FragmentContainerView must be within a FragmentActivity to use ");
                sbLIZ.append(str);
                sbLIZ.append("=\"");
                sbLIZ.append(classAttribute);
                sbLIZ.append('\"');
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            LIZ(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            LIZ(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public C20247014Ke(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String strLIZIZ;
        super(context, attributeSet);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILZ = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.FragmentContainerView_android_name) : classAttribute;
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentLJJJJZ = fragmentManager.LJJJJZ(id);
        if (classAttribute != null && fragmentLJJJJZ == null) {
            if (id == -1) {
                if (strXd != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" with tag ");
                    sbLIZ.append(strXd);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FragmentContainerView must have an android:id to add Fragment ");
                sbLIZ2.append(classAttribute);
                sbLIZ2.append(strLIZIZ);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            C20135813qW c20135813qWLJJLIIIJJIZ = fragmentManager.LJJLIIIJJIZ();
            context.getClassLoader();
            Fragment fragmentLIZ = c20135813qWLJJLIIIJJIZ.LIZ(classAttribute);
            fragmentLIZ.mFragmentId = id;
            fragmentLIZ.mContainerId = id;
            fragmentLIZ.mTag = strXd;
            fragmentLIZ.mFragmentManager = fragmentManager;
            fragmentLIZ.mHost = fragmentManager.LJJLIIIJLJLI();
            fragmentLIZ.onInflate(context, attributeSet, (Bundle) null);
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ = true;
            fragmentLIZ.mContainer = this;
            fragmentLIZ.mInDynamicContainer = true;
            c19ehLJIIJ.LIZJ(getId(), fragmentLIZ, strXd);
            c19ehLJIIJ.LJIIL();
        }
        fragmentManager.LJLL(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.ij1);
        if ((tag instanceof Fragment) && tag != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sbLIZ.append(view);
        sbLIZ.append(" is not associated with a Fragment.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.LLILZ && (!this.LL.isEmpty()) && this.LL.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }
}

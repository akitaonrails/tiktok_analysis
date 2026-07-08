package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19MX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19MX extends View {
    public int mCount;
    public C19MY mHelperWidget;
    public int[] mIds;
    public HashMap<Integer, String> mMap;
    public String mReferenceIds;
    public String mReferenceTags;
    public boolean mUseViewMeasure;
    public View[] mViews;
    public Context myContext;

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void resolveRtl(C19OA c19oa, boolean z) {
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C19ME) {
            ((C19ME) layoutParams).widget = (C19OA) this.mHelperWidget;
        }
    }

    public void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public C19MX(Context context) {
        super(context);
        this.mIds = new int[32];
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(null);
    }

    private void addID(String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            getParent();
        }
        int iFindId = findId(strTrim);
        if (iFindId != 0) {
            this.mMap.put(Integer.valueOf(iFindId), strTrim);
            addRscID(iFindId);
        }
    }

    private void addRscID(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i2 > iArr.length) {
            this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i3 = this.mCount;
        iArr2[i3] = i;
        this.mCount = i3 + 1;
    }

    private void addTag(String str) {
        ViewGroup viewGroup;
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        String strTrim = str.trim();
        if ((getParent() instanceof ConstraintLayout) && (viewGroup = (ViewGroup) getParent()) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof C19ME) && strTrim.equals(((C19ME) layoutParams).constraintTag) && childAt.getId() != -1) {
                    addRscID(childAt.getId());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int findId(java.lang.String r5) {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r3 = 0
            if (r0 == 0) goto L31
            android.view.ViewParent r2 = r4.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
        Lf:
            boolean r1 = r4.isInEditMode()
            r0 = 0
            if (r1 == 0) goto L28
            if (r2 == 0) goto L33
            java.lang.Object r1 = r2.getDesignInformation(r0, r5)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L2a
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 != 0) goto L56
        L28:
            if (r2 == 0) goto L33
        L2a:
            int r0 = r4.findId(r2, r5)
            if (r0 != 0) goto L56
            goto L33
        L31:
            r2 = r3
            goto Lf
        L33:
            java.lang.Class<androidx.constraintlayout.widget.R$id> r0 = androidx.constraintlayout.widget.R$id.class
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch: java.lang.Exception -> L40
            int r0 = r0.getInt(r3)     // Catch: java.lang.Exception -> L40
            if (r0 != 0) goto L56
            goto L44
        L40:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L44:
            android.content.Context r0 = r4.myContext
            android.content.res.Resources r2 = r0.getResources()
            android.content.Context r0 = r4.myContext
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "id"
            int r0 = X.C786410Ut5.n3(r2, r5, r0, r1)
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19MX.findId(java.lang.String):int");
    }

    public void addView(View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.mReferenceIds = null;
        addRscID(view.getId());
        requestLayout();
    }

    public void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.mCount; i++) {
            View viewById = constraintLayout.getViewById(this.mIds[i]);
            if (viewById != null) {
                C786410Ut5.LJLLLLLL(visibility, viewById);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        for (int i = 0; i < this.mCount; i++) {
            this.mViews[i] = constraintLayout.getViewById(this.mIds[i]);
        }
        return this.mViews;
    }

    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    this.mReferenceIds = strXd;
                    setIds(strXd);
                } else if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                    this.mReferenceTags = strXd2;
                    setReferenceTags(strXd2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void removeView(View view) {
        int i;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.mReferenceIds = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.mCount) {
                break;
            }
            if (this.mIds[i2] != id) {
                i2++;
            } else {
                while (true) {
                    i = this.mCount;
                    if (i2 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i3 = i2 + 1;
                    iArr[i2] = iArr[i3];
                    i2 = i3;
                }
                this.mIds[i - 1] = 0;
                this.mCount = i - 1;
            }
        }
        requestLayout();
    }

    public void setIds(String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                addID(str.substring(i));
                return;
            } else {
                addID(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.mReferenceTags = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                addTag(str.substring(i));
                return;
            } else {
                addTag(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i : iArr) {
            addRscID(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[PHI: r0
      0x0047: PHI (r0v6 android.view.View) = (r0v5 android.view.View), (r0v11 android.view.View) binds: [B:12:0x0020, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r5.mReferenceIds
            r5.setIds(r0)
        Lb:
            X.19MY r0 = r5.mHelperWidget
            if (r0 != 0) goto L10
            return
        L10:
            r0.LIZ()
            r4 = 0
        L14:
            int r0 = r5.mCount
            if (r4 >= r0) goto L53
            int[] r0 = r5.mIds
            r2 = r0[r4]
            android.view.View r0 = r6.getViewById(r2)
            if (r0 != 0) goto L47
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r5.mMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            int r2 = r5.findId(r6, r3)
            if (r2 == 0) goto L50
            int[] r0 = r5.mIds
            r0[r4] = r2
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r5.mMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r3)
            android.view.View r0 = r6.getViewById(r2)
            if (r0 == 0) goto L50
        L47:
            X.19MY r1 = r5.mHelperWidget
            X.19OA r0 = r6.getViewWidget(r0)
            r1.LIZJ(r0)
        L50:
            int r4 = r4 + 1
            goto L14
        L53:
            X.19MY r0 = r5.mHelperWidget
            r0.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19MX.updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public C19MX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    private int[] convertReferenceString(View view, String str) {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        for (String str2 : strArrSplit) {
            int iFindId = findId(str2.trim());
            if (iFindId != 0) {
                iArr[i] = iFindId;
                i++;
            }
        }
        if (i != strArrSplit.length) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    private int findId(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.mReferenceIds == null) {
            addRscID(i);
        }
    }

    public C19MX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIds = new int[32];
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public void updatePreLayout(C19O9 c19o9, C19MY c19my, SparseArray<C19OA> sparseArray) {
        c19my.LIZ();
        for (int i = 0; i < this.mCount; i++) {
            c19my.LIZJ(sparseArray.get(this.mIds[i]));
        }
    }

    public void loadParameters(C19MA c19ma, C21530019Nq c21530019Nq, C19ME c19me, SparseArray<C19OA> sparseArray) {
        C19M2 c19m2 = c19ma.LIZLLL;
        int[] iArr = c19m2.LJJJZ;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c19m2.LJJL;
            if (str != null && str.length() > 0) {
                C19M2 c19m22 = c19ma.LIZLLL;
                c19m22.LJJJZ = convertReferenceString(this, c19m22.LJJL);
            }
        }
        c21530019Nq.LIZ();
        if (c19ma.LIZLLL.LJJJZ != null) {
            int i = 0;
            while (true) {
                int[] iArr2 = c19ma.LIZLLL.LJJJZ;
                if (i < iArr2.length) {
                    C19OA c19oa = sparseArray.get(iArr2[i]);
                    if (c19oa != null) {
                        c21530019Nq.LIZJ(c19oa);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}

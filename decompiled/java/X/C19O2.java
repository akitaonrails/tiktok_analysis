package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;

/* JADX INFO: renamed from: X.19O2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19O2 implements C19O0 {
    public final ConstraintFloatWindowLayout LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public final /* synthetic */ ConstraintFloatWindowLayout LJII;

    @Override // X.C19O0
    public final void LIZ() {
        int size = this.LIZ.LIZLLL.size();
        if (size > 0) {
            int i = 0;
            do {
                AbstractC780060Uiq abstractC780060Uiq = (AbstractC780060Uiq) C13LP.LJJJLZIJ(i, this.LJII.LIZLLL);
                if (abstractC780060Uiq != null && abstractC780060Uiq.LIZLLL) {
                    abstractC780060Uiq.LIZLLL();
                }
                i++;
            } while (i < size);
        }
    }

    public C19O2(ConstraintFloatWindowLayout constraintFloatWindowLayout, ConstraintFloatWindowLayout constraintFloatWindowLayout2) {
        this.LJII = constraintFloatWindowLayout;
        this.LIZ = constraintFloatWindowLayout2;
    }

    @Override // X.C19O0
    public final void LIZIZ(C19OA c19oa, C21530919Nz c21530919Nz) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        boolean z;
        boolean z2;
        View view;
        if (c19oa == null || c21530919Nz == null) {
            return;
        }
        if (c19oa.mVisibility == 8 && !c19oa.inPlaceholder) {
            c21530919Nz.LJ = 0;
            c21530919Nz.LJFF = 0;
            c21530919Nz.LJI = 0;
            return;
        }
        if (c19oa.mParent == null) {
            return;
        }
        C19O3 c19o3 = c21530919Nz.LIZ;
        C19O3 c19o32 = c21530919Nz.LIZIZ;
        int i = c21530919Nz.LIZJ;
        int i2 = c21530919Nz.LIZLLL;
        int i3 = this.LIZIZ + this.LIZJ;
        int i4 = this.LIZLLL;
        Object obj = c19oa.mCompanionWidget;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            if (view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0) {
                c21530919Nz.LJ = view.getMeasuredWidth();
                c21530919Nz.LJFF = view.getMeasuredHeight();
                c21530919Nz.LJI = view.getBaseline();
                return;
            }
            return;
        }
        if (c19o3 != null) {
            int i5 = C19O1.LIZ[c19o3.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.LJFF, i4, -2);
                            if (c19oa.mMatchConstraintDefaultWidth == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i6 = c21530919Nz.LJIIIZ;
                            if (i6 == 1 ? !z2 || c19oa.isResolvedHorizontally() : i6 == 2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c19oa.getWidth(), 1073741824);
                            }
                        }
                    } else {
                        iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.LJFF, i4 + c19oa.getHorizontalMargin(), -1);
                    }
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.LJFF, i4, -2);
                }
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            }
            if (c19o32 != null) {
                int i7 = C19O1.LIZ[c19o32.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.LJI, i3, -2);
                                if (c19oa.mMatchConstraintDefaultHeight == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i8 = c21530919Nz.LJIIIZ;
                                if (i8 == 1 ? !z || c19oa.isResolvedVertically() : i8 == 2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c19oa.getHeight(), 1073741824);
                                }
                            }
                        } else {
                            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.LJI, i3 + c19oa.getVerticalMargin(), -1);
                        }
                    } else {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.LJI, i3, -2);
                    }
                } else {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                }
                C19OA c19oa2 = c19oa.mParent;
                if ((c19oa2 instanceof C19O9) && c19oa2 != null) {
                    this.LJII.getClass();
                }
                C19O3 c19o33 = C19O3.MATCH_CONSTRAINT;
                if (c19o3 == c19o33) {
                }
                if (c19o32 == c19o33) {
                }
                C19O3 c19o34 = C19O3.MATCH_PARENT;
                if (c19oa instanceof C21530419Nu) {
                    ((C21530419Nu) c19oa).LJ(View.MeasureSpec.getMode(iMakeMeasureSpec), View.MeasureSpec.getSize(iMakeMeasureSpec), View.MeasureSpec.getMode(iMakeMeasureSpec2), View.MeasureSpec.getSize(iMakeMeasureSpec2));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        throw new C1954807lC();
    }
}

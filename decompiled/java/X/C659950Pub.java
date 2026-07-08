package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Pub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659950Pub {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
    public static final int LIZJ = R.id.qci;
    public static final int LIZLLL = R.id.qbp;
    public static final int LJ = R.id.qbq;

    public static void LIZ(View view, Integer num) {
        C19ME c19me;
        ConstraintLayout constraintLayout;
        C659720PuE.LIZ.getClass();
        Object layoutParams = null;
        if (C659720PuE.LIZ()) {
            int i = LIZLLL;
            View viewFindViewById = view.findViewById(i);
            if (viewFindViewById != null) {
                layoutParams = viewFindViewById.getParent();
            }
            if ((layoutParams instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) layoutParams) != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                if (num == null) {
                    c19mb.LJIIIZ(i, 4, 0, 4, LIZIZ);
                } else {
                    c19mb.LJIIIZ(i, 4, num.intValue(), 3, LIZIZ);
                }
                c19mb.LIZIZ(constraintLayout);
                return;
            }
            return;
        }
        View viewFindViewById2 = view.findViewById(LIZLLL);
        if (viewFindViewById2 != null) {
            layoutParams = viewFindViewById2.getLayoutParams();
        }
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        if (num == null) {
            c19me.bottomToBottom = 0;
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = LIZIZ;
        } else {
            c19me.bottomToTop = num.intValue();
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = LIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[PHI: r5
      0x00b5: PHI (r5v1 int) = (r5v0 int), (r5v7 int) binds: [B:38:0x00b1, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(X.C659750PuH r7, android.view.View r8) {
        /*
            r0 = 2131391722(0x7f0a74ea, float:1.8404052E38)
            android.view.View r3 = r8.findViewById(r0)
            r0 = 2131391720(0x7f0a74e8, float:1.8404048E38)
            android.view.View r2 = r8.findViewById(r0)
            r6 = 0
            if (r3 == 0) goto Lb0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r5 = r1.getMarginStart()
        L1f:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb5
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
        L2d:
            int r5 = r5 + r0
            r4 = 30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r5 = r5 + r0
            if (r2 == 0) goto Lae
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lae
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
        L4d:
            int r5 = r5 + r0
            if (r2 == 0) goto Lac
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lac
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
        L5e:
            int r5 = r5 + r0
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.ISearchCLAAnchorProtocol r3 = com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.ISearchCLAAnchorProtocol.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.LL
            X.0PT4 r1 = r7.LLILZIL
            r0 = 0
            boolean r0 = r3.od0(r0, r2, r1)
            if (r0 == 0) goto Lb8
            r0 = 2131392926(0x7f0a799e, float:1.8406494E38)
            android.view.View r3 = r8.findViewById(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r2 = X.C814420VxA.LIZIZ(r0)
            if (r3 == 0) goto Laa
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Laa
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
        L8f:
            int r2 = r2 + r0
            if (r3 == 0) goto La0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r6 = r1.getMarginEnd()
        La0:
            int r2 = r2 + r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            int r0 = r0.intValue()
            return r0
        Laa:
            r0 = 0
            goto L8f
        Lac:
            r0 = 0
            goto L5e
        Lae:
            r0 = 0
            goto L4d
        Lb0:
            r5 = 0
            if (r3 == 0) goto Lb5
            goto L1f
        Lb5:
            r0 = 0
            goto L2d
        Lb8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C659950Pub.LIZJ(X.0PuH, android.view.View):int");
    }

    public static void LIZIZ(View view, boolean z, Integer num, Integer num2) {
        C19ME c19me;
        int iIntValue;
        int iLIZIZ;
        ConstraintLayout constraintLayout;
        int iIntValue2;
        int iLIZIZ2;
        C659720PuE.LIZ.getClass();
        int iIntValue3 = 0;
        Object layoutParams = null;
        if (C659720PuE.LIZ()) {
            int i = LJ;
            View viewFindViewById = view.findViewById(i);
            if (viewFindViewById != null) {
                layoutParams = viewFindViewById.getParent();
            }
            if ((layoutParams instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) layoutParams) != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                if (z) {
                    if (num != null) {
                        iLIZIZ2 = num.intValue();
                    } else {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                    }
                    c19mb.LJIIIZ(i, 4, 0, 4, iLIZIZ2);
                } else {
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = LIZJ;
                    }
                    if (num != null) {
                        iIntValue3 = num.intValue();
                    }
                    c19mb.LJIIIZ(i, 4, iIntValue2, 3, iIntValue3);
                }
                c19mb.LIZIZ(constraintLayout);
                return;
            }
            return;
        }
        View viewFindViewById2 = view.findViewById(LJ);
        if (viewFindViewById2 != null) {
            layoutParams = viewFindViewById2.getLayoutParams();
        }
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        if (z) {
            c19me.bottomToBottom = 0;
            c19me.bottomToTop = -1;
            if (num != null) {
                iLIZIZ = num.intValue();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            }
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = iLIZIZ;
            return;
        }
        c19me.bottomToBottom = -1;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = LIZJ;
        }
        c19me.bottomToTop = iIntValue;
        if (num == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = num.intValue();
    }
}

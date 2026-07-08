package Y;

import X.C1C7U;
import X.C21616519il;
import X.C423010GiJ;
import X.C426040GnC;
import X.C444960Hcc;
import X.C446700HfQ;
import X.C786410Ut5;
import X.DialogC446550HfB;
import X.DialogC446620HfI;
import X.InterfaceC1427630nFp;
import X.ViewOnTouchListenerC1351130lGR;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS15S0400000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        float width;
        View view = ((ViewOnTouchListenerC1351130lGR) this.l0).LLJIJIL;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        if (C444960Hcc.LIZIZ()) {
            width = 0.0f;
        } else {
            View view3 = ((ViewOnTouchListenerC1351130lGR) this.l0).LLJIJIL;
            if (view3 == null) {
                view3 = null;
            }
            width = view3.getWidth();
        }
        view.setPivotX(width);
        View view4 = ((ViewOnTouchListenerC1351130lGR) this.l0).LLJIJIL;
        if (view4 == null) {
            view4 = null;
        } else {
            view2 = view4;
        }
        view4.setPivotY((view2.getHeight() / 2) + (((ViewOnTouchListenerC1351130lGR) this.l0).LLJJIJIL / 2));
        ((C21616519il) this.l1).LJIIIZ();
        ((C21616519il) this.l2).LJIIIZ();
        C786410Ut5.Pd((ObjectAnimator) this.l3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[PHI: r1
      0x0094: PHI (r1v1 java.lang.Integer) = (r1v0 java.lang.Integer), (r1v12 java.lang.Integer) binds: [B:9:0x001d, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getWidth()
            if (r0 > 0) goto Lb
            return
        Lb:
            java.lang.Object r0 = r6.l0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            if (r3 != 0) goto L16
            return
        L16:
            java.lang.Object r0 = r6.l1
            X.1975 r0 = (X.AnonymousClass1975) r0
            java.lang.Integer r1 = r0.LJIIIIZZ
            r5 = 0
            if (r1 != 0) goto L94
            int r0 = r3.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 > 0) goto L94
            java.lang.Object r0 = r6.l0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r0.getHeight()
        L33:
            java.lang.Object r1 = r6.l1
            X.1975 r1 = (X.AnonymousClass1975) r1
            java.lang.Integer r0 = r1.LJIIIIZZ
            if (r0 != 0) goto L41
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.LJIIIIZZ = r0
        L41:
            java.lang.Object r0 = r6.l2
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L8b
            int r1 = r1.intValue()
        L57:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            java.lang.Object r0 = r6.l2
            android.view.View r0 = (android.view.View) r0
            r0.measure(r2, r1)
            java.lang.Object r0 = r6.l3
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getBottom()
            java.lang.Object r0 = r6.l2
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 + r0
            int r1 = java.lang.Math.max(r4, r1)
            int r0 = r3.height
            if (r0 == r1) goto L8a
            r3.height = r1
            java.lang.Object r0 = r6.l0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C786410Ut5.X5(r3, r0)
        L8a:
            return
        L8b:
            java.lang.Object r0 = r6.l0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getWidth()
            goto L57
        L94:
            int r4 = r1.intValue()
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0400000_6.LIZ$1():void");
    }

    public final void LIZ$2() {
        View view;
        View view2 = ((DialogC446550HfB) this.l0).LLJJL;
        if (view2 != null) {
            view2.setPivotX((C444960Hcc.LIZIZ() || (view = ((DialogC446550HfB) this.l0).LLJJL) == null) ? 0.0f : view.getWidth());
        }
        List<CollectionDetail> list = ((DialogC446550HfB) this.l0).LLJILJILJ;
        boolean z = false;
        if (list != null && list.isEmpty()) {
            z = true;
        }
        if (z) {
            View view3 = ((DialogC446550HfB) this.l0).LLJJL;
            if (view3 != null) {
                view3.setPivotY(view3.getHeight() / 2);
            }
        } else {
            View view4 = ((DialogC446550HfB) this.l0).LLJJL;
            if (view4 != null) {
                DialogC446550HfB dialogC446550HfB = (DialogC446550HfB) this.l0;
                view4.setPivotY((view4.getHeight() / 2) + ((dialogC446550HfB.LLJJIJIIJIL - dialogC446550HfB.LLJJIJIL) / 2));
            }
        }
        ((C21616519il) this.l1).LJIIIZ();
        ((C21616519il) this.l2).LJIIIZ();
        C786410Ut5.Pd((ObjectAnimator) this.l3);
    }

    public final void LIZ$3() {
        View view;
        View view2 = ((DialogC446620HfI) this.l0).LLJJ;
        if (view2 != null) {
            view2.setPivotX((C444960Hcc.LIZIZ() || (view = ((DialogC446620HfI) this.l0).LLJJ) == null) ? 0.0f : view.getWidth());
        }
        View view3 = ((DialogC446620HfI) this.l0).LLJJ;
        if (view3 != null) {
            view3.setPivotY(view3.getHeight() / 2);
        }
        ((C21616519il) this.l1).LJIIIZ();
        ((C21616519il) this.l2).LJIIIZ();
        C786410Ut5.Pd((ObjectAnimator) this.l3);
    }

    public static final void run$0(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("TakeStagePlayingUserNameMaxWidthKt@a0e5.applyTakeStagePlayingUserNameMaxWidth$1");
        try {
            C423010GiJ.LIZIZ((RecyclerView.ViewHolder) aRunnableS15S0400000_6.l0, (View) aRunnableS15S0400000_6.l1, (AppCompatTextView) aRunnableS15S0400000_6.l2, (View) aRunnableS15S0400000_6.l3);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("TakeStagePlayingUserNameMaxWidthKt@a0e5.applyTakeStagePlayingUserNameMaxWidth$1");
    }

    public static final void run$1(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTabBubbleView@25.hideBubble$1$1");
        try {
            C21616519il c21616519il = (C21616519il) aRunnableS15S0400000_6.l0;
            final C446700HfQ c446700HfQ = (C446700HfQ) aRunnableS15S0400000_6.l3;
            c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0HfR
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                    if (C1388190mED.LIZ(c446700HfQ.LL) != null) {
                        Activity activityLIZ = C1388190mED.LIZ(c446700HfQ.LL);
                        if (activityLIZ == null || !activityLIZ.isFinishing()) {
                            super/*X.198m*/.dismiss();
                        }
                    }
                }
            });
            ((C21616519il) aRunnableS15S0400000_6.l0).LJIIIZ();
            ((C21616519il) aRunnableS15S0400000_6.l1).LJIIIZ();
            C786410Ut5.Pd((ObjectAnimator) aRunnableS15S0400000_6.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTabBubbleView@25.hideBubble$1$1");
    }

    public static final void run$2(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("QuickCommentDialog@b8b6.show$1$1");
        try {
            aRunnableS15S0400000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("QuickCommentDialog@b8b6.show$1$1");
    }

    public static final void run$3(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("VideoAutoPolishAdapter@b873.ensurePanelSpace$1");
        try {
            aRunnableS15S0400000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoAutoPolishAdapter@b873.ensurePanelSpace$1");
    }

    public static final void run$4(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsShareInviteContentView@6be9.takeFollowIconAnimation$thirdStep$1");
        try {
            C426040GnC c426040GnC = (C426040GnC) aRunnableS15S0400000_6.l0;
            TuxIconView tuxIconView = (TuxIconView) aRunnableS15S0400000_6.l1;
            c426040GnC.getClass();
            C426040GnC.LIZ(tuxIconView);
            ((TuxIconView) aRunnableS15S0400000_6.l1).animate().scaleX(1.06f).scaleY(1.06f).setDuration(150L).setInterpolator((Interpolator) aRunnableS15S0400000_6.l2).withEndAction((Runnable) aRunnableS15S0400000_6.l3).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsShareInviteContentView@6be9.takeFollowIconAnimation$thirdStep$1");
    }

    public static final void run$5(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("HorizontalQuickFavoritePanelDialog@4981.dismiss$2$1");
        try {
            C21616519il c21616519il = (C21616519il) aRunnableS15S0400000_6.l0;
            final DialogC446550HfB dialogC446550HfB = (DialogC446550HfB) aRunnableS15S0400000_6.l3;
            c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0HfD
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                    if (C1388190mED.LIZ(dialogC446550HfB.LLILZLL) != null) {
                        Activity activityLIZ = C1388190mED.LIZ(dialogC446550HfB.LLILZLL);
                        if (activityLIZ == null || !activityLIZ.isFinishing()) {
                            try {
                                super/*X.19GU*/.dismiss();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            });
            ((C21616519il) aRunnableS15S0400000_6.l0).LJIIIZ();
            ((C21616519il) aRunnableS15S0400000_6.l1).LJIIIZ();
            C786410Ut5.Pd((ObjectAnimator) aRunnableS15S0400000_6.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HorizontalQuickFavoritePanelDialog@4981.dismiss$2$1");
    }

    public static final void run$6(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("HorizontalQuickFavoritePanelDialog@4981.show$1$1");
        try {
            aRunnableS15S0400000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HorizontalQuickFavoritePanelDialog@4981.show$1$1");
    }

    public static final void run$7(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("VerticalQuickFavoritePanelDialog@7522.dismiss$1$1");
        try {
            C21616519il c21616519il = (C21616519il) aRunnableS15S0400000_6.l0;
            final DialogC446620HfI dialogC446620HfI = (DialogC446620HfI) aRunnableS15S0400000_6.l3;
            c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0HfK
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                    if (C1388190mED.LIZ(dialogC446620HfI.LLILZLL) != null) {
                        Activity activityLIZ = C1388190mED.LIZ(dialogC446620HfI.LLILZLL);
                        if (activityLIZ == null || !activityLIZ.isFinishing()) {
                            try {
                                super/*X.19GU*/.dismiss();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            });
            ((C21616519il) aRunnableS15S0400000_6.l0).LJIIIZ();
            ((C21616519il) aRunnableS15S0400000_6.l1).LJIIIZ();
            C786410Ut5.Pd((ObjectAnimator) aRunnableS15S0400000_6.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerticalQuickFavoritePanelDialog@7522.dismiss$1$1");
    }

    public static final void run$8(ARunnableS15S0400000_6 aRunnableS15S0400000_6) {
        boolean zLIZ;
        C1C7U.LIZ("VerticalQuickFavoritePanelDialog@7522.show$1$1");
        try {
            aRunnableS15S0400000_6.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerticalQuickFavoritePanelDialog@7522.show$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS15S0400000_6(android.animation.ObjectAnimator r2, X.C21616519il r3, X.C21616519il r4, X.DialogC446550HfB r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 5 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r4
            r0.l3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0400000_6.<init>(android.animation.ObjectAnimator, X.19il, X.19il, X.0HfB, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS15S0400000_6(android.animation.ObjectAnimator r2, X.C21616519il r3, X.C21616519il r4, X.DialogC446620HfI r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 7 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r4
            r0.l3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0400000_6.<init>(android.animation.ObjectAnimator, X.19il, X.19il, X.0HfI, int):void");
    }

    public ARunnableS15S0400000_6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj4;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj;
    }
}

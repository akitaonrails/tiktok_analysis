package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H86, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H86 {
    public static C0H87 LJ;
    public final ViewStub LIZ;
    public final Function0<TextView> LIZIZ;
    public final Function0<View> LIZJ;
    public LinearLayout LIZLLL;

    public final void LIZ(C0H87 c0h87) {
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), c0h87.LIZJ);
        }
        LinearLayout linearLayout2 = this.LIZLLL;
        if (linearLayout2 != null) {
            Iterator<View> it2 = new C09RD(linearLayout2).iterator();
            int i = 0;
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    Object next = c09re.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        View view = (View) next;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            int i3 = c0h87.LIZ;
                            layoutParams2.width = i3;
                            layoutParams2.height = i3;
                            if (i == 0) {
                                layoutParams2.setMarginEnd(c0h87.LIZIZ / 2);
                            } else {
                                LinearLayout linearLayout3 = this.LIZLLL;
                                if (linearLayout3 != null && i == linearLayout3.getChildCount() - 1) {
                                    layoutParams2.setMarginStart(c0h87.LIZIZ / 2);
                                } else {
                                    layoutParams2.setMarginStart(c0h87.LIZIZ / 2);
                                    layoutParams2.setMarginEnd(c0h87.LIZIZ / 2);
                                }
                            }
                            C786410Ut5.W5(view, layoutParams2);
                            i = i2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C0H83
            if (r0 == 0) goto L96
            r5 = r13
            X.0H83 r5 = (X.C0H83) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r3 = r5.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L7c
            if (r0 != r2) goto La0
            X.C155000ia.LIZIZ(r3)
        L23:
            X.0H87 r3 = (X.C0H87) r3
            if (r3 == 0) goto L9d
            X.C0H86.LJ = r3
        L29:
            android.view.ViewStub r1 = r12.LIZ
            r0 = 2131566154(0x7f0d1e4a, float:1.8757842E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r12.LIZ
            android.view.View r1 = X.C786410Ut5.LJLLLL(r0)
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L3e
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
        L3e:
            r12.LIZLLL = r4
            if (r4 == 0) goto La8
            X.09RD r0 = new X.09RD
            r0.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        L4b:
            r1 = r4
            X.09RE r1 = (X.C09RE) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r5 = r1.next()
            android.view.View r5 = (android.view.View) r5
            r1 = 4
            java.lang.Integer r0 = X.C2286608xc.LJ(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            X.C427690Gpr.LJ(r5, r0)
            java.lang.Integer r0 = X.C2286608xc.LJ(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Float r6 = X.C2286608xc.LIZLLL(r0)
            r7 = 0
            r11 = 30
            r8 = r7
            r9 = r7
            r10 = r7
            X.C21565319aV.LIZIZ(r5, r6, r7, r8, r9, r10, r11)
            goto L4b
        L7c:
            X.C155000ia.LIZIZ(r3)
            android.view.ViewStub r0 = r12.LIZ
            if (r0 == 0) goto Lbe
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto Lbe
            X.0H87 r3 = X.C0H86.LJ
            if (r3 != 0) goto L29
            r5.LLILLL = r2
            java.lang.Object r3 = r12.LIZJ(r5)
            if (r3 != r1) goto L23
            return r1
        L96:
            X.0H83 r5 = new X.0H83
            r5.<init>(r12, r13)
            goto L12
        L9d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La8:
            X.0mG5 r0 = X.C1389340mG4.LIZIZ()
            int r1 = r0.LIZIZ()
            r0 = 440(0x1b8, float:6.17E-43)
            if (r1 > r0) goto Lbb
            android.widget.LinearLayout r0 = r12.LIZLLL
            if (r0 == 0) goto Lbb
            r0.setGravity(r2)
        Lbb:
            r12.LIZ(r3)
        Lbe:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H86.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C0H87> r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H86.LIZJ(X.05Vn):java.lang.Object");
    }

    public C0H86(ViewStub viewStub, AwS550S0100000_6 awS550S0100000_6, AwS550S0100000_6 awS550S0100000_62) {
        this.LIZ = viewStub;
        this.LIZIZ = awS550S0100000_6;
        this.LIZJ = awS550S0100000_62;
    }
}

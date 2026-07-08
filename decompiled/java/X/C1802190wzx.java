package X;

import Y.ARunnableS8S0300100_27;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0wzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802190wzx {
    public final C1802250x03 LIZ = new C1802250x03();
    public final C13E8<InterfaceC1802030wzh> LIZIZ = new C13E8<>();
    public C1836680xta LIZJ;
    public C1819070xRB LIZLLL;
    public C1802210wzz LJ;
    public volatile InterfaceC1802030wzh LJFF;
    public AwS571S0100000_27 LJI;
    public final C054G LJII;
    public AnonymousClass0956 LJIIIIZZ;

    public final void LIZJ() {
        C1802210wzz c1802210wzz = this.LJ;
        if (c1802210wzz == null) {
            return;
        }
        TuxNavBar tuxNavBar = c1802210wzz.LIZ;
        View viewFindViewById = tuxNavBar.findViewById(R.id.p1i);
        if (viewFindViewById != null) {
            viewFindViewById.animate().cancel();
            viewFindViewById.animate().alpha(1.0f).setDuration(300L).start();
        }
        View viewFindViewById2 = tuxNavBar.findViewById(R.id.p28);
        if (viewFindViewById2 != null) {
            viewFindViewById2.animate().cancel();
            viewFindViewById2.animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    public final void LIZLLL() {
        C1802210wzz c1802210wzz = this.LJ;
        if (c1802210wzz == null) {
            return;
        }
        TuxNavBar tuxNavBar = c1802210wzz.LIZ;
        View viewFindViewById = tuxNavBar.findViewById(R.id.p1i);
        if (viewFindViewById != null) {
            viewFindViewById.animate().cancel();
            viewFindViewById.animate().alpha(0.0f).setDuration(300L).start();
        }
        View viewFindViewById2 = tuxNavBar.findViewById(R.id.p28);
        if (viewFindViewById2 != null) {
            viewFindViewById2.animate().cancel();
            viewFindViewById2.animate().alpha(0.0f).setDuration(300L).start();
        }
    }

    public final void LJI() {
        if (this.LJFF == null && (!this.LIZIZ.isEmpty())) {
            InterfaceC1802030wzh interfaceC1802030wzhFirst = this.LIZIZ.first();
            if (interfaceC1802030wzhFirst.LIZIZ() == null) {
                return;
            }
            this.LIZIZ.removeFirst();
            this.LJFF = interfaceC1802030wzhFirst;
            AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJIIIIZZ = null;
            this.LJIIIIZZ = C23250099c.LIZLLL(this.LJII, null, null, new C1802020wzg(this, interfaceC1802030wzhFirst, null), 3);
        }
    }

    public C1802190wzx() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJII = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C473210Ih5
            if (r0 == 0) goto L62
            r8 = r10
            X.0Ih5 r8 = (X.C473210Ih5) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r1 = r8.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r6 = 1
            if (r0 == 0) goto L2d
            if (r0 != r6) goto L68
            X.0wzh r5 = r8.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            r5.onDismiss()
            r9.LJ(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.0wzh r5 = r9.LJFF
            if (r5 != 0) goto L37
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            r9.LIZJ()
            X.0xRB r4 = r9.LIZLLL
            r2 = 300(0x12c, double:1.48E-321)
            if (r4 == 0) goto L50
            android.animation.ValueAnimator r0 = r4.LLIZ
            if (r0 == 0) goto L47
            r0.cancel()
        L47:
            Y.ARunnableS25S0100100_27 r1 = new Y.ARunnableS25S0100100_27
            r0 = 3
            r1.<init>(r2, r4, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r4, r1)
        L50:
            X.0xta r0 = r9.LIZJ
            if (r0 == 0) goto L57
            X.C1836680xta.LIZIZ(r0)
        L57:
            r8.LL = r5
            r8.LLILZ = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r8)
            if (r0 != r7) goto L24
            return r7
        L62:
            X.0Ih5 r8 = new X.0Ih5
            r8.<init>(r9, r10)
            goto L12
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1802190wzx.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final void LJ(InterfaceC1802030wzh interfaceC1802030wzh) {
        C19719612Di.LJJIIJ(this.LIZIZ, new AwS606S0100000_27(interfaceC1802030wzh, 581), true);
        if (this.LJFF == interfaceC1802030wzh) {
            AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJIIIIZZ = null;
            this.LJFF = null;
            LJI();
        }
    }

    public final void LJFF(InterfaceC1802030wzh interfaceC1802030wzh) {
        if (this.LJFF == interfaceC1802030wzh) {
            return;
        }
        C13E8<InterfaceC1802030wzh> c13e8 = this.LIZIZ;
        if ((c13e8 instanceof Collection) && c13e8.isEmpty()) {
            this.LIZIZ.addLast(interfaceC1802030wzh);
        } else {
            Iterator<InterfaceC1802030wzh> it2 = c13e8.iterator();
            while (it2.hasNext()) {
                if (it2.next() == interfaceC1802030wzh) {
                    break;
                }
            }
            this.LIZIZ.addLast(interfaceC1802030wzh);
        }
        LJI();
    }

    public static Object LIZ(C1819070xRB c1819070xRB, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c2252611DEt, 1324);
        AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27(c2252611DEt, 1325);
        ValueAnimator valueAnimator = c1819070xRB.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int visibility = c1819070xRB.getVisibility();
        c1819070xRB.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1819070xRB);
        if (!HandlerHook.viewPost(c1819070xRB, new ARunnableS8S0300100_27(300L, c1819070xRB, awS571S0100000_27, awS571S0100000_272, 4))) {
            c1819070xRB.LLILZIL = null;
            c1819070xRB.LLILZ = EnumC1802220x00.LL;
            C786410Ut5.Z1(c1819070xRB.LLJILJIL, 8);
            int visibility2 = c1819070xRB.getVisibility();
            c1819070xRB.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c1819070xRB);
            c1819070xRB.LIZ();
            awS571S0100000_272.invoke();
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}

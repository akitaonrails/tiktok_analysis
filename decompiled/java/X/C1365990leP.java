package X;

import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0leP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365990leP {
    public static final C1365990leP LIZ = new C1365990leP();
    public static final C1366090leZ LIZIZ = C1366090leZ.LLJI.getValue();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(478));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(481));

    public static Object LIZ(List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1720006oQ.LIZLLL(AFwS209S0000000_21.get$arr$(479), false);
        return ((InterfaceC1366020leS) LIZLLL.getValue()).LIZ(list, AFwS209S0000000_21.get$arr$(480), new C1366000leQ(null), new C1365980leO(null), interfaceC1364105Vn);
    }

    public static final void LIZJ(int i, InterfaceC1366080leY interfaceC1366080leY, String str, String str2) {
        EnumC1364450lbv enumC1364450lbv = EnumC1364450lbv.SOURCE_ACTION_COLD_BOOT;
        if (i == enumC1364450lbv.getValue()) {
            C1366090leZ c1366090leZ = LIZIZ;
            c1366090leZ.getClass();
            C1720006oQ.LIZLLL(new AwS565S0100000_21(c1366090leZ, 1386), false);
            if (!c1366090leZ.LLJ && c1366090leZ.LLILZIL.LL != null) {
                c1366090leZ.LLJ = true;
                c1366090leZ.LJIIJ(enumC1364450lbv.getValue(), null, null, null);
                return;
            }
            return;
        }
        LIZIZ.LJIIJ(i, interfaceC1366080leY, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r12, X.C1368260li4 r13, X.C1364850lcZ r14, int r15, X.C1366160leg r16, X.InterfaceC1364105Vn r17) {
        /*
            r11 = this;
            r3 = r17
            r7 = r13
            boolean r0 = r3 instanceof X.C1366010leR
            if (r0 == 0) goto Lb8
            r10 = r3
            X.0leR r10 = (X.C1366010leR) r10
            int r2 = r10.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r10.LLILZLL = r2
        L15:
            java.lang.Object r3 = r10.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILZLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L8d
            if (r0 != r1) goto Lbf
            int r15 = r10.LLILLL
            X.0li4 r7 = r10.LLILLJJLI
            java.lang.Object r12 = r10.LL
            java.lang.String r12 = (java.lang.String) r12
            X.C155000ia.LIZIZ(r3)
        L2e:
            java.util.List r3 = (java.util.List) r3
            if (r12 != 0) goto L34
            java.lang.String r12 = ""
        L34:
            int r4 = r3.size()
            int r0 = r12.length()
            if (r0 == 0) goto L47
            java.lang.String r0 = "default"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r12, r0)
            if (r0 != 0) goto L47
        L46:
            return r3
        L47:
            com.ss.android.ugc.aweme.share.settings.ImSectionConfig r0 = X.C1371040lmY.LIZJ()
            if (r0 == 0) goto L57
            java.lang.Boolean r1 = r0.useVerticalIms
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L63
        L57:
            int r0 = r7.LIZ
            if (r0 == 0) goto L63
            X.0lbv r0 = X.EnumC1364450lbv.SOURCE_ACTION_OPEN_PANEL
            int r0 = r0.getValue()
            if (r15 != r0) goto L46
        L63:
            X.0leT r0 = X.C1366030leT.LIZ
            r0.getClass()
            java.util.concurrent.atomic.AtomicInteger r0 = X.C1366030leT.LIZIZ
            r0.set(r4)
            X.01GW r0 = X.C1366030leT.LIZJ
            java.lang.Object r2 = r0.getValue()
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "key_im_contact_size_"
            r1.append(r0)
            java.lang.String r0 = X.C461720I8s.LIZIZ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.storeInt(r0, r4)
            return r3
        L8d:
            X.C155000ia.LIZIZ(r3)
            X.00Hy r0 = new X.00Hy
            r0.<init>(r12, r15)
            X.C1720006oQ.LIZLLL(r0, r2)
            X.0leZ r0 = X.C1365990leP.LIZIZ
            r9 = r16
            java.util.List r6 = r0.LJFF(r12, r15, r9)
            X.01GW r0 = X.C1365990leP.LIZJ
            java.lang.Object r5 = r0.getValue()
            X.0leM r5 = (X.InterfaceC1365960leM) r5
            r10.LL = r12
            r10.LLILLJJLI = r7
            r10.LLILLL = r15
            r10.LLILZLL = r1
            r8 = r14
            java.lang.Object r3 = r5.LIZ(r6, r7, r8, r9, r10)
            if (r3 != r4) goto L2e
            return r4
        Lb8:
            X.0leR r10 = new X.0leR
            r10.<init>(r11, r3)
            goto L15
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365990leP.LIZIZ(java.lang.String, X.0li4, X.0lcZ, int, X.0leg, X.05Vn):java.lang.Object");
    }
}

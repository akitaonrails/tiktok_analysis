package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1651506dN {
    public static final EnumC1651806dQ LIZ(String str) {
        EnumC1651806dQ enumC1651806dQ = EnumC1651806dQ.O18;
        if (!Intrinsics.LJFF(str, enumC1651806dQ.getNoticeCode())) {
            EnumC1651806dQ enumC1651806dQ2 = EnumC1651806dQ.U18;
            if (!Intrinsics.LJFF(str, enumC1651806dQ2.getNoticeCode())) {
                return EnumC1651806dQ.U16;
            }
            return enumC1651806dQ2;
        }
        return enumC1651806dQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(java.lang.String r3) {
        /*
            boolean r0 = X.C06N7.LIZ(r3)
            r2 = 0
            if (r0 != 0) goto L23
            com.bytedance.keva.Keva r1 = X.C1651706dP.LIZJ()
            java.lang.String r0 = X.C1651706dP.LIZIZ()
            int r1 = r1.getInt(r0, r2)
            X.01GW r0 = X.C1651706dP.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            if (r1 <= 0) goto L44
        L23:
            return r2
        L24:
            X.01GW r0 = X.C1651706dP.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L44
            if (r1 > 0) goto L23
            com.bytedance.keva.Keva r1 = X.C1651706dP.LIZJ()
            java.lang.String r0 = X.C1651706dP.LIZ()
            int r1 = r1.getInt(r0, r2)
            r0 = 3
            if (r1 < r0) goto L44
            return r2
        L44:
            X.06dQ r1 = LIZ(r3)
            X.06dQ r0 = X.EnumC1651806dQ.U16
            if (r1 == r0) goto L23
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1651506dN.LIZIZ(java.lang.String):boolean");
    }

    public static final void LIZJ(boolean z) {
        String str;
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "chat");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c2344009Gk.LJIIIIZZ("to_status", str);
        C20684815ws.LJIILLIIL("read_receipt_pop_up_close", c2344009Gk.LIZ);
    }
}

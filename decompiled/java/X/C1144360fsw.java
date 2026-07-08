package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0fsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144360fsw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[EDGE_INSN: B:63:0x0076->B:29:0x0076 BREAK  A[LOOP:0: B:25:0x0064->B:64:?]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC1150010g23 LIZ(X.EnumC1144380fsy r10, final android.content.Context r11, final X.C1144350fsv r12, final X.InterfaceC1149850g1n r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144360fsw.LIZ(X.0fsy, android.content.Context, X.0fsv, X.0g1n, java.lang.String):X.0g23");
    }

    public static boolean LIZIZ(EnumC1144380fsy enumC1144380fsy, Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n, String str) {
        C1149730g1b c1149730g1b;
        if (C1151110g3p.LIZ.LJIJ(c1144350fsv.LIZIZ)) {
            return false;
        }
        int i = C1144370fsx.LIZ[enumC1144380fsy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            c1149730g1b = new C1149730g1b(context, c1144350fsv, interfaceC1149850g1n, 1);
        } else {
            c1149730g1b = new C1149730g1b(context, c1144350fsv, interfaceC1149850g1n, 2);
        }
        return c1149730g1b.show();
    }
}

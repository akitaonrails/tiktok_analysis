package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.09eU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2422809eU {
    /* JADX WARN: Removed duplicated region for block: B:118:0x0227 A[EDGE_INSN: B:118:0x0227->B:114:0x0227 BREAK  A[LOOP:0: B:20:0x006f->B:98:0x01cf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] LIZ(X.InterfaceC2423009eW r32) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2422809eU.LIZ(X.09eW):java.lang.String[]");
    }

    public static int LIZIZ(InterfaceC2423009eW interfaceC2423009eW, ByteBuffer byteBuffer, long j) {
        LIZLLL(interfaceC2423009eW, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    public static long LIZJ(InterfaceC2423009eW interfaceC2423009eW, ByteBuffer byteBuffer, long j) {
        LIZLLL(interfaceC2423009eW, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void LIZLLL(InterfaceC2423009eW interfaceC2423009eW, ByteBuffer byteBuffer, int i, long j) {
        int iLJLIL;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iLJLIL = interfaceC2423009eW.LJLIL(byteBuffer, j)) != -1) {
            j += (long) iLJLIL;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C2422909eV("ELF file truncated");
    }
}

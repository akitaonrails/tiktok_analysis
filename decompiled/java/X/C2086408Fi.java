package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.08Fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2086408Fi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(com.google.gson.k r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2086408Fi.LIZ(com.google.gson.k, java.lang.Object):int");
    }

    public static void LIZIZ(n nVar, n nVar2) {
        if (nVar != null && nVar2 != null) {
            for (String str : nVar2.LJJIJIL()) {
                k kVarLJJIIZ = nVar2.LJJIIZ(str);
                if (nVar.LJJIJIIJIL(str)) {
                    k kVarLJJIIZ2 = nVar.LJJIIZ(str);
                    if ((kVarLJJIIZ2 instanceof n) && (kVarLJJIIZ instanceof n)) {
                        LIZIZ((n) kVarLJJIIZ2, (n) kVarLJJIIZ);
                    } else if ((kVarLJJIIZ2 instanceof h) && kVarLJJIIZ != null) {
                        h hVar = (h) kVarLJJIIZ2;
                        if (kVarLJJIIZ instanceof h) {
                            h hVar2 = (h) kVarLJJIIZ;
                            for (int i = 0; i < hVar2.size(); i++) {
                                hVar.LJJIFFI(hVar2.LJJIIJZLJL(i));
                            }
                        } else {
                            hVar.LJJIFFI(kVarLJJIIZ);
                        }
                    } else {
                        nVar.LJJIJL(str);
                        nVar.LJJIFFI(str, kVarLJJIIZ);
                    }
                } else {
                    nVar.LJJIFFI(str, kVarLJJIIZ);
                }
            }
        }
    }
}

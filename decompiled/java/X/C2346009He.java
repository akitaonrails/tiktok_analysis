package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;

/* JADX INFO: renamed from: X.09He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2346009He {
    public static final void LIZ(n nVar, String str) {
        h hVarLJJIIZI = nVar.LJJIIZI(str);
        if (hVarLJJIIZI != null) {
            if (hVarLJJIIZI.size() > 0) {
                k kVarLJJIIJZLJL = hVarLJJIIZI.LJJIIJZLJL(0);
                kVarLJJIIJZLJL.getClass();
                if (!(kVarLJJIIJZLJL instanceof q)) {
                    h hVar = new h();
                    int size = hVarLJJIIZI.size();
                    for (int i = 0; i < size; i++) {
                        hVar.LJJIII(hVarLJJIIZI.LJJIIJZLJL(i).LJIILIIL().LJJIIZ("path").LJIL());
                    }
                    nVar.LJJIJL(str);
                    nVar.LJJIFFI(str, hVar);
                }
            }
        }
    }

    public static final void LIZJ(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof q)) {
            nVar.LJJIJL(str);
            nVar.LJJIFFI(str, kVarLJJIIZ.LJIILIIL().LJJIIZ("path"));
        }
    }

    public static final void LIZIZ(n nVar, String str, String str2) {
        h hVarLJJIIZI = nVar.LJJIIZI(str2);
        if (hVarLJJIIZI != null) {
            if (hVarLJJIIZI.size() > 0) {
                k kVarLJJIIJZLJL = hVarLJJIIZI.LJJIIJZLJL(0);
                kVarLJJIIJZLJL.getClass();
                if (!(kVarLJJIIJZLJL instanceof q)) {
                    h hVar = new h();
                    int size = hVarLJJIIZI.size();
                    for (int i = 0; i < size; i++) {
                        hVar.LJJIII(hVarLJJIIZI.LJJIIJZLJL(i).LJIILIIL().LJJIIZ("path").LJIL());
                    }
                    nVar.LJJIJL(str);
                    nVar.LJJIJL(str2);
                    nVar.LJJIFFI(str, hVar);
                }
            }
        }
    }

    public static final void LIZLLL(n nVar, String str, String str2) {
        k kVarLJJIIZ = nVar.LJJIIZ(str2);
        if (kVarLJJIIZ != null) {
            nVar.LJJIJL(str);
            nVar.LJJIJL(str2);
            nVar.LJJIFFI(str, kVarLJJIIZ.LJIILIIL().LJJIIZ("path"));
        }
    }
}

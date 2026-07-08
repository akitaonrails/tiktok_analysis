package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.10zA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19425010zA {
    public static final /* synthetic */ int LIZ = 0;

    public static C19402010vS LIZ(n nVar) {
        try {
            if (nVar.LJJIJIIJIL("hex")) {
                C19402010vS c19402010vS = new C19402010vS(nVar.LJJIIZ("key").LJIL());
                c19402010vS.LIZIZ = nVar.LJJIIZ("hex").LJIL();
                return c19402010vS;
            }
            if (nVar.LJJIJIIJIL("thumbnail")) {
                C19402010vS c19402010vS2 = new C19402010vS(nVar.LJJIIZ("key").LJIL());
                c19402010vS2.LIZJ = nVar.LJIILIIL().LJJIIZ("thumbnail").LJIL();
                return c19402010vS2;
            }
            if (!nVar.LJIILIIL().LJJIJIIJIL("gradient")) {
                return null;
            }
            C19401810vQ c19401810vQ = new C19401810vQ(nVar.LJIILIIL().LJJIIZ("key").LJIL());
            c19401810vQ.LIZLLL = nVar.LJJIIZ("gradient").LJIILIIL().LJJIIZ("direction").LJIIJJI();
            for (k kVar : nVar.LJJIIZ("gradient").LJIILIIL().LJJIIZ("colors").LJIIL()) {
                C19402010vS c19402010vS3 = new C19402010vS(null);
                c19402010vS3.LIZIZ = kVar.LJIILIIL().LJJIIZ("hex").LJIL();
                c19401810vQ.LJ.add(c19402010vS3);
            }
            return c19401810vQ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return null;
        }
    }
}

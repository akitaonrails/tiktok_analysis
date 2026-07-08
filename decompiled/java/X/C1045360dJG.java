package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0dJG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1045360dJG {
    public final boolean LIZ;
    public C1BUP LIZIZ;
    public C1045770dJv LIZJ;

    public C1045360dJG(C2212201Bi6 c2212201Bi6) {
        EnumC1045420dJM enumC1045420dJM;
        this.LIZ = c2212201Bi6.LJIIL();
        if (c2212201Bi6.LLLIILIL == null) {
            return;
        }
        try {
            C844470XAv.LIZ.getClass();
            String strLJFF = C844470XAv.LJFF();
            C1045780dJw.LIZIZ("Bytedance", "Name is null or empty");
            C1045780dJw.LIZIZ(strLJFF, "Version is null or empty");
            C1045960dKE c1045960dKE = new C1045960dKE(strLJFF);
            String strLIZ = C08EM.LIZ(C844470XAv.LIZ());
            C1045860dK4 c1045860dK4 = c2212201Bi6.LLLIILIL;
            ArrayList arrayList = new ArrayList();
            for (C1045880dK6 c1045880dK6 : c1045860dK4.LIZ) {
                arrayList.add(C1045900dK8.LIZ(c1045880dK6.LIZ, new URL(c1045880dK6.LIZIZ), c1045880dK6.LIZJ));
            }
            C1046930dLn c1046930dLnLIZ = C1046930dLn.LIZ(c1045960dKE, strLIZ, arrayList, null);
            if (c2212201Bi6.LJIIL()) {
                enumC1045420dJM = EnumC1045420dJM.VIDEO;
            } else {
                enumC1045420dJM = EnumC1045420dJM.NATIVE_DISPLAY;
            }
            EnumC1045410dJL enumC1045410dJL = EnumC1045410dJL.BEGIN_TO_RENDER;
            EnumC1046030dKL enumC1046030dKL = EnumC1046030dKL.NATIVE;
            this.LIZIZ = AbstractC1045430dJN.LIZIZ(C1045760dJu.LIZ(enumC1045420dJM, enumC1045410dJL, enumC1046030dKL, enumC1046030dKL), c1046930dLnLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0503, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0503 {
    public static boolean[] LIZ;

    public static boolean[] LIZ() {
        String strLJJ;
        boolean[] zArrLLF;
        boolean[] zArr = LIZ;
        if (zArr != null) {
            return zArr;
        }
        try {
            strLJJ = C0C64.LJIILLIIL().LJJ(31744, "search_lr_feature_mask", "true,true,true,true,true,true", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (strLJJ == null) {
            strLJJ = "true,true,true,true,true,true";
        }
        try {
            List listLJJLIIIJ = a0.LJJLIIIJ(strLJJ, new char[]{','}, false, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boolean.valueOf(Boolean.parseBoolean((String) it2.next())));
            }
            zArrLLF = C13LP.LLF(arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            List listLJJLIIIJ2 = a0.LJJLIIIJ("true,true,true,true,true,true", new char[]{','}, false, 0, 6);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ2, 10));
            Iterator it3 = listLJJLIIIJ2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Boolean.valueOf(Boolean.parseBoolean((String) it3.next())));
            }
            zArrLLF = C13LP.LLF(arrayList2);
        }
        LIZ = zArrLLF;
        return zArrLLF;
    }
}

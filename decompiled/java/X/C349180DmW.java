package X;

import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349180DmW {
    public static boolean LIZJ;
    public static List<String> LIZ = new ArrayList();
    public static List<String> LIZIZ = new ArrayList();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1372190loP());
    public static final C01GW LJ = C452501pT.LIZIZ(new C349170DmV());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C349160DmU());

    public static void LIZIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C351870Dqr(null, null, null), 3);
    }

    public static List LIZ() {
        List<SharePlatform> list = C1374860lsi.LIZJ().LIZ;
        List<SharePlatform> listLIZLLL = (list == null || list.isEmpty()) ? C1380680m26.LIZLLL() : C1374860lsi.LIZJ().LIZ;
        if (listLIZLLL == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (SharePlatform sharePlatform : listLIZLLL) {
            String str = sharePlatform.platformId;
            if (str != null && str.length() != 0) {
                arrayList.add(sharePlatform);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        C1371650lnX.LIZ(arrayList2);
        return arrayList2;
    }
}

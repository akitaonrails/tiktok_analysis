package X;

import Y.AComparatorS49S0000000_30;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.aigc.C2PACacheItem;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS56S0000100_30;

/* JADX INFO: renamed from: X.1407, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1407 {
    public static final AnonymousClass1407 LIZ = new AnonymousClass1407();
    public static CopyOnWriteArrayList<C2PACacheItem> LIZIZ;
    public static final int LIZJ;
    public static final Keva LIZLLL;
    public static final AtomicLong LJ;
    public static boolean LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;

    static {
        Collection collection;
        String string;
        LIZIZ = new CopyOnWriteArrayList<>();
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "c2pa_cache_size_limit", true);
        LIZJ = iLJIJ;
        Keva repo = Keva.getRepo("c2pa_cache");
        LIZLLL = repo;
        LJ = new AtomicLong(0L);
        LJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(290));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(289));
        LJII = c01gwLIZIZ;
        if (iLJIJ <= 0 || LJFF) {
            return;
        }
        try {
            string = repo.getString("c2pa_cache_list", "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (string != null) {
            Type type = new TypeToken<List<? extends C2PACacheItem>>() { // from class: X.1408
            }.getType();
            C571450Mb9.LIZIZ(C571430Mb7.LL, C1421580n64.LIZIZ, "restore cache from disk");
            collection = (List) ((Gson) c01gwLIZIZ.getValue()).LJIIIIZZ(string, type);
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
        } else {
            collection = C13BV.INSTANCE;
        }
        LIZIZ = new CopyOnWriteArrayList<>(collection);
        LJFF = true;
    }

    public static String LIZIZ(MediaModel mediaModel) {
        long jLongValue;
        Object c098200Yq;
        Object objValueOf;
        Long lLJIILIIL;
        Object obj = null;
        if (LIZJ <= 0) {
            return null;
        }
        String str = mediaModel.id;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue > 1) {
            String str2 = mediaModel.id;
            str2.toString();
            return str2;
        }
        try {
            C140D.LIZ.getClass();
            String strLJIJJ = C140D.LJIJJ(mediaModel);
            if (strLJIJJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJIJJ);
                sbLIZ.append(C2286708xd.LJIIL(strLJIJJ));
                if (C2471909mP.LJJIIZI(strLJIJJ)) {
                    objValueOf = "media";
                } else {
                    objValueOf = Long.valueOf(new C0VSJ(strLJIJJ).lastModified());
                }
                sbLIZ.append(objValueOf);
                c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public final synchronized void LIZ(String str) {
        String c2paPath;
        int i = LIZJ;
        if (i > 0 && LIZIZ.size() > i) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start clear cache, cache size: ");
            sbLIZ.append(LIZIZ.size());
            sbLIZ.append(", creationId: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C571450Mb9.LIZIZ(C571430Mb7.LL, C1421580n64.LIZIZ, strLIZIZ);
            CopyOnWriteArrayList<C2PACacheItem> copyOnWriteArrayList = new CopyOnWriteArrayList<>(C13LP.LJLLLL(new AComparatorS49S0000000_30(16), LIZIZ));
            LIZIZ = copyOnWriteArrayList;
            int size = copyOnWriteArrayList.size();
            CopyOnWriteArrayList<C2PACacheItem> copyOnWriteArrayList2 = LIZIZ;
            ArrayList arrayList = new ArrayList(copyOnWriteArrayList2.subList(i, copyOnWriteArrayList2.size()));
            LIZIZ.removeAll(C13LP.LLIIJI(arrayList));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AIGCInfo aIGCInfo = ((C2PACacheItem) it2.next()).aigcInfo;
                if (aIGCInfo != null) {
                    c2paPath = aIGCInfo.getC2paPath();
                } else {
                    c2paPath = null;
                }
                C2286708xd.LJIJ(c2paPath);
            }
            LIZJ(LJ.incrementAndGet(), false);
            C1403990mdh c1403990mdh = C1403990mdh.LIZ;
            int size2 = LIZIZ.size();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            c1403990mdh.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(size, "cache_size_before_clean");
            c2344009Gk.LIZJ(size2, "cache_size_after_clean");
            c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
            c2344009Gk.LJFF("creation_id", str);
            C20684815ws.LJIILLIIL("c2pa_cache_clean", c2344009Gk.LIZ);
        }
    }

    public static void LIZJ(long j, boolean z) {
        if (j < LJ.get()) {
            return;
        }
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass1406(null), 3);
        } else {
            C01TT.LIZIZ(200L, new AwS56S0000100_30(j, 1));
        }
    }
}

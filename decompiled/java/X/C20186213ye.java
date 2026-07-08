package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20186213ye {
    public static final C20186213ye LIZ = new C20186213ye();
    public static final ConcurrentMap<String, InterfaceC20186313yf> LIZIZ = new ConcurrentHashMap();
    public static final ConcurrentMap<String, String> LIZJ = new ConcurrentHashMap();
    public static final C2252331DDr LIZLLL;
    public static final C2252331DDr LJ;

    static {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 1, null, 4);
        LIZLLL = c2252331DDrLIZIZ;
        LJ = c2252331DDrLIZIZ;
    }

    public static long LIZIZ() {
        Long lValueOf = Long.valueOf(((Number) C264190AWz.LIZ.getValue()).longValue());
        if (lValueOf.longValue() > 0) {
            return lValueOf.longValue();
        }
        return 180000L;
    }

    public static String LIZJ(String str) {
        boolean z;
        C1877607Xa c1877607Xa;
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String str2 = (String) ((ConcurrentHashMap) LIZJ).get(str);
        if (str2 == null) {
            str2 = str;
        }
        Object obj = ((ConcurrentHashMap) LIZIZ).get(str2);
        if (obj instanceof C1877607Xa) {
            c1877607Xa = (C1877607Xa) obj;
        } else {
            c1877607Xa = null;
        }
        if (c1877607Xa == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(c1877607Xa.LIZ);
        try {
            c098200Yq = Long.valueOf(c0vsj.length());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1L;
        }
        long jLongValue = ((Number) c098200Yq).longValue();
        if (c0vsj.exists() && jLongValue >= c1877607Xa.LIZIZ) {
            return c1877607Xa.LIZ;
        }
        C201955140j.LJIJJ(C201950140e.LIZIZ, "ShareToStoryVideoStream", "getCompletedLocalPath: dropping stale entry url=" + C13LN.LJZL(80, str) + " path=" + c1877607Xa.LIZ + " len=" + jLongValue + " expected=" + c1877607Xa.LIZIZ);
        if (((ConcurrentHashMap) LIZIZ).remove(str2, c1877607Xa)) {
            LJI(str2);
        }
        return null;
    }

    public static void LJI(String str) {
        Set setEntrySet = ((ConcurrentHashMap) LIZJ).entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (Intrinsics.LJFF(((Map.Entry) obj).getValue(), str)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            ((ConcurrentHashMap) LIZJ).remove(entry.getKey(), entry.getValue());
        }
    }

    public static String LIZ(ForwardVideo forwardVideo, float f) {
        String awemeId = forwardVideo.getAwemeId();
        if (awemeId.length() <= 0 && 0 == 0) {
            awemeId = forwardVideo.getSourceVID();
            if (awemeId.length() <= 0 && (awemeId = (String) C13LP.LJJJLL(forwardVideo.getPlayAddressList())) == null) {
                awemeId = "";
            }
        }
        return C08HM.LIZJ(awemeId + '_' + ((long) f));
    }

    public static SimBitRate LIZLLL(ForwardVideo forwardVideo, float f) {
        List<SimBitRate> bitRate;
        SimVideoUrlModel simVideoUrlModel = forwardVideo.getSimVideoUrlModel();
        SimBitRate simBitRate = null;
        if (simVideoUrlModel == null || (bitRate = simVideoUrlModel.getBitRate()) == null) {
            return null;
        }
        Iterator<SimBitRate> it2 = bitRate.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SimBitRate next = it2.next();
            if (next.getBitRate() == f) {
                simBitRate = next;
                break;
            }
        }
        return simBitRate;
    }

    public static List LJ(ForwardVideo forwardVideo, float f) {
        List<String> listUrlList;
        SimBitRate simBitRateLIZLLL = LIZLLL(forwardVideo, f);
        if (simBitRateLIZLLL != null && (listUrlList = simBitRateLIZLLL.urlList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : listUrlList) {
                String str2 = str;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    arrayList.add(str);
                }
            }
            List listLJJJJI = C13LP.LJJJJI(arrayList);
            if (listLJJJJI != null) {
                return listLJJJJI;
            }
        }
        return C13BV.INSTANCE;
    }

    public static EnumC1779450wPH LJFF(Set set, HashMap map) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            String strLIZJ = LIZJ(str);
            if (strLIZJ != null) {
                map.put(str, strLIZJ);
                it2.remove();
            } else {
                ConcurrentMap<String, InterfaceC20186313yf> concurrentMap = LIZIZ;
                Object obj = ((ConcurrentHashMap) LIZJ).get(str);
                if (obj == null) {
                    obj = str;
                }
                Object obj2 = ((ConcurrentHashMap) concurrentMap).get(obj);
                if (!(obj2 instanceof C20186513yh)) {
                    if (obj2 instanceof C07XZ) {
                        C201950140e c201950140e = C201950140e.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("awaitDownloads: terminally failed url=");
                        sbLIZ.append(C13LN.LJZL(80, str));
                        C201955140j.LJIJJ(c201950140e, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ));
                        C110200bM.LIZ("await", "fail_fast_failed", null);
                        return EnumC1779450wPH.LLILLL;
                    }
                    C201950140e c201950140e2 = C201950140e.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("awaitDownloads: no usable download (not started / cancelled / stale) url=");
                    sbLIZ2.append(C13LN.LJZL(80, str));
                    C201955140j.LJIJJ(c201950140e2, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ2));
                    C110200bM.LIZ("await", "fail_fast_not_started", null);
                    return EnumC1779450wPH.LLILLL;
                }
            }
        }
        if (set.isEmpty()) {
            return EnumC1779450wPH.LL;
        }
        return EnumC1779450wPH.LLILLJJLI;
    }
}

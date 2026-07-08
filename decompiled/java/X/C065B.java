package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.v2.QuickShareRecord;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.065B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C065B {
    public static C1438105k3 LIZIZ;
    public static AnonymousClass0956 LIZLLL;
    public static final Object LIZ = new Object();
    public static final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ.limitedParallelism(1)).plus(new C1138320fjC("QuickShareStorageV2")));
    public static final LruCache<Pair<String, Long>, C065C> LJ = new LruCache<>(C065E.LIZ() + 10);
    public static final Pair<String, String> LJFF = new Pair<>("", "");

    public static Pair LIZLLL() {
        synchronized (LIZ) {
            try {
                if (!LIZIZ()) {
                    return LJFF;
                }
                C1438105k3 c1438105k3 = LIZIZ;
                if (c1438105k3 == null) {
                    return LJFF;
                }
                List listLLIIII = C13LP.LLIIII(c1438105k3.LIZIZ);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listLLIIII.iterator();
                while (it2.hasNext()) {
                    Iterable iterable = ((QuickShareRecord) it2.next()).candidates;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(iterable, arrayList);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    QuickShareRecord.Candidate candidate = (QuickShareRecord.Candidate) obj;
                    if (hashSet.add(new Pair(candidate.candidateId, candidate.type))) {
                        arrayList2.add(obj);
                    }
                }
                Set<C0180003u> setLIZ = C065Z.LIZ(arrayList2);
                int iLIZ = C065E.LIZ();
                List listLLD = C13LP.LLD(iLIZ, listLLIIII);
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = listLLD.iterator();
                while (it3.hasNext()) {
                    Double d = ((QuickShareRecord) it3.next()).shareRate;
                    if (d != null) {
                        arrayList3.add(d);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = listLLIIII.iterator();
                while (it4.hasNext()) {
                    Double dLIZJ = LIZJ((QuickShareRecord) it4.next(), setLIZ);
                    if (dLIZJ != null) {
                        arrayList4.add(dLIZJ);
                    }
                }
                return new Pair(LIZ(arrayList3), LIZ(C13LP.LLD(iLIZ, arrayList4)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZIZ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (strLIZIZ.length() == 0) {
            LIZIZ = null;
            LJ.evictAll();
            return false;
        }
        C1438105k3 c1438105k3 = LIZIZ;
        if (!Intrinsics.LJFF(c1438105k3 != null ? c1438105k3.LIZ : null, strLIZIZ)) {
            C1438105k3 c1438105k32 = new C1438105k3();
            c1438105k32.LIZ = strLIZIZ;
            if (strLIZIZ.length() != 0) {
                Keva value = C1438105k3.LIZJ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("quick_share_record_");
                sbLIZ.append(strLIZIZ);
                String string = value.getString(C2188811AlT.LIZIZ(sbLIZ), null);
                if (string != null) {
                    try {
                        List listLLD = (List) C051M.LIZJ(string, new TypeToken<List<? extends QuickShareRecord>>() { // from class: X.05k5
                        }.getType());
                        if (listLLD != null && !listLLD.isEmpty()) {
                            int iLIZ = C065E.LIZ() + 10;
                            if (listLLD.size() > iLIZ) {
                                listLLD = C13LP.LLD(iLIZ, listLLD);
                            }
                            ((ArrayList) c1438105k32.LIZIZ).addAll(listLLD);
                        }
                        ((ArrayList) c1438105k32.LIZIZ).size();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1720006oQ.LIZJ("QuickShareStoreModel", "load failed", e);
                    }
                }
            }
            LIZIZ = c1438105k32;
            LJ.evictAll();
        }
        return true;
    }

    public static String LIZ(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(((Number) it2.next()).doubleValue());
            }
            return jSONArray.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1720006oQ.LIZJ("QuickShareStoreV2", "encodeRatesToJson failed", e);
            return "";
        }
    }

    public static Double LIZJ(QuickShareRecord quickShareRecord, Set set) {
        Long l;
        String str = quickShareRecord.itemID;
        if (str == null || (l = quickShareRecord.storageTimestamp) == null) {
            return null;
        }
        Pair<String, Long> pair = new Pair<>(str, Long.valueOf(l.longValue()));
        C065C c065c = LJ.get(pair);
        if (c065c != null) {
            return c065c.LIZ;
        }
        List list = quickShareRecord.candidates;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            QuickShareRecord.Candidate candidate = (QuickShareRecord.Candidate) obj;
            String str2 = candidate.candidateId;
            Long l2 = candidate.type;
            if (str2 != null && str2.length() != 0 && l2 != null && set.contains(new C0180003u(str2, l2.longValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Double d = ((QuickShareRecord.Candidate) it2.next()).rateScore;
            if (d != null) {
                arrayList2.add(d);
            }
        }
        Double dLJJLIIIJLLLLLLLZ = C13LP.LJJLIIIJLLLLLLLZ(arrayList2);
        LJ.put(pair, new C065C(dLJJLIIIJLLLLLLLZ));
        return dLJJLIIIJLLLLLLLZ;
    }
}

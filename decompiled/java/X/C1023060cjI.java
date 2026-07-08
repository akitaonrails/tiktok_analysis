package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023060cjI {
    public static final ConcurrentHashMap<AbstractC1023090cjL, AbstractC1023200cjW> LIZ = new ConcurrentHashMap<>();
    public static final C1023150cjR LIZIZ = new C1023150cjR();
    public static final C1008210cLL LIZJ = new C1008210cLL();

    public static Map LIZ(C1022420ciG c1022420ciG) {
        boolean z;
        boolean z2;
        boolean z3;
        C1023150cjR c1023150cjR = LIZIZ;
        c1023150cjR.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (c1023150cjR.LIZ) {
            try {
                for (Map.Entry<C1023140cjQ, C1023240cja> entry : c1023150cjR.LIZ.entrySet()) {
                    C1023140cjQ key = entry.getKey();
                    C1023240cja value = entry.getValue();
                    boolean z4 = false;
                    if (!C1022420ciG.LJII.contains(c1022420ciG.LIZJ)) {
                        String str = c1022420ciG.LIZIZ;
                        String str2 = key.LIZ;
                        if (Intrinsics.LJFF(str, str2) || Intrinsics.LJFF(str2, "all") || (a0.LJJJIL(str) && Intrinsics.LJFF(str2, "null"))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            String str3 = c1022420ciG.LIZLLL;
                            String str4 = key.LIZJ;
                            if (Intrinsics.LJFF(str3, str4) || Intrinsics.LJFF(str4, "all") || (a0.LJJJIL(str3) && Intrinsics.LJFF(str4, "null"))) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                String str5 = c1022420ciG.LIZJ;
                                String str6 = key.LIZIZ;
                                if (Intrinsics.LJFF(str5, str6) || Intrinsics.LJFF(str6, "all") || (a0.LJJJIL(str5) && Intrinsics.LJFF(str6, "null"))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    z4 = true;
                                }
                            }
                        }
                    }
                    if (z4) {
                        linkedHashMap.putAll(value.LIZIZ(c1022420ciG));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkedHashMap;
    }

    public static void LIZIZ(C1022420ciG c1022420ciG) {
        String strOptString;
        Iterator<T> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            for (C1023070cjJ c1023070cjJ : ((AbstractC1023200cjW) it2.next()).LIZIZ.values()) {
                if (!c1023070cjJ.LIZJ.isEmpty() && SystemClock.elapsedRealtime() - c1023070cjJ.LJ >= 360000) {
                    c1023070cjJ.LIZJ.clear();
                }
            }
        }
        for (C1023070cjJ c1023070cjJ2 : LIZLLL(C1023040cjG.LIZIZ, c1022420ciG)) {
            c1023070cjJ2.getClass();
            JSONObject jSONObject = c1022420ciG.LJFF;
            if (jSONObject != null) {
                strOptString = jSONObject.optString("ad_extra_data");
            } else {
                strOptString = null;
            }
            JSONObject jSONObjectLIZ = C12865051r.LIZ(strOptString);
            for (Map.Entry entry : C2097608Jq.LJIJ(C09RB.LJIJI(C09R4.LIZIZ(jSONObjectLIZ.keys()), new C5183020f(jSONObjectLIZ, 311))).entrySet()) {
                Object key = entry.getKey();
                c1023070cjJ2.LIZJ.put((String) key, entry.getValue());
            }
            c1023070cjJ2.LJ = SystemClock.elapsedRealtime();
        }
    }

    public static List LIZJ(AbstractC1023090cjL abstractC1023090cjL) {
        if (abstractC1023090cjL instanceof C1023040cjG) {
            return C13LP.LLIIII(LIZ.values());
        }
        return C09RB.LJJII(C09RB.LJIJI(abstractC1023090cjL.LIZJ(), AFwS252S0000000_16.get$arr$(584)));
    }

    public static AbstractC1023200cjW LJ(AbstractC1023090cjL abstractC1023090cjL) {
        ConcurrentHashMap<AbstractC1023090cjL, AbstractC1023200cjW> concurrentHashMap = LIZ;
        AbstractC1023200cjW c1010960cPm = concurrentHashMap.get(abstractC1023090cjL);
        if (c1010960cPm == null) {
            if (Intrinsics.LJFF(abstractC1023090cjL, C623440Oco.LIZIZ)) {
                c1010960cPm = new C582760MtO();
            } else if (Intrinsics.LJFF(abstractC1023090cjL, C1023110cjN.LIZIZ)) {
                c1010960cPm = new AbstractC1023200cjW() { // from class: X.0cjS
                    public final C1023110cjN LJI = C1023110cjN.LIZIZ;

                    @Override // X.AbstractC1023200cjW
                    public final /* bridge */ /* synthetic */ AbstractC1023090cjL LIZ() {
                        return this.LJI;
                    }
                };
            } else if (Intrinsics.LJFF(abstractC1023090cjL, C1023120cjO.LIZIZ)) {
                c1010960cPm = new C1010960cPm();
            } else if (Intrinsics.LJFF(abstractC1023090cjL, C1022410ciF.LIZIZ)) {
                c1010960cPm = new AbstractC1023200cjW() { // from class: X.0ciJ
                    public final C1022410ciF LJI = C1022410ciF.LIZIZ;

                    @Override // X.AbstractC1023200cjW
                    public final /* bridge */ /* synthetic */ AbstractC1023090cjL LIZ() {
                        return this.LJI;
                    }
                };
            } else if (Intrinsics.LJFF(abstractC1023090cjL, C1023040cjG.LIZIZ)) {
                c1010960cPm = new AbstractC1023200cjW() { // from class: X.0cjH
                    public final C1023040cjG LJI = C1023040cjG.LIZIZ;

                    @Override // X.AbstractC1023200cjW
                    public final /* bridge */ /* synthetic */ AbstractC1023090cjL LIZ() {
                        return this.LJI;
                    }
                };
            } else {
                throw new C1954807lC();
            }
            AbstractC1023200cjW abstractC1023200cjWPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC1023090cjL, c1010960cPm);
            if (abstractC1023200cjWPutIfAbsent != null) {
                c1010960cPm = abstractC1023200cjWPutIfAbsent;
            }
        }
        return c1010960cPm;
    }

    public static void LJI(List list) {
        C623440Oco c623440Oco = C623440Oco.LIZIZ;
        if (C293340Bee.LIZIZ && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LJFF(c623440Oco, (Aweme) it2.next());
            }
        }
    }

    public static List LIZLLL(AbstractC1023090cjL abstractC1023090cjL, C1022420ciG c1022420ciG) {
        C1023070cjJ c1023070cjJ;
        if (abstractC1023090cjL instanceof C1023040cjG) {
            ConcurrentHashMap<AbstractC1023090cjL, AbstractC1023200cjW> concurrentHashMap = LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<AbstractC1023090cjL, AbstractC1023200cjW>> it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                AbstractC1023200cjW value = it2.next().getValue();
                String strLIZ = value.LIZ().LIZ(c1022420ciG);
                if (strLIZ != null && (c1023070cjJ = value.LIZIZ.get(strLIZ)) != null) {
                    arrayList.add(c1023070cjJ);
                }
            }
            return arrayList;
        }
        return C09RB.LJJII(C09RB.LJIJI(abstractC1023090cjL.LIZJ(), new AwS595S0100000_16(c1022420ciG, 348)));
    }

    public static void LJFF(AbstractC1023090cjL abstractC1023090cjL, Aweme aweme) {
        String creativeIdStr;
        if (!C293340Bee.LIZIZ || aweme == null) {
            return;
        }
        if (AwemeExtKt.isPseudoAd(aweme) || AwemeExtKt.isAdTraffic(aweme)) {
            AbstractC1023200cjW abstractC1023200cjWLJ = LJ(abstractC1023090cjL);
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ != null && (creativeIdStr = awemeRawAdLJJIJLIJ.getCreativeIdStr()) != null) {
                abstractC1023200cjWLJ.LIZJ.put(creativeIdStr, aweme);
                abstractC1023200cjWLJ.LIZLLL.put(creativeIdStr, awemeRawAdLJJIJLIJ);
                abstractC1023200cjWLJ.LIZIZ.put(creativeIdStr, new C1023070cjJ(creativeIdStr, abstractC1023200cjWLJ));
            }
        }
    }
}

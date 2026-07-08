package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z81, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z81 implements C0Z7L, InterfaceC586170Myt {
    public static final C0Z81 LL = new C0Z81();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C894690Z7z());
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C0Z80());
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C0Z82());

    public static double LJIIJJI(EnumC894670Z7x enumC894670Z7x) {
        int i = C894680Z7y.LIZ[enumC894670Z7x.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ((Number) C0B4G.LIZ.getValue()).doubleValue();
                }
                throw new C1954807lC();
            }
            return ((Number) C0B4I.LIZ.getValue()).doubleValue();
        }
        return ((Number) C0B4H.LIZ.getValue()).doubleValue();
    }

    public static boolean LJIIL(EnumC894670Z7x enumC894670Z7x) {
        int i = C894680Z7y.LIZ[enumC894670Z7x.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return C289830BXp.LIZ();
            }
            throw new C1954807lC();
        }
        return C169Q.LLILLJJLI.LIZLLL();
    }

    public static String LJIILIIL(EnumC894670Z7x enumC894670Z7x) {
        int i = C894680Z7y.LIZ[enumC894670Z7x.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "dm_aweme_video_preload";
                }
                throw new C1954807lC();
            }
            return "dm_enter_inbox_predict_correctness";
        }
        return "dm_enter_chat_predict_correctness";
    }

    @Override // X.C0Z7L
    public final void LJIIIZ(String str) {
        if (!C289830BXp.LIZ()) {
            return;
        }
        EnumC894670Z7x enumC894670Z7x = EnumC894670Z7x.PREDICT_AWEME_VIDEO_PRELOAD;
        LIZIZ(enumC894670Z7x, str);
        C01GW c01gw = LLILZ;
        if (((C823170WQx) c01gw.getValue()).contains(str)) {
            return;
        }
        ((C823170WQx) c01gw.getValue()).add(str);
        LJFF(enumC894670Z7x, str);
    }

    @Override // X.C0Z7L
    public final void LIZIZ(EnumC894670Z7x enumC894670Z7x, String str) {
        ConcurrentHashMap concurrentHashMap;
        Long l;
        if (!LJIIL(enumC894670Z7x) || (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) LLILLJJLI.getValue()).get(enumC894670Z7x)) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((ConcurrentHashMap) entry.getValue()).keySet().contains(str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList<String> arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getKey());
        }
        for (String str2 : arrayList) {
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(str2);
            if (concurrentHashMap2 != null && (l = (Long) concurrentHashMap2.get(str)) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                InterfaceC893250Z2l interfaceC893250Z2lLIZIZ = ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZIZ();
                LL.getClass();
                interfaceC893250Z2lLIZIZ.LIZ(LJIILIIL(enumC894670Z7x), null, str2, Long.valueOf(jCurrentTimeMillis), true, Double.valueOf(LJIIJJI(enumC894670Z7x)));
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap.get(str2);
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.remove(str);
                }
            }
        }
    }

    @Override // X.C0Z7L
    public final void LJFF(EnumC894670Z7x enumC894670Z7x, String str) {
        InterfaceC893250Z2l interfaceC893250Z2lLIZIZ;
        InterfaceC893250Z2l interfaceC893250Z2lLIZIZ2;
        if (!LJIIL(enumC894670Z7x)) {
            return;
        }
        IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpi$default(IDMResourceLoadService.class, false, false, false, 14, null);
        if (iDMResourceLoadService != null && (interfaceC893250Z2lLIZIZ2 = iDMResourceLoadService.LIZIZ()) != null) {
            interfaceC893250Z2lLIZIZ2.LIZJ(LJIILIIL(enumC894670Z7x), "denominator", true, Double.valueOf(LJIIJJI(enumC894670Z7x)));
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) LLILLL.getValue()).get(enumC894670Z7x);
        if (concurrentHashMap == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((ConcurrentHashMap) entry.getValue()).keySet().contains(str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList<String> arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getKey());
        }
        for (String str2 : arrayList) {
            IDMResourceLoadService iDMResourceLoadService2 = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpi$default(IDMResourceLoadService.class, false, false, false, 14, null);
            if (iDMResourceLoadService2 != null && (interfaceC893250Z2lLIZIZ = iDMResourceLoadService2.LIZIZ()) != null) {
                LL.getClass();
                interfaceC893250Z2lLIZIZ.LIZJ(LJIILIIL(enumC894670Z7x), str2, false, Double.valueOf(LJIIJJI(enumC894670Z7x)));
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(str2);
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.remove(str);
            }
        }
    }

    @Override // X.C0Z7L
    public final void LJI(String str, boolean z) {
        IDMResourceLoadService iDMResourceLoadService;
        if (C289830BXp.LIZ() && (iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpi$default(IDMResourceLoadService.class, false, false, false, 14, null)) != null && iDMResourceLoadService.LIZ(((Number) C0B4G.LIZ.getValue()).doubleValue())) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("dm_aweme_video_preload_success_rate", C2097608Jq.LJIIIIZZ(new Pair("is_preload", String.valueOf(z)), new Pair("result", str)));
        }
    }

    @Override // X.C0Z7L
    public final void LIZ(EnumC894670Z7x enumC894670Z7x, String str, String str2) {
        InterfaceC893250Z2l interfaceC893250Z2lLIZIZ;
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        Object objPutIfAbsent3;
        Object objPutIfAbsent4;
        if (!LJIIL(enumC894670Z7x)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LLILLJJLI.getValue();
        Object concurrentHashMap2 = concurrentHashMap.get(enumC894670Z7x);
        if (concurrentHashMap2 == null && (objPutIfAbsent4 = concurrentHashMap.putIfAbsent(enumC894670Z7x, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
            concurrentHashMap2 = objPutIfAbsent4;
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) concurrentHashMap2;
        Object concurrentHashMap3 = concurrentMap.get(str);
        if (concurrentHashMap3 == null && (objPutIfAbsent3 = concurrentMap.putIfAbsent(str, (concurrentHashMap3 = new ConcurrentHashMap()))) != null) {
            concurrentHashMap3 = objPutIfAbsent3;
        }
        ((ConcurrentHashMap) concurrentHashMap3).put(str2, Long.valueOf(System.currentTimeMillis()));
        ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) LLILLL.getValue();
        Object concurrentHashMap5 = concurrentHashMap4.get(enumC894670Z7x);
        if (concurrentHashMap5 == null && (objPutIfAbsent2 = concurrentHashMap4.putIfAbsent(enumC894670Z7x, (concurrentHashMap5 = new ConcurrentHashMap()))) != null) {
            concurrentHashMap5 = objPutIfAbsent2;
        }
        ConcurrentMap concurrentMap2 = (ConcurrentMap) concurrentHashMap5;
        Object concurrentHashMap6 = concurrentMap2.get(str);
        if (concurrentHashMap6 == null && (objPutIfAbsent = concurrentMap2.putIfAbsent(str, (concurrentHashMap6 = new ConcurrentHashMap()))) != null) {
            concurrentHashMap6 = objPutIfAbsent;
        }
        ((ConcurrentHashMap) concurrentHashMap6).put(str2, Long.valueOf(System.currentTimeMillis()));
        IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpi$default(IDMResourceLoadService.class, false, false, false, 14, null);
        if (iDMResourceLoadService != null && (interfaceC893250Z2lLIZIZ = iDMResourceLoadService.LIZIZ()) != null) {
            interfaceC893250Z2lLIZIZ.LIZ(LJIILIIL(enumC894670Z7x), null, str, null, false, Double.valueOf(LJIIJJI(enumC894670Z7x)));
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        ((ConcurrentHashMap) LLILLJJLI.getValue()).clear();
        ((ConcurrentHashMap) LLILLL.getValue()).clear();
        ((C823170WQx) LLILZ.getValue()).clear();
    }
}

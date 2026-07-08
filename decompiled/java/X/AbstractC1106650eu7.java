package X;

import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.config.FeatureCenter;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0eu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1106650eu7 {
    public static final /* synthetic */ int LJII = 0;
    public final C0J0Q LIZ;
    public final C018C LIZIZ;
    public ILiveFeatureCenterService LIZJ;
    public final List<String> LIZLLL = new ArrayList();
    public final List<String> LJ = new ArrayList();
    public final List<String> LJFF = new ArrayList();
    public final List<String> LJI = new ArrayList();

    public AbstractC1106650eu7(C0J0Q c0j0q) {
        this.LIZ = c0j0q;
        this.LIZIZ = new C018C(c0j0q);
    }

    public final Map<String, C1090000eTG> LIZLLL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C018C c018c = this.LIZIZ;
        c018c.LIZ();
        for (Map.Entry<String, Object> entry : c018c.LIZIZ.entrySet()) {
            if (a0.LJJIIZI(entry.getKey(), str, false)) {
                linkedHashMap.put(C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(entry.getKey(), new String[]{"-"}, 0, 6)), new C1090000eTG(this.LIZ, EnumC1094630eaj.DEFAULT, entry.getValue()));
            }
        }
        return linkedHashMap;
    }

    public final void LIZ(FeatureCenter featureCenter, ILiveFeatureCenterService iLiveFeatureCenterService) {
        this.LIZJ = iLiveFeatureCenterService;
        ((ArrayList) this.LIZLLL).addAll(featureCenter.pitayaPythonBusiness);
        for (String str : featureCenter.pitayaNativeBusiness) {
            if (str != null) {
                ((ArrayList) this.LJ).add(str);
            }
        }
        List<String> list = featureCenter.portraitConfig;
        if (list != null) {
            ((ArrayList) this.LJI).addAll(list);
        }
        for (String str2 : (ArrayList) this.LJI) {
            Map<String, String> mapYM1 = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).yM1(str2);
            if (mapYM1 != null) {
                for (Map.Entry<String, String> entry : mapYM1.entrySet()) {
                    C018C c018c = this.LIZIZ;
                    String strLIZ = C1887507aL.LIZ(str2, entry.getKey());
                    String value = entry.getValue();
                    c018c.LIZIZ.get(strLIZ);
                    c018c.LIZIZ.put(strLIZ, value);
                }
            }
        }
        List<String> list2 = featureCenter.pspBusiness;
        if (list2 != null) {
            for (String str3 : list2) {
                if (str3 != null) {
                    ((ArrayList) this.LJFF).add(str3);
                }
            }
        }
    }

    public final void LIZIZ(String str, String str2) {
        ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> concurrentHashMapYT0;
        CopyOnWriteArraySet<InterfaceC1093100eYG> copyOnWriteArraySet;
        String strLIZ = C1887507aL.LIZ(str, str2);
        C018C c018c = this.LIZIZ;
        Object objRemove = c018c.LIZIZ.remove(strLIZ);
        ConcurrentHashMap<String, Object> concurrentHashMap = C018C.LJFF;
        if (concurrentHashMap.containsKey(strLIZ)) {
            objRemove = concurrentHashMap.get(strLIZ);
            ((Keva) c018c.LIZJ.getValue()).erase(strLIZ);
        }
        ILiveFeatureCenterService iLiveFeatureCenterService = this.LIZJ;
        if (iLiveFeatureCenterService != null && (concurrentHashMapYT0 = iLiveFeatureCenterService.yT0()) != null && (copyOnWriteArraySet = concurrentHashMapYT0.get(strLIZ)) != null) {
            Iterator<InterfaceC1093100eYG> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(objRemove, null, str2, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1090000eTG LIZJ(X.EnumC1094630eaj r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1106650eu7.LIZJ(X.0eaj, java.lang.String, java.lang.String):X.0eTG");
    }

    public final void LJ(Object obj, String str, String str2, boolean z) {
        ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> concurrentHashMapYT0;
        CopyOnWriteArraySet<InterfaceC1093100eYG> copyOnWriteArraySet;
        String strLIZ = C1887507aL.LIZ(str, str2);
        if (obj != null) {
            C018C c018c = this.LIZIZ;
            Object obj2 = c018c.LIZIZ.get(strLIZ);
            c018c.LIZIZ.put(strLIZ, obj);
            if (z) {
                ((Keva) c018c.LIZJ.getValue()).storeString(strLIZ, String.valueOf(obj));
            }
            ILiveFeatureCenterService iLiveFeatureCenterService = this.LIZJ;
            if (iLiveFeatureCenterService != null && (concurrentHashMapYT0 = iLiveFeatureCenterService.yT0()) != null && (copyOnWriteArraySet = concurrentHashMapYT0.get(strLIZ)) != null) {
                Iterator<InterfaceC1093100eYG> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(obj2, obj, str2, str);
                }
            }
        }
    }
}

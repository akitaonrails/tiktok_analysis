package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS69S1000000_18;

/* JADX INFO: renamed from: X.0hLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200750hLt {
    public final PoiClaimViewModel LIZ;
    public AbstractC1200800hLy LIZIZ;
    public AbstractC1200800hLy LIZJ;

    public C1200750hLt(PoiClaimViewModel poiClaimViewModel) {
        this.LIZ = poiClaimViewModel;
    }

    public final void LIZ(HashMap<String, Object> map) {
        AbstractC1200800hLy abstractC1200800hLy;
        String strLIZ;
        Map linkedHashMap;
        if (map != null && (abstractC1200800hLy = this.LIZJ) != null && (strLIZ = abstractC1200800hLy.LIZ()) != null) {
            C1200710hLp.LIZ.getClass();
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            Type type = new TypeToken<Map<String, Object>>() { // from class: X.04YC
            }.getType();
            String string = C1200710hLp.LIZIZ.getString(C1200710hLp.LIZ(), "");
            if (string != null && string.length() != 0) {
                try {
                    linkedHashMap = (Map) gsonLIZLLL.LJIIIIZZ(string, type);
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    linkedHashMap = new LinkedHashMap();
                }
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.toString();
            linkedHashMap.put(strLIZ, map.get(strLIZ));
            linkedHashMap.toString();
            C1200710hLp.LIZIZ.storeString(C1200710hLp.LIZ(), GsonProtectorUtils.toJson(gsonLIZLLL, linkedHashMap));
        }
    }

    public final void LIZIZ(C1200750hLt c1200750hLt, InterfaceC665370Q7z interfaceC665370Q7z) {
        String strLIZ;
        AbstractC1200800hLy abstractC1200800hLy = this.LIZJ;
        if (abstractC1200800hLy != null && (strLIZ = abstractC1200800hLy.LIZ()) != null) {
            C1200710hLp c1200710hLp = C1200710hLp.LIZ;
            Keva keva = C1200710hLp.LIZIZ;
            c1200710hLp.getClass();
            String string = keva.getString(C1200710hLp.LIZ(), "");
            if (string != null && string.length() != 0) {
                C1227904rF.LIZ.getClass();
                Gson gsonLIZLLL = C1227904rF.LIZLLL();
                Map linkedHashMap = (Map) GsonProtectorUtils.fromJson(gsonLIZLLL, string, new TypeToken<Map<String, Object>>() { // from class: X.04YB
                }.getType());
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Before deletePartOfPoiClaimCacheByPageKey pageKey=");
                sbLIZ.append(strLIZ);
                sbLIZ.append(" map=");
                sbLIZ.append(linkedHashMap);
                C2188811AlT.LIZIZ(sbLIZ);
                linkedHashMap.remove(strLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("After deletePartOfPoiClaimCacheByPageKey pageKey=");
                sbLIZ2.append(strLIZ);
                sbLIZ2.append(" map=");
                sbLIZ2.append(linkedHashMap);
                C2188811AlT.LIZIZ(sbLIZ2);
                keva.storeString(C1200710hLp.LIZ(), GsonProtectorUtils.toJson(gsonLIZLLL, linkedHashMap));
            }
        }
        AbstractC1200800hLy abstractC1200800hLy2 = this.LIZJ;
        if (abstractC1200800hLy2 != null) {
            abstractC1200800hLy2.LIZLLL(c1200750hLt, interfaceC665370Q7z);
        }
    }

    public final synchronized void LIZJ(AbstractC1200800hLy abstractC1200800hLy, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToNewPageState from ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" to ");
        sbLIZ.append(abstractC1200800hLy);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = this.LIZJ;
        this.LIZJ = abstractC1200800hLy;
        if (!z) {
            C1200710hLp c1200710hLp = C1200710hLp.LIZ;
            String strLIZ = abstractC1200800hLy.LIZ();
            c1200710hLp.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Keva keva = C1200710hLp.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("poi_claim_last_page_key_");
            sbLIZ2.append(curUserId);
            keva.storeString(C2188811AlT.LIZIZ(sbLIZ2), strLIZ);
        }
        this.LIZ.vQ2();
        C1200770hLv c1200770hLv = C1200770hLv.LIZ;
        String strLIZ2 = abstractC1200800hLy.LIZ();
        c1200770hLv.getClass();
        c1200770hLv.LIZJ("load_content", new AwS69S1000000_18(strLIZ2, 23));
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.goda.v2.dependency.BizConfig;
import com.bytedance.goda.v2.model.dto.GodaV2Data;
import com.bytedance.goda.v2.model.dto.GodaV2Extension;
import com.bytedance.goda.v2.model.dto.GodaV2Facade;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.04FH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FH {
    public final C04D3 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 6));
    public BizConfig LIZJ = BizConfig.LIZ;
    public final C04FI LIZLLL = new C04FI();
    public InterfaceC1067904Fp LJ;

    public final InterfaceC1066504Fb LIZIZ() {
        return (InterfaceC1066504Fb) this.LIZIZ.getValue();
    }

    public C04FH(C04BK c04bk) {
        this.LIZ = c04bk;
        C1067404Fk c1067404Fk = new C1067404Fk(c04bk);
        c1067404Fk.LIZLLL = LIZIZ();
        this.LJ = c1067404Fk;
    }

    public final void LIZLLL(n nVar) {
        try {
            Gson gson = C04DJ.LIZ;
            String string = nVar.toString();
            Object objLJII = null;
            if (!TextUtils.isEmpty(string)) {
                try {
                    objLJII = C04DJ.LIZ.LJII(string, BizConfig.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            BizConfig bizConfig = (BizConfig) objLJII;
            if (bizConfig == null) {
                bizConfig = BizConfig.LIZ;
            }
            this.LIZJ = bizConfig;
            this.LJ.LIZIZ(bizConfig);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final C04FG LIZ(GodaV2Protocol<?> godaV2Protocol, C04CV c04cv) {
        String str;
        String str2;
        String str3;
        LIZIZ().LIZIZ("refresh_total_timing");
        GodaV2Facade godaV2Facade = godaV2Protocol.facade;
        C04FG c04fgLIZ = null;
        if (godaV2Facade == null) {
            C04EU c04eu = c04cv.LIZJ;
            if (c04eu != null) {
                str3 = c04eu.LIZ;
            } else {
                str3 = null;
            }
            LIZIZ().LIZ(new C1067104Fh(1, "data", "facade is null", new C1067004Fg(str3, null, null, null, null, null, null, 254)));
            return null;
        }
        if (godaV2Facade.body != null && (!r0.isEmpty())) {
            if (godaV2Protocol.global == null) {
                C04EU c04eu2 = c04cv.LIZJ;
                if (c04eu2 != null) {
                    str2 = c04eu2.LIZ;
                } else {
                    str2 = null;
                }
                LIZIZ().LIZ(new C1067104Fh(2, "data", "global data is null", new C1067004Fg(str2, null, null, null, null, null, null, 254)));
                return null;
            }
            try {
                LIZIZ().LIZIZ("tree_build_timing");
                C04FI c04fi = this.LIZLLL;
                InterfaceC1066504Fb interfaceC1066504FbLIZIZ = LIZIZ();
                c04fi.getClass();
                c04fgLIZ = C04FI.LIZ(godaV2Protocol, c04cv, interfaceC1066504FbLIZIZ);
                LIZIZ().LIZJ("tree_build_timing");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZIZ(e);
            }
            LIZIZ().LIZJ("refresh_total_timing");
            return c04fgLIZ;
        }
        C04EU c04eu3 = c04cv.LIZJ;
        if (c04eu3 != null) {
            str = c04eu3.LIZ;
        } else {
            str = null;
        }
        LIZIZ().LIZ(new C1067104Fh(3, "data", "facade body is null", new C1067004Fg(str, null, null, null, null, null, null, 254)));
        return null;
    }

    public final C04FG LIZJ(C04FG c04fg, GodaV2Protocol<?> godaV2Protocol, C04CV c04cv) {
        Map<String, GodaV2Data> map;
        Set<String> setKeySet;
        if (godaV2Protocol != null && c04fg != null) {
            C04FI c04fi = this.LIZLLL;
            Map<String, GodaV2Data> map2 = c04fg.LIZLLL;
            Map linkedHashMap = c04fg.LJ;
            GodaV2Extension godaV2Extension = c04fg.LJII;
            c04fi.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object linkedHashMap3 = godaV2Protocol.data;
            if (linkedHashMap3 == null) {
                linkedHashMap3 = new LinkedHashMap();
            }
            linkedHashMap2.putAll(linkedHashMap3);
            if (map2 != null && (setKeySet = map2.keySet()) != null) {
                Iterator<T> it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    C04FK.LIZ((String) it2.next(), linkedHashMap2, map2);
                }
            }
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            Map linkedHashMap4 = godaV2Protocol.container;
            if (linkedHashMap4 == null) {
                linkedHashMap4 = new LinkedHashMap();
            }
            if (!linkedHashMap.isEmpty()) {
                if (linkedHashMap4.isEmpty()) {
                    linkedHashMap4 = linkedHashMap;
                } else {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap5.putAll(linkedHashMap);
                    for (Map.Entry entry : linkedHashMap4.entrySet()) {
                        linkedHashMap5.put(entry.getKey(), entry.getValue());
                    }
                    linkedHashMap4 = linkedHashMap5;
                }
            }
            GodaV2Extension godaV2Extension2 = godaV2Protocol.extension;
            if (godaV2Extension2 != null) {
                if (godaV2Extension != null) {
                    map = godaV2Extension.service;
                } else {
                    map = null;
                }
                Map<String, GodaV2Data> map3 = godaV2Extension2.service;
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                if (map3 != null) {
                    linkedHashMap6.putAll(map3);
                }
                if (map != null) {
                    Iterator<Map.Entry<String, GodaV2Data>> it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        C04FK.LIZ(it3.next().getKey(), linkedHashMap6, map);
                    }
                }
                godaV2Extension = new GodaV2Extension(godaV2Extension2.pages, linkedHashMap6);
            }
            return LIZ(GodaV2Protocol.LIZ(godaV2Protocol, null, linkedHashMap4, linkedHashMap2, godaV2Extension, 19), c04cv);
        }
        return c04fg;
    }
}

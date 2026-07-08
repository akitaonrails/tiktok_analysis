package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537540q76 {
    public static final C1537810q7X LIZLLL(C1537480q70 c1537480q70) {
        C1537810q7X c1537810q7X = (C1537810q7X) c1537480q70.LJFF(C1537810q7X.class);
        if (c1537810q7X == null) {
            C1537810q7X c1537810q7X2 = new C1537810q7X();
            c1537480q70.LJJ(C1537810q7X.class, c1537810q7X2);
            return c1537810q7X2;
        }
        return c1537810q7X;
    }

    public static final Uri LJ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uri = Uri.EMPTY;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = uri;
        }
        return (Uri) c098200Yq;
    }

    public static final void LIZ(C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
        AbstractC1076640e7i abstractC1076640e7i;
        String str;
        C1533020pzo c1533020pzoLJIILJJIL;
        if (!Intrinsics.LJFF(hybridSchemaParam.getBid(), "hybridkit_default_bid")) {
            c1537480q70.bid = hybridSchemaParam.getBid();
        }
        c1537480q70.LJFF(C1538200q8A.class);
        c1537480q70.LJJ(C1537550q77.class, new C1537550q77());
        c1537480q70.LJJ(InterfaceC20190413zK.class, new InterfaceC20190413zK() { // from class: X.0mDf
            public final Map<Integer, InterfaceC1387820mDc> LL = new LinkedHashMap();

            @Override // X.InterfaceC20190413zK
            public final void remove(int i) {
                this.LL.remove(Integer.valueOf(i));
            }

            @Override // X.InterfaceC20190413zK
            public final void LIZIZ(int i, InterfaceC1387820mDc interfaceC1387820mDc) {
                this.LL.put(Integer.valueOf(i), interfaceC1387820mDc);
            }

            @Override // X.InterfaceC20190413zK
            public final void onActivityResult(int i, int i2, Intent intent) {
                InterfaceC1387820mDc interfaceC1387820mDc = (InterfaceC1387820mDc) ((LinkedHashMap) this.LL).get(Integer.valueOf(i));
                if (interfaceC1387820mDc != null) {
                    interfaceC1387820mDc.onActivityResult(i, i2, intent);
                }
            }
        });
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
        if (iResourceServiceXLIZIZ != null && (abstractC1076640e7i = (AbstractC1076640e7i) c1537480q70.LJFF(AbstractC1076640e7i.class)) != null) {
            IResourceServiceX iResourceServiceXCopyAndModifyConfig = iResourceServiceXLIZIZ.copyAndModifyConfig(abstractC1076640e7i);
            C1533570q0h c1533570q0h = iResourceServiceXCopyAndModifyConfig.getForest().getConfig().LIZIZ;
            if (c1533570q0h != null && (str = c1533570q0h.LIZ) != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3)) != null) {
                c1533020pzoLJIILJJIL.LJIIIZ = str;
            }
            c1537480q70.LJJ(IResourceServiceX.class, iResourceServiceXCopyAndModifyConfig);
        }
    }

    public static final Map<String, Object> LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, HybridSchemaParam hybridSchemaParam) {
        String preloadSettingsKeys;
        HashMap<String, Object> commonVarParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC1541990qEH != null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v != null && (commonVarParams = c1538050q7v.getCommonVarParams(interfaceC1541990qEH)) != null) {
                linkedHashMap.putAll(commonVarParams);
            }
            C1538050q7v c1538050q7v2 = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v2 != null) {
                if (hybridSchemaParam == null || (preloadSettingsKeys = hybridSchemaParam.getPreloadSettingsKeys()) == null) {
                    preloadSettingsKeys = "";
                }
                HashMap<String, Object> preloadSettingKeys = c1538050q7v2.getPreloadSettingKeys(interfaceC1541990qEH, preloadSettingsKeys);
                if (preloadSettingKeys != null) {
                    linkedHashMap.putAll(preloadSettingKeys);
                }
            }
        }
        return linkedHashMap;
    }

    public static final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, InterfaceC1531560pxS interfaceC1531560pxS, C1537480q70 c1537480q70, int i, long j, HybridSchemaParam hybridSchemaParam) {
        C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_GLOBAL_PROPS_START}, null);
        if (interfaceC1531560pxS != null) {
            interfaceC1531560pxS.LIZLLL(LIZJ(interfaceC1541990qEH, hybridSchemaParam));
        }
        if (c1537480q70.runtimeInfo.size() > 0 && interfaceC1531560pxS != null) {
            interfaceC1531560pxS.LIZLLL(c1537480q70.runtimeInfo);
        }
        long jLIZJ = C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_COMPONENT_END, EnumC1537220q6a.PREPARE_GLOBAL_PROPS_END}, null);
        c1537480q70.LJIIIZ().LIZJ("spark_scene", Integer.valueOf(i));
        c1537480q70.LJFF(C1538200q8A.class);
        if (EnumC1520990pgP.SparkPerfMonitorOpt.not()) {
            C1520080pew.LIZLLL("hybrid_log_report", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "prepare_component_time"), new Pair("system_duration", Long.valueOf(jLIZJ - j))));
        }
    }
}

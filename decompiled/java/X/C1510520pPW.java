package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.ml.feature.expriment.FeatureCheckConfig;
import com.ss.android.ugc.aweme.ml.feature.meta.FeatureGroupCheck;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510520pPW implements InterfaceC1510300pPA {
    public static FeatureGroupCheck LIZLLL;
    public static boolean LJ;
    public static final C1510520pPW LIZ = new C1510520pPW();
    public static final ConcurrentHashMap<Pair<String, Integer>, HashMap<String, FeatureItem>> LIZIZ = new ConcurrentHashMap<>();
    public static final Set<String> LIZJ = C093Y.LJ("f_solaria_portrait", "f_vod");
    public static final HashSet<String> LJFF = new HashSet<>();

    public static void LIZJ() {
        System.currentTimeMillis();
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        C01GW c01gw = C1510530pPX.LIZIZ;
        float f = ((FeatureCheckConfig) c01gw.getValue()).monitorRate;
        c1510170pOx.getClass();
        LJ = C1510170pOx.LIZJ(f);
        String strLIZIZ = C0R1F.LIZIZ("feature_check");
        if (Intrinsics.LJFF(strLIZIZ, "")) {
            return;
        }
        try {
            new p();
            LIZLLL(p.LIZJ(strLIZIZ).LJIILIIL());
            LIZJ.addAll(((FeatureCheckConfig) c01gw.getValue()).ignore);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 4);
        }
    }

    public static void LIZLLL(n nVar) {
        Set<FeatureGroup> set;
        try {
            FeatureGroupCheck featureGroupCheck = (FeatureGroupCheck) C08JS.LIZIZ().LIZJ(nVar, FeatureGroupCheck.class);
            LIZLLL = featureGroupCheck;
            if (featureGroupCheck != null && (set = featureGroupCheck.groups) != null) {
                for (FeatureGroup featureGroup : set) {
                    HashMap<String, FeatureItem> map = new HashMap<>();
                    List<FeatureItem> list = featureGroup.features;
                    if (list != null) {
                        for (FeatureItem featureItem : list) {
                            String str = featureItem.name;
                            if (str != null) {
                                map.put(str, featureItem);
                            }
                        }
                    }
                    String str2 = featureGroup.groupName;
                    if (str2 != null) {
                        LIZIZ.put(new Pair<>(str2, Integer.valueOf(featureGroup.sourceType)), map);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 6);
        }
    }

    @Override // X.InterfaceC1510300pPA
    public final Object LIZIZ(int i, long j, String str) {
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        float fFloatValue = ((Number) C0AD5.LIZ.getValue()).floatValue();
        c1510170pOx.getClass();
        if (C1510170pOx.LIZJ(fFloatValue) && str != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("data_set_name", str);
            c2344009Gk.LIZJ(i, "feature_count");
            c2344009Gk.LIZLLL(j, "total_time_cost");
            C20684815ws.LJIILLIIL("tt_feature_dataset_monitor", c2344009Gk.LIZ);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    @Override // X.InterfaceC1510300pPA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Object r22, com.ss.ugc.clientai.core.api.meta.ReturnCode r23, long r24) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1510520pPW.LIZ(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, com.ss.ugc.clientai.core.api.meta.ReturnCode, long):java.lang.Object");
    }
}

package X;

import Y.ARunnableS20S0100100_17;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0foy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141900foy {
    public static final C1141900foy LIZ = new C1141900foy();

    public static Map LIZLLL(String str) {
        Map map;
        try {
            map = (Map) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, str, new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.0fox
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            map = new HashMap();
        }
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public static boolean LIZ(long j, Integer num) {
        List list;
        String str;
        C1140890fnL.LIZLLL().getClass();
        FaceRecognitionMeta faceRecognitionMetaLJII = C1138630fjh.LJII(j, num);
        if (faceRecognitionMetaLJII == null || (list = faceRecognitionMetaLJII.requirements) == null) {
            list = C13BV.INSTANCE;
        }
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (faceRecognitionMetaLJII != null) {
            str = faceRecognitionMetaLJII.modelNames;
        } else {
            str = null;
        }
        Map mapLIZLLL = LIZLLL(str);
        C20005513Ph c20005513PhLJIILJJIL = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ().getEffectPlatform().LJIILJJIL();
        c20005513PhLJIILJJIL.getClass();
        String[] strArrLIZLLL = C19996913Lz.LIZLLL(mapLIZLLL, C1284770jXP.LIZ(strArr));
        if (strArrLIZLLL != null) {
            for (String str2 : C13LQ.LJIIZILJ(strArrLIZLLL)) {
                if (!c20005513PhLJIILJJIL.LIZLLL().isResourceAvailableAndLatest(str2)) {
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("areModelsReady: ");
                    sbLIZ.append(str2);
                    sbLIZ.append(" is not ready!");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZIZ("AlgorithmRepository", strLIZIZ, null);
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static void LIZJ(long j, Integer num) {
        ARunnableS20S0100100_17 aRunnableS20S0100100_17 = new ARunnableS20S0100100_17(j, num, 9);
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
            Map<Integer, String> map = C1138350fjF.LIZ;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01LX(0L, aRunnableS20S0100100_17, null), 2);
        } else {
            aRunnableS20S0100100_17.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r1
      0x0030: PHI (r1v5 java.util.List) = (r1v1 java.util.List), (r1v6 java.util.List) binds: [B:7:0x0013, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(long r1, java.lang.Integer r3, com.ss.android.ugc.effectmanager.IFetchResourceListener r4) {
        /*
            X.0fjG r0 = X.C1140890fnL.LIZLLL()
            r0.getClass()
            com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta r0 = X.C1138630fjh.LJII(r1, r3)
            if (r0 == 0) goto L11
            java.util.List<java.lang.String> r1 = r0.requirements
            if (r1 != 0) goto L30
        L11:
            X.13BV r1 = X.C13BV.INSTANCE
            if (r0 != 0) goto L30
            r0 = 0
        L16:
            java.util.Map r3 = LIZLLL(r0)
            com.ss.android.ugc.effectmanager.DownloadableModelSupport r2 = com.ss.android.ugc.effectmanager.DownloadableModelSupport.getInstance()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.0fp0 r0 = new X.0fp0
            r0.<init>(r4)
            r2.fetchResourcesByRequirementsAndModelNames(r1, r3, r0)
            return
        L30:
            java.lang.String r0 = r0.modelNames
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1141900foy.LIZIZ(long, java.lang.Integer, com.ss.android.ugc.effectmanager.IFetchResourceListener):void");
    }
}

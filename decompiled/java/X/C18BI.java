package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.impl.setting.BtmQuality;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18BI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BI {
    public static final BtmQuality LIZ;

    static {
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        C1972007ny.LIZLLL(featureModelLIZJ.getLazyDataRootKey(), featureModelLIZJ.getLazyDataKey(), featureModelLIZJ.btmQuality, "btm_quality");
        BtmQuality btmQuality = featureModelLIZJ.btmQuality;
        LIZ = btmQuality;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config switch:");
        sbLIZ.append(btmQuality.LIZIZ());
        sbLIZ.append(" error_codes:");
        sbLIZ.append(btmQuality.LIZ());
        C18CK.LIZJ("QualityCenter", new C18BJ(C2188811AlT.LIZIZ(sbLIZ)), false);
    }

    public static void LIZ(int i, String str, JSONObject jSONObject) {
        BtmQuality btmQuality = LIZ;
        if (btmQuality.LIZIZ() == 1 && btmQuality.LIZ().contains(Integer.valueOf(i))) {
            final C18D7 c18d7 = new C18D7(str, jSONObject, "", i);
            BtmSDK.INSTANCE.getThreadExecutor().LIZIZ(new Runnable() { // from class: X.00mf
                @Override // java.lang.Runnable
                public final void run() {
                    Function0 function0 = c18d7;
                    C1C7U.LIZ("QualityCenter@2f81.postIO$1L");
                    try {
                        function0.invoke();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    C1C7U.LIZIZ("QualityCenter@2f81.postIO$1L");
                }
            }, true);
        }
    }
}

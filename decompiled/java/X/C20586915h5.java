package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15h5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20586915h5 {
    public static final C20586915h5 LIZ = new C20586915h5();
    public static final C13E8<Boolean> LIZIZ = new C13E8<>();
    public static boolean LIZJ;

    public static Integer LIZIZ(String str) {
        Object feature$default;
        try {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer = C1510050pOl.LIZ().getProducer("f_client_ai", 0);
            if (producer != null) {
                feature$default = FeatureProducer.getFeature$default(producer, str, (JSONObject) null, "in_feed", (ReturnCode) null, 10, (Object) null);
            } else {
                feature$default = null;
            }
            if (!(feature$default instanceof Integer)) {
                return null;
            }
            return (Integer) feature$default;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readGridCoordinate ");
            sbLIZ.append(str);
            sbLIZ.append(" error: ");
            sbLIZ.append(th.getMessage());
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("LongHandJudge", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static EnumC994690bzX LIZ(int i, int i2) {
        IntRange intRangeLIZ;
        IntRange intRangeLIZ2;
        if (C0HCN.LIZ()) {
            intRangeLIZ = C20587015h6.LIZ(C20587015h6.LIZIZ().smallXMin, C20587015h6.LIZIZ().smallXMax, 3, 8);
            intRangeLIZ2 = C20587015h6.LIZ(C20587015h6.LIZIZ().smallYMin, C20587015h6.LIZIZ().smallYMax, 4, 9);
        } else {
            intRangeLIZ = C20587015h6.LIZ(C20587015h6.LIZIZ().normalXMin, C20587015h6.LIZIZ().normalXMax, 4, 7);
            intRangeLIZ2 = C20587015h6.LIZ(C20587015h6.LIZIZ().normalYMin, C20587015h6.LIZIZ().normalYMax, 4, 8);
        }
        int i3 = intRangeLIZ2.LL;
        if (i2 < i3) {
            return EnumC994690bzX.LL;
        }
        int i4 = intRangeLIZ.LL;
        if (i <= intRangeLIZ.LLILLJJLI && i4 <= i && i2 <= intRangeLIZ2.LLILLJJLI && i3 <= i2) {
            return EnumC994690bzX.LLILLJJLI;
        }
        return EnumC994690bzX.LLILLL;
    }
}

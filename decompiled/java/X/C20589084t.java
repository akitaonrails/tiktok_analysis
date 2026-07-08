package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.TTMParamData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.084t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20589084t {
    public static final String LIZ(InterfaceC805220ViK interfaceC805220ViK, String str) {
        boolean z;
        Object obj;
        Object objLJJIFFI;
        String strLIZIZ;
        if (!C080E.LIZ()) {
            return str;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        try {
            Object[] objArrLIZ = interfaceC805220ViK.LIZ();
            TTMParamData tTMParamData = null;
            if (objArrLIZ != null) {
                objLJJIFFI = C13LQ.LJJIFFI(objArrLIZ);
            } else {
                objLJJIFFI = null;
            }
            if (objLJJIFFI instanceof TTMParamData) {
                tTMParamData = (TTMParamData) objLJJIFFI;
            }
            if (tTMParamData == null) {
                strLIZIZ = str;
            } else {
                strLIZIZ = LIZIZ(tTMParamData, str);
            }
            C189200o6.m2constructorimpl(strLIZIZ);
            obj = strLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OutreachStrategyTimingKeyExtractor extract error: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ2);
        }
        Object obj2 = str;
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public static String LIZIZ(TTMParamData tTMParamData, String str) {
        TTMParamData objectItem;
        String stringValue;
        if (tTMParamData.containsKey("timing_key")) {
            String stringValue2 = tTMParamData.getStringValue("timing_key");
            if (stringValue2 != null) {
                return stringValue2;
            }
            return str;
        }
        String stringValue3 = tTMParamData.getStringValue("al_event_key");
        if (stringValue3 == null) {
            stringValue3 = "";
        }
        if (Intrinsics.LJFF(stringValue3, "outreach_applog")) {
            stringValue = tTMParamData.getStringValue("applog_timing_key");
            if (stringValue == null) {
                return str;
            }
        } else if (Intrinsics.LJFF(stringValue3, "outreach_event")) {
            if (tTMParamData.getIntValue("last_strategy_result") != 1 || (objectItem = tTMParamData.getObjectItem("strategy_extra_key")) == null || (stringValue = objectItem.getStringValue("timing")) == null) {
                return str;
            }
        } else {
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OutreachStrategyTimingKeyExtractor unsupported al_event_key: ");
            sbLIZ.append(stringValue3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZ(strLIZIZ);
            return str;
        }
        return stringValue;
    }
}

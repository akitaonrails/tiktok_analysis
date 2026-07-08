package Y;

import X.C080U;
import X.C0CKM;
import X.C0X52;
import X.C1720106oR;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C311590CJh;
import X.EnumC311630CJl;
import X.InterfaceC1487280oo2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedTask;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class AkS322S0200000_4 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$0(AkS322S0200000_4 akS322S0200000_4, Object obj) {
        int length;
        C080U next;
        String str;
        C0X52 c0x52 = (C0X52) obj;
        try {
            length = (int) c0x52.LIZ.LJ.length();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            length = 0;
        }
        C311590CJh c311590CJh = (C311590CJh) akS322S0200000_4.l0;
        if (c311590CJh != null) {
            c311590CJh.LJFF();
            c311590CJh.LJIILIIL = length;
        }
        ((FetchABTestCommonOptimizedRequest) akS322S0200000_4.l1).LLILLJJLI.LIZ = EnumC311630CJl.SUCCESS;
        Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.toLowerCase(Locale.ROOT), "x-tt-logid")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C080U c080u = next;
        if (c080u != null && (str = c080u.LIZIZ) != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("x-tt-logid:");
            sbLIZ.append(str);
            C1720106oR.LJI("FetchAB/OptimizedRequest", C2188811AlT.LIZIZ(sbLIZ));
            ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) PluggableExtentionKt.pluggableSpi$default(ISettingsRequestService.class, false, false, false, 14, null);
            if (iSettingsRequestService != null) {
                iSettingsRequestService.LJIIJJI(C2097608Jq.LJIIJ(new Pair("commonLogId", str)));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("x-tt-logid", str);
            String str2 = c0x52.LIZ.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("url", str2);
            ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) PluggableExtentionKt.pluggableSpi$default(ISettingRequestExtraInfo.class, false, false, false, 14, null);
            if (iSettingRequestExtraInfo != null) {
                iSettingRequestExtraInfo.LIZIZ(linkedHashMap);
            }
        }
        return new C0CKM(c0x52.LIZ.LIZ, (k) c0x52.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(AkS322S0200000_4 akS322S0200000_4, Object obj) {
        int length;
        C080U next;
        String str;
        C0X52 c0x52 = (C0X52) obj;
        try {
            length = (int) c0x52.LIZ.LJ.length();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            length = 0;
        }
        C311590CJh c311590CJh = (C311590CJh) akS322S0200000_4.l0;
        if (c311590CJh != null) {
            c311590CJh.LJFF();
            c311590CJh.LJIILIIL = length;
        }
        ((FetchABTestCommonOptimizedTask) akS322S0200000_4.l1).LLILLJJLI.LIZ = EnumC311630CJl.SUCCESS;
        Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.toLowerCase(Locale.ROOT), "x-tt-logid")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C080U c080u = next;
        if (c080u != null && (str = c080u.LIZIZ) != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("x-tt-logid:");
            sbLIZ.append(str);
            C1720106oR.LJI("FetchAB/OptimizedRequest", C2188811AlT.LIZIZ(sbLIZ));
            ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) PluggableExtentionKt.pluggableSpi$default(ISettingsRequestService.class, false, false, false, 14, null);
            if (iSettingsRequestService != null) {
                iSettingsRequestService.LJIIJJI(C2097608Jq.LJIIJ(new Pair("commonLogId", str)));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("x-tt-logid", str);
            String str2 = c0x52.LIZ.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("url", str2);
            ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) PluggableExtentionKt.pluggableSpi$default(ISettingRequestExtraInfo.class, false, false, false, 14, null);
            if (iSettingRequestExtraInfo != null) {
                iSettingRequestExtraInfo.LIZIZ(linkedHashMap);
            }
        }
        return new C0CKM(c0x52.LIZ.LIZ, (k) c0x52.LIZIZ);
    }

    public AkS322S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

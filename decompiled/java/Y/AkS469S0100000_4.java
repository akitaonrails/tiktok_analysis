package Y;

import X.C080U;
import X.C0CKM;
import X.C0CKP;
import X.C0DF6;
import X.C0X52;
import X.C1720106oR;
import X.C20610115kp;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C311600CJi;
import X.C313520CQs;
import X.C318050CdP;
import X.C331130CyV;
import X.C331140CyW;
import X.C331160CyY;
import X.C335780DEi;
import X.InterfaceC1487280oo2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.boot.live.LiveRevenueBean;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.mix.game.model.GameCommonMixViewModel;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.profile.business.effect.StickerItemList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class AkS469S0100000_4 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            default:
                return null;
        }
    }

    public AkS469S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS469S0100000_4 akS469S0100000_4, Object obj) {
        String str = (String) obj;
        C20610115kp c20610115kp = (C20610115kp) akS469S0100000_4.l0;
        System.currentTimeMillis();
        c20610115kp.getClass();
        ((C20610115kp) akS469S0100000_4.l0).LLJI = str;
        return str;
    }

    public static final Object apply$1(AkS469S0100000_4 akS469S0100000_4, Object obj) {
        C331140CyW c331140CyW = (C331140CyW) obj;
        List<Aweme> list = c331140CyW.LIZIZ;
        ((GameCommonMixViewModel) akS469S0100000_4.l0).getClass();
        return new C331130CyV(list, new C331160CyY(), c331140CyW.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(AkS469S0100000_4 akS469S0100000_4, Object obj) {
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
        C311600CJi c311600CJi = (C311600CJi) akS469S0100000_4.l0;
        if (c311600CJi != null) {
            c311600CJi.LJII();
            c311600CJi.LJIILIIL = length;
        }
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
            C1720106oR.LJI("FetchAB/FetchABTestCommonRequest", C2188811AlT.LIZIZ(sbLIZ));
            ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class);
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
            ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) ServiceManager.get().getService(ISettingRequestExtraInfo.class);
            if (iSettingRequestExtraInfo != null) {
                iSettingRequestExtraInfo.LIZIZ(linkedHashMap);
            }
        }
        return new C0CKM(c0x52.LIZ.LIZ, (k) c0x52.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$3(AkS469S0100000_4 akS469S0100000_4, Object obj) {
        int length;
        C0X52 c0x52 = (C0X52) obj;
        try {
            length = (int) c0x52.LIZ.LJ.length();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            length = 0;
        }
        C311600CJi c311600CJi = (C311600CJi) akS469S0100000_4.l0;
        if (c311600CJi != null) {
            c311600CJi.LJII();
            c311600CJi.LJIILIIL = length;
        }
        Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
        while (it2.hasNext() && !Intrinsics.LJFF(it2.next().LIZ.toLowerCase(Locale.ROOT), "x-tt-logid")) {
        }
        return new C0CKP(c0x52.LIZ.LIZ, (k) c0x52.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$4(AkS469S0100000_4 akS469S0100000_4, Object obj) {
        ((C313520CQs) akS469S0100000_4.l0).getClass();
        C313520CQs.LIZ(1, "live_revenue_disable_cache_request_body");
        return ((LiveRevenueBean) JsonParseUtils.LIZLLL(LiveRevenueBean.class, (String) ((C0X52) obj).LIZIZ)).data;
    }

    public static final Object apply$5(AkS469S0100000_4 akS469S0100000_4, Object obj) {
        return ((C318050CdP) akS469S0100000_4.l0).LJ((StickerItemList) obj);
    }

    public static final Object apply$6(AkS469S0100000_4 akS469S0100000_4, Object obj) {
        String str = ((C0DF6) akS469S0100000_4.l0).LJ;
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "internal error";
        }
        return C335780DEi.LIZJ(str, message);
    }
}

package Y;

import X.AbstractC1255880imo;
import X.AbstractC1588450rRD;
import X.C0N0X;
import X.C1588840rRq;
import X.C1C7U;
import X.C20684815ws;
import X.C297030Bkb;
import X.C632130Oqp;
import X.EnumC585580Mxw;
import X.InterfaceC585470Mxl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS62S1100000_9 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS62S1100000_9 aCallableS62S1100000_9) {
        C1C7U.LIZ("PhlPlayerController@b87e.subtitleListener$1$onSubInfoCallbackImpl$1");
        ((C0N0X) aCallableS62S1100000_9.l1).LIZ.I5(aCallableS62S1100000_9.s0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhlPlayerController@b87e.subtitleListener$1$onSubInfoCallbackImpl$1");
        return unit;
    }

    public static final Object call$1(ACallableS62S1100000_9 aCallableS62S1100000_9) {
        C1C7U.LIZ("EventTrackerKt@9f5.sendEventTrackingAsync$1");
        JSONObject jSONObject = new JSONObject();
        Function1 function1 = (Function1) aCallableS62S1100000_9.l1;
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        C20684815ws.LJIJ(aCallableS62S1100000_9.s0, jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventTrackerKt@9f5.sendEventTrackingAsync$1");
        return unit;
    }

    public static final Object call$2(ACallableS62S1100000_9 aCallableS62S1100000_9) {
        String strLIZLLL;
        ITemplateService iTemplateService;
        C1C7U.LIZ("MDPPreloadHelper@3678.executeListPreload$1");
        C632130Oqp c632130Oqp = C632130Oqp.LIZ;
        String str = aCallableS62S1100000_9.s0;
        MusicAwemeListRequestModel musicAwemeListRequestModel = (MusicAwemeListRequestModel) aCallableS62S1100000_9.l1;
        c632130Oqp.getClass();
        MusicAwemeList musicAwemeListLIZIZ = null;
        try {
            if (C297030Bkb.LIZ() && (iTemplateService = (ITemplateService) PluggableExtentionKt.pluggableSpi$default(ITemplateService.class, false, false, false, 14, null)) != null) {
                strLIZLLL = iTemplateService.LIZLLL();
            } else {
                strLIZLLL = null;
            }
            String str2 = C632130Oqp.LIZIZ;
            if (str == null) {
                str = "";
            }
            musicAwemeListLIZIZ = MusicAwemeApi.LIZIZ(str2, 0L, 20, 0, str, strLIZLLL, musicAwemeListRequestModel);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("MDPPreloadHelper@3678.executeListPreload$1");
        return musicAwemeListLIZIZ;
    }

    public static final Object call$3(ACallableS62S1100000_9 aCallableS62S1100000_9) {
        HashMap<String, Object> mapLJIILL;
        InterfaceC585470Mxl interfaceC585470Mxl = (InterfaceC585470Mxl) aCallableS62S1100000_9.l1;
        String str = aCallableS62S1100000_9.s0;
        C1C7U.LIZ("SimReporterSdkImpl@afcb.reportVideoStopEvent$2L");
        HashMap map = new HashMap();
        if (interfaceC585470Mxl != null && (mapLJIILL = interfaceC585470Mxl.LJIILL(str)) != null && !mapLJIILL.isEmpty()) {
            map.putAll(mapLJIILL);
        }
        C1C7U.LIZIZ("SimReporterSdkImpl@afcb.reportVideoStopEvent$2L");
        return map;
    }

    public static final Object call$4(ACallableS62S1100000_9 aCallableS62S1100000_9) {
        HashMap<String, Object> mapLJIILL;
        InterfaceC585470Mxl interfaceC585470Mxl = (InterfaceC585470Mxl) aCallableS62S1100000_9.l1;
        String str = aCallableS62S1100000_9.s0;
        C1C7U.LIZ("SimReporterSdkImpl@afcb.reportVideoPlayFailEvent$2L");
        HashMap map = new HashMap();
        if (interfaceC585470Mxl != null && (mapLJIILL = interfaceC585470Mxl.LJIILL(str)) != null && !mapLJIILL.isEmpty()) {
            map.putAll(mapLJIILL);
        }
        C1C7U.LIZIZ("SimReporterSdkImpl@afcb.reportVideoPlayFailEvent$2L");
        return map;
    }

    public static final Object call$5(ACallableS62S1100000_9 aCallableS62S1100000_9) {
        T t;
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aCallableS62S1100000_9.l1;
        final String str = aCallableS62S1100000_9.s0;
        feedFollowFragment.getClass();
        C1C7U.LIZ("FeedFollowFragment@1d3d.tryRefresh$1L");
        final int effectiveConnectionType = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType();
        C20684815ws.LJIILLIIL("refresh_homepage_follow", new HashMap<String, String>(effectiveConnectionType, str) { // from class: X.0CFh
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effectiveConnectionType);
                sbLIZ.append("");
                put("network_status", C2188811AlT.LIZIZ(sbLIZ));
                put("enter_method", str);
                put("is_top_tab", "1");
                put("enter_from", "homepage_follow");
            }
        });
        AbstractC1588450rRD abstractC1588450rRD = feedFollowFragment.LLJJJJ;
        if (abstractC1588450rRD == null) {
            C1C7U.LIZIZ("FeedFollowFragment@1d3d.tryRefresh$1L");
            return null;
        }
        T t2 = abstractC1588450rRD.LIZ;
        if (t2 != 0 && (t = t2.LL) != 0 && (t instanceof C1588840rRq) && ((AbstractC1255880imo) t).isDataEmpty()) {
            C20684815ws.LJIILLIIL("no_data_refresh_page", new HashMap<String, String>(effectiveConnectionType) { // from class: X.00nd
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effectiveConnectionType);
                    sbLIZ.append("");
                    put("network_status", C2188811AlT.LIZIZ(sbLIZ));
                    put("enter_from", "homepage_hot");
                }
            });
        }
        C1C7U.LIZIZ("FeedFollowFragment@1d3d.tryRefresh$1L");
        return null;
    }

    public ACallableS62S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public ACallableS62S1100000_9(EnumC585580Mxw enumC585580Mxw, InterfaceC585470Mxl interfaceC585470Mxl, String str, int i) {
        this.$t = i;
        this.l1 = interfaceC585470Mxl;
        this.s0 = str;
    }
}

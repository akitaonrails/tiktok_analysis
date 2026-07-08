package Y;

import X.C09AJ;
import X.C09JN;
import X.C0IGI;
import X.C1227904rF;
import X.C1C7U;
import X.C20684815ws;
import X.C589840NBm;
import X.C766270U4b;
import X.C784440Upu;
import X.InterfaceC1842140y2O;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.network.model.LogPbBean;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.api.room.WebcastRoomRepostNoteCreateResponse;

/* JADX INFO: loaded from: classes28.dex */
public class AfS4S1200100_27 implements C09JN {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS4S1200100_27 afS4S1200100_27, Object obj) {
        boolean z;
        String str;
        C1C7U.LIZ("LiveRepostServiceImpl@9d34.createRepostNote$1");
        WebcastRoomRepostNoteCreateResponse webcastRoomRepostNoteCreateResponse = (WebcastRoomRepostNoteCreateResponse) obj;
        WebcastRoomRepostNoteCreateResponse.Data data = webcastRoomRepostNoteCreateResponse.data;
        if (data != null && data.createCode == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C784440Upu.LIZ().LIZIZ(new C0IGI(afS4S1200100_27.j3, afS4S1200100_27.s0));
            C766270U4b.LIZLLL(2131855711);
            InterfaceC1842140y2O interfaceC1842140y2O = (InterfaceC1842140y2O) afS4S1200100_27.l1;
            if (interfaceC1842140y2O != null) {
                interfaceC1842140y2O.onSuccess();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) afS4S1200100_27.l2);
            linkedHashMap.put("result", "success");
            C20684815ws.LJIILLIIL("livesdk_repost_notes_add_result", linkedHashMap);
        } else {
            C766270U4b.LIZLLL(2131855710);
            WebcastRoomRepostNoteCreateResponse.Data data2 = webcastRoomRepostNoteCreateResponse.data;
            if (data2 == null || (str = data2.reason) == null) {
                str = "server_error";
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) afS4S1200100_27.l2);
            linkedHashMap2.put("fail_reason", str);
            linkedHashMap2.put("result", "fail");
            C20684815ws.LJIILLIIL("livesdk_repost_notes_add_result", linkedHashMap2);
            InterfaceC1842140y2O interfaceC1842140y2O2 = (InterfaceC1842140y2O) afS4S1200100_27.l1;
            if (interfaceC1842140y2O2 != null) {
                interfaceC1842140y2O2.onFailure();
            }
        }
        C1C7U.LIZIZ("LiveRepostServiceImpl@9d34.createRepostNote$1");
    }

    public static final void accept$1(AfS4S1200100_27 afS4S1200100_27, Object obj) {
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str;
        String str2;
        C1C7U.LIZ("PnSPrivacyPreciseMonitorKt@6d0b.preciseNetworkMonitor$1$1");
        ((C09AJ) afS4S1200100_27.l1).onNext(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = "";
        if (obj instanceof com.ss.android.ugc.aweme.network.model.BaseResponse) {
            LogPbBean logPb = ((com.ss.android.ugc.aweme.network.model.BaseResponse) obj).getLogPb();
            if (logPb != null && (str2 = logPb.imprId) != null) {
                str3 = str2;
            }
        } else if ((obj instanceof BaseResponse) && (serverTimeExtra = ((BaseResponse) obj).extra) != null && (str = serverTimeExtra.logid) != null) {
            str3 = str;
        }
        String str4 = afS4S1200100_27.s0;
        long j = jCurrentTimeMillis - afS4S1200100_27.j3;
        Map map = (Map) afS4S1200100_27.l2;
        C1227904rF.LIZ.getClass();
        C589840NBm.LIZJ(j, str4, str3, GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), obj), map);
        C1C7U.LIZIZ("PnSPrivacyPreciseMonitorKt@6d0b.preciseNetworkMonitor$1$1");
    }

    public static final void accept$2(AfS4S1200100_27 afS4S1200100_27, Object obj) {
        C1C7U.LIZ("PnSPrivacyPreciseMonitorKt@6d0b.preciseNetworkMonitor$1$2");
        Throwable th = (Throwable) obj;
        ((C09AJ) afS4S1200100_27.l1).onError(th);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = afS4S1200100_27.s0;
        long j = jCurrentTimeMillis - afS4S1200100_27.j3;
        Map map = (Map) afS4S1200100_27.l2;
        C1227904rF.LIZ.getClass();
        C589840NBm.LIZIZ(str, j, th, map, GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), th));
        C1C7U.LIZIZ("PnSPrivacyPreciseMonitorKt@6d0b.preciseNetworkMonitor$1$2");
    }

    public AfS4S1200100_27(long j, Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.j3 = j;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}

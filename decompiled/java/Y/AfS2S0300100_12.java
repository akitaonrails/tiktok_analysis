package Y;

import X.C09JN;
import X.C0US1;
import X.C0US4;
import X.C1C7U;
import X.C20441214yg;
import X.C470590Icr;
import X.C500260Jjc;
import X.C781270Ukn;
import X.C782110Um9;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.PopMsgContainer;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AfS2S0300100_12 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S0300100_12 afS2S0300100_12, Object obj) {
        C1C7U.LIZ("OneTapGoLiveManager@c582.checkLinkMicPermission$1");
        C20441214yg.LJIIIZ("OneTapGoLiveManager", "checkLinkMicPermission succ");
        ((OneTapGoLiveManager) afS2S0300100_12.l0).LJJIFFI(afS2S0300100_12.j3, "check_linkmic_permission");
        ((Function1) afS2S0300100_12.l1).invoke((Room) afS2S0300100_12.l2);
        C1C7U.LIZIZ("OneTapGoLiveManager@c582.checkLinkMicPermission$1");
    }

    public static final void accept$1(AfS2S0300100_12 afS2S0300100_12, Object obj) {
        RoomCreateInfo roomCreateInfo;
        LivePermissionApplyResponse livePermissionApplyResponse;
        BroadcastSettingResponse broadcastSettingResponse;
        PopMsgContainer popMsgContainer;
        List<PopMsgContainer> list;
        PopMsgContainer next;
        C470590Icr<BroadcastSettingResponse> c470590Icr;
        C470590Icr<LivePermissionApplyResponse> c470590Icr2;
        C470590Icr<RoomCreateInfo> c470590Icr3;
        C1C7U.LIZ("OneTapGoLiveManager@c582.handleCanLiveVideo$2");
        C0US4 c0us4 = (C0US4) obj;
        ((OneTapGoLiveManager) afS2S0300100_12.l0).LJJIFFI(afS2S0300100_12.j3, "fetch_create_info");
        try {
            OneTapGoLiveManager oneTapGoLiveManager = (OneTapGoLiveManager) afS2S0300100_12.l0;
            String str = null;
            if (c0us4 != null && (c470590Icr3 = c0us4.LIZ) != null) {
                roomCreateInfo = c470590Icr3.data;
            } else {
                roomCreateInfo = null;
            }
            oneTapGoLiveManager.LLJIJIL = roomCreateInfo;
            if (c0us4 == null || (c470590Icr2 = c0us4.LIZIZ) == null) {
                livePermissionApplyResponse = null;
            } else {
                livePermissionApplyResponse = c470590Icr2.data;
            }
            oneTapGoLiveManager.LLJILJIL = livePermissionApplyResponse;
            if (c0us4 == null || (c470590Icr = c0us4.LIZJ) == null) {
                broadcastSettingResponse = null;
            } else {
                broadcastSettingResponse = c470590Icr.data;
            }
            oneTapGoLiveManager.LJIJJLI(broadcastSettingResponse);
            OneTapGoLiveManager oneTapGoLiveManager2 = (OneTapGoLiveManager) afS2S0300100_12.l0;
            boolean zLJJ = oneTapGoLiveManager2.LJJ(oneTapGoLiveManager2.LLJIJIL);
            OneTapGoLiveManager oneTapGoLiveManager3 = (OneTapGoLiveManager) afS2S0300100_12.l0;
            boolean zLJIL = oneTapGoLiveManager3.LJIL(oneTapGoLiveManager3.LLJILJIL, (DetailLivePermission) afS2S0300100_12.l1, (ApplyLivePermission) afS2S0300100_12.l2);
            Context topContext = C781270Ukn.LJIIJ().getTopContext();
            C20441214yg.LJIIIZ("OneTapGoLiveManager", "handleCanLiveVideo succ");
            C0US1 c0us1 = new C0US1((OneTapGoLiveManager) afS2S0300100_12.l0, zLJJ, zLJIL);
            RoomCreateInfo roomCreateInfo2 = ((OneTapGoLiveManager) afS2S0300100_12.l0).LLJIJIL;
            if (roomCreateInfo2 != null && (list = roomCreateInfo2.popInfoList) != null) {
                Iterator<PopMsgContainer> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (C500260Jjc.LJJIIZ(next.content)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                popMsgContainer = next;
            } else {
                popMsgContainer = null;
            }
            if (topContext != null && popMsgContainer != null) {
                C20441214yg.LJIIIZ("OneTapGoLiveManager", "show center dialog");
                C782110Um9 c782110Um9 = new C782110Um9(topContext);
                c782110Um9.LJIIIZ(popMsgContainer.content);
                List<String> list2 = popMsgContainer.buttonContent;
                if (list2 != null) {
                    str = list2.get(0);
                }
                c782110Um9.LJIILJJIL(str, new AcS495S0100000_12(c0us1, 10));
                c782110Um9.LJIILL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
            } else {
                C20441214yg.LJIIIZ("OneTapGoLiveManager", "no show center dialog");
                c0us1.invoke();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((OneTapGoLiveManager) afS2S0300100_12.l0).LJIIL("parse_create_info_exception");
            C20441214yg.LJFF("OneTapGoLiveManager", "oneTapGoLive failed, for exception,", th);
        }
        C1C7U.LIZIZ("OneTapGoLiveManager@c582.handleCanLiveVideo$2");
    }

    public AfS2S0300100_12(Object obj, long j, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j3 = j;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

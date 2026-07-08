package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageReleaseDelayDisconnectSetting;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.1By8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222141By8 implements InterfaceC2222351ByT {
    public final C2222041Bxy LIZ;
    public C2222241ByI LIZIZ;
    public EnumC2222181ByC LIZJ = EnumC2222181ByC.HTTP;
    public final IMessageWsClient LIZLLL;
    public final List<Long> LJ;
    public int LJFF;
    public C2222371ByV LJI;
    public volatile long LJII;
    public volatile long LJIIIIZZ;
    public volatile String LJIIIZ;
    public long LJIIJ;
    public volatile Set<Integer> LJIIJJI;
    public volatile long LJIIL;
    public int LJIILIIL;
    public final AtomicInteger LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public final AtomicInteger LJIIZILJ;
    public Handler LJIJ;
    public Handler LJIJI;
    public C2222511Byj LJIJJ;
    public long LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public long LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public final List<IMessage> LJJIIZI;
    public final List<ProtoApiResult> LJJIJ;
    public C2222081By2 LJJIJIIJI;
    public final C2222131By7 LJJIJIIJIL;

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        try {
            this.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onReady");
            this.LJIJ = this.LIZ.LIZ.LJFF(new C1D12(this, 5));
            this.LJIJI = this.LIZ.LIZ.LJII(new C1D12(this, 6));
            if (this.LIZIZ.LJII) {
                LJIL(EnumC2222181ByC.WS_CONNECTING);
                Handler handler = this.LJIJ;
                if (handler != null) {
                    C786410Ut5.LJLILLLLZI(handler, 105);
                }
            }
            C2222511Byj c2222511Byj = this.LJIJJ;
            if (c2222511Byj != null) {
                C2222361ByU.LIZ(c2222511Byj.LIZ, "uplink client start");
                C18JU c18ju = new C18JU(c2222511Byj);
                c18ju.start();
                c2222511Byj.LJFF = c18ju;
            }
            LJIIIIZZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", e.getMessage());
        }
    }

    public final void LIZIZ() {
        Handler handler;
        Handler handler2 = this.LJIJI;
        if (handler2 == null || !handler2.hasMessages(113) || (handler = this.LJIJI) == null) {
            return;
        }
        handler.removeMessages(113);
    }

    public final void LIZLLL() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 == null || !handler2.hasMessages(106) || (handler = this.LJIJ) == null) {
            return;
        }
        handler.removeMessages(106);
    }

    public final void LJ() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 == null || !handler2.hasMessages(110) || (handler = this.LJIJ) == null) {
            return;
        }
        handler.removeMessages(110);
    }

    public final void LJFF() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 == null || !handler2.hasMessages(115) || (handler = this.LJIJ) == null) {
            return;
        }
        handler.removeMessages(115);
    }

    public final void LJIIIIZZ() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 == null || !handler2.hasMessages(120) || (handler = this.LJIJ) == null) {
            return;
        }
        handler.removeMessages(120);
    }

    public final void LJIJI() {
        Message messageObtainMessage;
        Handler handler;
        if (this.LIZLLL.isWsConnected()) {
            this.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "trigger heartbeat timer");
            LJ();
            Handler handler2 = this.LJIJ;
            if (handler2 == null || (messageObtainMessage = handler2.obtainMessage(110)) == null || (handler = this.LJIJ) == null) {
                return;
            }
            C786410Ut5.LJLJLJ(handler, messageObtainMessage, this.LJIIL * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    public final void LJIJJLI() {
        long j = this.LJII > 0 ? this.LJII : 1000L;
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call api after ");
        sbLIZ.append(j);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LJIJI;
        if (handler != null) {
            C786410Ut5.LJLJJI(109, j, handler);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        this.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onDestroy");
        Handler handler = this.LJIJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        int i = this.LJJIII;
        int i2 = this.LJJIIJZLJL;
        int i3 = this.LJJIIJ;
        int i4 = this.LJJIFFI;
        int i5 = this.LJJII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2222001Bxu c2222001BxuLJIIIIZZ = this.LIZ.LIZ.LJIIIIZZ();
        c2222001BxuLJIIIIZZ.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("all_dispatch_times", Integer.valueOf(c2222001BxuLJIIIIZZ.LJIILLIIL));
        linkedHashMap2.put("dispatch_limit_times", Integer.valueOf(c2222001BxuLJIIIIZZ.LJIIZILJ));
        linkedHashMap.putAll(linkedHashMap2);
        messageMonitorLIZIZ.monitorWSReuseMessage(i, i2, i3, i4, i5, linkedHashMap);
        this.LIZ.LIZ.LIZIZ().monitorWSReuseCount(this.LJJIIZ);
        this.LIZLLL.disconnectFromWebSocket("release");
        this.LIZLLL.setCallback(null);
        C2222511Byj c2222511Byj = this.LJIJJ;
        if (c2222511Byj != null) {
            c2222511Byj.LJFF();
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        long jReleaseDelayDisconnectTime;
        this.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onRelease");
        this.LJJ = false;
        ((CopyOnWriteArrayList) this.LJJIIZI).clear();
        ((CopyOnWriteArrayList) this.LJJIJ).clear();
        this.LIZLLL.setCallback(null);
        LIZIZ();
        LJFF();
        LIZLLL();
        Handler handler = this.LJIJI;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
        this.LJFF = 0;
        this.LIZ.LIZ.context().getClass();
        this.LJII = 0L;
        this.LJIILIIL = 0;
        this.LJIJJLI = 0L;
        ((CopyOnWriteArrayList) this.LJ).clear();
        ((CopyOnWriteArraySet) this.LJIIJJI).clear();
        this.LJJI = 0L;
        this.LJIL = false;
        this.LIZLLL.onRelease();
        if (this.LIZJ == EnumC2222181ByC.WS_CONNECTED_AND_ENTER_ROOM_RESP) {
            LJIL(EnumC2222181ByC.WS_CONNECTED);
        }
        C2222081By2 c2222081By2 = this.LJJIJIIJI;
        C2222081By2 c2222081By22 = c2222081By2 != null ? c2222081By2 : null;
        if (c2222081By22.LIZLLL == null) {
            C2222241ByI c2222241ByI = c2222081By22.LIZIZ.LIZIZ;
            jReleaseDelayDisconnectTime = c2222241ByI == null ? 30000L : c2222241ByI.LJI;
        } else {
            jReleaseDelayDisconnectTime = LiveMessageReleaseDelayDisconnectSetting.INSTANCE.releaseDelayDisconnectTime();
        }
        LJIJJ(jReleaseDelayDisconnectTime);
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStart strategyState: ");
        sbLIZ.append(this.LIZJ);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJIII++;
        this.LJI = null;
        this.LIZLLL.setCallback(this.LJJIJIIJIL);
        if (this.LIZJ == EnumC2222181ByC.WS_CONNECTED_AND_ENTER_ROOM_RESP) {
            LJIL(EnumC2222181ByC.WS_CONNECTED);
        }
        Handler handler = this.LJIJ;
        if (handler != null) {
            C786410Ut5.LJLILLLLZI(handler, 101);
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        InterfaceC2222621Byu interfaceC2222621Byu;
        this.LJJIJIIJI = c2222081By2;
        C2221921Bxm c2221921Bxm = c2222081By2.LIZJ;
        C2222121By6 c2222121By6 = new C2222121By6(c2221921Bxm.LIZ, c2221921Bxm.LIZIZ);
        c2222121By6.LIZLLL = c2222081By2;
        C2222241ByI c2222241ByI = c2222081By2.LIZIZ.LIZIZ;
        IMessageWsClient iMessageWsClient = null;
        if (c2222241ByI != null && c2222241ByI.LIZ != null && (interfaceC2222621Byu = c2222081By2.LIZ.LJI) != null) {
            if (c2222241ByI != null) {
                iMessageWsClient = c2222241ByI.LIZ;
            }
            if (interfaceC2222621Byu.LIZLLL()) {
                this.LJIJJ = new C2222511Byj(c2222121By6, iMessageWsClient, iMessageWsClient, c2222081By2.LIZ.LJI);
            }
        }
    }

    public final boolean LJIIJ(long j) {
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkDimensionValid, result dimension: ");
        sbLIZ.append(j);
        sbLIZ.append(", portal dimension: ");
        sbLIZ.append(this.LIZ.LIZ.context().LIZJ);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        if (j == 0 || this.LIZ.LIZ.context().LIZJ == j) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
        this.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "onStop");
        this.LJJ = false;
        this.LJI = c2222371ByV;
        Handler handler = this.LJIJ;
        if (handler != null) {
            C786410Ut5.LJLJJL(handler, handler.obtainMessage(102, c2222371ByV));
        }
    }

    public final synchronized boolean LJIILIIL(boolean z) {
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkFirstMessageValid, result isFirst: ");
        sbLIZ.append(z);
        sbLIZ.append(", current isFirstMessageHandled: ");
        sbLIZ.append(this.LJIL);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            return true;
        }
        boolean z2 = this.LJIL;
        this.LJIL = true;
        return !z2;
    }

    public final void LJIIZILJ(int i) {
        EnumC2222181ByC enumC2222181ByC;
        boolean zLJI = MethodIDManager.LJI(196666);
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMessage call api fetchRule: ");
        sbLIZ.append(i);
        sbLIZ.append(", strategyState: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isStarted: ");
        sbLIZ.append(this.LJJ);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        if (((CopyOnWriteArraySet) this.LJIIJJI).contains(Integer.valueOf(i))) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE && ((enumC2222181ByC = this.LIZJ) == EnumC2222181ByC.HTTP || enumC2222181ByC == EnumC2222181ByC.WS_CONNECTED_AND_ENTER_ROOM_RESP)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!this.LJJ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        ((CopyOnWriteArraySet) this.LJIIJJI).add(Integer.valueOf(i));
        HashMap map = new HashMap();
        map.put("cursor", this.LJIIIZ);
        map.put("user_id", String.valueOf(this.LIZLLL.getUserId()));
        map.put("wss_version", "2");
        MessageMonitor messageMonitorLIZIZ2 = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchMessage call api ");
        sbLIZ2.append(i);
        messageMonitorLIZIZ2.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJIIJ = System.currentTimeMillis();
        this.LIZLLL.apiCall(map, i, true);
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onImFetchStarted();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIJ(long j) {
        Message messageObtainMessage;
        Handler handler;
        this.LIZ.LIZ.LIZIZ().log("MessagePortalReuse", "trigger fallback timer");
        LIZLLL();
        Handler handler2 = this.LJIJ;
        if (handler2 != null && (messageObtainMessage = handler2.obtainMessage(106, "ws_connect_timeout")) != null && (handler = this.LJIJ) != null) {
            C786410Ut5.LJLJLJ(handler, messageObtainMessage, j);
        }
    }

    public final void LJIJJ(long j) {
        Handler handler;
        Message messageObtainMessage;
        Handler handler2;
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger release delay disconnect timer, releaseDelayDisconnectTime: ");
        sbLIZ.append(j);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIIZZ();
        if (j > 0 && (handler = this.LJIJ) != null && (messageObtainMessage = handler.obtainMessage(120)) != null && (handler2 = this.LJIJ) != null) {
            C786410Ut5.LJLJLJ(handler2, messageObtainMessage, j);
        }
    }

    public final void LJIL(EnumC2222181ByC enumC2222181ByC) {
        int i = C2222201ByE.LIZ[enumC2222181ByC.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            this.LIZ.LIZ.context().LIZIZ = 2;
        } else {
            this.LIZ.LIZ.context().LIZIZ = 0;
        }
        this.LIZJ = enumC2222181ByC;
    }

    public final void LJJ(String str) {
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToHttp, reason: ");
        sbLIZ.append(str);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        LJIL(EnumC2222181ByC.HTTP);
        LIZLLL();
        LIZIZ();
        LJFF();
        this.LIZLLL.disconnectFromWebSocket(str);
        Handler handler = this.LJIJI;
        if (handler != null) {
            C786410Ut5.LJLILLLLZI(handler, 109);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LIZ.LIZLLL().LIZ).iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).onSwitchToHttp(str);
        }
    }

    public C2222141By8(C2222041Bxy c2222041Bxy, C2222241ByI c2222241ByI) {
        this.LIZ = c2222041Bxy;
        this.LIZIZ = c2222241ByI;
        IMessageWsClient iMessageWsClient = c2222241ByI.LIZ;
        this.LIZLLL = iMessageWsClient;
        this.LJ = new CopyOnWriteArrayList();
        this.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
        this.LJIIJJI = new CopyOnWriteArraySet();
        this.LJIIL = 10L;
        this.LJIILJJIL = new AtomicInteger(0);
        this.LJIIZILJ = new AtomicInteger();
        this.LJJIIZI = new CopyOnWriteArrayList();
        this.LJJIJ = new CopyOnWriteArrayList();
        C2222131By7 c2222131By7 = new C2222131By7(this);
        this.LJJIJIIJIL = c2222131By7;
        iMessageWsClient.setCallback(c2222131By7);
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
        Handler handler;
        C2222241ByI c2222241ByI = c2222081By2.LIZIZ.LIZIZ;
        if (c2222241ByI == null) {
            c2222241ByI = this.LIZIZ;
        }
        this.LIZIZ = c2222241ByI;
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResetDimension strategyState: ");
        sbLIZ.append(this.LIZJ);
        messageMonitorLIZIZ.log("MessagePortalReuse", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL.setCallback(this.LJJIJIIJIL);
        if (this.LIZJ == EnumC2222181ByC.WS_CONNECTED_AND_ENTER_ROOM_RESP) {
            LJIL(EnumC2222181ByC.WS_CONNECTED);
        }
        if (this.LIZJ == EnumC2222181ByC.HTTP && this.LIZIZ.LJII && (handler = this.LJIJ) != null) {
            C786410Ut5.LJLILLLLZI(handler, 105);
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceC2222351ByT
    public final void LJIILLIIL(long j, C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1) {
        C2222511Byj c2222511Byj = this.LJIJJ;
        if (c2222511Byj != null) {
            c2222511Byj.LJI(j, c1500700p9g, interfaceC19666511x1, null);
        }
    }
}

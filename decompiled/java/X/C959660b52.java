package X;

import Y.ARunnableS84S0200000_15;
import android.os.Looper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0b52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959660b52 extends AbstractC959650b51<InterfaceC960010b5b> {
    public static final Map<EnumC959750b5B, EnumC959690b55> LJFF = C2097608Jq.LJIIIIZZ(new Pair(EnumC959750b5B.TYPE_INVITEE_LIST_DIALOG, EnumC959690b55.QUICK_CO_HOST_BANNER_CLICKED), new Pair(EnumC959750b5B.TYPE_AUTO_START_WHEN_END, EnumC959690b55.QUICK_DISCONNECTED_AUTO_START), new Pair(EnumC959750b5B.TYPE_RETRY_BY_KEEP_ALIVE, EnumC959690b55.KEEP_ALIVE_RETRY), new Pair(EnumC959750b5B.TYPE_GROUP_CHANNEL_ID_CHANGE, EnumC959690b55.GROUP_CHANNEL_ID_CHANGED), new Pair(EnumC959750b5B.TYPE_RESTART_QUICK_COHOST_WHEN_CONNECTED, EnumC959690b55.RESTART_QUICK_COHOST_BY_COHOST_CONNECTED), new Pair(EnumC959750b5B.TYPE_TEAM_PAIR_BUTTON_CLICK, EnumC959690b55.TEAM_PAIR_BUTTON_CLICKED), new Pair(EnumC959750b5B.TYPE_TEAM_PAIR_SYNC_STATE, EnumC959690b55.TEAM_PAIR_SYNC_STATE), new Pair(EnumC959750b5B.TYPE_QUICK_BATTLE_BUTTON_CLICK, EnumC959690b55.QUICK_BATTLE_BUTTON_CLICKED), new Pair(EnumC959750b5B.TYPE_RESTART_QUICK_COHOST_OPEN_SUGGESTED_INVITE, EnumC959690b55.QUICK_COHOST_OPEN_NON_FRIEND_INVITE_RETRY));

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIIJJI(String str, List list) {
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIIIZ() {
        LJJIJL(EnumC959750b5B.TYPE_GROUP_CHANNEL_ID_CHANGE, null);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIILL() {
        LJJIJL(EnumC959750b5B.TYPE_RETRY_BY_KEEP_ALIVE, null);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJJIII() {
        LJJIJL(EnumC959750b5B.TYPE_RESTART_QUICK_COHOST_WHEN_CONNECTED, null);
    }

    public final void LJJIJLIJ() {
        Room roomInfo = this.LIZ.getRoomInfo();
        EnumC955210axr enumC955210axrLIZ = C955130axj.LIZ(roomInfo != null ? roomInfo.getId() : 0L);
        if (enumC955210axrLIZ == null) {
            return;
        }
        this.LIZ.c0().LJIIJJI = C915980Zwa.LJII().LJJIJ().size();
        C951960asc.LIZJ();
        C214831195p c214831195pM0 = C915980Zwa.LJIIIZ().m0();
        if (c214831195pM0 == null) {
            C20441214yg.LJIIL("QuickCoHostStateNone", "triggerSearchingLayoutAndDispatch — interactSoloComponentManager() returned null, OnSearchStarted NOT dispatched (overlay will be broken)");
        } else {
            c214831195pM0.LIZ(new C960230b5x(enumC955210axrLIZ));
        }
    }

    public static boolean LJJIJIIJI(EnumC959750b5B enumC959750b5B) {
        if (enumC959750b5B != EnumC959750b5B.TYPE_AUTO_START_WHEN_END && enumC959750b5B != EnumC959750b5B.TYPE_AUTO_START_WHEN_USER_LEFT) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIJJLI(C950840aqo c950840aqo) {
        LJJIJL(EnumC959750b5B.TYPE_INVITEE_LIST_DIALOG, c950840aqo);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIL(EnumC959750b5B enumC959750b5B) {
        boolean zLIZIZ = C1152520g66.LIZIZ();
        if (C955010axX.LJIIJ || (LJJIJIIJI(enumC959750b5B) && zLIZIZ)) {
            LJJIJL(enumC959750b5B, null);
        } else {
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS84S0200000_15(this, new AwS416S0200000_15(this, enumC959750b5B, 77), 51));
        }
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJIIL(EnumC959750b5B enumC959750b5B, C950840aqo c950840aqo) {
        this.LIZ.LJII(EnumC958840b3i.QUICK_BATTLE);
        LJJIJL(enumC959750b5B, c950840aqo);
    }

    @Override // X.AbstractC959650b51, X.InterfaceC959610b4x
    public final void LJJ(EnumC959750b5B enumC959750b5B, C950840aqo c950840aqo) {
        this.LIZ.LJII(EnumC958840b3i.TEAM_PAIR);
        InterfaceC960010b5b interfaceC960010b5bLJJIIZ = LJJIIZ();
        if (interfaceC960010b5bLJJIIZ != null) {
            interfaceC960010b5bLJJIIZ.LJFF(enumC959750b5B, c950840aqo, (C11NJ) this.LIZLLL.getValue(), new AwS416S0200000_15(this, enumC959750b5B, 78), AFwS203S0000000_15.get$arr$(348));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(final X.EnumC959750b5B r37, final X.C950840aqo r38) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C959660b52.LJJIJL(X.0b5B, X.0aqo):void");
    }

    public C959660b52(EnumC958900b3o enumC958900b3o, InterfaceC959730b59 interfaceC959730b59, Object obj) {
        super(enumC958900b3o, interfaceC959730b59, obj);
    }

    public final void LJJIJIIJIL(int i, int i2, String str, String str2, String str3) {
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C958830b3h c958830b3hLIZ = C944440agU.LIZ();
        String sessionId = this.LIZ.getSessionId();
        long j = this.LIZ.c0().LJIIL;
        c958830b3hLIZ.getClass();
        c958830b3hLIZ.LJIIL(str, "popup_type", true);
        c958830b3hLIZ.LJIIL(str2, "popup_reason", true);
        c958830b3hLIZ.LJIIL(Integer.valueOf(i), "error_code", true);
        c958830b3hLIZ.LJIIL("server_error", "trigger_source", true);
        c958830b3hLIZ.LJIIL("", "source", true);
        c958830b3hLIZ.LJIIL("cohost", "participate_type", true);
        c958830b3hLIZ.LJIIL(Integer.valueOf(i2), "auto_match_request_scene", true);
        c958830b3hLIZ.LJIIL(str3, "click_action", true);
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "button_count", 1, true);
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "session_id", sessionId, true);
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "quick_linkmic_retry_times", Long.valueOf(j), true);
        c958830b3hLIZ.LJIJJLI("quick_invite_error_popup_click");
    }

    public final void LJJIJIL(int i, int i2, int i3, String str, String str2) {
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C958830b3h c958830b3hLIZ = C944440agU.LIZ();
        String sessionId = this.LIZ.getSessionId();
        long j = this.LIZ.c0().LJIIL;
        c958830b3hLIZ.getClass();
        c958830b3hLIZ.LJIIL(str, "popup_type", true);
        c958830b3hLIZ.LJIIL(str2, "popup_reason", true);
        c958830b3hLIZ.LJIIL(Integer.valueOf(i), "error_code", true);
        c958830b3hLIZ.LJIIL("server_error", "trigger_source", true);
        c958830b3hLIZ.LJIIL("", "source", true);
        c958830b3hLIZ.LJIIL("cohost", "participate_type", true);
        c958830b3hLIZ.LJIIL(Integer.valueOf(i3), "auto_match_request_scene", true);
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "button_count", Integer.valueOf(i2), true);
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "session_id", sessionId, true);
        AbstractC962030b8r.LJIIJ(c958830b3hLIZ.LIZLLL, "quick_linkmic_retry_times", Long.valueOf(j), true);
        c958830b3hLIZ.LJIJJLI("quick_invite_error_popup_show");
    }
}

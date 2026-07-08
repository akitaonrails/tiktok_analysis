package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorWsSwtich;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773500UVw implements InterfaceC774620Ua4, InterfaceC1141530foN {
    public volatile boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(518));

    @Override // X.InterfaceC774620Ua4
    public final void LLLLZLLLI() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZ(String str, String str2, Map<String, ? extends Object> map, C0U8C c0u8c) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZI(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZL(Fragment fragment, DataChannel dataChannel) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZ(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLZIL() {
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLZ() {
        C774640Ua6 c774640Ua6 = C774640Ua6.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBroadcastEndPageDestroy: ");
        LiveAnchorWsSwtich liveAnchorWsSwtich = LiveAnchorWsSwtich.INSTANCE;
        sbLIZ.append(liveAnchorWsSwtich.enable());
        C774640Ua6.LIZ("FullBroadcastLife", C2188811AlT.LIZIZ(sbLIZ));
        if (liveAnchorWsSwtich.enable()) {
            if (this.LL) {
                this.LL = false;
                C0UC2 liveHostWsManager = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager();
                Object value = this.LLILLJJLI.getValue();
                liveHostWsManager.getClass();
                CopyOnWriteArrayList<InterfaceC1143270frB> copyOnWriteArrayList = C1528270ps9.LLILZ;
                if (copyOnWriteArrayList.contains(value)) {
                    copyOnWriteArrayList.remove(value);
                }
            }
            C774640Ua6.LIZ("FullBroadcastLife", "unregister EventCenter: register_ws_callback");
            C1548820qPI.LJIIIIZZ("register_ws_callback", this);
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final EnumC773520UVy LLZ() {
        return EnumC773520UVy.FULL_LIFE_CYCLE;
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZIL(boolean z) {
        C774640Ua6 c774640Ua6 = C774640Ua6.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClosePreview exp:");
        LiveAnchorWsSwtich liveAnchorWsSwtich = LiveAnchorWsSwtich.INSTANCE;
        sbLIZ.append(liveAnchorWsSwtich.enable());
        sbLIZ.append(" willEnter: ");
        sbLIZ.append(z);
        C774640Ua6.LIZ("FullBroadcastLife", C2188811AlT.LIZIZ(sbLIZ));
        if (liveAnchorWsSwtich.enable() && !z) {
            if (this.LL) {
                this.LL = false;
                C0UC2 liveHostWsManager = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager();
                Object value = this.LLILLJJLI.getValue();
                liveHostWsManager.getClass();
                CopyOnWriteArrayList<InterfaceC1143270frB> copyOnWriteArrayList = C1528270ps9.LLILZ;
                if (copyOnWriteArrayList.contains(value)) {
                    copyOnWriteArrayList.remove(value);
                }
            }
            C774640Ua6.LIZ("FullBroadcastLife", "unregister EventCenter: register_ws_callback");
            C1548820qPI.LJIIIIZZ("register_ws_callback", this);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        int i;
        if (Intrinsics.LJFF(c262100zr.LIZ, "register_ws_callback")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            int i2 = -1;
            if (interfaceC1107590evd != null) {
                i = interfaceC1107590evd.getInt("service_id");
            } else {
                i = -1;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                i2 = interfaceC1107590evd2.getInt("method_id");
            }
            C774640Ua6 c774640Ua6 = C774640Ua6.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register Callback service: ");
            sbLIZ.append(i);
            sbLIZ.append(", method: ");
            sbLIZ.append(i2);
            C774640Ua6.LIZ("FullBroadcastLife", C2188811AlT.LIZIZ(sbLIZ));
            ((C1528270ps9) ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager()).LIZJ();
            this.LL = true;
            C0UC2 liveHostWsManager = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager();
            List<C773510UVx> listSingletonList = Collections.singletonList(new C773510UVx(i, i2));
            Object value = this.LLILLJJLI.getValue();
            liveHostWsManager.getClass();
            CopyOnWriteArrayList<InterfaceC1143270frB> copyOnWriteArrayList = C1528270ps9.LLILZ;
            if (!copyOnWriteArrayList.contains(value)) {
                copyOnWriteArrayList.add((InterfaceC1143270frB) value);
                for (C773510UVx c773510UVx : listSingletonList) {
                    Set<C773510UVx> set = C1528270ps9.LLILZIL;
                    if (!set.contains(c773510UVx)) {
                        set.add(c773510UVx);
                        C2203431BLp.LIZIZ.LJI(c773510UVx.LIZ, c773510UVx.LIZIZ, C1528270ps9.LLJIJIL);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIIL(Fragment fragment, DataChannel dataChannel) {
        C774640Ua6 c774640Ua6 = C774640Ua6.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterPreview: ");
        LiveAnchorWsSwtich liveAnchorWsSwtich = LiveAnchorWsSwtich.INSTANCE;
        sbLIZ.append(liveAnchorWsSwtich.enable());
        C774640Ua6.LIZ("FullBroadcastLife", C2188811AlT.LIZIZ(sbLIZ));
        if (liveAnchorWsSwtich.enable()) {
            if (this.LL) {
                this.LL = false;
                C0UC2 liveHostWsManager = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager();
                Object value = this.LLILLJJLI.getValue();
                liveHostWsManager.getClass();
                CopyOnWriteArrayList<InterfaceC1143270frB> copyOnWriteArrayList = C1528270ps9.LLILZ;
                if (copyOnWriteArrayList.contains(value)) {
                    copyOnWriteArrayList.remove(value);
                }
            }
            C774640Ua6.LIZ("FullBroadcastLife", "register EventCenter: register_ws_callback");
            C1548820qPI.LIZLLL("register_ws_callback", this);
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLL(Fragment fragment, DataChannel dataChannel) {
        C774640Ua6 c774640Ua6 = C774640Ua6.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBroadcastEndPageShow: ");
        sbLIZ.append(LiveAnchorWsSwtich.INSTANCE.enable());
        C774640Ua6.LIZ("FullBroadcastLife", C2188811AlT.LIZIZ(sbLIZ));
    }
}

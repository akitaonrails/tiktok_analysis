package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0peJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519690peJ implements InterfaceC1526670ppZ, C0XEZ, InterfaceC486470J5x {
    public final C1519750peP LL;
    public volatile InterfaceC1519710peL LLILLJJLI;

    @Override // X.InterfaceC1526670ppZ
    public final int getChannelId() {
        return 1239108;
    }

    @Override // X.InterfaceC1526670ppZ
    public final void LIZLLL() {
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LIZLLL(this);
        this.LL.getClass();
        c2203431BLp.LJI(20032, 1, this);
    }

    @Override // X.InterfaceC1526670ppZ
    public final boolean isConnected() {
        return C2203431BLp.LIZIZ.isConnected();
    }

    public C1519690peJ(C1519750peP c1519750peP) {
        this.LL = c1519750peP;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        InterfaceC1519710peL interfaceC1519710peL = this.LLILLJJLI;
        if (interfaceC1519710peL != null) {
            interfaceC1519710peL.LIZ(wsChannelMsg);
        }
    }

    @Override // X.InterfaceC1526670ppZ
    public final void LIZJ(WsChannelMsg wsChannelMsg) {
        C2203431BLp.LIZIZ.LIZ(wsChannelMsg);
    }

    @Override // X.InterfaceC1526670ppZ
    public final void LJ(C1526610ppT c1526610ppT) {
        this.LLILLJJLI = c1526610ppT;
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        InterfaceC1519710peL interfaceC1519710peL = this.LLILLJJLI;
        if (interfaceC1519710peL != null) {
            interfaceC1519710peL.LJI(c821280WJq);
        }
    }
}

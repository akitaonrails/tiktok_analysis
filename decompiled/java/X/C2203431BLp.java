package X;

import android.app.Application;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.websocket.api.service.IWsServiceProvider;
import java.util.Map;

/* JADX INFO: renamed from: X.1BLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203431BLp implements InterfaceC2203441BLq {
    public static final C2203431BLp LIZIZ = new C2203431BLp();
    public final /* synthetic */ InterfaceC2203441BLq LIZ = ((IWsServiceProvider) ServiceManager.get().getService(IWsServiceProvider.class)).LIZ();

    @Override // X.InterfaceC2203441BLq
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        this.LIZ.LIZ(wsChannelMsg);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ(str);
    }

    @Override // X.InterfaceC2203441BLq
    public final String LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC2203441BLq
    public final void LIZLLL(C0XEZ c0xez) {
        this.LIZ.LIZLLL(c0xez);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJ(String str) {
        this.LIZ.LJ(str);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJFF(String str) {
        this.LIZ.LJFF(str);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJI(int i, int i2, InterfaceC486470J5x interfaceC486470J5x) {
        this.LIZ.LJI(i, i2, interfaceC486470J5x);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJII(int i, int i2) {
        this.LIZ.LJII(i, i2);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIIIZZ(long j, long j2, int i, int i2, byte[] bArr, String str, String str2, Map<String, String> map) {
        this.LIZ.LJIIIIZZ(j, j2, i, i2, bArr, str, str2, map);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIIZ(InterfaceC486470J5x interfaceC486470J5x) {
        this.LIZ.LJIIIZ(interfaceC486470J5x);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIJ(Application application) {
        this.LIZ.LJIIJ(application);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIJJI(C0XEZ c0xez) {
        this.LIZ.LJIIJJI(c0xez);
    }

    @Override // X.InterfaceC2203441BLq
    public final C0XE1 getState() {
        return this.LIZ.getState();
    }

    @Override // X.InterfaceC2203441BLq
    public final boolean isConnected() {
        return this.LIZ.isConnected();
    }
}

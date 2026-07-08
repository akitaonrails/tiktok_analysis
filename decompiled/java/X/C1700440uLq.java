package X;

import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.performance.degrade.PullStreamDownOptSetting;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700440uLq extends C1700460uLs implements InterfaceC1698710uJ3 {
    @Override // X.InterfaceC1698710uJ3
    public final /* synthetic */ void LIZIZ(int i) {
    }

    @Override // X.InterfaceC1698710uJ3
    public final /* synthetic */ void LIZLLL(int i) {
    }

    @Override // X.InterfaceC1698710uJ3
    public final /* synthetic */ void LJ(int i) {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIJIL() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJJL() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJLI() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJLL() {
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJI() {
        LIZ(EnumC1700470uLt.BUFFERING_END, 0, "player end buffer");
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJIIJ() {
        LIZ(EnumC1700470uLt.BUFFERING_START, 0, "player start buffer");
    }

    @Override // X.InterfaceC1698710uJ3
    public final void onCompletion() {
        LIZ(EnumC1700470uLt.PLAY_COMPLETED, 0, "play complete");
    }

    @Override // X.InterfaceC1698710uJ3
    public final void onPrepared() {
        LIZ(EnumC1700470uLt.PREPARED, 0, "player is prepared");
    }

    public C1700440uLq(InterfaceC1491060ou8 interfaceC1491060ou8) {
        super(interfaceC1491060ou8);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJIILJJIL(String str) {
        LIZ(EnumC1700470uLt.RESOLUTION_DEGRADE, 0, str);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJIJI(boolean z) {
        LJFF(z);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIII(String str) {
        LIZ(EnumC1700470uLt.ABR_NEW_RESOLUTION, 0, str);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIJLIJ(Surface surface) {
        LJIIIIZZ(surface);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJ(C1281010jRL c1281010jRL) {
        C1700410uLn c1700410uLn = this.LL;
        if (c1700410uLn != null) {
            c1700410uLn.LJIILJJIL(EnumC1700470uLt.NETWORK_STATE_CHANGED, 0, c1281010jRL);
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJJJ(String str) {
        PullStreamDownOptSetting pullStreamDownOptSetting = PullStreamDownOptSetting.INSTANCE;
        if (!pullStreamDownOptSetting.isDowngradeALog() && !pullStreamDownOptSetting.isDowngradeAll()) {
            C20441214yg.LIZIZ("TTLivePlayerReportALog", str);
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJLIIL(JSONObject jSONObject) {
        C1700410uLn c1700410uLn = this.LL;
        if (c1700410uLn != null) {
            c1700410uLn.LJIILJJIL(EnumC1700470uLt.SEI_UPDATE, 0, jSONObject);
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJJLL(C1284740jXM c1284740jXM) {
        if (c1284740jXM != null) {
            LIZJ(c1284740jXM.code, c1284740jXM.playForbidden, c1284740jXM.info);
        }
    }

    @Override // X.InterfaceC1698710uJ3
    public final void LJJIJ(String str, JSONObject jSONObject) {
        LJII(str, jSONObject);
    }

    @Override // X.InterfaceC1698710uJ3
    public final void onVideoSizeChanged(int i, int i2) {
        LJIIIZ(i, i2);
    }
}

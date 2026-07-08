package X;

import android.app.Dialog;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TSC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("store_region_changed_popup")
public final class C0TSC extends AbstractC20660015ss<Dialog> {
    public final C19EG LL;
    public final int LLILLJJLI = 115;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLJJLI;
    }

    public C0TSC(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C2344809Gs.LJ("StoreRegionChangedPopTask");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "show");
        C20684815ws.LJIILLIIL("relaunch_app_prompt_page", c2344009Gk.LIZ);
        C19EG c19eg = this.LL;
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131828616));
        c1397580mTM.LIZIZ(this.LL.getString(2131828615));
        C1238130iKB.LIZ(c1397580mTM, new AwS591S0100000_12(this, 1226));
        c1397580mTM.LJII = false;
        return new C1397510mTF(c1397580mTM).LJ();
    }
}

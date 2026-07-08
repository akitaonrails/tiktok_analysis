package X;

import android.app.Dialog;

/* JADX INFO: renamed from: X.0XT0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20647615qs("relaunch_popup")
public final class C0XT0 extends AbstractC20660015ss<Dialog> {
    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        return new C688120Qyw(null, null, null);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C2344809Gs.LJ("RelaunchPopTask");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        c2344009Gk.LJFF("enter_from", null);
        C20684815ws.LJIILLIIL("show_relaunch_app_popup", c2344009Gk.LIZ);
        throw null;
    }
}

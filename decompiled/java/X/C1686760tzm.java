package X;

import android.app.Activity;
import android.app.Dialog;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686760tzm implements InterfaceC1621460sIS {
    public final Activity LIZ;
    public final String LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 665));

    @Override // X.InterfaceC1621460sIS
    public final void A4() {
    }

    @Override // X.InterfaceC1621460sIS
    public final void hide() {
    }

    @Override // X.InterfaceC1621460sIS
    public final void show() {
    }

    @Override // X.InterfaceC1621460sIS
    public final void B4() {
        if (this.LIZ.isFinishing() || this.LIZ.isDestroyed() || ((Dialog) this.LIZLLL.getValue()).isShowing()) {
            return;
        }
        Dialog dialog = (Dialog) this.LIZLLL.getValue();
        dialog.show();
        C785410UrT.LIZIZ(dialog);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialog);
        C816490W1f.LIZ(dialog);
        dialog.setCancelable(false);
    }

    @Override // X.InterfaceC1621460sIS
    public final void z4() {
        if (this.LIZ.isFinishing() || this.LIZ.isDestroyed() || !((Dialog) this.LIZLLL.getValue()).isShowing()) {
            return;
        }
        Dialog dialog = (Dialog) this.LIZLLL.getValue();
        dialog.dismiss();
        C785410UrT.LIZ(dialog);
    }

    public C1686760tzm(C19EG c19eg, String str, AwS569S0100000_25 awS569S0100000_25) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = awS569S0100000_25;
    }
}

package X;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TSH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("deeplink_share_popup")
public final class C0TSH extends AbstractC20660015ss<Dialog> {
    public final C19EG LL;
    public final Dialog LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final int LLILZ = 1;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C786410Ut5.B4(this.LLILLJJLI);
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        return this.LLILLJJLI;
    }

    public C0TSH(C19EG c19eg, Dialog dialog, Function0<Unit> function0) {
        this.LL = c19eg;
        this.LLILLJJLI = dialog;
        this.LLILLL = function0;
    }
}

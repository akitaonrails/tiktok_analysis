package X;

import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0roN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20647615qs("global_top_moving_reminder")
public final class C1602810roN extends AbstractC20660015ss<PopupWindow> {
    public final C19EG LL;
    public final C1602830roP LLILLJJLI;
    public final InterfaceC1602790roL LLILLL;
    public final Function0<Unit> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1479));
    public final int LLILZLL = 2000;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            return new C688120Qyw(c19eg, c19eg, null);
        }
        return null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    @Override // com.bytedance.poplayer.IPopupTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showPopup(X.C688120Qyw r28) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1602810roN.showPopup(X.0Qyw):java.lang.Object");
    }

    public C1602810roN(C19EG c19eg, C1602830roP c1602830roP, InterfaceC1602790roL interfaceC1602790roL, AwS568S0100000_24 awS568S0100000_24) {
        this.LL = c19eg;
        this.LLILLJJLI = c1602830roP;
        this.LLILLL = interfaceC1602790roL;
        this.LLILZ = awS568S0100000_24;
    }
}

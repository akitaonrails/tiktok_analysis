package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC20647615qs("video_link")
public final class C686810Qwp extends C10GR {
    public final C19EG LL;
    public final Function0<Unit> LLILLJJLI;
    public final int LLILLL = 1;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public C686810Qwp(C19EG c19eg, Function0 function0) {
        this.LL = c19eg;
        this.LLILLJJLI = function0;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        this.LLILLJJLI.invoke();
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0m6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@InterfaceC20647615qs("upload_success_popup")
public final class C1383390m6T extends C10GR {
    public final C19EG LL;
    public final Function0<Unit> LLILLJJLI;
    public final int LLILLL;

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
        return this.LLILLL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        this.LLILLJJLI.invoke();
    }

    public C1383390m6T(C19EG c19eg, int i, Function0 function0) {
        this.LL = c19eg;
        this.LLILLJJLI = function0;
        this.LLILLL = i;
    }
}

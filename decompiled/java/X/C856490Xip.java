package X;

import kotlin.Unit;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Xip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856490Xip extends AbstractC857240Xk2<Unit> {
    public final String LLILZ = EnumC856470Xin.COMMERCE_CHECK.getValue().getSecond();
    public final /* synthetic */ C20508115Mp LLILZIL;

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return this.LLILZ;
    }

    public C856490Xip(C20508115Mp c20508115Mp) {
        this.LLILZIL = c20508115Mp;
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        c857220Xk0.LIZIZ(this);
        C20508115Mp c20508115Mp = this.LLILZIL;
        AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(c857220Xk0, this, 2);
        AwS415S0200000_14 awS415S0200000_142 = new AwS415S0200000_14(c857220Xk0, this, 3);
        c20508115Mp.getClass();
        C856500Xiq c856500Xiq = new C856500Xiq(awS415S0200000_14, awS415S0200000_142);
        c856500Xiq.LIZ(new AwS593S0100000_14(c20508115Mp, 2));
        c856500Xiq.LIZ(new AwS593S0100000_14(c20508115Mp, 3));
        c856500Xiq.LIZ(new AwS593S0100000_14(c20508115Mp, 4));
        c856500Xiq.LIZ(new AwS593S0100000_14(c856500Xiq, 198));
        C856510Xir c856510Xir = c856500Xiq.LIZJ;
        if (c856510Xir != null) {
            c856510Xir.LIZLLL();
        }
    }
}

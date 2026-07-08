package X;

import Y.AfS172S0100000_3;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0afI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943700afI implements InterfaceC944070aft {
    public C11JF LIZ;

    public final boolean LIZIZ() {
        C11JF c11jf = this.LIZ;
        if (c11jf == null) {
            return true;
        }
        return c11jf.isDisposed();
    }

    @Override // X.InterfaceC944070aft
    public final void stop() {
        C500260Jjc.LJJLIIIJLJLI(this.LIZ);
    }

    @Override // X.InterfaceC944070aft
    public final void LIZ(long j, AwS594S0100000_15 awS594S0100000_15, AFwS250S0000000_15 aFwS250S0000000_15, AwS559S0100000_15 awS559S0100000_15) {
        C500260Jjc.LJJLIIIJLJLI(this.LIZ);
        this.LIZ = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(j).LJJJJZI(new C517101zt(j, 1)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C516201zk(awS594S0100000_15, 15), new AfS172S0100000_3((Object) aFwS250S0000000_15, 1), new C987100bnI(awS559S0100000_15, 2));
    }
}

package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS91S0210000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579420Mo0 extends AbstractC1622390sJx implements InterfaceC1623110sL7 {
    public final Function1<Boolean, Unit> LLILLJJLI;
    public C1627370sRz LLILLL;

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return true;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
    }

    public C579420Mo0(AwS587S0100000_8 awS587S0100000_8) {
        this.LLILLJJLI = awS587S0100000_8;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJIL(C1627370sRz c1627370sRz) {
        Bundle bundle;
        C1627370sRz c1627370sRz2 = this.LLILLL;
        Effect effect = c1627370sRz.LIZ;
        boolean zLIZLLL = C1624200sMs.LIZLLL(effect);
        boolean z = false;
        if (zLIZLLL && (bundle = c1627370sRz.LJ) != null && bundle.getBoolean("FROM_AIGC_RESET_FLOW")) {
            z = true;
        }
        AwS91S0210000_8 awS91S0210000_8 = new AwS91S0210000_8(zLIZLLL, effect, c1627370sRz, 8);
        if (!z && !((Boolean) awS91S0210000_8.invoke()).booleanValue()) {
            if (c1627370sRz2 != null && !Intrinsics.LJFF(c1627370sRz2.LIZ, effect)) {
                this.LLILLL = null;
                this.LLILLJJLI.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        this.LLILLL = c1627370sRz;
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        boolean z = true;
        if (i2 != 9 ? i2 != 4 : i3 != 3) {
            z = false;
        }
        if (i != 17 || !z || this.LLILLL == null) {
            return;
        }
        this.LLILLJJLI.invoke(Boolean.TRUE);
        this.LLILLL = null;
    }
}

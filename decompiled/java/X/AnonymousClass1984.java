package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1984, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1984 implements InterfaceC194555119t, InterfaceC379610EuV {
    public final Effect LL;
    public final C1DRG LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public C1637820siq LLILZ;
    public C1637820siq LLILZIL;

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        C1637820siq c1637820siq = this.LLILZ;
        if (c1637820siq != null && c1637820siq.LLIZLLLIL) {
            return true;
        }
        C1637820siq c1637820siq2 = this.LLILZIL;
        return c1637820siq2 != null && c1637820siq2.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        C1637820siq c1637820siq;
        Effect effect = this.LL;
        if (effect != null && frameLayout != null) {
            if (this.LLILZIL == null && C1624570sNT.LJIILL(effect)) {
                if (C1624200sMs.LJIIIIZZ(this.LL)) {
                    c1637820siq = new C1637820siq(this.LL, this.LLILLJJLI, 0, AFwS223S0000000_32.get$arr$(114), new AwS611S0100000_32(this, 182));
                } else {
                    c1637820siq = new C1637820siq(this.LL, this.LLILLJJLI, 0, new AwS576S0100000_32(this, 357), AFwS278S0000000_32.get$arr$(99));
                }
                this.LLILZIL = c1637820siq;
            }
            if (this.LLILZ == null && C1624570sNT.LJJ(this.LL)) {
                this.LLILZ = new C1637820siq(this.LL, this.LLILLJJLI, 1, AFwS223S0000000_32.get$arr$(115), new AwS611S0100000_32(this, 183));
            }
            C1637820siq c1637820siq2 = this.LLILZ;
            if (c1637820siq2 != null) {
                c1637820siq2.LIZ(frameLayout);
            }
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        if (this.LL == null) {
            return;
        }
        C1637820siq c1637820siq = this.LLILZ;
        if (c1637820siq != null) {
            c1637820siq.LJJJJLL(z);
        }
        C1637820siq c1637820siq2 = this.LLILZIL;
        if (c1637820siq2 != null) {
            c1637820siq2.LJJJJLL(z);
        }
    }

    public AnonymousClass1984(Effect effect, C1DRG c1drg, AwS576S0100000_32 awS576S0100000_32) {
        this.LL = effect;
        this.LLILLJJLI = c1drg;
        this.LLILLL = awS576S0100000_32;
    }
}

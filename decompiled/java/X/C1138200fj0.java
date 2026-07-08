package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayStuckRecoverySetting;

/* JADX INFO: renamed from: X.0fj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138200fj0 extends AbstractC1138110fir {
    @Override // X.AbstractC1138110fir
    public final String LIZ() {
        return "ComboingState";
    }

    @Override // X.AbstractC1138110fir
    public final void LIZJ() {
        C1138090fip c1138090fip = this.LIZ;
        c1138090fip.LIZ.LIZ();
        if (!c1138090fip.LIZ.LJIIIIZZ()) {
            c1138090fip.LIZIZ(new C1138240fj4(this.LIZ));
            c1138090fip.LIZIZ.LIZ(c1138090fip.LJFF);
            return;
        }
        LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip.LIZ.getLifecycleCoroutineScope();
        if (lifecycleCoroutineScope == null) {
            LJI("scope_null:ComboingState.toReshow");
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138190fiz(c1138090fip, this, null), 2);
        }
    }

    public C1138200fj0(C1138090fip c1138090fip) {
        super(c1138090fip);
    }

    @Override // X.AbstractC1138110fir
    public final void LIZLLL(C1135810ff9 c1135810ff9) {
        LJII("ComboingState.onCombo");
    }

    @Override // X.AbstractC1138110fir
    public final void LJ(C1135810ff9 c1135810ff9) {
        LJII("ComboingState.onEnter");
    }

    @Override // X.AbstractC1138110fir
    public final void LJFF(C1135810ff9 c1135810ff9) {
        LJII("ComboingState.onExit");
        if (LiveGiftTrayStuckRecoverySetting.INSTANCE.exitOnAllState()) {
            LIZIZ("ComboingState.onExit", c1135810ff9, true);
        }
    }
}

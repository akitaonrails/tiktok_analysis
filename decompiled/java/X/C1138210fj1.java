package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayStuckRecoverySetting;

/* JADX INFO: renamed from: X.0fj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138210fj1 extends AbstractC1138110fir {
    @Override // X.AbstractC1138110fir
    public final String LIZ() {
        return "EnteringState";
    }

    @Override // X.AbstractC1138110fir
    public final void LIZJ() {
        C1138090fip c1138090fip = this.LIZ;
        c1138090fip.LIZIZ.LJ(c1138090fip.LJFF);
        c1138090fip.LIZ.LJI();
        LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip.LIZ.getLifecycleCoroutineScope();
        if (lifecycleCoroutineScope == null) {
            LJI("scope_null:EnteringState.toPostEnter");
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138180fiy(c1138090fip, this, null), 2);
        }
    }

    public C1138210fj1(C1138090fip c1138090fip) {
        super(c1138090fip);
    }

    @Override // X.AbstractC1138110fir
    public final void LIZLLL(C1135810ff9 c1135810ff9) {
        LJII("EnteringState.onCombo");
    }

    @Override // X.AbstractC1138110fir
    public final void LJ(C1135810ff9 c1135810ff9) {
        LJII("EnteringState.onEnter");
    }

    @Override // X.AbstractC1138110fir
    public final void LJFF(C1135810ff9 c1135810ff9) {
        LJII("EnteringState.onExit");
        if (LiveGiftTrayStuckRecoverySetting.INSTANCE.exitOnAllState()) {
            LIZIZ("EnteringState.onExit", c1135810ff9, true);
        }
    }
}

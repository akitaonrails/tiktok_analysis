package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;

/* JADX INFO: renamed from: X.14fS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20322014fS implements InterfaceC1655020tAa {
    @Override // X.InterfaceC1655020tAa
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        OpenLivePreparationTask.LIZ.LIZIZ(lifecycleOwner);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C446301oT(null), 2);
    }

    @Override // X.InterfaceC1655020tAa
    public final C782920UnS LIZIZ(final C1655030tAb c1655030tAb, C1DRG c1drg) {
        return new C782920UnS(new InterfaceC775460UbQ() { // from class: X.14fT
            @Override // X.InterfaceC775460UbQ
            public final void LJIIJ() {
                c1655030tAb.LJIIJ();
            }

            @Override // X.InterfaceC775460UbQ
            public final void LJIILIIL() {
                c1655030tAb.LJIILIIL();
            }

            @Override // X.InterfaceC775460UbQ
            public final void hideBottomTab() {
                c1655030tAb.hideBottomTab();
            }

            @Override // X.InterfaceC775460UbQ
            public final void showBottomTab() {
                c1655030tAb.showBottomTab();
            }
        }, true, c1drg);
    }
}

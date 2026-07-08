package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368850lj1 implements InterfaceC1368960ljC {
    public final List<InterfaceC1368960ljC> LL;

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    @Override // X.InterfaceC1368960ljC
    public final void onDestroy() {
        LIZ(AFwS259S0000000_21.get$arr$(18));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onStart() {
        LIZ(AFwS259S0000000_21.get$arr$(19));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onStop() {
        LIZ(AFwS259S0000000_21.get$arr$(20));
    }

    public C1368850lj1(final C1368870lj3 c1368870lj3) {
        this.LL = C1697810uHb.LJIILJJIL(new C1368710lin(c1368870lj3), new C1368800liw(c1368870lj3), new C1368810lix(c1368870lj3), new C1368340liC(c1368870lj3), new C1368330liB(c1368870lj3), new AbstractC1368920lj8(c1368870lj3) { // from class: X.0lj0
            public ShakeEggVM LLJIJIL;

            @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
            public final void onDestroy() {
                ShakeEggVM shakeEggVM = this.LLJIJIL;
                if (shakeEggVM == null || !shakeEggVM.LLILLJJLI) {
                    return;
                }
                shakeEggVM.LLIZLLLIL.setValue("shake_more_contact");
            }

            @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
            public final void onCreate(Bundle bundle) {
                C19EG c19eg = (C19EG) this.LLILZIL.getValue();
                if (c19eg != null) {
                    this.LLJIJIL = C1074310e3x.LIZ(c19eg);
                }
            }

            @Override // X.InterfaceC1368960ljC
            public final void onViewCreated(View view, Bundle bundle) {
                this.LLIZ = view;
                ShakeEggVM shakeEggVM = this.LLJIJIL;
                if (shakeEggVM != null && shakeEggVM.LLILLJJLI) {
                    shakeEggVM.LLIZ.setValue("shake_more_contact");
                }
            }
        }, new C1368930lj9(c1368870lj3), new AbstractC1368920lj8(c1368870lj3) { // from class: X.0lie
            @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
            public final void onDestroy() {
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }

            @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
            public final void onStart() {
                Dialog dialogLIZ;
                InterfaceC1368680lik interfaceC1368680lik;
                InterfaceC1368360liE interfaceC1368360liE = LIZJ().LJI;
                if (interfaceC1368360liE == null || (dialogLIZ = interfaceC1368360liE.LIZ()) == null || (interfaceC1368680lik = LIZJ().LJII) == null) {
                    return;
                }
                interfaceC1368680lik.LJII(dialogLIZ, LIZJ().LIZ);
            }

            @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
            public final void onStop() {
                Dialog dialogLIZ;
                InterfaceC1368680lik interfaceC1368680lik;
                InterfaceC1368360liE interfaceC1368360liE = LIZJ().LJI;
                if (interfaceC1368360liE == null || (dialogLIZ = interfaceC1368360liE.LIZ()) == null || (interfaceC1368680lik = LIZJ().LJII) == null) {
                    return;
                }
                interfaceC1368680lik.LIZJ(dialogLIZ, LIZJ().LIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
            @Override // X.InterfaceC1368960ljC
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1368620lie.onViewCreated(android.view.View, android.os.Bundle):void");
            }
        });
    }

    @Override // X.InterfaceC1368960ljC
    public final void E3(SharePackage sharePackage) {
        LIZ(new AwS600S0100000_21(sharePackage, 18));
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
        LIZ(new AwS34S0010000_21(z, 0));
    }

    public final void LIZ(Function1<? super InterfaceC1368960ljC, Unit> function1) {
        Iterator<InterfaceC1368960ljC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        LIZ(new AwS34S0010000_21(z, 2));
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
        LIZ(new AwS34S0010000_21(z, 3));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onCreate(Bundle bundle) {
        LIZ(new AwS600S0100000_21(bundle, 17));
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
        LIZ(new AwS34S0010000_21(z, 1));
    }

    @Override // X.InterfaceC1368960ljC
    public final void onViewCreated(View view, Bundle bundle) {
        LIZ(new AwS387S0200000_21(view, bundle, 4));
    }
}

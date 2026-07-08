package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVaultBoostingCardSettings;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127590fRt implements InterfaceC1127800fSE {
    public final Context LL;
    public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.VAULT_GLOVES;
    public final C01GW LLILLL;

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view, C1124680fNC c1124680fNC) {
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final C0T8B LJ() {
        return (C1124780fNM) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        if (LiveMatchVaultBoostingCardSettings.INSTANCE.getValue() && C1127720fS6.LIZ(c1124680fNC.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1127590fRt(Context context, View view) {
        this.LL = context;
        this.LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 546));
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        ((C1124780fNM) this.LLILLL.getValue()).u0();
        C786410Ut5.D8((C1124780fNM) this.LLILLL.getValue(), new ACListenerS152S0100000_17(this, 162));
        C1127720fS6.LIZIZ(true);
        return (View) this.LLILLL.getValue();
    }
}

package X;

import android.view.View;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127620fRw implements InterfaceC1127800fSE {
    public final View LL;
    public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.FIRST_RECHARGE_BACKPACK;
    public final C01GW LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(this, 539));

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
        return (C1124540fMy) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLJJLI;
    }

    public C1127620fRw(View view) {
        this.LL = view;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        return c1124680fNC.LIZIZ instanceof C1127930fSR;
    }

    @Override // X.InterfaceC1127800fSE
    public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
        Text text;
        C1127930fSR c1127930fSR = (C1127930fSR) c1124680fNC.LIZIZ;
        C1124540fMy c1124540fMy = (C1124540fMy) this.LLILLL.getValue();
        GiftPanelBanner giftPanelBanner = c1127930fSR.LJJIFFI.LJIIIZ;
        if (giftPanelBanner != null) {
            text = giftPanelBanner.displayText;
        } else {
            text = null;
        }
        c1124540fMy.LIZIZ(text);
        return (View) this.LLILLL.getValue();
    }
}

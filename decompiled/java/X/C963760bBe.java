package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.0bBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963760bBe extends AbstractC960410b6F<C955590ayT, C1E2S> {
    public final InterfaceC956060azE LIZIZ;
    public final InterfaceC956210azT LIZJ;
    public final DataChannel LIZLLL;

    @Override // X.AbstractC960410b6F
    public final String LJIIIZ() {
        return "NudgeCoHostListUserViewBinder";
    }

    @Override // X.AbstractC960410b6F
    public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gst, viewGroup, false);
        C1E2U<C955590ayT> c1e2u = new C1E2U<C955590ayT>(viewTd) { // from class: X.1E2S
            public final C01GW LLL;
            public final C01GW LLLF;
            public final C01GW LLLFF;
            public final C01GW LLLFFI;
            public final C01GW LLLFZ;
            public final C01GW LLLI;
            public final C01GW LLLII;
            public final C01GW LLLIIII;
            public final C01GW LLLIIIIL;
            public final C01GW LLLIIIL;
            public final C01GW LLLIIL;
            public final C01GW LLLIILIL;
            public final C01GW LLLIL;
            public final C01GW LLLILZ;

            @Override // X.InterfaceC962290b9H
            public final TextView E2(boolean z) {
                return null;
            }

            @Override // X.C1E2U, X.InterfaceC962290b9H
            public final /* bridge */ /* synthetic */ ImageView N0() {
                return null;
            }

            @Override // X.InterfaceC962290b9H
            public final ViewGroup f(boolean z) {
                return null;
            }

            @Override // X.AbstractC960400b6E
            public final String getName() {
                return "NudgeViewHolder";
            }

            @Override // X.C1E2U, X.InterfaceC962270b9F, X.InterfaceC955990az7, X.InterfaceC956220azU
            public final C16FS LJI() {
                return (C16FS) this.LLLII.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final C498540Jgq LL() {
                return (C498540Jgq) this.LLLI.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final TextView LLJJIJIIJIL() {
                return (TextView) this.LLLIIII.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final C498540Jgq LLJJJJJIL() {
                return (C498540Jgq) this.LLLFZ.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final C498540Jgq LLJLIL() {
                return (C498540Jgq) this.LLLFFI.getValue();
            }

            @Override // X.InterfaceC955990az7
            public final InterfaceC956210azT g4() {
                return this.LLLILZJ.LIZJ;
            }

            @Override // X.InterfaceC956600b06
            public final DataChannel getDataChannel() {
                return this.LLLILZJ.LIZLLL;
            }

            @Override // X.C1E2U, X.InterfaceC962290b9H
            public final TextView p4() {
                return (TextView) this.LLLIILIL.getValue();
            }

            @Override // X.InterfaceC955990az7
            public final InterfaceC956060azE t5() {
                return this.LLLILZJ.LIZIZ;
            }

            @Override // X.AbstractC960400b6E
            public final void onViewDetachedFromWindow() {
                super.onViewDetachedFromWindow();
                C955450ayF.LIZ.getClass();
                C962230b9B c962230b9B = C962230b9B.LIZJ;
                c962230b9B.LIZ = null;
                c962230b9B.LIZIZ = null;
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final TextView D3(boolean z) {
                return (TextView) this.LLLILZ.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final TextView LLIIL(boolean z) {
                return (TextView) this.LLLFF.getValue();
            }

            @Override // X.InterfaceC962270b9F
            public final ViewGroup LLJJJJ(boolean z) {
                return (ViewGroup) this.LLLIIIIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final ViewGroup LLLLIILLL(boolean z) {
                return (ViewGroup) this.LLLF.getValue();
            }

            @Override // X.InterfaceC962270b9F
            public final TextView O0(boolean z) {
                return (TextView) this.LLLIIIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final View S1(boolean z) {
                return (View) this.LLLIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final ViewGroup T1(boolean z) {
                return (ViewGroup) this.LLL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962290b9H
            public final ViewGroup r(boolean z) {
                return (ViewGroup) this.LLLIIL.getValue();
            }

            {
                super(viewTd);
                this.LLL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 342));
                this.LLLF = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 339));
                this.LLLFF = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 347));
                this.LLLFFI = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 343));
                this.LLLFZ = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 344));
                this.LLLI = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 345));
                this.LLLII = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 337));
                this.LLLIIII = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 346));
                this.LLLIIIIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 338));
                this.LLLIIIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 336));
                this.LLLIIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 340));
                this.LLLIILIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 341));
                EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
                this.LLLIL = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(viewTd, 348));
                this.LLLILZ = C452501pT.LIZ(enumC452301pR, new AwS579S0100000_35(viewTd, 349));
            }

            @Override // X.AbstractC960400b6E
            public final void I5(List list, int i, Object obj) {
                C955590ayT c955590ayT = (C955590ayT) obj;
                C955450ayF.LIZ.getClass();
                C955450ayF.LJ(this, c955590ayT);
                C962230b9B.LIZJ.LJ(this, c955590ayT, list);
            }
        };
        C962230b9B.LIZJ.getClass();
        return c1e2u;
    }

    public C963760bBe(InterfaceC956060azE interfaceC956060azE, InterfaceC956210azT interfaceC956210azT, DataChannel dataChannel) {
        this.LIZIZ = interfaceC956060azE;
        this.LIZJ = interfaceC956210azT;
        this.LIZLLL = dataChannel;
    }
}

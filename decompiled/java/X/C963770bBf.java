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

/* JADX INFO: renamed from: X.0bBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963770bBf extends AbstractC960410b6F<C955590ayT, C1E2T> {
    public final InterfaceC956060azE LIZIZ;
    public final InterfaceC956210azT LIZJ;
    public final DataChannel LIZLLL;

    @Override // X.AbstractC960410b6F
    public final String LJIIIZ() {
        return "InteractUserViewBinderForMultiCoHostEOY";
    }

    @Override // X.AbstractC960410b6F
    public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gre, viewGroup, false);
        C1E2U<C955590ayT> c1e2u = new C1E2U<C955590ayT>(viewTd) { // from class: X.1E2T
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
            public final C01GW LLLILZJ;

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final /* bridge */ /* synthetic */ ViewGroup L2(boolean z) {
                return null;
            }

            @Override // X.AbstractC960400b6E
            public final String getName() {
                return "InteractEOYViewHolder";
            }

            @Override // X.C1E2U, X.InterfaceC962270b9F, X.InterfaceC955990az7, X.InterfaceC956220azU
            public final C16FS LJI() {
                return (C16FS) this.LLLIIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final C498540Jgq LL() {
                return (C498540Jgq) this.LLLIIIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final TextView LLJJIJIIJIL() {
                return (TextView) this.LLLIILIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final C498540Jgq LLJJJJJIL() {
                return (C498540Jgq) this.LLLIIIIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final C498540Jgq LLJLIL() {
                return (C498540Jgq) this.LLLIIII.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962290b9H
            public final ImageView N0() {
                return (ImageView) this.LLLILZJ.getValue();
            }

            @Override // X.InterfaceC955990az7
            public final InterfaceC956210azT g4() {
                return this.LLLILZLLLI.LIZJ;
            }

            @Override // X.InterfaceC956600b06
            public final DataChannel getDataChannel() {
                return this.LLLILZLLLI.LIZLLL;
            }

            @Override // X.InterfaceC955990az7
            public final InterfaceC956060azE t5() {
                return this.LLLILZLLLI.LIZIZ;
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
                return (TextView) this.LLLF.getValue();
            }

            @Override // X.InterfaceC962290b9H
            public final TextView E2(boolean z) {
                return (TextView) this.LLLFFI.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final TextView LLIIL(boolean z) {
                return (TextView) this.LLLII.getValue();
            }

            @Override // X.InterfaceC962270b9F
            public final ViewGroup LLJJJJ(boolean z) {
                return (ViewGroup) this.LLLIL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final ViewGroup LLLLIILLL(boolean z) {
                return (ViewGroup) this.LLLI.getValue();
            }

            @Override // X.InterfaceC962270b9F
            public final TextView O0(boolean z) {
                return (TextView) this.LLLILZ.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final View S1(boolean z) {
                return (View) this.LLL.getValue();
            }

            @Override // X.C1E2U, X.InterfaceC962280b9G
            public final ViewGroup T1(boolean z) {
                return (ViewGroup) this.LLLFZ.getValue();
            }

            @Override // X.InterfaceC962290b9H
            public final ViewGroup f(boolean z) {
                return (ViewGroup) this.LLLFF.getValue();
            }

            {
                super(viewTd);
                this.LLL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 367));
                this.LLLF = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 368));
                this.LLLFF = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 357));
                this.LLLFFI = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 365));
                this.LLLFZ = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 359));
                this.LLLI = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 358));
                this.LLLII = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 366));
                this.LLLIIII = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 360));
                this.LLLIIIIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 361));
                this.LLLIIIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 362));
                this.LLLIIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 355));
                this.LLLIILIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 363));
                this.LLLIL = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 356));
                this.LLLILZ = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 354));
                this.LLLILZJ = C1935407i4.LIZ(new AwS579S0100000_35(viewTd, 364));
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

    public C963770bBf(InterfaceC956060azE interfaceC956060azE, InterfaceC956210azT interfaceC956210azT, DataChannel dataChannel) {
        this.LIZIZ = interfaceC956060azE;
        this.LIZJ = interfaceC956210azT;
        this.LIZLLL = dataChannel;
    }
}

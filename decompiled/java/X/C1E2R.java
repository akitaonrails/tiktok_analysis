package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1E2R, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E2R extends C1E2U<C955590ayT> implements InterfaceC956220azU, InterfaceC956160azO {
    public final C970380bMK LLL;
    public View LLLF;
    public TextView LLLFF;
    public final C01GW LLLFFI;
    public ViewGroup LLLFZ;
    public C970380bMK LLLI;
    public ViewGroup LLLII;
    public C16F5 LLLIIII;
    public ViewGroup LLLIIIIL;
    public ViewGroup LLLIIIL;
    public ImageView LLLIIL;
    public TextView LLLIILIL;
    public ViewGroup LLLIL;
    public ImageView LLLILZ;
    public TextView LLLILZJ;
    public ImageView LLLILZLLLI;
    public ViewGroup LLLIZZ;
    public ViewGroup LLLJ;
    public TextView LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public ViewGroup LLLLIIIILLL;
    public ViewGroup LLLLIIL;
    public TextView LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final C01GW LLLLJI;
    public final C01GW LLLLL;
    public ViewGroup LLLLLIL;
    public TextView LLLLLILLIL;
    public TextView LLLLLJIL;
    public EnumC956110azJ LLLLLJLJLL;
    public final /* synthetic */ C962140b92 LLLLLL;

    @Override // X.AbstractC960400b6E
    public final String getName() {
        return "InteractViewHolder";
    }

    @Override // X.InterfaceC956160azO
    public final C16FS A4() {
        return (C16FS) this.LLLFFI.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final TextView J4() {
        return (TextView) this.LLLLILI.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962270b9F, X.InterfaceC955990az7, X.InterfaceC956220azU
    public final C16FS LJI() {
        return (C16FS) this.LLLLJ.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC955990az7
    public final View LJJIZ() {
        return (View) this.LLLLJI.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final C498540Jgq LL() {
        return (C498540Jgq) this.LLLLII.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final TextView LLJJIJIIJIL() {
        return (TextView) this.LLLLL.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final C498540Jgq LLJJJJJIL() {
        return (C498540Jgq) this.LLLL.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final C498540Jgq LLJLIL() {
        return (C498540Jgq) this.LLLJL.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final C498540Jgq LLJLLIL() {
        return (C498540Jgq) this.LLLLIILLL.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final C498540Jgq LLLLIILL() {
        return (C498540Jgq) this.LLLLIL.getValue();
    }

    @Override // X.C1E2U, X.InterfaceC962290b9H
    public final ImageView N0() {
        ImageView imageView = (ImageView) C962250b9D.LJIIIZ(this.LLLIIL, this.LLIZ, new AwS579S0100000_35(this, 302), R.id.ltb, true);
        if (imageView == null) {
            return null;
        }
        this.LLLIIL = imageView;
        return imageView;
    }

    public final ViewGroup N5() {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLIIIIL, this.LLILZIL, new AwS579S0100000_35(this, 291), R.id.tc0, true);
        if (viewGroup == null) {
            return null;
        }
        this.LLLIIIIL = viewGroup;
        return viewGroup;
    }

    @Override // X.InterfaceC956220azU
    public final InterfaceC957060b0q g() {
        return this.LLLLLL.LIZLLL;
    }

    @Override // X.InterfaceC955990az7
    public final InterfaceC956210azT g4() {
        return this.LLLLLL.LIZJ;
    }

    @Override // X.InterfaceC956600b06
    public final DataChannel getDataChannel() {
        return this.LLLLLL.LJ;
    }

    @Override // X.InterfaceC955990az7
    public final InterfaceC956060azE t5() {
        return this.LLLLLL.LIZIZ;
    }

    @Override // X.AbstractC960400b6E
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C955450ayF.LIZ.getClass();
        C956100azI.LIZ.getClass();
        C962230b9B c962230b9B = C962230b9B.LIZJ;
        c962230b9B.LIZ = null;
        c962230b9B.LIZIZ = null;
    }

    @Override // X.C1E2U, X.InterfaceC962270b9F
    public final View getRootView() {
        return this.itemView;
    }

    @Override // X.InterfaceC956160azO
    public final EnumC956110azJ k5() {
        return this.LLLLLJLJLL;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final TextView D3(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLLFF, this.LLILZLL, new AwS579S0100000_35(this, 307), R.id.zrp, z);
        this.LLLFF = textView;
        return textView;
    }

    @Override // X.InterfaceC962290b9H
    public final TextView E2(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLLIILIL, this.LLILZLL, new AwS579S0100000_35(this, 303), R.id.tv_reserved_info, z);
        if (textView != null) {
            this.LLLIILIL = textView;
            return textView;
        }
        return null;
    }

    @Override // X.C1E2U, X.InterfaceC962270b9F
    public final TextView F1(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLLLLJIL, this.LLILZLL, new AwS579S0100000_35(this, 305), R.id.tv_similar_interest, z);
        this.LLLLLJIL = textView;
        return textView;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final ViewGroup L2(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLJ, this.LLILZIL, new AwS579S0100000_35(this, 289), R.id.me8, z);
        this.LLLJ = viewGroup;
        return viewGroup;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final C16F5 LLF(boolean z) {
        C16F5 c16f5 = this.LLLIIII;
        if (c16f5 != null) {
            return c16f5;
        }
        C16F5 c16f52 = null;
        if (!z) {
            return null;
        }
        ViewGroup viewGroupT3 = t3(true);
        if (viewGroupT3 != null) {
            c16f52 = (C16F5) viewGroupT3.findViewById(R.id.bqe);
        }
        this.LLLIIII = c16f52;
        return c16f52;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final TextView LLIIL(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLLJIL, this.LLILZLL, new AwS579S0100000_35(this, 304), R.id.tv_second_degree_relation_content, z);
        this.LLLJIL = textView;
        return textView;
    }

    @Override // X.C1E2U, X.InterfaceC962290b9H
    public final TextView LLILIL(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLLILZJ, this.LLILZLL, new AwS579S0100000_35(this, 299), R.id.zzz, z);
        this.LLLILZJ = textView;
        return textView;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final ViewGroup LLJJIJI(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLLIIIILLL, this.LLILZIL, new AwS579S0100000_35(this, 296), R.id.mhg, z);
        this.LLLLIIIILLL = viewGroup;
        return viewGroup;
    }

    @Override // X.InterfaceC962270b9F
    public final ViewGroup LLJJJJ(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLLLIL, this.LLILZIL, new AwS579S0100000_35(this, 287), R.id.mb2, z);
        if (viewGroup != null) {
            this.LLLLLIL = viewGroup;
            return viewGroup;
        }
        return null;
    }

    @Override // X.InterfaceC956160azO
    public final void LLJLILLLLZIIL(EnumC956110azJ enumC956110azJ) {
        this.LLLLLJLJLL = enumC956110azJ;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final ViewGroup LLLLIILLL(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLIZZ, this.LLILZIL, new AwS579S0100000_35(this, 293), R.id.mes, z);
        this.LLLIZZ = viewGroup;
        return viewGroup;
    }

    @Override // X.InterfaceC962270b9F
    public final TextView O0(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLJJL, this.LLILZLL, new AwS579S0100000_35(this, 283), R.id.zmg, z);
        this.LLJJL = textView;
        return textView;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final C970380bMK P3(boolean z) {
        C970380bMK c970380bMK = (C970380bMK) C962250b9D.LJIIIZ(this.LLLI, this.LLL, new AwS579S0100000_35(this, 285), R.id.bqg, z);
        this.LLLI = c970380bMK;
        return c970380bMK;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final TextView P4(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLLLLILLIL, this.LLILZLL, new AwS579S0100000_35(this, 281), R.id.zkl, z);
        this.LLLLLILLIL = textView;
        return textView;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final View S1(boolean z) {
        View view = (View) C962250b9D.LJIIIZ(this.LLLF, this.LLILZ, new AwS579S0100000_35(this, 306), R.id.zro, z);
        this.LLLF = view;
        return view;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final ViewGroup T1(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLII, this.LLILZIL, new AwS579S0100000_35(this, 301), R.id.md2, z);
        this.LLLII = viewGroup;
        return viewGroup;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final TextView a1(boolean z) {
        TextView textView = (TextView) C962250b9D.LJIIIZ(this.LLLLIILL, this.LLILZLL, new AwS579S0100000_35(this, 295), R.id.tv_viewer_suggestion_content, z);
        this.LLLLIILL = textView;
        return textView;
    }

    @Override // X.InterfaceC962290b9H
    public final ViewGroup f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLIIIL, this.LLILZIL, new AwS579S0100000_35(this, 292), R.id.mee, z);
        if (viewGroup != null) {
            this.LLLIIIL = viewGroup;
            return viewGroup;
        }
        return null;
    }

    @Override // X.C1E2U, X.InterfaceC962290b9H
    public final ImageView j5(boolean z) {
        ImageView imageView = (ImageView) C962250b9D.LJIIIZ(this.LLLILZLLLI, this.LLIZ, new AwS579S0100000_35(this, 297), R.id.lq4, z);
        if (imageView != null) {
            this.LLLILZLLLI = imageView;
            return imageView;
        }
        return null;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final ViewGroup n(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLLIIL, this.LLILZIL, new AwS579S0100000_35(this, 294), R.id.mhf, z);
        this.LLLLIIL = viewGroup;
        return viewGroup;
    }

    @Override // X.C1E2U, X.InterfaceC962290b9H
    public final ImageView p5(boolean z) {
        ImageView imageView = (ImageView) C962250b9D.LJIIIZ(this.LLLILZ, this.LLIZ, new AwS579S0100000_35(this, 298), R.id.lq5, z);
        if (imageView != null) {
            this.LLLILZ = imageView;
            return imageView;
        }
        return null;
    }

    @Override // X.C1E2U, X.InterfaceC962290b9H
    public final ViewGroup r(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLIL, this.LLILZIL, new AwS579S0100000_35(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), R.id.md0, z);
        this.LLLIL = viewGroup;
        return viewGroup;
    }

    @Override // X.C1E2U, X.InterfaceC962280b9G
    public final ViewGroup t3(boolean z) {
        ViewGroup viewGroup = (ViewGroup) C962250b9D.LJIIIZ(this.LLLFZ, this.LLILZIL, new AwS579S0100000_35(this, 279), R.id.m8q, z);
        this.LLLFZ = viewGroup;
        return viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1E2R(C962140b92 c962140b92, View view) {
        super(view);
        this.LLLLLL = c962140b92;
        C970380bMK c970380bMK = new C970380bMK(view.getContext(), null, 6);
        this.LLL = c970380bMK;
        this.LLLF = this.LLILZ;
        this.LLLFF = this.LLILZLL;
        this.LLLFFI = C1935407i4.LIZ(new AwS579S0100000_35(view, 310));
        ViewGroup viewGroup = this.LLILZIL;
        this.LLLFZ = viewGroup;
        this.LLLI = c970380bMK;
        this.LLLII = viewGroup;
        this.LLLIIIIL = viewGroup;
        this.LLLIIIL = viewGroup;
        ImageView imageView = this.LLIZ;
        this.LLLIIL = imageView;
        C16F5 c16f5 = this.LLILZLL;
        this.LLLIILIL = c16f5;
        this.LLLIL = viewGroup;
        this.LLLILZ = imageView;
        this.LLLILZJ = c16f5;
        this.LLLILZLLLI = imageView;
        this.LLLIZZ = viewGroup;
        this.LLLJ = viewGroup;
        this.LLLJIL = c16f5;
        this.LLLJL = C1935407i4.LIZ(new AwS579S0100000_35(view, 278));
        this.LLLL = C1935407i4.LIZ(new AwS579S0100000_35(view, 280));
        this.LLLLII = C1935407i4.LIZ(new AwS579S0100000_35(view, 282));
        ViewGroup viewGroup2 = this.LLILZIL;
        this.LLLLIIIILLL = viewGroup2;
        this.LLLLIIL = viewGroup2;
        this.LLLLIILL = this.LLILZLL;
        this.LLLLIILLL = C1935407i4.LIZ(new AwS579S0100000_35(view, 286));
        this.LLLLIL = C1935407i4.LIZ(new AwS579S0100000_35(view, 288));
        this.LLLLILI = C1935407i4.LIZ(new AwS579S0100000_35(view, 290));
        this.LLLLJ = C1935407i4.LIZ(new AwS579S0100000_35(view, 308));
        this.LLLLJI = C1935407i4.LIZ(new AwS579S0100000_35(view, 309));
        this.LLLLL = C1935407i4.LIZ(new AwS579S0100000_35(view, 284));
        this.LLLLLIL = this.LLILZIL;
        C16F5 c16f52 = this.LLILZLL;
        this.LLLLLILLIL = c16f52;
        this.LLLLLJIL = c16f52;
        this.LLLLLJLJLL = EnumC956110azJ.NUDGABLE;
    }

    @Override // X.AbstractC960400b6E
    public final void I5(List list, int i, Object obj) {
        C955590ayT c955590ayT = (C955590ayT) obj;
        C955450ayF.LIZ.getClass();
        C955450ayF.LJ(this, c955590ayT);
        C956100azI.LIZ.getClass();
        C956100azI.LIZ(this, c955590ayT);
        C962230b9B.LIZJ.LJ(this, c955590ayT, list);
    }
}

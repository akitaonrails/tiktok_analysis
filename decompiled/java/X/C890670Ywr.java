package X;

import Y.ACListenerS117S0200000_14;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Ywr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890670Ywr extends AbstractC1903430zdF<C890660Ywq> implements C0Z37<C890660Ywq>, InterfaceC1508640pMU {
    public final C01GW LLJ;
    public final C01GW LLJI;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "InboxFilterTabGuideBannerVH";
    }

    public C890670Ywr(View view) {
        super(view);
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1382));
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 1381));
        View viewFindViewById = view.findViewById(R.id.wxu);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            gradientDrawable.setColor(C1618770sE7.LIZ(R.attr.a03));
            viewFindViewById.setBackground(gradientDrawable);
        }
        View viewFindViewById2 = view.findViewById(R.id.wxt);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Yws
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, viewFindViewById2);
        }
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        int i2;
        C890660Ywq c890660Ywq = (C890660Ywq) interfaceC1891350zJl;
        switch (C879820YfM.LIZ[c890660Ywq.LLILLJJLI.ordinal()]) {
            case 1:
                i2 = 2131845280;
                break;
            case 2:
                i2 = 2131845285;
                break;
            case 3:
                i2 = 2131845283;
                break;
            case 4:
                i2 = 2131845279;
                break;
            case 5:
                i2 = 2131855839;
                break;
            case 6:
                i2 = 2131845281;
                break;
            case 7:
                i2 = 2131845284;
                break;
            case 8:
                i2 = 2131845282;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                i2 = 2131827498;
                break;
            default:
                C339190DRl.LIZIZ(this.itemView);
                return;
        }
        C339190DRl.LIZLLL(this.itemView);
        TextView textView = (TextView) this.LLJ.getValue();
        if (textView != null) {
            textView.setText(i2);
        }
        String mobValue = c890660Ywq.LLILLJJLI.getMobValue();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("dm_tab_guide_banner_show", C2097908Jt.LIZJ(new Pair("tab_name", mobValue)));
        TuxIconView tuxIconView = (TuxIconView) this.LLJI.getValue();
        if (tuxIconView == null) {
            return;
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS117S0200000_14(c890660Ywq, this, 17));
    }
}

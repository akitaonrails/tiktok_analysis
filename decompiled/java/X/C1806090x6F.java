package X;

import Y.ACListenerS129S0200000_27;
import Y.AfS196S0100000_27;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806090x6F extends AbstractC1805640x5W {
    public final ViewGroup LIZJ;
    public final ViewModelStoreOwner LIZLLL;
    public C20743416Fc LJ;
    public C1324720kZq LJFF;
    public final LifecycleOwner LJI;
    public boolean LJII;

    @Override // X.AbstractC1805640x5W
    public final int LIZIZ() {
        return R.layout.hko;
    }

    @Override // X.AbstractC1805640x5W
    public final void LJFF() {
    }

    @Override // X.AbstractC1805640x5W
    public final void LJ() {
        C1806920x7a.LIZIZ(this.LIZJ.getContext());
    }

    @Override // X.AbstractC1805640x5W
    public final void LIZJ() {
        super.LIZJ();
        C784440Upu.LIZ().LIZJ(this.LJI, C1806680x7C.class).LIZJ(new AfS196S0100000_27(this, 34));
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS129S0200000_27(view, this, 23), view);
        }
    }

    @Override // X.AbstractC1805640x5W
    public final EnumC1568540qv6 LIZ() {
        return EnumC1568540qv6.FROZEN_COINS;
    }

    @Override // X.AbstractC1805640x5W
    public final void LIZLLL(AbstractC1568580qvA abstractC1568580qvA) {
        if ((abstractC1568580qvA instanceof C1568520qv4) && abstractC1568580qvA != null) {
            String string = this.LIZJ.getContext().getString(2131852492);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
            float f = 12;
            c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(f);
            c419910GdJ.LIZJ = (int) C497740JfY.LIZIZ(f);
            C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, this.LIZJ.getContext());
            ViewGroup viewGroup = this.LIZJ;
            KeyEvent.Callback callbackFindViewById = this.LJ;
            if (callbackFindViewById == null) {
                callbackFindViewById = viewGroup.findViewById(R.id.in4);
                this.LJ = (C20743416Fc) callbackFindViewById;
            }
            TextView textView = (TextView) callbackFindViewById;
            if (textView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(' ');
                SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.p2(spannableString, c419890GdHLIZIZ, string.length(), string.length() + 1, 33);
                textView.setText(spannableString);
            }
            ViewGroup viewGroup2 = this.LIZJ;
            View viewFindViewById = this.LJFF;
            if (viewFindViewById == null) {
                viewFindViewById = viewGroup2.findViewById(R.id.in3);
                this.LJFF = (C1324720kZq) viewFindViewById;
            }
            C1143680frq.LJ(viewFindViewById, "tiktok_live_revenue_normal_1", "ttlive_frozen_coins_campaign_banner_image.png", ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    public C1806090x6F(ViewGroup viewGroup, ViewModelStoreOwner viewModelStoreOwner) {
        super(viewGroup);
        this.LIZJ = viewGroup;
        this.LIZLLL = viewModelStoreOwner;
        this.LJI = ViewTreeLifecycleOwner.get(viewGroup);
    }
}

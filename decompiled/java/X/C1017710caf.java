package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0caf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017710caf extends ViewOnClickListenerC1017690cad {
    public final LinearLayout LLIZ;
    public final C01GW LLIZLLLIL;

    public C1017710caf(LinearLayout linearLayout) {
        super(linearLayout);
        this.LLIZ = linearLayout;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 669));
    }

    @Override // X.ViewOnClickListenerC1017690cad, X.InterfaceC1034560d1q
    public final void LJIIIZ(C1017730cah c1017730cah) {
        String homepageBottomTextual;
        AwemeRawAd awemeRawAd;
        super.LJIIIZ(c1017730cah);
        Aweme aweme = this.LLILZIL;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            homepageBottomTextual = awemeRawAd.getHomepageBottomTextual();
        } else {
            homepageBottomTextual = null;
        }
        if (!TextUtils.isEmpty(homepageBottomTextual)) {
            ((TextView) this.LLIZLLLIL.getValue()).setText(homepageBottomTextual);
        }
        if (C444960Hcc.LIZIZ()) {
            ((TextView) this.LLIZLLLIL.getValue()).setGravity(21);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        C1017780cam c1017780cam;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.a7f) {
                C1017780cam c1017780cam2 = this.LLILZLL;
                if (c1017780cam2 != null) {
                    c1017780cam2.LIZIZ();
                }
                LJII(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, false);
                return;
            }
            if ((numValueOf.intValue() != R.id.a7h && numValueOf.intValue() != R.id.a7i) || (c1017780cam = this.LLILZLL) == null) {
                return;
            }
            c1017780cam.LIZ();
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void LIZJ(boolean z, boolean z2) {
        AwemeRawAd awemeRawAd;
        int i = ((RelativeLayout.LayoutParams) this.LLIZ.getLayoutParams()).bottomMargin;
        if (i < 0) {
            C421740GgG.LIZIZ(this.LLIZ, i, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL).start();
        }
        if (z) {
            C1001150c9x c1001150c9x = C1001150c9x.LIZ;
            Aweme aweme = this.LLILZIL;
            AwemeRawAd awemeRawAd2 = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            c1001150c9x.getClass();
            C1001150c9x.LIZIZ(awemeRawAd);
            Aweme aweme2 = this.LLILZIL;
            if (aweme2 != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            }
            C2184171Adz.LIZLLL("homepage_ad", "button_show", awemeRawAd2).LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void LJII(int i, boolean z) {
        int i2 = ((RelativeLayout.LayoutParams) this.LLIZ.getLayoutParams()).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.LLIZ;
            C421740GgG.LIZIZ(linearLayout, i2, -(linearLayout.getMeasuredHeight() + 1), i).start();
        }
    }
}

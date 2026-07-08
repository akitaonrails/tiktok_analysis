package X;

import Y.ARunnableS85S0200000_16;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017680cac extends ViewOnClickListenerC1017690cad {
    public final LinearLayout LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public ARunnableS85S0200000_16 LLJIJIL;

    @Override // X.ViewOnClickListenerC1017690cad, X.InterfaceC1034560d1q
    public final void LJ() {
        C786410Ut5.R7(this.LLIZ, this);
        C786410Ut5.T7(LJIIJJI(), this);
    }

    public C1017680cac(LinearLayout linearLayout) {
        super(linearLayout);
        this.LLIZ = linearLayout;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 667));
        this.LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 666));
        this.LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 668));
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    @Override // X.ViewOnClickListenerC1017690cad, X.InterfaceC1034560d1q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C1017730cah r8) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017680cac.LJIIIZ(X.0cah):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1017780cam c1017780cam;
        if (view != null) {
            int id = view.getId();
            if ((id == R.id.rhb || id == R.id.rh_ || id == R.id.rha || id == R.id.a7i || id == R.id.a7h) && (c1017780cam = this.LLILZLL) != null) {
                c1017780cam.LIZ();
            }
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void LIZJ(boolean z, boolean z2) {
        int i;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Aweme aweme;
        AwemeRawAd awemeRawAd3;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        int i2 = ((RelativeLayout.LayoutParams) this.LLIZ.getLayoutParams()).bottomMargin;
        if (i2 < 0) {
            C421740GgG.LIZIZ(this.LLIZ, i2, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL).start();
        }
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C12ES.LIZJ(2.0f, LJIIJJI().getContext()));
            gradientDrawable.setColor(C475630Ikz.LIZIZ(R.attr.ne, LJIIJJI().getContext()));
            Aweme aweme2 = this.LLILZIL;
            if (aweme2 != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && (nativeAuthorInfo = awemeRawAd3.getNativeAuthorInfo()) != null && (bottomBanner = nativeAuthorInfo.bottomBanner) != null) {
                i = bottomBanner.showButtonColorSeconds;
            } else {
                i = 3;
            }
            if (this.LLJIJIL == null) {
                this.LLJIJIL = new ARunnableS85S0200000_16(this, gradientDrawable, 33);
            }
            HandlerHook.viewPostDelay(LJIIJJI(), this.LLJIJIL, TimeUnit.SECONDS.toMillis(i) + ((long) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            C1001150c9x c1001150c9x = C1001150c9x.LIZ;
            Aweme aweme3 = this.LLILZIL;
            AwemeRawAd awemeRawAd4 = null;
            if (aweme3 != null) {
                awemeRawAd = aweme3.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            c1001150c9x.getClass();
            C1001150c9x.LIZIZ(awemeRawAd);
            Aweme aweme4 = this.LLILZIL;
            if (aweme4 != null) {
                awemeRawAd2 = aweme4.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C2184171Adz.LIZLLL("homepage_ad", "button_show", awemeRawAd2).LJIIIIZZ();
            Aweme aweme5 = this.LLILZIL;
            if ((aweme5 != null && C1017070cZd.LJJZZI(aweme5)) || ((aweme = this.LLILZIL) != null && C1017070cZd.LJJZZIII(aweme))) {
                Aweme aweme6 = this.LLILZIL;
                if (aweme6 != null) {
                    awemeRawAd4 = aweme6.getAwemeRawAd();
                }
                C2184171Adz.LIZLLL("homepage_ad", "profile_banner_show", awemeRawAd4).LJII();
            }
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void LJII(int i, boolean z) {
        int i2 = ((RelativeLayout.LayoutParams) this.LLIZ.getLayoutParams()).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.LLIZ;
            C421740GgG.LIZIZ(linearLayout, i2, -(linearLayout.getMeasuredHeight() + 1), i).start();
        }
        if (i > 0) {
            LJIIJJI().setBackgroundResource(R.drawable.cwb);
        } else {
            LJIIJJI().setBackgroundResource(R.drawable.cwa);
        }
        HandlerHook.viewRemoveCallbacks(LJIIJJI(), this.LLJIJIL);
    }

    public static String LJIIL(String str, TextView textView, float f) {
        if (str == null) {
            return null;
        }
        TextPaint paint = textView.getPaint();
        if (paint.measureText(str) <= f) {
            return str;
        }
        textView.setText(str);
        CharSequence text = textView.getText();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) text);
        sbLIZ.append("...");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        while (paint.measureText(strLIZIZ) > f && text.length() > 0) {
            text = text.subSequence(0, text.length() - 1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((Object) text);
            sbLIZ2.append("...");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }
}

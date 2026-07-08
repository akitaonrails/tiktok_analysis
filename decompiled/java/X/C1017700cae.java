package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CallToActionBarInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017700cae extends ViewOnClickListenerC1017690cad {
    public final LinearLayout LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    public C1017700cae(LinearLayout linearLayout) {
        super(linearLayout);
        this.LLIZ = linearLayout;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 665));
        this.LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 664));
    }

    @Override // X.ViewOnClickListenerC1017690cad, X.InterfaceC1034560d1q
    public final void LJIIIZ(C1017730cah c1017730cah) {
        String text;
        String buttonText;
        UrlModel avatarThumb;
        User author;
        AwemeRawAd awemeRawAd;
        CallToActionBarInfo callToActionBarInfo;
        AwemeRawAd awemeRawAd2;
        CallToActionBarInfo callToActionBarInfo2;
        super.LJIIIZ(c1017730cah);
        TextView textView = (TextView) this.LLIZLLLIL.getValue();
        Aweme aweme = this.LLILZIL;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (callToActionBarInfo2 = awemeRawAd2.getCallToActionBarInfo()) != null) {
            text = callToActionBarInfo2.getText();
        } else {
            text = null;
        }
        textView.setText(text);
        TextView textViewLJIIJJI = LJIIJJI();
        Aweme aweme2 = this.LLILZIL;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (callToActionBarInfo = awemeRawAd.getCallToActionBarInfo()) != null) {
            buttonText = callToActionBarInfo.getButtonText();
        } else {
            buttonText = null;
        }
        textViewLJIIJJI.setText(buttonText);
        Context context = this.LLILZ;
        if (context != null) {
            LJIIJJI().setBackground(C800330VaR.LIZIZ(context, R.drawable.cpr));
        }
        C1322110kVd c1322110kVd = (C1322110kVd) this.LLJ.getValue();
        Aweme aweme3 = this.LLILZIL;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            avatarThumb = author.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1322410kW7.LIZ(c1322110kVd, avatarThumb, null);
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
            if (numValueOf.intValue() != R.id.a7i || (c1017780cam = this.LLILZLL) == null) {
                return;
            }
            c1017780cam.LIZ();
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void LIZJ(boolean z, boolean z2) {
        int i = ((RelativeLayout.LayoutParams) this.LLIZ.getLayoutParams()).bottomMargin;
        if (i < 0) {
            C421740GgG.LIZIZ(this.LLIZ, i, 60, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL).start();
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void LJII(int i, boolean z) {
        int i2 = ((RelativeLayout.LayoutParams) this.LLIZ.getLayoutParams()).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.LLIZ;
            C421740GgG.LIZIZ(linearLayout, i2, -(linearLayout.getMeasuredHeight() + 61), i).start();
        }
    }
}

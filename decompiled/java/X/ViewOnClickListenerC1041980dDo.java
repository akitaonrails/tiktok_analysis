package X;

import Y.ARunnableS49S0300000_16;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1041980dDo extends C1066550drR implements View.OnClickListener {
    public Aweme LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.C1066550drR
    public boolean getCanScaleContent() {
        return false;
    }

    @Override // X.C1066550drR
    public boolean getCanScroll() {
        return this.LLJILJIL;
    }

    private final void setAweme(Aweme aweme) {
        int tipsType;
        String openUrl;
        AwemeRawAd awemeRawAd;
        String string;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
            tipsType = awemeRawAd3.getTipsType();
        } else {
            tipsType = -1;
        }
        String string2 = null;
        if (tipsType == 1) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                    openUrl = awemeRawAd2.getOpenUrl();
                } else {
                    openUrl = null;
                }
                if (C1022030chd.LJIJI(openUrl)) {
                    View header = getHeader();
                    if (header == null) {
                        header = C786410Ut5.Sd(R.layout.bir, C786410Ut5.ne(getContext()), this);
                    }
                    TextView textView = (TextView) header.findViewById(R.id.aa0);
                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                        String schemaName = awemeRawAd.getSchemaName();
                        if (schemaName != null && schemaName.length() != 0) {
                            string = awemeRawAd.getSchemaName();
                        } else {
                            string = getResources().getString(2131824741);
                        }
                        string2 = getResources().getString(2131824745, string);
                    }
                    textView.setText(string2);
                    C786410Ut5.I7(this, header.findViewById(R.id.a_y));
                    C786410Ut5.I7(this, header.findViewById(R.id.a_w));
                    this.LLJILJIL = true;
                    this.LLJIJIL = aweme;
                    return;
                }
            }
        }
        this.LLJILJIL = false;
        this.LLJIJIL = null;
    }

    public final void LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        setScrollOffset(0);
        setAweme(aweme);
        if (this.LLJILJIL) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                C1001140c9w c1001140c9w = new C1001140c9w();
                c1001140c9w.LIZ = awemeRawAd;
                c1001140c9w.LIZJ = false;
                C994130byd.LIZ("draw_ad", "open_card_show", c1001140c9w.LIZ(), awemeRawAd);
            }
            View header = getHeader();
            if (header != null) {
                HandlerHook.viewPostDelay(this, new ARunnableS49S0300000_16(header, this, this, 11), 500L);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        int id = view.getId();
        if (id == R.id.a_y) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                AbstractC1025070cmX.LJIIZILJ(getContext(), this.LLJIJIL);
            }
            Aweme aweme = this.LLJIJIL;
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                C1001140c9w c1001140c9w = new C1001140c9w();
                c1001140c9w.LIZ = awemeRawAd2;
                c1001140c9w.LIZJ = false;
                C994130byd.LIZ("draw_ad", "open_card_jump", c1001140c9w.LIZ(), awemeRawAd2);
                return;
            }
            return;
        }
        if (id != R.id.a_w) {
            return;
        }
        View header = getHeader();
        if (header != null) {
            HandlerHook.viewPostDelay(this, new ARunnableS49S0300000_16(header, this, this, 12), 0L);
        }
        Aweme aweme2 = this.LLJIJIL;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
            C1001140c9w c1001140c9w2 = new C1001140c9w();
            c1001140c9w2.LIZ = awemeRawAd;
            c1001140c9w2.LIZJ = false;
            C994130byd.LIZ("draw_ad", "open_card_close", c1001140c9w2.LIZ(), awemeRawAd);
        }
        setAweme(null);
    }

    public ViewOnClickListenerC1041980dDo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHeaderId(R.id.a_z);
    }
}

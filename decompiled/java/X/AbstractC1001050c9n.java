package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1001050c9n extends FrameLayout implements InterfaceC988160bp0 {
    public final Context LL;
    public View LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public ImageView LLIZ;
    public EnumC1001070c9p LLIZLLLIL;
    public Aweme LLJ;
    public AwemeRawAd LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;

    private final boolean getInDownloadMode() {
        return C13LQ.LJJIJIIJI(this.LLIZLLLIL, new EnumC1001070c9p[]{EnumC1001070c9p.DOWNLOADING, EnumC1001070c9p.INSTALL, EnumC1001070c9p.INSTALLED}) >= 0;
    }

    public abstract int getLayoutId$commercialize_feed_impl_release();

    public abstract void setLabelVisibility$commercialize_feed_impl_release(int i);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String getButtonText() {
        String type;
        String buttonText;
        AwemeRawAd awemeRawAd = this.LLJI;
        if (awemeRawAd != null && (buttonText = awemeRawAd.getButtonText()) != null && buttonText.length() > 0) {
            return buttonText;
        }
        AwemeRawAd awemeRawAd2 = this.LLJI;
        if (awemeRawAd2 == null || (type = awemeRawAd2.getType()) == null) {
            return "";
        }
        switch (type.hashCode()) {
            case -1354573786:
                return type.equals("coupon") ? getContext().getString(2131824725) : "";
            case 96801:
                if (!type.equals("app")) {
                    return "";
                }
                break;
            case 117588:
                if (!type.equals("web")) {
                    return "";
                }
                break;
            case 3148996:
                return type.equals("form") ? getContext().getString(2131824732) : "";
            case 106642798:
                return type.equals("phone") ? getContext().getString(2131824747) : "";
            case 957829685:
                if (!type.equals("counsel")) {
                    return "";
                }
                break;
            case 1893962841:
                return type.equals("redpacket") ? getContext().getString(2131824751) : "";
            default:
                return "";
        }
        return getContext().getString(2131824778);
    }

    private final long getColorChangeSeconds() {
        AwemeRawAd awemeRawAd = this.LLJI;
        if (awemeRawAd == null || awemeRawAd.getAnimationType() != 3) {
            return getShowSeconds();
        }
        long showSeconds = getShowSeconds();
        AwemeRawAd awemeRawAd2 = this.LLJI;
        return Math.max(showSeconds, ((long) (awemeRawAd2 != null ? awemeRawAd2.getShowButtonColorSeconds() : 0)) * 1000);
    }

    public final void LJIIJJI() {
        View view = this.LLILZIL;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = this.LLILZIL;
        if (view3 != null) {
            view3.setBackgroundDrawable(null);
        }
        View view4 = this.LLILZLL;
        if (view4 != null) {
            view4.setBackgroundDrawable(null);
        }
    }

    public final int getBackGroundColor() {
        int i = this.LLJILJIL;
        Drawable background = getBackground();
        return background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : i;
    }

    public final int getBgColor() {
        String learnMoreBgColor;
        AwemeRawAd awemeRawAd = this.LLJI;
        return (awemeRawAd == null || (learnMoreBgColor = awemeRawAd.getLearnMoreBgColor()) == null || learnMoreBgColor.length() <= 0) ? C475630Ikz.LIZIZ(R.attr.a04, this.LL) : ColorProtector.parseColor(learnMoreBgColor);
    }

    private final long getShowSeconds() {
        if (getInDownloadMode()) {
            return 0L;
        }
        AwemeRawAd awemeRawAd = this.LLJI;
        return ((long) (awemeRawAd != null ? awemeRawAd.getShowButtonSeconds() : 0)) * 1000;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AwemeRawAd awemeRawAd;
        String downloadUrl;
        LJIIJJI();
        HandlerHook.viewRemoveCallbacks(this, null);
        HandlerHook.viewRemoveCallbacks(this, null);
        AwemeRawAd awemeRawAd2 = this.LLJI;
        if (Intrinsics.LJFF(awemeRawAd2 != null ? awemeRawAd2.getType() : null, "app") && (awemeRawAd = this.LLJI) != null && (downloadUrl = awemeRawAd.getDownloadUrl()) != null) {
            downloadUrl.length();
        }
        super.onDetachedFromWindow();
    }

    public final ImageView getArrow$commercialize_feed_impl_release() {
        return this.LLIZ;
    }

    public final EnumC1001070c9p getCurrentStyle() {
        return this.LLIZLLLIL;
    }

    public final int getDefaultBackgroundColor() {
        return this.LLJILJIL;
    }

    public final Aweme getMAweme$commercialize_feed_impl_release() {
        return this.LLJ;
    }

    public final AwemeRawAd getMAwemeRawAd$commercialize_feed_impl_release() {
        return this.LLJI;
    }

    public final void setArrow$commercialize_feed_impl_release(ImageView imageView) {
        this.LLIZ = imageView;
    }

    public final void setCurrentStyle(EnumC1001070c9p enumC1001070c9p) {
        this.LLIZLLLIL = enumC1001070c9p;
    }

    public final void setDefaultBackgroundColor$commercialize_feed_impl_release(int i) {
        this.LLJILJIL = i;
    }

    public final void setDownloadIdleUI(String str) {
        View viewFindViewById;
        View viewFindViewById2;
        TextView textView;
        TextView textView2;
        if (!this.LLJIJIL) {
            View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), getLayoutId$commercialize_feed_impl_release(), this);
            this.LLILLJJLI = viewLJLLJ;
            ImageView imageView = null;
            if (viewLJLLJ != null) {
                viewFindViewById = viewLJLLJ.findViewById(R.id.g48);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = viewFindViewById;
            View view = this.LLILLJJLI;
            if (view != null) {
                viewFindViewById2 = view.findViewById(R.id.g49);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZLL = viewFindViewById2;
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                textView = (TextView) view2.findViewById(R.id.nnc);
            } else {
                textView = null;
            }
            this.LLILLL = textView;
            View view3 = this.LLILLJJLI;
            if (view3 != null) {
                textView2 = (TextView) view3.findViewById(R.id.nn6);
            } else {
                textView2 = null;
            }
            this.LLILZ = textView2;
            View view4 = this.LLILLJJLI;
            if (view4 != null) {
                imageView = (ImageView) view4.findViewById(R.id.g46);
            }
            this.LLIZ = imageView;
            C421740GgG.LIZ(this);
            this.LLJIJIL = true;
        }
        LJIIJJI();
        this.LLIZLLLIL = EnumC1001070c9p.DOWNLOAD_IDLE;
        View view5 = this.LLILZIL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
        }
        View view6 = this.LLILZLL;
        if (view6 != null) {
            C786410Ut5.LJLLLLLL(8, view6);
        }
        TextView textView3 = this.LLILZ;
        if (textView3 != null) {
            textView3.setTextColor(C960203pA.LIZ(R.attr.bx, this.LL));
        }
        TextView textView4 = this.LLILZ;
        if (textView4 != null) {
            textView4.setText(str);
        }
        TextView textView5 = this.LLILLL;
        if (textView5 != null) {
            C786410Ut5.LLIL(textView5, 8);
        }
        ImageView imageView2 = this.LLIZ;
        if (imageView2 != null) {
            C786410Ut5.LJZI(0, imageView2);
        }
    }

    public final void setMAweme$commercialize_feed_impl_release(Aweme aweme) {
        this.LLJ = aweme;
    }

    public final void setMAwemeRawAd$commercialize_feed_impl_release(AwemeRawAd awemeRawAd) {
        this.LLJI = awemeRawAd;
    }

    public AbstractC1001050c9n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC1001050c9n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = context;
    }
}

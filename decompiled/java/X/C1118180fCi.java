package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118180fCi extends FrameLayout implements C0T8B {
    public static final /* synthetic */ int LLILZLL = 0;
    public TextView LL;
    public TextView LLILLJJLI;
    public C1324720kZq LLILLL;
    public boolean LLILZ;
    public long LLILZIL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public final TextView getGiftGalleryEntrance() {
        return this.LLILLJJLI;
    }

    public final C1324720kZq getGiftIcon() {
        return this.LLILLL;
    }

    public final long getLeftNum() {
        return this.LLILZIL;
    }

    public final TextView getSponsorDescText() {
        return this.LL;
    }

    public final void setGiftGalleryEntrance(TextView textView) {
        this.LLILLJJLI = textView;
    }

    public final void setGiftIcon(C1324720kZq c1324720kZq) {
        this.LLILLL = c1324720kZq;
    }

    public final void setLeftNum(long j) {
        this.LLILZIL = j;
    }

    public final void setSponsorDescText(TextView textView) {
        this.LL = textView;
    }

    public final void setTextLong(boolean z) {
        this.LLILZ = z;
    }

    public final void setup(ImageModel imageModel) {
        if (imageModel != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_INSIDE;
            c1324610kZfLJIIIZ.LJJI(this.LLILLL);
        }
        TextView textView = this.LL;
        if (textView != null) {
            textView.setSelected(false);
            textView.setEllipsize(null);
            HandlerHook.viewPostDelay(textView, new ARunnableS117S0100000_17(textView, 88), 1000L);
        }
    }

    public C1118180fCi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.gok, this);
        this.LL = (TextView) findViewById(R.id.tv_sponsor_desc);
        this.LLILLJJLI = (TextView) findViewById(R.id.znn);
        this.LLILLL = (C1324720kZq) findViewById(R.id.lvg);
    }

    public final void LIZ(Long l, boolean z) {
        String string;
        String strK4;
        if (l != null) {
            this.LLILZIL = l.longValue();
        } else {
            this.LLILZIL--;
        }
        this.LLILZ = false;
        boolean zIsEoy = GiftManager.inst().isEoy();
        long j = this.LLILZIL;
        if (j > 0) {
            String strValueOf = String.valueOf(j);
            if (z) {
                if (zIsEoy) {
                    this.LLILZ = true;
                    strK4 = C786410Ut5.k4(Locale.US, C497740JfY.LJIJJ(2131852507, strValueOf, C0KVU.LIZLLL(C1125800fP0.LIZJ())), Arrays.copyOf(new Object[0], 0));
                } else {
                    Locale locale = Locale.US;
                    long j2 = this.LLILZIL;
                    strK4 = C786410Ut5.k4(locale, C497740JfY.LJIIL(2131755850, (int) j2, Long.valueOf(j2), C0KVU.LIZLLL(C1125800fP0.LIZJ())), Arrays.copyOf(new Object[0], 0));
                }
            } else if (zIsEoy) {
                strK4 = C786410Ut5.k4(Locale.US, getContext().getString(2131852506, strValueOf), Arrays.copyOf(new Object[0], 0));
            } else {
                strK4 = C786410Ut5.k4(Locale.US, getContext().getString(2131841876), Arrays.copyOf(new Object[]{Long.valueOf(this.LLILZIL)}, 1));
            }
            int iLJJJ = a0.LJJJ(strK4, strValueOf, 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK4);
            if (iLJJJ >= 0 && strValueOf.length() + iLJJJ <= strK4.length()) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(-340459), iLJJJ, strValueOf.length() + iLJJJ, 33);
                C786410Ut5.q2(spannableStringBuilder, new C444930HcZ(C1119920fFW.LIZJ(17.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, getContext())), iLJJJ, strValueOf.length() + iLJJJ, 33);
            }
            TextView textView = this.LL;
            if (textView != null) {
                textView.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        TextView textView2 = this.LL;
        if (textView2 == null) {
            return;
        }
        if (zIsEoy) {
            string = getContext().getString(2131852505);
        } else {
            string = getContext().getString(2131841875);
        }
        textView2.setText(string);
    }
}

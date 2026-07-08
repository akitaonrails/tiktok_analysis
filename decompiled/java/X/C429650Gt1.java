package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Gt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429650Gt1 extends TuxTextView {
    public ValueAnimator LLJJJJ;
    public long LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;

    public final void LJJJJLI() {
        ValueAnimator valueAnimator = this.LLJJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJJJJ;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.LLJJJJ = null;
        this.LLJJJJJIL = 0L;
    }

    public final void LJJJJLL() {
        if (this.LLJJJJJIL <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.LLJJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        long jCurrentTimeMillis = this.LLJJJJJIL - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis <= 0) {
            this.LLJJJJJIL = 0L;
            setText("00:00:00.0");
            return;
        }
        this.LLJJJJLIIL = LJJJJJ(jCurrentTimeMillis);
        long j = jCurrentTimeMillis - 1000;
        this.LLJJL = j > 0 ? LJJJJJ(j) : "";
        int i = (int) ((jCurrentTimeMillis % 1000) / 100);
        ValueAnimator valueAnimator2 = this.LLJJJJ;
        if (valueAnimator2 != null) {
            valueAnimator2.setIntValues(i, i - 9);
        }
        ValueAnimator valueAnimator3 = this.LLJJJJ;
        if (valueAnimator3 != null) {
            valueAnimator3.setCurrentPlayTime(0L);
        }
        ValueAnimator valueAnimator4 = this.LLJJJJ;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public C429650Gt1(Context context) {
        super(context, null, 0);
        this.LLJJJJLIIL = "";
        this.LLJJL = "";
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        setGravity(16);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setFontFeatureSettings("tnum");
        setTuxFont(72);
        setTextColorRes(R.attr.a0o);
    }

    public static String LJJJJJ(long j) {
        long j2 = j / 1000;
        return C786410Ut5.k4(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 3600), Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}, 3));
    }

    public final void LJJJJL(long j) {
        ValueAnimator valueAnimator = this.LLJJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            this.LLJJJJJIL = 0L;
            setText("00:00:00.0");
            return;
        }
        this.LLJJJJJIL = j;
        if (this.LLJJJJ == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setDuration(950L);
            valueAnimator2.setInterpolator(new LinearInterpolator());
            valueAnimator2.addUpdateListener(new AUListenerS256S0100000_6(this, 193));
            this.LLJJJJ = valueAnimator2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJJJJ(jCurrentTimeMillis));
        sbLIZ.append('.');
        sbLIZ.append((jCurrentTimeMillis % 1000) / 100);
        setText(C2188811AlT.LIZIZ(sbLIZ));
    }
}

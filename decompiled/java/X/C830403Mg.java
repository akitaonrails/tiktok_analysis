package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SellingPointStyle;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C830403Mg extends ConstraintLayout implements InterfaceC1164530gPT {
    public static final /* synthetic */ int LLJILJIL = 0;
    public C719102rN LL;
    public PromotionSellingPoint LLILLJJLI;
    public SellingPointStyle LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public C03MX LLJI;
    public ValueAnimator LLJIJIL;

    private final ConstraintLayout getContainer() {
        return (ConstraintLayout) this.LLILZ.getValue();
    }

    private final TuxTextView getCountdownText() {
        return (TuxTextView) this.LLJ.getValue();
    }

    private final RadiusLayout getCountdownView() {
        return (RadiusLayout) this.LLIZLLLIL.getValue();
    }

    private final SmartImageView getIcon() {
        return (SmartImageView) this.LLILZLL.getValue();
    }

    private final TuxTextView getNormalText() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final RadiusLayout getTextView() {
        return (RadiusLayout) this.LLILZIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C03MX c03mx = this.LLJI;
        if (c03mx != null) {
            c03mx.LIZ();
        }
        this.LLJI = null;
        ValueAnimator valueAnimator = this.LLJIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJIJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.LLJIJIL = null;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_osp_promotion_event", this);
    }

    public C830403Mg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C719102rN c719102rN;
        String str3;
        int i;
        if (Intrinsics.LJFF(str, "ec_osp_promotion_event") && (c719102rN = this.LL) != null && (str3 = c719102rN.LLILZLL) != null) {
            C799403Ai.LIZ.getClass();
            Long lLIZJ = C799403Ai.LIZJ(str3);
            if (lLIZJ != null) {
                long jLongValue = lLIZJ.longValue();
                C800303Ar c800303Ar = (C800303Ar) C7726030a.LIZ(str3, C799403Ai.LIZLLL);
                if (c800303Ar != null) {
                    i = c800303Ar.LIZJ;
                } else {
                    i = 0;
                }
                e0(i, jLongValue, false);
            }
        }
    }

    public C830403Mg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 408));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 413));
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 411));
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 412));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 410));
        this.LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 409));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b45, this, true);
    }

    public final void e0(int i, long j, boolean z) {
        if (j <= 0) {
            C03DZ.LIZ(getContainer());
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        long j2 = 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        long seconds = timeUnit.toSeconds(j) % j2;
        if (hours >= 24) {
            C03MX c03mx = this.LLJI;
            if (c03mx != null) {
                c03mx.LIZ();
            }
            C03DZ.LIZ(getCountdownView());
            return;
        }
        C12ES.LJIILL(0, getCountdownView());
        final String strJ4 = C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3));
        if (i == 1) {
            if (z) {
                TuxTextView countdownText = getCountdownText();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strJ4);
                sbLIZ.append(".0");
                countdownText.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            final TuxTextView countdownText2 = getCountdownText();
            ValueAnimator valueAnimator = this.LLJIJIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.LLJIJIL;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(9, 0);
            valueAnimatorOfInt.setDuration(950L);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.03Mh
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    TuxTextView tuxTextView = countdownText2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strJ4);
                    sbLIZ2.append('.');
                    sbLIZ2.append(valueAnimator3.getAnimatedValue());
                    tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
            this.LLJIJIL = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
            return;
        }
        getCountdownText().setText(strJ4);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h0(X.C830403Mg r15, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint r16, X.C719102rN r17, boolean r18, kotlin.jvm.internal.AwS545S0100000_1 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C830403Mg.h0(X.03Mg, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint, X.02rN, boolean, kotlin.jvm.internal.AwS545S0100000_1, int):void");
    }
}

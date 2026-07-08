package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03nZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C950303nZ extends ConstraintLayout {
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final BDDateFormat LLJJJ = new BDDateFormat("lt");
    public static final BDDateFormat LLJJJIL = new BDDateFormat("lll-Y");
    public static final SimpleDateFormat LLJJJJ;
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final SmartImageView LLILZIL;
    public SeaBannerCountDown LLILZLL;
    public int LLIZ;
    public CountDownTimer LLIZLLLIL;
    public Function1<? super Boolean, Unit> LLJ;
    public int LLJI;
    public long LLJIJIL;
    public Map<String, ? extends Object> LLJILJIL;
    public int LLJILJILJ;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        LLJJJJ = simpleDateFormat;
    }

    private final int getEndCountDownMarginEnd() {
        if (this.LLILZIL.getVisibility() == 0) {
            return LLJJIII;
        }
        return 0;
    }

    private final int getStartTextMarginStart() {
        if (this.LL.getVisibility() == 0) {
            return LLJJ;
        }
        return 0;
    }

    public final int e0(boolean z) {
        if (!z && this.LLILZ.getVisibility() == 0) {
            return LLJJI;
        }
        if (this.LLILZIL.getVisibility() != 0) {
            return 0;
        }
        return LLJJIII;
    }

    public final void h0(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        this.LLJILJILJ = i;
        int i5 = 1;
        if (i == C03CS.SINGLE_LINE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        SmartImageView smartImageView = this.LL;
        int i6 = LLJILLL;
        C19ME c19me = new C19ME(i6, i6);
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        C786410Ut5.G6(smartImageView, c19me);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (z) {
            i2 = -2;
        } else {
            i2 = 0;
        }
        C19ME c19me2 = new C19ME(i2, -2);
        c19me2.startToEnd = this.LL.getId();
        c19me2.endToStart = this.LLILLL.getId();
        c19me2.topToTop = 0;
        c19me2.bottomToBottom = 0;
        c19me2.setMarginEnd(LLJJIJIL);
        C786410Ut5.R6(tuxTextView, c19me2);
        if (z) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        tuxTextView.setMaxLines(i3);
        TuxTextView tuxTextView2 = this.LLILLL;
        if (z) {
            i4 = 0;
        } else {
            i4 = -2;
        }
        C19ME c19me3 = new C19ME(i4, -2);
        c19me3.startToEnd = this.LLILLJJLI.getId();
        c19me3.topToTop = 0;
        c19me3.endToStart = this.LLILZ.getId();
        c19me3.bottomToBottom = 0;
        c19me3.setMarginEnd(e0(false));
        C786410Ut5.R6(tuxTextView2, c19me3);
        if (!z) {
            i5 = 2;
        }
        tuxTextView2.setMaxLines(i5);
        if (z) {
            tuxTextView2.setMinWidth(LLJJIJI);
        } else {
            tuxTextView2.setMaxWidth(LLJJIJIIJIL);
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        C19ME c19me4 = new C19ME(-2, -2);
        c19me4.startToEnd = this.LLILLL.getId();
        c19me4.topToTop = 0;
        c19me4.endToStart = this.LLILZIL.getId();
        c19me4.bottomToBottom = 0;
        c19me4.setMarginEnd(getEndCountDownMarginEnd());
        C786410Ut5.R6(tuxTextView3, c19me4);
        SmartImageView smartImageView2 = this.LLILZIL;
        C19ME c19me5 = new C19ME(-2, -2);
        c19me5.topToTop = 0;
        c19me5.endToEnd = 0;
        c19me5.bottomToBottom = 0;
        C786410Ut5.G6(smartImageView2, c19me5);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown r14, long r15) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C950303nZ.i0(com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown, long):void");
    }

    public final void j0(final SeaBannerCountDown seaBannerCountDown, Function1<? super Boolean, Unit> function1) {
        Integer numLIZ;
        if (!Intrinsics.LJFF(this.LLILZLL, seaBannerCountDown)) {
            this.LLILZLL = seaBannerCountDown;
        }
        CountDownTimer countDownTimer = this.LLIZLLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLJ = null;
        if (seaBannerCountDown.targetTime == null) {
            return;
        }
        CustomColor customColor = seaBannerCountDown.color;
        if (customColor != null && (numLIZ = C038L.LIZ(customColor, getContext(), null)) != null) {
            this.LLILZ.setTextColor(numLIZ.intValue());
        }
        boolean z = true;
        this.LLILLL.setMaxLines(1);
        final long jMax = Math.max((seaBannerCountDown.targetTime.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - System.currentTimeMillis(), 0L);
        if (jMax <= 0) {
            i0(seaBannerCountDown, 0L);
            int i = this.LLJI;
            if (i < 3 && function1 != null) {
                this.LLJI = i + 1;
                C1748720vbi.LIZLLL(this, new C049F(), new AwS580S0100000_1(this, 556));
                if (this.LLJI <= 0) {
                    z = false;
                }
                function1.invoke(Boolean.valueOf(z));
                return;
            }
            return;
        }
        i0(seaBannerCountDown, jMax);
        this.LLJ = function1;
        this.LLIZLLLIL = new CountDownTimer(jMax) { // from class: X.03nb
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                C950303nZ c950303nZ = this;
                Function1<? super Boolean, Unit> function12 = c950303nZ.LLJ;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(c950303nZ.LLJI > 0));
                }
                C950303nZ c950303nZ2 = this;
                c950303nZ2.getClass();
                C1748720vbi.LIZLLL(c950303nZ2, new C049F(), new AwS580S0100000_1(c950303nZ2, 556));
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                this.i0(seaBannerCountDown, j);
            }
        }.start();
        this.LLJI = 0;
        this.LLJIJIL = jMax;
    }

    public final void l0(C950203nY c950203nY, Function1<? super Boolean, Unit> function1) {
        Image imageRequireImageForEcDarkMode;
        Image imageRequireImageForEcDarkMode2;
        int value;
        if (this.LLJILJILJ == C03CS.UNDEFINED.getValue()) {
            Integer num = c950203nY.LIZIZ;
            if (num != null) {
                value = num.intValue();
            } else {
                value = C03CS.SINGLE_LINE.getValue();
            }
            h0(value);
        }
        Icon icon = c950203nY.LIZLLL;
        if (icon != null && (imageRequireImageForEcDarkMode2 = icon.requireImageForEcDarkMode(getContext())) != null) {
            C03DZ.LIZJ(this.LL);
            Integer viewWidth = c950203nY.LIZLLL.getViewWidth();
            if (viewWidth != null) {
                int iIntValue = viewWidth.intValue();
                Integer viewHeight = c950203nY.LIZLLL.getViewHeight();
                if (viewHeight != null) {
                    int iIntValue2 = viewHeight.intValue();
                    SmartImageView smartImageView = this.LL;
                    smartImageView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                    smartImageView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                }
            }
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode2);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LIZLLL.LJJ(this.LL);
            c1331670kl3LIZLLL.LJIIJJI();
        } else {
            C03DZ.LIZ(this.LL);
        }
        ECRichText eCRichText = c950203nY.LJ;
        if (eCRichText != null) {
            int i = C1763600vzi.LLJLLIL;
            C949003nM.LIZ(this.LLILLJJLI, eCRichText, "SkuWaistView");
            C0H9H.LJFF(getStartTextMarginStart(), this.LLILLJJLI);
        } else {
            this.LLILLJJLI.setText((CharSequence) null);
        }
        Icon icon2 = c950203nY.LJII;
        if (icon2 != null && (imageRequireImageForEcDarkMode = icon2.requireImageForEcDarkMode(getContext())) != null) {
            C03DZ.LIZJ(this.LLILZIL);
            Integer viewWidth2 = c950203nY.LJII.getViewWidth();
            if (viewWidth2 != null) {
                int iIntValue3 = viewWidth2.intValue();
                Integer viewHeight2 = c950203nY.LJII.getViewHeight();
                if (viewHeight2 != null) {
                    int iIntValue4 = viewHeight2.intValue();
                    SmartImageView smartImageView2 = this.LLILZIL;
                    smartImageView2.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue3)));
                    smartImageView2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue4)));
                }
            }
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode);
            c1331670kl3LIZLLL2.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LIZLLL2.LJJ(this.LLILZIL);
            c1331670kl3LIZLLL2.LJIIJJI();
        } else {
            C03DZ.LIZ(this.LLILZIL);
        }
        SeaBannerCountDown seaBannerCountDown = c950203nY.LJI;
        if (seaBannerCountDown != null && seaBannerCountDown.targetTime != null) {
            C03DZ.LIZJ(this.LLILZ);
            this.LLJILJIL = c950203nY.LJIIIZ;
            this.LLIZ = -1;
            j0(c950203nY.LJI, function1);
            C0H9H.LIZLLL(getEndCountDownMarginEnd(), this.LLILZ);
            return;
        }
        if (c950203nY.LJFF != null) {
            C03DZ.LIZ(this.LLILZ);
            int i2 = C1763600vzi.LLJLLIL;
            C949003nM.LIZ(this.LLILLL, c950203nY.LJFF, "SkuWaistView");
            C0H9H.LIZLLL(e0(false), this.LLILLL);
            return;
        }
        C03DZ.LIZ(this.LLILZ);
        this.LLILLL.setText((CharSequence) null);
    }

    public C950303nZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SmartImageView smartImageView = new SmartImageView(getContext());
        smartImageView.setId(ViewGroup.generateViewId());
        this.LL = smartImageView;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setId(ViewGroup.generateViewId());
        tuxTextView.setGravity(8388611);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LLILLJJLI = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView2.setId(ViewGroup.generateViewId());
        tuxTextView2.setGravity(8388613);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.LLILLL = tuxTextView2;
        TuxTextView tuxTextView3 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView3.setId(ViewGroup.generateViewId());
        tuxTextView3.setTuxFont(72);
        tuxTextView3.setFontFeatureSettings("tnum");
        this.LLILZ = tuxTextView3;
        SmartImageView smartImageView2 = new SmartImageView(getContext());
        smartImageView2.setId(ViewGroup.generateViewId());
        C03DZ.LIZ(smartImageView2);
        this.LLILZIL = smartImageView2;
        this.LLIZ = -1;
        this.LLJILJILJ = C03CS.UNDEFINED.getValue();
        setId(R.id.eid);
        addView(smartImageView);
        addView(tuxTextView);
        addView(tuxTextView2);
        addView(smartImageView2);
        addView(tuxTextView3);
    }
}

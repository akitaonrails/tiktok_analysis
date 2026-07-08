package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.model.TermsApply;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS146S1200000_31;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS5S3200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18La, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21268418La extends FrameLayout {
    public TuxTextView LL;
    public C430740Gum LLILLJJLI;
    public C197039127h LLILLL;
    public Function1<? super C21268418La, Unit> LLILZ;
    public Function1<? super PanelVoucherInfo, Unit> LLILZIL;
    public String LLILZLL;
    public PanelVoucherInfo LLIZ;
    public final C01GW LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final C01GW LLJIJIL;
    public C21268518Lb LLJILJIL;

    public static /* synthetic */ void getVoucherState$annotations() {
    }

    private final Paint getCirclePaint() {
        return (Paint) this.LLJIJIL.getValue();
    }

    private final Paint getEllipsePaint() {
        return (Paint) this.LLIZLLLIL.getValue();
    }

    public final C197039127h getCouponBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f2f);
            this.LLILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C430740Gum getCouponExplainFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f2u);
            this.LLILLJJLI = (C430740Gum) callbackFindViewById;
        }
        return (C430740Gum) callbackFindViewById;
    }

    public final TuxTextView getCouponTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f3o);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJ = Integer.valueOf(this.LLJILJIL.LIZJ);
        C21268518Lb c21268518Lb = this.LLJILJIL;
        c384050F3z.LJFF = c21268518Lb.LIZLLL;
        c384050F3z.LIZLLL = Integer.valueOf(c21268518Lb.LJ);
        c384050F3z.LIZJ = Float.valueOf(this.LLJILJIL.LJFF);
        C21268518Lb c21268518Lb2 = this.LLJILJIL;
        c384050F3z.LIZIZ = c21268518Lb2.LIZIZ;
        c384050F3z.LIZ = Integer.valueOf(c21268518Lb2.LIZ);
        setBackground(c384050F3z.LIZ(getContext()));
    }

    public final PanelVoucherInfo getVoucherInfo() {
        return this.LLIZ;
    }

    public final String getVoucherState() {
        return this.LLILZLL;
    }

    public C21268418La(Context context) {
        super(context, null, 0);
        C1701430uNR.LIZ(context, R.layout.aq5, this, true);
        setLayerType(2, null);
        this.LLILZLL = "claim";
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(457));
        float f = 6;
        this.LLJ = C0H9H.LIZ(f);
        this.LLJI = C0H9H.LIZ(f);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1142));
        this.LLJILJIL = new C21268518Lb(Integer.valueOf(R.attr.wy), Integer.valueOf(R.attr.x1), (int) C418440Gaw.LIZIZ(Double.valueOf(0.5d)), C0H9H.LIZ(f));
    }

    private final void setBackgroundConfig(C21268518Lb c21268518Lb) {
        if (c21268518Lb == null) {
            c21268518Lb = this.LLJILJIL;
        }
        this.LLJILJIL = c21268518Lb;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iLIZ;
        Paint circlePaint = getCirclePaint();
        C21268518Lb c21268518Lb = this.LLJILJIL;
        Integer num = c21268518Lb.LIZLLL;
        if (num != null) {
            iLIZ = C960203pA.LIZ(num.intValue(), getContext());
        } else {
            iLIZ = c21268518Lb.LIZJ;
        }
        circlePaint.setColor(iLIZ);
        getCirclePaint().setStrokeWidth(this.LLJILJIL.LJ);
        float height = (float) ((((double) getHeight()) / 2.0d) - (((double) this.LLJI) / 2.0d));
        Paint ellipsePaint = getEllipsePaint();
        float f = 0;
        float f2 = 2;
        float f3 = this.LLJ / f2;
        canvas.drawOval(f - f3, height, f + f3, height + this.LLJI, ellipsePaint);
        canvas.drawOval(getWidth() - (this.LLJ / f2), height, getWidth() + (this.LLJ / f2), height + this.LLJI, getEllipsePaint());
        Paint circlePaint2 = getCirclePaint();
        float f4 = this.LLJ / f2;
        canvas.drawArc(f - f4, height, f + f4, height + this.LLJI, 0.0f, 360.0f, false, circlePaint2);
        canvas.drawArc(getWidth() - (this.LLJ / f2), height, getWidth() + (this.LLJ / f2), height + this.LLJI, 0.0f, 360.0f, false, getCirclePaint());
    }

    public final void setCouponBtnFromXml(C197039127h c197039127h) {
        this.LLILLL = c197039127h;
    }

    public final void setCouponExplainFromXml(C430740Gum c430740Gum) {
        this.LLILLJJLI = c430740Gum;
    }

    public final void setCouponTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void LIZ(PanelVoucherInfo panelVoucherInfo, Function0<Unit> function0) {
        String str;
        String str2;
        String str3 = null;
        if (panelVoucherInfo != null && (str = panelVoucherInfo.buttonText) != null && str.length() != 0) {
            if (Intrinsics.LJFF(this.LLILZLL, "use") && (panelVoucherInfo == null || (str2 = panelVoucherInfo.fullVapSchema) == null || str2.length() == 0)) {
                C197039127h couponBtnFromXml = getCouponBtnFromXml();
                if (panelVoucherInfo != null) {
                    str3 = panelVoucherInfo.buttonText;
                }
                couponBtnFromXml.setText(str3);
                getCouponBtnFromXml().setEnabled(false);
                getCouponBtnFromXml().LJJJJL(AFwS278S0000000_32.get$arr$(145));
                getCouponBtnFromXml().setTextColorRes(R.attr.wf);
                return;
            }
            function0.invoke();
            return;
        }
        C03DZ.LIZ(getCouponBtnFromXml());
    }

    public final void LIZJ(PanelVoucherInfo panelVoucherInfo, String str) {
        String str2;
        String str3;
        this.LLILZLL = str;
        this.LLIZ = panelVoucherInfo;
        TuxTextView couponTitleFromXml = getCouponTitleFromXml();
        PanelVoucherInfo panelVoucherInfo2 = this.LLIZ;
        String str4 = null;
        if (panelVoucherInfo2 != null) {
            str2 = panelVoucherInfo2.discountText;
        } else {
            str2 = null;
        }
        couponTitleFromXml.setText(str2);
        C21269818Lo c21269818Lo = C21269818Lo.LIZ;
        TuxTextView couponTitleFromXml2 = getCouponTitleFromXml();
        c21269818Lo.getClass();
        C21269818Lo.LIZIZ(couponTitleFromXml2);
        C430740Gum couponExplainFromXml = getCouponExplainFromXml();
        PanelVoucherInfo panelVoucherInfo3 = this.LLIZ;
        if (panelVoucherInfo3 != null) {
            str3 = panelVoucherInfo3.thresholdText;
            TermsApply termsApply = panelVoucherInfo3.termsApply;
            if (termsApply != null) {
                str4 = termsApply.termsApplyText;
            }
        } else {
            str3 = null;
        }
        C430740Gum.LJJJJL(couponExplainFromXml, str3, str4, new AwS576S0100000_32(this, 526));
        LIZ(panelVoucherInfo, new AwS146S1200000_31(this, panelVoucherInfo, str, 6));
    }

    public static void LIZIZ(C21268418La c21268418La, PanelVoucherInfo panelVoucherInfo, AwS5S3200000_32 awS5S3200000_32, C18LV c18lv, AwS5S3200000_32 awS5S3200000_322) {
        String str;
        String str2;
        String str3;
        c21268418La.LLIZ = panelVoucherInfo;
        C1739800vNK.LIZ.getClass();
        if (C1739800vNK.LIZ(panelVoucherInfo) <= 0) {
            c21268418La.LIZJ(panelVoucherInfo, "claim");
        } else {
            c21268418La.LIZJ(panelVoucherInfo, "use");
        }
        TuxTextView couponTitleFromXml = c21268418La.getCouponTitleFromXml();
        PanelVoucherInfo panelVoucherInfo2 = c21268418La.LLIZ;
        if (panelVoucherInfo2 != null) {
            str = panelVoucherInfo2.discountText;
        } else {
            str = null;
        }
        couponTitleFromXml.setText(str);
        C21269818Lo c21269818Lo = C21269818Lo.LIZ;
        TuxTextView couponTitleFromXml2 = c21268418La.getCouponTitleFromXml();
        c21269818Lo.getClass();
        C21269818Lo.LIZIZ(couponTitleFromXml2);
        C430740Gum couponExplainFromXml = c21268418La.getCouponExplainFromXml();
        PanelVoucherInfo panelVoucherInfo3 = c21268418La.LLIZ;
        if (panelVoucherInfo3 != null) {
            str2 = panelVoucherInfo3.thresholdText;
            TermsApply termsApply = panelVoucherInfo3.termsApply;
            if (termsApply != null) {
                str3 = termsApply.termsApplyText;
            }
            C430740Gum.LJJJJL(couponExplainFromXml, str2, str3, new AwS433S0200000_32((Function1) awS5S3200000_322, (Function1<? super PanelVoucherInfo, Unit>) c21268418La, (C21268418La) 56));
            c21268418La.LIZ(panelVoucherInfo, new AwS276S0300000_32(c21268418La, (C21268418La) panelVoucherInfo, (PanelVoucherInfo) c18lv, (Function2<? super C21268418La, ? super PanelVoucherInfo, Unit>) 15));
            c21268418La.LLILZIL = awS5S3200000_322;
            c21268418La.LLILZ = awS5S3200000_32;
            c21268418La.setBackgroundConfig(null);
            awS5S3200000_32.invoke(c21268418La);
            C12ES.LJIILL(0, c21268418La);
        }
        str2 = null;
        str3 = null;
        C430740Gum.LJJJJL(couponExplainFromXml, str2, str3, new AwS433S0200000_32((Function1) awS5S3200000_322, (Function1<? super PanelVoucherInfo, Unit>) c21268418La, (C21268418La) 56));
        c21268418La.LIZ(panelVoucherInfo, new AwS276S0300000_32(c21268418La, (C21268418La) panelVoucherInfo, (PanelVoucherInfo) c18lv, (Function2<? super C21268418La, ? super PanelVoucherInfo, Unit>) 15));
        c21268418La.LLILZIL = awS5S3200000_322;
        c21268418La.LLILZ = awS5S3200000_32;
        c21268418La.setBackgroundConfig(null);
        awS5S3200000_32.invoke(c21268418La);
        C12ES.LJIILL(0, c21268418La);
    }
}

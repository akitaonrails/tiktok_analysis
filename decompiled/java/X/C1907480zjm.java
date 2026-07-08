package X;

import Y.ARunnableS0S1201000_4;
import Y.ATListenerS460S0100000_28;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TextPair;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907480zjm extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public C1246520iXi LLJ;
    public SpannableStringBuilder LLJI;
    public InterfaceC1685420txc<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super View, Unit> LLJIJIL;

    private final int getTitleMaxLine() {
        return 2;
    }

    public final void z0() {
        this.LLJ = null;
        C424560Gko bannerCover = getBannerCover();
        if (bannerCover != null) {
            C786410Ut5.p(bannerCover, 8);
        }
        C424560Gko bannerCover2 = getBannerCover();
        if (bannerCover2 != null) {
            C786410Ut5.H9(bannerCover2, null);
        }
        C424560Gko bannerCover3 = getBannerCover();
        if (bannerCover3 != null) {
            bannerCover3.setOnTouchListener(null);
        }
        TuxTextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText("");
        }
        this.LLJI = null;
        TuxTextView contentView = getContentView();
        if (contentView != null) {
            contentView.setText("");
        }
        TuxTextView contentView2 = getContentView();
        if (contentView2 != null) {
            C786410Ut5.LLLLZLL(contentView2, 8);
        }
        TuxTextView contentView3 = getContentView();
        if (contentView3 != null) {
            contentView3.setMovementMethod(null);
        }
        TuxTextView contentView4 = getContentView();
        if (contentView4 != null) {
            contentView4.setOnTouchListener(null);
        }
        View contentEllipsizeView = getContentEllipsizeView();
        if (contentEllipsizeView != null) {
            C786410Ut5.LJLLLLLL(8, contentEllipsizeView);
        }
        View contentEllipsizeView2 = getContentEllipsizeView();
        if (contentEllipsizeView2 != null) {
            contentEllipsizeView2.setOnTouchListener(null);
        }
        View contentEllipsizeView3 = getContentEllipsizeView();
        if (contentEllipsizeView3 != null) {
            C786410Ut5.I7(null, contentEllipsizeView3);
        }
        ConstraintLayout structureContent = getStructureContent();
        if (structureContent != null) {
            C786410Ut5.LL(8, structureContent);
        }
        ConstraintLayout structureContent2 = getStructureContent();
        if (structureContent2 != null) {
            C786410Ut5.LJJJJL(structureContent2);
        }
        C424560Gko rightCoverWithContent = getRightCoverWithContent();
        if (rightCoverWithContent != null) {
            C786410Ut5.p(rightCoverWithContent, 8);
        }
        C424560Gko rightCoverWithContent2 = getRightCoverWithContent();
        if (rightCoverWithContent2 != null) {
            C786410Ut5.H9(rightCoverWithContent2, null);
        }
        C424560Gko rightCoverWithStructureContent = getRightCoverWithStructureContent();
        if (rightCoverWithStructureContent != null) {
            C786410Ut5.p(rightCoverWithStructureContent, 8);
        }
        C424560Gko rightCoverWithStructureContent2 = getRightCoverWithStructureContent();
        if (rightCoverWithStructureContent2 != null) {
            C786410Ut5.H9(rightCoverWithStructureContent2, null);
        }
        TuxTextView bottomTime = getBottomTime();
        if (bottomTime != null) {
            C786410Ut5.LLLLZLL(bottomTime, 8);
        }
    }

    private final C424560Gko getBannerCover() {
        return (C424560Gko) this.LLILZ.getValue();
    }

    private final String getBottomCreateTime() {
        MusNotice musNotice;
        C1246520iXi c1246520iXi = this.LLJ;
        if (c1246520iXi == null || (musNotice = c1246520iXi.LL) == null) {
            return "";
        }
        long j = musNotice.createTime;
        if (j == 0) {
            return "";
        }
        C1866820ygC.LIZ.getClass();
        String strReplace = new Regex("(.)").replace(C1866820ygC.LIZ() ? C2215101Bmm.LJI(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C1866820ygC.LIZIZ()) : C1356610lPH.LJFF(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), getContext()), "$1\u2060");
        if (!C444960Hcc.LIZJ(getContext())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((char) 8237);
            sbLIZ.append(strReplace);
            sbLIZ.append((char) 8237);
            strReplace = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C444960Hcc.LIZ(getContext()));
        sbLIZ2.append(strReplace);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    private final TuxTextView getBottomTime() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    private final int getContentMaxLine() {
        C01GW c01gw = C0AP0.LIZ;
        return ((Number) c01gw.getValue()).intValue() > 0 ? ((Number) c01gw.getValue()).intValue() : (!p0() || s0()) ? 2 : 3;
    }

    private final TuxTextView getContentView() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final C424560Gko getRightCoverWithContent() {
        return (C424560Gko) this.LLILZIL.getValue();
    }

    private final C424560Gko getRightCoverWithStructureContent() {
        return (C424560Gko) this.LLILZLL.getValue();
    }

    private final ConstraintLayout getStructureContent() {
        return (ConstraintLayout) this.LLIZ.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.LL.getValue();
    }

    public final View getContentEllipsizeView() {
        return (View) this.LLILLL.getValue();
    }

    public final boolean p0() {
        MusNotice musNotice;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        C1246520iXi c1246520iXi = this.LLJ;
        return (c1246520iXi == null || (musNotice = c1246520iXi.LL) == null || (generalTemplateNotice = musNotice.templateNotice) == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || noticeUITemplate.rightType != 11) ? false : true;
    }

    public final boolean s0() {
        MusNotice musNotice;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        List<TextPair> list;
        C1246520iXi c1246520iXi = this.LLJ;
        return !(c1246520iXi == null || (musNotice = c1246520iXi.LL) == null || (generalTemplateNotice = musNotice.templateNotice) == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || (list = noticeUITemplate.textPair) == null || list.isEmpty());
    }

    public final boolean u0() {
        MusNotice musNotice;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        GeneralTemplateNotice generalTemplateNotice2;
        NoticeUITemplate noticeUITemplate2;
        GeneralTemplateNotice generalTemplateNotice3;
        NoticeUITemplate noticeUITemplate3;
        C1246520iXi c1246520iXi = this.LLJ;
        if (c1246520iXi == null) {
            return false;
        }
        MusNotice musNotice2 = c1246520iXi.LL;
        if (musNotice2 != null && (generalTemplateNotice3 = musNotice2.templateNotice) != null && (noticeUITemplate3 = generalTemplateNotice3.uiTemplate) != null) {
            if (noticeUITemplate3.bannerImageUrl != null) {
                return true;
            }
            if (c1246520iXi == null) {
                return false;
            }
        }
        MusNotice musNotice3 = c1246520iXi.LL;
        if (musNotice3 != null && (generalTemplateNotice2 = musNotice3.templateNotice) != null && (noticeUITemplate2 = generalTemplateNotice2.uiTemplate) != null) {
            if (noticeUITemplate2.textPair != null) {
                return true;
            }
            if (c1246520iXi == null) {
                return false;
            }
        }
        MusNotice musNotice4 = c1246520iXi.LL;
        if (musNotice4 == null || musNotice4.templateNotice == null) {
            return false;
        }
        return c1246520iXi == null || (musNotice = c1246520iXi.LL) == null || (generalTemplateNotice = musNotice.templateNotice) == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || noticeUITemplate.content == null;
    }

    private final int getContentWidth() {
        return C12ES.LJIIJ(getContext()) - ((int) C12ES.LIZJ(((!p0() || s0()) ? 0.0f : 72.0f) + 64.0f, getContext()));
    }

    private final int getTitleWidth() {
        return C12ES.LJIIJ(getContext()) - ((int) C12ES.LIZJ(64.0f, getContext()));
    }

    public final void e0() {
        if (u0()) {
            TuxTextView bottomTime = getBottomTime();
            if (bottomTime != null) {
                bottomTime.setText(getBottomCreateTime());
            }
            TuxTextView bottomTime2 = getBottomTime();
            if (bottomTime2 != null) {
                C786410Ut5.LLLLZLL(bottomTime2, 0);
            }
        }
    }

    public final void n0() {
        TuxTextView contentView = getContentView();
        if (contentView != null) {
            contentView.setText(this.LLJI);
        }
        View contentEllipsizeView = getContentEllipsizeView();
        if (contentEllipsizeView != null) {
            C786410Ut5.LJLLLLLL(8, contentEllipsizeView);
        }
        C1246520iXi c1246520iXi = this.LLJ;
        if (c1246520iXi != null) {
            c1246520iXi.LLIZLLLIL = false;
        }
    }

    public final void j0(String str) {
        MusNotice musNotice;
        TuxTextView contentView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String strAddCreateTimeSpan;
        int iLIZIZ;
        SpannableStringBuilder spannableStringBuilderLIZJ;
        C1246520iXi c1246520iXi;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C1246520iXi c1246520iXi2 = this.LLJ;
        if (c1246520iXi2 == null || (musNotice = c1246520iXi2.LL) == null || (contentView = getContentView()) == null) {
            return;
        }
        C786410Ut5.LLLLZLL(contentView, 0);
        if (p0() && !s0()) {
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                }
            } else {
                marginLayoutParams2 = null;
            }
            C786410Ut5.R6(contentView, marginLayoutParams2);
        } else {
            ViewGroup.LayoutParams layoutParams2 = contentView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginEnd(0);
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.R6(contentView, marginLayoutParams);
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append((CharSequence) str);
        this.LLJI = new SpannableStringBuilder(c1360520lVa.LIZ);
        if (!u0()) {
            strAddCreateTimeSpan = AbstractC1906850zil.addCreateTimeSpan(this.LLJI, musNotice, getContext(), null);
        } else {
            strAddCreateTimeSpan = "";
        }
        if (C279930Ay7.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        } else {
            iLIZIZ = 0;
        }
        SpannableStringBuilder spannableStringBuilder = this.LLJI;
        if (spannableStringBuilder != null && (spannableStringBuilderLIZJ = C1907170zjH.LIZJ(spannableStringBuilder, contentView.getPaint(), getContentWidth(), getContentMaxLine(), strAddCreateTimeSpan.length(), ((int) contentView.getPaint().measureText(strAddCreateTimeSpan)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) + iLIZIZ)) != null) {
            if (!Intrinsics.LJFF(spannableStringBuilderLIZJ.toString(), String.valueOf(this.LLJI)) && (c1246520iXi = this.LLJ) != null && c1246520iXi.LLIZLLLIL) {
                TextPaint paint = contentView.getPaint();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("... ");
                sbLIZ.append(strAddCreateTimeSpan);
                int iMax = Math.max(((int) paint.measureText(C2188811AlT.LIZIZ(sbLIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
                contentView.setMovementMethod(C431440Gvu.LIZ());
                contentView.setOnTouchListener(new ATListenerS460S0100000_28(this, 0));
                View contentEllipsizeView = getContentEllipsizeView();
                if (contentEllipsizeView != null) {
                    contentEllipsizeView.setOnTouchListener(new ATListenerS460S0100000_28(this, 1));
                }
                if (C279930Ay7.LIZ()) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilderLIZJ);
                    int iLJJJJI = a0.LJJJJI(spannableStringBuilder2.toString(), "... ", 0, 6);
                    if (iLJJJJI >= 0) {
                        int i = iLJJJJI + 3;
                        int i2 = i + 1;
                        spannableStringBuilder2.replace(i, i2, (CharSequence) "￼");
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_chevron_down;
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                        C786410Ut5.q2(spannableStringBuilder2, c419910GdJ.LIZIZ(2, getContext()), i, i2, 33);
                        int iLJJJ = a0.LJJJ(spannableStringBuilder2.toString(), "...￼", 0, false, 6);
                        for (int i3 = 0; iLJJJ > 0 && i3 < 20 && new StaticLayout(spannableStringBuilder2, contentView.getPaint(), getContentWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > getContentMaxLine(); i3++) {
                            iLJJJ--;
                            spannableStringBuilder2.delete(iLJJJ, iLJJJ + 1);
                        }
                    }
                    spannableStringBuilderLIZJ = spannableStringBuilder2;
                }
                final int iLIZ = C1618770sE7.LIZ(R.attr.a1k);
                final int iLIZ2 = C1618770sE7.LIZ(R.attr.a1k);
                C786410Ut5.q2(spannableStringBuilderLIZJ, new AbstractC431450Gvv(iLIZ, iLIZ2) { // from class: X.0zjn
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        this.LLILZ.n0();
                    }

                    @Override // X.AbstractC431450Gvv, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                    }
                }, (spannableStringBuilderLIZJ.length() - strAddCreateTimeSpan.length()) - 4, spannableStringBuilderLIZJ.length(), 17);
                contentView.setText(spannableStringBuilderLIZJ);
                HandlerHook.viewPost(contentView, new ARunnableS0S1201000_4(contentView, iMax, strAddCreateTimeSpan, this, 0));
                return;
            }
            contentView.setText(this.LLJI);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.0GVC, java.lang.Object] */
    public final void l0(String str) {
        C1246520iXi c1246520iXi;
        MusNotice musNotice;
        int i;
        MusNotice musNotice2;
        TuxTextView titleView = getTitleView();
        if (titleView != null && (c1246520iXi = this.LLJ) != null && (musNotice = c1246520iXi.LL) != null) {
            if (str.length() == 0) {
                C1246460iXc.LIZ.getClass();
                C1246460iXc.LIZ(musNotice, "title_error", null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            C1246520iXi c1246520iXi2 = this.LLJ;
            if ((c1246520iXi2 != null && (musNotice2 = c1246520iXi2.LL) != null && musNotice2.isUnsubscribe()) || 0 != 0) {
                titleView.setMaxLines(Integer.MAX_VALUE);
                String strLIZJ = C1618770sE7.LIZJ(2131837853);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) strLIZJ);
                if (C635610OwR.LIZ()) {
                    i = R.attr.a1k;
                } else {
                    i = R.attr.a1p;
                }
                final int iLIZ = C1618770sE7.LIZ(R.attr.a03);
                final int iLIZ2 = C1618770sE7.LIZ(i);
                final float fLIZIZ = C418440Gaw.LIZIZ(4);
                ?? r4 = new ReplacementSpan(fLIZIZ, iLIZ, iLIZ2) { // from class: X.0GVC
                    public final int LL;
                    public final int LLILLJJLI;
                    public final float LLILLL;
                    public final float LLILZ = 0.0f;
                    public final C01GW LLILZIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(273));

                    public final int LIZ() {
                        return ((Number) this.LLILZIL.getValue()).intValue();
                    }

                    {
                        this.LL = iLIZ;
                        this.LLILLJJLI = iLIZ2;
                        this.LLILLL = fLIZIZ;
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                        return ((int) paint.measureText(charSequence, i2, i3)) + (LIZ() * 2);
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        RectF rectF = new RectF(f, i4 + this.LLILZ, paint.measureText(charSequence, i2, i3) + f + (LIZ() * 2), i6 - this.LLILZ);
                        paint.setColor(this.LL);
                        float f2 = this.LLILLL;
                        canvas.drawRoundRect(rectF, f2, f2, paint);
                        paint.setColor(this.LLILLJJLI);
                        canvas.drawText(charSequence, i2, i3, f + LIZ(), ((rectF.top + rectF.bottom) / 2.0f) - ((paint.descent() + paint.ascent()) / 2.0f), paint);
                    }
                };
                C786410Ut5.q2(spannableStringBuilder, r4, spannableStringBuilder.length() - strLIZJ.length(), spannableStringBuilder.length(), 17);
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(92, false), spannableStringBuilder.length() - strLIZJ.length(), spannableStringBuilder.length(), 17);
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) C1907170zjH.LIZJ(spannableStringBuilder, titleView.getPaint(), getTitleWidth(), getTitleMaxLine(), strLIZJ.length(), ((int) titleView.getPaint().measureText(strLIZJ)) + (r4.LIZ() * 2)));
                titleView.setText(c1360520lVa.LIZ);
                return;
            }
            C1360520lVa c1360520lVa2 = new C1360520lVa();
            c1360520lVa2.LIZ.append((CharSequence) str);
            titleView.setText(c1360520lVa2.LIZ);
            titleView.setMaxLines(2);
        }
    }

    public final void setIncreaseClickAreaMethod(InterfaceC1685420txc<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super View, Unit> interfaceC1685420txc) {
        this.LLJIJIL = interfaceC1685420txc;
    }

    public C1907480zjm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void h0(String str, String str2) {
        l0(str);
        if (str2 != null && str2.length() > 0) {
            TuxTextView contentView = getContentView();
            if (contentView != null) {
                C786410Ut5.LLLLZLL(contentView, 0);
            }
            j0(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(X.C1246520iXi r16, X.C1907440zji r17) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907480zjm.i0(X.0iXi, X.0zji):void");
    }

    public C1907480zjm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 342));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 338));
        this.LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 337));
        this.LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 335));
        this.LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 339));
        this.LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 340));
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 341));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 336));
        ViewGroup.inflate(context, R.layout.abp, this);
    }
}

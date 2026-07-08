package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.a0;
import njp.a;
import webcast.api.feed.NoticeItem;

/* JADX INFO: renamed from: X.0H4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem$bindTitleText$1$3$1", f = "LiveNotificationItem.kt", l = {209}, m = "invokeSuspend")
public final class C0H4Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveNotificationItem LLILLJJLI;
    public final /* synthetic */ SpannableStringBuilder LLILLL;
    public final /* synthetic */ NoticeItem LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ TextPaint LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H4Q(LiveNotificationItem liveNotificationItem, SpannableStringBuilder spannableStringBuilder, NoticeItem noticeItem, int i, TextPaint textPaint, InterfaceC1364105Vn<? super C0H4Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveNotificationItem;
        this.LLILLL = spannableStringBuilder;
        this.LLILZ = noticeItem;
        this.LLILZIL = i;
        this.LLILZLL = textPaint;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H4Q(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int i;
        Integer numLIZJ;
        C1C7U.LIZ("LiveNotificationItem@bfb8.bindTitleText$1$3$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LiveNotificationItem liveNotificationItem = this.LLILLJJLI;
            SpannableStringBuilder spannableStringBuilderAppend = this.LLILLL;
            NoticeItem noticeItem = this.LLILZ;
            int i3 = this.LLILZIL;
            TextPaint textPaint = this.LLILZLL;
            liveNotificationItem.getClass();
            if (noticeItem.createTime > 0) {
                String string = spannableStringBuilderAppend.toString();
                long j = noticeItem.createTime;
                Context context = liveNotificationItem.getContext();
                if (j > 0 && context != null) {
                    String strReplace = new Regex("(.)").replace(C1356610lPH.LJFF(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), context), "$1\u2060");
                    if (!C444960Hcc.LIZJ(context)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((char) 8237);
                        sbLIZ2.append(strReplace);
                        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                        sbLIZ.append((char) 8237);
                        strReplace = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    string = " " + C444960Hcc.LIZ(context) + strReplace;
                }
                if (string.length() != 0) {
                    Context context2 = liveNotificationItem.getContext();
                    if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context2)) != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int i4 = 2;
                    if (a0.LJJIZ(string, (char) 8237, 0, false, 6) > -1) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), i, spannableStringBuilder.length(), 17);
                    SpannableStringBuilder spannableStringBuilderAppend2 = new SpannableStringBuilder(spannableStringBuilderAppend).append((CharSequence) spannableStringBuilder);
                    if (StaticLayout.Builder.obtain(spannableStringBuilderAppend2, 0, spannableStringBuilderAppend2.length(), textPaint, i3).build().getLineCount() <= 6) {
                        spannableStringBuilderAppend = spannableStringBuilderAppend2;
                    } else {
                        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(spannableStringBuilderAppend, 0, spannableStringBuilderAppend.length(), textPaint, i3).build();
                        int lineEnd = staticLayoutBuild.getLineEnd(Math.min(5, staticLayoutBuild.getLineCount() - 1));
                        int i5 = 0;
                        while (i5 < lineEnd) {
                            int i6 = ((i5 + lineEnd) + 1) / i4;
                            SpannableStringBuilder spannableStringBuilderAppend3 = new SpannableStringBuilder(spannableStringBuilderAppend.subSequence(0, i6)).append((CharSequence) "…").append((CharSequence) string);
                            if (StaticLayout.Builder.obtain(spannableStringBuilderAppend3, 0, spannableStringBuilderAppend3.length(), textPaint, i3).build().getLineCount() <= 6) {
                                i5 = i6;
                            } else {
                                lineEnd = i6 - 1;
                            }
                            i4 = 2;
                        }
                        spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilderAppend.subSequence(0, i5)).append((CharSequence) "…").append((CharSequence) spannableStringBuilder);
                    }
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0H4R c0h4r = new C0H4R(this.LLILLJJLI, spannableStringBuilderAppend, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0h4r) == objLJFF) {
                C1C7U.LIZIZ("LiveNotificationItem@bfb8.bindTitleText$1$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotificationItem@bfb8.bindTitleText$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

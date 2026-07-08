package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: renamed from: X.0M37, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M37 extends MetricAffectingSpan {
    public MentionDataItem LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Typeface LLILZ;

    public final void LIZ(TextPaint textPaint) {
        int i;
        textPaint.setTypeface(this.LLILZ);
        MentionDataItem mentionDataItem = this.LL;
        if (mentionDataItem != null && C549450Lgl.LIZIZ(mentionDataItem)) {
            i = this.LLILLJJLI;
        } else {
            i = this.LLILLL;
        }
        textPaint.setColor(i);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    public C0M37(MentionDataItem mentionDataItem, int i, int i2, Typeface typeface) {
        this.LL = mentionDataItem;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = typeface == null ? C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 0.0f, 0.0f, null, 0.0f, 0, null, 253) : typeface;
    }
}

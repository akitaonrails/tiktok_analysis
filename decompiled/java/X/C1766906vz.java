package X;

import Y.ARunnableS102S0100000_2;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.contentcell.FeedbackGuideCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1766906vz extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C1766906vz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C1766906vz c1766906vz, View view) {
        Function0<Unit> function0;
        C1672206gi item = ((FeedbackGuideCell) c1766906vz.l0).getItem();
        if (item != null && (function0 = item.LL) != null) {
            function0.invoke();
        }
    }

    public static final void onClick$1(C1766906vz c1766906vz, View view) {
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2((Function0) c1766906vz.l0, (Function0<Unit>) 1180);
        ARunnableS102S0100000_2 aRunnableS102S0100000_2 = C1524705y1.LIZJ;
        if (aRunnableS102S0100000_2 != null) {
            C1524705y1.LIZIZ.removeCallbacks(aRunnableS102S0100000_2);
        }
        ARunnableS102S0100000_2 aRunnableS102S0100000_22 = new ARunnableS102S0100000_2(awS546S0100000_2, 73);
        C1524705y1.LIZJ = aRunnableS102S0100000_22;
        C786410Ut5.LJLIIL(500L, C1524705y1.LIZIZ, aRunnableS102S0100000_22);
    }

    public static final void updateDrawState$0(C1766906vz c1766906vz, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C497740JfY.LIZLLL(R.attr.ezq, ((FeedbackGuideCell) c1766906vz.l0).getContext()));
        textPaint.setUnderlineText(false);
    }
}

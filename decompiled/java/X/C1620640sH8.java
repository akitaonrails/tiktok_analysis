package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: X.0sH8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620640sH8 extends ClickableSpan {
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
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C1620640sH8(C1604330rqp c1604330rqp, int i) {
        this.$t = i;
        this.l0 = c1604330rqp;
    }

    public static final void onClick$0(C1620640sH8 c1620640sH8, View view) {
        InterfaceC1604170rqZ videoDownloadClickListener;
        if (((C1604330rqp) c1620640sH8.l0).getDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = ((C1604330rqp) c1620640sH8.l0).getVideoDownloadClickListener()) != null) {
            videoDownloadClickListener.zc(true);
        }
    }

    public static final void onClick$1(C1620640sH8 c1620640sH8, View view) {
        InterfaceC1604170rqZ videoDownloadClickListener;
        if (((C1604330rqp) c1620640sH8.l0).getDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = ((C1604330rqp) c1620640sH8.l0).getVideoDownloadClickListener()) != null) {
            videoDownloadClickListener.zc(false);
        }
    }

    public static final void updateDrawState$0(C1620640sH8 c1620640sH8, TextPaint textPaint) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(83);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }

    public static final void updateDrawState$1(C1620640sH8 c1620640sH8, TextPaint textPaint) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(83);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }
}

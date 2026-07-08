package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0g4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151450g4N extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void updateDrawState$0(C1151450g4N c1151450g4N, TextPaint textPaint) {
    }

    public static final void updateDrawState$1(C1151450g4N c1151450g4N, TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
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
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            case 3:
                updateDrawState$3(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C1151450g4N(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C1151450g4N c1151450g4N, View view) {
        ((Runnable) c1151450g4N.l0).run();
    }

    public static final void onClick$1(C1151450g4N c1151450g4N, View view) {
        ((Runnable) c1151450g4N.l0).run();
    }

    public static final void onClick$2(C1151450g4N c1151450g4N, View view) {
        ((Runnable) c1151450g4N.l0).run();
    }

    public static final void onClick$3(C1151450g4N c1151450g4N, View view) {
        C1129920fVe c1129920fVe = (C1129920fVe) c1151450g4N.l0;
        if (c1129920fVe.LIZIZ) {
            ((IActionHandlerService) c1129920fVe.LIZJ.getValue()).handle(((C1129920fVe) c1151450g4N.l0).LIZ, "https://support.tiktok.com/en/live-gifts-wallet/tiktok-live/live-gifts-on-tiktok");
        } else {
            ((IActionHandlerService) c1129920fVe.LIZJ.getValue()).handle(((C1129920fVe) c1151450g4N.l0).LIZ, "https://support.tiktok.com/en/live-gifts-wallet/gifts/send-a-gift-during-a-live-on-tiktok");
        }
    }

    public static final void updateDrawState$2(C1151450g4N c1151450g4N, TextPaint textPaint) {
        textPaint.setColor(ColorProtector.parseColor("#FE2C55"));
    }

    public static final void updateDrawState$3(C1151450g4N c1151450g4N, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}

package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01z1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C511701z1 extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void updateDrawState$0(C511701z1 c511701z1, TextPaint textPaint) {
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
            case 4:
                onClick$4(this, view);
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
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C511701z1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C511701z1 c511701z1, View view) {
        ((Runnable) c511701z1.l0).run();
    }

    public static final void onClick$1(C511701z1 c511701z1, View view) {
        ((Function1) c511701z1.l0).invoke(view);
    }

    public static final void onClick$2(C511701z1 c511701z1, View view) {
        ((Function1) c511701z1.l0).invoke(view);
    }

    public static final void onClick$3(C511701z1 c511701z1, View view) {
        String str;
        String str2;
        C250000xu.LIZ.getClass();
        int iLIZIZ = C250000xu.LIZIZ();
        LiveEditText liveEditText = (LiveEditText) c511701z1.l0;
        if (liveEditText != null) {
            liveEditText.setText(String.valueOf(iLIZIZ));
        }
        boolean zLJ = C250000xu.LJ();
        String str3 = C250000xu.LJJIJIIJI;
        String str4 = C250000xu.LJJIJIIJIL;
        if (C250000xu.LJIJI > C250000xu.LJIJJ) {
            str = "highest";
        } else {
            str = "suggest";
        }
        boolean z = C250000xu.LJIILL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_limit_gear_setting_apply_click");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJ ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(str3, "first_panel_from");
        c474500IjALIZ.LJJII(str4, "second_panel_from");
        c474500IjALIZ.LJJII("basic", "reminder_type");
        c474500IjALIZ.LJJII(str, "apply_type");
        c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "apply_amount");
        if (z) {
            str2 = "coins";
        } else {
            str2 = "currency";
        }
        c474500IjALIZ.LJJII(str2, "coins_or_currency");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$4(C511701z1 c511701z1, View view) {
        ((Function0) c511701z1.l0).invoke();
    }

    public static final void updateDrawState$1(C511701z1 c511701z1, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C511701z1 c511701z1, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C511701z1 c511701z1, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$4(C511701z1 c511701z1, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}

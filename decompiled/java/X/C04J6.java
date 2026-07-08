package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.04J6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J6 extends ClickableSpan {
    public final int $t;
    public Object l1;
    public String s0;

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
                textPaint.setUnderlineText(false);
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

    public static final void onClick$0(C04J6 c04j6, View view) {
        SmartRouter.buildRoute((Context) c04j6.l1, c04j6.s0).open();
    }

    public static final void onClick$1(C04J6 c04j6, View view) {
        SmartRouter.buildRoute((Context) c04j6.l1, c04j6.s0).open();
    }

    public static final void onClick$2(C04J6 c04j6, View view) {
        C919503ib.LIZIZ(((TextView) c04j6.l1).getContext(), c04j6.s0, new LinkedHashMap(), false).open();
    }

    public static final void onClick$3(C04J6 c04j6, View view) {
        Context context = ((TextView) c04j6.l1).getContext();
        String str = c04j6.s0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("intro_sheet_node_id", C960603pE.LIZLLL((TextView) c04j6.l1));
        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
    }

    public static final void updateDrawState$0(C04J6 c04j6, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, (Context) c04j6.l1));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C04J6 c04j6, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setStrikeThruText(false);
    }

    public static final void updateDrawState$3(C04J6 c04j6, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setStrikeThruText(false);
    }

    public C04J6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1766806vy extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

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
                textPaint.setUnderlineText(false);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C1766806vy c1766806vy, View view) {
        SmartRouter.buildRoute(((C1732606qS) c1766806vy.l0).getContext(), "aweme://chatcontrol/setting").open();
        if (((EnumC1651806dQ) c1766806vy.l1) == EnumC1651806dQ.O18) {
            ((C1732606qS) c1766806vy.l0).LIZ(true);
        } else {
            ((C1732606qS) c1766806vy.l0).LIZ(false);
        }
    }

    public static final void onClick$1(C1766806vy c1766806vy, View view) {
        ((Function0) c1766806vy.l0).invoke();
    }

    public static final void updateDrawState$1(C1766806vy c1766806vy, TextPaint textPaint) {
        int iIntValue;
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, ((C1671006gW) c1766806vy.l1).getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public C1766806vy(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

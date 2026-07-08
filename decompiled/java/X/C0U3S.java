package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U3S, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3S extends ClickableSpan {
    public final String LL;
    public final Context LLILLJJLI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILLJJLI, this.LL);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C20736316Cj.LIZIZ(R.attr.ewy, this.LLILLJJLI));
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public C0U3S(String str, Context context) {
        this.LL = str;
        this.LLILLJJLI = context;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0wYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785030wYH extends ClickableSpan {
    public final Context LL;
    public final IMQuickReply LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public boolean LLILZ;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        LifecycleCoroutineScope lifecycleScope;
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        if (activityLIZ != null) {
            this.LLILLL.invoke();
            if (!this.LLILZ) {
                this.LLILZ = true;
                LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(activityLIZ);
                if (lifecycleOwnerLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, null, null, new C1784210wWx(this, null), 3);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int iIntValue = 0;
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, this.LL);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        textPaint.setColor(iIntValue);
    }

    public C1785030wYH(Context context, IMQuickReply iMQuickReply, AwS571S0100000_27 awS571S0100000_27) {
        this.LL = context;
        this.LLILLJJLI = iMQuickReply;
        this.LLILLL = awS571S0100000_27;
    }
}

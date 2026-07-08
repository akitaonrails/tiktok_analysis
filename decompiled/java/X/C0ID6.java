package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.utils.IECContextService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ID6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID6 extends ClickableSpan {
    public final int $t;
    public int i1;
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

    public static final void onClick$0(C0ID6 c0id6, View view) {
        Function0 function0 = (Function0) c0id6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$1(C0ID6 c0id6, View view) {
        SmartRouter.buildRoute(view.getContext(), ((C432010Gwp) c0id6.l0).LIZLLL).open();
    }

    public static final void updateDrawState$0(C0ID6 c0id6, TextPaint textPaint) {
        Context context;
        textPaint.setUnderlineText(false);
        IECContextService iECContextService = (IECContextService) PluggableExtentionKt.pluggableSpi$default(IECContextService.class, false, false, false, 14, null);
        if (iECContextService != null && (context = iECContextService.getContext()) != null) {
            textPaint.setColor(C446980Hfs.LIZ(context, c0id6.i1));
        }
    }

    public static final void updateDrawState$1(C0ID6 c0id6, TextPaint textPaint) {
        textPaint.setColor(c0id6.i1);
        textPaint.setUnderlineText(false);
    }

    public C0ID6(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}

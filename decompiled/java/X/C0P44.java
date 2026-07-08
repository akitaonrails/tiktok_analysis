package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.share.improve.action.aidubbing.AIDubbingSheetFragment;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0P44, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P44 extends ClickableSpan {
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

    public static final void onClick$0(C0P44 c0p44, View view) {
        Context context = ((C429640Gt0) c0p44.l0).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(((CommerceSticker) c0p44.l1).getAdOwnerId());
        C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
        c686150Qvl.LIZIZ("sec_user_id", ((CommerceSticker) c0p44.l1).getSecAdOwnerId());
        SmartRouter.buildRoute(context, c686150Qvl.LIZJ()).open();
    }

    public static final void onClick$1(C0P44 c0p44, View view) {
        AwS565S0100000_21 awS565S0100000_21 = ((AIDubbingSheetFragment) c0p44.l0).LLJ;
        if (awS565S0100000_21 != null) {
            awS565S0100000_21.invoke();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) c0p44.l1, "aweme://webview");
        smartRouteBuildRoute.withParam("url", "https://support.tiktok.com/en/business-and-creator/creator-tools/ai-dubbing");
        smartRouteBuildRoute.open();
    }

    public static final void updateDrawState$0(C0P44 c0p44, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(C960203pA.LIZ(R.attr.a1k, ((C429640Gt0) c0p44.l0).getContext()));
    }

    public static final void updateDrawState$1(C0P44 c0p44, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, (C19EG) c0p44.l1));
        textPaint.setUnderlineText(false);
    }

    public C0P44(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

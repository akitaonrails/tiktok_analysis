package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Us6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785800Us6 extends ClickableSpan {
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

    public static final void onClick$0(C785800Us6 c785800Us6, View view) {
        ((Function0) c785800Us6.l0).invoke();
    }

    public static final void onClick$1(C785800Us6 c785800Us6, View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://support.tiktok.com/");
        C0TIG.LIZ.getClass();
        String appLanguage = ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage();
        if (Intrinsics.LJFF(appLanguage, "he")) {
            appLanguage = "he_IL";
        } else if (Intrinsics.LJFF(appLanguage, "zh-Hant")) {
            appLanguage = "zh-Hant-TW";
        }
        sbLIZ.append(appLanguage);
        sbLIZ.append("/account-and-privacy/account-privacy-settings/suggested-accounts");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Context context = (Context) c785800Us6.l0;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aweme://webview?url=");
        sbLIZ2.append(strLIZIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ2));
        smartRouteBuildRoute.withParam("show_separate_line", true);
        smartRouteBuildRoute.open();
    }

    public static final void updateDrawState$0(C785800Us6 c785800Us6, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(c785800Us6.i1);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C785800Us6 c785800Us6, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(c785800Us6.i1);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public C785800Us6(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}

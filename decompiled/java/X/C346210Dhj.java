package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Dhj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346210Dhj extends ClickableSpan {
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

    public static final void onClick$0(C346210Dhj c346210Dhj, View view) {
        String strLJI;
        Context context = (Context) c346210Dhj.l0;
        try {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("minor_default_private_hint_intro_url", "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strLJI = null;
        }
        if (TextUtils.isEmpty(strLJI)) {
            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
            strLJI = "aweme://webview/?url=https%3A%2F%2Fsupport.tiktok.com%2F" + ((ILanguageService) C0XPY.LIZIZ(ILanguageService.class)).getAppLanguage() + "%2Faccount-and-privacy%2Faccount-privacy-settings%2Fmaking-your-account-public-or-private";
        }
        SmartRouter.buildRoute(context, strLJI).open();
    }

    public static final void onClick$1(C346210Dhj c346210Dhj, View view) {
        ((Function0) c346210Dhj.l0).invoke();
    }

    public static final void updateDrawState$0(C346210Dhj c346210Dhj, TextPaint textPaint) {
        textPaint.setColor(c346210Dhj.i1);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C346210Dhj c346210Dhj, TextPaint textPaint) {
        textPaint.setColor(c346210Dhj.i1);
        textPaint.setUnderlineText(false);
    }

    public C346210Dhj(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}

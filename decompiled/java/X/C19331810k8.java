package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementAssem;
import com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10k8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19331810k8 extends ClickableSpan {
    public final int $t;
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
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C19331810k8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C19331810k8 c19331810k8, View view) {
        String str = "aweme://webview?url=https%3A%2F%2Fsf-mis.ttwstatic.com%2Fobj%2Fmis-draft-sg%2Fglobal_e_commerce_eu%2F7ac88f39-e476-451b-a137-826328bac155_en.html&use_spark=1&container_bg_color=ffffff&loading_bg_color=ffffff";
        try {
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("identify_similar_products_learn_more_url", "aweme://webview?url=https%3A%2F%2Fsf-mis.ttwstatic.com%2Fobj%2Fmis-draft-sg%2Fglobal_e_commerce_eu%2F7ac88f39-e476-451b-a137-826328bac155_en.html&use_spark=1&container_bg_color=ffffff&loading_bg_color=ffffff");
            if (strLJI != null) {
                str = strLJI;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        SmartRouter.buildRoute(view.getContext(), str).open();
        ((C10KB) c19331810k8.l0).P4("learn_more");
    }

    public static final void onClick$1(C19331810k8 c19331810k8, View view) {
        String stringExtra;
        PasskeyManagementViewModel passkeyManagementViewModelGo = ((PasskeyManagementAssem) c19331810k8.l0).Go();
        Activity activity = passkeyManagementViewModelGo.vQ2().LL.get();
        if (activity != null) {
            Bundle bundle = new Bundle();
            try {
                stringExtra = activity.getIntent().getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            C786410Ut5.LJJJI("enter_from", stringExtra, bundle);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/passwordless/go_passwordless");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open(0, new C19334010kU(passkeyManagementViewModelGo, 1));
        }
    }

    public static final void updateDrawState$0(C19331810k8 c19331810k8, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, ((C10KB) c19331810k8.l0).getContext());
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}

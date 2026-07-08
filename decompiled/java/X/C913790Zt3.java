package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* JADX INFO: renamed from: X.0Zt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913790Zt3 extends ClickableSpan {
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

    public static final void onClick$0(C913790Zt3 c913790Zt3, View view) {
        boolean z;
        Integer numLIZ;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C888920Yu2) c913790Zt3.l0).getContext(), "//chatcontrol/setting/keywords");
        ((C888920Yu2) c913790Zt3.l0).getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("direct_message")) != null && numLIZ.intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        smartRouteBuildRoute.withParam("is_dm_disabled", z);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(C913790Zt3 c913790Zt3, View view) {
        ((C0Z1R) c913790Zt3.l0).LJ();
    }

    public static final void updateDrawState$0(C913790Zt3 c913790Zt3, TextPaint textPaint) {
        textPaint.setColor(c913790Zt3.i1);
    }

    public static final void updateDrawState$1(C913790Zt3 c913790Zt3, TextPaint textPaint) {
        textPaint.setColor(c913790Zt3.i1);
        textPaint.setUnderlineText(false);
    }

    public C913790Zt3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}

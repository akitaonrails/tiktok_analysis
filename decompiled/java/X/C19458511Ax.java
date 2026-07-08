package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS15S2000000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19458511Ax extends ClickableSpan {
    public final Context LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public String LLILZ;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (C1662060tLw.LIZIZ(view)) {
            return;
        }
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        JSONObject jSONObject = new JSONObject();
        C11B9.LIZ(jSONObject, new AwS15S2000000_14(str, str2, 2));
        C2341909Fp.LIZIZ("tiltify_about_click", jSONObject);
        final Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("url", this.LLILZ, bundle);
        C786410Ut5.LJJJI("title", this.LL.getString(2131832346), bundle);
        C786410Ut5.LJJJI("enter_from", "tiltify_page", bundle);
        String str3 = this.LLILZ;
        if (str3 != null) {
            new C828330WeV(new ThirdPartyBizCert(402677760)).LIZIZ(this.LL, str3, new InterfaceC828360WeY() { // from class: X.11Au
                @Override // X.InterfaceC828360WeY
                public final void LIZ(Context context, String str4) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ.LL, "aweme://donation/web/page");
                    smartRouteBuildRoute.withParam(bundle);
                    smartRouteBuildRoute.open();
                }
            }, null);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a04, this.LL));
    }

    public C19458511Ax(Context context, String str, String str2) {
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}

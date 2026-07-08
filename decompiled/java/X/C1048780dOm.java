package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.net.URLEncoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048780dOm {
    public static final /* synthetic */ int LIZJ = 0;
    public AbstractC1028360crq LIZ;
    public C1051290dSp LIZIZ;

    public final AbstractC1028360crq LIZ(Context context, String str) {
        C1028380crs c1028380crs = new C1028380crs("feed_follow_up_ace_survey", C0WOV.SPARK, context, new C1029740cu4(null, null, null, null, null, null, false, 127));
        C1051290dSp c1051290dSp = new C1051290dSp(EnumC1000680c9C.ONLY_RENDER, str, 1, false, new C1049260dPY("feed_follow_up_ace_survey", str, new Bundle(), C1014230cV3.LIZ("feed_follow_up_ace_survey"), new C1020420cf2(), false, null, false, null, null, null, null, 16352), null, false, false, 456);
        this.LIZIZ = c1051290dSp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" realurl = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("PromoteAdHybridDelegate");
        return ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(c1028380crs, c1051290dSp);
    }

    public final void LIZIZ(String str, Context context, C1048930dP1 c1048930dP1, final Function0<Unit> function0) {
        if (context == null || c1048930dP1 == null) {
            return;
        }
        String strEncode = URLEncoder.encode(UriProtector.parse(str).buildUpon().appendQueryParameter("disable_outside_click_close", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("user_convert", c1048930dP1.LIZLLL).appendQueryParameter("brand_name", c1048930dP1.LJ).appendQueryParameter("rate_from", c1048930dP1.LJI).appendQueryParameter("score", c1048930dP1.LJFF).appendQueryParameter("send_notice_time", c1048930dP1.LJIIIIZZ).appendQueryParameter("enter_from", c1048930dP1.LJII).build().toString(), "UTF-8");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview_popup/?url=");
        sbLIZ.append(strEncode);
        AbstractC1028360crq abstractC1028360crqLIZ = LIZ(context, UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("height", "593").appendQueryParameter("disable_outside_click_close", "1").build().toString());
        C1051290dSp c1051290dSp = this.LIZIZ;
        if (c1051290dSp != null && abstractC1028360crqLIZ != null) {
            abstractC1028360crqLIZ.LJJIFFI(c1051290dSp, new InterfaceC1051480dT8() { // from class: X.0dP2
                @Override // X.InterfaceC1051480dT8
                public final void LIZ() {
                }

                @Override // X.InterfaceC1051480dT8
                public final void LIZIZ() {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
    }
}

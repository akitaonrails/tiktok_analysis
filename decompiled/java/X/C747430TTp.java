package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747430TTp {
    public static final C747430TTp LIZ = new C747430TTp();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(477));

    public static void LIZ(Context context, Map map) {
        Uri uriBuild;
        Uri uri;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        C1862330yYx.LJJIJ(c1862330yYx, map);
        TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
        if (C703302op.LIZ(takoInfoModel.helpPageUrl)) {
            Uri.Builder builderBuildUpon2 = UriProtector.parse("aweme://webview/").buildUpon();
            String str = takoInfoModel.helpPageUrl;
            if (str != null && (uri = UriProtector.parse(str)) != null && (builderBuildUpon = uri.buildUpon()) != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("bot_name", takoInfoModel.botName)) != null) {
                uriBuild = builderAppendQueryParameter.build();
            } else {
                uriBuild = null;
            }
            SmartRouter.buildRoute(context, builderBuildUpon2.appendQueryParameter("url", String.valueOf(uriBuild)).build().toString()).open();
        }
    }
}

package X;

import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206830hVh {
    public static final C1206830hVh LIZ = new C1206830hVh();

    public static Map LIZ(ExtensionMisc extensionMisc) {
        return C2097608Jq.LJIIJ(new Pair("content_source", extensionMisc.mobParam.contentSource), new Pair("content_type", extensionMisc.mobParam.contentType), new Pair("creation_id", extensionMisc.mobParam.creationId), new Pair("enter_from", "video_post_page"), new Pair("enter_method", extensionMisc.mobParam.shootEnterMethod), new Pair("shoot_way", extensionMisc.mobParam.shootWay), new Pair("prop_id", extensionMisc.mobParam.propIds));
    }

    public static void LIZIZ(String str, boolean z, String str2, ExtensionMisc extensionMisc) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(LIZ(extensionMisc));
        c2344009Gk.LJIIIIZZ("promote_type", "anchor");
        c2344009Gk.LJIIIIZZ("live_event_id", str);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_free");
        C20684815ws.LJIILLIIL("livesdk_live_event_quickcreate_list_click", c2344009Gk.LIZ);
    }
}

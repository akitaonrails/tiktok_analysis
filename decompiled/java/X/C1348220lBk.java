package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348220lBk {
    public static final C1348220lBk LIZ = new C1348220lBk();

    public static void LIZ(Long l, String str, String str2, Context context, CommentContextSource commentContextSource) {
        String strEventType;
        String aid;
        Aweme aweme;
        String aid2;
        ((ArrayList) C1348210lBj.LIZ).clear();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C1348230lBl c1348230lBl = new C1348230lBl();
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c1348230lBl);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source_page_type", "video");
        jSONObject.put("entrance_form", "video_comment_tagging_anchor");
        String str3 = "";
        if (commentContextSource == null || (strEventType = CommentContextSourceKt.eventType(commentContextSource)) == null) {
            strEventType = "";
        }
        jSONObject.put("enter_from_info", strEventType);
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null && (aid2 = aweme.getAid()) != null) {
            str3 = aid2;
        }
        jSONObject.put("video_id", str3);
        jSONObject.put("product_id", l);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str2);
        Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        smartRouteBuildRoute.withParam("item_id", aid);
        smartRouteBuildRoute.withParam("comment_id", str);
        smartRouteBuildRoute.withParam("trackParams", C786410Ut5.J3(jSONObject));
        smartRouteBuildRoute.open();
    }
}

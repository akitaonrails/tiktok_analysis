package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222680hvG {
    public static final C1222680hvG LIZ = new C1222680hvG();
    public static ArrayList<String> LIZIZ = new ArrayList<>();

    public static void LIZ(Activity activity, MinisMetaResp minisMetaResp) {
        String str;
        String str2;
        Collection collection;
        String str3;
        String str4;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//authmanagement");
        if (minisMetaResp == null || (str = minisMetaResp.clientKey) == null) {
            str = "";
        }
        if (!LIZIZ.isEmpty()) {
            LIZIZ = new ArrayList<>();
        }
        LIZIZ.add(str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        String str5 = null;
        if (schemaParserData != null) {
            str2 = (String) ((LinkedHashMap) schemaParserData.LIZLLL()).get("enter_from");
        } else {
            str2 = null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("minis", true);
        C786410Ut5.LJJJI(Scene.SCENE_SERVICE, "minis_permissions", bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJIL(bundle, "client_key", LIZIZ);
        if (minisMetaResp == null || (collection = minisMetaResp.scopes) == null) {
            collection = C13BV.INSTANCE;
        }
        C786410Ut5.LJJJIL(bundle, "scopes", new ArrayList(collection));
        if (minisMetaResp != null) {
            str3 = minisMetaResp.name;
        } else {
            str3 = null;
        }
        C786410Ut5.LJJJI("name", str3, bundle);
        if (minisMetaResp != null) {
            str4 = minisMetaResp.description;
        } else {
            str4 = null;
        }
        C786410Ut5.LJJJI("description", str4, bundle);
        if (minisMetaResp != null) {
            str5 = minisMetaResp.iconUrl;
        }
        C786410Ut5.LJJJI("icon_url", str5, bundle);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }
}

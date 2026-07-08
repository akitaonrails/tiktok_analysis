package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.CreationInfo;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SP9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SP9 {
    public static final boolean LIZ(Aweme aweme) {
        AIRemixInfo aIRemixInfo = aweme.aiRemixInfo;
        if (aIRemixInfo != null) {
            return Intrinsics.LJFF(aIRemixInfo.getHasEntrance(), Boolean.TRUE);
        }
        return false;
    }

    public static final String LIZIZ(Aweme aweme) {
        if (aweme != null) {
            String imItemId = AwemeBizExtKt.getImItemId(aweme);
            if (imItemId != null && imItemId.length() != 0) {
                return AwemeBizExtKt.getImItemId(aweme);
            }
            String aid = aweme.getAid();
            if (aid != null && aid.length() != 0) {
                return aweme.getAid();
            }
            return AwemeBizExtKt.getFakeAid(aweme);
        }
        return null;
    }

    public static final String LIZJ(Aweme aweme) {
        CreationInfo creationInfo;
        List<String> creationUsedFunctions;
        String strLJJLIIIJ;
        if (aweme == null || (creationInfo = aweme.getCreationInfo()) == null || (creationUsedFunctions = creationInfo.getCreationUsedFunctions()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(creationUsedFunctions, ",", null, null, 0, null, null, 62)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }

    public static final boolean LJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (!AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.components) == null) {
            return false;
        }
        return map.containsKey("carousel_product_tiles");
    }

    public static final String LJFF(Aweme aweme) {
        Music music;
        if (aweme != null && (music = aweme.getMusic()) != null) {
            if (music.isPgc()) {
                return "pgc";
            }
            if (music.getMatchedPGCSoundInfo() != null) {
                return "fold_ugc";
            }
            return "ugc";
        }
        return null;
    }

    public static final void LIZLLL(C2189821An6 c2189821An6, Activity activity) {
        Intent intent;
        DetailNavArgModel navArgModel;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (navArgModel = c2189821An6.getNavArgModel()) != null) {
                    navArgModel.setFromPush(extras.getInt("is_from_push", 0));
                    navArgModel.setPushType(extras.getString("push_type"));
                    navArgModel.setPushId(extras.getString("push_id"));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}

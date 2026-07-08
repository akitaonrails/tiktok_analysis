package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.common.PublishSettings;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580640Mpy {
    public static final ArrayList<String> LIZ = C1697810uHb.LJ("aw21fuk9tkphbycs", "awrxudrcbk09y7wi");

    public static String LIZ(C1402840mbq c1402840mbq) {
        InitialMobParams initialMobParams;
        String str;
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), c1402840mbq.creativeInitModelJson, CreativeInitialModel.class);
        if (Intrinsics.LJFF(c1402840mbq.mClientKey, "aw889s25wozf8s7e")) {
            if (creativeInitialModel == null || (initialMobParams = creativeInitialModel.mobParams) == null || (str = initialMobParams.enterType) == null) {
                return LIZJ(c1402840mbq);
            }
            return str;
        }
        return LIZJ(c1402840mbq);
    }

    public static final String LIZIZ(String str) {
        if (!Intrinsics.LJFF(str, "aw889s25wozf8s7e") && !Intrinsics.LJFF(str, "aw7c4z4ej0o3efzd")) {
            return "original";
        }
        return "lv_sync";
    }

    public static final String LIZJ(C1402840mbq c1402840mbq) {
        InitialMobParams initialMobParams;
        String str;
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), c1402840mbq.creativeInitModelJson, CreativeInitialModel.class);
        if (c1402840mbq.mClientKey != null) {
            if (c1402840mbq.isLinkShare) {
                return "link_share";
            }
            if (c1402840mbq.mShareFormat == EnumC569040MTm.GREEN_SCREEN) {
                return "green_screen_kit";
            }
            PublishSettings publishSettings = c1402840mbq.mPublishSettings;
            if (publishSettings != null && publishSettings.isDirectPost()) {
                return "sdk_direct_post";
            }
            if (Intrinsics.LJFF(c1402840mbq.mClientKey, "aw889s25wozf8s7e") && creativeInitialModel != null && (initialMobParams = creativeInitialModel.mobParams) != null && (str = initialMobParams.enterType) != null && str.length() != 0) {
                return "lv_sync";
            }
            if (LIZ.contains(c1402840mbq.mClientKey)) {
                return "l8_import";
            }
            return "sdk";
        }
        return "system_share";
    }
}

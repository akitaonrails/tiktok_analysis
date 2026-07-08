package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openshare.DmShare;
import com.ss.android.ugc.aweme.openshare.Share$Request;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1B46, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B46 {
    public static final C1B46 LIZ = new C1B46();

    public static void LIZIZ() {
        C089E c089e = new C089E(ActivityStack.getActivityStack());
        while (c089e.hasNext()) {
            ((Activity) c089e.next()).finish();
        }
    }

    public static C1402840mbq LIZ(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return new C1402840mbq(extras);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static String LIZJ(String str) {
        int iLJJJJ;
        if (str != null && str.length() > 0 && (iLJJJJ = a0.LJJJJ(str, '.', 0, 6)) > -1 && iLJJJJ < str.length() - 1) {
            return str.substring(iLJJJJ + 1);
        }
        return str;
    }

    public static final C1402840mbq LIZLLL(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null) {
            return null;
        }
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().shareContextInfo(baseShortVideoContext);
    }

    public static Share$Request LJ(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Share$Request share$Request = new Share$Request();
        share$Request.fromBundle(bundle);
        return share$Request;
    }

    public static final boolean LJFF(BaseShareContext baseShareContext) {
        if (baseShareContext != null && !TextUtils.isEmpty(baseShareContext.mClientKey) && baseShareContext.mNeedShowDialog) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(Activity activity) {
        DmShare.TikTokDSPSettings tikTokDSPSettings;
        String stringExtra;
        try {
            Gson gson = C7740030o.LIZ().getGson();
            try {
                stringExtra = activity.getIntent().getStringExtra("content_info");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            tikTokDSPSettings = (DmShare.TikTokDSPSettings) gson.LJII(stringExtra, DmShare.TikTokDSPSettings.class);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            tikTokDSPSettings = null;
        }
        if (activity.getIntent().getIntExtra("_aweme_open_sdk_params_share_format", EnumC569040MTm.DEFAULT.getValue()) == EnumC569040MTm.DM_SHARE.getValue() && activity.getIntent().hasExtra("content_info")) {
            try {
                if (activity.getIntent().getStringExtra("content_info") != null && tikTokDSPSettings != null && tikTokDSPSettings.contentType != 0) {
                    return true;
                }
                return false;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return false;
            }
        }
        return false;
    }

    public static final boolean LJII(Activity activity) {
        if (activity.getIntent().getIntExtra("_aweme_open_sdk_params_share_format", EnumC569040MTm.DEFAULT.getValue()) == EnumC569040MTm.DM_SHARE.getValue()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(LIZJ((String) ListProtector.get(list, i)));
            if (!TextUtils.isEmpty(mimeTypeFromExtension) && !a0.LJJIIZI(mimeTypeFromExtension, "image", false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIIZ(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String lowerCase = LIZJ((String) ListProtector.get(list, i)).toLowerCase(Locale.getDefault());
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("extensionName= ");
            sbLIZ.append(lowerCase);
            C2188811AlT.LIZIZ(sbLIZ);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mimeType= ");
            sbLIZ2.append(mimeTypeFromExtension);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!TextUtils.isEmpty(mimeTypeFromExtension) && !a0.LJJIIZI(mimeTypeFromExtension, "video", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIIJ(String str) {
        if (!Intrinsics.LJFF("lv_sync", str) && !Intrinsics.LJFF("sdk", str) && !Intrinsics.LJFF("sdk_direct_post", str) && !Intrinsics.LJFF("green_screen_kit", str) && !Intrinsics.LJFF("l8_import", str)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(String str) {
        if (!Intrinsics.LJFF("system_share", str) && !LJIIJ(str) && !Intrinsics.LJFF("link_share", str)) {
            return false;
        }
        return true;
    }
}

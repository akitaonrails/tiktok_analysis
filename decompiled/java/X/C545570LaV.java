package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.profile.business.ur.utils.ProfileAvatarChoosePhotoActivity;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0LaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545570LaV {
    public static final C545570LaV LIZ = new C545570LaV();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(652));

    public static void LIZ(Activity activity, Fragment fragment, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C810650Vr5.LIZ(activity, "live_image_popup", "album");
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        boolean z3 = false;
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(activity, "profile_avatar_gallery", false)) {
            z3 = true;
        }
        if (!z3) {
            ((C1910890zpH) LIZIZ.getValue()).LIZ("EditProfileAvatarGalleryUtil", "VE Effect not installed, open system gallery");
            C2431009fo.LJFF(i4, activity, fragment);
            return;
        }
        ((C1910890zpH) LIZIZ.getValue()).LIZ("EditProfileAvatarGalleryUtil", "VE Effect installed, open in house gallery");
        try {
            Intent intent = new Intent(activity, (Class<?>) ProfileAvatarChoosePhotoActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("upload_photo_min_height", i3);
            bundle.putInt("upload_photo_min_width", i2);
            bundle.putInt("key_photo_select_min_count", i);
            bundle.putInt("key_photo_select_max_count", i);
            bundle.putInt("key_support_flag", 2);
            bundle.putBoolean("album_dark_mode", z);
            bundle.putBoolean("extra_keep_gallery_on_next", z2);
            intent.putExtras(bundle);
            if (fragment != null) {
                C1701330uNH.LIZ(intent, fragment);
                C2204961BRm.LLJL(fragment, intent, i4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi/kqzfRNYr2JGrcnKBZtA6+h9TvC6qoWATeQuBlGmBBr4w==", null));
            } else if (activity != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIIZILJ(i4, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi/kqzfRNYr2JGrcnKBZtA6+h9TvC6qoWATeQuBlGmBBr4w==", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
            C2431009fo.LJFF(i4, activity, fragment);
        }
    }
}

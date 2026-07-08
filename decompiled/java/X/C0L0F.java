package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.0L0F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0F {
    public static boolean LIZIZ(int i) {
        return C13LQ.LJLIIL(new Integer[]{6, 40, 29, 36, 24}).contains(Integer.valueOf(i));
    }

    public static void LIZLLL(Activity activity, Bundle bundle, int i) {
        String str;
        ShortVideoContext shortVideoContext;
        if (C299080Bnu.LIZ()) {
            Parcelable parcelable = bundle.getParcelable("key_short_video_context");
            if (!(parcelable instanceof ShortVideoContext) || (shortVideoContext = (ShortVideoContext) parcelable) == null || (str = shortVideoContext.shootWay) == null) {
                str = "unknown";
            }
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("album_legacy1_");
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(i);
                if (!creativeToolsPluginService.LIZJ(activity, C2188811AlT.LIZIZ(sbLIZ), true)) {
                    return;
                }
            } else {
                return;
            }
        }
        int i2 = bundle.getInt("key_choose_scene", -1);
        if ((C295700BiS.LIZ() || C298870BnZ.LIZ()) && LIZIZ(i2)) {
            C0MWH.LIZLLL(activity, bundle, i, null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbXFeSF3RS6so=", null));
    }

    public static void LJ(Context context, int i, Bundle bundle) {
        String str;
        ShortVideoContext shortVideoContext;
        if (C299080Bnu.LIZ()) {
            Parcelable parcelable = bundle.getParcelable("key_short_video_context");
            if (!(parcelable instanceof ShortVideoContext) || (shortVideoContext = (ShortVideoContext) parcelable) == null || (str = shortVideoContext.shootWay) == null) {
                str = "unknown";
            }
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("album_legacy2_");
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(i);
                if (!creativeToolsPluginService.LIZJ(context, C2188811AlT.LIZIZ(sbLIZ), true)) {
                    return;
                }
            } else {
                return;
            }
        }
        Intent intent = new Intent(context, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbXFeSF3RS6so=", null));
    }

    public static void LJFF(Fragment fragment, Bundle bundle, int i) throws Throwable {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(fragment.getContext(), "album_cke", true)) {
            Intent intent = new Intent(fragment.requireContext(), (Class<?>) MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", 10004);
            intent.putExtra("key_start_activity_request_code", 10004);
            C1701330uNH.LIZ(intent, fragment);
            C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbXFeSF3RS6so=", null));
        }
    }

    public static Intent LIZ(Activity activity, Bundle bundle, int i, int i2) {
        Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i2);
        return intent;
    }

    public static void LIZJ(Activity activity, Bundle bundle, int i, Integer num) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("album_legacy5_");
            sbLIZ.append(num);
            if (creativeToolsPluginService.LIZJ(activity, C2188811AlT.LIZIZ(sbLIZ), true)) {
                int i2 = bundle.getInt("is_mv_anchor");
                int i3 = bundle.getInt("key_choose_scene", -1);
                if (i2 == 1) {
                    if ((C295700BiS.LIZ() || C298870BnZ.LIZ()) && LIZIZ(i3)) {
                        C0MWH.LIZLLL(activity, bundle, i, num);
                        return;
                    }
                    Intent intent = new Intent(activity, (Class<?>) MvChoosePhotoActivity.class);
                    intent.putExtras(bundle);
                    intent.putExtra("key_choose_request_code", i);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activity);
                    C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbXFeSF3RS6so=", null));
                    return;
                }
                C0MWH.LIZLLL(activity, bundle, i, num);
            }
        }
    }

    public static void LJI(Activity activity, Bundle bundle, int i, int i2) throws Throwable {
        String str;
        ShortVideoContext shortVideoContext;
        if (C299080Bnu.LIZ()) {
            Parcelable parcelable = bundle.getParcelable("key_short_video_context");
            if (!(parcelable instanceof ShortVideoContext) || (shortVideoContext = (ShortVideoContext) parcelable) == null || (str = shortVideoContext.shootWay) == null) {
                str = "unknown";
            }
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("album_legacy3_");
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(i2);
                if (!creativeToolsPluginService.LIZJ(activity, C2188811AlT.LIZIZ(sbLIZ), true)) {
                    return;
                }
            } else {
                return;
            }
        }
        Intent intentLIZ = LIZ(activity, bundle, i, i2);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intentLIZ, activity);
        C2204961BRm.LJIIZILJ(i2, activity, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbXFeSF3RS6so=", null));
    }
}

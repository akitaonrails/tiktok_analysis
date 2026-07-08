package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.SubSpaceDetailDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment.SubSpaceFeedDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentSheetDialog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0K3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511380K3s {
    public static Bundle LIZ(Uri uri, Map map) {
        Bundle bundle = new Bundle();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C786410Ut5.LJJJI((String) entry.getKey(), (String) entry.getValue(), bundle);
            }
        }
        return bundle;
    }

    public static boolean LIZIZ(Context context, Uri uri, Map map) {
        FragmentManager supportFragmentManager;
        Bundle bundleLIZ = LIZ(uri, map);
        C786410Ut5.LJJJI("fragment_type", "pgc_sub_only_space", bundleLIZ);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (uri.getBooleanQueryParameter("is_fullscreen", true)) {
            return C1931507hR.LIZ().LIZIZ(context, bundleLIZ);
        }
        C19EG c19egLIZ = C0K1S.LIZ(context);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            SubSpaceFeedDialogFragment.LLJLLIL.getClass();
            SubSpaceFeedDialogFragment subSpaceFeedDialogFragment = new SubSpaceFeedDialogFragment();
            subSpaceFeedDialogFragment.LLJLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            subSpaceFeedDialogFragment.setArguments(bundleLIZ);
            subSpaceFeedDialogFragment.LLJL = supportFragmentManager;
            subSpaceFeedDialogFragment.show(supportFragmentManager, "SubOnlySpaceFeedDialogFragment");
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Context context, Uri uri, Map map) {
        FragmentManager supportFragmentManager;
        Bundle bundleLIZ = LIZ(uri, map);
        C786410Ut5.LJJJI("fragment_type", "pgc_sub_only_space_detail", bundleLIZ);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (uri.getBooleanQueryParameter("is_fullscreen", true)) {
            return C1931507hR.LIZ().LIZIZ(context, bundleLIZ);
        }
        C19EG c19egLIZ = C0K1S.LIZ(context);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            SubSpaceDetailDialogFragment.LLJLLIL.getClass();
            SubSpaceDetailDialogFragment subSpaceDetailDialogFragment = new SubSpaceDetailDialogFragment();
            subSpaceDetailDialogFragment.LLJLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            subSpaceDetailDialogFragment.setArguments(bundleLIZ);
            subSpaceDetailDialogFragment.show(supportFragmentManager, "SubSpaceDetailDialogFragment");
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Context context, Uri uri, Map map) {
        FragmentManager supportFragmentManager;
        String str;
        Bundle bundleLIZ = LIZ(uri, map);
        C786410Ut5.LJJJI("fragment_type", "pgc_sub_space_activity_list", bundleLIZ);
        if (uri.getBooleanQueryParameter("is_fullscreen", true)) {
            C0K52.LIZ(context, "pgc_sub_space_activity_list_fragment", bundleLIZ);
            return true;
        }
        C19EG c19egLIZ = C0K51.LIZ(context);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            String str2 = SubContentFragmentSheetDialog._pnsPageId;
            Pair pair = (Pair) ((LinkedHashMap) C0K45.LIZ).get("pgc_sub_space_activity_list_fragment");
            if (pair == null || (str = (String) pair.getFirst()) == null) {
                str = "SubContentFragmentSheetDialog";
            }
            Bundle bundle = new Bundle(bundleLIZ);
            C786410Ut5.LJJJI("fragment_id", "pgc_sub_space_activity_list_fragment", bundle);
            C0K19.LIZ(supportFragmentManager, new SubContentFragmentSheetDialog(), str, bundle);
            return true;
        }
        return false;
    }
}

package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.fragment.SubscriptionManagementFragmentV2;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo.SubOnlyVideoListFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer.SubContentFragmentContainer;
import com.bytedance.android.livesdk.comp.impl.subscription.legacy.PreviewSubscriptionSettingDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.legacy.SubscribeInfoListFragment;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JT9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JT9 {
    public static final SubContentFragmentContainer LIZ() {
        SubContentFragmentContainer subContentFragmentContainer = new SubContentFragmentContainer();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("fragment_id", "sub_space_activity_list_fragment", bundle);
        subContentFragmentContainer.setArguments(bundle);
        return subContentFragmentContainer;
    }

    public static final SubscribeInfoListFragment LJFF() {
        SubscribeInfoListFragment subscribeInfoListFragment = new SubscribeInfoListFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "", bundle);
        subscribeInfoListFragment.setArguments(bundle);
        return subscribeInfoListFragment;
    }

    public static final SubOnlyLivePreviewSettingFragment LIZJ(String str, C0JTD c0jtd) {
        GetSubInfoResponse getSubInfoResponse;
        SubOnlyLivePreviewSettingFragment subOnlyLivePreviewSettingFragment = new SubOnlyLivePreviewSettingFragment();
        subOnlyLivePreviewSettingFragment.LL = str;
        Function0<Unit> function0 = null;
        if (c0jtd != null) {
            getSubInfoResponse = c0jtd.LIZ;
        } else {
            getSubInfoResponse = null;
        }
        subOnlyLivePreviewSettingFragment.LLILLJJLI = getSubInfoResponse;
        if (c0jtd != null) {
            function0 = c0jtd.LIZIZ;
        }
        subOnlyLivePreviewSettingFragment.LLILLL = function0;
        return subOnlyLivePreviewSettingFragment;
    }

    public static final SubOnlyLiveSettingFragment LIZLLL(String str, GetSubInfoResponse getSubInfoResponse) {
        boolean z;
        Bundle arguments;
        String string;
        SubOnlyLiveSettingFragment.LLJJL.getClass();
        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = new SubOnlyLiveSettingFragment();
        subOnlyLiveSettingFragment.LLJJI = str;
        subOnlyLiveSettingFragment.LLJJIII = getSubInfoResponse;
        try {
            arguments = subOnlyLiveSettingFragment.getArguments();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (arguments != null && (string = arguments.getString("is_super_fans")) != null) {
            z = Boolean.parseBoolean(string);
        } else {
            z = false;
        }
        subOnlyLiveSettingFragment.LLJJIJIIJIL = z;
        return subOnlyLiveSettingFragment;
    }

    public static final SubscriptionManagementFragmentV2 LJI(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        SubscriptionManagementFragmentV2 subscriptionManagementFragmentV2 = new SubscriptionManagementFragmentV2();
        subscriptionManagementFragmentV2.setArguments(bundle);
        return subscriptionManagementFragmentV2;
    }

    public static final PreviewSubscriptionSettingDialog LIZIZ(int i, String str, String str2) {
        PreviewSubscriptionSettingDialog previewSubscriptionSettingDialog = new PreviewSubscriptionSettingDialog();
        previewSubscriptionSettingDialog.LLILLJJLI = i;
        previewSubscriptionSettingDialog.LLILLL = str;
        previewSubscriptionSettingDialog.LLILZ = str2;
        return previewSubscriptionSettingDialog;
    }

    public static final SubWaveEmotePageFragment LJII(long j, String str, String str2) {
        SubWaveEmotePageFragment.LLIZ.getClass();
        SubWaveEmotePageFragment subWaveEmotePageFragment = new SubWaveEmotePageFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", j);
        C786410Ut5.LJJJI("sec_user_id", str, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        subWaveEmotePageFragment.setArguments(bundle);
        return subWaveEmotePageFragment;
    }

    public static final SubPrivilegeDetailFullPage LJIIIIZZ(String str, String str2, Bundle bundle) {
        Uri uri;
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = new SubPrivilegeDetailFullPage();
        subPrivilegeDetailFullPage.LLJJIII = str;
        subPrivilegeDetailFullPage.LLJJIJI = subPrivilegeDetailFullPage.LLJJIJI;
        subPrivilegeDetailFullPage.LLJJIJIIJIL = str2;
        subPrivilegeDetailFullPage.setArguments(bundle);
        String str3 = "";
        subPrivilegeDetailFullPage.LLJJJJJIL = bundle.getString("enter_type", "");
        Intrinsics.LJFF(bundle.getString("use_new_style", ""), "true");
        String string = bundle.getString("log_param", "");
        String string2 = bundle.getString("extra_log_pb", "");
        bundle.getString("scenario", "live");
        String string3 = bundle.getString("original_url", "");
        String string4 = bundle.getString("package_id", "");
        try {
            uri = UriProtector.parse(string3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uri = null;
        }
        String string5 = bundle.getString("previous_page");
        if (string5 != null) {
            str3 = string5;
        }
        subPrivilegeDetailFullPage.LLJJJJLIIL = new C508400Jwk(string, string4, 0L, 0L, string2, false, uri, null, str3, 1378);
        return subPrivilegeDetailFullPage;
    }

    public static final SubOnlyVideoListFragment LJ(long j, SubOnlyVideoOpenParams subOnlyVideoOpenParams, Boolean bool, Integer num, Integer num2, String str, String str2, boolean z) {
        SubOnlyVideoListFragment subOnlyVideoListFragment = new SubOnlyVideoListFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_author", z);
        bundle.putLong("user_id", j);
        C786410Ut5.LJJJI("sec_user_id", str, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        if (num != null) {
            bundle.putInt("creator_status", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("sov_video_count", num2.intValue());
        }
        C786410Ut5.LJJJI("enter_method", subOnlyVideoOpenParams.enterMethod, bundle);
        bundle.putInt("content_page_type", subOnlyVideoOpenParams.contentPageType.ordinal());
        subOnlyVideoListFragment.setArguments(bundle);
        subOnlyVideoListFragment.LLIZ = bool;
        return subOnlyVideoListFragment;
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileAssemService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1EDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277881EDy implements IProfileService {
    public static final C2277881EDy LIZIZ = new C2277881EDy();
    public final /* synthetic */ IProfileService LIZ = (IProfileService) ServiceManager.get().getService(IProfileService.class);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void blockUser(Context context, LifecycleOwner lifecycleOwner, String str, String str2, int i, int i2) {
        this.LIZ.blockUser(context, lifecycleOwner, str, str2, 1, i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean canShowProfileFixedEntrance() {
        return this.LIZ.canShowProfileFixedEntrance();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkAndHandleSaveFile(Bitmap bitmap, File file) {
        return this.LIZ.checkAndHandleSaveFile(bitmap, file);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void checkAndRefreshUser(Fragment fragment) {
        this.LIZ.checkAndRefreshUser(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDLocal(String str, Context context) {
        return this.LIZ.checkIDLocal(str, context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDNet(String str, String str2, String str3, Context context) {
        return this.LIZ.checkIDNet(str, str2, str3, context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1255880imo<Aweme, ?> createAwemeModel() {
        return this.LIZ.createAwemeModel();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, int i, String str, int i2, int i3) {
        return this.LIZ.disLikeAweme(aweme, i, str, i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void disLikeAwemeApi(String str, Map<String, String> map) {
        this.LIZ.disLikeAwemeApi(str, map);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean enableShowFeatureVideoEntrance() {
        return this.LIZ.enableShowFeatureVideoEntrance();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAdFakeUserProfileBugfixSetting() {
        return this.LIZ.getAdFakeUserProfileBugfixSetting();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0QTN getAsyncInflater(Activity activity, int i) {
        return this.LIZ.getAsyncInflater(activity, Integer.MAX_VALUE);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0OO0 getAvatarPresenter() {
        return this.LIZ.getAvatarPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1608810ry3<? extends InterfaceC1606880ruw, ? extends InterfaceC426680GoE> getAvatarProfileAdapter() {
        return this.LIZ.getAvatarProfileAdapter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC800130Va7 getCampusEducationSheetStatusRequestLegoTask() {
        return this.LIZ.getCampusEducationSheetStatusRequestLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getEnterpriseType(User user) {
        return this.LIZ.getEnterpriseType(user);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment getFavoriteVideoListFragment(Context context, Bundle bundle) {
        return this.LIZ.getFavoriteVideoListFragment(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Bundle getFavoriteVideoListFragmentArgs(Context context, int i, Boolean bool, String str, boolean z) {
        return this.LIZ.getFavoriteVideoListFragmentArgs(context, i, bool, str, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final PowerViewPagerFragmentItem<?> getFavoriteVideoListFragmentItem(Context context, int i, Boolean bool, String str, boolean z) {
        return this.LIZ.getFavoriteVideoListFragmentItem(context, i, bool, str, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C1197160hG6 getFavoriteVideoListTabMetadata(Context context) {
        return this.LIZ.getFavoriteVideoListTabMetadata(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment getFavoriteVideoSearchResultFragment() {
        return this.LIZ.getFavoriteVideoSearchResultFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nMyProfileFragment() {
        return this.LIZ.getI18nMyProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nUserProfileFragment() {
        return this.LIZ.getI18nUserProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final long getLastTimeShowPublishSuccessWindow(String str, long j) {
        return this.LIZ.getLastTimeShowPublishSuccessWindow(str, 0L);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getLiveEventsUrl() {
        return this.LIZ.getLiveEventsUrl();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC1257400ipG getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        return this.LIZ.getMTAwemeListFragment(i, i2, str, str2, z, z2, z3, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return this.LIZ.getMessageProfile();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC20660715sz getMyProfilePartScreenScene(C19EG c19eg) {
        return this.LIZ.getMyProfilePartScreenScene(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final IProfileAssemService getProfileAssemService() {
        return this.LIZ.getProfileAssemService();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1893000zMQ getProfileBioLinkTitleBarProvider() {
        return this.LIZ.getProfileBioLinkTitleBarProvider();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends CommonPageFragment> getProfilePageFragmentClass() {
        return this.LIZ.getProfilePageFragmentClass();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0CCZ getProfilePageModelPreloadTask() {
        return this.LIZ.getProfilePageModelPreloadTask();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getProfileSortType() {
        return this.LIZ.getProfileSortType();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        return this.LIZ.getPushSettingCallback();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C13IQ<? extends AbstractC738140SxQ> getSocialActivityAssem() {
        return this.LIZ.getSocialActivityAssem();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getTabNameInGuideUserUtil() {
        return this.LIZ.getTabNameInGuideUserUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPath(boolean z) {
        return this.LIZ.getUserPath(true);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPermissionsPath() {
        return this.LIZ.getUserPermissionsPath();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getViewRawBottomY(View view) {
        return this.LIZ.getViewRawBottomY(view);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C0CCZ getYoutubeRefreshTask() {
        return this.LIZ.getYoutubeRefreshTask();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        this.LIZ.gotoCrop(activity, str, z, f, i, i2, i3, i4, i5, z2, bundle, z3);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2) {
        this.LIZ.gotoCrop(fragment, str, z, f, i, i2, i3, i4, i5, bundle, z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        this.LIZ.gotoCropActivity(activity, str, false, f, i, 10004, i3, i4, i5, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        this.LIZ.gotoCropActivity(activity, str, true, 1.0f, i, 10003, 0, 0, -1, true, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        this.LIZ.gotoCropActivity(activity, str, false, 1.0f, i, 10001, 250, 250, 1101, false, null, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean hasLiveEventPermissionSettings() {
        return this.LIZ.hasLiveEventPermissionSettings();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isHitLeftAlignSmallAvatar() {
        return this.LIZ.isHitLeftAlignSmallAvatar();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nMyProfileFragment(Fragment fragment) {
        return this.LIZ.isI18nMyProfileFragment(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nUserProfileFragment(Fragment fragment) {
        return this.LIZ.isI18nUserProfileFragment(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isNotificationEnabled(Context context) {
        return this.LIZ.isNotificationEnabled(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isProfileViewersEnable() {
        return this.LIZ.isProfileViewersEnable();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isShowGuideCreateVideoInGuideUserUtil() {
        return this.LIZ.isShowGuideCreateVideoInGuideUserUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isTooltipInGuideUserUtil() {
        return this.LIZ.isTooltipInGuideUserUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isUserProfileFragment(Fragment fragment) {
        return this.LIZ.isUserProfileFragment(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void jumpToOrgAccountPage(Context context, String str, String str2, String str3, String str4) {
        this.LIZ.jumpToOrgAccountPage(context, "chat", str2, null, "2");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void longPressProfileCell(String str, Aweme aweme, Activity activity, String str2, String str3, int i, View view, Fragment fragment, C0HTT<C737030Svd> c0htt) {
        this.LIZ.longPressProfileCell("shortcut_panel", aweme, activity, str2, str3, i, view, fragment, c0htt);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobClickEnterProfileViewer() {
        this.LIZ.mobClickEnterProfileViewer();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(AbstractC1255880imo<?, ?> abstractC1255880imo, List<? extends Aweme> list) {
        this.LIZ.mobRefreshInProfileAweme(abstractC1255880imo, list);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowBindPhoneNumberNotice() {
        return this.LIZ.needShowBindPhoneNumberNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return this.LIZ.needShowCompleteProfileGuideBar();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return this.LIZ.needShowSafeInfoNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC1232320iAo newUserPresenter() {
        return this.LIZ.newUserPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return this.LIZ.obtainMyProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return this.LIZ.obtainUserProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void postDarkModeStatusEvent(boolean z) {
        this.LIZ.postDarkModeStatusEvent(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(C19EG c19eg, String str) {
        this.LIZ.preloadProfile(c19eg, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str) {
        this.LIZ.preloadProfileInfoAndAwemePost(aweme, num, i, "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends Activity> profileActivityClz() {
        return this.LIZ.profileActivityClz();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC1255890imp<?, ?> provideAwemeModel() {
        return this.LIZ.provideAwemeModel();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment providePushSettingNotificationChoiceFragment() {
        return this.LIZ.providePushSettingNotificationChoiceFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4) {
        this.LIZ.queryAwemeWithID(true, str, str2, 0, 0L, 20, str3, 0, 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponse(Handler handler, EnumC1254690ikt enumC1254690ikt) {
        this.LIZ.queryProfileResponse(handler, enumC1254690ikt);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt) {
        this.LIZ.queryProfileResponseWithDoubleId(handler, str, str2, "", 0, enumC1254690ikt);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileWithId(Handler handler, String str, int i, EnumC1254690ikt enumC1254690ikt) {
        this.LIZ.queryProfileWithId(handler, str, 0, enumC1254690ikt);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C11NZ<RelationSearchResponse> queryRelationSearchList(int i, String str, String str2, Integer num) {
        return this.LIZ.queryRelationSearchList(i, str, str2, num);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String str, boolean z, String str2) {
        boolean zLJI = MethodIDManager.LJI(202475);
        User userQueryUser = this.LIZ.queryUser(str, z, str2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return userQueryUser;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryUserResponse(String str, boolean z, String str2) {
        this.LIZ.queryUserResponse(str, true, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeAllCache() {
        this.LIZ.removeAllCache();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeCacheByUser(String str, String str2) {
        this.LIZ.removeCacheByUser(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void runYoutubeRefreshTask(Context context) {
        this.LIZ.runYoutubeRefreshTask(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setLastTimeShowPublishSuccessWindow(String str, long j) {
        this.LIZ.setLastTimeShowPublishSuccessWindow(str, j);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBarInCouponKeva(boolean z) {
        this.LIZ.setShownBarInCouponKeva(false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBubbleInCouponKeva(boolean z) {
        this.LIZ.setShownBubbleInCouponKeva(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownStarInCouponKeva(boolean z) {
        this.LIZ.setShownStarInCouponKeva(false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldDetailLoadLatest() {
        return this.LIZ.shouldDetailLoadLatest();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldHideThoughtBubbleAndPlus(User user) {
        return this.LIZ.shouldHideThoughtBubbleAndPlus(user);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldShowProfileViewerPushItem() {
        return this.LIZ.shouldShowProfileViewerPushItem();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showBubbleInCouponKeva() {
        return this.LIZ.showBubbleInCouponKeva();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showCouponIconInCouponKeva(String str, int i) {
        return this.LIZ.showCouponIconInCouponKeva(str, i);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void showInChooseAccountBottomSheet(FragmentManager fragmentManager, C1255390im1 c1255390im1, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener) {
        this.LIZ.showInChooseAccountBottomSheet(fragmentManager, c1255390im1, str, bundle, onDismissListener, onCancelListener);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        this.LIZ.startHeaderDetailActivity(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr) {
        this.LIZ.startHeaderDetailActivity(activity, view, f, null, false, false, null, strArr);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        this.LIZ.startHeaderDetailActivity(activity, view, user, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        this.LIZ.startHeaderDetailActivity(activity, view, user, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditActivity(Activity activity, Bundle bundle) {
        this.LIZ.startProfileEditActivity(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditBioUrlActivity(Activity activity, String str) {
        this.LIZ.startProfileEditBioUrlActivity(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateCoverIfMyProfileVisible(C19EG c19eg, String str, Aweme aweme) {
        this.LIZ.updateCoverIfMyProfileVisible(c19eg, str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateFirstTimeInCouponKeva(JSONObject jSONObject) {
        this.LIZ.updateFirstTimeInCouponKeva(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageEnterMethod(Fragment fragment, String str) {
        this.LIZ.updateProfilePageEnterMethod(fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, Bundle bundle) {
        this.LIZ.updateProfilePageFragmentParams(fragment, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str) {
        this.LIZ.updateProfilePageFragmentParams(fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z, boolean z2, Bundle bundle) {
        this.LIZ.updateProfilePageFragmentParams(fragment, str, z, z2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
        this.LIZ.updateProfilePermission(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateSavePostChoose(Activity activity, String str, AvatarUri avatarUri, String str2, Function0<Unit> function0, Function1<? super Exception, Unit> function1) {
        this.LIZ.updateSavePostChoose(activity, str, avatarUri, str2, function0, function1);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
        this.LIZ.updateUserInfo(fragment, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object updateUserSocialAvatar(Activity activity, boolean z, boolean z2, int i, int i2, Map<String, String> map, long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LIZ.updateUserSocialAvatar(activity, z, z2, i, i2, map, j, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean userNameLegitimate() {
        return this.LIZ.userNameLegitimate();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i, EnumC1254690ikt enumC1254690ikt) {
        return this.LIZ.userUrl(str, str2, str3, 0, enumC1254690ikt);
    }
}

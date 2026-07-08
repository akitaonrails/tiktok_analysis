package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19296410eQ implements ISettingService {
    public static final C19296410eQ LIZIZ = new C19296410eQ();
    public final /* synthetic */ ISettingService LIZ = (ISettingService) ServiceManager.get().getService(ISettingService.class);

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, int i, boolean z, String str2, Function1<? super Exception, Unit> function1) {
        return this.LIZ.batchSetPushSettingItems(str, i, z, str2, function1);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, boolean z, Function1<? super Exception, Unit> function1) {
        return this.LIZ.batchSetPushSettingItems(str, z, function1);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String buildFeedbackUrl(String str, Map<String, String> map) {
        return this.LIZ.buildFeedbackUrl(str, map);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAbi() {
        return this.LIZ.getAbi();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLanguage() {
        return this.LIZ.getAppLanguage();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLogRegion() {
        return this.LIZ.getAppLogRegion();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getCarrierRegionV2() {
        return this.LIZ.getCarrierRegionV2();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getCountryLocale() {
        return this.LIZ.getCountryLocale();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final InterfaceC1910030znt getCurrentI18nItem(Context context) {
        return this.LIZ.getCurrentI18nItem(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final InterfaceC19572111hn getEventTracker() {
        return this.LIZ.getEventTracker();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C10E3 getFetchPushOffReasonManager() {
        return this.LIZ.getFetchPushOffReasonManager();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<InterfaceC1910030znt> getI18nItems() {
        return this.LIZ.getI18nItems();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getLanguage(Locale locale) {
        return this.LIZ.getLanguage(locale);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getLocale(String str) {
        return this.LIZ.getLocale(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Map<String, InterfaceC1910030znt> getLocaleMap() {
        return this.LIZ.getLocaleMap();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getReleaseBuildString() {
        return this.LIZ.getReleaseBuildString();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getSysLanguage() {
        return this.LIZ.getSysLanguage();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getTheme(int i) {
        return this.LIZ.getTheme(i);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void installCommonParams() {
        this.LIZ.installCommonParams();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isArabicLang(Context context) {
        return this.LIZ.isArabicLang(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isFirstShowBAOrCARedDot() {
        return this.LIZ.isFirstShowBAOrCARedDot();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isKorean() {
        return this.LIZ.isKorean();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isShowFamilyPairingForNotLoginUser() {
        return this.LIZ.isShowFamilyPairingForNotLoginUser();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isStudioInappM10nCenterRevampEnabled() {
        return this.LIZ.isStudioInappM10nCenterRevampEnabled();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowProfileGuideView() {
        return this.LIZ.needShowProfileGuideView();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowRedDotOnMyProfileMore() {
        return this.LIZ.needShowRedDotOnMyProfileMore();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> providePrivateSettingChangePresenter() {
        return this.LIZ.providePrivateSettingChangePresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<C10FJ> providePushSettingCallbackList() {
        return this.LIZ.providePushSettingCallbackList();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C1260870iur<AbstractC666100QAu<BaseResponse>, C10F0> providePushSettingChangePresenter() {
        return this.LIZ.providePushSettingChangePresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> providePushSettingFetchPresenter() {
        return this.LIZ.providePushSettingFetchPresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void requestTurnOnAdAuthorization(Context context, InterfaceC19279210be interfaceC19279210be) {
        this.LIZ.requestTurnOnAdAuthorization(context, interfaceC19279210be);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BaseResponse setPushPrivateSettingItem(String str, int i) {
        return this.LIZ.setPushPrivateSettingItem(str, i);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean shouldUseFasterPaging() {
        return this.LIZ.shouldUseFasterPaging();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void showDMSettingSheet(InterfaceC1642506bv interfaceC1642506bv) {
        this.LIZ.showDMSettingSheet(interfaceC1642506bv);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean startFeedbackRecordActivity(Activity activity, String str, Integer num) {
        return this.LIZ.startFeedbackRecordActivity(activity, str, null);
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService;

/* JADX INFO: renamed from: X.0itb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260090itb implements IProfileDependentComponentService {
    public static final C1260090itb LIZIZ = new C1260090itb();
    public final /* synthetic */ IProfileDependentComponentService LIZ = ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final InterfaceC1054790dYT adUtilsService() {
        return this.LIZ.adUtilsService();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C846160XHi c846160XHi, boolean z, String str3) {
        return (T) this.LIZ.apiExecuteGetJSONObject(i, str, cls, null, c846160XHi, z, str3);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3, Object obj) {
        return (T) this.LIZ.apiExecuteGetJSONObject(str, cls, str2, z, str3, null);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final InterfaceC1257430ipJ bridgeService() {
        return this.LIZ.bridgeService();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, InterfaceC683650Qrj interfaceC683650Qrj, AbstractC1338480kw2 abstractC1338480kw2, boolean z) {
        return this.LIZ.buildBaseRecyclerView(recyclerView, interfaceC683650Qrj, abstractC1338480kw2, z);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final InterfaceC1259580ism favoritesMobUtilsService() {
        return this.LIZ.favoritesMobUtilsService();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC1585770rMt getDiscoverTabProtocol() {
        return this.LIZ.getDiscoverTabProtocol();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC1585770rMt getProfileTabProtocol() {
        return this.LIZ.getProfileTabProtocol();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        this.LIZ.gotoCropActivity(activity, str, z, f, i, 10002, i3, i4, i5, z2, bundle, z3);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle, boolean z2) {
        this.LIZ.gotoCropActivity(fragment, str, z, f, i, 10002, i3, i4, i5, bundle, z2);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final boolean isDetailActivity(Activity activity) {
        return this.LIZ.isDetailActivity(activity);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final boolean isUserProfileActivity(Activity activity) {
        return this.LIZ.isUserProfileActivity(activity);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final InterfaceC1259570isl mainAnimViewModel(C19EG c19eg) {
        return this.LIZ.mainAnimViewModel(c19eg);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final C11NZ<Boolean> needShowDiskManagerGuideView() {
        return this.LIZ.needShowDiskManagerGuideView();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final InterfaceC1291910jiv newLiveBlurProcessor(int i, float f, InterfaceC1260100itc interfaceC1260100itc) {
        return this.LIZ.newLiveBlurProcessor(5, f, null);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final boolean onAntiCrawlerEvent(String str) {
        return this.LIZ.onAntiCrawlerEvent(str);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC19484711Kz<BaseResponse> setPrivateSettingItem(String str, int i) {
        return this.LIZ.setPrivateSettingItem("download_prompt", 1);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.LIZ.shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        this.LIZ.startDownloadControlSettingActivity(activity, i);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        this.LIZ.startHeaderDetailActivity(activity, view, user, true);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        this.LIZ.startHeaderDetailActivity(activity, view, str, user);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.service.IProfileDependentComponentService
    public final void watchLiveMob(Context context, User user, String str, String str2) {
        this.LIZ.watchLiveMob(context, user, "others_homepage", "live_cover");
    }
}

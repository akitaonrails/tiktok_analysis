package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054780dYS implements InterfaceC1054790dYT {
    public static final C1054780dYS LIZIZ = new C1054780dYS();
    public final /* synthetic */ InterfaceC1054790dYT LIZ = C1260090itb.LIZIZ.adUtilsService();

    @Override // X.InterfaceC1054790dYT
    public final void changeBottomBarVisible(Boolean bool) {
        this.LIZ.changeBottomBarVisible(bool);
    }

    @Override // X.InterfaceC1054790dYT
    public final void closeProfilePopUpWebPage(Activity activity) {
        this.LIZ.closeProfilePopUpWebPage(activity);
    }

    @Override // X.InterfaceC1054790dYT
    public final InterfaceC1054930dYh createFakeUserProfileFragment() {
        return this.LIZ.createFakeUserProfileFragment();
    }

    @Override // X.InterfaceC1054790dYT
    public final InterfaceC1054930dYh createNewFakeUserProfileFragment() {
        return this.LIZ.createNewFakeUserProfileFragment();
    }

    @Override // X.InterfaceC1054790dYT
    public final void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i, User user) {
        this.LIZ.feedLiveProfileAvatarOpen(context, aweme, 50, user);
    }

    @Override // X.InterfaceC1054790dYT
    public final InterfaceC1054970dYl getAdFlutterLandPageUtil() {
        return this.LIZ.getAdFlutterLandPageUtil();
    }

    @Override // X.InterfaceC1054790dYT
    public final IAdLynxLandPageUtils getAdLynxLandPageUtil() {
        return this.LIZ.getAdLynxLandPageUtil();
    }

    @Override // X.InterfaceC1054790dYT
    public final JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return this.LIZ.getExtJson(context, aweme, "");
    }

    @Override // X.InterfaceC1054790dYT
    public final String getRealMiddlePageUrl(String str) {
        return this.LIZ.getRealMiddlePageUrl(str);
    }

    @Override // X.InterfaceC1054790dYT
    public final void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        this.LIZ.onProfileWebPageHide(context, aweme, str);
    }

    @Override // X.InterfaceC1054790dYT
    public final void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        this.LIZ.onProfileWebPageShow(context, aweme, str);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return this.LIZ.openProfilePopUpWebPageInSixTwoMode(context, aweme, str);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return this.LIZ.openProfilePopUpWebPageInTwoExpandMode(context, aweme, str);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return this.LIZ.openProfilePopUpWebPageInTwoMode(context, aweme, str);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return this.LIZ.openProfilePopUpWebPageInTwoMode(context, aweme, str, true);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean openTopViewLive(Context context, Aweme aweme, int i, InterfaceC1022210chv interfaceC1022210chv) {
        return this.LIZ.openTopViewLive(context, aweme, i, interfaceC1022210chv);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean shouldShowAdBrowser(Aweme aweme, String str) {
        return this.LIZ.shouldShowAdBrowser(aweme, str);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean shouldShowAdFakeMiddlePage(Aweme aweme) {
        return this.LIZ.shouldShowAdFakeMiddlePage(aweme);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean shouldShowAdRealMiddlePage(Aweme aweme) {
        return this.LIZ.shouldShowAdRealMiddlePage(aweme);
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean shouldShowBioEmail() {
        return this.LIZ.shouldShowBioEmail();
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean shouldShowBioUrl() {
        return this.LIZ.shouldShowBioUrl();
    }

    @Override // X.InterfaceC1054790dYT
    public final boolean shouldShowFakeUserProfile(Aweme aweme) {
        return this.LIZ.shouldShowFakeUserProfile(aweme);
    }
}

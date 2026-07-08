package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1054790dYT {
    void changeBottomBarVisible(Boolean bool);

    void closeProfilePopUpWebPage(Activity activity);

    InterfaceC1054930dYh createFakeUserProfileFragment();

    InterfaceC1054930dYh createNewFakeUserProfileFragment();

    void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i, User user);

    InterfaceC1054970dYl getAdFlutterLandPageUtil();

    IAdLynxLandPageUtils getAdLynxLandPageUtil();

    JSONObject getExtJson(Context context, Aweme aweme, String str);

    String getRealMiddlePageUrl(String str);

    void onProfileWebPageHide(Context context, Aweme aweme, String str);

    void onProfileWebPageShow(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z);

    boolean openTopViewLive(Context context, Aweme aweme, int i, InterfaceC1022210chv interfaceC1022210chv);

    boolean shouldShowAdBrowser(Aweme aweme, String str);

    boolean shouldShowAdFakeMiddlePage(Aweme aweme);

    boolean shouldShowAdRealMiddlePage(Aweme aweme);

    boolean shouldShowBioEmail();

    boolean shouldShowBioUrl();

    boolean shouldShowFakeUserProfile(Aweme aweme);
}

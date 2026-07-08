package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0cs9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1028550cs9 {
    boolean LIZ();

    int LIZIZ();

    void LIZJ();

    IDownloadService LIZLLL();

    boolean LJ();

    long LJFF();

    boolean LJI();

    C1045350dJF LJII(Context context);

    void LJIIIIZZ();

    void LJIIIZ();

    void LJIIJ();

    boolean LJIIJJI();

    void LJIIL();

    void LJIILIIL(Aweme aweme);

    void LJIILJJIL();

    void LJIILL(String str, boolean z, boolean z2);

    void LJIILLIIL();

    void LJIIZILJ(Context context, Aweme aweme);

    void LJIJ(C2211981Bhk c2211981Bhk);

    void LJIJI();

    HashMap<String, String> LJIJJ();

    boolean LJIJJLI(InterfaceC1018210cbT interfaceC1018210cbT);

    long LJIL();

    boolean LJJ();

    void LJJI();

    String LJJIFFI();

    void LJJII(NormalSplashAdActivity normalSplashAdActivity, String str);

    boolean LJJIII();

    Intent LJJIIJ(NormalSplashAdActivity normalSplashAdActivity);

    boolean LJJIIJZLJL();

    int LJJIIZ();

    void LJJIIZI(Context context, Aweme aweme, Map<String, String> map);

    boolean LJJIJ();

    String LJJIJIIJI();

    void LJJIJIIJIL(String str);

    String getCurUserId();

    String getDeviceId();

    String getInstallId();

    String getOpenUdid();

    boolean isActivityAwemeAuthorize(Activity activity);

    boolean isAppBackground();
}

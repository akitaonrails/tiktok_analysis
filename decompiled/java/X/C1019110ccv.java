package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ccv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019110ccv implements ICommercializeLiveService {
    public static final C1019110ccv LIZIZ = new C1019110ccv();
    public final /* synthetic */ ICommercializeLiveService LIZ = (ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class);

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZ(JSONObject jSONObject) {
        this.LIZ.LIZ(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZJ(Aweme aweme) {
        this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC990070bs5 LIZLLL(FrameLayout frameLayout) {
        return this.LIZ.LIZLLL(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJ(Aweme aweme) {
        return this.LIZ.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final AdLiveEnterRoomConfig LJFF(Aweme aweme, AwemeRawAd awemeRawAd, int i, String str) {
        return this.LIZ.LJFF(aweme, awemeRawAd, 12, "");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC1016620cYu LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJII(Aweme aweme, boolean z) {
        return this.LIZ.LJII(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIIIZZ(Integer num, Long l, String str, String str2) {
        this.LIZ.LJIIIIZZ(num, l, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIIZ(Context context, Aweme aweme, int i, User user, boolean z) {
        this.LIZ.LJIIIZ(context, aweme, i, user, z);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIJ() {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final C0X9S LJIIJJI(int i, String str, String str2, long j, String str3, String str4) {
        return this.LIZ.LJIIJJI(i, str, str2, j, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC999040c6Y LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIILIIL(JSONObject jSONObject) {
        this.LIZ.LJIILIIL(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIILJJIL(Aweme aweme, EnterRoomConfig enterRoomConfig, int i, String str) {
        this.LIZ.LJIILJJIL(aweme, enterRoomConfig, i, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC999040c6Y LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIILLIIL(JSONObject jSONObject) {
        this.LIZ.LJIILLIIL(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJIIZILJ(Aweme aweme) {
        return this.LIZ.LJIIZILJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIJ(String str, String str2, Map map) {
        this.LIZ.LJIJ(str, str2, map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIJI(Context context, Aweme aweme, User user) {
        this.LIZ.LJIJI(context, aweme, user);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String Rj(String str) {
        return this.LIZ.Rj(str);
    }
}

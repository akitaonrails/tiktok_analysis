package X;

import android.view.View;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0O9L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O9L {
    public static final C0O9L LIZ;
    public static final Map<String, C443120HZe<String, Boolean, Boolean>> LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;

    static {
        C0O9L c0o9l = new C0O9L();
        LIZ = c0o9l;
        LIZIZ = new LinkedHashMap();
        LIZJ = C452501pT.LIZIZ(new C0O9M());
        LIZLLL = C452501pT.LIZIZ(new C0O5M());
        EventBus.LIZLLL().LJIJJ(c0o9l);
    }

    public static void LIZ(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            C01GW c01gw = LIZJ;
            if (!((IFavoriteService) c01gw.getValue()).LJIIZILJ()) {
                str = "hit_favorite_reverse";
            } else if (((IFavoriteService) c01gw.getValue()).LJIIJJI() == 0) {
                str = "hit_favorite_on_video_player_reverse";
            } else if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && !awemeRawAd.isEnableFavoriteButton()) {
                str = "model_is_ad";
            } else if (aweme.getAwemeType() == 40) {
                str = "model_is_story";
            } else {
                str = "unknown_reason";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("reason", str);
            C20684815ws.LJIILLIIL("collection_button_not_exposed", c2344009Gk.LIZ);
        }
    }

    @C14EU
    public final void onPanelShowed(C0O9N c0o9n) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(c0o9n.LIZ);
        if (awemeLLILZ != null && awemeLLILZ.getAwemeType() == 40) {
            return;
        }
        Aweme awemeLLILZ2 = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(c0o9n.LIZ);
        for (C443120HZe c443120HZe : ((LinkedHashMap) LIZIZ).values()) {
            if (Intrinsics.LJFF(c443120HZe.getFirst(), c0o9n.LIZ)) {
                if (!c0o9n.LIZIZ && !((Boolean) c443120HZe.getSecond()).booleanValue() && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIZILJ()) {
                    if (!((Boolean) c443120HZe.getThird()).booleanValue() || (awemeLLILZ2 != null && (awemeRawAd2 = awemeLLILZ2.getAwemeRawAd()) != null && awemeRawAd2.isEnableFavoriteButton())) {
                        C20684815ws.onEventV3("collection_function_vanished");
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!c0o9n.LIZIZ && ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIZILJ()) {
            if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).xr(c0o9n.LIZ) == null || (awemeLLILZ2 != null && (awemeRawAd = awemeLLILZ2.getAwemeRawAd()) != null && awemeRawAd.isEnableFavoriteButton())) {
                C20684815ws.onEventV3("collection_function_vanished");
            }
        }
    }

    public static void LIZIZ(C0O9L c0o9l, C19EG c19eg, String str, String str2) {
        c0o9l.getClass();
        ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJJJJI(c19eg, str, str2, null);
    }

    public static void LIZJ(C19EG c19eg, String str, String str2, View view) {
        if (view == null) {
            IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
            if (iFavoriteService != null) {
                iFavoriteService.LJJJJI(c19eg, str, str2, null);
                return;
            }
            return;
        }
        IFavoriteService iFavoriteService2 = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService2 == null) {
            return;
        }
        iFavoriteService2.LJJIJIL(c19eg, str, str2, view);
    }
}

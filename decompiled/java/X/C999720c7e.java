package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999720c7e implements InterfaceC1000310c8b {
    public static final C999720c7e LIZ = new C999720c7e();
    public static final ConcurrentHashMap<String, C999810c7n> LIZIZ = new ConcurrentHashMap<>();
    public static WeakReference<Context> LIZJ;

    @Override // X.InterfaceC1000310c8b
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1000310c8b
    public final String LJIILIIL() {
        return "feed_lynx_mask_preload_cache_error";
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIILJJIL() {
        return 4;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIJI() {
        return 6;
    }

    public final void LIZIZ() {
        C622680Oba.LIZLLL(this);
        releaseAll();
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIIJ() {
        return LJIJJ().size();
    }

    @Override // X.InterfaceC1000310c8b
    public final ConcurrentHashMap<String, C999810c7n> LJIJJ() {
        return LIZIZ;
    }

    @Override // X.InterfaceC1000310c8b
    public final WeakReference<Context> LJIL() {
        return LIZJ;
    }

    @Override // X.InterfaceC1000310c8b
    public final void releaseAll() {
        C1000300c8a.LJ(this);
    }

    @Override // X.InterfaceC1000310c8b
    public final AbstractC999780c7k LIZ(String str) {
        return C1000300c8a.LIZIZ(this, str);
    }

    @Override // X.InterfaceC1000310c8b
    public final boolean LJIIJJI(Aweme aweme) {
        if (!C07CW.LIZ() && C1017070cZd.LLLII(aweme)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1000310c8b, X.InterfaceC990700bt6
    public final void LJIIZILJ(String str) {
        C1000300c8a.LJFF(this, str);
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIJ(Aweme aweme) {
        C1000300c8a.LIZLLL(this, aweme);
    }

    @Override // X.InterfaceC1000310c8b
    public final void LJIJJLI(WeakReference<Context> weakReference) {
        LIZJ = weakReference;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0c7k, X.0c7n, java.lang.Object] */
    @Override // X.InterfaceC1000310c8b
    public final void LJIILL(Context context, Aweme aweme) throws JSONException {
        C1029690ctz c1029690ctzLJJIIJZLJL;
        String cardUrl;
        String strK0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        final ?? r6 = new AbstractC999780c7k() { // from class: X.0c7n
            @Override // X.AbstractC999780c7k
            public final void LIZ() {
            }

            @Override // X.AbstractC999780c7k
            public final String LIZIZ() {
                return "feed_lynx_mask_preload_status";
            }

            @Override // X.AbstractC999780c7k
            public final String LIZJ() {
                return "feed_lynx_mask_preload_usage";
            }
        };
        ConcurrentHashMap<String, C999810c7n> concurrentHashMap = LIZIZ;
        C999810c7n c999810c7n = concurrentHashMap.get(aweme.getAid());
        JSONObject cardData = null;
        if (c999810c7n != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999810c7n.LIZJ) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c999810c7n.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            c999810c7n.LIZLLL = null;
        }
        concurrentHashMap.put(aweme.getAid(), (C999810c7n) r6);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) C786410Ut5.LJLLJ(context, R.layout.d4g, null).findViewById(R.id.feed_ad_lynx_mask_container_spark);
        r6.LIZJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
            LIZ.getClass();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView() != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3);
            }
            InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
            if (interfaceC1000280c8YLIZ != null) {
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService != null) {
                    strK0 = iAdLandPagePreloadService.K0("lynx_feed");
                } else {
                    strK0 = null;
                }
                aweme.getAwemeRawAd();
                c1029690ctzLJJIIJZLJL = interfaceC1000280c8YLIZ.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3, strK0, new C999770c7j<C999810c7n>(r6) { // from class: X.0c7h
                    public final C999810c7n LLILLJJLI;

                    {
                        super(r6);
                        this.LLILLJJLI = r6;
                    }

                    @Override // X.C999770c7j, X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        super.LJLIIIL(interfaceC1541990qEH);
                        LIZLLL(3);
                    }
                });
            } else {
                c1029690ctzLJJIIJZLJL = null;
            }
            Bundle bundleLIZIZ = C999560c7O.LIZIZ(context, aweme);
            CardStruct cardStructLJJIJIIJI = C1017070cZd.LJJIJIIJI(aweme);
            if (cardStructLJJIJIIJI != null && (cardUrl = cardStructLJJIJIIJI.getCardUrl()) != null) {
                r6.LIZLLL(1);
                Uri.Builder builderBuildUpon = UriProtector.parse(cardUrl).buildUpon();
                CardStruct cardStructLJJIJIIJI2 = C1017070cZd.LJJIJIIJI(aweme);
                if (cardStructLJJIJIIJI2 != null) {
                    cardData = cardStructLJJIJIIJI2.getCardData();
                }
                builderBuildUpon.appendQueryParameter("initialData", C999560c7O.LIZ(context, cardData, aweme).toString());
                if (c1029690ctzLJJIIJZLJL != null) {
                    c1029690ctzLJJIIJZLJL.LIZ(bundleLIZIZ, builderBuildUpon.toString(), C1000150c8L.LIZ().enableLynxMask);
                }
            }
        }
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIILLIIL(int i, List list) {
        C1000300c8a.LIZJ(i, this, list);
    }
}

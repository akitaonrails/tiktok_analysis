package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0c81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999950c81 implements InterfaceC1000310c8b<C999960c82> {
    public static WeakReference<Context> LIZJ;
    public static final C999950c81 LIZ = new C999950c81();
    public static final ConcurrentHashMap<String, C999960c82> LIZIZ = new ConcurrentHashMap<>();
    public static final String LIZLLL = "feed_lynx_product_tile_preload_cache_error";
    public static final int LJ = 3;
    public static final int LJFF = 2;

    @Override // X.InterfaceC1000310c8b
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIIJ() {
        return LJIJJ().size();
    }

    @Override // X.InterfaceC1000310c8b
    public final String LJIILIIL() {
        return LIZLLL;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIILJJIL() {
        return LJFF;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIJI() {
        return LJ;
    }

    @Override // X.InterfaceC1000310c8b
    public final ConcurrentHashMap<String, C999960c82> LJIJJ() {
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

    public final void LIZIZ(Context context) {
        C1000300c8a.LIZ(this, context);
        C622680Oba.LIZJ(this);
    }

    @Override // X.InterfaceC1000310c8b
    public final boolean LJIIJJI(Aweme aweme) {
        if (AwemeExtKt.isAdTraffic(aweme) && C1017070cZd.LLILZIL(aweme)) {
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

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C997410c3v c997410c3v) {
        for (AbstractC999780c7k abstractC999780c7k : LIZIZ.values()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = abstractC999780c7k.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode() == c997410c3v.LIZIZ && c997410c3v.LIZ == 1) {
                abstractC999780c7k.LIZLLL(3);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0c7k, X.0c82, java.lang.Object] */
    @Override // X.InterfaceC1000310c8b
    public final void LJIILL(Context context, Aweme aweme) {
        Context context2;
        AdProductTile productTile;
        String lynxScheme;
        String strK0;
        String nativeSiteCustomData;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        ConcurrentHashMap<String, C999960c82> concurrentHashMap = LIZIZ;
        C999960c82 c999960c82 = concurrentHashMap.get(aweme.getAid());
        if (c999960c82 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999960c82.LIZJ) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c999960c82.LIZJ) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
        }
        String aid = aweme.getAid();
        final ?? r4 = new AbstractC999780c7k() { // from class: X.0c82
            @Override // X.AbstractC999780c7k
            public final void LIZ() {
            }

            @Override // X.AbstractC999780c7k
            public final String LIZIZ() {
                return "feed_lynx_product_tile_preload_status";
            }

            @Override // X.AbstractC999780c7k
            public final String LIZJ() {
                return "feed_lynx_product_tile_preload_usage";
            }
        };
        LIZ.getClass();
        WeakReference<Context> weakReference = LIZJ;
        if (weakReference != null && (context2 = weakReference.get()) != null) {
            String string = C999870c7t.LIZ(context2, aweme).toString();
            Bundle bundle = new Bundle();
            InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
            if (interfaceC1000280c8YLIZ != null) {
                interfaceC1000280c8YLIZ.LJIJJ(context2, bundle, aweme);
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData()) != null) {
                C786410Ut5.LJJJI("bundle_native_site_custom_data", nativeSiteCustomData, bundle);
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (productTile = awemeRawAd2.getProductTile()) != null && (lynxScheme = productTile.getLynxScheme()) != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(lynxScheme).buildUpon();
                builderBuildUpon.appendQueryParameter("initialData", string).toString();
                String string2 = builderBuildUpon.toString();
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService != null) {
                    strK0 = iAdLandPagePreloadService.K0("lynx_feed");
                } else {
                    strK0 = null;
                }
                aweme.getAwemeRawAd();
                r4.LIZJ = new C1029670ctx(context2, strK0).LIZ(string2, bundle, new C999770c7j<C999960c82>(r4) { // from class: X.0c80
                    @Override // X.C999770c7j, X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        super.LJLIIIL(interfaceC1541990qEH);
                        View viewE1 = interfaceC1541990qEH.e1();
                        if (viewE1 != null) {
                            C786410Ut5.W5(viewE1, new FrameLayout.LayoutParams(-1, -2));
                        }
                    }
                }, C1000150c8L.LIZ().enableProductTitle);
            }
        }
        concurrentHashMap.put(aid, (C999960c82) r4);
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIILLIIL(int i, List list) {
        C1000300c8a.LIZJ(i, this, list);
    }
}

package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0c7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999920c7y implements InterfaceC1000310c8b<C999980c84> {
    public static final C999920c7y LIZ = new C999920c7y();
    public static final ConcurrentHashMap<String, C999980c84> LIZIZ = new ConcurrentHashMap<>();
    public static WeakReference<Context> LIZJ;

    @Override // X.InterfaceC1000310c8b
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1000310c8b
    public final String LJIILIIL() {
        return "feed_lynx_superlike_preload_cache_error";
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIILJJIL() {
        return 4;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIJI() {
        return 6;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIIJ() {
        return LJIJJ().size();
    }

    @Override // X.InterfaceC1000310c8b
    public final ConcurrentHashMap<String, C999980c84> LJIJJ() {
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
        return C1017070cZd.LLIIII(aweme);
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

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0c7k, X.0c84, java.lang.Object] */
    @Override // X.InterfaceC1000310c8b
    public final void LJIILL(Context context, Aweme aweme) throws JSONException {
        AdLynxEntryData lynxEntryData;
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        final ?? r4 = new AbstractC999780c7k() { // from class: X.0c84
            @Override // X.AbstractC999780c7k
            public final void LIZ() {
            }

            @Override // X.AbstractC999780c7k
            public final String LIZIZ() {
                return "feed_lynx_superlike_preload_status";
            }

            @Override // X.AbstractC999780c7k
            public final String LIZJ() {
                return "feed_lynx_superlike_preload_usage";
            }
        };
        ConcurrentHashMap<String, C999980c84> concurrentHashMap = LIZIZ;
        C999980c84 c999980c84 = concurrentHashMap.get(aweme.getAid());
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        String strK0 = null;
        if (c999980c84 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999980c84.LIZJ) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c999980c84.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            c999980c84.LIZLLL = null;
        }
        concurrentHashMap.put(aweme.getAid(), (C999980c84) r4);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.d4j, null);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLJLLJ.findViewById(R.id.feed_ad_lynx_super_like_spark_container);
        r4.LIZIZ = viewLJLLJ;
        r4.LIZJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3;
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
                }
                aweme.getAwemeRawAd();
                c1029690ctzLJJIIJZLJL = interfaceC1000280c8YLIZ.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3, strK0, new C999770c7j<C999980c84>(r4) { // from class: X.0c7x
                    public final C999980c84 LLILLJJLI;

                    {
                        super(r4);
                        this.LLILLJJLI = r4;
                    }

                    @Override // X.C999770c7j, X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        super.LJLIIIL(interfaceC1541990qEH);
                        LIZLLL(3);
                    }
                });
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && (str = lynxEntryData.lynxScheme) != null) {
                r4.LIZLLL(1);
                Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("initialData", C999930c7z.LIZ(context, aweme).toString());
                if (c1029690ctzLJJIIJZLJL != null) {
                    String string = builderAppendQueryParameter.toString();
                    Bundle bundle = new Bundle();
                    InterfaceC1000280c8Y interfaceC1000280c8YLIZ2 = C988590bph.LIZ();
                    if (interfaceC1000280c8YLIZ2 != null) {
                        interfaceC1000280c8YLIZ2.LJIJJ(context, bundle, aweme);
                    }
                    c1029690ctzLJJIIJZLJL.LIZ(bundle, string, C1000150c8L.LIZ().enableLynxSuperLike);
                }
            }
        }
        C811103Ev.LIZIZ(context, "superlike old prerender");
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIILLIIL(int i, List list) {
        C1000300c8a.LIZJ(i, this, list);
    }
}

package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0c7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999880c7u implements InterfaceC1000310c8b {
    public static final C999880c7u LIZ = new C999880c7u();
    public static final ConcurrentHashMap<String, C999970c83> LIZIZ = new ConcurrentHashMap<>();
    public static WeakReference<Context> LIZJ;

    @Override // X.InterfaceC1000310c8b
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1000310c8b
    public final String LJIILIIL() {
        return "feed_lynx_sticker_preload_cache_error";
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
    public final ConcurrentHashMap<String, C999970c83> LJIJJ() {
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
        return C1017070cZd.LLLILZ(aweme);
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

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0c7k, X.0c83, java.lang.Object] */
    public static void LIZJ(Context context, Aweme aweme) {
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        final ?? r5 = new AbstractC999780c7k() { // from class: X.0c83
            @Override // X.AbstractC999780c7k
            public final void LIZ() {
            }

            @Override // X.AbstractC999780c7k
            public final String LIZIZ() {
                return "feed_lynx_sticker_preload_status";
            }

            @Override // X.AbstractC999780c7k
            public final String LIZJ() {
                return "feed_lynx_sticker_preload_usage";
            }
        };
        ConcurrentHashMap<String, C999970c83> concurrentHashMap = LIZIZ;
        C999970c83 c999970c83 = concurrentHashMap.get(aweme.getAid());
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        String strK0 = null;
        if (c999970c83 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999970c83.LIZJ) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c999970c83.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            c999970c83.LIZLLL = null;
        }
        concurrentHashMap.put(aweme.getAid(), (C999970c83) r5);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.d4i, null);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLJLLJ.findViewById(R.id.spark_ad_sticker_view);
        r5.LIZIZ = viewLJLLJ;
        r5.LIZJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3;
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
                c1029690ctzLJJIIJZLJL = interfaceC1000280c8YLIZ.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3, strK0, new C999770c7j<C999970c83>(r5) { // from class: X.0c7w
                    public final C999970c83 LLILLJJLI;

                    {
                        super(r5);
                        this.LLILLJJLI = r5;
                    }

                    @Override // X.C999770c7j, X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        super.LJLIIIL(interfaceC1541990qEH);
                        LIZLLL(3);
                    }
                });
            }
            Bundle bundle = new Bundle();
            InterfaceC1000280c8Y interfaceC1000280c8YLIZ2 = C988590bph.LIZ();
            if (interfaceC1000280c8YLIZ2 != null) {
                interfaceC1000280c8YLIZ2.LJIJJ(context, bundle, aweme);
            }
            AdStickerData adStickerDataLJIILLIIL = C1017070cZd.LJIILLIIL(aweme);
            if (adStickerDataLJIILLIIL != null && (str = adStickerDataLJIILLIIL.stickerUrl) != null) {
                r5.LIZLLL(1);
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                n nVarLIZ = C999590c7R.LIZ(context, aweme);
                C999890c7v.LIZ(aweme, nVarLIZ);
                builderBuildUpon.appendQueryParameter("initialData", nVarLIZ.toString());
                if (c1029690ctzLJJIIJZLJL != null) {
                    c1029690ctzLJJIIJZLJL.LIZ(bundle, builderBuildUpon.toString(), C1000150c8L.LIZ().enableLynxSticker);
                }
            }
        }
    }

    @Override // X.InterfaceC1000310c8b
    public final void LJIILL(Context context, Aweme aweme) {
        C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
        EnumC1001380cAK enumC1001380cAK = EnumC1001380cAK.STICKER_OPERATION;
        if (c1001410cAN.LIZ(enumC1001380cAK)) {
            C1001420cAO c1001420cAO = new C1001420cAO(enumC1001380cAK.getTaskIdWithType(aweme.getAid()), EnumC599900Nfw.FEED);
            c1001420cAO.LIZJ = new AwS417S0200000_16(context, aweme, 44);
            c1001420cAO.LJ = (EnumC1001450cAR) C1001430cAP.LIZJ.getValue();
            c1001420cAO.LIZLLL = enumC1001380cAK;
            c1001420cAO.LJI = C0NO3.MAIN;
            c1001410cAN.LJI(c1001420cAO);
            return;
        }
        LIZJ(context, aweme);
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIILLIIL(int i, List list) {
        C1000300c8a.LIZJ(i, this, list);
    }
}

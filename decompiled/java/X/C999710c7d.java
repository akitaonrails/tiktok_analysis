package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS417S0200000_16;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0c7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999710c7d implements InterfaceC999820c7o {
    public static final C999710c7d LIZ = new C999710c7d();
    public static final ConcurrentHashMap<String, C999800c7m> LIZIZ = new ConcurrentHashMap<>();
    public static WeakReference<Context> LIZJ;
    public static CardStruct LIZLLL;

    @Override // X.InterfaceC1000310c8b
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1000310c8b
    public final String LJIILIIL() {
        return "feed_lynx_card_preload_cache_error";
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIILJJIL() {
        return 4;
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIJI() {
        return 6;
    }

    public final void LIZJ() {
        C622680Oba.LIZLLL(this);
        releaseAll();
    }

    @Override // X.InterfaceC1000310c8b
    public final int LJIIJ() {
        return LJIJJ().size();
    }

    @Override // X.InterfaceC1000310c8b
    public final ConcurrentHashMap<String, C999800c7m> LJIJJ() {
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

    public static final boolean LJFF(Aweme aweme) throws JSONException {
        WeakReference<Context> weakReference;
        Context context;
        if (aweme == null || (weakReference = LIZJ) == null || (context = weakReference.get()) == null) {
            return false;
        }
        ConcurrentHashMap<String, C999800c7m> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey(aweme.getAid())) {
            return false;
        }
        C999800c7m c999800c7m = concurrentHashMap.get(aweme.getAid());
        if (c999800c7m != null && !c999800c7m.LJFF && c999800c7m.LIZ == 3) {
            return false;
        }
        LJ(aweme, context, c999800c7m);
        return true;
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
        if (AwemeExtKt.isAdTraffic(aweme) && C1017070cZd.LLILLL(aweme)) {
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
        int iHashCode;
        for (AbstractC999780c7k abstractC999780c7k : LIZIZ.values()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = abstractC999780c7k.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                iHashCode = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == c997410c3v.LIZIZ && c997410c3v.LIZ == 1) {
                abstractC999780c7k.LIZLLL(3);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0c7k, X.0c7m, java.lang.Object] */
    public static void LIZLLL(Context context, Aweme aweme) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ?? r4 = new AbstractC999780c7k() { // from class: X.0c7m
            @Override // X.AbstractC999780c7k
            public final void LIZ() {
            }

            @Override // X.AbstractC999780c7k
            public final String LIZIZ() {
                return "feed_lynx_card_preload_status";
            }

            @Override // X.AbstractC999780c7k
            public final String LIZJ() {
                return "feed_lynx_card_preload_usage";
            }
        };
        ConcurrentHashMap<String, C999800c7m> concurrentHashMap = LIZIZ;
        C999800c7m c999800c7m = concurrentHashMap.get(aweme.getAid());
        if (c999800c7m != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999800c7m.LIZJ) != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c999800c7m.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            c999800c7m.LIZLLL = null;
        }
        concurrentHashMap.put(aweme.getAid(), (C999800c7m) r4);
        r4.LIZJ = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) C786410Ut5.LJLLJ(context, R.layout.d4f, null).findViewById(R.id.spark_container);
        LJ(aweme, context, r4);
    }

    @Override // X.InterfaceC1000310c8b
    public final void LJIILL(Context context, Aweme aweme) {
        C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
        EnumC1001380cAK enumC1001380cAK = EnumC1001380cAK.CARD_OPERATION;
        if (c1001410cAN.LIZ(enumC1001380cAK)) {
            C1001420cAO c1001420cAO = new C1001420cAO(enumC1001380cAK.getTaskIdWithType(aweme.getAid()), EnumC599900Nfw.FEED);
            c1001420cAO.LIZJ = new AwS417S0200000_16(context, aweme, 86);
            c1001420cAO.LJ = (EnumC1001450cAR) C1001430cAP.LIZJ.getValue();
            c1001420cAO.LIZLLL = enumC1001380cAK;
            c1001420cAO.LJI = C0NO3.MAIN;
            c1001410cAN.LJI(c1001420cAO);
            return;
        }
        LIZLLL(context, aweme);
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIILLIIL(int i, List list) {
        C1000300c8a.LIZJ(i, this, list);
    }

    public static void LJ(Aweme aweme, Context context, final C999800c7m c999800c7m) throws JSONException {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        String cardUrl;
        C1029690ctz c1029690ctzLJJIIJZLJL = null;
        String strK0 = null;
        if (c999800c7m != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c999800c7m.LIZJ) != null) {
            LIZ.getClass();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
            InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
            if (interfaceC1000280c8YLIZ != null) {
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService != null) {
                    strK0 = iAdLandPagePreloadService.K0("lynx_feed");
                }
                aweme.getAwemeRawAd();
                c1029690ctzLJJIIJZLJL = interfaceC1000280c8YLIZ.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, strK0, new C999770c7j<C999800c7m>(c999800c7m) { // from class: X.0c7i
                    @Override // X.C999770c7j, X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        super.LJLIIIL(interfaceC1541990qEH);
                        View viewE1 = interfaceC1541990qEH.e1();
                        if (viewE1 != null) {
                            C786410Ut5.W5(viewE1, new FrameLayout.LayoutParams(C341940Daq.LIZ(270.0d), -2));
                        }
                    }
                });
            }
            Bundle bundleLIZIZ = C999690c7b.LIZIZ(context, aweme);
            CardStruct cardStructLJJIIZI = C1017070cZd.LJJIIZI(aweme);
            LIZLLL = cardStructLJJIIZI;
            if (cardStructLJJIIZI != null && (cardUrl = cardStructLJJIIZI.getCardUrl()) != null) {
                Uri.Builder builderBuildUpon = UriProtector.parse(cardUrl).buildUpon();
                builderBuildUpon.appendQueryParameter("initialData", C999690c7b.LIZ(aweme, LIZLLL, context).toString());
                if (c1029690ctzLJJIIJZLJL != null) {
                    c1029690ctzLJJIIJZLJL.LIZ(bundleLIZIZ, builderBuildUpon.toString(), C1000150c8L.LIZ().enableLynxCard);
                }
                c999800c7m.LIZLLL(1);
            }
        }
    }
}

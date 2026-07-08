package X;

import com.ss.android.ugc.aweme.compliance.api.model.FeedLynxOverlayConfig;
import kotlin.jvm.internal.AwS146S1200000_31;

/* JADX INFO: renamed from: X.15aJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20544915aJ {
    public static final C20544915aJ LIZ = new C20544915aJ();
    public static final C054G LIZIZ;
    public static volatile EnumC20545715aR LIZJ;
    public static volatile FeedLynxOverlayConfig LIZLLL;
    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJ;
    public static String LJFF;
    public static AnonymousClass0956 LJI;
    public static long LJII;

    static {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        LIZJ = EnumC20545715aR.LL;
    }

    public static void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = LJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
        }
        LJ = null;
        LJFF = null;
    }

    public static void LIZ(String str) {
        if (LIZJ != EnumC20545715aR.LLILLJJLI) {
            return;
        }
        LIZIZ();
        LIZJ(EnumC20545715aR.LLILZIL, str);
        C1440005kM.LIZ(new C1571830r0P(EnumC20538815Yk.DISMISS, str));
    }

    public static void LIZLLL(FeedLynxOverlayConfig feedLynxOverlayConfig) {
        LIZLLL = feedLynxOverlayConfig;
        C23250099c.LIZLLL(LIZIZ, null, null, new C20545115aL(feedLynxOverlayConfig, null), 3);
    }

    public static void LIZJ(EnumC20545715aR enumC20545715aR, String str) {
        EnumC20545715aR enumC20545715aR2 = LIZJ;
        AnonymousClass0956 anonymousClass0956 = LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJI = null;
        LIZJ = enumC20545715aR;
        new AwS146S1200000_31(enumC20545715aR2, enumC20545715aR, str, 5);
        int iOrdinal = enumC20545715aR.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                LJI = C23250099c.LIZLLL(LIZIZ, null, null, new C20545215aM(null), 3);
                return;
            }
            return;
        }
        LJI = C23250099c.LIZLLL(LIZIZ, null, null, new C20545315aN(null), 3);
    }
}

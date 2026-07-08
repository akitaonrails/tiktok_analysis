package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.utils.AttributionInfoData;
import com.ss.android.ugc.aweme.utils.AttributionInfoResponse;
import com.ss.android.ugc.aweme.utils.NewUserLandingApi;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10UP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10UP {
    public static boolean LIZIZ;
    public static final C10UP LIZ = new C10UP();
    public static int LIZJ = 1;

    public static void LIZ(final boolean z) throws Throwable {
        if (C1514430pVp.LIZLLL().booleanValue() && !LIZIZ) {
            NewUserLandingApi newUserLandingApi = (NewUserLandingApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ("https://tiktokv.com").create(NewUserLandingApi.class);
            String strLIZIZ = LIZIZ(false);
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            C10SW.LIZ.getClass();
            C10SW.LJFF("request_send");
            newUserLandingApi.getGoogleAttributionInfo(strLIZIZ, ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCdid()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZIZ(new InterfaceC626120Oh8<AttributionInfoResponse>() { // from class: X.10UT
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    C10SW.LIZ.getClass();
                    C10SW.LJFF("request_failed");
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(AttributionInfoResponse attributionInfoResponse) {
                    AttributionInfoResponse attributionInfoResponse2 = attributionInfoResponse;
                    C10SW.LIZ.getClass();
                    C10SW.LJFF("request_success");
                    int i = attributionInfoResponse2.errCode;
                    AttributionInfoData attributionInfoData = attributionInfoResponse2.data;
                    C10UP c10up = C10UP.LIZ;
                    boolean z2 = z;
                    long j = jElapsedRealtime;
                    c10up.getClass();
                    C10UP.LIZJ(i, attributionInfoData, z2, j, "landing api", "");
                }
            });
        }
    }

    public static String LIZIZ(boolean z) throws Throwable {
        String storeRegionUpperCase;
        if (z) {
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) {
                storeRegionUpperCase = "";
            }
            if (Intrinsics.LJFF(storeRegionUpperCase, "US")) {
                return "";
            }
        }
        try {
            C844470XAv.LIZ.getClass();
            AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
            if (infoLIZIZ != null) {
                String strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOyhcZrM3SEnREJ/g8g5CFPdtytJ/PtvsW96cUFViS7urFsvmlwLrQ==", null));
                if (strLLLLLIL != null) {
                    return strLLLLLIL;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }

    public static boolean LIZLLL(String str) {
        String lowerCase;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = UriProtector.parse(str).getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.US);
        } else {
            lowerCase = null;
        }
        if (!TextUtils.equals(lowerCase, "onboarding")) {
            return false;
        }
        return true;
    }

    public final void LJ(String str, String str2) {
        LJFF(str, str2, "", "", "af");
    }

    public final synchronized void LJFF(String str, String str2, String str3, String str4, String str5) {
        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService;
        if (!((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null) && (iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null)) != null) {
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null) {
                iAccountService.getStoreRegionUpperCase();
            }
            iNewUserJourneyAppDiffService.LJFF();
        }
        LJI(str, str2, str3, str4, "", str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0324 A[PHI: r10
      0x0324: PHI (r10v12 java.lang.String) = (r10v11 java.lang.String), (r10v16 java.lang.String) binds: [B:131:0x0321, B:115:0x02d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0328 A[PHI: r9 r10
      0x0328: PHI (r9v13 java.lang.String) = (r9v12 java.lang.String), (r9v15 java.lang.String) binds: [B:134:0x0325, B:118:0x02df] A[DONT_GENERATE, DONT_INLINE]
      0x0328: PHI (r10v13 java.lang.String) = (r10v12 java.lang.String), (r10v15 java.lang.String) binds: [B:134:0x0325, B:118:0x02df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0349 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r18, com.ss.android.ugc.aweme.utils.AttributionInfoData r19, boolean r20, long r21, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10UP.LIZJ(int, com.ss.android.ugc.aweme.utils.AttributionInfoData, boolean, long, java.lang.String, java.lang.String):void");
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5, String str6) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0WVW(str4, str, str2, str3, str5, str6, null), 3);
    }
}

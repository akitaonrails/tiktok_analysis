package X;

import android.content.Context;
import com.bytedance.pns.crypto2.CryptoInitializer;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.crypto.CryptoNetwork;
import com.ss.android.ugc.aweme.legoImp.task.crypto.KeyVersion;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.09jJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2452709jJ {
    public static final C2452709jJ LIZ = new C2452709jJ();

    public static C092M LIZIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        return new C092M(contextLIZ, String.valueOf(C844470XAv.LJIIJ), DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId(), C844470XAv.LJIILL, String.valueOf(C844470XAv.LJ()), String.valueOf(C844470XAv.LIZLLL()), contextLIZ.getPackageName());
    }

    public static String LIZJ() {
        C1798060wtI c1798060wtI = C1798060wtI.LIZ;
        C847070XKv c847070XKvLIZ = C1798060wtI.LIZ();
        if (c847070XKvLIZ != null) {
            return C2273401Dyc.LIZ(c847070XKvLIZ.LIZ);
        }
        LIZ.getClass();
        return C2273401Dyc.LIZ(C2273401Dyc.LJFF.get(LIZ()));
    }

    public static void LIZLLL() throws JSONException {
        if (((Boolean) C2453509jR.LIZ.getValue()).booleanValue()) {
            C092P c092p = new C092P(new CryptoNetwork());
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            String strLIZ = LIZ();
            C092M c092mLIZIZ = LIZIZ();
            long j = C2452909jL.LIZ().defaultKeyExpirationTime;
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            CryptoInitializer cryptoInitializer = new CryptoInitializer(contextLIZ, strLIZ, c092p, c092mLIZIZ, j * j2, j2 * C2452909jL.LIZ().defaultGlobalKeyExpirationTime, C2452909jL.LIZ().enableVerify);
            String strLIZJ = LIZJ();
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            if (C2452909jL.LIZ().enabled && C123100dR.LIZ(strLIZJ)) {
                String strLIZIZ = C2452909jL.LIZIZ(strLIZJ);
                int iLIZJ = C2452909jL.LIZJ(strLIZJ);
                if (strLIZIZ.length() == 0) {
                    return;
                }
                cryptoInitializer.LJI(C2452909jL.LIZ().cipherSuiteId, C2452909jL.LIZ().enablePQC, strLIZIZ, iLIZJ, false, new C2500709r3(cryptoInitializer, 1));
            }
        }
    }

    public static void LJ() {
        String str;
        if (((Boolean) C2453509jR.LIZ.getValue()).booleanValue()) {
            C092P c092p = new C092P(new CryptoNetwork());
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            String strLIZ = LIZ();
            C092M c092mLIZIZ = LIZIZ();
            long j = C2452909jL.LIZ().defaultKeyExpirationTime;
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            final CryptoInitializer cryptoInitializer = new CryptoInitializer(contextLIZ, strLIZ, c092p, c092mLIZIZ, j * j2, j2 * C2452909jL.LIZ().defaultGlobalKeyExpirationTime, C2452909jL.LIZ().enableVerify);
            if (C2452909jL.LIZ().enabled) {
                KeyVersion keyVersion = C2452909jL.LIZ().signKey.get("global");
                if (keyVersion == null || (str = keyVersion.key) == null) {
                    str = "";
                }
                KeyVersion keyVersion2 = C2452909jL.LIZ().signKey.get("global");
                int i = keyVersion2 != null ? keyVersion2.version : 0;
                if (str.length() == 0) {
                    return;
                }
                cryptoInitializer.LJI(C2452909jL.LIZ().cipherSuiteId, C2452909jL.LIZ().enablePQC, str, i, true, new C092O() { // from class: X.09gu
                    @Override // X.C092O
                    public final void accept(Object obj) throws JSONException {
                        C092R c092r = (C092R) obj;
                        if (c092r.LIZ == 0 && Intrinsics.LJFF(c092r.LIZIZ, "success")) {
                            CryptoInitializer cryptoInitializer2 = cryptoInitializer;
                            C08GR.LIZ.getClass();
                            String strLIZIZ = C08GR.LIZIZ(true);
                            C2438109gx<T> c2438109gx = new C092O() { // from class: X.09gx
                                @Override // X.C092O
                                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                }
                            };
                            cryptoInitializer2.getClass();
                            cryptoInitializer2.LJII(1, System.currentTimeMillis(), c2438109gx, strLIZIZ, true);
                        }
                    }
                });
                String strLIZJ = LIZJ();
                String str2 = strLIZJ != null ? strLIZJ : "";
                String strLIZIZ = C2452909jL.LIZIZ(str2);
                int iLIZJ = C2452909jL.LIZJ(str2);
                if (strLIZIZ.length() == 0) {
                    return;
                }
                cryptoInitializer.LJI(C2452909jL.LIZ().cipherSuiteId, C2452909jL.LIZ().enablePQC, strLIZIZ, iLIZJ, false, new C092O() { // from class: X.09gv
                    @Override // X.C092O
                    public final void accept(Object obj) throws JSONException {
                        C092R c092r = (C092R) obj;
                        if (c092r.LIZ == 0 && Intrinsics.LJFF(c092r.LIZIZ, "success")) {
                            CryptoInitializer cryptoInitializer2 = cryptoInitializer;
                            C08GR.LIZ.getClass();
                            String strLIZIZ2 = C08GR.LIZIZ(false);
                            C2438209gy<T> c2438209gy = new C092O() { // from class: X.09gy
                                @Override // X.C092O
                                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                }
                            };
                            cryptoInitializer2.getClass();
                            cryptoInitializer2.LJII(1, System.currentTimeMillis(), c2438209gy, strLIZIZ2, false);
                        }
                    }
                });
            }
        }
    }

    public static String LIZ() {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        return accountUserServiceLJIIJ.isLogin() ? accountUserServiceLJIIJ.getCurUserId() : CardStruct.IStatusCode.DEFAULT;
    }
}

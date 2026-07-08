package X;

import Y.ARunnableS0S2000000_3;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: X.0Vp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809400Vp4 {
    public static String LIZ(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            byte[] bytes = "c569a8895e4dd8e8c37012f9f9d2b55b".getBytes(StandardCharsets.UTF_8);
            byte[] bytes2 = "29ab874e7f549865".getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decryptAes - error: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("decryptAes - error: ");
                sbLIZ2.append(e.getClass().getSimpleName());
                C809030VoT.LJIIL(30, C2188811AlT.LIZIZ(sbLIZ2));
                return "";
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return "";
            }
        }
    }

    public static void LIZIZ(String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doVerifyMessage() start, decryptedData length: ");
            sbLIZ.append(str.length());
            C2188811AlT.LIZIZ(sbLIZ);
            C809030VoT.LJIILIIL(30, str);
            ((C808680Vnu) C809030VoT.LJIILJJIL()).LJ(30, str, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("doVerifyMessage - error: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("doVerifyMessage - error: ");
                sbLIZ3.append(e.getClass().getSimpleName());
                C809030VoT.LJIIL(30, C2188811AlT.LIZIZ(sbLIZ3));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static boolean LIZJ(String str, String str2) {
        try {
            String strLIZ = LIZ(str2);
            if (strLIZ.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(".verifyMessage(), decryptedData data is empty");
                C2188811AlT.LIZIZ(sbLIZ);
                try {
                    C809030VoT.LJIIL(30, "decryptedData is empty");
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(".verifyMessage(), decoded data length: ");
            sbLIZ2.append(strLIZ.length());
            sbLIZ2.append(", @");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C2188811AlT.LIZIZ(sbLIZ2);
            C809020VoS c809020VoS = C809050VoV.LIZ;
            c809020VoS.getClass();
            C809030VoT c809030VoT = C809030VoT.LJIIJ;
            c809030VoT.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("PushSupporter.setShowOppoSystemPush(), show: ");
            sbLIZ3.append(false);
            C2188811AlT.LIZIZ(sbLIZ3);
            c809030VoT.LJIIIZ = false;
            if (PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZIZ("ensure_init_configurations", false) && c809030VoT.LIZIZ == null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append(": needEnsureInit && PushSupporter.get().getConfiguration() == null");
                C2188811AlT.LIZIZ(sbLIZ4);
                c809030VoT.LJFF(new ARunnableS0S2000000_3(str, strLIZ, 5));
            } else {
                LIZIZ(strLIZ);
            }
            c809020VoS.getClass();
            boolean z = c809030VoT.LJIIIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append(".verifyMessage() end, isShowOppoSystemPush: ");
            sbLIZ5.append(z);
            C2188811AlT.LIZIZ(sbLIZ5);
            return z;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(str);
            sbLIZ6.append(".verifyMessage() - error: ");
            sbLIZ6.append(e2.getMessage());
            C2188811AlT.LIZIZ(sbLIZ6);
            try {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("some error occurs during verifyMessage: ");
                sbLIZ7.append(e2.getClass().getSimpleName());
                C809030VoT.LJIIL(30, C2188811AlT.LIZIZ(sbLIZ7));
                return false;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return false;
            }
        }
    }
}

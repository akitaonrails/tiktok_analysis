package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1B9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200381B9w {
    public static boolean LIZ(Context context) throws Throwable {
        List listLJII = C2204961BRm.LJII((ActivityManager) C786410Ut5.H2(context, "activity"), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/ZWDqG7X3H+wKzWdYvbTsNg==", null));
        String strJ4 = C786410Ut5.j4("%s:safemode", new Object[]{context.getPackageName()});
        Iterator it2 = listLJII.iterator();
        while (it2.hasNext()) {
            if (((ActivityManager.RunningAppProcessInfo) it2.next()).processName.equals(strJ4)) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] bArrDigest = messageDigest.digest();
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    if ((b & 255) < 16) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
                        sbLIZ.append(Integer.toHexString(bArrDigest[i] & 255));
                        stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        stringBuffer.append(Integer.toHexString(b & 255));
                    }
                }
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return stringBuffer.toString();
        }
        return "";
    }

    public static void LIZJ(int i, Throwable th) {
        if (C2203571BMd.LJIILLIIL.LIZIZ != null) {
            C805380Via.LJ("LaunchProtectException", C786410Ut5.j4("LaunchProtect stage: %d", new Object[]{Integer.valueOf(i)}), th);
        }
        C2200391B9x.LIZ(C786410Ut5.j4("reportInnerExceptionInStage %d", new Object[]{Integer.valueOf(i)}), th);
    }
}

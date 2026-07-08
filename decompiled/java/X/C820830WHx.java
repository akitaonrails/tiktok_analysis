package X;

import android.content.pm.Signature;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;

/* JADX INFO: renamed from: X.0WHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820830WHx {
    public static final C820830WHx LIZ = new C820830WHx();

    public static String LIZ(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        try {
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(byteArray);
                byte[] bArrDigest = messageDigest.digest();
                int length = bArrDigest.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    if (Integer.toHexString(bArrDigest[i] & 255).length() == 1) {
                        stringBuffer.append(CardStruct.IStatusCode.DEFAULT);
                        stringBuffer.append(Integer.toHexString(bArrDigest[i] & 255));
                    } else {
                        stringBuffer.append(Integer.toHexString(bArrDigest[i] & 255));
                    }
                    i = i2;
                }
                return stringBuffer.toString().toUpperCase();
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0WI2 c0wi2 = new C0WI2();
            c0wi2.LIZIZ("share_sdk_get_pkg_sign_failed");
            c0wi2.LIZ(e.getMessage(), "err_msg");
            c0wi2.LIZ(Log.getStackTraceString(e), "err_msg_stack");
            c0wi2.LIZJ();
            return "";
        }
    }
}

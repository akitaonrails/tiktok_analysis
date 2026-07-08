package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296830jqr {
    public static List<String> LIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
        try {
            if (interfaceC1324680kZm instanceof C1296510jqL) {
                List<InterfaceC1324680kZm> list = ((C1296510jqL) interfaceC1324680kZm).LIZ;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(LIZIZ(list.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(LIZIZ(interfaceC1324680kZm));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static String LIZIZ(InterfaceC1324680kZm interfaceC1324680kZm) throws UnsupportedEncodingException {
        byte[] bytes = interfaceC1324680kZm.LIZ().getBytes("UTF-8");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}

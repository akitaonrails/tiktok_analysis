package X;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2460209kW {
    public static final C2460309kX LIZ = new C2460309kX("PhoneskyVerificationUtils");

    public static boolean LIZ(Signature[] signatureArr) {
        String strEncodeToString;
        if (signatureArr != null && (signatureArr.length) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException e) {
                    TryCatchGuardChecker.doCheck(e);
                    strEncodeToString = "";
                }
                arrayList.add(strEncodeToString);
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString))) {
                    return true;
                }
            }
            C2460309kX c2460309kX = LIZ;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                }
            }
            objArr[0] = sb.toString();
            c2460309kX.LIZIZ(C786410Ut5.j4("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
            return false;
        }
        LIZ.LIZIZ("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
        return false;
    }
}

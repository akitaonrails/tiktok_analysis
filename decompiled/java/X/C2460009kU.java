package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09kU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2460009kU {
    public static final C2460109kV LIZ = new C2460109kV("PhoneskyVerificationUtils");

    public static boolean LIZ(Context context) {
        String strEncodeToString;
        try {
            if (!C786410Ut5.V3(context.getPackageManager(), "com.android.vending", 0).enabled) {
                LIZ.LIZJ("Play Store package is disabled.", new Object[0]);
                return false;
            }
            try {
                Signature[] signatureArr = C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 64).signatures;
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
                    C2460109kV c2460109kV = LIZ;
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
                    c2460109kV.LIZJ(C786410Ut5.j4("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
                    return false;
                }
                LIZ.LIZJ("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            } catch (PackageManager.NameNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LIZ.LIZJ("Play Store package is not found.", new Object[0]);
                return false;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LIZ.LIZJ("Play Store package is not found.", new Object[0]);
            return false;
        }
    }
}

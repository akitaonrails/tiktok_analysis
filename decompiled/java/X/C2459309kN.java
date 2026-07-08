package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09kN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2459309kN {
    public static final C2458409kE LIZJ = new C2458409kE("SplitInstallService");
    public static final Intent LIZLLL = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public final String LIZ;
    public final C2466309lV LIZIZ;

    public static Bundle LIZJ() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    public static C835510Wq5 LIZLLL() {
        LIZJ.LIZIZ("onError(%d)", -14);
        return C835460Wq0.LIZLLL(new C812870Vuf(-14));
    }

    public static Bundle LIZ(C2458709kH c2458709kH) {
        Bundle bundleLIZJ = LIZJ();
        c2458709kH.getClass();
        ArrayList arrayList = new ArrayList();
        for (AbstractC2459509kP abstractC2459509kP : (ArrayList) c2458709kH.LIZ) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC2459509kP.LIZ());
            bundle.putLong("event_timestamp", abstractC2459509kP.LIZIZ());
            arrayList.add(bundle);
        }
        C786410Ut5.LJJIL(bundleLIZJ, "event_timestamps", new ArrayList(arrayList));
        return bundleLIZJ;
    }

    public static /* bridge */ /* synthetic */ ArrayList LIZIZ(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("module_name", str, bundle);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public C2459309kN(Context context, String str) {
        int length;
        String strEncodeToString;
        this.LIZ = str;
        try {
            if (C786410Ut5.V3(context.getPackageManager(), "com.android.vending", 0).enabled) {
                Signature[] signatureArr = C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 64).signatures;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
                    int i = 0;
                    do {
                        byte[] byteArray = signatureArr[i].toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException e) {
                            TryCatchGuardChecker.doCheck(e);
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString) && ((!Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString))) {
                            i++;
                        } else {
                            Context contextN3 = C786410Ut5.N3(context);
                            this.LIZIZ = new C2466309lV(contextN3 != null ? contextN3 : context, LIZJ, LIZLLL);
                            return;
                        }
                    } while (i < length);
                    return;
                }
                C2459609kQ.LIZ.LJ("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}

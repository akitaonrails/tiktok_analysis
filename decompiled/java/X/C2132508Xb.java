package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2132508Xb {
    public static String LIZIZ(List<String> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                sb.append((String) ListProtector.get(list, i));
            }
            return sb.toString();
        }
        return null;
    }

    public static List<String> LIZ(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfoY3.signatures;
            if (signatureArr == null) {
                return null;
            }
            for (Signature signature : signatureArr) {
                arrayList.add(C2085108Ev.LIZ(signature.toByteArray()));
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

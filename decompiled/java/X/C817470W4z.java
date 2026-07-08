package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0W4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C817470W4z {
    public final C0W53 LIZ;
    public final ComponentName LIZIZ;

    public final boolean LIZLLL() {
        try {
            return this.LIZ.LLLIIIIL(0L);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final C0W59 LIZJ(C0W58 c0w58) {
        C0W56 c0w56 = new C0W56(c0w58);
        try {
            if (this.LIZ.LLFII(c0w56)) {
                return new C0W59(this.LIZ, c0w56, this.LIZIZ);
            }
            return null;
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C817470W4z(C0W53 c0w53, ComponentName componentName) {
        this.LIZ = c0w53;
        this.LIZIZ = componentName;
    }

    public static String LIZIZ(Context context, List<String> list) {
        List<String> arrayList;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", UriProtector.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public static boolean LIZ(Context context, String str, C0W50 c0w50) {
        c0w50.mApplicationContext = C786410Ut5.N3(context);
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return C2204961BRm.LJJJJ(context, intent, c0w50, 33, new C0WZX("dTF6Tg0zW9KSV0UuUgGBdArd5WzTSLJm2jdlfRR5yJDnfYZwDzY1zsO7IWc=", new String[]{"01789"}));
    }
}

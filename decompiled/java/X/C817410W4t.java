package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817410W4t {
    public static InterfaceC817440W4w LIZ;
    public static String LIZIZ = "";

    public static boolean LIZIZ(Context context) {
        ArrayList<String> arrayListLJ = C1697810uHb.LJ("com.bd.nproject", "com.bd.nproject.private");
        PackageManager packageManager = context.getPackageManager();
        for (String str : arrayListLJ) {
            try {
                if (C786410Ut5.Y3(packageManager, str, 0) != null) {
                    LIZIZ = str;
                    return true;
                }
                continue;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static boolean LIZJ(Context context) {
        ApplicationInfo applicationInfoV3;
        Bundle bundle;
        try {
            applicationInfoV3 = C786410Ut5.V3(context.getPackageManager(), LIZIZ, 128);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            applicationInfoV3 = null;
        }
        if (applicationInfoV3 == null || (bundle = applicationInfoV3.metaData) == null) {
            return false;
        }
        return bundle.getBoolean("com.ss.android.bind.version", false);
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcTjRUUuTxeHcgnpSTKWqwTL2qlxY6KgG8mjpaoiqRtBlZ3JXg==", null));
    }

    public static boolean LIZLLL(C19EG c19eg, String str) {
        ApplicationInfo applicationInfoV3;
        Bundle bundle;
        try {
            applicationInfoV3 = C786410Ut5.V3(c19eg.getPackageManager(), str, 128);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            applicationInfoV3 = null;
        }
        if (applicationInfoV3 == null || (bundle = applicationInfoV3.metaData) == null) {
            return false;
        }
        return bundle.getBoolean("com.ss.android.account.integration.version", false);
    }

    public static void LJ(Context context, Map map) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(((LinkedHashMap) map).entrySet(), "&", null, null, 0, null, AFwS229S0000000_2.get$arr$(762), 30);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://lemon8.onelink.me/FMQw");
        sbLIZ.append('?');
        sbLIZ.append(strLJJLIIIJ);
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        intent.putExtra("pns.sandbox.dataflow_id", 1207962113);
        LIZ(context, intent);
    }

    public static void LJFF(Context context, Map map) {
        String str;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snssdk");
            String str2 = LIZIZ;
            if (Intrinsics.LJFF(str2, "com.bd.nproject")) {
                str = "2657";
            } else if (Intrinsics.LJFF(str2, "com.bd.nproject.private")) {
                str = "2657test";
            } else {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append("://user_profile");
            Uri.Builder builderBuildUpon = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon();
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            String str3 = (String) linkedHashMap.get("amp_extra");
            if (str3 != null && str3.length() > 0) {
                builderBuildUpon.appendQueryParameter("amp_extra", str3);
                map.remove("amp_extra");
            }
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(builderBuildUpon.build().toString()));
            intent.setPackage(LIZIZ);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
            intent.putExtra("pns.sandbox.dataflow_id", 1207962113);
            LIZ(context, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C817430W4v.LIZ(null);
        }
    }
}

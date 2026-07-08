package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827830Wdh implements AttachUserData {
    public static String LIZJ;
    public final Map<String, String> LIZ;
    public final AttachUserData LIZIZ;

    public static String LIZ(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            ApplicationInfo applicationInfo = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 128).applicationInfo;
            for (Field field : ApplicationInfo.class.getFields()) {
                try {
                    Object obj = field.get(applicationInfo);
                    sb.append(field.getName());
                    sb.append(": ");
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else if (obj instanceof Object[]) {
                        sb.append(Arrays.toString((Object[]) obj));
                    } else {
                        int length = Array.getLength(obj);
                        Object[] objArr = new Object[length];
                        for (int i = 0; i < length; i++) {
                            objArr[i] = Array.get(obj, i);
                        }
                        sb.append(Arrays.toString(objArr));
                    }
                    sb.append("\n");
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return sb.toString();
    }

    public static Map LIZIZ(Map map) {
        if (map != null && !map.containsKey("curUserId") && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            map.put("curUserId", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser() != null) {
                map.put("shortId", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getShortId());
                map.put("nickname", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname());
            }
        }
        return map;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        int length;
        File[] fileArrListFiles;
        String str;
        File parentFile;
        String[] list;
        PackageInfo packageInfoY3;
        Signature[] signatureArr;
        Signature signature;
        if (crashType == CrashType.JAVA || crashType == CrashType.LAUNCH || crashType == CrashType.NATIVE) {
            C827850Wdj c827850Wdj = new C827850Wdj();
            try {
                c827850Wdj.LIZ = C0WYJ.LJIJJLI();
                c827850Wdj.LIZIZ = C0WYJ.LJIL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/");
                sbLIZ.append(Process.myPid());
                sbLIZ.append("/fd");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                    length = fileArrListFiles.length;
                } else {
                    length = -1;
                }
                c827850Wdj.LIZLLL = length;
                c827850Wdj.LJ = C0WYJ.LJIIZILJ();
                c827850Wdj.LIZJ = C0WYJ.LJIILIIL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c827850Wdj = null;
            }
            if (c827850Wdj != null) {
                ((HashMap) this.LIZ).put("vmPeak", String.valueOf(c827850Wdj.LIZ));
                ((HashMap) this.LIZ).put("vmSize", String.valueOf(c827850Wdj.LIZIZ));
                ((HashMap) this.LIZ).put("fdCount", String.valueOf(c827850Wdj.LIZLLL));
                ((HashMap) this.LIZ).put("maxFdCount", String.valueOf(c827850Wdj.LIZJ));
                ((HashMap) this.LIZ).put("threadCount", String.valueOf(c827850Wdj.LJ));
            }
        }
        ((HashMap) this.LIZ).put("root", String.valueOf(C0WYJ.LJJ()));
        ((HashMap) this.LIZ).put("librarian", Arrays.toString(Librarian.LIZJ()));
        ((HashMap) this.LIZ).put("librarian_origin", Arrays.toString(Librarian.LIZLLL()));
        ((HashMap) this.LIZ).put("class_loader", C827830Wdh.class.getClassLoader().toString());
        try {
            ((HashMap) this.LIZ).put("so_decompress", C2421309eF.LIZ.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Map<String, String> map = this.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (TextUtils.isEmpty(LIZJ) && contextLIZ != null) {
            try {
                packageInfoY3 = C786410Ut5.Y3(contextLIZ.getPackageManager(), contextLIZ.getPackageName(), 64);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (packageInfoY3 == null || (signatureArr = packageInfoY3.signatures) == null || signatureArr.length < 1 || (signature = signatureArr[0]) == null) {
                str = LIZJ;
            } else {
                LIZJ = C08HM.LIZLLL(signature.toByteArray());
                str = LIZJ;
            }
        } else {
            str = LIZJ;
        }
        ((HashMap) map).put("signatures", str);
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        Npth.addTag("player_count", String.valueOf(c1477400oY6.LJJJJ));
        ((HashMap) this.LIZ).put("player_count", String.valueOf(c1477400oY6.LJJJJ));
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                C844470XAv.LIZ.getClass();
                ((HashMap) this.LIZ).put("apkPaths", TextUtils.join("\n", (String[]) Reflect.on(C844470XAv.LIZ().getAssets()).call("getApkPaths").get()));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        try {
            ((HashMap) this.LIZ).put("mLoaders", String.valueOf(Reflect.on(Reflect.on("android.app.ApplicationLoaders").call("getDefault").get()).field("mLoaders", new Class[0]).get()));
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        try {
            Map<String, String> map2 = this.LIZ;
            C844470XAv.LIZ.getClass();
            ((HashMap) map2).put("appInfo", LIZ(C844470XAv.LIZ()));
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ2 = C844470XAv.LIZ();
            StringBuilder sb = new StringBuilder();
            String str2 = contextLIZ2.getApplicationInfo().sourceDir;
            if (str2 != null && (parentFile = new C0VSJ(str2).getParentFile()) != null && (list = parentFile.list()) != null) {
                for (String str3 : list) {
                    sb.append(str3);
                    sb.append("\n");
                }
            }
            ((HashMap) this.LIZ).put("appInstallationDirectoryFileList", sb.toString());
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
        }
        Npth.addTag("is_pad", String.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad()));
        Map<String, String> map3 = this.LIZ;
        LIZIZ(map3);
        return map3;
    }

    public C827830Wdh(Context context, C20651087d c20651087d) {
        JSONObject jSONObject;
        this.LIZIZ = c20651087d;
        IAVSettingsService iAVSettingsServiceAvsettingsConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig();
        HashMap map = new HashMap();
        this.LIZ = map;
        C844470XAv.LIZ.getClass();
        map.put("git_sha", C844470XAv.LJIIL);
        map.put("git_branch", C844470XAv.LJIIJJI);
        map.put("abi", System.getProperty("os.arch"));
        map.put("veSdk", iAVSettingsServiceAvsettingsConfig.getVESDKVersion());
        map.put("effectSdk", iAVSettingsServiceAvsettingsConfig.getEffectVersion());
        C1480850odf c1480850odf = C1480850odf.LIZJ;
        map.put("player_type", String.valueOf(c1480850odf.getPlayerType()));
        map.put("preloader_type", String.valueOf(c1480850odf.getPreloadType()));
        map.put("ttplayer_version", String.valueOf(1));
        map.put("release_build", C2210471BfJ.LJIIJ);
        map.put("real_machine", String.valueOf(C827510WdB.LIZ()));
        C2138208Zg c2138208ZgLIZ = C2138208Zg.LIZ(context);
        c2138208ZgLIZ.getClass();
        String strOptString = null;
        if (!TextUtils.isEmpty("JENKINS_BUILD_RESULT") && (jSONObject = c2138208ZgLIZ.LIZ) != null) {
            strOptString = jSONObject.optString("JENKINS_BUILD_RESULT", "");
        }
        if (!TextUtils.isEmpty(strOptString)) {
            map.put("jenkins_build_result", strOptString);
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter().addCrashCustomTagListener(new ICrashCustomTagListener() { // from class: X.0Wdd
            @Override // com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener
            public final void setCustomTag(String str, String str2) {
                this.LIZ.LIZ.put(str, str2);
            }
        });
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Build.MANUFACTURER);
        sbLIZ.append("&&");
        sbLIZ.append(Build.BRAND);
        sbLIZ.append("&&");
        sbLIZ.append(Build.MODEL);
        sbLIZ.append("&&");
        sbLIZ.append(Build.FINGERPRINT);
        map.put("device_info", C2188811AlT.LIZIZ(sbLIZ));
        if (C2162308dZ.LJI(context)) {
            InterfaceC827870Wdl interfaceC827870WdlV4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).V4();
            map.put("liveCoreSdk", interfaceC827870WdlV4 != null ? interfaceC827870WdlV4.getLiveCoreVersion() : "");
            LIZIZ(map);
        }
    }
}

package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206861BYu {
    public static final String[] LIZ = {"/cache/picture/im_fresco_cache/", "/cache/picture/fresco_cache/", "/files/awcn_strategy/pushservice/", "/files/keva/repo/", "/files/live_kv/", "/files/effect/", "/files/music/", "/files/logs/", "/files/ALOG/", "/cache/cachev2/", "/cache/runnableCache/", "/files/robust/", "/files/tt_file_st/", "/cache/feedCache/", "/cache/ttnet_storage/", "/files/MiPushLog/", "/cache/picture/", "/cache/ttnet_storage/", "/cache/awemeCache/", "/files/font/", "/files/npth/", "/files/.msdata/", "/files/.dynamic/", "/files/bdp/", "/files/a/", "/cache/WebView/", "/files/webview_bytedance/", "/files/.patchs/", "/files/.envelope/", "/files/.emitter/", "/files/.umeng/", "/files/.bak/", "/files/.pre_download/", "/files/.imprint/", "/shared_prefs/", "/app_sslcache/", "/app_webview/", "/lib-main/", "/splashCache/", "/awemeSplashCache/", "/app_SGLib/", "/app_assets/", "/small_emoji_res/", "/system_emoji_res/", "/files/draft/", "/files/Download/", "/files/rhea/", "/files/speed_ml/", "/databases/", "/files/filters/", "/files/extract_shot/", "/files/effectmodel/", "/files/extract_custom_sticker/", "/covode/", "/app_hws_webview/", "/cache/Universal_activity", "/files/audio-effect/", "/files/mvtheme/", "/files/origin_sound/", "/files/ve_frame_cache2/", "/files/hdr_filter/", "/files/hianalytics/"};
    public static final String[] LIZIZ = {"/files/plugins/", "/cache/Universal_activity/", "/files/appbrand/"};
    public static final String[] LIZJ = {"/files/offlineX/", "/files/offline/", "/files/live_sdk_gecko/"};

    public static void LIZ(Context context, JSONObject jSONObject) throws Throwable {
        Object obj;
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/cache/webviewbytedance_");
        sbLIZ.append(packageName);
        sbLIZ.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("/cache/webviewbytedance_");
        sbLIZ2.append(packageName);
        sbLIZ2.append("/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("/app_webviewbytedance_");
        sbLIZ3.append(packageName);
        sbLIZ3.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("/app_webview_");
        sbLIZ4.append(packageName);
        sbLIZ4.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("/cache/webview_");
        sbLIZ5.append(packageName);
        sbLIZ5.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("/app_webviewbytedance_");
        sbLIZ6.append(packageName);
        sbLIZ6.append("/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ6));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("/app_webviewbytedance_ttwebview_bytedance_");
        sbLIZ7.append(packageName);
        sbLIZ7.append("/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ7));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("/app_hws_webview_");
        sbLIZ8.append(packageName);
        sbLIZ8.append(":miniapp0/");
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ8));
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("Error: ");
                    sbLIZ9.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ9));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("Application context obtained through ActivityThread: ");
                    sbLIZ10.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ10));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(th.getMessage());
                    sbLIZ11.append(":");
                    sbLIZ11.append(C08RN.LIZJ());
                    sbLIZ11.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ11));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ112 = C2188811AlT.LIZ();
                sbLIZ112.append(th.getMessage());
                sbLIZ112.append(":");
                sbLIZ112.append(C08RN.LIZJ());
                sbLIZ112.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ112));
            }
            file = C786450Ut9.LIZJ;
        }
        HashMap<String, Integer> mapLIZIZ = LIZIZ(file.getParent(), arrayList);
        HashMap<String, Integer> mapLIZIZ2 = LIZIZ(C786410Ut5.y2(context, "").getParent(), arrayList);
        if (mapLIZIZ != null) {
            try {
                for (Map.Entry<String, Integer> entry : mapLIZIZ.entrySet()) {
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("internal");
                    sbLIZ12.append(entry.getKey());
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ12), entry.getValue());
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        if (mapLIZIZ2 != null) {
            for (Map.Entry<String, Integer> entry2 : mapLIZIZ2.entrySet()) {
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append("external");
                sbLIZ13.append(entry2.getKey());
                jSONObject.put(C2188811AlT.LIZIZ(sbLIZ13), entry2.getValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap<String, Integer> LIZIZ(String str, ArrayList<String> arrayList) {
        HashMap map;
        boolean z;
        BufferedReader bufferedReader;
        HashMap<String, Integer> map2 = 0;
        if (!TextUtils.isEmpty(str)) {
            map = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder("du", "-a", "-d", "4", str).start().getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split("\t");
                        if (strArrSplit.length == 2) {
                            String strReplace = strArrSplit[1].replace(str, "");
                            if (TextUtils.isEmpty(strReplace)) {
                                strReplace = "DiskTotal";
                            }
                            map.put(strReplace, Integer.valueOf(strArrSplit[0]));
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            map = null;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            try {
                                bufferedReader.close();
                                throw th2;
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                throw th2;
                            }
                        }
                    }
                }
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } else {
            map = null;
        }
        if (map == null || map.isEmpty()) {
            try {
                TextUtils.isEmpty(str);
                map = null;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
        if (map != null) {
            map2 = new HashMap<>();
            for (String str2 : map.keySet()) {
                List list = (List) C299330BoJ.LIZIZ.getValue();
                if (list.isEmpty()) {
                    for (String str3 : LIZ) {
                        if (str2.startsWith(str3)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (str2.startsWith((String) it2.next())) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                if (!z) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (str2.startsWith(it3.next())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        String[] strArr = LIZIZ;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            if (str2.startsWith(strArr[i]) && str2.split("/").length != 4) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        if (!z) {
                            for (String str4 : LIZJ) {
                                if (str2.startsWith(str4) && str2.split("/").length == 4) {
                                    map2.put(str2, map.get(str2));
                                } else if (str2.startsWith(str4) && str2.split("/").length == 5) {
                                    map2.put(str2, map.get(str2));
                                }
                                z = true;
                                break;
                            }
                            if (!z) {
                                map2.put(str2.replaceAll("\\d+", "*"), map.get(str2));
                            }
                        }
                    }
                }
            }
        }
        return map2;
    }
}

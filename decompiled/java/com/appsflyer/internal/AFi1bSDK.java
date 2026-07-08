package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1bSDK extends AFi1kSDK {
    public final AFd1kSDK valueOf;

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(Context context) {
        AFc1dSDK<Map<String, Object>> aFc1dSDK = new AFc1dSDK<Map<String, Object>>(context, this.valueOf, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFi1bSDK.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFc1dSDK
            /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> AFKeystoreWrapper() {
                String string;
                Cursor cursorLJJJ = null;
                try {
                    try {
                        cursorLJJJ = C2204961BRm.LJJJ(this.valueOf.getContentResolver(), Uri.parse("content://" + this.AFKeystoreWrapper), null, null, null, null, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsauleyw==", new String[]{"01c45"}));
                        if (cursorLJJJ == null) {
                            AFi1bSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorLJJJ.moveToFirst()) {
                            AFi1bSDK.this.AFInAppEventParameterName.put("response", "OK");
                            AFInAppEventParameterName("referrer", AFi1bSDK.this.AFInAppEventParameterName, cursorLJJJ);
                            AFKeystoreWrapper("click_ts", AFi1bSDK.this.AFInAppEventParameterName, cursorLJJJ);
                            AFKeystoreWrapper("install_begin_ts", AFi1bSDK.this.AFInAppEventParameterName, cursorLJJJ);
                            AFKeystoreWrapper("install_end_ts", AFi1bSDK.this.AFInAppEventParameterName, cursorLJJJ);
                            AFInAppEventParameterName("organic_keywords", AFi1bSDK.this.AFInAppEventParameterName, cursorLJJJ);
                            AFInAppEventParameterName("attr_type", AFi1bSDK.this.AFInAppEventParameterName, cursorLJJJ);
                            HashMap map = new HashMap();
                            int columnIndex = cursorLJJJ.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorLJJJ.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            AFKeystoreWrapper("click_server_ts", map, cursorLJJJ);
                            AFKeystoreWrapper("install_begin_server_ts", map, cursorLJJJ);
                            AFInAppEventParameterName("install_version", map, cursorLJJJ);
                            if (!map.isEmpty()) {
                                AFi1bSDK.this.AFInAppEventParameterName.put("custom", map);
                            }
                        } else {
                            AFi1bSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        AFi1bSDK.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                        if (0 != 0) {
                        }
                    }
                    if (cursorLJJJ != null) {
                        cursorLJJJ.close();
                    }
                    String str = ((PackageItemInfo) this.valueOf.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128)).packageName;
                    AFi1bSDK.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(this.valueOf, str)));
                    AFi1bSDK.this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(this.valueOf, str));
                    AFi1bSDK.this.values();
                    return AFi1bSDK.this.AFInAppEventParameterName;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (0 != 0) {
                        cursorLJJJ.close();
                    }
                    throw th;
                }
            }

            public static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            public static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }
        };
        AFd1qSDK aFd1qSDKValueOf = this.valueOf.valueOf();
        AFb1vSDK.AFKeystoreWrapper();
        if (AFb1vSDK.AFInAppEventType(aFd1qSDKValueOf, false) <= 0 && aFc1dSDK.AFInAppEventParameterName()) {
            aFc1dSDK.AFInAppEventType.values().execute(aFc1dSDK.AFInAppEventParameterName);
            this.e = System.currentTimeMillis();
            this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
            addObserver(new AFi1hSDK.AnonymousClass1());
        }
    }

    public AFi1bSDK(Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("store", "samsung", runnable);
        this.valueOf = aFd1kSDK;
    }
}

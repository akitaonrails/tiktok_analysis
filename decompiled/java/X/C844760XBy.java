package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844760XBy {
    public final C844770XBz LIZ;

    public C844760XBy(C844770XBz c844770XBz) {
        this.LIZ = c844770XBz;
    }

    public final void LIZ(JSONObject jSONObject, C844630XBl c844630XBl) {
        Object obj;
        int i;
        if (c844630XBl.LL) {
            jSONObject.put(Scene.SCENE_SERVICE, 2);
        }
        jSONObject.put("device_platform", "android");
        boolean zBooleanValue = C2162708dd.LIZ.LIZIZ(new Object[0]).booleanValue();
        if (zBooleanValue) {
            obj = "Harmony";
        } else {
            obj = "Android";
        }
        try {
            jSONObject.put("os", obj);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (zBooleanValue) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("os_api", C1964207mi.LIZ("hw_sc.build.os.apiversion"));
                jSONObject2.put("os_version", C1964207mi.LIZ("hw_sc.build.platform.version"));
                jSONObject2.put("release_type", C1964207mi.LIZ("hw_sc.build.os.releasetype"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                jSONObject.put("harmony", jSONObject2);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        jSONObject.put("git_hash", "b53ca20");
        jSONObject.put("sdk_version_code", C844830XCf.LIZ);
        jSONObject.put("sdk_target_version", 30);
        jSONObject.put("req_id", C844700XBs.LIZ.LIZIZ(new Object[0]));
        jSONObject.put("sdk_version", "2.5.14.5");
        jSONObject.put("guest_mode", this.LIZ.LJIJ ? 1 : 0);
        jSONObject.put("sdk_flavor", "i18nInner");
        C844770XBz c844770XBz = this.LIZ;
        if (C844580XBg.LIZ(c844770XBz.LIZJ, c844770XBz).getBoolean("is_migrate", false)) {
            C844770XBz c844770XBz2 = this.LIZ;
            String string = C844580XBg.LIZ(c844770XBz2.LIZJ, c844770XBz2).getString("old_did", null);
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            try {
                jSONObject.put("old_did", string);
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        Context context = this.LIZ.LIZJ;
        try {
            PackageInfo packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0);
            if (packageInfoY3 != null) {
                jSONObject.put("apk_first_install_time", packageInfoY3.firstInstallTime);
                if ((packageInfoY3.applicationInfo.flags & 1) == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_system_app", i);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        InterfaceC844940XCq interfaceC844940XCq = (InterfaceC844940XCq) C0XBH.LIZ(InterfaceC844940XCq.class, String.valueOf(this.LIZ.LIZ));
        if (interfaceC844940XCq != null) {
            interfaceC844940XCq.LJI();
        }
        C844770XBz c844770XBz3 = this.LIZ;
        C0XCA c0xcaLJ = C0XC2.LIZJ().LJ(c844770XBz3.LIZ);
        C0XCD c0xcdLIZ = C0XC2.LIZJ().LIZ(c844770XBz3.LIZ);
        if (c844630XBl.LL) {
            c0xcaLJ.LJII = 2;
            c0xcdLIZ.LJFF = 2;
        } else if (c844770XBz3.LJIJ) {
            c0xcaLJ.LJII = 1;
            c0xcdLIZ.LJFF = 1;
        } else {
            c0xcaLJ.LJII = 0;
            c0xcdLIZ.LJFF = 0;
        }
        if (interfaceC844940XCq != null) {
            c0xcaLJ.LJI = interfaceC844940XCq.LJFF() ? 1 : 0;
            c0xcdLIZ.LJ = interfaceC844940XCq.LJFF() ? 1 : 0;
        }
    }
}

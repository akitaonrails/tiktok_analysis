package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UV0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UV0 {
    public static final C0UV0 Camera;
    public static final C0UV0 LITE_PLAYER_CONTAINER;
    public static final /* synthetic */ C0UV0[] LLILZ;
    public static final C0UV0 Live;
    public static final C0UV0 LiveResource;
    public static final C0UV0 LiveSDK;
    public static final C0UV0 Player;
    public static final C0UV0 XGPlayer;
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public boolean isInstalled() {
        return true;
    }

    public void load(Context context, boolean z) {
    }

    public void preload() {
    }

    static {
        C0UV0 c0uv0 = new C0UV0() { // from class: X.0UUz
            @Override // X.C0UV0
            public final void load(Context context, boolean z) {
                try {
                    IHostPlugin iHostPlugin = (IHostPlugin) C1161920gLG.LIZJ(IHostPlugin.class);
                    if (z) {
                        try {
                            IHostPlugin.Companion.getClass();
                            iHostPlugin.loadLibrary(0, context, C0UV0.LiveResource.getPackageName(), "lens", C773270UUz.class.getClassLoader());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        try {
                            IHostPlugin.Companion.getClass();
                            iHostPlugin.loadLibrary(0, context, C0UV0.LiveResource.getPackageName(), "ttquic", C773270UUz.class.getClassLoader());
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        C773050UUd c773050UUd = IHostPlugin.Companion;
                        c773050UUd.getClass();
                        C0UV0 c0uv02 = C0UV0.LiveResource;
                        iHostPlugin.loadLibrary(0, context, c0uv02.getPackageName(), "ttlivestreamercore", C773270UUz.class.getClassLoader());
                        c773050UUd.getClass();
                        iHostPlugin.loadLibrary(0, context, c0uv02.getPackageName(), "ies_render", C773270UUz.class.getClassLoader());
                        try {
                            c773050UUd.getClass();
                            iHostPlugin.loadLibrary(0, context, c0uv02.getPackageName(), "bytertc", C773270UUz.class.getClassLoader());
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("message", th4.getMessage());
                        jSONObject.put("service", "hotsoon_live_soplugin_load_failed");
                        JSONObject jSONObjectGenerateFinalExtra = C0UV0.generateFinalExtra(jSONObject);
                        C1CC3 c1cc3 = C1CC2.LIZ;
                        if (c1cc3 != null) {
                            c1cc3.monitorStatusRate("ttlive_soplugin_load_error", 1, jSONObjectGenerateFinalExtra);
                        }
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                    }
                }
            }
        };
        LiveResource = c0uv0;
        C0UV0 c0uv02 = new C0UV0(1, "Camera", "camera", "com.ss.android.ugc.live.liveshortvideo_so", true);
        Camera = c0uv02;
        C0UV0 c0uv03 = new C0UV0(2, "LiveSDK", "live_sdk", "com.ss.android.ies.live.sdk", true);
        LiveSDK = c0uv03;
        C0UV0 c0uv04 = new C0UV0(3, "Player", "player", "com.ss.android.ugc.live.player", false);
        Player = c0uv04;
        C0UV0 c0uv05 = new C0UV0(4, "XGPlayer", "player", "com.ss.ttm", false);
        XGPlayer = c0uv05;
        C0UV0 c0uv06 = new C0UV0(5, "LITE_PLAYER_CONTAINER", "player", "com.bytedance.common.plugin.lite", false);
        LITE_PLAYER_CONTAINER = c0uv06;
        C0UV0 c0uv07 = new C0UV0(6, "Live", "liveplugin", "com.bytedance.android.liveplugin", false);
        Live = c0uv07;
        LLILZ = new C0UV0[]{c0uv0, c0uv02, c0uv03, c0uv04, c0uv05, c0uv06, c0uv07};
    }

    public static C0UV0[] values() {
        return (C0UV0[]) LLILZ.clone();
    }

    public String getPackageName() {
        return this.LLILLJJLI;
    }

    public String getType() {
        return this.LL;
    }

    public boolean isNeedPreload() {
        return this.LLILLL;
    }

    public static JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", C465680INy.LIZ());
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
                return jSONObject2;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject2;
    }

    public static C0UV0 valueOf(String str) {
        return (C0UV0) C08FF.LIZ(C0UV0.class, str);
    }

    public void checkInstall(Context context, C0UV1 c0uv1) {
        checkInstall(context, "", c0uv1);
    }

    public void checkInstall(Context context, String str, C0UV1 c0uv1) {
        if (isInstalled() && c0uv1 != null) {
            getPackageName();
            c0uv1.onSuccess();
        }
    }

    public C0UV0(int i, String str, String str2, String str3, boolean z) {
        this.LL = str2;
        this.LLILLL = z;
        this.LLILLJJLI = str3;
    }
}

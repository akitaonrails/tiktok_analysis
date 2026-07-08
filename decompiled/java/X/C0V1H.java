package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V1H extends C0V1P {
    public static final int LLJ = Runtime.getRuntime().availableProcessors();
    public static boolean LLJI = false;
    public static int LLJIJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public static boolean LLJILJIL = false;
    public static boolean LLJILJILJ = false;
    public long LLIZLLLIL = 600000;

    @Override // X.C0V1P
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.C0V1P
    public final void LJIIL() {
        if (LLJILJIL && LLJILJILJ && System.currentTimeMillis() - C792400V6o.LIZJ() > 1200000) {
            try {
                final int length = new C0VSJ("/proc/self/task/").list().length;
                if (length != 0) {
                    final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                    while (threadGroup.getParent() != null) {
                        threadGroup = threadGroup.getParent();
                    }
                    final int[] iArr = {threadGroup.activeCount()};
                    C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0V0x
                        public final /* synthetic */ boolean LL = false;
                        public final /* synthetic */ String LLILLL = null;

                        public final void LIZ() {
                            int[] iArr2;
                            int i;
                            if (this.LL || (i = (iArr2 = iArr)[0]) < C0V1H.LLJIJIL || !C0V1H.LLJI) {
                                try {
                                    C792310V6f.LJIIIZ().LIZJ(new C791160V1u(C0V1H.LJIILL(length, iArr[0], this.LLILLL, null)));
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return;
                                }
                            }
                            Thread[] threadArr = new Thread[i + (i / 2)];
                            iArr2[0] = threadGroup.enumerate(threadArr);
                            StringBuilder sb = new StringBuilder();
                            int i2 = 0;
                            while (true) {
                                int i3 = iArr[0];
                                if (i2 >= i3) {
                                    try {
                                        C792310V6f.LJIIIZ().LIZJ(new C791160V1u(C0V1H.LJIILL(length, i3, this.LLILLL, sb.toString())));
                                        return;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        return;
                                    }
                                }
                                String name = threadArr[i2].getName();
                                if (!TextUtils.isEmpty(name)) {
                                    sb.append(name);
                                    sb.append(",");
                                }
                                i2++;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ThreadCollector@8cfa.reportThreadCount$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ThreadCollector@8cfa.reportThreadCount$1");
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public C0V1H() {
        this.LLILZIL = "thread";
    }

    @Override // X.C0V1P, X.InterfaceC792030V5d
    public final void LIZ() {
        super.LIZ();
        LLJI = true;
    }

    @Override // X.C0V1P
    public final long LJIILJJIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0V1P
    public final void LIZJ(JSONObject jSONObject) {
        boolean z;
        boolean z2 = false;
        if (jSONObject.optInt("enable_thread_collect", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        LLJILJIL = z;
        if (jSONObject.optInt("enable_upload", 0) == 1) {
            z2 = true;
        }
        LLJILJILJ = z2;
        LLJIJIL = jSONObject.optInt("thread_count_threshold", DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LLIZLLLIL = jSONObject.optLong("collect_interval", 10L) * 60000;
    }

    public static JSONObject LJIILL(int i, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("total_thread_count", i);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        }
        jSONObject.put("java_thread_count", i2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put(Scene.SCENE_SERVICE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("thread_detail", str2);
        }
        jSONObject.put("is_main_process", C792400V6o.LJIIIZ());
        jSONObject.put("cpu_count", LLJ);
        jSONObject.put("process_name", C792400V6o.LIZIZ());
        return jSONObject;
    }
}

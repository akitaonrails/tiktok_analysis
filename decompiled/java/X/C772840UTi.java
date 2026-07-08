package X;

import Y.ARunnableS12S1300000_12;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772840UTi {
    public static C772840UTi LIZJ;
    public final Context LIZ = C497740JfY.LJII();
    public boolean LIZIZ;

    public static C772840UTi LIZIZ() {
        if (LIZJ == null) {
            synchronized (C772840UTi.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C772840UTi();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        C0UV0.LiveResource.preload();
        EnumC1309510kBJ.INST.loadResources();
        String[] strArr = {"yuv", "NailSLAM_jni", "ttffmpeg", "c++_shared", "audioeffect", "effect", "ttlivestreamercore", "ies_render"};
        IHostPlugin iHostPlugin = (IHostPlugin) C781270Ukn.LIZJ.getValue();
        int i = 0;
        do {
            String str = strArr[i];
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start load library:");
                sbLIZ.append(str);
                C20441214yg.LJ("LiveBroadcastContext", C2188811AlT.LIZIZ(sbLIZ));
                ClassLoader classLoader = C772840UTi.class.getClassLoader();
                if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
                    C486790J7d.LIZJ(new ARunnableS12S1300000_12(this, classLoader, str, iHostPlugin, 1));
                } else if (classLoader != null) {
                    IHostPlugin.Companion.getClass();
                    iHostPlugin.loadLibrary(2, this.LIZ, null, str, classLoader);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            i++;
        } while (i < 8);
        C11NZ.LJJJJZ(1);
        try {
            C0UV0.LiveResource.load(this.LIZ, false);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        this.LIZIZ = true;
    }
}

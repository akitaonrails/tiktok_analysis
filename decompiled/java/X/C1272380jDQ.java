package X;

import android.content.Context;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jDQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272380jDQ {
    public static final Object[] LJ = new Object[0];
    public static C1272380jDQ LJFF;
    public final List<C1273670jFV> LIZ;
    public final Class<?> LIZIZ;
    public final Method LIZJ;
    public final Method LIZLLL;

    public C1272380jDQ() {
        MediaEngineFactory.getVersion();
        this.LIZ = new ArrayList();
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.bef.effectsdk.message.MessageCenter");
            Class<?> cls2 = Class.forName("com.bef.effectsdk.AssetResourceFinder");
            Class<?> cls3 = Long.TYPE;
            cls2.getMethod("createNativeResourceFinder", cls3);
            cls2.getMethod("release", cls3);
            Class<?> cls4 = Class.forName("com.bef.effectsdk.EffectSDKUtils");
            Class<?> cls5 = Class.forName("com.bef.effectsdk.message.MessageCenter$Listener");
            this.LIZIZ = cls5;
            this.LIZJ = cls.getMethod("addListener", cls5);
            this.LIZLLL = cls.getMethod("removeListener", cls5);
            cls4.getMethod("flushAlgorithmModelFiles", Context.class, String.class);
            z = true;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(e));
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(e2));
        }
        AVLog.ioi("VideoEffectUtilsWrapper", "Init EffectSDK class " + z);
        if (z) {
            return;
        }
        this.LIZLLL = null;
        this.LIZJ = null;
        this.LIZIZ = null;
    }

    public static C1272380jDQ LIZIZ() {
        if (LJFF == null) {
            synchronized (C1272380jDQ.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1272380jDQ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public static void LIZLLL(InterfaceC1272540jDg interfaceC1272540jDg) {
        C1273670jFV c1273670jFVLIZJ;
        C1272380jDQ c1272380jDQLIZIZ = LIZIZ();
        synchronized (c1272380jDQLIZIZ) {
            AVLog.ioi("VideoEffectUtilsWrapper", "Remove listener: " + interfaceC1272540jDg);
            if (c1272380jDQLIZIZ.LIZLLL != null && (c1273670jFVLIZJ = c1272380jDQLIZIZ.LIZJ(interfaceC1272540jDg)) != null) {
                try {
                    AVLog.ioi("VideoEffectUtilsWrapper", "Remove listener " + c1273670jFVLIZJ.LLILLJJLI.get());
                    C2204961BRm.a0(c1272380jDQLIZIZ.LIZLLL, null, new Object[]{c1273670jFVLIZJ.LLILLJJLI.get()}, new C0WZX("dzBzEhEpEd7IWV43QAGQdGXVEhh91R8v3lLlASXCuFcqw9USErAbkeET4yweLz8+nxXxvUcHcsiz", null));
                    c1273670jFVLIZJ.LLILLJJLI = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AVLog.ioi("VideoEffectUtilsWrapper", "RemoveListener failed " + Log.getStackTraceString(th));
                }
            }
        }
    }

    public final C1273670jFV LIZ(InterfaceC1272540jDg interfaceC1272540jDg) {
        synchronized (this.LIZ) {
            try {
                for (C1273670jFV c1273670jFV : (ArrayList) this.LIZ) {
                    if (interfaceC1272540jDg == c1273670jFV.LL) {
                        return c1273670jFV;
                    }
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C1273670jFV LIZJ(InterfaceC1272540jDg interfaceC1272540jDg) {
        C1273670jFV c1273670jFVLIZ = LIZ(interfaceC1272540jDg);
        if (c1273670jFVLIZ != null) {
            synchronized (this.LIZ) {
                try {
                    ((ArrayList) this.LIZ).remove(c1273670jFVLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1273670jFVLIZ;
        }
        return c1273670jFVLIZ;
    }
}

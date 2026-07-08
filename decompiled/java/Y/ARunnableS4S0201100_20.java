package Y;

import X.C1C7U;
import X.C2188811AlT;
import X.RunnableC1311350kEH;
import android.opengl.EGL14;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS4S0201100_20 implements Runnable {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        if (GLThreadManager.dynamicGLVersionEnable) {
            int i = ((GLThreadManager) this.l1).dynamicGLVersion;
            if (i == -1) {
                if (GlUtil.isGLES3Support()) {
                    ((int[]) this.l0)[0] = GlUtil.nativeAttachThreadToOpenGl(this.j3, 3, 0L);
                }
                int[] iArr = (int[]) this.l0;
                if (iArr[0] != 0) {
                    ((GLThreadManager) this.l1).dynamicGLVersion = 3;
                } else {
                    iArr[0] = GlUtil.nativeAttachThreadToOpenGl(this.j3, 2, 0L);
                    ((GLThreadManager) this.l1).dynamicGLVersion = 2;
                }
            } else {
                ((int[]) this.l0)[0] = GlUtil.nativeAttachThreadToOpenGl(this.j3, i, 0L);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Init GLThreadManager with context ");
            sbLIZ.append(this.j3);
            sbLIZ.append(" version ");
            sbLIZ.append(this.i2);
            AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
            ((int[]) this.l0)[0] = GlUtil.nativeAttachThreadToOpenGl(this.j3, this.i2, 0L);
        }
        if (GLThreadManager.mEnalbeAttachThreadToOpenGlResultCheck && ((int[]) this.l0)[0] != 1) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            throw new AndroidRuntimeException("OpenGlMgrThread created failed. ret:" + ((int[]) this.l0)[0]);
        }
        ((GLThreadManager) this.l1).mEGLContext = EGL14.eglGetCurrentContext();
        GLThreadManager gLThreadManager = (GLThreadManager) this.l1;
        gLThreadManager.refreshGlVersion(gLThreadManager.mEGLContext);
        if (((GLThreadManager) this.l1).mEGLContext != null) {
            GLThreadManager.nativeSetupOpenGlRecycler();
            ((GLThreadManager) this.l1).fillGPUDescription();
        }
    }

    public final void LIZ$0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Init GLThreadManager with context ");
        sbLIZ.append(this.j3);
        sbLIZ.append(" version ");
        sbLIZ.append(this.i2);
        com.ss.pusher.core.utils.AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
        ((int[]) this.l0)[0] = com.ss.pusher.core.opengl.GlUtil.nativeAttachThreadToOpenGl(this.j3, this.i2, 0L);
        ((com.ss.pusher.core.opengl.GLThreadManager) this.l1).LIZIZ = EGL14.eglGetCurrentContext();
        int[] iArr = {0, 0};
        if (((com.ss.pusher.core.opengl.GLThreadManager) this.l1).LIZIZ != null) {
            EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), ((com.ss.pusher.core.opengl.GLThreadManager) this.l1).LIZIZ, 12440, iArr, 0);
            ((com.ss.pusher.core.opengl.GLThreadManager) this.l1).LIZJ = iArr;
            com.ss.pusher.core.opengl.GLThreadManager.nativeSetupOpenGlRecycler();
        }
    }

    public static final void run$0(ARunnableS4S0201100_20 aRunnableS4S0201100_20) {
        boolean zLIZ;
        C1C7U.LIZ("GLThreadManager@53f7.setupSharedOpenGlContext$1");
        try {
            aRunnableS4S0201100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GLThreadManager@53f7.setupSharedOpenGlContext$1");
    }

    public static final void run$1(ARunnableS4S0201100_20 aRunnableS4S0201100_20) {
        boolean zLIZ;
        C1C7U.LIZ("GLThreadManager@6b05.setupSharedOpenGlContext$1");
        try {
            aRunnableS4S0201100_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GLThreadManager@6b05.setupSharedOpenGlContext$1");
    }

    public static final void run$2(ARunnableS4S0201100_20 aRunnableS4S0201100_20) {
        RunnableC1311350kEH runnableC1311350kEH = (RunnableC1311350kEH) aRunnableS4S0201100_20.l0;
        long j = aRunnableS4S0201100_20.j3;
        int i = aRunnableS4S0201100_20.i2;
        Object[] objArr = (Object[]) aRunnableS4S0201100_20.l1;
        runnableC1311350kEH.getClass();
        C1C7U.LIZ("PaintingContext@8cd7.invoke$1$cb$1L");
        runnableC1311350kEH.LLILZLL.nativeInvokeCallback(j, i, JavaOnlyArray.of(objArr));
        C1C7U.LIZIZ("PaintingContext@8cd7.invoke$1$cb$1L");
    }

    public ARunnableS4S0201100_20(Object obj, long j, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.j3 = j;
        this.i2 = i;
        this.l1 = obj2;
    }
}

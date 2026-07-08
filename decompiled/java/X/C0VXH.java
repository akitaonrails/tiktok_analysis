package X;

import Y.AComparatorS32S0000000_13;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0VXH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXH {
    public static final C0VXH LJIIIZ = new C0VXH();
    public static int LJIIJ = -1;
    public int LIZJ;
    public Class LIZLLL;
    public Object LJ;
    public Object LJFF;
    public Field LJI;
    public volatile boolean LJII;
    public final C0VXJ[] LIZ = new C0VXJ[DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL];
    public final C0VXJ[] LIZIZ = new C0VXJ[DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL];
    public final C0VXI LJIIIIZZ = new Runnable() { // from class: X.0VXI
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("ProcessState@4fed.<field>$1");
            try {
                this.LL.LIZ(false);
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("ProcessState@4fed.<field>$1");
        }
    };

    public final int LIZJ() {
        try {
            if (this.LJ == null) {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                this.LIZLLL = cls;
                Method methodLIZIZ = C1958507ln.LIZIZ(cls, "currentActivityThread", null);
                methodLIZIZ.setAccessible(true);
                this.LJ = C2204961BRm.a0(methodLIZIZ, this.LIZLLL, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbRQKv0OpSaglf7z6R", null));
            }
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.LJI == null) {
                    this.LJI = C1958507ln.LIZ(this.LIZLLL);
                }
                this.LJI.setAccessible(true);
                return ((Integer) this.LJI.get(this.LJ)).intValue();
            }
            if (this.LJFF == null) {
                Method methodLIZIZ2 = C1958507ln.LIZIZ(this.LIZLLL, "getApplicationThread", null);
                methodLIZIZ2.setAccessible(true);
                Object objA0 = C2204961BRm.a0(methodLIZIZ2, this.LJ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbRQKv0OpSaglf7z6R", null));
                this.LJFF = objA0;
                this.LJI = C1958507ln.LIZ(objA0.getClass());
            }
            Field field = this.LJI;
            if (field == null) {
                return -1;
            }
            field.setAccessible(true);
            return ((Integer) this.LJI.get(this.LJFF)).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public final synchronized void LIZ(boolean z) {
        int iLIZJ = LIZJ();
        if (z || iLIZJ != LJIIJ) {
            C0VXJ c0vxj = this.LIZ[this.LIZJ];
            c0vxj.LIZ = 0L;
            c0vxj.LIZIZ = 0;
            c0vxj.LIZ = System.currentTimeMillis();
            C0VXJ[] c0vxjArr = this.LIZ;
            int i = this.LIZJ;
            c0vxjArr[i].LIZIZ = iLIZJ;
            LJIIJ = iLIZJ;
            this.LIZJ = (i + 1) % DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        C0VXF.postDelayed(this.LJIIIIZZ, 1000L);
    }

    public final void LIZIZ(File file) {
        if (!this.LJII) {
            return;
        }
        try {
            C0VXF.removeCallbacks(this.LJIIIIZZ);
            LIZ(true);
            synchronized (this) {
                synchronized (this.LIZ) {
                    int i = 0;
                    do {
                        try {
                            this.LIZIZ[i] = this.LIZ[i];
                            i++;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } while (i < 300);
                }
            }
            StringBuilder sb = new StringBuilder();
            Arrays.sort(this.LIZIZ, new AComparatorS32S0000000_13(4));
            int i2 = 0;
            while (true) {
                C0VXJ[] c0vxjArr = this.LIZIZ;
                if (i2 < c0vxjArr.length) {
                    long j = c0vxjArr[i2].LIZ;
                    if (j != 0) {
                        sb.append(j);
                        sb.append(",");
                        sb.append(this.LIZIZ[i2].LIZIZ);
                        sb.append("\n");
                    }
                    i2++;
                } else {
                    C08SE.LJIIIIZZ(new C0VSJ(file, "process_state.txt"), sb.toString(), false);
                    return;
                }
            }
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x00ed, TryCatch #8 {all -> 0x00ed, blocks: (B:3:0x0002, B:6:0x001a, B:37:0x009f, B:39:0x00a7, B:42:0x00ae, B:56:0x00d0, B:60:0x00e9, B:61:0x00ec, B:38:0x00a4), top: B:77:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(org.json.JSONObject r19, org.json.JSONObject r20, java.io.File r21) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VXH.LIZLLL(org.json.JSONObject, org.json.JSONObject, java.io.File):void");
    }
}

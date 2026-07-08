package X;

import android.os.Build;
import android.view.FrameMetrics;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V23, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V23 extends C0V25 {
    public static boolean LLILZIL;
    public static boolean LLILZLL;
    public final ArrayList<C0V29> LLILLJJLI = new ArrayList<>();
    public final HashMap<String, C0V24> LLILLL = new HashMap<>();
    public final C0V26 LLILZ = new C0V26();

    public C0V23() {
        C791390V2r.LJJIII.LJ = true;
        C0V2A.LJIILJJIL = true;
    }

    public final void LJIJ(long j, String str) {
        if (LLILZIL && j > 0) {
            C0V24 c0v24 = this.LLILLL.get(str);
            if (c0v24 == null) {
                c0v24 = new C0V24(str);
                this.LLILLL.put(str, c0v24);
            }
            float f = C0VXC.LIZ;
            c0v24.LIZIZ += j;
            int iMin = Math.min(Math.max((int) (j / f), 0), c0v24.LJFF);
            int[] iArr = c0v24.LJ;
            iArr[iMin] = iArr[iMin] + 1;
            c0v24.LIZLLL += iMin;
            c0v24.LIZJ++;
            if (c0v24.LIZIZ >= 10000) {
                this.LLILLL.remove(str);
                try {
                    float f2 = C0VXC.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i <= c0v24.LJFF; i++) {
                        if (c0v24.LJ[i] > 0) {
                            jSONObject.put(String.valueOf(i), c0v24.LJ[i]);
                        }
                    }
                    int i2 = c0v24.LIZJ;
                    int i3 = ((i2 * 100) * C0VXC.LIZIZ) / (i2 + c0v24.LIZLLL);
                    C790990V1d c790990V1d = C791020V1g.LIZ;
                    c790990V1d.getClass();
                    C787900UvU.LIZ.LIZJ(new RunnableC791000V1e(c790990V1d, c0v24.LIZ, null, (float) (((double) i3) / 100.0d)));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(Scene.SCENE_SERVICE, c0v24.LIZ);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("total_scroll_time", c0v24.LIZIZ);
                    jSONObject3.put("drop_time_rate", 1.0f - ((c0v24.LIZJ * 1.0f) / ((int) (c0v24.LIZIZ / f2))));
                    jSONObject3.put("refresh_rate", c0v24.LJFF + 1);
                    C792310V6f.LJIIIZ().LIZJ(new C791160V1u("fps_drop", c0v24.LIZ, jSONObject, jSONObject2, jSONObject3));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c0v24.LIZJ = 0;
                c0v24.LIZLLL = 0;
                c0v24.LIZIZ = 0L;
            }
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILLIIL(long j, long j2, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        long j3 = j2 - j;
        LJIJ(j3, str);
        for (int i = 0; i < this.LLILLJJLI.size(); i++) {
            ((C0V29) ListProtector.get(this.LLILLJJLI, i)).LIZ(j3);
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIIZILJ(String str, FrameMetrics frameMetrics, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            long jLJIIIZ = C791390V2r.LJJIII.LJIIIZ(frameMetrics);
            LJIJ(jLJIIIZ, str);
            for (int i2 = 0; i2 < this.LLILLJJLI.size(); i2++) {
                C0V29 c0v29 = (C0V29) ListProtector.get(this.LLILLJJLI, i2);
                c0v29.LIZ(jLJIIIZ);
                if (frameMetrics != null && c0v29.LJI != null) {
                    synchronized (c0v29) {
                        try {
                            if (c0v29.LJIIIIZZ.size() > 20000) {
                                c0v29.LJIIIIZZ.poll();
                            }
                            c0v29.LJIIIIZZ.add(frameMetrics);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }
    }
}

package X;

import android.os.SystemClock;
import android.view.FrameMetrics;
import android.view.Window;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V29, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V29 {
    public static boolean LJIILIIL;
    public static C0V23 LJIILJJIL;
    public final String LIZ;
    public volatile boolean LIZIZ;
    public C0V22 LIZLLL;
    public volatile InterfaceC791210V1z LJ;
    public C0V2B LJFF;
    public volatile C0V21 LJI;
    public Window LJIIJ;
    public final boolean LJIIJJI;
    public C0V26 LIZJ = new C0V26();
    public final HashMap<String, String> LJIIIZ = new HashMap<>();
    public final JSONObject LJIIL = null;
    public LinkedList<Integer> LJII = new LinkedList<>();
    public LinkedList<FrameMetrics> LJIIIIZZ = new LinkedList<>();

    public final synchronized void LIZLLL() {
        LIZIZ();
        C314640CVa.LIZLLL(this.LIZ);
    }

    public final void LIZIZ() {
        final C0V23 c0v23 = LJIILJJIL;
        if (c0v23 != null) {
            C791390V2r.LJJIII.LJIILIIL.LIZ(new Runnable() { // from class: X.0V28
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FrameTracer@3850.removeFpsTracer$1");
                    try {
                        c0v23.LLILLJJLI.remove(this);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FrameTracer@3850.removeFpsTracer$1");
                }
            });
            if (this.LIZIZ) {
                SystemClock.uptimeMillis();
                synchronized (this) {
                    try {
                        if (this.LJII.isEmpty()) {
                            C0V2B c0v2b = this.LJFF;
                            if (c0v2b != null) {
                                c0v2b.onEmpty();
                            }
                        } else {
                            final LinkedList<Integer> linkedList = this.LJII;
                            final LinkedList<FrameMetrics> linkedList2 = this.LJIIIIZZ;
                            this.LJII = new LinkedList<>();
                            this.LJIIIIZZ = new LinkedList<>();
                            final C0V26 c0v26 = this.LIZJ;
                            this.LIZJ = new C0V26();
                            final HashMap map = new HashMap();
                            map.putAll(this.LJIIIZ);
                            C787900UvU.LIZ.LIZJ(new Runnable(linkedList, map, c0v26, linkedList2) { // from class: X.0V20
                                public final /* synthetic */ List LL;
                                public final /* synthetic */ Map LLILLJJLI;
                                public final /* synthetic */ List LLILLL;

                                public final void LIZ() {
                                    try {
                                        if (C2106708Nd.LIZ(this.LL)) {
                                            return;
                                        }
                                        float f = C0VXC.LIZ;
                                        int i = C0VXC.LIZIZ;
                                        int i2 = i - 1;
                                        int i3 = i2 + 1;
                                        int[] iArr = new int[i3];
                                        int[] iArr2 = new int[i3];
                                        int i4 = 0;
                                        int i5 = 0;
                                        int iIntValue = 0;
                                        int iIntValue2 = 0;
                                        for (Integer num : this.LL) {
                                            int iIntValue3 = num.intValue() / ((int) (f * 100.0f));
                                            if (iIntValue3 > 0) {
                                                i5 += iIntValue3;
                                            }
                                            if (num.intValue() >= 833.0d) {
                                                iIntValue += num.intValue() / 100;
                                            }
                                            int iMax = Math.max(Math.min(iIntValue3, i2), i4);
                                            iArr[iMax] = iArr[iMax] + 1;
                                            iArr2[iMax] = (int) (((double) iArr2[iMax]) + (((double) num.intValue()) / 100.0d));
                                            iIntValue2 += num.intValue() / 100;
                                            i4 = 0;
                                        }
                                        int size = ((this.LL.size() * 100) * i) / (this.LL.size() + i5);
                                        C0V29 c0v29 = this.LLILZ;
                                        Map map2 = this.LLILLJJLI;
                                        float f2 = (float) (((double) size) / 100.0d);
                                        C0V22 c0v22 = c0v29.LIZLLL;
                                        if (c0v22 != null) {
                                            c0v22.LIZIZ(f2);
                                        }
                                        C790990V1d c790990V1d = C791020V1g.LIZ;
                                        String str = c0v29.LIZ;
                                        c790990V1d.getClass();
                                        C787900UvU.LIZ.LIZJ(new RunnableC791000V1e(c790990V1d, str, map2, f2));
                                        int size2 = (int) ((this.LL.size() + i5) * f);
                                        JSONObject jSONObject = new JSONObject();
                                        for (int i6 = 0; i6 <= i2; i6++) {
                                            if (iArr[i6] > 0) {
                                                jSONObject.put(String.valueOf(i6), iArr[i6]);
                                            }
                                        }
                                        JSONObject jSONObject2 = new JSONObject();
                                        for (int i7 = 0; i7 <= i2; i7++) {
                                            if (iArr2[i7] > 0.1d) {
                                                jSONObject2.put(String.valueOf(i7), iArr2[i7]);
                                            }
                                        }
                                        if (this.LLILZ.LJ != null) {
                                            this.LLILZ.LJ.LIZLLL(C0V3O.LIZ(jSONObject));
                                        }
                                        this.LLILZ.getClass();
                                        if (this.LLILZ.LJI != null && this.LLILLL != null) {
                                            this.LLILZ.LJI.LIZ(this.LLILLL);
                                        }
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(Scene.SCENE_SERVICE, this.LLILZ.LIZ);
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("total_scroll_time", iIntValue2);
                                        jSONObject4.put("dur", size2);
                                        jSONObject4.put("hitch_dur_dic", jSONObject2);
                                        jSONObject4.put("hitch_dur", iIntValue);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        this.LLILZ.getClass();
                                        sbLIZ.append(0.0f);
                                        sbLIZ.append(",");
                                        this.LLILZ.getClass();
                                        sbLIZ.append(0.0f);
                                        jSONObject4.put("velocity", C2188811AlT.LIZIZ(sbLIZ));
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        this.LLILZ.getClass();
                                        sbLIZ2.append(0.0f);
                                        sbLIZ2.append(",");
                                        this.LLILZ.getClass();
                                        sbLIZ2.append(0.0f);
                                        jSONObject4.put("distance", C2188811AlT.LIZIZ(sbLIZ2));
                                        jSONObject4.put("frame_count", this.LL.size());
                                        jSONObject4.put("drop_count", i5);
                                        JSONObject jSONObject5 = this.LLILZ.LJIIL;
                                        if (jSONObject5 != null) {
                                            jSONObject4.put("extra", jSONObject5);
                                        }
                                        jSONObject4.put("drop_time_rate", 1.0f - ((this.LL.size() * 1.0f) / ((int) (iIntValue2 / f))));
                                        C791160V1u c791160V1u = new C791160V1u("fps_drop", this.LLILZ.LIZ, jSONObject, jSONObject3, jSONObject4);
                                        C791030V1h.LIZ(c791160V1u, true);
                                        c791160V1u.LJFF.put("refresh_rate", i);
                                        Map map3 = this.LLILLJJLI;
                                        if (map3 != null && !map3.isEmpty()) {
                                            for (Map.Entry entry : this.LLILLJJLI.entrySet()) {
                                                c791160V1u.LJFF.put((String) entry.getKey(), entry.getValue());
                                            }
                                        }
                                        C792310V6f.LJIIIZ().LIZJ(c791160V1u);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C792400V6o.LJIIIIZZ();
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("RealFpsTracer@369.doReportAndCalculateFps$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("RealFpsTracer@369.doReportAndCalculateFps$1");
                                }

                                {
                                    this.LLILLL = linkedList2;
                                }
                            });
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LIZIZ = false;
            }
        }
    }

    public final boolean LIZJ() {
        if (C792400V6o.LJIJI) {
            return C790620Uzs.LIZIZ("fps_drop", this.LIZ) || C790620Uzs.LIZIZ("fps", this.LIZ) || LJIILIIL;
        }
        return false;
    }

    public final void LIZ(long j) {
        if (j < 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJII.size() > 20000) {
                    if (C0V23.LLILZLL) {
                        LIZLLL();
                        return;
                    }
                    this.LJII.poll();
                }
                this.LJII.add(Integer.valueOf(((int) j) * 100));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0V29(String str, boolean z) {
        this.LIZ = str;
        this.LJIIJJI = z;
        if (LIZJ() || z) {
            C791390V2r.LJJIII.LJFF();
        }
    }
}

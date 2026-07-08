package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V9L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9L extends AbstractC792370V6l {
    public final C0V9S LIZJ;
    public final C0V9W LIZLLL;
    public final String LJ;
    public final double LJFF;
    public final double LJI;
    public final double LJII;
    public final double LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final List<C793240V9u<String, Double>> LJIIL;

    @Override // X.C0VB5
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.C0VB5
    public final boolean isValid() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:33:0x0044
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // X.AbstractC792370V6l
    public final org.json.JSONObject LIZLLL() {
        /*
            r4 = this;
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "process_name"
            java.lang.String r0 = X.C792400V6o.LIZIZ()     // Catch: java.lang.Throwable -> L67
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = "is_main_process"
            boolean r0 = X.C792400V6o.LJIIIZ()     // Catch: java.lang.Throwable -> L61
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "scene"
            java.lang.String r0 = r4.LJ     // Catch: java.lang.Throwable -> L5b
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L59
            int[] r1 = X.C0V9T.LIZ     // Catch: java.lang.Throwable -> L57
            X.0V9S r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L55
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L53
            r2 = r1[r0]     // Catch: java.lang.Throwable -> L51
            r0 = 1
            java.lang.String r1 = "data_type"
            if (r2 == r0) goto L46
            r0 = 2
            if (r2 == r0) goto L3b
            r0 = 3
            if (r2 != r0) goto L4e
            java.lang.String r0 = "front"
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L6f
            return r3
        L39:
            r0 = move-exception
            goto L70
        L3b:
            java.lang.String r0 = "back"
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r0 = move-exception
            goto L70
        L43:
            return r3
        L44:
            r0 = move-exception
            goto L70
        L46:
            java.lang.String r0 = "mix"
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r0 = move-exception
            goto L70
        L4e:
            return r3
        L4f:
            r0 = move-exception
            goto L70
        L51:
            r0 = move-exception
            goto L70
        L53:
            r0 = move-exception
            goto L70
        L55:
            r0 = move-exception
            goto L70
        L57:
            r0 = move-exception
            goto L70
        L59:
            r0 = move-exception
            goto L70
        L5b:
            r0 = move-exception
            goto L70
        L5d:
            r0 = move-exception
            goto L70
        L5f:
            r0 = move-exception
            goto L70
        L61:
            r0 = move-exception
            goto L70
        L63:
            r0 = move-exception
            goto L70
        L65:
            r0 = move-exception
            goto L70
        L67:
            r0 = move-exception
            goto L70
        L69:
            r0 = move-exception
            goto L70
        L6b:
            r0 = move-exception
            goto L70
        L6d:
            r0 = move-exception
            goto L70
        L6f:
            r0 = move-exception
        L70:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0V9L.LIZLLL():org.json.JSONObject");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC792370V6l
    public final JSONObject LJ() {
        F f;
        S s;
        try {
            JSONObject jSONObject = new JSONObject();
            List<C793240V9u<String, Double>> list = this.LJIIL;
            if ((list == null || ((ArrayList) list).isEmpty()) ? false : true) {
                for (C793240V9u c793240V9u : (ArrayList) this.LJIIL) {
                    if (c793240V9u != null && (f = c793240V9u.LIZ) != 0 && !((String) f).isEmpty() && (s = c793240V9u.LIZIZ) != 0 && ((Double) s).doubleValue() != 0.0d) {
                        jSONObject.put((String) c793240V9u.LIZ, c793240V9u.LIZIZ);
                    }
                }
            } else {
                double d = this.LJFF;
                if (d > -1.0d && this.LJI > -1.0d) {
                    jSONObject.put("app_usage_rate", d);
                    jSONObject.put("app_max_usage_rate", this.LJI);
                }
                double d2 = this.LJII;
                if (d2 > -1.0d && this.LJIIIIZZ > -1.0d) {
                    jSONObject.put("app_stat_speed", d2);
                    jSONObject.put("app_max_stat_speed", this.LJIIIIZZ);
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.AbstractC792370V6l
    public final JSONObject LJFF() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_auto_sample", this.LJIIJ);
            if (this.LIZLLL != null) {
                jSONObject.put("network_type", C786410Ut5.e3(C792400V6o.LIZ));
                jSONObject.put("battery_level", this.LIZLLL.LIZJ);
                jSONObject.put("cpu_hardware", this.LIZLLL.LIZ);
                jSONObject.put("is_charging", this.LIZLLL.LIZIZ);
                jSONObject.put("power_save_mode", this.LIZLLL.LJ);
                jSONObject.put("thermal_status", this.LIZLLL.LIZLLL);
                jSONObject.put("battery_thermal", this.LIZLLL.LJFF);
                jSONObject.put("is_normal_sample_state", this.LJIIJJI);
            }
            float f = this.LJIIIZ;
            if (f > 0.0f) {
                jSONObject.put("battery_current", f);
            }
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.AbstractC792370V6l
    public final String LJI() {
        List<C793240V9u<String, Double>> list = this.LJIIL;
        return (list == null || ((ArrayList) list).isEmpty()) ? "cpu" : "cpu_thread";
    }

    public C0V9L(C0V9S c0v9s, String str, List<C793240V9u<String, Double>> list, C0V9W c0v9w) {
        this.LJFF = -1.0d;
        this.LJI = -1.0d;
        this.LJII = -1.0d;
        this.LJIIIIZZ = -1.0d;
        this.LJIIIZ = -1.0f;
        this.LJIIJ = true;
        this.LJIIJJI = true;
        this.LJIIL = new ArrayList(list);
        this.LIZJ = c0v9s;
        this.LJ = str;
        this.LIZLLL = c0v9w;
    }

    public C0V9L(C0V9S c0v9s, String str, double d, double d2, double d3, double d4, C0V9W c0v9w) {
        this.LJFF = -1.0d;
        this.LJI = -1.0d;
        this.LJII = -1.0d;
        this.LJIIIIZZ = -1.0d;
        this.LJIIIZ = -1.0f;
        this.LJIIJ = true;
        this.LJIIJJI = true;
        this.LIZJ = c0v9s;
        this.LJ = str;
        this.LJFF = d;
        this.LJI = d2;
        this.LJII = d3;
        this.LJIIIIZZ = d4;
        this.LIZLLL = c0v9w;
    }
}

package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792760V7y extends AbstractC792370V6l {
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final boolean LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final long LJIIL;
    public final double LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public Map<Object, Object> LJIILLIIL;

    @Override // X.C0VB5
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractC792370V6l
    public final String LJI() {
        return "memory";
    }

    @Override // X.C0VB5
    public final boolean isValid() {
        return true;
    }

    @Override // X.AbstractC792370V6l
    public final JSONObject LIZLLL() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, C2257208ss.LIZ().LJ());
            jSONObject.put("process_name", C792420V6q.LJ());
            jSONObject.put("is_front", !this.LJI);
            jSONObject.put("is_main_process", C792420V6q.LJIILJJIL());
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.AbstractC792370V6l
    public final JSONObject LJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gc_count", this.LIZJ);
            jSONObject.put("gc_time", this.LIZLLL);
            jSONObject.put("block_gc_count", this.LJ);
            jSONObject.put("block_gc_time", this.LJFF);
            if (this.LJI) {
                jSONObject.put("dalvik_pss_background", this.LJIIJ);
                jSONObject.put("native_pss_background", this.LJII);
                jSONObject.put("total_pss_background", this.LJIIIIZZ);
                jSONObject.put("java_heap_background", this.LJIIIZ);
                jSONObject.put("java_heap_background_used_rate", this.LJIILIIL);
                jSONObject.put("vm_size_background", this.LJIIL);
                jSONObject.put("graphics_background", this.LJIIJJI);
            } else {
                jSONObject.put("dalvik_pss_foreground", this.LJIIJ);
                jSONObject.put("native_pss_foreground", this.LJII);
                jSONObject.put("total_pss_foreground", this.LJIIIIZZ);
                jSONObject.put("java_heap_foreground", this.LJIIIZ);
                jSONObject.put("java_heap_foreground_used_rate", this.LJIILIIL);
                jSONObject.put("vm_size_foreground", this.LJIIL);
                jSONObject.put("graphics_foreground", this.LJIIJJI);
            }
            if (this.LJIILJJIL) {
                jSONObject.put("reach_top_java", 1);
            }
            try {
                Map<Object, Object> map = this.LJIILLIIL;
                if (map != null) {
                    for (Map.Entry<Object, Object> entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), CastLongProtector.parseLong((String) entry.getValue()));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return jSONObject;
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return jSONObject;
    }

    public final C792770V7z LJII() {
        C792770V7z c792770V7z = new C792770V7z();
        c792770V7z.LIZ = this.LIZJ;
        c792770V7z.LIZIZ = this.LIZLLL;
        c792770V7z.LIZJ = this.LJ;
        c792770V7z.LIZLLL = this.LJFF;
        c792770V7z.LJ = this.LJI;
        c792770V7z.LJFF = this.LJII;
        c792770V7z.LJI = this.LJIIIIZZ;
        c792770V7z.LJII = this.LJIIIZ;
        c792770V7z.LJIIIIZZ = this.LJIIJ;
        c792770V7z.LJIIIZ = this.LJIIJJI;
        c792770V7z.LJIIJ = this.LJIIL;
        c792770V7z.LJIIJJI = this.LJIILJJIL;
        return c792770V7z;
    }

    @Override // X.AbstractC792370V6l
    public final JSONObject LJFF() {
        JSONObject jSONObjectLIZIZ = C2257208ss.LIZ().LIZIZ();
        if (this.LJIILL) {
            try {
                C792450V6t.LIZ(jSONObjectLIZIZ, C2257208ss.LIZ().LIZLLL());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        InterfaceC2166408eE interfaceC2166408eE = (InterfaceC2166408eE) C792590V7h.LIZ(InterfaceC2166408eE.class);
        if (interfaceC2166408eE != null) {
            try {
                C792450V6t.LIZ(jSONObjectLIZIZ, interfaceC2166408eE.LIZIZ());
                return jSONObjectLIZIZ;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return jSONObjectLIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemoryPerfMonitorable{gcCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", gcTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", blockingGcCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", blockingGcTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", nativePss=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", totalPss=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", javaUsedMemory=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", dalvikUsedSize=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", graphics=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", vmSize=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", javaUsedMemoryRate=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", isMemoryReachTop=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C792760V7y(long j, long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, long j9, long j10, double d, boolean z2, boolean z3) {
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = z;
        this.LJII = j5;
        this.LJIIIIZZ = j6;
        this.LJIIIZ = j7;
        this.LJIIJ = j8;
        this.LJIIJJI = j9;
        this.LJIIL = j10;
        this.LJIILIIL = d;
        this.LJIILJJIL = z2;
        this.LJIILL = z3;
    }
}

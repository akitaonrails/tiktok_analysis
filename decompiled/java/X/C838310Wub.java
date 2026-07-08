package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838310Wub {
    public static final Object LJIIIZ = new Object();
    public static C838310Wub LJIIJ;
    public static int LJIIJJI;
    public C825940Wae LIZ;
    public int LIZJ;
    public String LIZLLL;
    public Throwable LJI;
    public Map<String, Object> LJII;
    public C838310Wub LJIIIIZZ;
    public String LIZIZ = "unknown";
    public C838330Wud LJ = new C838330Wud();
    public EnumC838050WuB LJFF = EnumC838050WuB.INFO;

    public final void LIZIZ() {
        this.LIZ = null;
        this.LIZIZ = "unknown";
        this.LIZJ = 0;
        this.LIZLLL = null;
        this.LJFF = EnumC838050WuB.INFO;
        this.LJI = null;
        this.LJII = null;
        C838330Wud c838330Wud = this.LJ;
        C838340Wue c838340Wue = c838330Wud.LIZ;
        c838340Wue.LIZ = 0L;
        C838340Wue c838340Wue2 = c838330Wud.LIZIZ;
        c838340Wue2.LIZ = 0L;
        C838340Wue c838340Wue3 = c838330Wud.LIZJ;
        c838340Wue3.LIZ = 0L;
        c838340Wue.LIZIZ = 0L;
        c838340Wue2.LIZIZ = 0L;
        c838340Wue3.LIZIZ = 0L;
        c838330Wud.LIZLLL = false;
        c838330Wud.LJ = false;
        synchronized (LJIIIZ) {
            try {
                int i = LJIIJJI;
                if (i < 50) {
                    this.LJIIIIZZ = LJIIJ;
                    LJIIJ = this;
                    LJIIJJI = i + 1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C838310Wub LIZ() {
        C838310Wub c838310Wub = new C838310Wub();
        c838310Wub.LIZ = this.LIZ;
        c838310Wub.LIZIZ = this.LIZIZ;
        c838310Wub.LIZJ = this.LIZJ;
        c838310Wub.LIZLLL = this.LIZLLL;
        C838330Wud c838330Wud = this.LJ;
        c838330Wud.getClass();
        C838330Wud c838330Wud2 = new C838330Wud();
        C838340Wue c838340Wue = c838330Wud2.LIZIZ;
        C838340Wue c838340Wue2 = c838330Wud.LIZIZ;
        c838340Wue.LIZ = c838340Wue2.LIZ;
        c838340Wue.LIZIZ = c838340Wue2.LIZIZ;
        C838340Wue c838340Wue3 = c838330Wud2.LIZ;
        C838340Wue c838340Wue4 = c838330Wud.LIZ;
        c838340Wue3.LIZ = c838340Wue4.LIZ;
        c838340Wue3.LIZIZ = c838340Wue4.LIZIZ;
        C838340Wue c838340Wue5 = c838330Wud2.LIZJ;
        C838340Wue c838340Wue6 = c838330Wud.LIZJ;
        c838340Wue5.LIZ = c838340Wue6.LIZ;
        c838340Wue5.LIZIZ = c838340Wue6.LIZIZ;
        c838330Wud2.LIZLLL = c838330Wud.LIZLLL;
        c838330Wud2.LJ = c838330Wud.LJ;
        c838310Wub.LJ = c838330Wud2;
        c838310Wub.LJFF = this.LJFF;
        c838310Wub.LJI = this.LJI;
        c838310Wub.LJII = this.LJII;
        return c838310Wub;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Event(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventType='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timeAnchor=");
        C838340Wue c838340Wue = this.LJ.LIZIZ;
        sbLIZ.append((c838340Wue.LIZIZ - c838340Wue.LIZ) / 1000000.0f);
        sbLIZ.append(", eventLevel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", stack=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", extraMap=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

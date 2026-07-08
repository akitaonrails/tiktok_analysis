package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.157M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C157M {
    public Long LIZ;
    public final Function0<Unit> LIZIZ;
    public int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Object LJFF;
    public final InterfaceC20334914hX LJI;
    public final long LJII;

    public C157M() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduleTaskInfo {\n");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("   node = ");
        sbLIZ.append(this.LJFF);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append('\n');
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("   priority = ");
        sbLIZ2.append(this.LIZJ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        sb.append('\n');
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("   netId = ");
        sbLIZ3.append(this.LIZLLL);
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append('\n');
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("   nodeId = ");
        sbLIZ4.append(this.LJ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        sb.append("\n}\n");
        return sb.toString();
    }

    public C157M(C2250771D7r c2250771D7r, int i, String str, String str2, Object obj, InterfaceC20334914hX interfaceC20334914hX) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ = c2250771D7r;
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = obj;
        this.LJI = interfaceC20334914hX;
        this.LJII = jCurrentTimeMillis;
    }
}

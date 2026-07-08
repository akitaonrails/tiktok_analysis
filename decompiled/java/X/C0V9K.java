package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0V9K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9K {
    public boolean LIZ;
    public boolean LIZIZ;
    public double LIZJ = 3.0d;
    public double LIZLLL = 6.0d;
    public double LJ = 0.05d;
    public boolean LJFF;
    public Map<String, Double> LJI;
    public Map<String, Double> LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpuExceptionConfig{isOpen=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCollectMainThread=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxProcessBackCpuSpeed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxProcessForeCpuSpeed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", maxThreadCpuRate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isCollectAllProcess=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", backSceneMaxSpeedMap=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", foreSceneMaxSpeedMap=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

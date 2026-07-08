package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableInstantCpuRateSetting;

/* JADX INFO: renamed from: X.1AdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183741AdI {
    public C2183751AdJ LIZ;
    public final int LIZIZ;
    public double LIZJ = -1.0d;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public double LJI = -1.0d;
    public final boolean LJII;

    public C2183741AdI() {
        C0VSJ c0vsj = new C0VSJ("/proc/stat");
        this.LJII = c0vsj.exists() && c0vsj.canRead();
        this.LIZIZ = LiveMtEnableInstantCpuRateSetting.INSTANCE.getValue();
    }

    public final void LIZ(long j, double d, double d2, long j2, long j3) {
        long j4;
        if (this.LJFF > -1) {
            C2183751AdJ c2183751AdJ = this.LIZ;
            if (c2183751AdJ == null) {
                this.LIZ = new C2183751AdJ(j, d, d, d2, d2);
                j4 = 0;
            } else {
                if (c2183751AdJ.LIZ == 0) {
                    j4 = 0;
                    c2183751AdJ.LIZ = j;
                } else {
                    j4 = 0;
                }
                c2183751AdJ.LIZIZ++;
                c2183751AdJ.LIZLLL += d;
                if (c2183751AdJ.LIZJ < d) {
                    c2183751AdJ.LIZJ = d;
                }
                c2183751AdJ.LJFF += d2;
                if (c2183751AdJ.LJ < d2) {
                    c2183751AdJ.LJ = d2;
                }
            }
            C2183751AdJ c2183751AdJ2 = this.LIZ;
            if (j - c2183751AdJ2.LIZ > 300000) {
                double d3 = c2183751AdJ2.LIZLLL;
                double d4 = c2183751AdJ2.LIZIZ;
                float f = (float) (d3 / d4);
                float f2 = (float) c2183751AdJ2.LIZJ;
                float f3 = (float) (c2183751AdJ2.LJFF / d4);
                float f4 = (float) c2183751AdJ2.LJ;
                if (f > -1.0f && f2 > -1.0f && this.LJII && C20441214yg.LIZJ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("app_usage_rate=");
                    sbLIZ.append(f);
                    C20441214yg.LIZIZ("MonitorCpu", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("app_max_usage_rate=");
                    sbLIZ2.append(f2);
                    C20441214yg.LIZIZ("MonitorCpu", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (C20441214yg.LIZJ()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("app_stat_speed=");
                    sbLIZ3.append(f3);
                    C20441214yg.LIZIZ("MonitorCpu", C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("app_max_stat_speed=");
                    sbLIZ4.append(f4);
                    C20441214yg.LIZIZ("MonitorCpu", C2188811AlT.LIZIZ(sbLIZ4));
                }
                C2183751AdJ c2183751AdJ3 = this.LIZ;
                c2183751AdJ3.LIZ = j4;
                c2183751AdJ3.LIZJ = 0.0d;
                c2183751AdJ3.LIZIZ = j4;
                c2183751AdJ3.LIZLLL = 0.0d;
                c2183751AdJ3.LJ = 0.0d;
                c2183751AdJ3.LJFF = 0.0d;
            }
        }
        this.LIZLLL = j3;
        this.LJ = j2;
        this.LIZJ = d;
        this.LJFF = j;
        this.LJI = d2;
    }
}

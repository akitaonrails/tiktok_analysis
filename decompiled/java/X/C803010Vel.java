package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0Vel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803010Vel extends C802970Veh {
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final long LJIILIIL;

    @Override // X.C802970Veh
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fdTrackEnable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append("\nwaterLine=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append("\ndumpLine=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append("\nloopMonitorEnable=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append("\nsleepTime=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append("\nbacktraceLimit=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append("\ndebug=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append("\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C803010Vel(int i, int i2, int i3, long j, boolean z) {
        super(21, 35, 2);
        this.LJIIJ = 500;
        this.LJIIJJI = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LJIIL = 10;
        this.LJIILIIL = 60000L;
        if (C802300Vdc.LIZIZ()) {
            this.LJII = true;
            this.LJIIIIZZ = true;
            this.LJIIJ = 200;
            this.LJIIJJI = 400;
            this.LJIILIIL = 1000L;
            this.LJIIL = 10;
            this.LJIIIZ = true;
            return;
        }
        this.LJII = true;
        this.LJIIIIZZ = z;
        this.LJIIJ = i;
        this.LJIIJJI = i2;
        this.LJIILIIL = Math.max(1000L, j);
        this.LJIIL = i3;
    }
}

package X;

import com.ss.android.ugc.aweme.performance.metrics.ResourcesPerfMonitorModel;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0S9D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S9D implements C0S9I {
    public final String LIZ = "perf_resources_monitor_event";
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public Double LJFF;
    public Float LJI;
    public Float LJII;
    public Integer LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public final C01GW LJIIJJI;

    public C0S9D() {
        C01GW c01gw = C0S9G.LIZIZ;
        boolean z = false;
        this.LIZIZ = ((ResourcesPerfMonitorModel) c01gw.getValue()).enableCpuMonitor == 1 && C328140Ctg.LIZ(((ResourcesPerfMonitorModel) c01gw.getValue()).sampleRate);
        if (((ResourcesPerfMonitorModel) c01gw.getValue()).enableMemoryMonitor == 1 && C328140Ctg.LIZ(((ResourcesPerfMonitorModel) c01gw.getValue()).sampleRate)) {
            z = true;
        }
        this.LIZJ = z;
        this.LJIIJJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(536));
    }

    @Override // X.C0S9I
    public final String getEventName() {
        return this.LIZ;
    }
}

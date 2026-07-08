package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.util.MonitoringCollector$sendToMonitoring$1", f = "MonitoringCollector.kt", l = {}, m = "invokeSuspend")
public final class C565870MHh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C565880MHi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C565870MHh(C565880MHi c565880MHi, InterfaceC1364105Vn<? super C565870MHh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c565880MHi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C565870MHh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MonitoringCollector@6386.sendToMonitoring$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cover_extraction_metric_");
            sbLIZ.append(this.LL.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("metric_type", this.LL.LIZ);
            c0lab.LIZIZ(this.LL.LIZIZ, "timestamp");
            for (Map.Entry<String, Object> entry : this.LL.LIZJ.entrySet()) {
                c0lab.LJ(entry.getKey(), String.valueOf(entry.getValue()));
            }
            C20684815ws.LJIILLIIL(strLIZIZ, c0lab.LIZ);
            C0MHB c0mhb = C0MHB.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Monitoring metric: type=");
            sbLIZ2.append(this.LL.LIZ);
            sbLIZ2.append(", data=");
            sbLIZ2.append(this.LL.LIZJ);
            C201955140j.LIZLLL(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0MHB c0mhb2 = C0MHB.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Failed to send monitoring metric: ");
            sbLIZ3.append(e.getMessage());
            C201955140j.LJIIIIZZ(c0mhb2, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ3));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MonitoringCollector@6386.sendToMonitoring$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

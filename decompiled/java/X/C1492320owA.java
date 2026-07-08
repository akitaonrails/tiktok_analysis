package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS637S0100000_23;

/* JADX INFO: renamed from: X.0owA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492320owA implements InterfaceC202037143n {
    public final InterfaceC1492330owB LIZ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LIZIZ = true;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public final AwS637S0100000_23 LJI = new AwS637S0100000_23(this, 8);
    public final AwS602S0100000_23 LJII = new AwS602S0100000_23(this, 48);

    @Override // X.InterfaceC202037143n
    public final void LIZIZ() {
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC202037143n
    public final void destroy() {
        try {
            this.LJ = true;
            this.LJFF = true;
            ConcurrentHashMap<Long, C1436780nUa> concurrentHashMap = C1492260ow4.LIZ;
            C1492260ow4.LIZIZ(this.LIZJ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final long LIZLLL() {
        ConcurrentHashMap<Long, C1436780nUa> concurrentHashMap = C1492260ow4.LIZ;
        DetectorParam detectorParam = new DetectorParam(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
        Activity activityLJFF = C2214201BlK.LJFF();
        return C1492260ow4.LIZ(detectorParam, new C1492280ow6(activityLJFF != null ? activityLJFF.getClass().getSimpleName() : null, ""), this.LJI, this.LJII);
    }

    @Override // X.InterfaceC202040143q
    public final void LIZJ() {
        try {
            this.LIZJ = LIZLLL();
            this.LIZLLL = System.currentTimeMillis();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC202037143n
    public final void LIZ() {
        destroy();
    }

    public C1492320owA(C1492340owC c1492340owC) {
        this.LIZ = c1492340owC;
    }
}

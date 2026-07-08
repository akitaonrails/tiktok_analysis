package X;

import Y.ARunnableS28S1100000_23;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS97S1000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508220pLo implements InterfaceC2173208fK {
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public final BPEAHandler LIZ = C1507830pLB.LIZJ;
    public LinkedList<Runnable> LIZLLL = new LinkedList<>();
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(123));

    public static void LIZJ() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Intrinsics.LJFF(((IApplicationDependencyService) iECommerceHostService2).getChannel(), "local_test");
    }

    @Override // X.InterfaceC2173208fK
    public final void LIZ(List<String> list) {
        if (!list.contains("mall")) {
            return;
        }
        this.LIZIZ = true;
        new AwS556S0100000_12(list, (List<String>) 710);
        LIZJ();
    }

    @Override // X.InterfaceC2173208fK
    public final void LJI(String str) {
        if (!Intrinsics.LJFF(str, "mall")) {
            return;
        }
        this.LIZIZ = false;
        new AwS97S1000000_12(str, 9);
        LIZJ();
    }

    public final void LIZIZ(Runnable runnable, String str) {
        boolean z = !C1507840pLC.LIZIZ().retreatDisableUiTags.contains(str);
        new C1508230pLp(this, z, str);
        LIZJ();
        if (((Boolean) this.LJFF.getValue()).booleanValue() && z && this.LJ && this.LIZJ && this.LIZIZ && C08L8.LIZ()) {
            C1717206ny.LIZ(runnable, this.LIZLLL);
            C1507860pLE c1507860pLE = C1507830pLB.LJFF;
            if (c1507860pLE != null) {
                c1507860pLE.LJIIJJI++;
                return;
            }
            return;
        }
        runnable.run();
    }

    @Override // X.InterfaceC2173208fK
    public final void LJ(String str, String str2) {
        if (!Intrinsics.LJFF(str, "mall")) {
            return;
        }
        this.LIZIZ = false;
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS28S1100000_23(this, str2, 16));
    }
}

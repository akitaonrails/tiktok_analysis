package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0owO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492460owO implements InterfaceC1492410owJ {
    public static final /* synthetic */ int LJII = 0;
    public InterfaceC1492480owQ LIZIZ;
    public EnumC1492290ow7 LIZJ;
    public HashMap<String, HashMap<String, Object>> LIZLLL;
    public C1436780nUa LJ;
    public final List<InterfaceC1492480owQ> LIZ = new ArrayList();
    public final C1492470owP LJFF = new C1492470owP();
    public final List<Function1<Boolean, Unit>> LJI = new ArrayList();

    @Override // X.InterfaceC1492410owJ
    public final synchronized void LIZ() {
        LIZJ();
    }

    public final synchronized void LIZJ() {
        try {
            C1492470owP c1492470owP = this.LJFF;
            final List<Function1<Boolean, Unit>> list = this.LJI;
            c1492470owP.getClass();
            try {
                c1492470owP.LIZIZ.set(false);
                C2487409ou.LIZJ(new Runnable() { // from class: X.00kF
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FetchFeedDetectorManager$FeedNullNetNotifyUIHelper@d18f.releaseAllUIShow$1$1");
                        try {
                            Iterator<Function1<Boolean, Unit>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().invoke(Boolean.FALSE);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FetchFeedDetectorManager$FeedNullNetNotifyUIHelper@d18f.releaseAllUIShow$1$1");
                    }
                });
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        try {
            this.LIZIZ = null;
            this.LIZLLL = null;
            this.LIZJ = null;
            C1436780nUa c1436780nUa = this.LJ;
            if (c1436780nUa != null) {
                c1436780nUa.LIZ();
            }
            this.LJ = null;
            Iterator<InterfaceC1492480owQ> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
            ((ArrayList) this.LIZ).clear();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
    }

    public final synchronized void LIZLLL() {
        Unit unit;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (C1492500owS.LIZ()) {
            if (this.LJFF.LIZ(true)) {
                if (C1588630rRV.LIZ() || C1588630rRV.LIZIZ()) {
                    EnumC1492290ow7 enumC1492290ow7 = this.LIZJ;
                    if (enumC1492290ow7 != null) {
                        int i = C1492300ow8.LIZ[enumC1492290ow7.ordinal()];
                        if (i == 1 || i == 2) {
                            this.LJFF.LIZIZ(this.LIZJ, this.LIZLLL);
                        } else {
                            if (i != 3) {
                                throw new C1954807lC();
                            }
                            if (this.LJFF.LIZIZ(this.LIZJ, this.LIZLLL)) {
                                LJ();
                            }
                        }
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                }
            }
        }
    }

    public final synchronized void LJ() {
        if (C1492500owS.LIZ()) {
            if (this.LJ != null) {
                return;
            }
            if (this.LIZJ == null) {
                return;
            }
            InterfaceC1492480owQ interfaceC1492480owQ = this.LIZIZ;
            Integer numValueOf = interfaceC1492480owQ != null ? Integer.valueOf(interfaceC1492480owQ.hashCode()) : null;
            C1436780nUa c1436780nUa = new C1436780nUa();
            C11NZ.LJLJJLL(C2530509vr.LIZ, TimeUnit.MILLISECONDS).LIZIZ(new C1436920nUo(c1436780nUa, new AwS389S0200000_23(this, numValueOf, 8)));
            this.LJ = c1436780nUa;
        }
    }

    @Override // X.InterfaceC1492410owJ
    public final synchronized void LIZIZ(InterfaceC1492480owQ interfaceC1492480owQ, EnumC1492290ow7 enumC1492290ow7, HashMap<String, HashMap<String, Object>> map) {
        if (!C1492500owS.LIZ()) {
            return;
        }
        if (Intrinsics.LJFF(this.LIZIZ, interfaceC1492480owQ) && this.LIZJ == null) {
            this.LIZJ = enumC1492290ow7;
            this.LIZLLL = map;
            if (C1588630rRV.LIZIZ() || C1588630rRV.LIZ()) {
                LIZLLL();
            }
        }
    }
}

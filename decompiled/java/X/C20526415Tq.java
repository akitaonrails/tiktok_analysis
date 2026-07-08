package X;

import android.accounts.NetworkErrorException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS137S0101000_31;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.15Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.repo.ExploreFeedListRepository$prefetchV2$1", f = "ExploreFeedListRepository.kt", l = {416, 427}, m = "invokeSuspend")
public final class C20526415Tq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15TX LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20526415Tq(C15TX c15tx, int i, InterfaceC1364105Vn<? super C20526415Tq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15tx;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20526415Tq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objB = obj;
        C1C7U.LIZ("ExploreFeedListRepository@eec9.prefetchV2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objB);
                } else {
                    C155000ia.LIZIZ(objB);
                }
            } else {
                C155000ia.LIZIZ(objB);
                C2153908cD c2153908cD = C2153908cD.LIZ;
                Explore0VVTrackerMonitor.INSTANCE.networkStatus(C15UN.LOADING);
                if (C07MS.LIZ()) {
                    C20524915Tb c20524915Tb = this.LLILLJJLI.LLILZIL;
                    Integer numLJ = C2286608xc.LJ(0);
                    int i2 = this.LLILLL;
                    AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this.LLILLJJLI, 1578);
                    AwS137S0101000_31 awS137S0101000_31 = new AwS137S0101000_31(this.LLILLL, this.LLILLJJLI, 11);
                    this.LL = 1;
                    objB = c20524915Tb.LJJJJLL(true, true, null, numLJ, i2, awS575S0100000_31, null, awS137S0101000_31, this);
                    if (objB == objLJFF) {
                        C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetchV2$1");
                        return objLJFF;
                    }
                } else {
                    C20524915Tb c20524915Tb2 = this.LLILLJJLI.LLILZIL;
                    Integer numLJ2 = C2286608xc.LJ(0);
                    int i3 = this.LLILLL;
                    AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31(this.LLILLJJLI, 1579);
                    AwS137S0101000_31 awS137S0101000_312 = new AwS137S0101000_31(this.LLILLL, this.LLILLJJLI, 12);
                    this.LL = 2;
                    objB = c20524915Tb2.b(true, true, null, numLJ2, i3, awS575S0100000_312, null, awS137S0101000_312, this);
                    if (objB == objLJFF) {
                        C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetchV2$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(th, 1085);
            c2153908cD2.getClass();
            C2153908cD.LIZ("ExploreFeedPrefetch_log", awS572S0100000_28);
            C20532515Vz.LIZ(new C15W0(th) { // from class: X.0CpB
                public final Throwable LIZ;

                @Override // X.C15W0
                public final Map<String, String> LIZ() {
                    String strLIZIZ;
                    C23112093u c23112093u;
                    Pair[] pairArr = new Pair[3];
                    Throwable th2 = this.LIZ;
                    if (th2 instanceof C0XIR) {
                        strLIZIZ = "ApiServerException";
                    } else if (th2 instanceof NetworkErrorException) {
                        strLIZIZ = "NetworkErrorException";
                    } else if (th2 instanceof C1494690ozz) {
                        strLIZIZ = "CronetIOException";
                    } else if (th2 instanceof C1494450ozb) {
                        strLIZIZ = "NetworkNotAvailableException";
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unknown:");
                        sbLIZ.append(th2.getClass().getSimpleName());
                        sbLIZ.append(' ');
                        sbLIZ.append(th2.getLocalizedMessage());
                        sbLIZ.append(' ');
                        sbLIZ.append(th2.getMessage());
                        sbLIZ.append(' ');
                        sbLIZ.append(th2);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    pairArr[0] = new Pair("error_type", strLIZIZ);
                    pairArr[1] = new Pair("error_msg", String.valueOf(this.LIZ.getMessage()));
                    Throwable th3 = this.LIZ;
                    Integer numValueOf = null;
                    if ((th3 instanceof C0XIR) && (c23112093u = (C23112093u) th3) != null) {
                        numValueOf = Integer.valueOf(c23112093u.getErrorCode());
                    }
                    pairArr[2] = new Pair("error_code", String.valueOf(numValueOf));
                    return C2097608Jq.LJIIIIZZ(pairArr);
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C325350CpB) && Intrinsics.LJFF(this.LIZ, ((C325350CpB) obj2).LIZ);
                }

                @Override // X.C15W0
                public final String getEventName() {
                    return "explore_preload_error";
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ExplorePreloadErrorET(throwable=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = th;
                }
            });
            Explore0VVTrackerMonitor.INSTANCE.networkStatus(C15UN.REQUEST_FAILED);
            C1AF0.LJFF(th, "ExploreFeedPrefetchV2_log");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetchV2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

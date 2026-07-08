package X;

import Y.ARunnableS12S1400000_26;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708980uZc extends C09AY implements InterfaceC1631620sYq<String, String, String, Unit> {
    public final /* synthetic */ C1709050uZj LL;
    public final /* synthetic */ C1709220ua0 LLILLJJLI;
    public final /* synthetic */ CashierKey LLILLL;
    public final /* synthetic */ C1708910uZV LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708980uZc(CashierKey cashierKey, C1709220ua0 c1709220ua0, C1708910uZV c1708910uZV, C1709050uZj c1709050uZj) {
        super(3);
        this.LL = c1709050uZj;
        this.LLILLJJLI = c1709220ua0;
        this.LLILLL = cashierKey;
        this.LLILZ = c1708910uZV;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        String str4 = str2;
        C1709050uZj c1709050uZj = this.LL;
        C1709220ua0 c1709220ua0 = this.LLILLJJLI;
        CashierKey cashierKey = this.LLILLL;
        C1708910uZV c1708910uZV = this.LLILZ;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c1709050uZj.LIZIZ();
            C1709050uZj.LIZJ = false;
            C1709050uZj.LIZLLL = 0L;
            Unit unit = null;
            if (c1709220ua0 != null && c1709220ua0.LJFF != null) {
                c1709220ua0.LJFF.invoke(str4);
            } else {
                EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_NETWORK_ERROR;
                C1707910uXt.LJFF(cashierKey, enumC1707350uWz.getErrorCode(), enumC1707350uWz.getErrorMessage(), null, 72);
            }
            try {
                IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
                if (iProbeService != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1708910uZV.LIZLLL.LJ);
                    sbLIZ.append("_cashier");
                    iProbeService.LJIIJJI(new C1504130pFD(C2188811AlT.LIZIZ(sbLIZ)));
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS12S1400000_26(c1709050uZj, c1709220ua0, cashierKey, str4, c1708910uZV, 2));
        }
        return Unit.LIZ;
    }
}

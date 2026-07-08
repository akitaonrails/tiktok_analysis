package X;

import com.bytedance.touchpoint.api.config.IIncentiveManager;
import com.bytedance.touchpoint.api.service.ITouchPointOptService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS23S1110000_28;

/* JADX INFO: renamed from: X.0zQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895450zQN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SpecActServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895450zQN(SpecActServiceImpl specActServiceImpl) {
        super(0);
        this.LL = specActServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (C1619800sFm.LIZIZ.LJIIL()) {
            C1895460zQO.LL.getClass();
            if (!C1895460zQO.LLILLL) {
                C1895460zQO.LLILLL = true;
                ((BaseTouchPointDataVM) C1895460zQO.LLILLJJLI.getValue()).vQ2(new C2217381BqS() { // from class: X.0zQR
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Long.valueOf(((C1895080zPm) obj).LL);
                    }
                }, C736820SvI.LIZLLL(), AFwS264S0000000_24.get$arr$(618));
            }
            if (!C1895040zPi.LIZIZ) {
                ((BaseTouchPointDataVM) C1895040zPi.LIZ.getValue()).vQ2(new C2217381BqS() { // from class: X.0zQQ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Long.valueOf(((C1895080zPm) obj).LL);
                    }
                }, null, AFwS271S0000000_28.get$arr$(254));
                C1895040zPi.LIZIZ = true;
            }
            C1895470zQP.LIZ.getClass();
            ITouchPointOptService.LIZ.getClass();
            ITouchPointOptService iTouchPointOptServiceLIZ = C1895390zQH.LIZ();
            if (iTouchPointOptServiceLIZ != null) {
                iTouchPointOptServiceLIZ.LIZ();
            }
            if (!C1895470zQP.LIZJ) {
                ((BaseTouchPointDataVM) C1895470zQP.LIZIZ.getValue()).vQ2(new C2217381BqS() { // from class: X.0zQS
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Long.valueOf(((C1895080zPm) obj).LL);
                    }
                }, null, AFwS264S0000000_24.get$arr$(760));
                C1895470zQP.LIZJ = true;
            }
        }
        C0B0C.LIZ.getClass();
        if (C0B0C.LIZ()) {
            C0CN5.LIZJ(Long.valueOf(C0B0C.LIZIZ()), this.LL.LIZIZ, false);
        } else {
            this.LL.LJJJJI();
            String value = EnumC1893950zNx.FEED_BEFORE.getValue();
            C1893940zNw value2 = C1893940zNw.LJI.getValue();
            value2.getClass();
            C01U6.LIZJ(new AwS23S1110000_28(value2, false, value, 0));
            if (((Boolean) C073U.LIZ.getValue()).booleanValue()) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), this.LL.LIZIZ);
            } else {
                IIncentiveManager iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null);
                if (iIncentiveManager != null) {
                    iIncentiveManager.LIZJ(1);
                }
            }
        }
        return Unit.LIZ;
    }
}

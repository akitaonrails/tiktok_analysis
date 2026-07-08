package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.model.OpenStateResult;
import com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncViewModel$openCaRequest$2", f = "OpenCANeedSyncViewModel.kt", l = {67, 71}, m = "invokeSuspend")
public final class C1718360uok extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OpenCANeedSyncViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718360uok(OpenCANeedSyncViewModel openCANeedSyncViewModel, String str, InterfaceC1364105Vn<? super C1718360uok> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = openCANeedSyncViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1718360uok(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenCANeedSyncViewModel@9866.openCaRequest$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.setState(new AwS76S1000000_26((String) obj, 3));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("OpenCANeedSyncViewModel@9866.openCaRequest$2");
                    return unit;
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                OpenCANeedSyncViewModel openCANeedSyncViewModel = this.LLILLJJLI;
                String str = this.LLILLL;
                this.LL = 1;
                openCANeedSyncViewModel.getClass();
                obj = OpenCANeedSyncViewModel.xQ2(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OpenCANeedSyncViewModel@9866.openCaRequest$2");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) obj;
            BaseResponse baseResponse = (BaseResponse) c0x52.LIZIZ;
            if (c0x52.LIZJ() && baseResponse.LIZ()) {
                T t = baseResponse.data;
                if (t != 0 && !Intrinsics.LJFF(((OpenStateResult) t).openState, "FINISH")) {
                    OpenCANeedSyncViewModel openCANeedSyncViewModel2 = this.LLILLJJLI;
                    String str2 = this.LLILLL;
                    openCANeedSyncViewModel2.getClass();
                    openCANeedSyncViewModel2.setState(new AwS33S0010000_19(true, 23));
                    C23250099c.LIZLLL(openCANeedSyncViewModel2.getAssemVMScope(), C0PEM.LIZJ, null, new C1718350uoj(openCANeedSyncViewModel2, str2, true, null), 2);
                } else {
                    OpenCANeedSyncViewModel openCANeedSyncViewModel3 = this.LLILLJJLI;
                    String str3 = this.LLILLL;
                    this.LL = 2;
                    obj = openCANeedSyncViewModel3.vQ2(str3, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("OpenCANeedSyncViewModel@9866.openCaRequest$2");
                        return objLJFF;
                    }
                    this.LLILLJJLI.setState(new AwS76S1000000_26((String) obj, 3));
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("OpenCANeedSyncViewModel@9866.openCaRequest$2");
                    return unit2;
                }
            } else {
                OpenCANeedSyncViewModel openCANeedSyncViewModel4 = this.LLILLJJLI;
                openCANeedSyncViewModel4.LLILLJJLI = "open";
                openCANeedSyncViewModel4.setState(AFwS268S0000000_26.get$arr$(586));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            OpenCANeedSyncViewModel openCANeedSyncViewModel5 = this.LLILLJJLI;
            openCANeedSyncViewModel5.LLILLJJLI = "open";
            openCANeedSyncViewModel5.setState(AFwS268S0000000_26.get$arr$(586));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("OpenCANeedSyncViewModel@9866.openCaRequest$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

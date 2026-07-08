package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0XnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel$loadRecentData$1$1", f = "TakoBotCenterOperator.kt", l = {119}, m = "invokeSuspend")
public final class C859400XnW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoBotCenterViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859400XnW(TakoBotCenterViewModel takoBotCenterViewModel, InterfaceC1364105Vn<? super C859400XnW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoBotCenterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859400XnW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotCenterViewModel@7f61.loadRecentData$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC859420XnY interfaceC859420XnY = (InterfaceC859420XnY) this.LLILLJJLI.vQ2().getOperator();
            this.LL = 1;
            obj = interfaceC859420XnY.LJJLI(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoBotCenterViewModel@7f61.loadRecentData$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setState(new AwS593S0100000_14((TakoBotCenterResponse) obj, 158));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotCenterViewModel@7f61.loadRecentData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

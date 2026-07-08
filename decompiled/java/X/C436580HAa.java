package X;

import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel$markConsumedForVideoRain$1", f = "IMEffectNoticeViewModel.kt", l = {225}, m = "invokeSuspend")
public final class C436580HAa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMEffectNoticeViewModel LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436580HAa(IMEffectNoticeViewModel iMEffectNoticeViewModel, List<String> list, InterfaceC1364105Vn<? super C436580HAa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMEffectNoticeViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436580HAa(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEffectNoticeViewModel@2d.markConsumedForVideoRain$1");
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
            C09AM c09am = C09AM.LL;
            C436590HAb c436590HAb = new C436590HAb(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c09am, c436590HAb) == objLJFF) {
                C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.markConsumedForVideoRain$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.markConsumedForVideoRain$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

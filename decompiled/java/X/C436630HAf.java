package X;

import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS91S1200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel$tryTriggerExplosion$2", f = "IMEffectNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C436630HAf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMEffectNoticeViewModel LL;
    public final /* synthetic */ C0NPA LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436630HAf(IMEffectNoticeViewModel iMEffectNoticeViewModel, C0NPA c0npa, List<String> list, String str, InterfaceC1364105Vn<? super C436630HAf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMEffectNoticeViewModel;
        this.LLILLJJLI = c0npa;
        this.LLILLL = list;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436630HAf(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEffectNoticeViewModel@2d.tryTriggerExplosion$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS91S1200000_6(this.LLILLJJLI, (C0NPA) this.LLILLL, (List<String>) this.LLILZ, (String) 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.tryTriggerExplosion$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

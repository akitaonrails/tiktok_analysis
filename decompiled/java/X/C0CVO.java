package X;

import com.ss.android.ugc.aweme.story.userpanel.vm.DmViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.vm.DmViewModel$updateUserDmStateMap$2$1", f = "DmViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CVO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DmViewModel LL;
    public final /* synthetic */ Map<String, EnumC20615215le> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVO(DmViewModel dmViewModel, Map<String, EnumC20615215le> map, InterfaceC1364105Vn<? super C0CVO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dmViewModel;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmViewModel@b48b.updateUserDmStateMap$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DmViewModel@b48b.updateUserDmStateMap$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

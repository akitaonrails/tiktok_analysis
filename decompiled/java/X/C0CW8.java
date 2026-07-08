package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import defpackage.w2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CW8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$handleCarryMessageComplete$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CW8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageViewModel LL;
    public final /* synthetic */ w2 LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CW8(MessageViewModel messageViewModel, w2 w2Var, Map<String, String> map, InterfaceC1364105Vn<? super C0CW8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageViewModel;
        this.LLILLJJLI = w2Var;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CW8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.handleCarryMessageComplete$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.BQ2(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.handleCarryMessageComplete$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

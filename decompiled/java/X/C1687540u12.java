package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS604S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0u12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "tiktok.compose.AssemComposeExtensionKt$collectAsState$1$1$1", f = "AssemComposeExtension.kt", l = {}, m = "invokeSuspend")
public final class C1687540u12 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AssemViewModel<Object> LL;
    public final /* synthetic */ C1770850wBP<Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC345960DhK<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687540u12(AssemViewModel<Object> assemViewModel, C1770850wBP<Object> c1770850wBP, InterfaceC345960DhK<Object> interfaceC345960DhK, InterfaceC1364105Vn<? super C1687540u12> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = assemViewModel;
        this.LLILLJJLI = c1770850wBP;
        this.LLILLL = interfaceC345960DhK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687540u12(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AssemViewModel.subscribeInternal$default(this.LL, this.LLILLJJLI, null, null, new AwS604S0100000_25((InterfaceC345960DhK) this.LLILLL, (InterfaceC345960DhK<Object>) 964), 6, null);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

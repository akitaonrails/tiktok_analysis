package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "tiktok.compose.AssemComposeExtensionKt$collectAsState$1$1", f = "AssemComposeExtension.kt", l = {49}, m = "invokeSuspend")
public final class C1687530u11 extends C09AX implements Function2<InterfaceC345960DhK<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AssemViewModel<Object> LLILLL;
    public final /* synthetic */ Lifecycle.State LLILZ;
    public final /* synthetic */ C1770850wBP<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687530u11(AssemViewModel<Object> assemViewModel, Lifecycle.State state, C1770850wBP<Object> c1770850wBP, InterfaceC1364105Vn<? super C1687530u11> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = assemViewModel;
        this.LLILZ = state;
        this.LLILZIL = c1770850wBP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1687530u11 c1687530u11 = new C1687530u11(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1687530u11.LLILLJJLI = obj;
        return c1687530u11;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) this.LLILLJJLI;
            Lifecycle lifecycle = this.LLILLL.getLifecycle();
            Lifecycle.State state = this.LLILZ;
            C1687540u12 c1687540u12 = new C1687540u12(this.LLILLL, this.LLILZIL, interfaceC345960DhK, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c1687540u12, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC345960DhK<Object> interfaceC345960DhK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC345960DhK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

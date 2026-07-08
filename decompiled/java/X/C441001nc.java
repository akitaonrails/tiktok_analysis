package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.InputExtKt$assembleWhenMessageDraftReady$1", f = "InputExt.kt", l = {26}, m = "invokeSuspend")
public final class C441001nc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, MessageDraftVM> LLILLL;
    public final /* synthetic */ Function1<Assembler, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C441001nc(AbstractC738140SxQ abstractC738140SxQ, AssemVMLazy<InterfaceC0148002o, MessageDraftVM> assemVMLazy, Function1<? super Assembler, Unit> function1, InterfaceC1364105Vn<? super C441001nc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC738140SxQ;
        this.LLILLL = assemVMLazy;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441001nc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputExtKt@4328.assembleWhenMessageDraftReady$1");
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
            AssemVMLazy<InterfaceC0148002o, MessageDraftVM> assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C441501nh.LIZ;
            C2252321DDq c2252321DDq = ((MessageDraftVM) assemVMLazy.getValue()).LLJI;
            C440601nY c440601nY = new C440601nY(null);
            this.LL = 1;
            if (C09IC.LJIJ(c2252321DDq, this, c440601nY) == objLJFF) {
                C1C7U.LIZIZ("InputExtKt@4328.assembleWhenMessageDraftReady$1");
                return objLJFF;
            }
        }
        C723850SaN.LIZJ(this.LLILLJJLI, new C5183020f((Function1) this.LLILZ, (Function1<? super Long, Object>) 281));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputExtKt@4328.assembleWhenMessageDraftReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

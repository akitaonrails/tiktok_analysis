package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.api.assem.IMAssemblerExtKt$assembleOnFirstMessageList$2$1", f = "IMAssemblerExt.kt", l = {38}, m = "invokeSuspend")
public final class C440901nb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageListHasRenderedProvider LLILLJJLI;
    public final /* synthetic */ AbstractC738140SxQ LLILLL;
    public final /* synthetic */ Function1<Assembler, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C440901nb(MessageListHasRenderedProvider messageListHasRenderedProvider, AbstractC738140SxQ abstractC738140SxQ, Function1<? super Assembler, Unit> function1, InterfaceC1364105Vn<? super C440901nb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageListHasRenderedProvider;
        this.LLILLL = abstractC738140SxQ;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440901nb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAssemblerExtKt@7984.assembleOnFirstMessageList$2$1");
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
            C05YD<Boolean> c05ydW42 = this.LLILLJJLI.W42();
            C440801na c440801na = new C440801na(null);
            this.LL = 1;
            if (C09IC.LJIJ(c05ydW42, this, c440801na) == objLJFF) {
                C1C7U.LIZIZ("IMAssemblerExtKt@7984.assembleOnFirstMessageList$2$1");
                return objLJFF;
            }
        }
        C723850SaN.LIZJ(this.LLILLL, new C5183020f((Function1) this.LLILZ, (Function1<? super Long, Object>) 285));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMAssemblerExtKt@7984.assembleOnFirstMessageList$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

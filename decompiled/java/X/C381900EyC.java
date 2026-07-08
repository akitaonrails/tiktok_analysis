package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.BaseAIGCHandler$reqSuggestPromptsWithImage$1", f = "BaseAIGCHandler.kt", l = {307}, m = "invokeSuspend")
public final class C381900EyC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ AbstractC381830Ey5 LLILLL;
    public final /* synthetic */ Function1<C382080EyU, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C381900EyC(List<String> list, AbstractC381830Ey5 abstractC381830Ey5, Function1<? super C382080EyU, Unit> function1, InterfaceC1364105Vn<? super C381900EyC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = abstractC381830Ey5;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381900EyC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("BaseAIGCHandler@c43d.reqSuggestPromptsWithImage$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.size() == 1) {
                i = 1;
            } else {
                i = 5;
            }
            InterfaceC381790Ey1 interfaceC381790Ey1 = this.LLILLL.LIZJ;
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC381790Ey1.LJ(i, list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseAIGCHandler@c43d.reqSuggestPromptsWithImage$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            obj = new C382080EyU(C13BV.INSTANCE, C2286608xc.LJ(500201), "null GenAI bridge", 4);
        }
        this.LLILZ.invoke((C382080EyU) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseAIGCHandler@c43d.reqSuggestPromptsWithImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LCR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.checkpoint.CheckPointServiceImpl$deleteUselessCheckPointFile$1", f = "CheckPointServiceImpl.kt", l = {1206}, m = "invokeSuspend")
public final class C0LCR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LCR(AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C0LCR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LCR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckPointServiceImpl@1176.deleteUselessCheckPointFile$1");
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
            if (C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(this.LLILLJJLI.LIZIZ(), false, false, false, 14)) != null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CheckPointServiceImpl@1176.deleteUselessCheckPointFile$1");
                return unit;
            }
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            C570330MYl c570330MYl = new C570330MYl(this.LLILLJJLI, new C560950LzJ("Cancel interrupt recovery", "deleteCheckPointDraft"), C298170BmR.LIZ(), null, null, 116);
            this.LL = 1;
            if (interfaceC545580LaWLIZIZ.LIZJ(c570330MYl, this) == objLJFF) {
                C1C7U.LIZIZ("CheckPointServiceImpl@1176.deleteUselessCheckPointFile$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.deleteUselessCheckPointFile$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

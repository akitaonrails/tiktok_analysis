package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.nativemulticontentcomponent.pager.MultiContentHorizonAdapter$sendEventToViewHolders$1", f = "MultiContentHorizonAdapter.kt", l = {270}, m = "invokeSuspend")
public final class C1013290cTX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1013350cTd LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AbstractC1013190cTN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013290cTX(C1013350cTd c1013350cTd, int i, AbstractC1013190cTN abstractC1013190cTN, InterfaceC1364105Vn<? super C1013290cTX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1013350cTd;
        this.LLILLL = i;
        this.LLILZ = abstractC1013190cTN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1013290cTX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiContentHorizonAdapter@d1f2.sendEventToViewHolders$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
            C1013200cTO c1013200cTO = new C1013200cTO(this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (c2252331DDr.emit(c1013200cTO, this) == objLJFF) {
                C1C7U.LIZIZ("MultiContentHorizonAdapter@d1f2.sendEventToViewHolders$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiContentHorizonAdapter@d1f2.sendEventToViewHolders$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

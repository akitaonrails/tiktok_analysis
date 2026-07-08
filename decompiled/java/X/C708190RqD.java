package X;

import Y.AgS302S0100000_21;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.translation.CommentTranslationController$subscribe$5", f = "CommentTranslationController.kt", l = {327}, m = "invokeSuspend")
public final class C708190RqD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1339430kxZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708190RqD(C1339430kxZ c1339430kxZ, InterfaceC1364105Vn<? super C708190RqD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1339430kxZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C708190RqD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentTranslationController@6cf9.subscribe$5");
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
            InterfaceC346201Wa interfaceC346201WaLJIILIIL = C09IC.LJIILIIL(new C1629806Zs(new C05RH(C1839820xye.LIZ().LIZIZ())), 100L);
            AgS302S0100000_21 agS302S0100000_21 = new AgS302S0100000_21(this.LLILLJJLI, 7);
            this.LL = 1;
            if (interfaceC346201WaLJIILIIL.collect(agS302S0100000_21, this) == objLJFF) {
                C1C7U.LIZIZ("CommentTranslationController@6cf9.subscribe$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentTranslationController@6cf9.subscribe$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

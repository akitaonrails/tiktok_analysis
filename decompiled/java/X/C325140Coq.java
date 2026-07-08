package X;

import android.text.TextUtils;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Coq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$takoConfig$2$3", f = "MessageOperatorHandler.kt", l = {551}, m = "invokeSuspend")
public final class C325140Coq extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863280yaU LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<u2> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C325140Coq(C1863280yaU c1863280yaU, InterfaceC20236714Gf<? super u2> interfaceC20236714Gf, InterfaceC1364105Vn<? super C325140Coq> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1863280yaU;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325140Coq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.takoConfig$2$3");
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
            u2 u2Var = this.LLILLJJLI.LJII;
            if (!u2Var.LIZ && TextUtils.isEmpty(u2Var.LJ)) {
                C05YC<u2> c05yc = this.LLILLJJLI.LJIIJ;
                this.LL = 1;
                obj = C09IC.LJIIZILJ(c05yc, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.takoConfig$2$3");
                    return objLJFF;
                }
            } else {
                if (this.LLILLL.isActive()) {
                    String str = C1863280yaU.LJIILLIIL;
                    C1870240yli.LIZ(AFwS190S0000000_4.get$arr$(2038), true);
                    InterfaceC20236714Gf<u2> interfaceC20236714Gf = this.LLILLL;
                    u2 u2Var2 = this.LLILLJJLI.LJII;
                    C189200o6.m2constructorimpl(u2Var2);
                    interfaceC20236714Gf.resumeWith(u2Var2);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageOperatorHandler@b589.takoConfig$2$3");
                return unit;
            }
        }
        if (this.LLILLL.isActive()) {
            String str2 = C1863280yaU.LJIILLIIL;
            C1870240yli.LIZ(AFwS190S0000000_4.get$arr$(2039), true);
            InterfaceC20236714Gf<u2> interfaceC20236714Gf2 = this.LLILLL;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf2.resumeWith(obj);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.takoConfig$2$3");
        return unit2;
    }
}

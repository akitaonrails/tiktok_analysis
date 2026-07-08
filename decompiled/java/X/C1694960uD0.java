package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import njp.a;

/* JADX INFO: renamed from: X.0uD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
public final class C1694960uD0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1694790uCj LLILLJJLI;
    public final /* synthetic */ InterfaceC1694900uCu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1694960uD0(C1694790uCj c1694790uCj, InterfaceC1694900uCu interfaceC1694900uCu, InterfaceC1364105Vn<? super C1694960uD0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1694790uCj;
        this.LLILLL = interfaceC1694900uCu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1694960uD0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(601);
            this.LL = 1;
            if (C1838620xwi.LIZ(getContext()).LJLZ(this, new C5183020f((Function1) aFwS266S0000000_25, (Function1<? super Long, Object>) 6)) == objLJFF) {
                return objLJFF;
            }
        }
        C05YC<Unit> c05ycLJIIJ = this.LLILLJJLI.LJIIJ();
        if (c05ycLJIIJ != null) {
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLL, 45);
            this.LL = 2;
            if (C2252331DDr.LJIIJ((C2252331DDr) c05ycLJIIJ, agS305S0100000_25, this) == objLJFF) {
                return objLJFF;
            }
            throw new C2197108jB();
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import Y.AgS292S0100000_11;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SC7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.view.PostModeTitleComponent$1", f = "PostModeTitleComponent.kt", l = {61}, m = "invokeSuspend")
public final class C0SC7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C720550SOf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SC7(C720550SOf c720550SOf, InterfaceC1364105Vn<? super C0SC7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c720550SOf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SC7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqLJIIJ;
        C1C7U.LIZ("PostModeTitleComponent@47cf.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0SBA c0sba = this.LLILLJJLI.LIZLLL;
            if (c0sba != null && (c2252321DDqLJIIJ = c0sba.LJIIJ()) != null) {
                AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLJJLI, 31);
                this.LL = 1;
                if (c2252321DDqLJIIJ.collect(agS292S0100000_11, this) == objLJFF) {
                    C1C7U.LIZIZ("PostModeTitleComponent@47cf.<init>$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PostModeTitleComponent@47cf.<init>$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.creatorgroup.CreatorGroupCTDSProtocol$onFanGroupCreateFinish$1", f = "CreatorGroupCTDSProtocol.kt", l = {105}, m = "invokeSuspend")
public final class C1226490i1P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1226500i1Q LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226490i1P(C1226500i1Q c1226500i1Q, InterfaceC1364105Vn<? super C1226490i1P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1226500i1Q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1226490i1P(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        C1224840hyk c1224840hyk;
        InterfaceC1226510i1R interfaceC1226510i1R;
        C1C7U.LIZ("CreatorGroupCTDSProtocol@9744.onFanGroupCreateFinish$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("CreatorGroupCTDSProtocol@9744.onFanGroupCreateFinish$1");
                return objLJFF;
            }
        }
        InterfaceC1226510i1R interfaceC1226510i1R2 = this.LLILLJJLI.LL.LIZ;
        if (interfaceC1226510i1R2 != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R2.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null && (c1224840hyk = (C1224840hyk) C13LP.LJJJLL(list)) != null && (interfaceC1226510i1R = this.LLILLJJLI.LL.LIZ) != null) {
            interfaceC1226510i1R.LIZIZ(c1224840hyk.LLILZ);
        }
        C1226500i1Q c1226500i1Q = this.LLILLJJLI;
        InterfaceC1226510i1R interfaceC1226510i1R3 = c1226500i1Q.LL.LIZ;
        if (interfaceC1226510i1R3 != null) {
            interfaceC1226510i1R3.LJIJJ(c1226500i1Q.LLILLL.getValue());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorGroupCTDSProtocol@9744.onFanGroupCreateFinish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

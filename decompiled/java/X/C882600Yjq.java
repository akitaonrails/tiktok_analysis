package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.core.TarsEngineNode$observableEnvReady$2", f = "TarsEngineNode.kt", l = {40, 51}, m = "invokeSuspend")
public final class C882600Yjq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair>, Object> {
    public C099F LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0Z03 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C882600Yjq(C0Z03 c0z03, InterfaceC1364105Vn<? super C882600Yjq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0z03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C882600Yjq(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final C099F c099fLIZIZ;
        C1C7U.LIZ("TarsEngineNode@1d4e.observableEnvReady$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(Boolean.valueOf(((Boolean) obj).booleanValue()), null);
                    C1C7U.LIZIZ("TarsEngineNode@1d4e.observableEnvReady$2");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c099fLIZIZ = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c099fLIZIZ = C090F.LIZIZ();
            C0Z03 c0z03 = this.LLILLL;
            InterfaceC882520Yji interfaceC882520Yji = new InterfaceC882520Yji() { // from class: X.0Yjr
                @Override // X.InterfaceC882520Yji
                public final void LIZIZ(Map<String, ? extends Object> map) {
                }

                @Override // X.InterfaceC882520Yji
                public final void LIZ(C892820Z0u c892820Z0u) {
                    c099fLIZIZ.LJJJJJ(c892820Z0u);
                }

                @Override // X.InterfaceC882520Yji
                public final void onSuccess(Object obj2) {
                    c099fLIZIZ.LJIIZILJ(Boolean.TRUE);
                }
            };
            this.LL = c099fLIZIZ;
            this.LLILLJJLI = 1;
            if (c0z03.LIZIZ(interfaceC882520Yji, this) == objLJFF) {
                C1C7U.LIZIZ("TarsEngineNode@1d4e.observableEnvReady$2");
                return objLJFF;
            }
        }
        C453401pc c453401pc = new C453401pc(c099fLIZIZ, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        obj = C099A.LIZIZ(10000L, c453401pc, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("TarsEngineNode@1d4e.observableEnvReady$2");
            return objLJFF;
        }
        Pair pair2 = new Pair(Boolean.valueOf(((Boolean) obj).booleanValue()), null);
        C1C7U.LIZIZ("TarsEngineNode@1d4e.observableEnvReady$2");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

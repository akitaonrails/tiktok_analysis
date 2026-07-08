package X;

import Y.AgS101S1100000_9;
import Y.AgS167S0300000_9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.SeaContentCommunication$subscribeEvent$job$1", f = "SeaContentCommunication.kt", l = {77}, m = "invokeSuspend")
public final class C598860NeG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C599010NeV LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ Function2<InterfaceC598890NeJ, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598860NeG(C599010NeV c599010NeV, String str, Object obj, Function2<? super InterfaceC598890NeJ, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C598860NeG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c599010NeV;
        this.LLILLL = str;
        this.LLILZ = obj;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598860NeG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaContentCommunication@2638.subscribeEvent$job$1");
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
            C599010NeV c599010NeV = this.LLILLJJLI;
            final AnonymousClass0950 anonymousClass0950 = c599010NeV.LJII;
            final String str = this.LLILLL;
            InterfaceC346201Wa<InterfaceC598890NeJ> interfaceC346201Wa = new InterfaceC346201Wa<InterfaceC598890NeJ>() { // from class: X.0NeH
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super InterfaceC598890NeJ> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = anonymousClass0950.collect(new AgS101S1100000_9(interfaceC346701Wf, str, 1), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS167S0300000_9 agS167S0300000_9 = new AgS167S0300000_9(c599010NeV, this.LLILZ, this.LLILZIL, 2);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS167S0300000_9, this) == objLJFF) {
                C1C7U.LIZIZ("SeaContentCommunication@2638.subscribeEvent$job$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaContentCommunication@2638.subscribeEvent$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

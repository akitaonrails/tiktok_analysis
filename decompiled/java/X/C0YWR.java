package X;

import Y.AgS295S0100000_14;
import com.bytedance.tts.pigeon.paas.components.api.BizAccountStateComponentApi;
import com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YWR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent$onComponentCreateEvent$1", f = "PigeonIMLogicComponent.kt", l = {51}, m = "invokeSuspend")
public final class C0YWR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonIMLogicComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YWR(PigeonIMLogicComponent pigeonIMLogicComponent, InterfaceC1364105Vn<? super C0YWR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonIMLogicComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YWR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<Boolean> c05ydLJJJ;
        C1C7U.LIZ("PigeonIMLogicComponent@e81b.onComponentCreateEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BizAccountStateComponentApi bizAccountStateComponentApi = (BizAccountStateComponentApi) C0YXD.LIZLLL(this.LLILLJJLI.LJJJJLL(), C13LE.LIZ(BizAccountStateComponentApi.class));
            if (bizAccountStateComponentApi != null && (c05ydLJJJ = bizAccountStateComponentApi.LJJJ()) != null) {
                AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 3);
                this.LL = 1;
                if (c05ydLJJJ.collect(agS295S0100000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("PigeonIMLogicComponent@e81b.onComponentCreateEvent$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PigeonIMLogicComponent@e81b.onComponentCreateEvent$1");
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

package X;

import Y.AgS289S0100000_8;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent$onCreate$2$1", f = "AIGCGenerationComponent.kt", l = {195}, m = "invokeSuspend")
public final class C544850LYl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCGenerationComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544850LYl(AIGCGenerationComponent aIGCGenerationComponent, InterfaceC1364105Vn<? super C544850LYl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCGenerationComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544850LYl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C385670FAf<a> c385670FAfPi2;
        a aVarLIZJ;
        C385670FAf<Boolean> c385670FAfSK0;
        InterfaceC346201Wa interfaceC346201WaLIZ;
        C1C7U.LIZ("AIGCGenerationComponent@e333.onCreate$2$1");
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
            InterfaceC1647420syK recordAdapterApi = this.LLILLJJLI.getRecordAdapterApi();
            if (recordAdapterApi != null && (c385670FAfPi2 = recordAdapterApi.pi2()) != null && (aVarLIZJ = c385670FAfPi2.LIZJ()) != null && (c385670FAfSK0 = aVarLIZJ.sK0()) != null && (interfaceC346201WaLIZ = C540970LJn.LIZ(c385670FAfSK0)) != null) {
                AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 33);
                this.LL = 1;
                if (interfaceC346201WaLIZ.collect(agS289S0100000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("AIGCGenerationComponent@e333.onCreate$2$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCGenerationComponent@e333.onCreate$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

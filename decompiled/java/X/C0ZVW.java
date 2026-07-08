package X;

import Y.AgS203S0200000_14;
import com.ss.android.ugc.aweme.dynamic.card.api.ability.DynamicCardPreserveDataAbility;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZVW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot$onBind$1", f = "DynamicCardProtocol.kt", l = {374}, m = "invokeSuspend")
public final class C0ZVW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DynamicCardReusedUISlot LLILLJJLI;
    public final /* synthetic */ InterfaceC900060ZSq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZVW(DynamicCardReusedUISlot dynamicCardReusedUISlot, InterfaceC900060ZSq interfaceC900060ZSq, InterfaceC1364105Vn<? super C0ZVW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dynamicCardReusedUISlot;
        this.LLILLL = interfaceC900060ZSq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZVW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<Map<String, C2181808gi>> interfaceC346201WaRc0;
        C1C7U.LIZ("DynamicCardReusedUISlot@db04.onBind$1");
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
            DynamicCardPreserveDataAbility dynamicCardPreserveDataAbility = (DynamicCardPreserveDataAbility) this.LLILLJJLI.LLJZIJLIL.getValue();
            if (dynamicCardPreserveDataAbility != null && (interfaceC346201WaRc0 = dynamicCardPreserveDataAbility.rc0()) != null) {
                AgS203S0200000_14 agS203S0200000_14 = new AgS203S0200000_14(this.LLILLL, this.LLILLJJLI, 3);
                this.LL = 1;
                if (interfaceC346201WaRc0.collect(agS203S0200000_14, this) == objLJFF) {
                    C1C7U.LIZIZ("DynamicCardReusedUISlot@db04.onBind$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicCardReusedUISlot@db04.onBind$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

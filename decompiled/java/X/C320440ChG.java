package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0ChG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$processSchemaFromInbox$4$1", f = "TakoServiceImpl.kt", l = {1908}, m = "invokeSuspend")
public final class C320440ChG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320440ChG(String str, InterfaceC1364105Vn<? super C320440ChG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320440ChG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl@d56d.processSchemaFromInbox$4$1");
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
            C1863400yag c1863400yag = C1863400yag.LIZ;
            C844470XAv.LIZ.getClass();
            C1863380yae c1863380yaeLIZIZ = C1863400yag.LIZIZ(c1863400yag, C844470XAv.LIZ(), AFwS190S0000000_4.get$arr$(6003), null, null, null, null, null, 1L, 1, 0, 0, false, false, this.LLILLJJLI, new SubConversationEntranceInfo(null, this.LLILLJJLI, null, C2286608xc.LJ(4)), AFwS232S0000000_4.get$arr$(275), false, null, 408828);
            this.LL = 1;
            if (C1863380yae.LJIJJ(c1863380yaeLIZIZ, true, false, false, 0, null, true, null, this, 189) == objLJFF) {
                C1C7U.LIZIZ("TakoServiceImpl@d56d.processSchemaFromInbox$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl@d56d.processSchemaFromInbox$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

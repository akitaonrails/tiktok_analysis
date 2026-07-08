package X;

import com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent$refreshPigeonAuthInfo$2", f = "PigeonIMLogicComponent.kt", l = {132}, m = "invokeSuspend")
public final class C317680Cco extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonIMLogicComponent LLILLJJLI;
    public final /* synthetic */ C0YWT LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317680Cco(PigeonIMLogicComponent pigeonIMLogicComponent, C0YWT c0ywt, InterfaceC1364105Vn<? super C317680Cco> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonIMLogicComponent;
        this.LLILLL = c0ywt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317680Cco(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonIMLogicComponent@e81b.refreshPigeonAuthInfo$2");
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
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLILZLL;
            C0YWT c0ywt = this.LLILLL;
            this.LL = 1;
            c2252321DDq.setValue(c0ywt);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("PigeonIMLogicComponent@e81b.refreshPigeonAuthInfo$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PigeonIMLogicComponent@e81b.refreshPigeonAuthInfo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

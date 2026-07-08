package X;

import Y.AgS162S0300000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.view.TakoAIVideoChatListKt$rememberFakeDragRelayState$1$1", f = "TakoAIVideoChatList.kt", l = {224}, m = "invokeSuspend")
public final class C1368605Xg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1420105h9 LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;
    public final /* synthetic */ Function0<InterfaceC1368705Xh> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1368605Xg(InterfaceC1420105h9 interfaceC1420105h9, C05P0<Boolean> c05p0, Function0<? extends InterfaceC1368705Xh> function0, InterfaceC1364105Vn<? super C1368605Xg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1420105h9;
        this.LLILZ = c05p0;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1368605Xg c1368605Xg = new C1368605Xg(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1368605Xg.LLILLJJLI = obj;
        return c1368605Xg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoChatListKt@fa37.rememberFakeDragRelayState$1$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLL, 966));
            AgS162S0300000_2 agS162S0300000_2 = new AgS162S0300000_2(this.LLILZ, this.LLILZIL, interfaceC497601wk, 2);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS162S0300000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoChatListKt@fa37.rememberFakeDragRelayState$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoChatListKt@fa37.rememberFakeDragRelayState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

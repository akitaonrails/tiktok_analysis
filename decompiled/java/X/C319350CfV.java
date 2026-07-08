package X;

import Y.AgS285S0100000_4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.collapse.SkylightCollapseController$observeStateForMiniAvatar$1", f = "SkylightCollapseController.kt", l = {238}, m = "invokeSuspend")
public final class C319350CfV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1599840rja LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319350CfV(C1599840rja c1599840rja, InterfaceC1364105Vn<? super C319350CfV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1599840rja;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319350CfV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightCollapseController@ff88.observeStateForMiniAvatar$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1599840rja c1599840rja = this.LLILLJJLI;
            C2252321DDq c2252321DDq = c1599840rja.LJIIIZ;
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(c1599840rja, 19);
            this.LL = 1;
            if (c2252321DDq.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("SkylightCollapseController@ff88.observeStateForMiniAvatar$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

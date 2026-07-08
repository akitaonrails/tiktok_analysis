package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.ChangeRegionClient$fetchEntranceInfoBackground$1$info$1", f = "ChangeRegionClient.kt", l = {120}, m = "invokeSuspend")
public final class C1703270uQP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1703300uQS<? extends C1238730iL9>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1703280uQQ<? extends C1238730iL9> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703270uQP(InterfaceC1703280uQQ<? extends C1238730iL9> interfaceC1703280uQQ, InterfaceC1364105Vn<? super C1703270uQP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1703280uQQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703270uQP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1$info$1");
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
            InterfaceC1703280uQQ<? extends C1238730iL9> interfaceC1703280uQQ = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC1703280uQQ.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1$info$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1$info$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1703300uQS<? extends C1238730iL9>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Ndn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.SeaContentCommunication$publishEvent$2", f = "SeaContentCommunication.kt", l = {139}, m = "invokeSuspend")
public final class C598570Ndn extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C599010NeV LLILLJJLI;
    public final /* synthetic */ InterfaceC598890NeJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598570Ndn(C599010NeV c599010NeV, InterfaceC598890NeJ interfaceC598890NeJ, InterfaceC1364105Vn<? super C598570Ndn> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c599010NeV;
        this.LLILLL = interfaceC598890NeJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598570Ndn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaContentCommunication@2638.publishEvent$2");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LJI;
            InterfaceC598890NeJ interfaceC598890NeJ = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(interfaceC598890NeJ, this) == objLJFF) {
                C1C7U.LIZIZ("SeaContentCommunication@2638.publishEvent$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaContentCommunication@2638.publishEvent$2");
        return unit;
    }
}

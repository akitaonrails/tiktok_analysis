package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.144t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.channel.TakoWsClient$handleTakoPageEnter$1", f = "TakoWsClient.kt", l = {177, 179}, m = "invokeSuspend")
public final class C202069144t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202069144t(TakoEnterParams takoEnterParams, InterfaceC1364105Vn<? super C202069144t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C202069144t(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoWsClient@7403.handleTakoPageEnter$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoWsClient@7403.handleTakoPageEnter$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoWsClient@7403.handleTakoPageEnter$1");
                return objLJFF;
            }
        }
        boolean z = C14FL.LIZ;
        C14FL.LIZJ(this.LLILLJJLI);
        C861640Xr8 c861640Xr8 = C14FL.LIZLLL;
        if (c861640Xr8 != null) {
            final TakoEnterParams takoEnterParams = this.LLILLJJLI;
            InterfaceC346701Wf<? super Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.144u
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    ((Number) obj2).intValue();
                    boolean z2 = C14FL.LIZ;
                    C14FL.LIZJ(takoEnterParams);
                    return Unit.LIZ;
                }
            };
            this.LL = 2;
            if (c861640Xr8.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("TakoWsClient@7403.handleTakoPageEnter$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoWsClient@7403.handleTakoPageEnter$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

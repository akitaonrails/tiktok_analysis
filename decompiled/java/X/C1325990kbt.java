package X;

import com.ss.android.ugc.aweme.ecommerce.image.resource.EcOperationResourceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS421S0200000_20;
import njp.a;

/* JADX INFO: renamed from: X.0kbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.image.resource.EcOperationResourceTask$execute$2", f = "EcOperationResourceTask.kt", l = {42}, m = "invokeSuspend")
public final class C1325990kbt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1326020kbw LLILLL;
    public final /* synthetic */ EcOperationResourceData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325990kbt(long j, C1326020kbw c1326020kbw, EcOperationResourceData ecOperationResourceData, InterfaceC1364105Vn<? super C1325990kbt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1326020kbw;
        this.LLILZ = ecOperationResourceData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1325990kbt(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcOperationResourceTask@e0fb.execute$2");
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
            long j = this.LLILLJJLI;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("EcOperationResourceTask@e0fb.execute$2");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.getClass();
        EcOperationResourceData ecOperationResourceData = C1325970kbr.LIZ;
        C1528200ps2.LIZ(new AwS421S0200000_20(this.LLILLL, this.LLILZ, 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcOperationResourceTask@e0fb.execute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

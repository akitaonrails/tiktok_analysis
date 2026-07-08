package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17sD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver$parseOecInitData$1", f = "UsEcommerceRoomLifecycleObserver.kt", l = {}, m = "invokeSuspend")
public final class C21165517sD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function1<InterfaceC497601wk, Unit> LLILLJJLI;
    public final /* synthetic */ OecInitData LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21165517sD(Function1<? super InterfaceC497601wk, Unit> function1, OecInitData oecInitData, Long l, boolean z, InterfaceC1364105Vn<? super C21165517sD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = oecInitData;
        this.LLILZ = l;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21165517sD c21165517sD = new C21165517sD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c21165517sD.LL = obj;
        return c21165517sD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsEcommerceRoomLifecycleObserver@6929.parseOecInitData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.invoke((InterfaceC497601wk) this.LL);
        OecInitData oecInitData = this.LLILLL;
        int i = oecInitData.productNum;
        int i2 = oecInitData.displayProductNum;
        if (i > 0 || i2 > 0) {
            C21196417xC.LIZIZ(this.LLILZ, false, this.LLILZIL);
        }
        int i3 = C21197617xO.LIZ;
        C21197617xO.LIZ = Math.max(i, i2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsEcommerceRoomLifecycleObserver@6929.parseOecInitData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

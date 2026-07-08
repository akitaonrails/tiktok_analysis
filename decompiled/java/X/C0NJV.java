package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shorttouch.ShortTouchController$refreshShortTouchItems$1$1", f = "ShortTouchController.kt", l = {414}, m = "invokeSuspend")
public final class C0NJV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1741600vQE LLILLL;
    public final /* synthetic */ ECShortItemRefreshMessage LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJV(long j, C1741600vQE c1741600vQE, ECShortItemRefreshMessage eCShortItemRefreshMessage, boolean z, InterfaceC1364105Vn<? super C0NJV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1741600vQE;
        this.LLILZ = eCShortItemRefreshMessage;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShortTouchController@79c8.refreshShortTouchItems$1$1");
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
            SystemClock.elapsedRealtime();
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ShortTouchController@79c8.refreshShortTouchItems$1$1");
                return objLJFF;
            }
        }
        this.LLILLL.LIZJ(this.LLILZ, this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShortTouchController@79c8.refreshShortTouchItems$1$1");
        return unit;
    }
}

package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.IncentivePreRewardUtilsKt$handleHeartMeUGTaskStatusChange$2", f = "IncentivePreRewardUtils.kt", l = {132}, m = "invokeSuspend")
public final class C440301nV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C1134410fct LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440301nV(Activity activity, C1134410fct c1134410fct, InterfaceC1364105Vn<? super C440301nV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = c1134410fct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440301nV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IncentivePreRewardUtilsKt@772.handleHeartMeUGTaskStatusChange$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleHeartMeUGTaskStatusChange$2");
                return objLJFF;
            }
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.c9i);
        c1389890mGx.LJIIJ(C497740JfY.LJIIL(2131755619, (int) this.LLILLL.LJIIIZ().LIZ, C2286608xc.LJ((int) this.LLILLL.LJIIIZ().LIZ)));
        C100U.LIZ(c1389890mGx);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentivePreRewardUtilsKt@772.handleHeartMeUGTaskStatusChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

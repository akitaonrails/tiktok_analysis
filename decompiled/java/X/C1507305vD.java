package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteSensorConfigProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteSensorConfigProvider$provideCustomEvents$1$1$invoke$2", f = "FootNoteSensorConfigProvider.kt", l = {}, m = "invokeSuspend")
public final class C1507305vD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1387205bq>, Object> {
    public final /* synthetic */ FootNoteSensorConfigProvider LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507305vD(FootNoteSensorConfigProvider footNoteSensorConfigProvider, String str, InterfaceC1364105Vn<? super C1507305vD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = footNoteSensorConfigProvider;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507305vD(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        C1C7U.LIZ("FootNoteSensorConfigProvider@c07c.provideCustomEvents$1$1$invoke$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            FootNoteSensorConfigProvider footNoteSensorConfigProvider = this.LL;
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - footNoteSensorConfigProvider.LLILLJJLI >= footNoteSensorConfigProvider.LL) {
                footNoteSensorConfigProvider.LLILLJJLI = jUptimeMillis;
                SmartRouter.buildRoute(activityLIZIZ, this.LLILLJJLI).open();
            }
            C1387205bq c1387205bq = new C1387205bq(null);
            C1C7U.LIZIZ("FootNoteSensorConfigProvider@c07c.provideCustomEvents$1$1$invoke$2");
            return c1387205bq;
        }
        C1387205bq c1387205bq2 = new C1387205bq(null);
        C1C7U.LIZIZ("FootNoteSensorConfigProvider@c07c.provideCustomEvents$1$1$invoke$2");
        return c1387205bq2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1387205bq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

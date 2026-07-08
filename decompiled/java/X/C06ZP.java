package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.report.ReportUtils$sendReportV2$1", f = "ReportUtils.kt", l = {}, m = "invokeSuspend")
public final class C06ZP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ InterfaceC1755906uD LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ C912520Zr0 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZP(Activity activity, InterfaceC1755906uD interfaceC1755906uD, C869590Y9l c869590Y9l, C912520Zr0 c912520Zr0, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = interfaceC1755906uD;
        this.LLILLL = z;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = c912520Zr0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZP(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LifecycleCoroutineScope lifecycleScope;
        C1C7U.LIZ("ReportUtils@d61.sendReportV2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C06ZQ(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, null, this.LLILLL), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReportUtils@d61.sendReportV2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

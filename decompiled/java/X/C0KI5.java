package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageMultiMonthAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KI5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KI5 extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ SubPackageMultiMonthAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KI5(SubPackageMultiMonthAssem subPackageMultiMonthAssem) {
        super(1);
        this.LL = subPackageMultiMonthAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        Function0<Unit> function0;
        C513700KCq c513700KCqIp = this.LL.ip();
        if (c513700KCqIp != null && (function0 = c513700KCqIp.LLJILLL) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}

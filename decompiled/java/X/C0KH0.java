package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageMultiMonthAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KH0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KH0 extends C09AY implements Function2<UIAssem, C291001Au<? extends EnumC514890KHf>, Unit> {
    public final /* synthetic */ SubPackageMultiMonthAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KH0(SubPackageMultiMonthAssem subPackageMultiMonthAssem) {
        super(2);
        this.LL = subPackageMultiMonthAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends EnumC514890KHf> c291001Au) {
        EnumC514890KHf enumC514890KHf;
        C513700KCq c513700KCqIp;
        Function0<Unit> function0;
        C291001Au<? extends EnumC514890KHf> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (enumC514890KHf = (EnumC514890KHf) c291001Au2.LIZ) != null && C514880KHe.LIZ[enumC514890KHf.ordinal()] == 1 && (c513700KCqIp = this.LL.ip()) != null && (function0 = c513700KCqIp.LLJILLL) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}

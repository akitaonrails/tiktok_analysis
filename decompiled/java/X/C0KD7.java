package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageAbnormalSubStatusAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KD7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KD7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPackageAbnormalSubStatusAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KD7(SubPackageAbnormalSubStatusAssem subPackageAbnormalSubStatusAssem) {
        super(0);
        this.LL = subPackageAbnormalSubStatusAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0;
        C513700KCq c513700KCqHp = this.LL.hp();
        if (c513700KCqHp != null && (function0 = c513700KCqHp.LLJILLL) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}

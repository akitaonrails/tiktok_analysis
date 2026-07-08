package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KD8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KD8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPackagePageSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KD8(SubPackagePageSheet subPackagePageSheet) {
        super(0);
        this.LL = subPackagePageSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.close(1);
        return Unit.LIZ;
    }
}

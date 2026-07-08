package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJ8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPackagePageDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KJ8(SubPackagePageDialog subPackagePageDialog) {
        super(0);
        this.LL = subPackagePageDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.dismiss();
        return Unit.LIZ;
    }
}

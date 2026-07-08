package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KHY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KHY extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ SubPackagePageDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KHY(SubPackagePageDialog subPackagePageDialog) {
        super(1);
        this.LL = subPackagePageDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        if (this.LL.isShowing() && Intrinsics.LJFF(str, this.LL.LLIZ.LIZ)) {
            this.LL.dismiss();
        }
        return Unit.LIZ;
    }
}

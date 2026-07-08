package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KC2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0KC2 extends C2217421BqW implements Function2<String, Boolean, Unit> {
    public C0KC2(Object obj) {
        super(2, obj, SubPackagePageSheet.class, "updateSheetFallbackState", "updateSheetFallbackState(Ljava/lang/String;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((SubPackagePageSheet) this.receiver).kS(str, zBooleanValue);
        return Unit.LIZ;
    }
}

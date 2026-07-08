package X;

import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591400rVy extends C09AY implements Function0<Integer> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591400rVy(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(ViewConfiguration.get(this.LL).getScaledPagingTouchSlop());
    }
}

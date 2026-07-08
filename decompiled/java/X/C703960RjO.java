package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703960RjO extends C09AY implements Function0<Integer> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703960RjO(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        View viewLIZ = C703990RjR.LIZ(this.LL, false);
        C786410Ut5.LJLLLLLL(0, viewLIZ);
        viewLIZ.measure(0, 0);
        return Integer.valueOf(viewLIZ.getMeasuredWidth());
    }
}

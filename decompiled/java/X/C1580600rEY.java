package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rEY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580600rEY implements Function1<View, Unit> {
    public final Function1<View, Unit> LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1580600rEY(Function1<? super View, Unit> function1) {
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.invoke(view);
        return Unit.LIZ;
    }
}

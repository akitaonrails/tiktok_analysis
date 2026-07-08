package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1663420tO8 {
    public final Function0<Boolean> LL;

    public C1663420tO8(Function0<Boolean> function0) {
        this.LL = function0;
    }

    public final void LIZ(Function0<Unit> function0) {
        if (this.LL.invoke().booleanValue()) {
            function0.invoke();
        }
    }
}

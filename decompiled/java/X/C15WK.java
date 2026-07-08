package X;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15WK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15WK implements Predicate {
    public final /* synthetic */ Function1 LL;

    public C15WK(Function1 function1) {
        this.LL = function1;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return ((Boolean) this.LL.invoke(obj)).booleanValue();
    }
}

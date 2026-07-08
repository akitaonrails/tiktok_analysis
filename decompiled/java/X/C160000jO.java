package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00jO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C160000jO<T> {
    public final Function1<T, Unit> LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    public C160000jO(Function1<? super T, Unit> function1) {
        this.LIZ = function1;
    }
}

package X;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717620SCy<T> implements Iterable<IndexedValue<? extends T>>, C03W4 {
    public final Function0<Iterator<T>> LL;

    @Override // java.lang.Iterable
    public final Iterator<IndexedValue<T>> iterator() {
        return new C717610SCx(this.LL.invoke());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C717620SCy(Function0<? extends Iterator<? extends T>> function0) {
        this.LL = function0;
    }
}

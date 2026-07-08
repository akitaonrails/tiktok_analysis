package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2101808Lg {
    public static final <T, R> R LIZ(WeakReference<T> weakReference, Function1<? super T, ? extends R> function1) {
        T t = weakReference.get();
        if (t != null) {
            return function1.invoke(t);
        }
        return null;
    }
}

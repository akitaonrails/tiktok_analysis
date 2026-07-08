package X;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC727570SgN<T, R> extends InterfaceC20153313tL {
    C1499810p8F getPreloadStrategy(Bundle bundle);

    boolean handleException(Exception exc);

    R preload(Bundle bundle, Function1<? super Class<T>, ? extends T> function1);
}

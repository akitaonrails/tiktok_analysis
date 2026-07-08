package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10Hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19220210Hg {
    public static final <T, M> LiveData<M> LIZ(LiveData<T> liveData, final Function1<? super T, ? extends M> function1) {
        return Transformations.map(liveData, new InterfaceC2287108xh() { // from class: X.10Hh
            @Override // X.InterfaceC2287108xh
            public final Object apply(Object obj) {
                return function1.invoke(obj);
            }
        });
    }
}

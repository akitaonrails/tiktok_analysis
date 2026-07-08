package X;

import androidx.lifecycle.MutableLiveData;
import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03nF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC948303nF implements Closeable {
    public final MutableLiveData<Object> LL;
    public final MutableLiveData LLILLJJLI;
    public final C01GW LLILLL;

    public abstract <T> Function1<T, T> LIZ(T t);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C23118094a.LIZJ(((InterfaceC497601wk) this.LLILLL.getValue()).getCoroutineContext(), null);
    }

    public AbstractC948303nF() {
        MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(142));
    }

    public final <T> void LIZIZ(C948403nG<T> c948403nG, Function1<? super T, ? extends T> function1) {
        Function1<? super T, ? extends T> function1LIZ = LIZ(function1.invoke(c948403nG.LIZ));
        if (C08L8.LIZ()) {
            c948403nG.LIZ(function1LIZ);
        } else {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLL.getValue(), null, null, new C948203nE(c948403nG, function1LIZ, null), 3);
        }
    }

    public final <T> void LIZLLL(C948403nG<T> c948403nG, Function1<? super T, ? extends T> function1) {
        Function1<? super T, ? extends T> function1LIZ = LIZ(function1.invoke(c948403nG.LIZ));
        if (C08L8.LIZ()) {
            c948403nG.LIZ(function1LIZ);
            this.LL.setValue(0);
        } else {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLL.getValue(), null, null, new C948103nD(c948403nG, function1LIZ, this, null), 3);
        }
    }
}

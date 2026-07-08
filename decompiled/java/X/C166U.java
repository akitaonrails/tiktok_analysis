package X;

import X.InterfaceC340040DUs;
import android.os.Looper;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.166U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C166U<A, T extends InterfaceC340040DUs> implements InterfaceC1731706qJ<A, T> {
    public final Function1<A, T> LL;
    public T LLILLJJLI;

    public boolean LIZIZ(A a) {
        return true;
    }

    public String LIZJ(A a) {
        return "Host view isn't ready. GeneralViewBindingProperty.isViewInitialized return false";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C166U(Function1<? super A, ? extends T> function1) {
        this.LL = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC340040DUs LIZ(Object obj) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            T t = this.LLILLJJLI;
            if (t == null) {
                if (LIZIZ(obj)) {
                    T tInvoke = this.LL.invoke(obj);
                    this.LLILLJJLI = tInvoke;
                    return tInvoke;
                }
                String strLIZJ = LIZJ(obj);
                strLIZJ.toString();
                throw new IllegalStateException(strLIZJ);
            }
            return t;
        }
        "Get ViewBinding method must be called on the main thread".toString();
        throw new IllegalStateException("Get ViewBinding method must be called on the main thread");
    }

    @Override // X.InterfaceC1731706qJ
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        return LIZ(obj);
    }
}

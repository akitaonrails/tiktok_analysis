package X;

import X.InterfaceC340040DUs;
import android.os.Looper;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.166a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC207198166a<R, VB extends InterfaceC340040DUs> implements InterfaceC1731706qJ<R, VB> {
    public final Function1<R, VB> LL;
    public VB LLILLJJLI;

    public final void LIZ() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.LLILLJJLI = null;
        } else {
            "The method must be called on the main thread".toString();
            throw new IllegalStateException("The method must be called on the main thread");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC207198166a(Function1<? super R, ? extends VB> function1) {
        this.LL = function1;
    }
}

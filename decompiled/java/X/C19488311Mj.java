package X;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19488311Mj<T, U extends Collection<? super T>> extends C11J7<T, U> {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Callable<U> LLILZ;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super U> interfaceC626120Oh8) {
        int i = this.LLILLL;
        int i2 = this.LLILLJJLI;
        if (i == i2) {
            C19488211Mi c19488211Mi = new C19488211Mi(interfaceC626120Oh8, i2, this.LLILZ);
            if (c19488211Mi.LIZ()) {
                this.LL.LIZIZ(c19488211Mi);
                return;
            }
            return;
        }
        this.LL.LIZIZ(new C19495411Pc(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL, this.LLILZ));
    }

    public C19488311Mj(C098D<T> c098d, int i, int i2, Callable<U> callable) {
        super(c098d);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = callable;
    }
}

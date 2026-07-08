package X;

import X.AbstractC666100QAu;
import X.InterfaceC614560O8o;

/* JADX INFO: renamed from: X.0iur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1260870iur<T extends AbstractC666100QAu, K extends InterfaceC614560O8o> implements InterfaceC1526205yG {
    public T LL;
    public K LLILLJJLI;
    public boolean LLILLL = true;

    public void LIZ() {
        this.LLILLJJLI = null;
        LJIILJJIL();
    }

    public void LJIILIIL() {
    }

    @Override // X.InterfaceC1526205yG
    public void onFailed(Exception exc) {
    }

    @Override // X.InterfaceC1526205yG
    public void onSuccess() {
    }

    public final boolean LJIIIZ() {
        return this.LLILLJJLI != null;
    }

    public final boolean LJIIL() {
        T t = this.LL;
        return t != null && t.isLoading();
    }

    public void LJIILJJIL() {
        T t = this.LL;
        if (t != null) {
            t.clearNotifyListener(this);
            this.LL = null;
        }
    }

    public boolean LIZJ(Object... objArr) {
        if (this.LL == null || ((LJIIL() && this.LLILLL) || !this.LL.sendRequest(objArr))) {
            return false;
        }
        LJIILIIL();
        return true;
    }

    public void LJIIJ(T t) {
        this.LL = t;
        t.addNotifyListener(this);
    }

    public void LJIIJJI(K k) {
        this.LLILLJJLI = k;
    }
}

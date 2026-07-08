package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12pW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19874812pW<E> extends AbstractC19877812q0<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public final E LL;
    public final int LLILLJJLI;

    @Override // X.InterfaceC19878012q2
    public final int getCount() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19878012q2
    public final E getElement() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19874812pW(int i, Object obj) {
        this.LL = obj;
        this.LLILLJJLI = i;
        C19863912nl.LIZIZ(i, "count");
    }
}

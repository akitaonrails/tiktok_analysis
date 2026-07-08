package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0wOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1779180wOq<T> extends AbstractC1779190wOr implements Serializable {
    public static final long serialVersionUID = 1;
    public T mValue;

    public C1779180wOq() {
    }

    public T get() {
        return this.mValue;
    }

    public C1779180wOq(T t) {
        this.mValue = t;
    }

    public void set(T t) {
        if (t != this.mValue) {
            this.mValue = t;
            notifyChange();
        }
    }

    public C1779180wOq(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }
}

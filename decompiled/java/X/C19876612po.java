package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.12po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19876612po implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] LL;

    public Object readResolve() {
        return AbstractC19875512pd.copyOf(this.LL);
    }

    public C19876612po(Object[] objArr) {
        this.LL = objArr;
    }
}

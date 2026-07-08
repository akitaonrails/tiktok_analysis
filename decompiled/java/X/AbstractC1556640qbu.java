package X;

import X.InterfaceC19211810Ea;
import java.util.List;

/* JADX INFO: renamed from: X.0qbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1556640qbu<T extends InterfaceC19211810Ea> implements InterfaceC0148002o, InterfaceC1556650qbv<T> {
    public final List<T> LL;

    public List<T> getItems() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1556640qbu(List<? extends T> list) {
        this.LL = list;
    }
}

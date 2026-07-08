package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19864212no<V> implements InterfaceC1456340o08<List<V>>, Serializable {
    public final int LL;

    @Override // X.InterfaceC1456340o08
    public final Object get() {
        return new ArrayList(this.LL);
    }

    public C19864212no(int i) {
        C19863912nl.LIZIZ(i, "expectedValuesPerKey");
        this.LL = i;
    }
}

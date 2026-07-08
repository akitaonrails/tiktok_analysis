package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19796112cp implements Iterator<InterfaceC19797112cz> {
    public final /* synthetic */ Iterator LL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC19797112cz next() {
        return new C19797512d3((String) this.LL.next());
    }

    public C19796112cp(Iterator it2) {
        this.LL = it2;
    }
}

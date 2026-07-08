package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.18hD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21352118hD implements Iterable<C21148417pS> {
    public final String LL;

    @Override // java.lang.Iterable
    public final Iterator<C21148417pS> iterator() {
        return new C21352018hC(this);
    }

    public C21352118hD(String str) {
        this.LL = str;
    }
}

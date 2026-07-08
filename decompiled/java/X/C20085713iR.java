package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.13iR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20085713iR implements Comparator<Comparable<? super Object>> {
    public static final C20085713iR LL = new C20085713iR();

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C20085813iS.LL;
    }

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return comparable.compareTo(comparable2);
    }
}

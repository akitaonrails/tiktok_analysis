package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.13iS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20085813iS implements Comparator<Comparable<? super Object>> {
    public static final C20085813iS LL = new C20085813iS();

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C20085713iR.LL;
    }

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return comparable2.compareTo(comparable);
    }
}

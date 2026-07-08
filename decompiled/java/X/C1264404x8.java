package X;

/* JADX INFO: renamed from: X.04x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264404x8 {
    public C1264404x8(String str) {
        boolean z;
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {str, 23};
        if (z) {
        } else {
            throw new IllegalArgumentException(C786410Ut5.j4("tag \"%s\" is longer than the %d character maximum", objArr));
        }
    }
}

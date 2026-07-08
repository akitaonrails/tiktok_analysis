package X;

/* JADX INFO: renamed from: X.0Wmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833460Wmm {
    public int LIZ = 1;

    public final void LIZ(Object obj) {
        int iHashCode;
        int i = this.LIZ * 31;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        this.LIZ = i + iHashCode;
    }
}

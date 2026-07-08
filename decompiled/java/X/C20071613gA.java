package X;

/* JADX INFO: renamed from: X.13gA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20071613gA {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C20071613gA) || i != ((C20071613gA) obj).LIZ) {
            return false;
        }
        return true;
    }
}

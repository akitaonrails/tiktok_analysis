package X;

/* JADX INFO: renamed from: X.0uBA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693820uBA {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1693820uBA) || i != ((C1693820uBA) obj).LIZ) {
            return false;
        }
        return true;
    }
}

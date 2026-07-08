package X;

/* JADX INFO: renamed from: X.14Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20279814Wu {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C20279814Wu) || i != ((C20279814Wu) obj).LIZ) {
            return false;
        }
        return true;
    }
}

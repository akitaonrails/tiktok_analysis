package X;

/* JADX INFO: renamed from: X.0HUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441860HUi implements InterfaceC441910HUn {
    public final EnumC441840HUg LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C441860HUi) && this.LIZ == ((C441860HUi) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Emoji(emojiBtnUI=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C441860HUi(EnumC441840HUg enumC441840HUg) {
        this.LIZ = enumC441840HUg;
    }
}

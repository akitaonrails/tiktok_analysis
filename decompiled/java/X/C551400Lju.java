package X;

/* JADX INFO: renamed from: X.0Lju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551400Lju extends AbstractC551420Ljw {
    public final EnumC551370Ljr LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C551400Lju) && this.LIZ == ((C551400Lju) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarUploadClickEvent(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551400Lju(EnumC551370Ljr enumC551370Ljr) {
        this.LIZ = enumC551370Ljr;
    }
}

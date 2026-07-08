package X;

/* JADX INFO: renamed from: X.0GkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424230GkH extends AbstractC424240GkI {
    public final EnumC429160GsE LL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C424230GkH) && this.LL == ((C424230GkH) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmallEmojiSectionTitleItem(sectionType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C424230GkH(EnumC429160GsE enumC429160GsE) {
        this.LL = enumC429160GsE;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C424230GkH) && ((C424230GkH) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }
}

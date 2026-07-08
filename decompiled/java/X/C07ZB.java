package X;

/* JADX INFO: renamed from: X.07ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZB implements InterfaceC1891350zJl {
    public final EnumC618850OPb LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07ZB) && this.LL == ((C07ZB) obj).LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinShareMusicSectionItem(sectionType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZB(EnumC618850OPb enumC618850OPb) {
        this.LL = enumC618850OPb;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C07ZB) || ((C07ZB) interfaceC1891350zJl).LL != this.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C07ZB) || ((C07ZB) interfaceC1891350zJl).LL != this.LL) {
            return false;
        }
        return true;
    }
}

package X;

/* JADX INFO: renamed from: X.0bxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993570bxj extends AbstractC993580bxk {
    public final EnumC993550bxh LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C993570bxj) && this.LL == ((C993570bxj) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SectionHeaderItem(sectionType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C993570bxj(EnumC993550bxh enumC993550bxh) {
        this.LL = enumC993550bxh;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C993570bxj) && ((C993570bxj) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }
}

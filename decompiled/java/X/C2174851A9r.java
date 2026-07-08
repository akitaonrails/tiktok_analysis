package X;

/* JADX INFO: renamed from: X.1A9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174851A9r implements InterfaceC0148002o {
    public final EnumC2174841A9q LL;
    public final EnumC2174841A9q LLILLJJLI;

    public C2174851A9r() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2174851A9r)) {
            return false;
        }
        C2174851A9r c2174851A9r = (C2174851A9r) obj;
        return this.LL == c2174851A9r.LL && this.LLILLJJLI == c2174851A9r.LLILLJJLI;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        EnumC2174841A9q enumC2174841A9q = this.LLILLJJLI;
        return iHashCode + (enumC2174841A9q == null ? 0 : enumC2174841A9q.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoRelationBtnStateV2(relationButtonCurrentState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", relationButtonPreviousState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2174851A9r(int i) {
        this(EnumC2174841A9q.DEFAULT, null);
    }

    public C2174851A9r(EnumC2174841A9q enumC2174841A9q, EnumC2174841A9q enumC2174841A9q2) {
        this.LL = enumC2174841A9q;
        this.LLILLJJLI = enumC2174841A9q2;
    }
}

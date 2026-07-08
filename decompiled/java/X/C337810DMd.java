package X;

/* JADX INFO: renamed from: X.0DMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337810DMd extends AbstractC337970DMt {
    public final EnumC337830DMf LLILLJJLI;
    public final EnumC337870DMj LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C337810DMd)) {
            return false;
        }
        C337810DMd c337810DMd = (C337810DMd) obj;
        return this.LLILLJJLI == c337810DMd.LLILLJJLI && this.LLILLL == c337810DMd.LLILLL;
    }

    public final int hashCode() {
        return (this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeFlow(newFlow=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", page=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C337810DMd(EnumC337830DMf enumC337830DMf, EnumC337870DMj enumC337870DMj) {
        this.LLILLJJLI = enumC337830DMf;
        this.LLILLL = enumC337870DMj;
    }
}

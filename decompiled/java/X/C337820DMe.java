package X;

/* JADX INFO: renamed from: X.0DMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337820DMe extends AbstractC337970DMt {
    public final EnumC337870DMj LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C337820DMe) && this.LLILLJJLI == ((C337820DMe) obj).LLILLJJLI;
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GoToPage(page=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C337820DMe(EnumC337870DMj enumC337870DMj) {
        this.LLILLJJLI = enumC337870DMj;
    }
}

package X;

/* JADX INFO: renamed from: X.0gAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155500gAu implements InterfaceC0148002o {
    public final boolean LL;
    public final int LLILLJJLI;
    public boolean LLILLL;
    public final int LLILZ;

    public C1155500gAu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155500gAu)) {
            return false;
        }
        C1155500gAu c1155500gAu = (C1155500gAu) obj;
        return this.LL == c1155500gAu.LL && this.LLILLJJLI == c1155500gAu.LLILLJJLI && this.LLILLL == c1155500gAu.LLILLL && this.LLILZ == c1155500gAu.LLILZ;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostGroupChatState(canShowGroupChatIcon=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isGroupChatMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", chatType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155500gAu(int i) {
        this.LL = false;
        this.LLILLJJLI = 0;
        this.LLILLL = false;
        this.LLILZ = 0;
    }
}

package X;

/* JADX INFO: renamed from: X.0OHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616840OHi implements InterfaceC111300bX {
    public final long LL;
    public final long LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C616840OHi)) {
            return false;
        }
        C616840OHi c616840OHi = (C616840OHi) obj;
        return this.LL == c616840OHi.LL && this.LLILLJJLI == c616840OHi.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Y2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSelectEmojiSheetHierarchyData(bbId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bbItemId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C616840OHi(long j, long j2) {
        this.LL = j;
        this.LLILLJJLI = j2;
    }
}

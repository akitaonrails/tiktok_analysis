package X;

/* JADX INFO: renamed from: X.0Sil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729050Sil implements InterfaceC111300bX {
    public final boolean LL;

    public C729050Sil() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C729050Sil) && this.LL == ((C729050Sil) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryViewerListHierarchyData(isFriendsSimpleDetail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C729050Sil(boolean z) {
        this.LL = z;
    }
}

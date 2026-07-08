package X;

/* JADX INFO: renamed from: X.0l94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346560l94 {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1346560l94() {
        this(true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1346560l94)) {
            return false;
        }
        C1346560l94 c1346560l94 = (C1346560l94) obj;
        return this.LIZ == c1346560l94.LIZ && this.LIZIZ == c1346560l94.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowHorizontalEmojiPanelState(showPanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", withAnimation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1346560l94(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}

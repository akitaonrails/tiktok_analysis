package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15Dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20485715Dz {
    public RecyclerView.ViewHolder LIZ;
    public RecyclerView.ViewHolder LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeInfo{oldHolder=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newHolder=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromX=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", toX=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", toY=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20485715Dz(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        this.LIZ = viewHolder;
        this.LIZIZ = viewHolder2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }
}

package X;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0nuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453000nuk {
    public final boolean LIZ;
    public final FilterBean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterBeanOp(isAutoUse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", filter=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isComposerFilter=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", curNodePath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableTextAnim=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", skipOperateTrack=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1453000nuk(boolean z, FilterBean filterBean, boolean z2, String str, boolean z3, int i) {
        boolean z4;
        boolean z5 = z3;
        String str2 = str;
        boolean z6 = (i & 4) != 0 ? false : z2;
        str2 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this(filterBean, str2, z, z6, z4, (i & 32) != 0 ? false : z5);
    }

    public C1453000nuk(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = filterBean;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = z3;
        this.LJFF = z4;
    }
}

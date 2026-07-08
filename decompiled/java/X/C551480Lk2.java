package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551480Lk2 {
    public final C550000Lhe<String> LIZ;
    public final MediaModel LIZIZ;
    public final C0LCS<List<MentionDataItem>> LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551480Lk2)) {
            return false;
        }
        C551480Lk2 c551480Lk2 = (C551480Lk2) obj;
        return Intrinsics.LJFF(this.LIZ, c551480Lk2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c551480Lk2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c551480Lk2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c551480Lk2.LIZLLL) && this.LJ == c551480Lk2.LJ && this.LJFF == c551480Lk2.LJFF;
    }

    public final int hashCode() {
        C550000Lhe<String> c550000Lhe = this.LIZ;
        return ((((((((((c550000Lhe == null ? 0 : c550000Lhe.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewStates(chooseActorText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mediaModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatars=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", videoNeedToken=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showPreviewX=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C551480Lk2(C550000Lhe<String> c550000Lhe, MediaModel mediaModel, C0LCS<? extends List<MentionDataItem>> c0lcs, String str, boolean z, boolean z2) {
        this.LIZ = c550000Lhe;
        this.LIZIZ = mediaModel;
        this.LIZJ = c0lcs;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = z2;
    }

    public static C551480Lk2 LIZ(C551480Lk2 c551480Lk2, MediaModel mediaModel, C0LCS c0lcs, String str, boolean z, boolean z2, int i) {
        C550000Lhe<String> c550000Lhe;
        boolean z3 = z2;
        boolean z4 = z;
        String str2 = str;
        C0LCS c0lcs2 = c0lcs;
        MediaModel mediaModel2 = mediaModel;
        if ((i & 1) != 0) {
            c550000Lhe = c551480Lk2.LIZ;
        } else {
            c550000Lhe = null;
        }
        if ((i & 2) != 0) {
            mediaModel2 = c551480Lk2.LIZIZ;
        }
        if ((i & 4) != 0) {
            c0lcs2 = c551480Lk2.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c551480Lk2.LIZLLL;
        }
        if ((i & 16) != 0) {
            z4 = c551480Lk2.LJ;
        }
        if ((i & 32) != 0) {
            z3 = c551480Lk2.LJFF;
        }
        c551480Lk2.getClass();
        return new C551480Lk2(c550000Lhe, mediaModel2, c0lcs2, str2, z4, z3);
    }
}

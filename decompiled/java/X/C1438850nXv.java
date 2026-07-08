package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438850nXv {
    public final int LIZ;
    public final AVMusic LIZIZ;
    public final Bundle LIZJ;
    public final InterfaceC1455860nzM LIZLLL;
    public final C1439740nZM LJ;
    public final Workspace LJFF;

    public C1438850nXv() {
        this(0, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1438850nXv)) {
            return false;
        }
        C1438850nXv c1438850nXv = (C1438850nXv) obj;
        return this.LIZ == c1438850nXv.LIZ && Intrinsics.LJFF(this.LIZIZ, c1438850nXv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1438850nXv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1438850nXv.LIZLLL) && Intrinsics.LJFF(this.LJ, c1438850nXv.LJ) && Intrinsics.LJFF(this.LJFF, c1438850nXv.LJFF);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        AVMusic aVMusic = this.LIZIZ;
        int iHashCode = (i + (aVMusic == null ? 0 : aVMusic.hashCode())) * 31;
        Bundle bundle = this.LIZJ;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        InterfaceC1455860nzM interfaceC1455860nzM = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (interfaceC1455860nzM == null ? 0 : interfaceC1455860nzM.hashCode())) * 31;
        C1439740nZM c1439740nZM = this.LJ;
        int iHashCode4 = (iHashCode3 + (c1439740nZM == null ? 0 : c1439740nZM.hashCode())) * 31;
        Workspace workspace = this.LJFF;
        return iHashCode4 + (workspace != null ? workspace.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProDraftCompat(draftToEditFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mOldMusicModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", editPreviewApi=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stickerChallengeManager=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", workspace=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1438850nXv(int i, AVMusic aVMusic, Bundle bundle, InterfaceC1455860nzM interfaceC1455860nzM, C1439740nZM c1439740nZM, Workspace workspace) {
        this.LIZ = i;
        this.LIZIZ = aVMusic;
        this.LIZJ = bundle;
        this.LIZLLL = interfaceC1455860nzM;
        this.LJ = c1439740nZM;
        this.LJFF = workspace;
    }
}

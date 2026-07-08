package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;

/* JADX INFO: renamed from: X.0KxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534260KxM {
    public final LivePhotoPreviewMode LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C534260KxM)) {
            return false;
        }
        C534260KxM c534260KxM = (C534260KxM) obj;
        return this.LIZ == c534260KxM.LIZ && this.LIZIZ == c534260KxM.LIZIZ && this.LIZJ == c534260KxM.LIZJ && this.LIZLLL == c534260KxM.LIZLLL;
    }

    public final int hashCode() {
        LivePhotoPreviewMode livePhotoPreviewMode = this.LIZ;
        return ((((((livePhotoPreviewMode == null ? 0 : livePhotoPreviewMode.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoMemoryResult(lastUsedPreviewMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasClickedIcon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", memoryAppliedOnEnter=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", memoryEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C534260KxM(LivePhotoPreviewMode livePhotoPreviewMode, boolean z, boolean z2, boolean z3) {
        this.LIZ = livePhotoPreviewMode;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}

package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;

/* JADX INFO: renamed from: X.0Tr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759640Tr0 {
    public final boolean LIZ;
    public final LivePhotoPreviewMode LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C759640Tr0)) {
            return false;
        }
        C759640Tr0 c759640Tr0 = (C759640Tr0) obj;
        return this.LIZ == c759640Tr0.LIZ && this.LIZIZ == c759640Tr0.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullPagePreviewLivePhotoState(playing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentLiveMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C759640Tr0(LivePhotoPreviewMode livePhotoPreviewMode, boolean z) {
        this.LIZ = z;
        this.LIZIZ = livePhotoPreviewMode;
    }
}

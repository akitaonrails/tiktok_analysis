package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C121500dB {
    public C121500dB() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121500dB)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(false);
        int i = ((iZ2 * 31) + iZ2) * 31;
        int iY2 = C786410Ut5.Y2(0L);
        return (((((i + iY2) * 31) + iY2) * 31) + iY2) * 31 * 31 * 31 * 31;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsumeLoadInput(isLivePhoto=");
        sbLIZ.append(false);
        sbLIZ.append(", trackLivePhotoVideoLoad=");
        sbLIZ.append(false);
        sbLIZ.append(", loadStartMs=");
        sbLIZ.append(0L);
        sbLIZ.append(", imageLoadEndMs=");
        sbLIZ.append(0L);
        sbLIZ.append(", livePhotoVideoLoadEndMs=");
        sbLIZ.append(0L);
        sbLIZ.append(", isImageLoadSuccess=");
        sbLIZ.append(0);
        sbLIZ.append(", livePhotoVideoLoadSuccess=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", errorCode=");
        sbLIZ.append((String) null);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append((String) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

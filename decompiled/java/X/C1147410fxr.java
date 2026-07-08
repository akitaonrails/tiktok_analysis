package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147410fxr {
    public final long LIZ;
    public final String LIZIZ;
    public final ImageModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147410fxr)) {
            return false;
        }
        C1147410fxr c1147410fxr = (C1147410fxr) obj;
        return this.LIZ == c1147410fxr.LIZ && Intrinsics.LJFF(this.LIZIZ, c1147410fxr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1147410fxr.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        ImageModel imageModel = this.LIZJ;
        return iY2 + (imageModel == null ? 0 : imageModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftArtistModel(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147410fxr(long j, String str, ImageModel imageModel) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = imageModel;
    }
}

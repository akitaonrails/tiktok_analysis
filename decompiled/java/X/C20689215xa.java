package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20689215xa extends AbstractC214838195w {
    public final long LIZ;
    public final ImageModel LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20689215xa)) {
            return false;
        }
        C20689215xa c20689215xa = (C20689215xa) obj;
        return this.LIZ == c20689215xa.LIZ && Intrinsics.LJFF(this.LIZIZ, c20689215xa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20689215xa.LIZJ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        ImageModel imageModel = this.LIZIZ;
        return ((iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnPartnerFound(partnerUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20689215xa(long j, String str, ImageModel imageModel) {
        this.LIZ = j;
        this.LIZIZ = imageModel;
        this.LIZJ = str;
    }
}

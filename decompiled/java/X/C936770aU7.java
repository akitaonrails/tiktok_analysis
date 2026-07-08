package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936770aU7 {
    public final long LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public String LJ;
    public ImageModel LJFF;
    public long LJI;
    public final String LJII;
    public boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C936770aU7)) {
            return false;
        }
        C936770aU7 c936770aU7 = (C936770aU7) obj;
        return this.LIZ == c936770aU7.LIZ && Intrinsics.LJFF(this.LIZIZ, c936770aU7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c936770aU7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c936770aU7.LIZLLL) && Intrinsics.LJFF(this.LJ, c936770aU7.LJ) && Intrinsics.LJFF(this.LJFF, c936770aU7.LJFF) && this.LJI == c936770aU7.LJI && Intrinsics.LJFF(this.LJII, c936770aU7.LJII) && this.LJIIIIZZ == c936770aU7.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiHostGuestUser(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", displayId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isEnigma=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C936770aU7(long j, Long l, Long l2, String str, String str2, ImageModel imageModel, long j2, String str3, boolean z) {
        this.LIZ = j;
        this.LIZIZ = l;
        this.LIZJ = l2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = imageModel;
        this.LJI = j2;
        this.LJII = str3;
        this.LJIIIIZZ = z;
    }
}

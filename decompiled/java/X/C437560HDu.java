package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437560HDu {
    public final EnumC437540HDs LIZ;
    public final Integer LIZIZ;
    public final C437570HDv LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final C438960HJe LJIIIZ;

    public C437560HDu() {
        this(null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C437560HDu)) {
            return false;
        }
        C437560HDu c437560HDu = (C437560HDu) obj;
        return this.LIZ == c437560HDu.LIZ && Intrinsics.LJFF(this.LIZIZ, c437560HDu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c437560HDu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c437560HDu.LIZLLL) && this.LJ == c437560HDu.LJ && this.LJFF == c437560HDu.LJFF && this.LJI == c437560HDu.LJI && Intrinsics.LJFF(this.LJII, c437560HDu.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c437560HDu.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c437560HDu.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarCreationStatus(generationStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", failCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", progressInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", successThumbnailUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasReviewed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hasUsed=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isAISelfSideTask=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", socialAvatarPreviewUrl=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", aiSelfPreviewUrl=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", uploadingInfo=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C437560HDu(EnumC437540HDs enumC437540HDs, int i) {
        C437570HDv c437570HDv;
        EnumC437540HDs enumC437540HDs2 = (i & 1) != 0 ? EnumC437540HDs.UNKNOWN : enumC437540HDs;
        if ((i & 4) != 0) {
            c437570HDv = new C437570HDv(0L, 0.0f, 7);
        } else {
            c437570HDv = null;
        }
        this(enumC437540HDs2, null, c437570HDv, null, false, false, false, null, null, null);
    }

    public C437560HDu(EnumC437540HDs enumC437540HDs, Integer num, C437570HDv c437570HDv, String str, boolean z, boolean z2, boolean z3, String str2, String str3, C438960HJe c438960HJe) {
        this.LIZ = enumC437540HDs;
        this.LIZIZ = num;
        this.LIZJ = c437570HDv;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = c438960HJe;
    }

    public static C437560HDu LIZ(C437560HDu c437560HDu, EnumC437540HDs enumC437540HDs, Integer num, C437570HDv c437570HDv, String str, boolean z, boolean z2, boolean z3, String str2, String str3, C438960HJe c438960HJe, int i) {
        C438960HJe c438960HJe2 = c438960HJe;
        String str4 = str3;
        String str5 = str2;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        String str6 = str;
        C437570HDv c437570HDv2 = c437570HDv;
        Integer num2 = num;
        EnumC437540HDs enumC437540HDs2 = enumC437540HDs;
        if ((i & 1) != 0) {
            enumC437540HDs2 = c437560HDu.LIZ;
        }
        if ((i & 2) != 0) {
            num2 = c437560HDu.LIZIZ;
        }
        if ((i & 4) != 0) {
            c437570HDv2 = c437560HDu.LIZJ;
        }
        if ((i & 8) != 0) {
            str6 = c437560HDu.LIZLLL;
        }
        if ((i & 16) != 0) {
            z6 = c437560HDu.LJ;
        }
        if ((i & 32) != 0) {
            z5 = c437560HDu.LJFF;
        }
        if ((i & 64) != 0) {
            z4 = c437560HDu.LJI;
        }
        if ((i & 128) != 0) {
            str5 = c437560HDu.LJII;
        }
        if ((i & 256) != 0) {
            str4 = c437560HDu.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c438960HJe2 = c437560HDu.LJIIIZ;
        }
        c437560HDu.getClass();
        return new C437560HDu(enumC437540HDs2, num2, c437570HDv2, str6, z6, z5, z4, str5, str4, c438960HJe2);
    }
}

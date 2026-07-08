package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g0H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148910g0H {
    public final String LIZ;
    public final ImageModel LIZIZ;
    public final Integer LIZJ;
    public final Long LIZLLL;
    public final EnumC1148880g0E LJ;
    public final Integer LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final Gift.SchemeInfo LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148910g0H)) {
            return false;
        }
        C1148910g0H c1148910g0H = (C1148910g0H) obj;
        return Intrinsics.LJFF(this.LIZ, c1148910g0H.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1148910g0H.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1148910g0H.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1148910g0H.LIZLLL) && this.LJ == c1148910g0H.LJ && Intrinsics.LJFF(this.LJFF, c1148910g0H.LJFF) && this.LJI == c1148910g0H.LJI && this.LJII == c1148910g0H.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1148910g0H.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1148910g0H.LJIIIZ);
    }

    public static C1148910g0H LIZ(C1148910g0H c1148910g0H, EnumC1148880g0E enumC1148880g0E, boolean z, int i) {
        String str;
        ImageModel imageModel;
        Integer num;
        Long l;
        Integer num2;
        boolean z2;
        String str2;
        boolean z3 = z;
        EnumC1148880g0E enumC1148880g0E2 = enumC1148880g0E;
        Gift.SchemeInfo schemeInfo = null;
        if ((i & 1) != 0) {
            str = c1148910g0H.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            imageModel = c1148910g0H.LIZIZ;
        } else {
            imageModel = null;
        }
        if ((i & 4) != 0) {
            num = c1148910g0H.LIZJ;
        } else {
            num = null;
        }
        if ((i & 8) != 0) {
            l = c1148910g0H.LIZLLL;
        } else {
            l = null;
        }
        if ((i & 16) != 0) {
            enumC1148880g0E2 = c1148910g0H.LJ;
        }
        if ((i & 32) != 0) {
            num2 = c1148910g0H.LJFF;
        } else {
            num2 = null;
        }
        if ((i & 64) != 0) {
            z2 = c1148910g0H.LJI;
        } else {
            z2 = false;
        }
        if ((i & 128) != 0) {
            z3 = c1148910g0H.LJII;
        }
        if ((i & 256) != 0) {
            str2 = c1148910g0H.LJIIIIZZ;
        } else {
            str2 = null;
        }
        if ((i & 512) != 0) {
            schemeInfo = c1148910g0H.LJIIIZ;
        }
        c1148910g0H.getClass();
        return new C1148910g0H(str, imageModel, num, l, enumC1148880g0E2, num2, z2, z3, str2, schemeInfo);
    }

    public /* synthetic */ C1148910g0H(String str, ImageModel imageModel, Integer num, Long l, EnumC1148880g0E enumC1148880g0E, Integer num2, boolean z, String str2, Gift.SchemeInfo schemeInfo, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : imageModel, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? 0L : l, enumC1148880g0E, (i & 32) != 0 ? 0 : num2, (i & 64) != 0 ? false : z, false, (i & 256) == 0 ? str2 : "", (i & 512) == 0 ? schemeInfo : null);
    }

    public C1148910g0H(String str, ImageModel imageModel, Integer num, Long l, EnumC1148880g0E enumC1148880g0E, Integer num2, boolean z, boolean z2, String str2, Gift.SchemeInfo schemeInfo) {
        this.LIZ = str;
        this.LIZIZ = imageModel;
        this.LIZJ = num;
        this.LIZLLL = l;
        this.LJ = enumC1148880g0E;
        this.LJFF = num2;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = schemeInfo;
    }
}

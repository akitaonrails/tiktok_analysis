package X;

import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898320ZLy {
    public final LightInteractionEntryConf LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Map<String, String> LJFF;
    public final boolean LJI;
    public final C0ZM0 LJII;
    public final C0C97 LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898320ZLy)) {
            return false;
        }
        C898320ZLy c898320ZLy = (C898320ZLy) obj;
        return Intrinsics.LJFF(this.LIZ, c898320ZLy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c898320ZLy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c898320ZLy.LIZJ) && this.LIZLLL == c898320ZLy.LIZLLL && Intrinsics.LJFF(this.LJ, c898320ZLy.LJ) && Intrinsics.LJFF(this.LJFF, c898320ZLy.LJFF) && this.LJI == c898320ZLy.LJI && Intrinsics.LJFF(this.LJII, c898320ZLy.LJII) && this.LJIIIIZZ == c898320ZLy.LJIIIIZZ && this.LJIIIZ == c898320ZLy.LJIIIZ;
    }

    public C898320ZLy(int i, C0ZM0 c0zm0, C0C97 c0c97, LightInteractionEntryConf lightInteractionEntryConf, String str, String str2, String str3, Map map, boolean z, boolean z2) {
        this.LIZ = lightInteractionEntryConf;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = str3;
        this.LJFF = map;
        this.LJI = z;
        this.LJII = c0zm0;
        this.LJIIIIZZ = c0c97;
        this.LJIIIZ = z2;
    }
}

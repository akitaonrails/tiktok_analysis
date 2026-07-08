package X;

import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737830vK9 {
    public final EffectPackageDataWrapper LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public String LJ;
    public final String LJFF;
    public final String LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public Pair<C1738200vKk, C1738200vKk> LJIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1737830vK9(EffectPackageDataWrapper effectPackageDataWrapper, long j, String str, long j2, String str2, int i) {
        String str3;
        String str4 = str2;
        long j3 = j2;
        String str5 = str;
        long j4 = (i & 2) != 0 ? 0L : j;
        str5 = (i & 4) != 0 ? "" : str5;
        j3 = (i & 8) != 0 ? 0L : j3;
        str4 = (i & 16) != 0 ? "" : str4;
        String str6 = null;
        String str7 = (i & 32) == 0 ? null : "";
        if ((i & 64) != 0) {
            str3 = "publish_effect";
        } else {
            str3 = null;
        }
        if ((i & 128) != 0 && (effectPackageDataWrapper == null || (str6 = effectPackageDataWrapper.publishSource) == null)) {
            if (Intrinsics.LJFF(str4, "shootpage_template")) {
                str6 = "template";
            } else if (Intrinsics.LJFF(str4, "shootpage_draft")) {
                str6 = "draft";
            } else {
                str6 = "new_create";
            }
        }
        this(effectPackageDataWrapper, j4, str5, j3, str7, str3, str6);
    }

    public C1737830vK9(EffectPackageDataWrapper effectPackageDataWrapper, long j, String str, long j2, String str2, String str3, String str4) {
        this.LIZ = effectPackageDataWrapper;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = j2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJIILLIIL = "";
    }
}

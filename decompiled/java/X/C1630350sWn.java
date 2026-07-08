package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630350sWn {
    public final ShortVideoContext LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Pair<Boolean, Boolean>> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final EnumC1448590nnd LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final Integer LJIIIZ;

    public C1630350sWn(ShortVideoContext shortVideoContext, C375830EoP<Boolean> c375830EoP, C375830EoP<Pair<Boolean, Boolean>> c375830EoP2, boolean z, boolean z2, boolean z3, EnumC1448590nnd enumC1448590nnd, String str, String str2, Integer num) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c375830EoP2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = enumC1448590nnd;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = num;
    }

    public static C1630350sWn LIZ(C1630350sWn c1630350sWn, C375830EoP c375830EoP, C375830EoP c375830EoP2, boolean z, boolean z2, boolean z3, EnumC1448590nnd enumC1448590nnd, String str, Integer num, int i) {
        ShortVideoContext shortVideoContext;
        String str2 = str;
        EnumC1448590nnd enumC1448590nnd2 = enumC1448590nnd;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        C375830EoP c375830EoP3 = c375830EoP2;
        Integer num2 = num;
        C375830EoP c375830EoP4 = c375830EoP;
        String str3 = null;
        if ((i & 1) != 0) {
            shortVideoContext = c1630350sWn.LIZ;
        } else {
            shortVideoContext = null;
        }
        if ((i & 2) != 0) {
            c375830EoP4 = c1630350sWn.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP3 = c1630350sWn.LIZJ;
        }
        if ((i & 8) != 0) {
            z6 = c1630350sWn.LIZLLL;
        }
        if ((i & 16) != 0) {
            z5 = c1630350sWn.LJ;
        }
        if ((i & 32) != 0) {
            z4 = c1630350sWn.LJFF;
        }
        if ((i & 64) != 0) {
            enumC1448590nnd2 = c1630350sWn.LJI;
        }
        if ((i & 128) != 0) {
            str2 = c1630350sWn.LJII;
        }
        if ((i & 256) != 0) {
            str3 = c1630350sWn.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            num2 = c1630350sWn.LJIIIZ;
        }
        c1630350sWn.getClass();
        return new C1630350sWn(shortVideoContext, c375830EoP4, c375830EoP3, z6, z5, z4, enumC1448590nnd2, str2, str3, num2);
    }
}

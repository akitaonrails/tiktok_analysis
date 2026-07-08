package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sTU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628300sTU {
    public final C375830EoP<Pair<List<InterfaceC1626470sQX>, Integer>> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<C1626920sRG> LIZJ;
    public final C375830EoP<Pair<Integer, Boolean>> LIZLLL;
    public final C375830EoP<C443120HZe<Integer, Boolean, Boolean>> LJ;
    public final EnumC995040c06 LJFF;
    public final C375830EoP<C443120HZe<InterfaceC1626470sQX, Boolean, Integer>> LJI;
    public final C375830EoP<Effect> LJII;
    public final boolean LJIIIIZZ;
    public final C375830EoP<String> LJIIIZ;

    public C1628300sTU() {
        this(0);
    }

    public /* synthetic */ C1628300sTU(int i) {
        this(null, null, null, null, null, EnumC995040c06.WHITE, null, null, false, null);
    }

    public C1628300sTU(C375830EoP<Pair<List<InterfaceC1626470sQX>, Integer>> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<C1626920sRG> c375830EoP3, C375830EoP<Pair<Integer, Boolean>> c375830EoP4, C375830EoP<C443120HZe<Integer, Boolean, Boolean>> c375830EoP5, EnumC995040c06 enumC995040c06, C375830EoP<C443120HZe<InterfaceC1626470sQX, Boolean, Integer>> c375830EoP6, C375830EoP<Effect> c375830EoP7, boolean z, C375830EoP<String> c375830EoP8) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = c375830EoP5;
        this.LJFF = enumC995040c06;
        this.LJI = c375830EoP6;
        this.LJII = c375830EoP7;
        this.LJIIIIZZ = z;
        this.LJIIIZ = c375830EoP8;
    }

    public static C1628300sTU LIZ(C1628300sTU c1628300sTU, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, EnumC995040c06 enumC995040c06, C375830EoP c375830EoP6, C375830EoP c375830EoP7, boolean z, C375830EoP c375830EoP8, int i) {
        C375830EoP c375830EoP9 = c375830EoP8;
        boolean z2 = z;
        C375830EoP c375830EoP10 = c375830EoP7;
        C375830EoP c375830EoP11 = c375830EoP6;
        EnumC995040c06 enumC995040c062 = enumC995040c06;
        C375830EoP c375830EoP12 = c375830EoP5;
        C375830EoP c375830EoP13 = c375830EoP4;
        C375830EoP c375830EoP14 = c375830EoP3;
        C375830EoP c375830EoP15 = c375830EoP2;
        C375830EoP c375830EoP16 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP16 = c1628300sTU.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP15 = c1628300sTU.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP14 = c1628300sTU.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP13 = c1628300sTU.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP12 = c1628300sTU.LJ;
        }
        if ((i & 32) != 0) {
            enumC995040c062 = c1628300sTU.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP11 = c1628300sTU.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP10 = c1628300sTU.LJII;
        }
        if ((i & 256) != 0) {
            z2 = c1628300sTU.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c375830EoP9 = c1628300sTU.LJIIIZ;
        }
        c1628300sTU.getClass();
        return new C1628300sTU(c375830EoP16, c375830EoP15, c375830EoP14, c375830EoP13, c375830EoP12, enumC995040c062, c375830EoP11, c375830EoP10, z2, c375830EoP9);
    }
}

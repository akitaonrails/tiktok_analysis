package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530600KrS {
    public final C375830EoP<C530530KrL> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Integer> LIZJ;
    public final C375830EoP<Integer> LIZLLL;
    public final C375830EoP<Pair<Integer, TikTokMediaModel>> LJ;
    public final C375830EoP<Boolean> LJFF;
    public final C375830EoP<Boolean> LJI;
    public final C375830EoP<Boolean> LJII;

    public C530600KrS() {
        this(0);
    }

    public /* synthetic */ C530600KrS(int i) {
        this(null, null, null, null, null, null, null, null);
    }

    public C530600KrS(C375830EoP<C530530KrL> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Integer> c375830EoP3, C375830EoP<Integer> c375830EoP4, C375830EoP<Pair<Integer, TikTokMediaModel>> c375830EoP5, C375830EoP<Boolean> c375830EoP6, C375830EoP<Boolean> c375830EoP7, C375830EoP<Boolean> c375830EoP8) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = c375830EoP5;
        this.LJFF = c375830EoP6;
        this.LJI = c375830EoP7;
        this.LJII = c375830EoP8;
    }

    public static C530600KrS LIZ(C530600KrS c530600KrS, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, C375830EoP c375830EoP7, int i) {
        C375830EoP<Boolean> c375830EoP8;
        C375830EoP c375830EoP9 = c375830EoP7;
        C375830EoP c375830EoP10 = c375830EoP6;
        C375830EoP c375830EoP11 = c375830EoP5;
        C375830EoP c375830EoP12 = c375830EoP4;
        C375830EoP c375830EoP13 = c375830EoP3;
        C375830EoP c375830EoP14 = c375830EoP2;
        C375830EoP c375830EoP15 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP15 = c530600KrS.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP14 = c530600KrS.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP13 = c530600KrS.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP12 = c530600KrS.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP11 = c530600KrS.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP8 = c530600KrS.LJFF;
        } else {
            c375830EoP8 = null;
        }
        if ((i & 64) != 0) {
            c375830EoP10 = c530600KrS.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP9 = c530600KrS.LJII;
        }
        c530600KrS.getClass();
        return new C530600KrS(c375830EoP15, c375830EoP14, c375830EoP13, c375830EoP12, c375830EoP11, c375830EoP8, c375830EoP10, c375830EoP9);
    }
}

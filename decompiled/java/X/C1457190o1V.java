package X;

import com.bytedance.ies.cutsame.util.Size;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0o1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457190o1V {
    public final VideoPublishEditModel LIZ;
    public final C375830EoP<Integer> LIZIZ;
    public final Boolean LIZJ;
    public final Size LIZLLL;
    public final boolean LJ;
    public final C375830EoP<Boolean> LJFF;
    public final C375830EoP<C21665819qi> LJI;
    public final C375830EoP<Boolean> LJII;
    public final C375830EoP<Integer> LJIIIIZZ;

    public static C1457190o1V LIZ(C1457190o1V c1457190o1V, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, int i) {
        VideoPublishEditModel videoPublishEditModel;
        Boolean bool;
        Size size;
        boolean z;
        C375830EoP c375830EoP5 = c375830EoP4;
        C375830EoP c375830EoP6 = c375830EoP3;
        C375830EoP c375830EoP7 = c375830EoP2;
        C375830EoP c375830EoP8 = c375830EoP;
        C375830EoP<C21665819qi> c375830EoP9 = null;
        if ((i & 1) != 0) {
            videoPublishEditModel = c1457190o1V.LIZ;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 2) != 0) {
            c375830EoP8 = c1457190o1V.LIZIZ;
        }
        if ((i & 4) != 0) {
            bool = c1457190o1V.LIZJ;
        } else {
            bool = null;
        }
        if ((i & 8) != 0) {
            size = c1457190o1V.LIZLLL;
        } else {
            size = null;
        }
        if ((i & 16) != 0) {
            z = c1457190o1V.LJ;
        } else {
            z = false;
        }
        if ((i & 32) != 0) {
            c375830EoP7 = c1457190o1V.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP9 = c1457190o1V.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP6 = c1457190o1V.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP5 = c1457190o1V.LJIIIIZZ;
        }
        c1457190o1V.getClass();
        return new C1457190o1V(videoPublishEditModel, c375830EoP8, bool, size, z, c375830EoP7, c375830EoP9, c375830EoP6, c375830EoP5);
    }

    public C1457190o1V(VideoPublishEditModel videoPublishEditModel, C375830EoP<Integer> c375830EoP, Boolean bool, Size size, boolean z, C375830EoP<Boolean> c375830EoP2, C375830EoP<C21665819qi> c375830EoP3, C375830EoP<Boolean> c375830EoP4, C375830EoP<Integer> c375830EoP5) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = c375830EoP;
        this.LIZJ = bool;
        this.LIZLLL = size;
        this.LJ = z;
        this.LJFF = c375830EoP2;
        this.LJI = c375830EoP3;
        this.LJII = c375830EoP4;
        this.LJIIIIZZ = c375830EoP5;
    }
}

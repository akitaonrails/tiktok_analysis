package X;

import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.19qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21665619qg {
    public final VideoPublishEditModel LIZ;
    public final NLETrackSlot LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final Size LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C375830EoP<C21665819qi> LJI;
    public final C375830EoP<C21665819qi> LJII;
    public final C375830EoP<Unit> LJIIIIZZ;

    public /* synthetic */ C21665619qg(VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        this(videoPublishEditModel, null, null, null, (i & 16) != 0 ? false : z, false, null, null, null);
    }

    public static C21665619qg LIZ(C21665619qg c21665619qg, NLETrackSlot nLETrackSlot, C375830EoP c375830EoP, Size size, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, int i) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        boolean z2;
        C375830EoP c375830EoP5 = c375830EoP4;
        Size size2 = size;
        C375830EoP c375830EoP6 = c375830EoP3;
        C375830EoP c375830EoP7 = c375830EoP;
        C375830EoP c375830EoP8 = c375830EoP2;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        if ((i & 1) != 0) {
            videoPublishEditModel = c21665619qg.LIZ;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 2) != 0) {
            nLETrackSlot2 = c21665619qg.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP7 = c21665619qg.LIZJ;
        }
        if ((i & 8) != 0) {
            size2 = c21665619qg.LIZLLL;
        }
        if ((i & 16) != 0) {
            z = c21665619qg.LJ;
        } else {
            z = false;
        }
        if ((i & 32) != 0) {
            z2 = c21665619qg.LJFF;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            c375830EoP8 = c21665619qg.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP6 = c21665619qg.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP5 = c21665619qg.LJIIIIZZ;
        }
        c21665619qg.getClass();
        return new C21665619qg(videoPublishEditModel, nLETrackSlot2, c375830EoP7, size2, z, z2, c375830EoP8, c375830EoP6, c375830EoP5);
    }

    public C21665619qg(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot, C375830EoP<Boolean> c375830EoP, Size size, boolean z, boolean z2, C375830EoP<C21665819qi> c375830EoP2, C375830EoP<C21665819qi> c375830EoP3, C375830EoP<Unit> c375830EoP4) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = c375830EoP;
        this.LIZLLL = size;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = c375830EoP2;
        this.LJII = c375830EoP3;
        this.LJIIIIZZ = c375830EoP4;
    }
}

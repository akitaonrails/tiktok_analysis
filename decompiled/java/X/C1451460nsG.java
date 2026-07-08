package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451460nsG {
    public final VideoPublishEditModel LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Float> LIZJ;
    public final C375830EoP<Unit> LIZLLL;

    public C1451460nsG(VideoPublishEditModel videoPublishEditModel, C375830EoP<Boolean> c375830EoP, C375830EoP<Float> c375830EoP2, C375830EoP<Unit> c375830EoP3) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c375830EoP2;
        this.LIZLLL = c375830EoP3;
    }

    public static C1451460nsG LIZ(C1451460nsG c1451460nsG, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        VideoPublishEditModel videoPublishEditModel;
        C375830EoP<Boolean> c375830EoP3 = null;
        if ((i & 1) != 0) {
            videoPublishEditModel = c1451460nsG.LIZ;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 2) != 0) {
            c375830EoP3 = c1451460nsG.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP = c1451460nsG.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP2 = c1451460nsG.LIZLLL;
        }
        c1451460nsG.getClass();
        return new C1451460nsG(videoPublishEditModel, c375830EoP3, c375830EoP, c375830EoP2);
    }
}

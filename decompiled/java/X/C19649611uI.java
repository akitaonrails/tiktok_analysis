package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19649611uI {
    public final List<SingleImageData> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C375830EoP<Pair<Integer, ImageSynthesisResult>> LJ;
    public final VideoPublishEditModel LJFF;

    public C19649611uI(List<SingleImageData> list, boolean z, boolean z2, boolean z3, C375830EoP<Pair<Integer, ImageSynthesisResult>> c375830EoP, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = c375830EoP;
        this.LJFF = videoPublishEditModel;
    }

    public static C19649611uI LIZ(C19649611uI c19649611uI, List list, boolean z, boolean z2, C375830EoP c375830EoP, int i) {
        boolean z3;
        VideoPublishEditModel videoPublishEditModel;
        C375830EoP c375830EoP2 = c375830EoP;
        boolean z4 = z2;
        boolean z5 = z;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c19649611uI.LIZ;
        }
        if ((i & 2) != 0) {
            z3 = c19649611uI.LIZIZ;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z5 = c19649611uI.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c19649611uI.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP2 = c19649611uI.LJ;
        }
        if ((i & 32) != 0) {
            videoPublishEditModel = c19649611uI.LJFF;
        } else {
            videoPublishEditModel = null;
        }
        c19649611uI.getClass();
        return new C19649611uI(list2, z3, z5, z4, c375830EoP2, videoPublishEditModel);
    }
}

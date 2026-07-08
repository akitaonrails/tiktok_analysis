package X;

import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MDU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDU {
    public final C1464760oDi LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final PromptModel LIZJ;
    public final String LIZLLL;
    public final PromptRequestState LJ;
    public final PromptRequestState LJFF;
    public final C375830EoP<C565240MEw> LJI;
    public final boolean LJII;

    public C0MDU(C1464760oDi c1464760oDi, VideoPublishEditModel videoPublishEditModel, PromptModel promptModel, String str, PromptRequestState promptRequestState, PromptRequestState promptRequestState2, C375830EoP<C565240MEw> c375830EoP, boolean z) {
        this.LIZ = c1464760oDi;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = promptModel;
        this.LIZLLL = str;
        this.LJ = promptRequestState;
        this.LJFF = promptRequestState2;
        this.LJI = c375830EoP;
        this.LJII = z;
    }

    public static C0MDU LIZ(C0MDU c0mdu, C1464760oDi c1464760oDi, PromptModel promptModel, String str, PromptRequestState promptRequestState, PromptRequestState promptRequestState2, C375830EoP c375830EoP, int i) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        C375830EoP c375830EoP2 = c375830EoP;
        PromptRequestState promptRequestState3 = promptRequestState;
        String str2 = str;
        PromptModel promptModel2 = promptModel;
        PromptRequestState promptRequestState4 = promptRequestState2;
        C1464760oDi c1464760oDi2 = c1464760oDi;
        if ((i & 1) != 0) {
            c1464760oDi2 = c0mdu.LIZ;
        }
        if ((i & 2) != 0) {
            videoPublishEditModel = c0mdu.LIZIZ;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 4) != 0) {
            promptModel2 = c0mdu.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c0mdu.LIZLLL;
        }
        if ((i & 16) != 0) {
            promptRequestState3 = c0mdu.LJ;
        }
        if ((i & 32) != 0) {
            promptRequestState4 = c0mdu.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP2 = c0mdu.LJI;
        }
        if ((i & 128) != 0) {
            z = c0mdu.LJII;
        } else {
            z = false;
        }
        c0mdu.getClass();
        return new C0MDU(c1464760oDi2, videoPublishEditModel, promptModel2, str2, promptRequestState3, promptRequestState4, c375830EoP2, z);
    }
}

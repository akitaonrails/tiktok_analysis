package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0LAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LAQ {
    public final String LIZ;
    public final C0LAU LIZIZ;
    public final VideoPublishEditModel LIZJ;

    public C0LAQ() {
        this(0);
    }

    public /* synthetic */ C0LAQ(int i) {
        this("", C538500LAa.LIZ, null);
    }

    public C0LAQ(String str, C0LAU c0lau, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = str;
        this.LIZIZ = c0lau;
        this.LIZJ = videoPublishEditModel;
    }

    public static C0LAQ LIZ(C0LAQ c0laq, String str, C0LAU c0lau, VideoPublishEditModel videoPublishEditModel, int i) {
        if ((i & 1) != 0) {
            str = c0laq.LIZ;
        }
        if ((i & 2) != 0) {
            c0lau = c0laq.LIZIZ;
        }
        if ((i & 4) != 0) {
            videoPublishEditModel = c0laq.LIZJ;
        }
        c0laq.getClass();
        return new C0LAQ(str, c0lau, videoPublishEditModel);
    }
}

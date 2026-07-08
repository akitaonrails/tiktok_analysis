package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.10C0, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10C0 {
    public final boolean LIZ;
    public final EnumC19206310Bx LIZIZ;
    public final VideoPublishEditModel LIZJ;

    public C10C0() {
        this(0);
    }

    public /* synthetic */ C10C0(int i) {
        this(false, EnumC19206310Bx.OTHER, null);
    }

    public C10C0(boolean z, EnumC19206310Bx enumC19206310Bx, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = z;
        this.LIZIZ = enumC19206310Bx;
        this.LIZJ = videoPublishEditModel;
    }

    public static C10C0 LIZ(C10C0 c10c0, boolean z, EnumC19206310Bx enumC19206310Bx, VideoPublishEditModel videoPublishEditModel, int i) {
        if ((i & 1) != 0) {
            z = c10c0.LIZ;
        }
        if ((i & 2) != 0) {
            enumC19206310Bx = c10c0.LIZIZ;
        }
        if ((i & 4) != 0) {
            videoPublishEditModel = c10c0.LIZJ;
        }
        return new C10C0(z, enumC19206310Bx, videoPublishEditModel);
    }
}

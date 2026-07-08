package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439360nYk {
    public static final AbstractC1437870nWL LIZ(final VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        if (videoPublishEditModel.creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("VideoSizeProvider", "Nows");
            return new C1432370nNT(videoPublishEditModel);
        }
        if (videoPublishEditModel.getCreationMode() == 4) {
            return new AbstractC1437870nWL(videoPublishEditModel) { // from class: X.0nYl
                public int LIZLLL;
                public int LJ;

                @Override // X.InterfaceC1444130ngR
                public final int LIZLLL() {
                    return LIZIZ(false);
                }

                @Override // X.InterfaceC1444130ngR
                public final int LJI() {
                    return LIZ(false);
                }

                @Override // X.InterfaceC1444130ngR
                public final int LIZJ() {
                    if (this.LJ == 0) {
                        LJII();
                    }
                    return this.LJ;
                }

                @Override // X.InterfaceC1444130ngR
                public final int LJFF() {
                    if (this.LIZLLL == 0) {
                        LJII();
                    }
                    return this.LIZLLL;
                }

                public final void LJII() {
                    if (this.LIZLLL == 0 || this.LJ == 0) {
                        int iLJIIIIZZ = C14KQ.LJIIIIZZ(C0CHQ.LIZ);
                        int iLJ = C14KQ.LJ(C0CHQ.LIZ);
                        int iLIZIZ = LIZIZ(false);
                        int iLIZ = LIZ(false);
                        if (iLJIIIIZZ / iLJ > iLIZIZ / iLIZ) {
                            this.LJ = iLJ;
                            this.LIZLLL = (iLJ * iLIZIZ) / iLIZ;
                        } else {
                            this.LIZLLL = iLJIIIIZZ;
                            this.LJ = (iLJIIIIZZ * iLIZ) / iLIZIZ;
                        }
                    }
                }
            };
        }
        if (videoPublishEditModel.isFastImport()) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("VideoSizeProvider", "FastImport");
            return new C1439340nYi(videoPublishEditModel);
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("VideoSizeProvider", "NotFastImport");
        return new C1439350nYj(videoPublishEditModel);
    }
}

package X;

import kotlin.jvm.internal.AwS124S0101000_16;

/* JADX INFO: renamed from: X.0cBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001970cBH implements C0ST4 {
    public final InterfaceC1001990cBJ LIZ;

    @Override // X.C0ST4
    public final void LIZ(int i) {
    }

    @Override // X.C0ST4
    public final void LIZJ(int i, long j, long j2) {
    }

    public C1001970cBH(C1001960cBG c1001960cBG) {
        this.LIZ = c1001960cBG;
    }

    @Override // X.C0ST4
    public final void LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLivePhotoStartPlay, position: ");
        sbLIZ.append(i);
        C1022620cia.LIZ("CommerceLivePhotoPlayerObserver", C2188811AlT.LIZIZ(sbLIZ));
        C1002030cBN logger = this.LIZ.getLogger();
        if (logger != null) {
            C1002060cBQ.LIZ.getClass();
            logger.logAd(C1002060cBQ.LIZJ, new AwS124S0101000_16(i, logger, 6));
        }
    }
}

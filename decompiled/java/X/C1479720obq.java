package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;

/* JADX INFO: renamed from: X.0obq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479720obq {
    public final C1479530obX LIZ = new C1479530obX();

    public final C1479530obX LIZ() {
        C1479530obX c1479530obX = this.LIZ;
        if (c1479530obX.LJJLIIJ == null) {
            SimVideo simVideo = c1479530obX.LIZLLL;
            c1479530obX.LJJLIIJ = simVideo != null ? simVideo.getMetaInfo() : null;
        }
        return this.LIZ;
    }

    public final void LIZIZ(String str) {
        if (str != null) {
            this.LIZ.LJIJ = str;
        }
    }

    public final void LIZJ(String str) {
        if (str != null) {
            this.LIZ.LJIIZILJ = str;
        }
    }
}

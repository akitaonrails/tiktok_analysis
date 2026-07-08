package X;

import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031990cxh {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(218));

    public final InterfaceC1484830ok5 LIZ() {
        return (InterfaceC1484830ok5) this.LIZ.getValue();
    }

    public final long LIZIZ() {
        return LIZ().LJIIIZ().getCurrentPosition();
    }

    public final long LIZJ() {
        return LIZ().LJIIIZ().getDuration();
    }

    public final boolean LIZLLL() {
        return LIZ().getPlayState().isPlaying();
    }

    public final void LJ() {
        LIZ().pause();
    }

    public final void LJFF() {
        LIZ().resume();
    }
}

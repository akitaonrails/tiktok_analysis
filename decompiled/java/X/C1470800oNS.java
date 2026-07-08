package X;

import com.ss.videoarch.liveplayer.VideoLiveManager;

/* JADX INFO: renamed from: X.0oNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470800oNS extends AbstractC1470550oN3<C1470760oNO> implements InterfaceC1470050oMF {
    @Override // X.InterfaceC1470050oMF
    public final void pause() {
        C1481110oe5.LIZIZ("VideoLiveManager_TTKPlayer", "LivePauseProcessPlugin pause");
        InterfaceC1467950oIr interfaceC1467950oIr = this.LIZIZ.LIZ;
        if (interfaceC1467950oIr != null) {
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
            if (c1470430oMr.isPlaying()) {
                VideoLiveManager videoLiveManager = ((AbstractC1487640ooc) this.LIZIZ).LJ;
                if (videoLiveManager != null) {
                    videoLiveManager.getClass();
                    videoLiveManager.LJIIIIZZ = EnumC1487710ooj.PAUSED;
                }
                c1470430oMr.pause();
            }
        }
    }

    public C1470800oNS(C1470760oNO c1470760oNO, InterfaceC1469660oLc interfaceC1469660oLc) {
        super(c1470760oNO, interfaceC1469660oLc);
    }
}

package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0olb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class RunnableC1485770olb implements Runnable {
    public final WeakReference<VideoLiveManager> LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;

    public final void LIZ() {
        String str;
        InterfaceC1467950oIr interfaceC1467950oIr;
        VideoLiveManager videoLiveManager = this.LL.get();
        if (videoLiveManager == null || (str = this.LLILLJJLI) == null || str.isEmpty()) {
            return;
        }
        if (!this.LLILLL) {
            if (!this.LLILLJJLI.equals(C1474810oTv.LJLJLLL() ? videoLiveManager.LJJIII.LIZIZ : videoLiveManager.LLIIJLIL)) {
                return;
            }
        }
        if (!this.LLILLL || this.LLILLJJLI.equals(videoLiveManager.Q0)) {
            if (videoLiveManager.LJIIIIZZ != EnumC1487710ooj.PLAYED) {
                LIZIZ(this.LLILZ);
                return;
            }
            VideoLiveManager videoLiveManager2 = this.LL.get();
            if (videoLiveManager2 != null && (interfaceC1467950oIr = videoLiveManager2.LIZLLL) != null) {
                long jLJIIJ = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(73, -1L);
                long jLJIIJ2 = ((C1470430oMr) videoLiveManager2.LIZLLL).LJIIJ(605, -1L);
                long jLJIIJ3 = ((C1470430oMr) videoLiveManager2.LIZLLL).LJIIJ(603, -1L);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("audioFormaterBuff: ");
                sbLIZ.append(jLJIIJ);
                sbLIZ.append(", audioPlayerBuff: ");
                sbLIZ.append(jLJIIJ2);
                sbLIZ.append(", audioDecoderBuff: ");
                sbLIZ.append(jLJIIJ3);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                long j = jLJIIJ >= 0 ? jLJIIJ + 0 : 0L;
                if (jLJIIJ2 >= 0) {
                    j += jLJIIJ2;
                }
                if (jLJIIJ3 >= 0) {
                    j += jLJIIJ3;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("audioBuff: ");
                sbLIZ2.append(j);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZJ();
                if (j >= 0 && j != -1) {
                    if (this.LLILLL && videoLiveManager.P == 1) {
                        C1476660oWu.LIZ.LJII(1002, videoLiveManager.Q0, (int) j);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("sync play cache:");
                        sbLIZ3.append(j);
                        sbLIZ3.append("(ms) with session id:");
                        sbLIZ3.append(C1474810oTv.LJLJLLL() ? videoLiveManager.LJJIII.LIZIZ : videoLiveManager.LLIIJLIL);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C1698940uJQ.LIZ();
                        if (j > this.LLILZLL) {
                            LIZIZ(this.LLILZ);
                            return;
                        } else {
                            LIZIZ(this.LLILZIL);
                            return;
                        }
                    }
                    return;
                }
            }
            LIZIZ(this.LLILZ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VideoLiveManager$PlayCacheSyncRunner@54e0.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoLiveManager$PlayCacheSyncRunner@54e0.run");
    }

    public final void LIZIZ(long j) {
        VideoLiveManager videoLiveManager = this.LL.get();
        if (videoLiveManager == null) {
            return;
        }
        videoLiveManager.LLLLII(j, new RunnableC1485770olb(videoLiveManager, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
    }

    public RunnableC1485770olb(VideoLiveManager videoLiveManager, String str, boolean z, long j, long j2, long j3) {
        this.LLILZ = 500L;
        this.LLILZIL = 300L;
        this.LLILZLL = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LL = new WeakReference<>(videoLiveManager);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = j3;
    }
}

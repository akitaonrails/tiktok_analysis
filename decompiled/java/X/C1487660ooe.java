package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;

/* JADX INFO: renamed from: X.0ooe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487660ooe implements InterfaceC1487680oog {
    public final /* synthetic */ C1698470uIf LIZ;

    public C1487660ooe(C1698470uIf c1698470uIf) {
        this.LIZ = c1698470uIf;
    }

    @Override // X.InterfaceC1487680oog
    public final void LIZ(final String str, final String str2, final String str3) {
        LiveLoggerService liveLoggerService = this.LIZ.LJ;
        if (!liveLoggerService.LLLZLZ) {
            liveLoggerService.LLILLL.LIZLLL = System.currentTimeMillis();
        }
        final C1698470uIf c1698470uIf = this.LIZ;
        VideoLiveManager videoLiveManager = ((AbstractC1487640ooc) c1698470uIf.LIZIZ).LJFF;
        C786410Ut5.LJL(videoLiveManager.LJIILIIL, new Runnable(str, str2, str3) { // from class: X.0oof
            public final String LL;
            public final String LLILLJJLI = null;
            public final String LLILLL;

            public final void LIZ() {
                synchronized (((VideoLiveManager) this.LLILZ.LIZIZ).v1) {
                    try {
                        boolean zLJI = this.LLILZ.LJI(this.LL, this.LLILLJJLI, this.LLILLL);
                        LiveLoggerService liveLoggerService2 = this.LLILZ.LJ;
                        if (liveLoggerService2.L5 > 0) {
                            liveLoggerService2.M5 = zLJI ? System.currentTimeMillis() : -2L;
                        }
                        if (zLJI) {
                            AbstractC1469000oKY abstractC1469000oKY = this.LLILZ.LIZIZ;
                            if (((VideoLiveManager) abstractC1469000oKY).LJJLJ == 1 && ((VideoLiveManager) abstractC1469000oKY).j3) {
                                ((VideoLiveManager) abstractC1469000oKY).LJFF.LLLIZZ();
                            }
                            C1698470uIf c1698470uIf2 = this.LLILZ;
                            AbstractC1469000oKY abstractC1469000oKY2 = c1698470uIf2.LIZIZ;
                            if (((VideoLiveManager) abstractC1469000oKY2).j3) {
                                c1698470uIf2.LJIIIIZZ(true);
                                C1698940uJQ.LIZJ();
                            } else if (((VideoLiveManager) abstractC1469000oKY2).LJJLJ == 1 || ((VideoLiveManager) abstractC1469000oKY2).LJJZ == 1) {
                                c1698470uIf2.LJIIIIZZ(false);
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("call from prepare() -- ");
                                sbLIZ.append(((VideoLiveManager) this.LLILZ.LIZIZ).P0);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C1698940uJQ.LIZJ();
                            }
                            ((VideoLiveManager) this.LLILZ.LIZIZ).LJIIJ(EnumC1487700ooi.PREPARED);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("call from prepare() -- ");
                            sbLIZ2.append(((VideoLiveManager) this.LLILZ.LIZIZ).P0);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C1698940uJQ.LIZJ();
                            ((VideoLiveManager) this.LLILZ.LIZIZ).LJIIJ(EnumC1487700ooi.IDLE);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LivePrepareStartProcessPlugin$PrepareTask@48c3.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LivePrepareStartProcessPlugin$PrepareTask@48c3.run");
            }

            {
                this.LL = str;
                this.LLILLL = str3;
            }
        });
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0cyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032310cyD implements InterfaceC1024990cmP {
    public final InterfaceC1032420cyO LIZ;

    @Override // X.InterfaceC1024990cmP
    public final InterfaceC1025000cmQ LIZ() {
        return new InterfaceC1025000cmQ() { // from class: X.0cyE
            @Override // X.InterfaceC1025000cmQ
            public final Video LIZ() {
                Aweme aweme;
                Object objLIZ = this.LIZ.LIZ.LJI().LIZ();
                if (!(objLIZ instanceof Aweme) || (aweme = (Aweme) objLIZ) == null) {
                    return null;
                }
                return aweme.getVideo();
            }

            @Override // X.InterfaceC1025000cmQ
            public final AwemeRawAd LIZIZ() {
                Aweme aweme;
                Object objLIZ = this.LIZ.LIZ.LJI().LIZ();
                if (!(objLIZ instanceof Aweme) || (aweme = (Aweme) objLIZ) == null) {
                    return null;
                }
                return aweme.getAwemeRawAd();
            }
        };
    }

    @Override // X.InterfaceC1024990cmP
    public final InterfaceC1025030cmT LIZIZ() {
        return new InterfaceC1025030cmT() { // from class: X.0cyJ
            @Override // X.InterfaceC1025030cmT
            public final void LIZ(String str) {
                this.LIZ.LIZ.getEventTracker().LIZ(str);
            }
        };
    }

    @Override // X.InterfaceC1024990cmP
    public final InterfaceC1025010cmR LIZJ() {
        return new InterfaceC1025010cmR() { // from class: X.0cy7
            @Override // X.InterfaceC1025010cmR
            public final long getVideoLength() {
                return this.LIZ.LIZ.getPlayer().LIZ();
            }

            @Override // X.InterfaceC1025010cmR
            public final void reset() {
                this.LIZ.LIZ.getPlayer().LIZJ();
            }

            @Override // X.InterfaceC1025010cmR
            public final void LIZ(C988290bpD c988290bpD) {
                C1032260cy8 player = this.LIZ.LIZ.getPlayer();
                String str = c988290bpD.LJFF;
                C1032360cyI c1032360cyI = new C1032360cyI(str);
                long j = c988290bpD.LIZ;
                if (j <= 0) {
                    j = 1;
                }
                c1032360cyI.LIZ = j;
                c1032360cyI.LIZIZ = c988290bpD.LIZIZ;
                Runnable runnable = c988290bpD.LIZJ;
                if (runnable == null) {
                    runnable = new Runnable() { // from class: X.0UwG
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("GmtRewardModelConverterExtKt@5a83.convert2GmtRewardVideoPlayTaskInfo$1$1");
                            C1C7U.LIZIZ("GmtRewardModelConverterExtKt@5a83.convert2GmtRewardVideoPlayTaskInfo$1$1");
                        }
                    };
                }
                c1032360cyI.LIZJ = runnable;
                c1032360cyI.LIZLLL = c988290bpD.LIZLLL;
                c1032360cyI.LJ = c988290bpD.LJ;
                player.LIZIZ(new C1034410d1b(c1032360cyI.LIZ, c1032360cyI.LIZIZ, c1032360cyI.LIZJ, c1032360cyI.LIZLLL, c1032360cyI.LJ, str));
            }
        };
    }

    public C1032310cyD(C1032340cyG c1032340cyG) {
        this.LIZ = c1032340cyG;
    }
}

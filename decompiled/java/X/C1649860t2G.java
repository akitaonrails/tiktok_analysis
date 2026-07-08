package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649860t2G {
    public static final long LJI = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration();
    public final C19EG LIZ;
    public final InterfaceC1648570t0B LIZIZ;
    public final InterfaceC1628590sTx LIZJ;
    public final ShortVideoContext LIZLLL;
    public final C1DRG LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS569S0100000_25(this, 351));

    public final void LIZ(C1454900nxo c1454900nxo) {
        long jLIZLLL;
        long jLIZ;
        BackgroundVideo backgroundVideo;
        BackgroundVideo backgroundVideo2;
        String musicId;
        EnumC1649480t1e enumC1649480t1eLIZ;
        InterfaceC1652770t6x interfaceC1652770t6x;
        int i;
        int duration;
        long jLIZ2;
        int musicStartFromCut;
        int musicEndFromCut;
        if (c1454900nxo.LIZ) {
            if (!this.LIZ.isFinishing()) {
                C1443960ngA.LIZIZ(this.LIZLLL);
                C1443960ngA.LIZ(this.LIZLLL);
                this.LIZIZ.ht1(new C531060KsC(this.LIZLLL.cameraComponentModel.mMaxDuration));
                this.LIZJ.Jn();
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(c1454900nxo.LIZLLL) || this.LIZ.isFinishing()) {
            return;
        }
        String str = c1454900nxo.LIZLLL;
        AVMusic aVMusic = c1454900nxo.LIZJ;
        String str2 = c1454900nxo.LIZIZ;
        long maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(!this.LIZLLL.cameraComponentModel.mCurrentDurationMode, this.LIZLLL);
        if (C1458070o2v.LIZIZ() && ((i = this.LIZLLL.shootMode) == 16 || i == 29)) {
            if (aVMusic != null && (musicEndFromCut = aVMusic.getMusicEndFromCut()) > (musicStartFromCut = aVMusic.getMusicStartFromCut()) && musicStartFromCut >= 0) {
                jLIZ2 = musicEndFromCut - musicStartFromCut;
            } else {
                if (aVMusic != null) {
                    duration = aVMusic.getDuration();
                } else {
                    duration = (int) maxShootingDuration;
                }
                jLIZ2 = C1465190oEP.LIZ(aVMusic, Integer.valueOf(duration));
            }
            jLIZLLL = Math.min(jLIZ2, maxShootingDuration);
        } else if (C1458070o2v.LJ(this.LIZLLL.creativeModel.musicBuzModel)) {
            jLIZLLL = C1442040nd4.LIZLLL(this.LIZLLL, (int) maxShootingDuration, aVMusic);
        } else {
            jLIZLLL = maxShootingDuration;
        }
        if (C1443960ngA.LJIIJJI(this.LIZLLL.stitchContext.stitchParams)) {
            C443120HZe<Long, Long, Long> c443120HZeLIZ = C1444030ngH.LIZ(this.LIZLLL.stitchContext.stitchParams, str, aVMusic, maxShootingDuration);
            jLIZ = c443120HZeLIZ.getFirst().longValue();
            jLIZLLL = c443120HZeLIZ.getSecond().longValue();
            c443120HZeLIZ.getThird().longValue();
        } else {
            if (aVMusic != null && !TextUtils.isEmpty(str)) {
                jLIZ = C579120MnW.LIZ(aVMusic, str);
                if (!C1458070o2v.LJ(this.LIZLLL.creativeModel.musicBuzModel)) {
                    jLIZLLL = Math.min(jLIZ, jLIZLLL);
                }
            } else {
                jLIZ = 0;
            }
            BackgroundVideo backgroundVideo3 = this.LIZLLL.cameraComponentModel.curBackgroundVideo;
            if ((backgroundVideo3 == null || !backgroundVideo3.isDefaultBgVideo()) && (backgroundVideo = this.LIZLLL.cameraComponentModel.curBackgroundVideo) != null) {
                long maxDuration = backgroundVideo.getMaxDuration();
                if (maxDuration > 0 && (backgroundVideo2 = this.LIZLLL.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo2.isMultiBgVideo()) {
                    jLIZLLL = Math.min(jLIZLLL, maxDuration);
                }
            }
            this.LIZLLL.LJJLIIIJILLIZJL(str2);
        }
        ShortVideoContext shortVideoContext = this.LIZLLL;
        shortVideoContext.cameraComponentModel.mMusicPath = str;
        if (!shortVideoContext.LJJJJZ()) {
            this.LIZLLL.LJJLIIIJJI(jLIZLLL);
        }
        ShortVideoContext shortVideoContext2 = this.LIZLLL;
        if (shortVideoContext2.creativeModel.recordEffectModel.musicConstrictionOnRecordDurationRemovedByGameEffect) {
            jLIZLLL = maxShootingDuration;
        }
        shortVideoContext2.LJJLIIIJJI(jLIZLLL);
        if (!C298140BmO.LIZ()) {
            C15R5.LJFF(this.LIZLLL.cameraComponentModel.mMusicPath, new C15RH() { // from class: X.0t2H
                @Override // X.C15RH
                public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                    this.LIZ.LIZLLL.musicWaveBean = C15R5.LIZIZ(aVMusicWaveBean);
                }
            });
        }
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(musicId);
        if (performanceMonitorLIZ != null) {
            j jVar = C524780Ki4.LIZ;
            jVar.getClass();
            jVar.LIZLLL(performanceMonitorLIZ.getType(), "back to record scene", performanceMonitorLIZ, 5);
        }
        this.LIZJ.qt(aVMusic, str);
        if (aVMusic != null && (interfaceC1652770t6x = (InterfaceC1652770t6x) this.LJFF.getValue()) != null) {
            interfaceC1652770t6x.TA0(maxShootingDuration, aVMusic);
        }
        if (this.LIZLLL.LJJJJLL()) {
            enumC1649480t1eLIZ = C1649490t1f.LIZ(new C1649490t1f(), maxShootingDuration, jLIZLLL);
        } else {
            enumC1649480t1eLIZ = C1649490t1f.LIZ(new C1649490t1f(), maxShootingDuration, jLIZ);
        }
        if (enumC1649480t1eLIZ == EnumC1649480t1e.MUSIC && c1454900nxo.LJFF) {
            this.LIZJ.nv(1);
        }
        this.LIZIZ.ht1(new C531060KsC(jLIZLLL));
    }

    public C1649860t2G(C19EG c19eg, e0 e0Var, C1652400t6M c1652400t6M, ShortVideoContext shortVideoContext, C1DRG c1drg) {
        this.LIZ = c19eg;
        this.LIZIZ = e0Var;
        this.LIZJ = c1652400t6M;
        this.LIZLLL = shortVideoContext;
        this.LJ = c1drg;
    }
}

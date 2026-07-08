package X;

import android.text.TextUtils;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.ab.GreenScreenEffectsAIGCInfoFixKillSwitch;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS487S0200000_25;
import kotlin.jvm.internal.AwS55S0200100_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0svb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645730svb implements InterfaceC21363518j3 {
    public final C19GS LIZ;
    public final CreativeInfo LIZIZ;
    public final InterfaceC1650230t2r LIZJ;
    public final InterfaceC1648570t0B LIZLLL;
    public final InterfaceC1645720sva LJ;
    public final q LJFF;
    public final C1DRG LJI;
    public final InterfaceC21358718iH LJII;
    public boolean LJIIIIZZ;
    public AIGCInfo LJIIIZ;
    public String LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final ViewModelProvider LJIIZILJ;
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public boolean LJIILL = true;
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 862));
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 861));
    public final C01GW LJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 863));

    @Override // X.InterfaceC21363518j3
    public final void LIZ() {
        this.LJIIIIZZ = true;
    }

    @Override // X.InterfaceC21363518j3
    public final void LIZJ() {
        this.LJIIIIZZ = this.LJIILIIL;
    }

    @Override // X.InterfaceC21363518j3
    public final void LJ() {
        if (this.LJIILIIL) {
            LJIILJJIL(this.LIZ, null, null, null);
            this.LJIIIIZZ = this.LJIILIIL;
        }
    }

    @Override // X.InterfaceC21363518j3
    public final void LJFF() {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) this.LJIIZILJ.get(ShortVideoContextViewModel.class)).LL;
        if (shortVideoContext != null && this.LJIILIIL) {
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            C1441190nbh c1441190nbh = cameraComponentModel.mDurings;
            BackgroundVideo backgroundVideo = cameraComponentModel.curBackgroundVideo;
            if (backgroundVideo != null) {
                boolean z = !c1441190nbh.isEmpty();
                Iterator<TimeSpeedModelExtension> it2 = c1441190nbh.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getBackgroundVideo(), backgroundVideo)) {
                        z = false;
                    }
                }
                if (z) {
                    C0MZ5.LIZ(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                }
            }
            shortVideoContext.cameraComponentModel.curBackgroundVideo = null;
            this.LJIIJ = "";
            this.LJIIJJI = "";
            this.LJIIIZ = null;
            if (!GreenScreenEffectsAIGCInfoFixKillSwitch.INSTANCE.isEnabled()) {
                LJIILL(shortVideoContext, null);
            }
            LJIILJJIL(this.LIZ, null, null, null);
            C201955140j.LIZ("BackgroundVideo remove BGV");
            this.LJIILIIL = false;
            this.LJIIIIZZ = false;
            LJIIL(0L);
        }
    }

    @Override // X.InterfaceC21363518j3
    public final void LJIIIIZZ() {
        if (this.LJIILIIL) {
            LJIILJJIL(this.LIZ, this.LJIIL, this.LJIIJ, this.LJIIJJI);
        }
    }

    @Override // X.InterfaceC21363518j3
    public final void LIZIZ(AIGCInfo aIGCInfo) {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) this.LJIIZILJ.get(ShortVideoContextViewModel.class)).LL;
        this.LJIIIZ = aIGCInfo;
        if (GreenScreenEffectsAIGCInfoFixKillSwitch.INSTANCE.isEnabled()) {
            shortVideoContext.cameraComponentModel.greenScreenSourceInfos.clear();
            shortVideoContext.cameraComponentModel.greenScreenSourceInfos.add(this.LJIIIZ);
        } else {
            LJIILL(shortVideoContext, this.LJIIIZ);
        }
    }

    @Override // X.InterfaceC21363518j3
    public final void LIZLLL(Effect effect) throws Throwable {
        if (this.LJIIIIZZ) {
            LJIILIIL(this.LJIIJ, this.LJIIJJI, this.LJIIIZ);
            this.LJIIIIZZ = false;
            return;
        }
        boolean zLJIJJ = C1624570sNT.LJIJJ(effect);
        this.LJIILJJIL = zLJIJJ;
        if (zLJIJJ) {
            new C1663260tNs(this.LIZ, this.LIZIZ, effect).LIZ(new AwS569S0100000_25(this, 419), new AwS487S0200000_25(this, effect, 7));
        } else {
            new C1663250tNr(this.LIZ, this.LIZIZ, effect).LIZ(new AwS569S0100000_25(this, 420), new AwS55S0200100_25(this, effect, System.currentTimeMillis(), 0));
        }
    }

    @Override // X.InterfaceC21363518j3
    public final void LJI(String str) {
        this.LJIIL = str;
    }

    @Override // X.InterfaceC21363518j3
    public final void LJIIIZ(Double d) {
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (this.LJIILIIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BackgroundVideo set speed：");
                sbLIZ.append(dDoubleValue);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                this.LJ.Yn(d.doubleValue());
            }
        }
    }

    public final void LJIIL(long j) {
        long maxShootingDuration;
        long j2;
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) this.LJIIZILJ.get(ShortVideoContextViewModel.class)).LL;
        if (shortVideoContext.LJJJJZ()) {
            return;
        }
        if (shortVideoContext.shootMode == 16) {
            maxShootingDuration = 15000;
        } else {
            maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(shortVideoContext.shootMode);
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        String str = shortVideoContext.cameraComponentModel.mMusicPath;
        if (aVMusicExtractAVMusic == null || TextUtils.isEmpty(str) || C1458070o2v.LJ(shortVideoContext.creativeModel.musicBuzModel)) {
            j2 = shortVideoContext.cameraComponentModel.mTotalRecordingTime;
        } else {
            long jLIZ = C579120MnW.LIZ(aVMusicExtractAVMusic, str);
            if (maxShootingDuration > jLIZ) {
                maxShootingDuration = jLIZ;
            }
            j2 = shortVideoContext.cameraComponentModel.mTotalRecordingTime;
        }
        long j3 = maxShootingDuration - j2;
        if (!this.LJIILJJIL && j > 0) {
            if (j3 <= j) {
                j = j3;
            }
            j3 = j;
        }
        long j4 = shortVideoContext.cameraComponentModel.mTotalRecordingTime + j3;
        C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(shortVideoContext, j4);
        shortVideoContext.LJJLIIIJJI(j4);
        this.LIZLLL.ht1(new C531060KsC(j4));
        this.LIZJ.St2().setRecordMaxDuration(j4);
    }

    public static void LJIILL(ShortVideoContext shortVideoContext, AIGCInfo aIGCInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackgroundVideo clear greenScreenSourceInfos, nextAigcInfo=");
        sbLIZ.append(aIGCInfo);
        sbLIZ.append(", previousSize=");
        sbLIZ.append(shortVideoContext.cameraComponentModel.greenScreenSourceInfos.size());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        shortVideoContext.cameraComponentModel.greenScreenSourceInfos.clear();
        if (aIGCInfo != null) {
            shortVideoContext.cameraComponentModel.greenScreenSourceInfos.add(aIGCInfo);
        }
    }

    @Override // X.InterfaceC21363518j3
    public final void LJIIJ(long j, String str) {
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sending interaction message: ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c20012313Rx, "BackgroundVideo", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.sendEffectMsg(41, 41L, j, str);
    }

    @Override // X.InterfaceC21363518j3
    public final void LJIIJJI(String str, C21363418j2 c21363418j2) {
        IVideoLegalCheckerAndToastService videoLegalCheckerAndToastService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).getVideoLegalCheckerAndToastService(this.LIZ);
        if (videoLegalCheckerAndToastService != null) {
            videoLegalCheckerAndToastService.isVideoLengthOrTypeSupportedAndShowErrToast(str, true, 3600000, c21363418j2);
        }
    }

    @Override // X.InterfaceC21363518j3
    public final void LJII(String str, String str2, AIGCInfo aIGCInfo) {
        this.LJIILL = false;
        this.LJIIJ = str;
        this.LJIIJJI = str2;
        this.LJIIIZ = aIGCInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r18, java.lang.String r19, com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1645730svb.LJIILIIL(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo):void");
    }

    public final void LJIILJJIL(C19GS c19gs, String str, String str2, String str3) {
        if (this.LIZLLL.Jv2().LIZJ().booleanValue()) {
            this.LJ.Qn(str, str2, str3);
        }
        InterfaceC1622080sJS interfaceC1622080sJSI2 = this.LJFF.I2(AFwS266S0000000_25.get$arr$(238));
        if (!(interfaceC1622080sJSI2 instanceof StickerVideoStatusHandler)) {
            interfaceC1622080sJSI2 = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) interfaceC1622080sJSI2;
        if (stickerVideoStatusHandler != null && C1624570sNT.LJIJJ(stickerVideoStatusHandler.LLILZ)) {
            stickerVideoStatusHandler.LLIZ = false;
            if (stickerVideoStatusHandler.LLILZIL == 1) {
                stickerVideoStatusHandler.LLILLJJLI.start();
            } else {
                stickerVideoStatusHandler.LLILLJJLI.pause();
            }
        }
    }

    public C1645730svb(C19GS c19gs, CreativeInfo creativeInfo, InterfaceC1650230t2r interfaceC1650230t2r, InterfaceC1648570t0B interfaceC1648570t0B, InterfaceC1645720sva interfaceC1645720sva, l0 l0Var, C1DRG c1drg, C21358618iG c21358618iG) {
        this.LIZ = c19gs;
        this.LIZIZ = creativeInfo;
        this.LIZJ = interfaceC1650230t2r;
        this.LIZLLL = interfaceC1648570t0B;
        this.LJ = interfaceC1645720sva;
        this.LJFF = l0Var;
        this.LJI = c1drg;
        this.LJII = c21358618iG;
        this.LJIIZILJ = (ViewModelProvider) c1drg.LJII(ViewModelProvider.class, null);
    }
}

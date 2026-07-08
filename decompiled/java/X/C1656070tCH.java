package X;

import Y.AObjectS360S0200000_25;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.AwS116S1100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS604S0100000_25;
import pyl.s;

/* JADX INFO: renamed from: X.0tCH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656070tCH {
    public final C19GS LIZ;
    public final InterfaceC2254081DKk LIZIZ;
    public final C1656050tCF<?> LIZJ;
    public final CameraComponentModel LIZLLL;
    public final C1656110tCL LJ;
    public final C385670FAf<Boolean> LJFF;

    public final void LIZ(C1656120tCM c1656120tCM) {
        boolean z;
        if (this.LJ.LJIIJJI && Boolean.FALSE.equals(this.LJFF.LIZJ())) {
            this.LIZJ.H2(new C1448550nnZ(c1656120tCM));
            return;
        }
        if (this.LJ.LJIIL.invoke().booleanValue()) {
            this.LIZJ.qK();
        }
        CameraComponentModel cameraComponentModel = this.LIZLLL;
        InterfaceC2254081DKk interfaceC2254081DKk = this.LIZIZ;
        if (cameraComponentModel.mHardEncode == 1) {
            z = true;
        } else {
            z = false;
        }
        s sVar = c1656120tCM.LIZ;
        C1656110tCL c1656110tCL = this.LJ;
        String absolutePath = c1656120tCM.LJ;
        AObjectS360S0200000_25 aObjectS360S0200000_25 = new AObjectS360S0200000_25(this, c1656120tCM, 1);
        if (cameraComponentModel.recordMode == 1) {
            interfaceC2254081DKk.H4(new AwS604S0100000_25(interfaceC2254081DKk, 170));
        }
        C1656190tCT c1656190tCT = c1656110tCL.LIZIZ;
        float f = c1656190tCT.LIZ;
        int i = c1656190tCT.LIZIZ;
        int i2 = c1656190tCT.LIZJ;
        if (!cameraComponentModel.enableRecordingMp4) {
            if (absolutePath == null) {
                interfaceC2254081DKk.yh(sVar.value(), !z, f, i, i2, new AwS581S0100000_2(aObjectS360S0200000_25, 297));
                return;
            }
        } else if (absolutePath == null) {
            absolutePath = cameraComponentModel.mWorkspace.Ho().getAbsolutePath();
        }
        interfaceC2254081DKk.P4(absolutePath, sVar.value(), new AwS116S1100000_2(aObjectS360S0200000_25, absolutePath, 4));
    }

    public void onEvent(C1656120tCM c1656120tCM) {
        String musicPath;
        boolean z;
        int i;
        if (this.LIZLLL.LIZJ() >= this.LIZLLL.LIZLLL()) {
            this.LIZJ.Sf0(new C0LZD("record_full"));
            return;
        }
        if (!this.LIZLLL.mWorkspace.LJ().exists()) {
            this.LIZLLL.mWorkspace.LJ().mkdirs();
        }
        boolean z2 = c1656120tCM.LJFF;
        if (!this.LJ.LJIIL.invoke().booleanValue() || !this.LIZLLL.LJIIJJI()) {
            CameraComponentModel cameraComponentModel = this.LIZLLL;
            if (cameraComponentModel.recordMode == 0) {
                if (cameraComponentModel.LJIIJJI()) {
                    musicPath = this.LIZLLL.duetContext.duetAudioPath;
                } else {
                    musicPath = this.LIZLLL.getMusicPath();
                }
                if (musicPath != null) {
                    if (this.LIZLLL.LJII()) {
                        this.LIZIZ.G4("", 0L, 0L, false, true, false, 0, -1L);
                    } else {
                        InterfaceC2254081DKk interfaceC2254081DKk = this.LIZIZ;
                        long jLJ = this.LIZLLL.LJ();
                        long jLIZJ = this.LIZLLL.LIZJ();
                        CameraComponentModel cameraComponentModel2 = this.LIZLLL;
                        if (!cameraComponentModel2.isLoopSwitchOnByAIGC && !cameraComponentModel2.isLoopSwitchOnByGameEffect && !cameraComponentModel2.isLoopSwitchOnByMusic) {
                            z = false;
                        } else {
                            z = true;
                        }
                        long jLIZJ2 = cameraComponentModel2.LIZJ();
                        int i2 = cameraComponentModel2.maxMusicLoopDuration;
                        if (i2 > 0 && jLIZJ2 <= i2 && jLIZJ2 <= i2) {
                            i = i2 - ((int) jLIZJ2);
                        } else {
                            i = 0;
                        }
                        interfaceC2254081DKk.G4(musicPath, jLJ, jLIZJ, z, true, z2, i, this.LIZLLL.musicEndTime);
                    }
                }
            }
        }
        this.LIZJ.L6(false);
        this.LIZJ.N6(false);
        this.LIZJ.W2();
        this.LJ.LJI.run();
        LIZ(c1656120tCM);
    }

    public C1656070tCH(C19GS c19gs, InterfaceC1650230t2r interfaceC1650230t2r, C1656050tCF c1656050tCF, C1656110tCL c1656110tCL) {
        this.LIZ = c19gs;
        this.LIZIZ = interfaceC1650230t2r.St2();
        this.LIZJ = c1656050tCF;
        this.LIZLLL = interfaceC1650230t2r.pw0();
        this.LJ = c1656110tCL;
        this.LJFF = interfaceC1650230t2r.yj1();
    }
}

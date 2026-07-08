package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450320nqQ extends AbstractC1450210nqF {
    public C1452910nub LIZ;

    @Override // X.AbstractC1450210nqF
    public final String LIZIZ() {
        return "loop_model";
    }

    @Override // X.AbstractC1450210nqF
    public final void LIZ(C1450180nqC c1450180nqC) {
        NLETrackSlot nLETrackSlotLIZIZ;
        int duration;
        long duration2;
        NLETrack mainTrack;
        InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
        if (interfaceC1452170ntP != null) {
            NLEModel nLEModelLIZ = C1450170nqB.LIZ(c1450180nqC);
            interfaceC1452170ntP.setLoopPlay(true);
            NLETrack mainTrack2 = nLEModelLIZ.getMainTrack();
            if (mainTrack2 != null) {
                mainTrack2.clearSlot();
            }
            SrcLiveVideoInfo srcLiveInfo = c1450180nqC.LIZ.getSrcLiveInfo();
            if (srcLiveInfo != null) {
                nLETrackSlotLIZIZ = C1450170nqB.LIZIZ(srcLiveInfo);
            } else {
                nLETrackSlotLIZIZ = null;
            }
            if (c1450180nqC.LIZJ.livePhotoModel == null) {
                return;
            }
            if (nLETrackSlotLIZIZ != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null) {
                mainTrack.addSlot(nLETrackSlotLIZIZ);
            }
            interfaceC1452170ntP.Ve(nLEModelLIZ);
            SrcLiveVideoInfo srcLiveInfo2 = c1450180nqC.LIZ.getSrcLiveInfo();
            if (srcLiveInfo2 != null) {
                if (nLETrackSlotLIZIZ != null) {
                    duration2 = nLETrackSlotLIZIZ.getDuration();
                } else {
                    duration2 = 0;
                }
                srcLiveInfo2.setDuration(C352310DrZ.LIZ(duration2));
            }
            NLETrack mainTrack3 = nLEModelLIZ.getMainTrack();
            if (mainTrack3 != null) {
                SrcLiveVideoInfo srcLiveInfo3 = c1450180nqC.LIZ.getSrcLiveInfo();
                if (srcLiveInfo3 != null) {
                    duration = srcLiveInfo3.getDuration();
                } else {
                    duration = LivePreCreateNextRoomPlayer.ENABLE;
                }
                mainTrack3.setEndTime(((long) duration) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
        }
    }

    @Override // X.AbstractC1450210nqF
    public final void LIZJ(C1450180nqC c1450180nqC) {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSession2;
        INLEPlayer playerApi2;
        INLEMediaSession iNLEMediaSession3;
        INLEPlayer playerApi3;
        C348100Dkm c348100DkmLIZIZ2;
        INLEMediaSession iNLEMediaSession4;
        INLEPlayer playerApi4;
        InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
        if (interfaceC1452170ntP != null) {
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1450180nqC, 832);
            if (((Boolean) awS566S0100000_22.invoke()).booleanValue()) {
                C1452910nub c1452910nub = this.LIZ;
                if (c1452910nub != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (iNLEMediaSession4 = c348100DkmLIZIZ2.LIZIZ) != null && (playerApi4 = iNLEMediaSession4.getPlayerApi()) != null) {
                    playerApi4.removePlayerInfoListener(c1452910nub);
                }
                C1452910nub c1452910nub2 = new C1452910nub(interfaceC1452170ntP, awS566S0100000_22);
                C348100Dkm c348100DkmLIZIZ3 = C352130DrH.LIZIZ(interfaceC1452170ntP);
                if (c348100DkmLIZIZ3 != null && (iNLEMediaSession3 = c348100DkmLIZIZ3.LIZIZ) != null && (playerApi3 = iNLEMediaSession3.getPlayerApi()) != null) {
                    playerApi3.addPlayerInfoListener(c1452910nub2);
                }
                this.LIZ = c1452910nub2;
                C348100Dkm c348100DkmLIZIZ4 = C352130DrH.LIZIZ(interfaceC1452170ntP);
                if (c348100DkmLIZIZ4 != null && (iNLEMediaSession2 = c348100DkmLIZIZ4.LIZIZ) != null && (playerApi2 = iNLEMediaSession2.getPlayerApi()) != null) {
                    playerApi2.play();
                    return;
                }
                return;
            }
            C1452910nub c1452910nub3 = this.LIZ;
            if (c1452910nub3 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) == null || (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
                return;
            }
            playerApi.removePlayerInfoListener(c1452910nub3);
        }
    }

    @Override // X.AbstractC1450210nqF
    public final Integer LIZLLL(C1450180nqC c1450180nqC) {
        SrcLiveVideoInfo srcLiveInfo = c1450180nqC.LIZ.getSrcLiveInfo();
        if (srcLiveInfo != null) {
            return Integer.valueOf(srcLiveInfo.getDuration());
        }
        return null;
    }

    @Override // X.AbstractC1450210nqF
    public final void LJ(C1450180nqC c1450180nqC) {
        C1452910nub c1452910nub;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
        if (interfaceC1452170ntP != null && (c1452910nub = this.LIZ) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.removePlayerInfoListener(c1452910nub);
        }
    }

    @Override // X.AbstractC1450210nqF
    public final void LJFF(C1450180nqC c1450180nqC, final InterfaceC1450310nqP interfaceC1450310nqP) {
        InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.jg();
        }
        NLEModel nLEModelLIZ = C1450170nqB.LIZ(c1450180nqC);
        if (interfaceC1450310nqP != null) {
            interfaceC1450310nqP.LIZIZ();
        }
        final InterfaceC1452170ntP interfaceC1452170ntP2 = c1450180nqC.LJ;
        if (interfaceC1452170ntP2 != null) {
            C1449990npt c1449990npt = C1449990npt.LIZ;
            C1463670oBx c1463670oBx = (C1463670oBx) interfaceC1452170ntP2;
            SingleImageData singleImageData = c1450180nqC.LIZ;
            c1449990npt.getClass();
            C1449990npt.LJI(c1463670oBx, nLEModelLIZ, singleImageData);
            c1463670oBx.LIZLLL().LIZIZ.getMediaRuntimeApi().setPreviewFillMode(NLEPlayerPreviewMode.FILL);
            c1463670oBx.LIZLLL().LIZIZ.getPlayerApi().prepare();
            c1463670oBx.bg(0, new InterfaceC1464140oCi() { // from class: X.0nqT
                @Override // X.InterfaceC1464140oCi
                public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f) {
                    C0CNO.LIZLLL(0L, new AwS266S0300000_22(interfaceC1452170ntP2, interfaceC1450310nqP, this, 22));
                    return 0;
                }
            });
        }
    }
}

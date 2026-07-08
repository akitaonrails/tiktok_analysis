package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import java.util.List;
import kotlin.jvm.internal.AwS150S0400000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450330nqR extends AbstractC1450210nqF {
    public INLEPurePlayer.INLEPurePlayerInfoListener LIZ;

    @Override // X.AbstractC1450210nqF
    public final String LIZIZ() {
        return "live_model";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    @Override // X.AbstractC1450210nqF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1450180nqC r13) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1450330nqR.LIZ(X.0nqC):void");
    }

    @Override // X.AbstractC1450210nqF
    public final void LIZJ(C1450180nqC c1450180nqC) {
        LJIIIIZZ(c1450180nqC, true);
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
        INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
        if (interfaceC1452170ntP != null && (iNLEPurePlayerInfoListener = this.LIZ) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.removePlayerInfoListener(iNLEPurePlayerInfoListener);
        }
    }

    @Override // X.AbstractC1450210nqF
    public final void LJFF(final C1450180nqC c1450180nqC, final InterfaceC1450310nqP interfaceC1450310nqP) {
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
            c1463670oBx.bg(0, new InterfaceC1464140oCi() { // from class: X.0nqS
                @Override // X.InterfaceC1464140oCi
                public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f) {
                    C0CNO.LIZLLL(0L, new AwS150S0400000_22(interfaceC1452170ntP2, interfaceC1450310nqP, this, c1450180nqC, 3));
                    return 0;
                }
            });
        }
    }

    public final void LJIIIIZZ(final C1450180nqC c1450180nqC, boolean z) {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        List<SingleImageData> imageList;
        C348100Dkm c348100DkmLIZIZ2;
        INLEMediaSession iNLEMediaSession2;
        INLEPlayer playerApi2;
        INLEMediaSession iNLEMediaSession3;
        INLEPlayer playerApi3;
        C348100Dkm c348100DkmLIZIZ3;
        INLEMediaSession iNLEMediaSession4;
        INLEPlayer playerApi4;
        C348100Dkm c348100DkmLIZIZ4;
        INLEMediaSession iNLEMediaSession5;
        INLEPlayer playerApi5;
        C348100Dkm c348100DkmLIZIZ5;
        INLEMediaSession iNLEMediaSession6;
        INLEPlayer playerApi6;
        INLEMediaSession iNLEMediaSession7;
        INLEPlayer playerApi7;
        C348100Dkm c348100DkmLIZIZ6;
        INLEMediaSession iNLEMediaSession8;
        INLEPlayer playerApi8;
        if (C295810Bid.LIZ()) {
            InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
            if (interfaceC1452170ntP != null) {
                AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1450180nqC, 830);
                if (((Boolean) awS566S0100000_22.invoke()).booleanValue()) {
                    INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener = this.LIZ;
                    if (iNLEPurePlayerInfoListener != null && (c348100DkmLIZIZ6 = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (iNLEMediaSession8 = c348100DkmLIZIZ6.LIZIZ) != null && (playerApi8 = iNLEMediaSession8.getPlayerApi()) != null) {
                        playerApi8.removePlayerInfoListener(iNLEPurePlayerInfoListener);
                    }
                    C1452910nub c1452910nub = new C1452910nub(interfaceC1452170ntP, awS566S0100000_22);
                    C348100Dkm c348100DkmLIZIZ7 = C352130DrH.LIZIZ(interfaceC1452170ntP);
                    if (c348100DkmLIZIZ7 != null && (iNLEMediaSession7 = c348100DkmLIZIZ7.LIZIZ) != null && (playerApi7 = iNLEMediaSession7.getPlayerApi()) != null) {
                        playerApi7.addPlayerInfoListener(c1452910nub);
                    }
                    this.LIZ = c1452910nub;
                    if (z && (c348100DkmLIZIZ5 = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null && (iNLEMediaSession6 = c348100DkmLIZIZ5.LIZIZ) != null && (playerApi6 = iNLEMediaSession6.getPlayerApi()) != null) {
                        playerApi6.play();
                        return;
                    }
                    return;
                }
                INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener2 = this.LIZ;
                if (iNLEPurePlayerInfoListener2 == null || (c348100DkmLIZIZ4 = C352130DrH.LIZIZ(interfaceC1452170ntP)) == null || (iNLEMediaSession5 = c348100DkmLIZIZ4.LIZIZ) == null || (playerApi5 = iNLEMediaSession5.getPlayerApi()) == null) {
                    return;
                }
                playerApi5.removePlayerInfoListener(iNLEPurePlayerInfoListener2);
                return;
            }
            return;
        }
        final InterfaceC1452170ntP interfaceC1452170ntP2 = c1450180nqC.LJ;
        if (interfaceC1452170ntP2 == null) {
            return;
        }
        ImageAlbumData imageAlbumData = c1450180nqC.LIZJ.imageAlbumModel;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() == 1) {
            INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener3 = this.LIZ;
            if (iNLEPurePlayerInfoListener3 != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(interfaceC1452170ntP2)) != null && (iNLEMediaSession4 = c348100DkmLIZIZ3.LIZIZ) != null && (playerApi4 = iNLEMediaSession4.getPlayerApi()) != null) {
                playerApi4.removePlayerInfoListener(iNLEPurePlayerInfoListener3);
            }
            INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener4 = new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.0nqU
                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPlayEnd() {
                    C01TT.LIZIZ(1500L, new AwS266S0300000_22(c1450180nqC, interfaceC1452170ntP2, this, 21));
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onFirstFrameRender() {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPlayerPause() {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPrepared() {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPrepared(this);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
                public final void onPlayTime(int i, long j) {
                    INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(this, i, j);
                }
            };
            this.LIZ = iNLEPurePlayerInfoListener4;
            C348100Dkm c348100DkmLIZIZ8 = C352130DrH.LIZIZ(interfaceC1452170ntP2);
            if (c348100DkmLIZIZ8 != null && (iNLEMediaSession3 = c348100DkmLIZIZ8.LIZIZ) != null && (playerApi3 = iNLEMediaSession3.getPlayerApi()) != null) {
                playerApi3.addPlayerInfoListener(iNLEPurePlayerInfoListener4);
            }
            if (!z || (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP2)) == null || (iNLEMediaSession2 = c348100DkmLIZIZ2.LIZIZ) == null || (playerApi2 = iNLEMediaSession2.getPlayerApi()) == null) {
                return;
            }
            playerApi2.play();
            return;
        }
        INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener5 = this.LIZ;
        if (iNLEPurePlayerInfoListener5 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP2)) == null || (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
            return;
        }
        playerApi.removePlayerInfoListener(iNLEPurePlayerInfoListener5);
    }
}

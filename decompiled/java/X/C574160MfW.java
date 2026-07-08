package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0MfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574160MfW {
    public static final /* synthetic */ int LIZLLL = 0;
    public InterfaceC1452170ntP LIZ;
    public boolean LIZIZ;
    public final List<Integer> LIZJ = new ArrayList();

    public final void LIZ() {
        if (this.LIZ == null || C580130Mp9.LIZ(this.LIZJ)) {
            return;
        }
        int size = ((ArrayList) this.LIZJ).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Number) ListProtector.get(this.LIZJ, i)).intValue();
        }
        ((ArrayList) this.LIZJ).clear();
        this.LIZ.ig(iArr);
    }

    public final void LIZIZ(List<? extends VideoSegment> list) {
        C348100Dkm c348100DkmLIZIZ;
        boolean z;
        String strLJIJ;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        NLEResType resourceType;
        C533730KwV.LIZ.getClass();
        if (C1444820nhY.LIZIZ && this.LIZ != null && list != null && !list.isEmpty()) {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ;
            if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null) {
                VecNLETrackSlotSPtr slots = mainTrack.getSlots();
                if (!(slots instanceof Collection) || !slots.isEmpty()) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                            if (resource != null) {
                                resourceType = resource.getResourceType();
                            } else {
                                resourceType = null;
                            }
                            if (resourceType == NLEResType.IMAGE) {
                                VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
                                if (!(videoEffects instanceof Collection) || !videoEffects.isEmpty()) {
                                    for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                                        int i = C365960EWk.LIZ;
                                        if (C365960EWk.LIZIZ(nLEVideoEffect)) {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if (!this.LIZIZ) {
                return;
            }
            if (!C580130Mp9.LIZ(list)) {
                for (VideoSegment videoSegment : list) {
                    if (!videoSegment.isDeleted) {
                        C533730KwV c533730KwV = C533730KwV.LIZ;
                        String strLJFF = videoSegment.LJFF(false);
                        c533730KwV.getClass();
                        if (!C533730KwV.LJIIJ(strLJFF)) {
                            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_remove_sound_sync_image_zoom", true, false)) {
                                return;
                            }
                            int i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                            InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ;
                            if (interfaceC1452170ntP2 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP2)) == null) {
                                return;
                            }
                            C348390DlF c348390DlF = new C348390DlF();
                            C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C1939607ik(list), AFwS239S0000000_8.get$arr$(115)));
                            while (c08qt.hasNext()) {
                                VideoSegment videoSegment2 = (VideoSegment) c08qt.next();
                                long jLIZLLL = videoSegment2.LIZLLL() - videoSegment2.LJII();
                                String strLJFF2 = videoSegment2.LJFF(false);
                                if (!C2471909mP.LJJIIZI(strLJFF2) && ((strLJIJ = C08QA.LJIJ(new C0VSJ(strLJFF2))) == null || strLJIJ.length() == 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (C2471909mP.LJJIII(strLJFF2, z, 4)) {
                                    videoSegment2.imageTranslationType = i2;
                                    VEImageTransformFilterParam vEImageTransformFilterParamLIZ = C574230Mfd.LIZ(i2);
                                    if (vEImageTransformFilterParamLIZ != null) {
                                        C574140MfU c574140MfU = new C574140MfU();
                                        c348390DlF.LIZ.add(c574140MfU);
                                        C346700DiW c346700DiW = new C346700DiW();
                                        c346700DiW.LIZIZ = vEImageTransformFilterParamLIZ.beginScale;
                                        c346700DiW.LIZJ = vEImageTransformFilterParamLIZ.endScale;
                                        c346700DiW.LIZ = jLIZLLL;
                                        c574140MfU.LJIILL = c346700DiW;
                                        c574140MfU.LJIILIIL = strLJFF2;
                                    }
                                } else {
                                    int i3 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                                    if (i2 == i3) {
                                        i3 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                                    }
                                    i2 = i3;
                                }
                            }
                            if (!c348390DlF.LIZ.isEmpty()) {
                                c348100DkmLIZIZ.LIZJ().LJJIII(c348390DlF);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            Iterator<? extends VideoSegment> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
            }
        }
    }

    public final void LIZJ(VideoSegment videoSegment, boolean z) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        VEImageTransformFilterParam vEImageTransformFilterParamLIZ;
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        C0FWA c0fwaLIZJ;
        C533730KwV.LIZ.getClass();
        if (C1444820nhY.LIZIZ && (interfaceC1452170ntP = this.LIZ) != null && videoSegment != null) {
            if (z) {
                if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null && (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) != null && (c0fwaLIZJ = c348100DkmLIZLLL.LIZJ()) != null) {
                    c0fwaLIZJ.LJJJJJL();
                }
            } else {
                LIZ();
            }
            if (this.LIZIZ && C2471909mP.LJJIII(videoSegment.LJFF(false), false, 4) && (vEImageTransformFilterParamLIZ = C574230Mfd.LIZ(videoSegment.imageTranslationType)) != null) {
                if (z) {
                    InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ;
                    if (interfaceC1452170ntP2 != null) {
                        C348390DlF c348390DlF = new C348390DlF();
                        C574140MfU c574140MfU = new C574140MfU();
                        C346700DiW c346700DiW = new C346700DiW();
                        c346700DiW.LIZIZ = vEImageTransformFilterParamLIZ.beginScale;
                        c346700DiW.LIZJ = vEImageTransformFilterParamLIZ.endScale;
                        c346700DiW.LIZ = videoSegment.LIZLLL() - videoSegment.LJII();
                        c574140MfU.LJIILL = c346700DiW;
                        c574140MfU.LJIILIIL = videoSegment.LJFF(false);
                        c348390DlF.LIZ.add(c574140MfU);
                        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP2);
                        if (c348100DkmLIZIZ != null) {
                            c348100DkmLIZIZ.LIZJ().LJJIII(c348390DlF);
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    return;
                }
                int iVf = this.LIZ.vf(vEImageTransformFilterParamLIZ, (int) videoSegment.LJII(), (int) (videoSegment.LIZLLL() - videoSegment.LJII()));
                this.LIZ.updateTrackFilterParam(iVf, vEImageTransformFilterParamLIZ);
                ((ArrayList) this.LIZJ).add(Integer.valueOf(iVf));
            }
        }
    }
}

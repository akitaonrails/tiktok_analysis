package X;

import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Eq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376890Eq7 {
    public static final C376890Eq7 LIZ = new C376890Eq7();

    @InterfaceC1294060jmO
    public static NLEModel LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String nleData;
        NLEModel nleModel;
        NLENode nLENodeDeepClone = null;
        if (videoPublishEditModel != null) {
            nleData = videoPublishEditModel.getNleData();
        } else {
            nleData = null;
        }
        if (C350300DoK.LIZ() && videoPublishEditModel != null && !videoPublishEditModel.getNleDataChange() && videoPublishEditModel.getNleModel() != null) {
            if (videoPublishEditModel != null && (nleModel = videoPublishEditModel.getNleModel()) != null) {
                nLENodeDeepClone = nleModel.deepClone();
            }
            return NLEModel.dynamicCast(nLENodeDeepClone);
        }
        if (!C123100dR.LIZ(nleData)) {
            return null;
        }
        C0FGC.LIZ(2);
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.restore(nleData);
        NLEModel model = nLEEditorLIZ.getModel();
        if (C350300DoK.LIZ() && videoPublishEditModel != null) {
            videoPublishEditModel.setNleDataChange(false);
            if (model != null) {
                nLENodeDeepClone = model.deepClone();
            }
            videoPublishEditModel.setNleModel(NLEModel.dynamicCast(nLENodeDeepClone));
        }
        return model;
    }

    public static boolean LIZJ(NLEModel nLEModel) {
        NLECanvasType type;
        NLEStyCanvas canvasStyle;
        if (nLEModel == null) {
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : arrayList2) {
            NLECanvasType nLECanvasType = NLECanvasType.IMAGE;
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null) {
                type = canvasStyle.getType();
            } else {
                type = null;
            }
            if (nLECanvasType == type || nLETrackSlot.getAIMatting() != null || C351220Dpo.LLIZLLLIL(nLETrackSlot)) {
                return true;
            }
        }
        return false;
    }

    public static Pair LIZLLL(NLEModel nLEModel) {
        int i;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        boolean z = false;
        long duration = 0;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(slots, 10));
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getMainSegment());
            }
            Iterator it3 = arrayList.iterator();
            i = 0;
            while (it3.hasNext()) {
                i++;
                duration = ((NLESegment) it3.next()).getDuration();
            }
        } else {
            i = 0;
        }
        if (i == 1) {
            z = true;
        }
        return new Pair(Boolean.valueOf(z), Long.valueOf(duration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    /* JADX WARN: Type inference failed for: r0v211 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [com.bytedance.ies.nle.editor_jni.NLENode] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376890Eq7.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.Boolean");
    }

    public static boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getEditorProModel().getMagicResourcePaths().isEmpty() && ((ArrayList) C1416310mxZ.LJJIJLIJ(videoPublishEditModel)).isEmpty()) {
            if (C123100dR.LIZ(videoPublishEditModel.getNleData())) {
                boolean zLIZ = C350300DoK.LIZ();
                if (zLIZ && !videoPublishEditModel.getNleDataChange() && videoPublishEditModel.getNleModel() != null) {
                    if (C357540E0a.LJII(videoPublishEditModel.getNleModel()) <= 0) {
                        return false;
                    }
                } else {
                    C0FGC.LIZ(2);
                    NLEEditor nLEEditor = new NLEEditor();
                    nLEEditor.restore(videoPublishEditModel.getNleData());
                    if (zLIZ) {
                        videoPublishEditModel.setNleModel(nLEEditor.getModel());
                        videoPublishEditModel.setNleDataChange(false);
                    }
                    if (C357540E0a.LJII(nLEEditor.getModel()) > 0) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (!LJIIIZ(videoPublishEditModel)) {
            return false;
        }
        for (EffectPointModel effectPointModel : (ArrayList) C1416310mxZ.LJJIJLIJ(videoPublishEditModel)) {
            if (effectPointModel.isMagic()) {
                C376890Eq7 c376890Eq7 = LIZ;
                String extra = effectPointModel.getExtra();
                c376890Eq7.getClass();
                try {
                    if (!(!Intrinsics.LJFF(new JSONObject(extra).optString("GamePlayResourceSubType"), "slow_motion"))) {
                        return false;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        String resourceId;
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it2 = videoPublishEditModel.deepCopyFinalVideoList().iterator();
        while (it2.hasNext()) {
            SimpleEffect effectInfo = it2.next().getEffectInfo();
            if (effectInfo != null && (resourceId = effectInfo.getResourceId()) != null) {
                arrayList.add(resourceId);
            }
        }
        String[] strArr = C376920EqA.LIZ;
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (!C13LQ.LJIILLIIL(it3.next(), C376920EqA.LIZ)) {
                    if (!videoPublishEditModel.getEditMusicSyncMode()) {
                        return false;
                    }
                }
            }
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel) || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isStoryEditMode() || videoPublishEditModel.isPhotoMvMode()) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        NLETrack nLETrackLIZLLL;
        if (videoPublishEditModel.hasExtendMusic() && C349930Dnj.LIZ(videoPublishEditModel, nLEModel, false)) {
            if (nLEModel == null || (nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModel)) == null) {
                return false;
            }
            Iterator<NLETrackSlot> it2 = nLETrackLIZLLL.getSlots().iterator();
            while (it2.hasNext()) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(it2.next().getMainSegment());
                if (nLESegmentAudioDynamicCast != null && nLESegmentAudioDynamicCast.getVolume() > 0.0f) {
                    return true;
                }
            }
            return false;
        }
        if (videoPublishEditModel.getMusicVolume() > 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x024b, code lost:
    
        if (X.C13LP.LJJJJ(r0, r1) == false) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(X.C376890Eq7 r9, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376890Eq7.LJFF(X.0Eq7, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public final boolean LJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        Integer num;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && ((((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ() && !aVMusicExtractAVMusic.isCommerceMusic()) || aVMusicExtractAVMusic.isLocalMusic())) {
            return false;
        }
        NLEModel nLEModelLIZIZ = LIZIZ(videoPublishEditModel);
        Pair pairLIZLLL = LIZLLL(nLEModelLIZIZ);
        if (((((Boolean) pairLIZLLL.getFirst()).booleanValue() && LJII(this, videoPublishEditModel, nLEModelLIZIZ, ((Number) pairLIZLLL.getSecond()).longValue(), z, false, 16)) || !((Boolean) pairLIZLLL.getFirst()).booleanValue()) && ((videoPublishEditModel.getVideoEditorType() == 10 || videoPublishEditModel.getVideoEditorType() == 11) && !C1428470nHB.LJJZZI(videoPublishEditModel) && !videoPublishEditModel.isCurrentAutoCutMode() && !C1428470nHB.LLIIJI(videoPublishEditModel) && !C1428470nHB.LJLJL(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel) && (((videoPublishEditModel.hasMusic() && LIZ(videoPublishEditModel, nLEModelLIZIZ)) || z) && ((!videoPublishEditModel.hasExtendMusic() || C349930Dnj.LIZ(videoPublishEditModel, nLEModelLIZIZ, false)) && !C1416310mxZ.LJJIL(videoPublishEditModel) && !C0BVZ.LIZIZ(videoPublishEditModel, nLEModelLIZIZ, true) && !videoPublishEditModel.isTimeEffectApply() && !videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && !C0CHQ.LIZ().getAccountService().LIZ() && !((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount() && C376930EqB.LIZ() && LJIIJJI(videoPublishEditModel) && (videoPublishEditModel.getVideoLength() <= 30000 || z))))) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if ((!creativeModel.draftInfoModel.isDraft || (((num = creativeModel.ugcTemplateData.ugcTemplateVersion) != null && num.intValue() == 1) || videoPublishEditModel.isFromRestoreRecover())) && LJIIIIZZ(videoPublishEditModel, nLEModelLIZIZ, z)) {
                if (LIZJ(nLEModelLIZIZ) && !z) {
                    C201955140j.LIZIZ("UgcTemplateChecker", " using cutout or videoBg but but it's not in the createmplate tool");
                } else if (!Intrinsics.LJFF(videoPublishEditModel.mShootWay, "lv_sync") && (nLEModelLIZIZ == null || videoPublishEditModel.isCurrentAutoCutMode() || !C0EYQ.LJIILL(nLEModelLIZIZ))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, boolean z) {
        if (!LJIIIZ(videoPublishEditModel)) {
            return true;
        }
        if (!LJIIJ(videoPublishEditModel)) {
            C201955140j.LIZIZ("UgcTemplateChecker", " using unsupported magic");
            return false;
        }
        if (!z && nLEModel != null && C351220Dpo.LIZLLL(nLEModel) && !((Boolean) C273800AoE.LIZ.getValue()).booleanValue()) {
            return false;
        }
        Iterator it2 = ((ArrayList) C1416310mxZ.LJJIJLIJ(videoPublishEditModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                EffectPointModel effectPointModel = (EffectPointModel) it2.next();
                if (C123100dR.LIZ(effectPointModel.getExtra())) {
                    try {
                        if (!Intrinsics.LJFF(new JSONObject(effectPointModel.getExtra()).optString("game_play_type", ""), EnumC1429610nJ1.EDIT_EFFECT_COMBINED.getType())) {
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } else if (z) {
                            if (!((Boolean) C0B7O.LIZ.getValue()).booleanValue()) {
                                C353560Dta.LIZ.getClass();
                                if (!C353560Dta.LJ(videoPublishEditModel)) {
                                    return false;
                                }
                            }
                        } else {
                            return ((Boolean) C264390AXt.LIZ.getValue()).booleanValue();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            } else if (z) {
                if (!((Boolean) C287330BNz.LIZ.getValue()).booleanValue()) {
                    C353560Dta.LIZ.getClass();
                    if (C353560Dta.LJ(videoPublishEditModel)) {
                        return true;
                    }
                    return false;
                }
            } else {
                return ((Boolean) C264330AXn.LIZ.getValue()).booleanValue();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x03d9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII(X.C376890Eq7 r10, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11, com.bytedance.ies.nle.editor_jni.NLEModel r12, long r13, boolean r15, boolean r16, int r17) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376890Eq7.LJII(X.0Eq7, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel, long, boolean, boolean, int):boolean");
    }
}

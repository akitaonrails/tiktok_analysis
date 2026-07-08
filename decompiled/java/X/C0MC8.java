package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS3S1010000_8;

/* JADX INFO: renamed from: X.0MC8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MC8 implements InterfaceC558740Lvk {
    public static final C0MC9 LLILZ = new Object() { // from class: X.0MC9
    };
    public static final int LLILZIL = 8;
    public final NLEEditor LL;
    public final String LLILLJJLI = "BaseAILiveDataManager";
    public long LLILLL = -1;

    @Override // X.InterfaceC558740Lvk
    public String getTaskType() {
        return "PostProcess";
    }

    @Override // X.InterfaceC558740Lvk
    public String getSource() {
        return Source.EDIT_AI_LIVE_PHOTO.getSource();
    }

    @Override // X.InterfaceC558740Lvk
    public long getStartTime() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC558740Lvk
    public String getTag() {
        return this.LLILLJJLI;
    }

    public C0MC8(NLEEditor nLEEditor) {
        this.LL = nLEEditor;
    }

    public final NLETrackSlot LIZJ(String str) {
        NLETrackSlot nLETrackSlotLJIIJ = C352250DrT.LJIIJ(this.LL.getModel(), str);
        if (nLETrackSlotLJIIJ == null || !C351220Dpo.LLJJIJIL(nLETrackSlotLJIIJ)) {
            return null;
        }
        return nLETrackSlotLJIIJ;
    }

    @Override // X.InterfaceC558740Lvk
    public void bm(long j) {
        this.LLILLL = j;
    }

    private final void LJFF(NLETrackSlot nLETrackSlot, CreativeModel creativeModel) {
        boolean z;
        NLEStyClip nLEStyClip;
        CanvasFilterParam canvasFilterParam;
        CanvasVideoData canvasVideoData = creativeModel.aiLivePhotoModel.originCanvasVideoData;
        if (canvasVideoData == null) {
            return;
        }
        C348350DlB.LJIIL(nLETrackSlot);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        List<CanvasVideoData> list = canvasVideoData.externalTracks;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C348350DlB.LJIILIIL(nLEStyCanvas, z);
        C1450410nqZ.LIZ(nLEStyCanvas, canvasVideoData.background);
        if (nLESegmentVideoDynamicCast != null) {
            nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
        }
        List<CanvasFilterParam> transformList = canvasVideoData.getTransformList();
        if (transformList != null && (canvasFilterParam = (CanvasFilterParam) ListProtector.get(transformList, 0)) != null) {
            Iterator it2 = ((ArrayList) C1444940nhk.LJIJI(canvasFilterParam)).iterator();
            while (it2.hasNext()) {
                C1450410nqZ.LIZIZ(nLETrackSlot, nLEStyCanvas, (VEBaseFilterParam) it2.next());
            }
        }
        if (nLESegmentVideoDynamicCast != null) {
            Object obj = canvasVideoData.nleClip;
            if (obj instanceof NLEStyClip) {
                nLEStyClip = (NLEStyClip) obj;
            } else {
                nLEStyClip = null;
            }
            nLESegmentVideoDynamicCast.setClip(nLEStyClip);
        }
        canvasVideoData.setCropData(null);
    }

    @Override // X.InterfaceC558740Lvk
    public boolean F30(CreativeModel creativeModel, C0LSZ c0lsz) {
        NLETrack mainTrack;
        NLETrackSlot next;
        int iCeil;
        NLETrack mainTrack2;
        long duration;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLEModel model = this.LL.getModel();
        if (model == null || (mainTrack = model.getMainTrack()) == null) {
            return false;
        }
        long measuredEndTime = mainTrack.getMeasuredEndTime();
        NLETrackSlot nLETrackSlotLIZIZ = LIZIZ(creativeModel, this.LL, c0lsz);
        if (nLETrackSlotLIZIZ == null) {
            return false;
        }
        Iterator<NLETrackSlot> it2 = this.LL.getModel().getMainTrack().getSlots().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLJJIJIL(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrackSlot nLETrackSlot2 = next;
        if (nLETrackSlot2 == null) {
            C559010LwB.LIZ(getTag(), "updateNLEIfFinish fail, originSlot is null");
            return false;
        }
        C0MCR.LIZ.getClass();
        C0MCR.LIZLLL(nLETrackSlot2, nLETrackSlotLIZIZ);
        C0MCR.LIZ(creativeModel.aiLivePhotoModel.transitionModel, this.LL.getModel(), nLETrackSlot2);
        NLEEditor nLEEditor = this.LL;
        NLEModel model2 = nLEEditor.getModel();
        if (model2 != null && (mainTrack2 = model2.getMainTrack()) != null) {
            float fLJIILL = ((long) C0C64.LJIILLIIL().LJIILL(31744, "studio_story_ai_live_photo_duration_threshold", true, 8.0f)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT) * 1000;
            long maxEnd = mainTrack2.getMaxEnd();
            iCeil = (int) Math.ceil(fLJIILL / maxEnd);
            NLETrack nLETrackLIZIZ = C0EYQ.LIZIZ(nLEEditor.getModel());
            if (nLETrackLIZIZ != null) {
                VecNLETrackSlotSPtr sortedSlots = nLETrackLIZIZ.getSortedSlots();
                if (sortedSlots != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, sortedSlots)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                    duration = resource.getDuration();
                } else {
                    duration = 0;
                }
                if (((long) iCeil) * maxEnd > duration) {
                    iCeil = Math.min(iCeil, (int) (duration / maxEnd));
                }
            }
        } else {
            iCeil = 1;
        }
        C0MCR.LJI(this.LL, nLETrackSlotLIZIZ, iCeil);
        C346810Dih.LIZ(measuredEndTime, this.LL);
        C385050F7v.LJ(this.LL);
        return true;
    }

    @Override // X.InterfaceC558740Lvk
    public void Fx(CreativeModel creativeModel, C0LSZ c0lsz) {
        AILivePhotoModel aILivePhotoModel = creativeModel.aiLivePhotoModel;
        UsageStatus usageStatus = UsageStatus.FAIL;
        aILivePhotoModel.lastFailProgressModel = C545800Las.LIZ(aILivePhotoModel, usageStatus, c0lsz);
        if (!creativeModel.aiLivePhotoModel.LJIIL()) {
            AILivePhotoModel aILivePhotoModel2 = creativeModel.aiLivePhotoModel;
            aILivePhotoModel2.progressModel = C545800Las.LIZ(aILivePhotoModel2, usageStatus, c0lsz);
        }
        NLETrackSlot nLETrackSlotLIZJ = LIZJ(c0lsz.LIZ);
        if (nLETrackSlotLIZJ != null) {
            nLETrackSlotLIZJ.removeExtraWithKey("creation_async_task_id");
        }
        C385050F7v.LJ(this.LL);
        C559010LwB.LIZIZ(getTag(), "updateFail");
    }

    @Override // X.InterfaceC558740Lvk
    public void Zq1(NLETrackSlot nLETrackSlot, CreativeModel creativeModel) {
        long endTime;
        long timeClipStart;
        long timeClipEnd;
        float rotation;
        long width;
        long height;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Float fLJIIIIZZ;
        Long lLJIILIIL3;
        Long lLJIILIIL4;
        Long lLJIILIIL5;
        NLETrack mainTrack = this.LL.getModel().getMainTrack();
        if (mainTrack == null) {
            return;
        }
        String extra = nLETrackSlot.getExtra("slot_extra_origin_resource_file");
        if (extra != null && extra.length() != 0) {
            String extra2 = nLETrackSlot.getExtra("slot_extra_origin_duration");
            if (extra2 != null && (lLJIILIIL5 = C2095008Iq.LJIILIIL(extra2)) != null) {
                endTime = lLJIILIIL5.longValue();
            } else {
                endTime = nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime();
            }
            nLETrackSlot.setDuration(endTime);
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                String extra3 = nLESegmentVideoDynamicCast.getExtra("slot_extra_origin_clip_start_time");
                if (extra3 != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(extra3)) != null) {
                    timeClipStart = lLJIILIIL4.longValue();
                } else {
                    timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                }
                nLESegmentVideoDynamicCast.setTimeClipStart(timeClipStart);
                String extra4 = nLESegmentVideoDynamicCast.getExtra("slot_extra_origin_clip_end_time");
                if (extra4 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(extra4)) != null) {
                    timeClipEnd = lLJIILIIL3.longValue();
                } else {
                    timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd();
                }
                nLESegmentVideoDynamicCast.setTimeClipEnd(timeClipEnd);
                String extra5 = nLESegmentVideoDynamicCast.getExtra("slot_extra_origin_clip_rotation");
                if (extra5 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra5)) != null) {
                    rotation = fLJIIIIZZ.floatValue();
                } else {
                    rotation = nLETrackSlot.getRotation();
                }
                nLETrackSlot.setRotation(rotation);
                NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                String extra6 = resource.getExtra("slot_extra_origin_resource_file");
                if (extra6 == null) {
                    extra6 = resource.getResourceFile();
                }
                resource.setResourceFile(extra6);
                C533730KwV c533730KwV = C533730KwV.LIZ;
                String resourceFile = resource.getResourceFile();
                c533730KwV.getClass();
                resource.setResourceType(C533730KwV.LJ(resourceFile));
                String extra7 = resource.getExtra("slot_extra_origin_resource_width");
                if (extra7 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(extra7)) != null) {
                    width = lLJIILIIL2.longValue();
                } else {
                    width = resource.getWidth();
                }
                resource.setWidth(width);
                String extra8 = resource.getExtra("slot_extra_origin_resource_height");
                if (extra8 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(extra8)) != null) {
                    height = lLJIILIIL.longValue();
                } else {
                    height = resource.getHeight();
                }
                resource.setHeight(height);
            }
            nLETrackSlot.removeExtraWithKey("creation_async_task_id");
        } else {
            C559010LwB.LIZ(getTag(), "updateNLEIfRemove, origin slot path null, regenerate new slot");
            C0MCR c0mcr = C0MCR.LIZ;
            NLEModel model = this.LL.getModel();
            c0mcr.getClass();
            NLETrackSlot nLETrackSlotLIZIZ = C0MCR.LIZIZ(model, creativeModel);
            if (nLETrackSlotLIZIZ != null) {
                nLETrackSlot = nLETrackSlotLIZIZ;
            }
        }
        LJFF(nLETrackSlot, creativeModel);
        nLETrackSlot.setEndTransition(null);
        mainTrack.clearSlot();
        mainTrack.addSlot(nLETrackSlot);
        NLEModel model2 = this.LL.getModel();
        NLETrack mainTrack2 = model2.getMainTrack();
        if (mainTrack2 != null) {
            long measuredEndTime = mainTrack2.getMeasuredEndTime();
            VecNLETrackSPtr tracks = model2.getTracks();
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (!nLETrack.getMainTrack()) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack2 : arrayList) {
                Iterator<NLETrackSlot> it2 = nLETrack2.getSortedSlots().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        NLETrackSlot next = it2.next();
                        if (nLETrack2.getTrackType() == NLETrackType.FILTER) {
                            next.setEndTime(measuredEndTime);
                            break;
                        }
                        if (next.getStartTime() == 0 && next.getEndTime() == measuredEndTime) {
                            next.setEndTime(measuredEndTime);
                        } else if (Boolean.parseBoolean(next.getExtra("has_aigc_cut"))) {
                            if (next.hasExtra("starttime_before_aigc_cut")) {
                                try {
                                    Long lValueOf = Long.valueOf(CastLongProtector.parseLong(next.getExtra("starttime_before_aigc_cut")));
                                    if (lValueOf != null) {
                                        next.setStartTime(lValueOf.longValue());
                                        next.removeExtraWithKey("starttime_before_aigc_cut");
                                    }
                                } catch (NumberFormatException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            if (next.hasExtra("endtime_before_aigc_cut")) {
                                try {
                                    Long lValueOf2 = Long.valueOf(CastLongProtector.parseLong(next.getExtra("endtime_before_aigc_cut")));
                                    if (lValueOf2 != null) {
                                        next.setEndTime(lValueOf2.longValue());
                                        next.removeExtraWithKey("endtime_before_aigc_cut");
                                    }
                                } catch (NumberFormatException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                            next.removeExtraWithKey("has_aigc_cut");
                        }
                    }
                }
            }
        }
        C385050F7v.LJ(this.LL);
    }

    @Override // X.InterfaceC558740Lvk
    public void ec2(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot) {
        Zq1(nLETrackSlot, videoPublishEditModel.creativeModel);
        C0MCR c0mcr = C0MCR.LIZ;
        NLEEditor nLEEditor = this.LL;
        c0mcr.getClass();
        C0MCR.LJIIIIZZ(nLEEditor, videoPublishEditModel);
        C559010LwB.LIZIZ(getTag(), "updateCancel");
    }

    @Override // X.InterfaceC558740Lvk
    public void ew1(String str, boolean z) {
        bm(System.currentTimeMillis());
        C554440Loo c554440Loo = C554440Loo.LIZ;
        String source = getSource();
        String taskType = getTaskType();
        AwS3S1010000_8 awS3S1010000_8 = new AwS3S1010000_8(str, z, 4);
        c554440Loo.getClass();
        C554440Loo.LIZJ(source, taskType, awS3S1010000_8);
    }

    @Override // X.InterfaceC558740Lvk
    public void jA0(CreativeModel creativeModel, C0LSZ c0lsz) {
        AILivePhotoModel aILivePhotoModel = creativeModel.aiLivePhotoModel;
        aILivePhotoModel.progressModel = C545800Las.LIZ(aILivePhotoModel, UsageStatus.LOADING, c0lsz);
    }

    @Override // X.InterfaceC558740Lvk
    public void qO(VideoPublishEditModel videoPublishEditModel, String str) {
        NLETrackSlot nLETrackSlotLIZJ = LIZJ(str);
        if (nLETrackSlotLIZJ != null) {
            nLETrackSlotLIZJ.removeExtraWithKey("creation_async_task_id");
        }
        C385050F7v.LJ(this.LL);
        if (!videoPublishEditModel.getAILivePhotoModel().LJIIL()) {
            videoPublishEditModel.getAILivePhotoModel().progressModel = new ProgressModel(UsageStatus.NOT_APPLY, videoPublishEditModel.getAILivePhotoModel().LIZJ(), null, null, "", "", 0, 0, null, "", 0L, videoPublishEditModel.getAILivePhotoModel().LIZIZ().bindMixMaterial, -1L, 0);
        }
        C559010LwB.LIZIZ(getTag(), "updateStop");
    }

    public final NLETrackSlot LIZIZ(CreativeModel creativeModel, NLEEditor nLEEditor, C0LSZ c0lsz) {
        NLETrack mainTrack;
        C0MCR c0mcr = C0MCR.LIZ;
        NLEModel model = nLEEditor.getModel();
        c0mcr.getClass();
        NLETrackSlot nLETrackSlotLIZIZ = C0MCR.LIZIZ(model, creativeModel);
        if (nLETrackSlotLIZIZ == null || (mainTrack = nLEEditor.getModel().getMainTrack()) == null) {
            return null;
        }
        mainTrack.clearSlot();
        mainTrack.addSlot(nLETrackSlotLIZIZ);
        nLETrackSlotLIZIZ.setTransformX(0.0f);
        nLETrackSlotLIZIZ.setTransformY(0.0f);
        nLETrackSlotLIZIZ.setScale(1.0f);
        nLETrackSlotLIZIZ.setRotation(0.0f);
        long j = ((long) 2000) * 1000;
        nLETrackSlotLIZIZ.setDuration(j);
        nLETrackSlotLIZIZ.setStartTime(0L);
        nLETrackSlotLIZIZ.setEndTime(nLETrackSlotLIZIZ.getStartTime() + j);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLIZIZ.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return null;
        }
        if (nLESegmentVideoDynamicCast.getResource() != null && (nLESegmentVideoDynamicCast.getResource().getWidth() == 0 || nLESegmentVideoDynamicCast.getResource().getHeight() == 0)) {
            int i = C20137613qo.LIZ.LIZLLL(nLESegmentVideoDynamicCast.getResource().getResourceFile()).LIZLLL;
            if (i != 90 && i != 270) {
                nLESegmentVideoDynamicCast.getResource().setHeight(r11.LIZJ);
                nLESegmentVideoDynamicCast.getResource().setWidth(r11.LIZIZ);
            } else {
                nLESegmentVideoDynamicCast.getResource().setHeight(r11.LIZIZ);
                nLESegmentVideoDynamicCast.getResource().setWidth(r11.LIZJ);
            }
        }
        nLESegmentVideoDynamicCast.setCanvasStyle(null);
        nLESegmentVideoDynamicCast.setTimeClipStart(0L);
        nLESegmentVideoDynamicCast.setTimeClipEnd(j);
        nLETrackSlotLIZIZ.removeExtraWithKey("creation_async_task_id");
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        nLESegmentVideo.setAVFile(new NLEResourceAV());
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrackSlot.setStartTime(mainTrack.getMeasuredEndTime());
        mainTrack.addSlot(nLETrackSlot);
        C352250DrT.LIZIZ(nLETrackSlot, c0lsz.LJIILIIL);
        return nLETrackSlot;
    }

    @Override // X.InterfaceC558740Lvk
    public void k72(VideoPublishEditModel videoPublishEditModel, C0LSZ c0lsz, C0MCA c0mca) {
        ew1(getTag(), false);
        videoPublishEditModel.creativeModel.aiLivePhotoModel.lastFailProgressModel = null;
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        aILivePhotoModel.progressModel = C545800Las.LIZ(aILivePhotoModel, UsageStatus.SUCCESS_APPLY, c0lsz);
        videoPublishEditModel.getAILivePhotoModel().lastStatus = null;
        F30(videoPublishEditModel.creativeModel, c0lsz);
        C0MCR c0mcr = C0MCR.LIZ;
        NLEEditor nLEEditor = this.LL;
        c0mcr.getClass();
        C0MCR.LJII(nLEEditor, videoPublishEditModel);
        C0MCR.LJIIJ(this.LL, videoPublishEditModel.creativeModel);
        NLETrack mainTrack = this.LL.getModel().getMainTrack();
        if (mainTrack != null) {
            videoPublishEditModel.setVideoLength(((int) mainTrack.getMaxEnd()) / LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C559010LwB.LIZIZ(getTag(), "updateFinish");
        if (c0mca != null) {
            c0mca.onSuccess();
        }
        Qy(true, null, getTag(), false);
    }

    @Override // X.InterfaceC558740Lvk
    public void Qy(boolean z, String str, String str2, boolean z2) {
        Integer num;
        String str3 = str;
        C554440Loo c554440Loo = C554440Loo.LIZ;
        String source = getSource();
        String taskType = getTaskType();
        long startTime = getStartTime();
        if (!z) {
            num = -49000;
        } else {
            num = null;
        }
        AwS3S1010000_8 awS3S1010000_8 = new AwS3S1010000_8(str2, z2, 3);
        c554440Loo.getClass();
        C554440Loo.LIZIZ(source, taskType, z, startTime, num, str3, awS3S1010000_8);
        if (!z) {
            String tag = getTag();
            if (str3 == null) {
                str3 = "";
            }
            C559010LwB.LIZ(tag, str3);
        }
    }

    @Override // X.InterfaceC558740Lvk
    public void Xv1(VideoPublishEditModel videoPublishEditModel, PromptModel promptModel, String str, long j) {
        UsageStatus usageStatus;
        videoPublishEditModel.getAILivePhotoModel().progressModel = new ProgressModel(UsageStatus.LOADING, promptModel, str, null, "STARTED", "", 0, 0, null, "", 0L, videoPublishEditModel.getAILivePhotoModel().LIZIZ().bindMixMaterial, j, 0);
        ProgressModel progressModel = videoPublishEditModel.getAILivePhotoModel().lastStatus;
        if (progressModel != null) {
            usageStatus = progressModel.status;
        } else {
            usageStatus = null;
        }
        if (usageStatus == UsageStatus.SUCCESS_APPLY && videoPublishEditModel.getAILivePhotoModel().mobParam.lastFailReason != null) {
            videoPublishEditModel.getAILivePhotoModel().LJIILL(AFwS239S0000000_8.get$arr$(169));
        }
        C559010LwB.LIZIZ(getTag(), "updateStart");
    }
}

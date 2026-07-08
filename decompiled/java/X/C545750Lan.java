package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;

/* JADX INFO: renamed from: X.0Lan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545750Lan {
    public static final C545750Lan LIZ = new C545750Lan();

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C545780Laq
            if (r0 == 0) goto L6b
            r7 = r10
            X.0Laq r7 = (X.C545780Laq) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L4c
            if (r0 == r4) goto L79
            if (r0 != r5) goto L71
            X.C155000ia.LIZIZ(r1)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r9.LIZ
            com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r0 = r0.aigcOfflineModel
            boolean r0 = r0.isOfflineAIGCEffectGenerated
            if (r0 == 0) goto L3a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.09Xj r0 = new X.09Xj
            r0.<init>(r9, r2)
            r7.LL = r9
            r7.LLILZ = r3
            java.lang.Object r1 = X.C23250099c.LJI(r7, r1, r0)
            if (r1 != r6) goto L51
            return r6
        L4c:
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r9 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L51:
            X.0LZU r0 = X.C0LZU.NEW_FRAMEWORK
            if (r1 != r0) goto L60
            r7.LL = r2
            r7.LLILZ = r4
            java.lang.Object r0 = r8.LIZLLL(r9, r7)
            if (r0 != r6) goto L7c
            return r6
        L60:
            r7.LL = r2
            r7.LLILZ = r5
            java.lang.Object r0 = r8.LIZJ(r9, r7)
            if (r0 != r6) goto L29
            return r6
        L6b:
            X.0Laq r7 = new X.0Laq
            r7.<init>(r8, r10)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L79:
            X.C155000ia.LIZIZ(r1)
        L7c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545750Lan.LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r67, X.InterfaceC1364105Vn<? super kotlin.Unit> r68) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545750Lan.LIZJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.draft.model.AwemeDraft r62, X.InterfaceC1364105Vn<? super kotlin.Unit> r63) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545750Lan.LIZLLL(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.nle.editor_jni.NLEEditor r4, com.ss.android.ugc.aweme.draft.model.AwemeDraft r5, X.C0LSZ r6) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545750Lan.LIZ(com.bytedance.ies.nle.editor_jni.NLEEditor, com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.0LSZ):void");
    }

    public static void LJ(NLEEditor nLEEditor, C0LY5 c0ly5, AwemeDraft awemeDraft) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLENode nLENodeDeepClone;
        NLEModel model = nLEEditor.getModel();
        if (model == null) {
            return;
        }
        if (C0C1O.LIZ()) {
            C357540E0a.LIZLLL(model);
        }
        NLETrack mainTrack2 = model.getMainTrack();
        if (mainTrack2 == null) {
            return;
        }
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        nLESegmentVideo.setAVFile(new NLEResourceAV());
        nLETrackSlot2.setMainSegment(nLESegmentVideo);
        nLETrackSlot2.setStartTime(mainTrack2.getMeasuredEndTime());
        C0LC1 c0lc1 = C0LC1.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateNLEForShootingAIGC: taskParam ");
        sbLIZ.append(c0ly5.LJIIIIZZ);
        C201955140j.LIZLLL(c0lc1, "DraftAIGCRestoreHelper", C2188811AlT.LIZIZ(sbLIZ));
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(c0ly5.LJIIIIZZ);
        if (videoFileInfo == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateNLEForShootingAIGC: videoInfo ");
        sbLIZ2.append(videoFileInfo);
        C201955140j.LIZLLL(c0lc1, "DraftAIGCRestoreHelper", C2188811AlT.LIZIZ(sbLIZ2));
        mainTrack2.addSlot(nLETrackSlot2);
        C352250DrT.LIZIZ(nLETrackSlot2, c0ly5.LJIIIIZZ);
        NLEModel model2 = nLEEditor.getModel();
        if (model2 != null && (mainTrack = model2.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            NLESegmentVideo nLESegmentVideo2 = null;
            if (mainSegment != null) {
                nLENodeDeepClone = mainSegment.deepClone();
            } else {
                nLENodeDeepClone = null;
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast(nLENodeDeepClone);
            if (nLESegmentVideoDynamicCast != null) {
                NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                if (resource != null) {
                    resource.setWidth(videoFileInfo.width);
                }
                NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                if (resource2 != null) {
                    resource2.setHeight(videoFileInfo.height);
                }
                nLESegmentVideo2 = nLESegmentVideoDynamicCast;
            }
            nLETrackSlot.setMainSegment(nLESegmentVideo2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateNLEForShootingAIGC: nleModel ");
        sbLIZ3.append(nLEEditor.getModel());
        C201955140j.LIZLLL(c0lc1, "DraftAIGCRestoreHelper", C2188811AlT.LIZIZ(sbLIZ3));
        nLEEditor.commit();
        nLEEditor.done();
        awemeDraft.LJIJJ(nLEEditor.store());
        C0MCR.LIZ.getClass();
        CreativeModel creativeModel = awemeDraft.LIZ;
        creativeModel.importModel.isFastImport = true;
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        aVDraftExtras.isFastImport = true;
        aVDraftExtras.creationMode = 1;
        C0MCR.LJIIIZ(nLEEditor, creativeModel, false);
        LIZ.getClass();
        EditPreviewInfo editPreviewInfo = awemeDraft.LIZ.editModel.editPreviewInfo;
        if (editPreviewInfo != null) {
            VESize vESizeCalcTargetRes = VEUtils.calcTargetRes(new int[]{videoFileInfo.width}, new int[]{videoFileInfo.height}, C571630MbR.LIZ(editPreviewInfo), videoFileInfo.width);
            editPreviewInfo.setPreviewWidth(videoFileInfo.width);
            editPreviewInfo.setPreviewHeight(videoFileInfo.height);
            editPreviewInfo.setCalculateSourceWidth(vESizeCalcTargetRes.width);
            editPreviewInfo.setCalculateSourceHeight(vESizeCalcTargetRes.height);
        }
        NLETrack mainTrack3 = nLEEditor.getModel().getMainTrack();
        if (mainTrack3 != null) {
            EditPreviewInfo editPreviewInfo2 = awemeDraft.LIZ.editModel.editPreviewInfo;
            if (editPreviewInfo2 != null) {
                editPreviewInfo2.setPreviewVideoLength(((int) mainTrack3.getMaxEnd()) / LSPassThroughRecordSizeConfig.DEFAULT);
            }
            EditModel editModel = awemeDraft.LIZ.editModel;
            EditPreviewInfo editPreviewInfo3 = editModel.editPreviewInfo;
            AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJIZL;
            aVDraftExtras2.previewInfo = editPreviewInfo3;
            aVDraftExtras2.multiEditVideoData = editModel.multiEditVideoStatusRecordData;
        }
        CreativeModel creativeModel2 = awemeDraft.LIZ;
        creativeModel2.aigcOfflineModel = AIGCOfflineModel.LIZ(creativeModel2.aigcOfflineModel, false, false, true, null, null, null, null, 0, 0, null, null, null, null, null, null, c0ly5.LIZJ, false, false, null, false, null, -5, 262142);
    }
}

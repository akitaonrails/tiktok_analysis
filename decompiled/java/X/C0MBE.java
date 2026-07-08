package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0MBE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MBE {
    public static final C0MBE LIZ = new C0MBE();
    public static final String LIZIZ = "SaveDraftByPath";

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        C0CHQ.LIZ().LJJIZ();
        C1463670oBx c1463670oBxLIZLLL = C1449720npS.LIZLLL(videoPublishEditModel, null, 6);
        videoPublishEditModel.getPreviewInfo().setPreviewVideoLength(c1463670oBxLIZLLL.getDuration());
        videoPublishEditModel.setVideoLength(c1463670oBxLIZLLL.getDuration());
        videoPublishEditModel.setNleData(c1463670oBxLIZLLL.Zf());
        String str = videoPublishEditModel.creativeModel.nleInfoModel.nleDataPath;
        if (C123100dR.LIZ(str) && C123100dR.LIZ(videoPublishEditModel.getNleData())) {
            String nleData = videoPublishEditModel.getNleData();
            if (nleData == null) {
                nleData = "";
            }
            C2350209Iu.LIZ(str, nleData);
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, IAVDraftService.SaveDraftByPathParam saveDraftByPathParam) {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        CreativeModel creativeModel2 = saveDraftByPathParam.creativeModel;
        if (creativeModel2 != null) {
            creativeModel.propFromGroupModel = creativeModel2.propFromGroupModel;
            creativeModel.editorProAIGCInfoModel = creativeModel2.editorProAIGCInfoModel;
            creativeModel.creativeFlowData.setEditorProModel(creativeModel2.creativeFlowData.getEditorProModel());
            EventData eventData = creativeModel.eventData;
            EventData eventData2 = creativeModel2.eventData;
            eventData.shootEnterMethod = eventData2.shootEnterMethod;
            eventData.enterFrom = eventData2.enterFrom;
            AlbumModel albumModel = creativeModel.albumModel;
            AlbumModel albumModel2 = creativeModel2.albumModel;
            albumModel.uploadMethod = albumModel2.uploadMethod;
            creativeModel.recordData.shootMode = creativeModel2.recordData.shootMode;
            creativeModel.editStickerModel.commentVideoModel = creativeModel2.editStickerModel.commentVideoModel;
            creativeModel.microAppModel = creativeModel2.microAppModel;
            creativeModel.creativeFlowData = creativeModel2.creativeFlowData;
            creativeModel.initialModel.mentionUserModel = creativeModel2.initialModel.mentionUserModel;
            albumModel.uploadTabNameList = albumModel2.uploadTabNameList;
            creativeModel.landingModel.defaultLandingCreateTab = creativeModel2.landingModel.defaultLandingCreateTab;
        }
        if (C307450C3j.LIZ() && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
            for (MultiEditVideoRecordData multiEditVideoRecordData2 : (ArrayList) C13LQ.LJIJI(new MultiEditVideoRecordData[]{multiEditVideoRecordData.curMultiEditVideoRecordData, multiEditVideoRecordData.originMultiEditRecordData})) {
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData2.segmentDataList;
                if (list != null) {
                    for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                        String str = multiEditVideoSegmentRecordData.audioPath;
                        if (str == null || str.length() == 0) {
                            String str2 = multiEditVideoSegmentRecordData.videoPath;
                            if (str2 != null && str2.length() != 0 && (!VEUtils.getAudioFileInfoForAllTracks(multiEditVideoSegmentRecordData.videoPath).isEmpty())) {
                                multiEditVideoSegmentRecordData.audioPath = multiEditVideoSegmentRecordData.videoPath;
                            }
                        }
                    }
                }
                List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData2.segmentDataList;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator<MultiEditVideoSegmentRecordData> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str3 = it2.next().audioPath;
                        if (str3 != null && str3.length() != 0) {
                            multiEditVideoRecordData2.useMusic = false;
                            videoPublishEditModel.setVoiceVolume(1.0f);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0032, code lost:
    
        if (r2 != r9) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r25, X.C571560MbK r26, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.Boolean, java.lang.Boolean, java.lang.Long>> r27) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MBE.LIZ(java.util.List, X.0MbK, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r13, com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener r14, java.lang.String r15, java.lang.Integer r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r12 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C0MBH
            if (r0 == 0) goto L77
            r4 = r3
            X.0MBH r4 = (X.C0MBH) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r4.LLILZ = r2
        L14:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L3b
            if (r0 != r2) goto L7d
            com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener r14 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            X.0LHc r1 = (X.C540340LHc) r1
            com.ss.android.ugc.aweme.draft.model.DraftSaveResult r0 = r1.LIZ
            boolean r0 = r0.isSuc()
            if (r0 == 0) goto L37
            r14.onSuccess()
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener.DefaultImpls.onFailed$default(r14, r7, r2, r7)
            goto L34
        L3b:
            X.C155000ia.LIZIZ(r1)
            X.0LAj r1 = new X.0LAj
            X.0M2T r5 = new X.0M2T
            if (r16 == 0) goto L74
            int r9 = r16.intValue()
        L48:
            r6 = 0
            r11 = 29
            r8 = r7
            r10 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.<init>(r13, r5, r6)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r13.creativeModel
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            if (r15 != 0) goto L5b
            java.lang.String r15 = "otherBusinessLineShare"
        L5b:
            r0.saveDraftScene = r15
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0M6F r0 = r0.LJI()
            X.0LaW r0 = r0.LIZIZ()
            r4.LL = r14
            r4.LLILZ = r2
            java.lang.Object r1 = r0.LJI(r1, r7, r4)
            if (r1 != r3) goto L27
            return r3
        L74:
            r9 = 9
            goto L48
        L77:
            X.0MBH r4 = new X.0MBH
            r4.<init>(r12, r3)
            goto L14
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MBE.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210 A[LOOP:0: B:91:0x020a->B:93:0x0210, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeInfo r37, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r38, java.lang.String r39, com.ss.android.ugc.aweme.edit.Cut2EditTransferModel r40, java.lang.String r41, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r42) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MBE.LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.util.List, java.lang.String, com.ss.android.ugc.aweme.edit.Cut2EditTransferModel, java.lang.String, X.05Vn):java.lang.Object");
    }
}

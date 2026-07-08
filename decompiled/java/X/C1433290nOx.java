package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.vesdk.VEWatermarkParam;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433290nOx {
    public static final C1433290nOx LIZ = new C1433290nOx();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(8));

    /* JADX WARN: Multi-variable type inference failed */
    public static VEWatermarkParam LIZJ(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        C1433300nOy c1433300nOyLJ;
        boolean z5;
        VecNLETrackSPtr tracks;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        boolean zLJJ = C1428520nHG.LJJ(videoPublishEditModel);
        C1439880nZa.LIZ.getClass();
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && (interfaceC1429470nInLJFF.LJFF(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), true) || interfaceC1429470nInLJFF.LJFF(videoPublishEditModel.creativeModel, videoPublishEditModel.getPreviewInfo(), false))) {
            z3 = true;
        } else {
            z3 = false;
        }
        C548590LfN.LIZ.getClass();
        List<String> listLJFF = C548590LfN.LIZLLL().LJFF(videoPublishEditModel.creativeModel);
        if (!z2 && !zLJJ && !z3 && (listLJFF == null || listLJFF.isEmpty())) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (C1439880nZa.LJII(videoPublishEditModel, z) && !z4) {
            int[] iArrLIZIZ = C1439880nZa.LIZIZ(videoPublishEditModel);
            AVUploadSaveModel saveModel = videoPublishEditModel.getSaveModel();
            if (saveModel != null) {
                int saveType = saveModel.getSaveType();
                if (saveType == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String string = "";
                if (((Boolean) C306360Bze.LIZ.getValue()).booleanValue()) {
                    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                    String nleData = videoPublishEditModel.getNleData();
                    if (nleData != null && nleData.length() != 0) {
                        C0FGC.LIZ(2);
                        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                        nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
                        NLEModel model = nLEEditorLIZ.getModel();
                        if (model != null && (tracks = model.getTracks()) != null && !tracks.isEmpty()) {
                            Iterator<NLETrack> it2 = tracks.iterator();
                            while (it2.hasNext()) {
                                for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                                    if (nLETrackSlot != null && nLETrackSlot.hasExtra("extra_voice_change_creator_username") && nLETrackSlot.getExtra("extra_voice_change_creator_username").length() > 0 && !linkedHashSet.contains(nLETrackSlot.getExtra("extra_voice_change_creator_username"))) {
                                        linkedHashSet.add(nLETrackSlot.getExtra("extra_voice_change_creator_username"));
                                    }
                                }
                            }
                        }
                    }
                    List<SimpleTextStickerData> textStickerDataList = videoPublishEditModel.getTextStickerDataList();
                    if (textStickerDataList != null && !textStickerDataList.isEmpty()) {
                        for (SimpleTextStickerData simpleTextStickerData : videoPublishEditModel.getTextStickerDataList()) {
                            if (simpleTextStickerData.isCreatorVoice()) {
                                linkedHashSet.add(simpleTextStickerData.getVoiceCreatorUserName());
                            }
                        }
                    }
                    String strLIZIZ = "";
                    for (String str : linkedHashSet) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(str);
                        sbLIZ.append(", ");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    String strLJJJLL = a0.LJJJLL(", ", strLIZIZ);
                    if (C123100dR.LIZ(strLJJJLL)) {
                        string = C0CHQ.LIZ.getString(2131822813, strLJJJLL);
                    }
                } else {
                    List<SimpleTextStickerData> textStickerDataList2 = videoPublishEditModel.getTextStickerDataList();
                    if (textStickerDataList2 != null && !textStickerDataList2.isEmpty()) {
                        Iterator<SimpleTextStickerData> it3 = videoPublishEditModel.getTextStickerDataList().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (it3.next().isCreatorVoice()) {
                                try {
                                    string = ActivityStack.getTopActivity().getString(2131857243);
                                    break;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C844470XAv.LIZ.getClass();
                                    string = C844470XAv.LIZ().getString(2131857243);
                                }
                            }
                        }
                    }
                }
                C0CHQ.LIZ().LIZIZ().LJFF();
                String localTempPath = videoPublishEditModel.getLocalTempPath();
                if (localTempPath != null) {
                    C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                    String localTempPath2 = videoPublishEditModel.getLocalTempPath();
                    if (localTempPath2 != null) {
                        c1433300nOyLJ = C1781980wTM.LJ(saveType, localTempPath, currentUser, iArrLIZIZ, true, localTempPath2, z5, videoPublishEditModel.getCreativeInfo(), string, videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType, false, false);
                        c1433300nOyLJ = c1433300nOyLJ;
                        if (z5) {
                            if (c1433300nOyLJ == 0) {
                                return null;
                            }
                            int i = iArrLIZIZ[1] - iArrLIZIZ[0];
                            if (i > 0) {
                                c1433300nOyLJ.LIZ.yOffset += i / 2;
                            }
                        }
                        return c1433300nOyLJ.LIZ();
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (zLJJ && C123100dR.LIZ(videoPublishEditModel.getLocalTempPath())) {
            int[] iArrLIZIZ2 = C1439880nZa.LIZIZ(videoPublishEditModel);
            C0CHQ.LIZ().LIZIZ().LJFF();
            String localTempPath3 = videoPublishEditModel.getLocalTempPath();
            if (localTempPath3 != null) {
                CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
                String localTempPath4 = videoPublishEditModel.getLocalTempPath();
                if (localTempPath4 != null) {
                    c1433300nOyLJ = C1781980wTM.LIZLLL(localTempPath3, iArrLIZIZ2, creativeInfo, true, localTempPath4, videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (z3 && C123100dR.LIZ(videoPublishEditModel.getLocalTempPath())) {
            int[] iArrLIZIZ3 = C1439880nZa.LIZIZ(videoPublishEditModel);
            C0CHQ.LIZ().LIZIZ().LJFF();
            String localTempPath5 = videoPublishEditModel.getLocalTempPath();
            if (localTempPath5 != null) {
                CreativeInfo creativeInfo2 = videoPublishEditModel.getCreativeInfo();
                String localTempPath6 = videoPublishEditModel.getLocalTempPath();
                if (localTempPath6 != null) {
                    c1433300nOyLJ = C1781980wTM.LIZIZ(localTempPath5, iArrLIZIZ3, creativeInfo2, true, localTempPath6, videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (listLJFF != null && !listLJFF.isEmpty() && C123100dR.LIZ(videoPublishEditModel.getLocalTempPath())) {
            int[] iArrLIZIZ4 = C1439880nZa.LIZIZ(videoPublishEditModel);
            C0CHQ.LIZ().LIZIZ().LJFF();
            String localTempPath7 = videoPublishEditModel.getLocalTempPath();
            if (localTempPath7 != null) {
                CreativeInfo creativeInfo3 = videoPublishEditModel.getCreativeInfo();
                String localTempPath8 = videoPublishEditModel.getLocalTempPath();
                if (localTempPath8 != null) {
                    c1433300nOyLJ = C1781980wTM.LIZ(localTempPath7, iArrLIZIZ4, creativeInfo3, true, localTempPath8, videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType, listLJFF, C0CHQ.LIZ().getAccountService().getCurrentUser(), C1439880nZa.LJII(videoPublishEditModel, z));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            if (!C1439880nZa.LIZLLL(videoPublishEditModel) || !videoPublishEditModel.isSaveLocal()) {
                return null;
            }
            int[] iArrLIZIZ5 = C1439880nZa.LIZIZ(videoPublishEditModel);
            C0CHQ.LIZ().LIZIZ().LJFF();
            String localTempPath9 = videoPublishEditModel.getLocalTempPath();
            if (localTempPath9 != null) {
                CreativeInfo creativeInfo4 = videoPublishEditModel.getCreativeInfo();
                String localTempPath10 = videoPublishEditModel.getLocalTempPath();
                if (localTempPath10 != null) {
                    c1433300nOyLJ = C1781980wTM.LIZJ(localTempPath9, iArrLIZIZ5, creativeInfo4, true, localTempPath10, videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (c1433300nOyLJ == 0) {
            return null;
        }
        return c1433300nOyLJ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1434490nQt LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, boolean r4, boolean r5, kotlin.jvm.functions.Function0 r6) {
        /*
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            com.ss.android.ugc.aweme.port.internal.IActivityPageService r1 = r0.LJIIL()
            java.lang.String r0 = "tool_merging"
            r2 = 1
            r1.updateCurrentScene(r0, r2)
            r1 = 0
            if (r4 == 0) goto L38
            if (r5 == 0) goto L36
            X.0nZa r0 = X.C1439880nZa.LIZ
            r0.getClass()
            boolean r0 = X.C1439880nZa.LIZLLL(r3)
            if (r0 == 0) goto L36
            com.ss.android.vesdk.VEWatermarkParam r2 = LIZJ(r3, r2, r2)
            if (r2 == 0) goto L36
            r2.needExtFile = r1
        L26:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            com.ss.android.ugc.aweme.creative.model.DMMediaModel r1 = r0.dmMediaModel
            boolean r0 = X.C1428470nHB.LJJZZI(r3)
            if (r0 == 0) goto L3d
            X.0nLQ r0 = new X.0nLQ
            r0.<init>(r6)
            return r0
        L36:
            r2 = 0
            goto L26
        L38:
            com.ss.android.vesdk.VEWatermarkParam r2 = LIZJ(r3, r1, r1)
            goto L26
        L3d:
            if (r1 == 0) goto L78
            int r2 = r1.type
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L60
            r0 = 4
            if (r2 == r0) goto L60
            X.01GW r0 = X.C1433290nOx.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.wavepublish.dm.service.IDM2CreativeService r0 = (com.ss.android.ugc.aweme.wavepublish.dm.service.IDM2CreativeService) r0
            if (r0 == 0) goto L57
            X.0nSb r0 = r0.LIZLLL()
            return r0
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L60:
            X.01GW r0 = X.C1433290nOx.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.wavepublish.dm.service.IDM2CreativeService r0 = (com.ss.android.ugc.aweme.wavepublish.dm.service.IDM2CreativeService) r0
            if (r0 == 0) goto L6f
            X.0nSh r0 = r0.LIZJ()
            return r0
        L6f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L78:
            com.ss.android.ugc.aweme.edit.TextPublishUploadModel r0 = r3.getTextPublishUploadModel()
            if (r0 == 0) goto L84
            X.0nLb r0 = new X.0nLb
            r0.<init>()
            return r0
        L84:
            X.0nSa r0 = new X.0nSa
            r0.<init>(r2, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1433290nOx.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean, kotlin.jvm.functions.Function0):X.0nQt");
    }
}

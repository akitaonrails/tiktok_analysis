package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365970EWl {
    public static final C365970EWl LIZ = new C365970EWl();

    public static Map LIZ(VideoPublishEditModel videoPublishEditModel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (videoPublishEditModel.creativeModel.asyncTaskIds.isEmpty()) {
            return linkedHashMap;
        }
        linkedHashMap.put("async_count", String.valueOf(videoPublishEditModel.creativeModel.asyncTaskIds.size()));
        String str = videoPublishEditModel.creativeModel.asyncFuncList;
        if (str != null) {
            linkedHashMap.put("async_count", String.valueOf(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6).size()));
            linkedHashMap.put("async_function_list", str);
            String strLJJIJ = C1416310mxZ.LJJIJ(videoPublishEditModel, true);
            if (strLJJIJ == null) {
                strLJJIJ = "";
            }
            linkedHashMap.put("tt_template_id", strLJJIJ);
            linkedHashMap.put("tt_template_type", C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true));
        }
        return linkedHashMap;
    }

    public static String LJIIL(AwemeDraft awemeDraft) {
        String strLJIJ;
        EditorProDraftModel editorProDraftModel = awemeDraft.LIZ.editorProDraftModel;
        String str = editorProDraftModel.nleData;
        if (str != null && str.length() > 0) {
            return str;
        }
        String str2 = editorProDraftModel.nleDataPath;
        if (str2 == null || str2.length() == 0 || !C2354709Kn.LIZIZ(str2) || (strLJIJ = C2354709Kn.LJIJ(str2)) == null || strLJIJ.length() == 0) {
            return null;
        }
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, C293550Bez.LIZ(), false, 5, null);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProDraftHelper readEditorProNleFromPath copyResMap size ");
        sbLIZ.append(awemeDraft.LJIJJ.keySet().size());
        C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : C2097608Jq.LJIIZILJ(awemeDraft.LJIJJ).entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            int i = C365960EWk.LIZ;
            if (C365960EWk.LIZJ(str3, str4)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str3);
                sbLIZ2.append(" -> ");
                sbLIZ2.append(str4);
                sbLIZ2.append("; ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                if (strLJIJ != null) {
                    strLJIJ = u.LJJIFFI(strLJIJ, str3, str4, false);
                } else {
                    strLJIJ = null;
                }
            }
        }
        C0MAY c0may2 = C0MAY.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("EditorProDraftHelper readEditorProNleFromPath replaceMap str: ");
        sbLIZ3.append((Object) sb);
        C571450Mb9.LIZ(c0may2, C2188811AlT.LIZIZ(sbLIZ3));
        return strLJIJ;
    }

    public final synchronized DraftFileSaveResult LJIILIIL(AwemeDraft awemeDraft) {
        boolean z;
        String strLJJIFFI = awemeDraft.LIZ.editorProDraftModel.nleData;
        if (strLJJIFFI == null || strLJJIFFI.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        DraftFileSaveResult draftFileSaveResult = null;
        String message = null;
        if (z) {
            return null;
        }
        if (!awemeDraft.LJIJJ.isEmpty()) {
            awemeDraft.LIZ.editorProDraftModel.copyResMap.putAll(awemeDraft.LJIJJ);
        }
        StringBuilder sb = new StringBuilder();
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(awemeDraft.LIZ.editorProDraftModel.copyResMap);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProDraftHelper saveEditorProNleDataIfNeeded copyResMap size ");
        sbLIZ.append(mapLJIIZILJ.keySet().size());
        C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : mapLJIIZILJ.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            int i = C365960EWk.LIZ;
            if (C365960EWk.LIZJ(str, str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(" -> ");
                sbLIZ2.append(str2);
                sbLIZ2.append("; ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                if (strLJJIFFI != null) {
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, str, str2, false);
                } else {
                    strLJJIFFI = null;
                }
            }
        }
        C0MAY c0may2 = C0MAY.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("EditorProDraftHelper saveEditorProNleDataIfNeeded replaceMap str: ");
        sbLIZ3.append((Object) sb);
        C571450Mb9.LIZ(c0may2, C2188811AlT.LIZIZ(sbLIZ3));
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(awemeDraft.LIZIZ(), EnumC20228214Cy.NLE_DATA, "editor_pro_nle_data.json", true).getAbsolutePath();
        if (strLJJIFFI == null) {
            return null;
        }
        DraftFileSaveException draftFileSaveExceptionLIZ = C2350209Iu.LIZ(absolutePath, strLJJIFFI);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("EditorProDraftHelper DraftSaveOp write editor pro nle path ");
        sbLIZ4.append(absolutePath);
        sbLIZ4.append(" result ");
        sbLIZ4.append(draftFileSaveExceptionLIZ.errorCode);
        sbLIZ4.append(" data ");
        sbLIZ4.append(strLJJIFFI);
        C571450Mb9.LIZ(c0may2, C2188811AlT.LIZIZ(sbLIZ4));
        if (!draftFileSaveExceptionLIZ.isSuc()) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("EditorProDraftHelper saveEditorProNleDataIfNeeded writeFile failed ");
            Throwable th = draftFileSaveExceptionLIZ.throwable;
            if (th != null) {
                message = th.getMessage();
            }
            sbLIZ5.append(message);
            C201955140j.LJII(c0may2, C2188811AlT.LIZIZ(sbLIZ5));
            draftFileSaveResult = new DraftFileSaveResult(9, draftFileSaveExceptionLIZ);
        } else {
            awemeDraft.LIZ.editorProDraftModel.nleDataPath = absolutePath;
        }
        return draftFileSaveResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJIILJJIL(com.ss.android.ugc.aweme.draft.model.AwemeDraft r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r8.LIZ     // Catch: java.lang.Throwable -> L9f
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel r3 = r0.editorProDraftModel     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = LJIIL(r8)     // Catch: java.lang.Throwable -> L9f
            r5 = 0
            if (r1 != 0) goto L12
            r3.nleData = r5     // Catch: java.lang.Throwable -> L9f
            r3.nleDataPath = r5     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r7)
            return
        L12:
            boolean r0 = X.C295990Biv.LIZ()     // Catch: java.lang.Throwable -> L9f
            r4 = 0
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r8.LJJJJIZL     // Catch: java.lang.Throwable -> L9f
            com.ss.android.ugc.aweme.creative.model.CreativeFlowData r0 = r0.creativeFlowData     // Catch: java.lang.Throwable -> L9f
            r6 = 1
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L67
            boolean r0 = r0.isAdvancedEditDraft()     // Catch: java.lang.Throwable -> L9f
            if (r0 != r6) goto L67
            com.bytedance.ies.nle.editor_jni.NLEEditor r2 = X.C346630DiP.LIZ()     // Catch: java.lang.Throwable -> L9f
            com.bytedance.ies.nle.editor_jni.NLEError r1 = r2.restore(r1)     // Catch: java.lang.Throwable -> L3f
            com.bytedance.ies.nle.editor_jni.NLEError r0 = com.bytedance.ies.nle.editor_jni.NLEError.SUCCESS     // Catch: java.lang.Throwable -> L3f
            if (r1 != r0) goto L4c
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r2.getModel()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L4c
            goto L4d
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L44
            goto L4c
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L44
            r2.delete()     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L4c:
            r6 = 0
        L4d:
            r2.delete()     // Catch: java.lang.Throwable -> L9f
            if (r6 != 0) goto L5f
            X.0MAY r1 = X.C0MAY.LIZIZ     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "EditorProDraftHelper updateEditorProNLEDataIfNeeded FixEp: invalid NLE after copyResMap, clear editor pro draft"
            X.C201955140j.LJIILJJIL(r1, r0)     // Catch: java.lang.Throwable -> L9f
            r3.nleData = r5     // Catch: java.lang.Throwable -> L9f
            r3.nleDataPath = r5     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r7)
            return
        L5f:
            r3.nleData = r5     // Catch: java.lang.Throwable -> L9f
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r8.LJJJJIZL     // Catch: java.lang.Throwable -> L9f
            r0.autoEnhanceOn = r4     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r7)
            return
        L67:
            com.bytedance.ies.nle.editor_jni.NLEEditor r2 = X.C346630DiP.LIZ()     // Catch: java.lang.Throwable -> L9f
            r2.restore(r1)     // Catch: java.lang.Throwable -> L9f
            com.bytedance.ies.nle.editor_jni.NLEModel r1 = r2.getModel()     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L92
            int r0 = X.C365960EWk.LIZ     // Catch: java.lang.Throwable -> L9f
            X.C365960EWk.LIZLLL(r1)     // Catch: java.lang.Throwable -> L9f
            X.0EWl r0 = X.C365970EWl.LIZ     // Catch: java.lang.Throwable -> L9f
            r0.getClass()     // Catch: java.lang.Throwable -> L9f
            LJIIJ(r2, r3)     // Catch: java.lang.Throwable -> L9f
            r2.commit()     // Catch: java.lang.Throwable -> L9f
            r2.done()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r2.store()     // Catch: java.lang.Throwable -> L9f
            r3.nleData = r0     // Catch: java.lang.Throwable -> L9f
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r8.LJJJJIZL     // Catch: java.lang.Throwable -> L9f
            r0.autoEnhanceOn = r4     // Catch: java.lang.Throwable -> L9f
            goto L9d
        L92:
            X.0MAY r1 = X.C0MAY.LIZIZ     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = "EditorProDraftHelper updateEditorProNLEDataIfNeeded, clear editor pro draft data"
            X.C201955140j.LJIILJJIL(r1, r0)     // Catch: java.lang.Throwable -> L9f
            r3.nleData = r5     // Catch: java.lang.Throwable -> L9f
            r3.nleDataPath = r5     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r7)
            return
        L9f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365970EWl.LJIILJJIL(com.ss.android.ugc.aweme.draft.model.AwemeDraft):void");
    }

    public static void LIZIZ(NLEModel nLEModel, EditorProDraftModel editorProDraftModel) {
        NLEResourceAV aVFile;
        String resourceFile;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C1697810uHb.LJIIJJI("AUDIO_RECORD", "ORIGIN_VOICE_CONVERSION", "TEXT_SPEAK", "BGM", "SOUND_EFFECT", "EDITOR_MUSIC").contains(nLETrack.getExtra("AudioTrackType"))) {
                arrayList.add(nLETrack);
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            Iterator<NLETrackSlot> it2 = nLETrack2.getSlots().iterator();
            while (it2.hasNext()) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(it2.next().getMainSegment());
                if (nLESegmentAudioDynamicCast != null && (aVFile = nLESegmentAudioDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null) {
                    LIZ.getClass();
                    String strLJIIJJI = LJIIJJI(editorProDraftModel, resourceFile);
                    if (strLJIIJJI != null) {
                        if (C1697810uHb.LJIIJJI("AUDIO_RECORD", "ORIGIN_VOICE_CONVERSION", "TEXT_SPEAK").contains(nLETrack2.getExtra("AudioTrackType"))) {
                            editorProDraftModel.nleCreativeResPaths.add(strLJIIJJI);
                        } else {
                            editorProDraftModel.nlePublicResPaths.add(strLJIIJJI);
                        }
                    }
                }
            }
        }
    }

    public static void LIZLLL(NLEModel nLEModel, EditorProDraftModel editorProDraftModel) {
        boolean z;
        String extra;
        NLESegmentFilter segment;
        NLEResourceNode effectSDKFilter;
        String resourceFile;
        String extra2;
        String strLJIIJJI;
        String extra3;
        String jsonParam;
        String extra4;
        String resourceFile2;
        String effectName;
        NLEResourceNode effectSDKEffect;
        NLEResourceNode effectSDKEffect2;
        String resourceFile3;
        String strLJIIJJI2;
        String extra5;
        NLETrackSlot renderProxy;
        NLESegment mainSegment;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast;
        NLEResourceNode renderConfigRes;
        String strLJIIJJI3;
        NLESegment mainSegment2;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast2;
        NLEResourceAV aVFile;
        String strLJIIJJI4;
        NLESegment mainSegment3;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast3;
        NLEResourceAV aVFile2;
        String resourceFile4;
        for (NLETrackSlot nLETrackSlot : nLEModel.getMainTrack().getSlots()) {
            LIZ.getClass();
            NLETrackSlot renderProxy2 = nLETrackSlot.getRenderProxy();
            if (renderProxy2 != null && (mainSegment3 = renderProxy2.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast3 = NLERenderProxySegment.dynamicCast(mainSegment3)) != null && (aVFile2 = nLERenderProxySegmentDynamicCast3.getAVFile()) != null && (resourceFile4 = aVFile2.getResourceFile()) != null && (!a0.LJJJIL(resourceFile4))) {
                z = true;
            } else {
                z = false;
            }
            if (z && (renderProxy = nLETrackSlot.getRenderProxy()) != null && renderProxy.hasExtra("is_from_ep_magic") && Boolean.parseBoolean(renderProxy.getExtra("is_from_ep_magic"))) {
                NLETrackSlot renderProxy3 = nLETrackSlot.getRenderProxy();
                if (renderProxy3 != null && (mainSegment2 = renderProxy3.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast2 = NLERenderProxySegment.dynamicCast(mainSegment2)) != null && (aVFile = nLERenderProxySegmentDynamicCast2.getAVFile()) != null && !TextUtils.isEmpty(aVFile.getResourceFile()) && (strLJIIJJI4 = LJIIJJI(editorProDraftModel, aVFile.getResourceFile())) != null) {
                    if (u.LJJIIJZLJL(strLJIIJJI4, C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot(), false)) {
                        editorProDraftModel.nleCreativeResPaths.add(strLJIIJJI4);
                    } else if (u.LJJIIJZLJL(strLJIIJJI4, C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot(), false)) {
                        editorProDraftModel.nlePersistentResPaths.add(strLJIIJJI4);
                    } else {
                        editorProDraftModel.nlePublicResPaths.add(strLJIIJJI4);
                    }
                }
                NLETrackSlot renderProxy4 = nLETrackSlot.getRenderProxy();
                if (renderProxy4 != null && (mainSegment = renderProxy4.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment)) != null && (renderConfigRes = nLERenderProxySegmentDynamicCast.getRenderConfigRes()) != null && !TextUtils.isEmpty(renderConfigRes.getResourceFile()) && (strLJIIJJI3 = LJIIJJI(editorProDraftModel, renderConfigRes.getResourceFile())) != null) {
                    editorProDraftModel.nlePublicResPaths.add(strLJIIJJI3);
                }
            }
            Iterator<NLEVideoEffect> it2 = nLETrackSlot.getVideoEffects().iterator();
            while (true) {
                String str = "";
                if (!it2.hasNext()) {
                    break;
                }
                NLEVideoEffect next = it2.next();
                LIZ.getClass();
                if (next.hasExtra("ep_magic_resource_id") && (extra3 = next.getExtra("ep_magic_resource_id")) != null && (!a0.LJJJIL(extra3))) {
                    NLESegmentEffect segment2 = next.getSegment();
                    if (segment2 != null && (effectSDKEffect2 = segment2.getEffectSDKEffect()) != null && (resourceFile3 = effectSDKEffect2.getResourceFile()) != null && !TextUtils.isEmpty(resourceFile3)) {
                        String strLJIIJJI5 = LJIIJJI(editorProDraftModel, resourceFile3);
                        if (strLJIIJJI5 != null) {
                            editorProDraftModel.nlePublicResPaths.add(strLJIIJJI5);
                        }
                        if (next.hasExtra("ep_client_magic_resource_path") && (extra5 = next.getExtra("ep_client_magic_resource_path")) != null) {
                            str = extra5;
                        }
                        if (!TextUtils.isEmpty(str) && (strLJIIJJI2 = LJIIJJI(editorProDraftModel, str)) != null) {
                            editorProDraftModel.nlePublicResPaths.add(strLJIIJJI2);
                        }
                    }
                    NLESegmentEffect segment3 = next.getSegment();
                    if (segment3 != null && (jsonParam = segment3.getJsonParam()) != null && !TextUtils.isEmpty(jsonParam)) {
                        String strOptString = new JSONObject(jsonParam).optString("editing_effect_algorithm_cache_url");
                        if (!TextUtils.isEmpty(strOptString)) {
                            String strLJIIJJI6 = LJIIJJI(editorProDraftModel, strOptString);
                            if (strLJIIJJI6 != null) {
                                editorProDraftModel.nlePublicResPaths.add(strLJIIJJI6);
                            }
                            NLESegmentEffect segment4 = next.getSegment();
                            if (segment4 != null && segment4.hasExtra("magic_effect_id")) {
                                NLESegmentEffect segment5 = next.getSegment();
                                if (segment5 != null) {
                                    extra4 = segment5.getExtra("magic_effect_id");
                                } else {
                                    extra4 = null;
                                }
                                NLESegmentEffect segment6 = next.getSegment();
                                if (segment6 != null && (effectSDKEffect = segment6.getEffectSDKEffect()) != null) {
                                    resourceFile2 = effectSDKEffect.getResourceFile();
                                } else {
                                    resourceFile2 = null;
                                }
                                String strLJIIJJI7 = LJIIJJI(editorProDraftModel, resourceFile2);
                                if (extra4 != null && extra4.length() != 0 && strLJIIJJI7 != null && strLJIIJJI7.length() != 0) {
                                    CopyOnWriteArrayList<EditorProEffectInfo> copyOnWriteArrayList = editorProDraftModel.effectsInfo;
                                    NLESegmentEffect segment7 = next.getSegment();
                                    if (segment7 != null) {
                                        effectName = segment7.getEffectName();
                                    } else {
                                        effectName = null;
                                    }
                                    copyOnWriteArrayList.add(new EditorProEffectInfo(extra4, effectName, strLJIIJJI7));
                                }
                            }
                        }
                    }
                }
            }
            for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
                LIZ.getClass();
                if (nLEFilter.hasExtra("ep_magic_resource_id") && (extra = nLEFilter.getExtra("ep_magic_resource_id")) != null && (!a0.LJJJIL(extra)) && (segment = nLEFilter.getSegment()) != null && (effectSDKFilter = segment.getEffectSDKFilter()) != null && (resourceFile = effectSDKFilter.getResourceFile()) != null && !TextUtils.isEmpty(resourceFile)) {
                    String strLJIIJJI8 = LJIIJJI(editorProDraftModel, resourceFile);
                    if (strLJIIJJI8 != null) {
                        editorProDraftModel.nlePublicResPaths.add(strLJIIJJI8);
                    }
                    if (!nLEFilter.hasExtra("ep_client_magic_resource_path") || (extra2 = nLEFilter.getExtra("ep_client_magic_resource_path")) == null) {
                        extra2 = "";
                    }
                    if (!TextUtils.isEmpty(extra2) && (strLJIIJJI = LJIIJJI(editorProDraftModel, extra2)) != null) {
                        editorProDraftModel.nlePublicResPaths.add(strLJIIJJI);
                    }
                }
            }
        }
    }

    public static void LJ(NLEModel nLEModel, EditorProDraftModel editorProDraftModel) {
        VecNLETrackSlotSPtr sortedSlots;
        NLEResourceAV aVFile;
        String resourceFile;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
            while (it2.hasNext()) {
                NLESegmentVideo nLESegmentVideoLIZ = C351170Dpj.LIZ(it2.next());
                if (nLESegmentVideoLIZ != null && (aVFile = nLESegmentVideoLIZ.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null) {
                    LIZ.getClass();
                    String strLJIIJJI = LJIIJJI(editorProDraftModel, resourceFile);
                    if (strLJIIJJI != null) {
                        if (a0.LJJIIZI(resourceFile.toLowerCase(Locale.ROOT), "persistent", false)) {
                            editorProDraftModel.nlePersistentResPaths.add(strLJIIJJI);
                        } else {
                            LJIIIZ(editorProDraftModel, strLJIIJJI);
                        }
                    }
                }
            }
        }
    }

    public static void LJFF(NLEModel nLEModel, EditorProDraftModel editorProDraftModel) {
        int i;
        String resourceFile;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            if (NLETrackType.VIDEO == next.getTrackType()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((NLETrackSlot) obj).getAIMatting() != null) {
                arrayList3.add(obj);
            }
        }
        for (Object obj2 : arrayList3) {
            int i2 = i + 1;
            String resourceFile2 = null;
            if (i >= 0) {
                NLESegmentAIMatting segment = ((NLETrackSlot) obj2).getAIMatting().getSegment();
                if (segment != null) {
                    if (i == 0) {
                        C365970EWl c365970EWl = LIZ;
                        NLEResourceNode resourceAlgorithm = segment.getResourceAlgorithm();
                        if (resourceAlgorithm != null) {
                            resourceFile = resourceAlgorithm.getResourceFile();
                        } else {
                            resourceFile = null;
                        }
                        c365970EWl.getClass();
                        String strLJIIJJI = LJIIJJI(editorProDraftModel, resourceFile);
                        if (!TextUtils.isEmpty(strLJIIJJI)) {
                            editorProDraftModel.nlePublicResPaths.add(strLJIIJJI);
                        }
                        NLEResourceNode blend = segment.getBlend();
                        if (blend != null) {
                            resourceFile2 = blend.getResourceFile();
                        }
                        String strLJIIJJI2 = LJIIJJI(editorProDraftModel, resourceFile2);
                        if (!TextUtils.isEmpty(strLJIIJJI2)) {
                            editorProDraftModel.nlePublicResPaths.add(strLJIIJJI2);
                        }
                    }
                    C365970EWl c365970EWl2 = LIZ;
                    String workSpace = segment.getWorkSpace();
                    c365970EWl2.getClass();
                    String strLJIIJJI3 = LJIIJJI(editorProDraftModel, workSpace);
                    if (!TextUtils.isEmpty(strLJIIJJI3) && !TextUtils.isEmpty(strLJIIJJI3)) {
                        editorProDraftModel.nlePublicResPaths.add(strLJIIJJI3);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static void LJI(NLEModel nLEModel, EditorProDraftModel editorProDraftModel) {
        NLEResourceAV aVFile;
        String resourceFile;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (Intrinsics.LJFF(nLETrack.getExtra("track_extra_pip"), "true")) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
                while (it3.hasNext()) {
                    NLESegmentVideo nLESegmentVideoLIZ = C351170Dpj.LIZ(it3.next());
                    if (nLESegmentVideoLIZ != null && (aVFile = nLESegmentVideoLIZ.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null) {
                        LIZ.getClass();
                        String strLJIIJJI = LJIIJJI(editorProDraftModel, resourceFile);
                        if (strLJIIJJI != null) {
                            LJIIIZ(editorProDraftModel, strLJIIJJI);
                        }
                    }
                }
            }
        }
    }

    public static void LJII(NLEModel nLEModel, EditorProDraftModel editorProDraftModel) {
        String extra;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null && mainSegment.hasExtra("ep_origin_media_path")) {
                NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                if (mainSegment2 != null) {
                    extra = mainSegment2.getExtra("ep_origin_media_path");
                } else {
                    extra = null;
                }
                LIZ.getClass();
                String strLJIIJJI = LJIIJJI(editorProDraftModel, extra);
                if (strLJIIJJI != null) {
                    LJIIIZ(editorProDraftModel, strLJIIJJI);
                }
            }
        }
    }

    public static void LJIIIIZZ(NLEModel nLEModel, EditorProDraftModel editorProDraftModel) {
        VecNLETrackSlotSPtr slots;
        NLEResourceNode effectSDKVideoAnimation;
        String resourceFile;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                Iterator<NLEVideoAnimation> it3 = it2.next().getVideoAnims().iterator();
                while (it3.hasNext()) {
                    NLESegmentVideoAnimation segment = it3.next().getSegment();
                    if (segment != null && (effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation()) != null && (resourceFile = effectSDKVideoAnimation.getResourceFile()) != null) {
                        editorProDraftModel.nlePublicResPaths.add(resourceFile);
                    }
                }
            }
        }
    }

    public static void LJIIIZ(EditorProDraftModel editorProDraftModel, String str) {
        if (u.LJJIIJZLJL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot(), false)) {
            editorProDraftModel.nlePersistentResPaths.add(str);
        } else if (u.LJJIIJZLJL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF(), false)) {
            editorProDraftModel.nlePublicResPaths.add(str);
        } else {
            editorProDraftModel.nleCreativeResPaths.add(str);
        }
    }

    public static void LJIIJ(NLEEditor nLEEditor, EditorProDraftModel editorProDraftModel) {
        NLEResourceAV aVFile;
        String resourceFile;
        NLEResourceAV aVFile2;
        String resourceFile2;
        String str;
        VecNLETrackSPtr tracks = nLEEditor.getModel().getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "BGM") || Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "EDITOR_MUSIC")) {
                arrayList.add(nLETrack);
            }
        }
        for (NLETrack nLETrack3 : arrayList) {
            for (NLETrackSlot nLETrackSlot : nLETrack3.getSlots()) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null && (aVFile2 = nLESegmentAudioDynamicCast.getAVFile()) != null && (resourceFile2 = aVFile2.getResourceFile()) != null && !C357540E0a.LJIILIIL(resourceFile2) && !C2286708xd.LIZJ(resourceFile2)) {
                    MusicBuzModel musicBuzModel = editorProDraftModel.musicBuzModel;
                    String str2 = null;
                    if (musicBuzModel != null) {
                        str = musicBuzModel.path;
                    } else {
                        str = null;
                    }
                    if (C357540E0a.LJIILIIL(str)) {
                        NLEResourceAV aVFile3 = nLESegmentAudioDynamicCast.getAVFile();
                        if (aVFile3 != null) {
                            MusicBuzModel musicBuzModel2 = editorProDraftModel.musicBuzModel;
                            if (musicBuzModel2 != null) {
                                str2 = musicBuzModel2.path;
                            }
                            aVFile3.setResourceFile(str2);
                        }
                    } else {
                        nLETrack3.removeSlot(nLETrackSlot);
                    }
                }
            }
        }
        VecNLETrackSPtr tracks2 = nLEEditor.getModel().getTracks();
        ArrayList<NLETrack> arrayList2 = new ArrayList();
        for (NLETrack nLETrack4 : tracks2) {
            if (Intrinsics.LJFF(nLETrack4.getExtra("AudioTrackType"), "SOUND_EFFECT")) {
                arrayList2.add(nLETrack4);
            }
        }
        for (NLETrack nLETrack5 : arrayList2) {
            for (NLETrackSlot nLETrackSlot2 : nLETrack5.getSlots()) {
                NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                if (nLESegmentAudioDynamicCast2 != null && (aVFile = nLESegmentAudioDynamicCast2.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && !C357540E0a.LJIILIIL(resourceFile) && !C2286708xd.LIZJ(resourceFile)) {
                    nLETrack5.removeSlot(nLETrackSlot2);
                }
            }
        }
    }

    public static String LJIIJJI(EditorProDraftModel editorProDraftModel, String str) {
        if (str != null && !C357540E0a.LJIILIIL(str)) {
            String str2 = editorProDraftModel.copyResMap.get(str);
            if (str2 != null && str2.length() != 0) {
                str = str2;
            }
            if (C2286708xd.LIZJ(str)) {
                return str;
            }
            return null;
        }
        return null;
    }

    public static void LIZJ(NLEModel nLEModel, EditorProDraftModel editorProDraftModel, NLEEditor nLEEditor) {
        NLETrack next;
        NLEResourceAV aVFile;
        String resourceFile;
        NLETrack next2;
        NLESegment mainSegment;
        NLEResourceAV aVFile2;
        String resourceFile2;
        NLEResourceNode effectSDKFilter;
        String resourceFile3;
        NLEResourceNode effectSDKEffect;
        String resourceFile4;
        List<NLETrack> listLIZIZ = C348520DlS.LIZIZ(nLEModel);
        NLESegment mainSegment2 = null;
        if (listLIZIZ != null) {
            Iterator<NLETrack> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                    NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLETrackSlot.getMainSegment());
                    if (nLESegmentEffectDynamicCast != null && (effectSDKEffect = nLESegmentEffectDynamicCast.getEffectSDKEffect()) != null && (resourceFile4 = effectSDKEffect.getResourceFile()) != null && resourceFile4.length() != 0) {
                        LIZ.getClass();
                        String strLJIIJJI = LJIIJJI(editorProDraftModel, resourceFile4);
                        if (strLJIIJJI != null) {
                            editorProDraftModel.nlePublicResPaths.add(strLJIIJJI);
                        }
                    }
                    NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentComposerFilterDynamicCast != null && (effectSDKFilter = nLESegmentComposerFilterDynamicCast.getEffectSDKFilter()) != null && (resourceFile3 = effectSDKFilter.getResourceFile()) != null && resourceFile3.length() != 0) {
                        LIZ.getClass();
                        String strLJIIJJI2 = LJIIJJI(editorProDraftModel, resourceFile3);
                        if (strLJIIJJI2 != null) {
                            editorProDraftModel.nlePublicResPaths.add(strLJIIJJI2);
                        }
                    }
                }
            }
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it3 = tracks.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    NLETrack nLETrack = next2;
                    if (Intrinsics.LJFF(nLETrack.getExtra("RewindTrackType"), "VIDEO") && nLETrack.getEnable()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            NLETrack nLETrack2 = next2;
            if (nLETrack2 != null) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack2.getSlots());
                if (nLETrackSlot2 != null) {
                    mainSegment = nLETrackSlot2.getMainSegment();
                } else {
                    mainSegment = null;
                }
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
                if (nLESegmentVideoDynamicCast != null && (aVFile2 = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceFile2 = aVFile2.getResourceFile()) != null && resourceFile2.length() != 0) {
                    C365970EWl c365970EWl = LIZ;
                    String resourceFile5 = aVFile2.getResourceFile();
                    c365970EWl.getClass();
                    String strLJIIJJI3 = LJIIJJI(editorProDraftModel, resourceFile5);
                    if (strLJIIJJI3 != null) {
                        editorProDraftModel.nleCreativeResPaths.add(strLJIIJJI3);
                    }
                }
            }
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        if (tracks2 != null) {
            Iterator<NLETrack> it4 = tracks2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    NLETrack nLETrack3 = next;
                    if (Intrinsics.LJFF(nLETrack3.getExtra("RewindTrackType"), "AUDIO") && nLETrack3.getEnable()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack4 = next;
            if (nLETrack4 != null) {
                NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack4.getSlots());
                if (nLETrackSlot3 != null) {
                    mainSegment2 = nLETrackSlot3.getMainSegment();
                }
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(mainSegment2);
                if (nLESegmentAudioDynamicCast != null && (aVFile = nLESegmentAudioDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && resourceFile.length() != 0) {
                    C365970EWl c365970EWl2 = LIZ;
                    String resourceFile6 = aVFile.getResourceFile();
                    c365970EWl2.getClass();
                    String strLJIIJJI4 = LJIIJJI(editorProDraftModel, resourceFile6);
                    if (strLJIIJJI4 != null) {
                        editorProDraftModel.nleCreativeResPaths.add(strLJIIJJI4);
                    }
                }
            }
        }
        CopyOnWriteArrayList<EditorProEffectInfo> copyOnWriteArrayList = editorProDraftModel.effectsInfo;
        List listLIZIZ2 = C348370DlD.LIZIZ(nLEEditor.getModel());
        ArrayList<C348380DlE> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ2) {
            C365970EWl c365970EWl3 = LIZ;
            String str = ((C348380DlE) obj).LIZLLL;
            c365970EWl3.getClass();
            String strLJIIJJI5 = LJIIJJI(editorProDraftModel, str);
            if (strLJIIJJI5 != null && strLJIIJJI5.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C348380DlE c348380DlE : arrayList) {
            String str2 = c348380DlE.LJFF;
            String str3 = c348380DlE.LJII;
            C365970EWl c365970EWl4 = LIZ;
            String str4 = c348380DlE.LIZLLL;
            c365970EWl4.getClass();
            arrayList2.add(new EditorProEffectInfo(str2, str3, LJIIJJI(editorProDraftModel, str4)));
        }
        copyOnWriteArrayList.addAll(arrayList2);
    }
}

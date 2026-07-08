package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftPathCollectorKt;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS110S0101000_2;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570200MXy {
    public static final List<String> LIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(C20021913Vp.LIZ().getAbsolutePath()));
        sbLIZ.append("mvtheme");
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("mvres");
        sbLIZ.append(str);
        LIZ = C1697810uHb.LJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF(), C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCacheRoot(), C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot(), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "filter").getAbsolutePath()), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "filters").getAbsolutePath()), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "font").getAbsolutePath()), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "effect").getAbsolutePath()), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "music").getAbsolutePath()), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "effectmodel").getAbsolutePath()), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "duet").getAbsolutePath()), C570490MZb.LIZJ(new C0VSJ(C20021913Vp.LIZ(), "audio-effect").getAbsolutePath()), C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [T, X.13BV] */
    public static final List<DraftFileRestoreResult> LIZLLL(AwemeDraft awemeDraft, CreativeInfo creativeInfo) throws Throwable {
        C0M5Z<String> c0m5zLIZ;
        boolean z;
        Object next;
        boolean z2;
        Integer num;
        Object next2;
        DraftFileRestoreResult draftFileRestoreResult;
        boolean z3;
        String strLIZJ;
        DraftFileRestoreException first;
        String duetAudioPath;
        List<StickerItemModel> list;
        String audioTrackFilePath;
        boolean z4;
        TextStickerData textStickerData;
        IStorySocialEventStickerService iStorySocialEventStickerService;
        C20169013vs c20169013vsLIZJ;
        boolean z5;
        String duetAudioPath2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJIZL.multiEditVideoData;
        ArrayList<Pair> arrayList = null;
        if (multiEditVideoStatusRecordData != null) {
            c0m5zLIZ = DraftPathCollectorKt.LIZ(multiEditVideoStatusRecordData);
        } else {
            c0m5zLIZ = null;
        }
        if (c0m5zLIZ != null && !c0m5zLIZ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            draftFileRestoreResult = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, null, false, new DraftFileRestoreException(0, null, "Unknown"));
        } else {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c0m5zLIZ, 10));
            for (String str : c0m5zLIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String parent = new C0VSJ(str).getParent();
                if (parent != null) {
                    strLIZJ = C570490MZb.LIZJ(parent);
                } else {
                    strLIZJ = null;
                }
                sbLIZ.append(strLIZJ);
                sbLIZ.append("data.txt");
                if (!C570490MZb.LJ(C2188811AlT.LIZIZ(sbLIZ))) {
                    first = new DraftFileRestoreException(0, null, "Unknown");
                } else {
                    first = C0MYE.LIZ(str, awemeDraft.LIZIZ(), creativeInfo, C2298008zS.LIZ).getFirst();
                }
                arrayList2.add(first);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    DraftFileRestoreException draftFileRestoreException = (DraftFileRestoreException) next;
                    if (!draftFileRestoreException.isSuc() && C0MYY.LIZIZ(draftFileRestoreException)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                num = 2131832436;
            } else {
                num = null;
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (!((DraftFileRestoreException) next2).isSuc()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            DraftFileRestoreException draftFileRestoreException2 = (DraftFileRestoreException) next2;
            if (draftFileRestoreException2 == null) {
                draftFileRestoreException2 = new DraftFileRestoreException(0, null, "Unknown");
            }
            draftFileRestoreResult = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, num, true, draftFileRestoreException2);
        }
        String str2 = awemeDraft.LJII;
        DuetExtraInfo duetExtraInfo = awemeDraft.LJJJJIZL.duetExtraInfo;
        if (duetExtraInfo != null) {
            duetAudioPath = duetExtraInfo.getDuetAudioPath();
        } else {
            duetAudioPath = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str2, duetAudioPath);
        C0MY6 c0my6 = C0MY6.LIZ;
        List<DraftFileRestoreResult> listLIZIZ = LIZIZ(awemeDraft, creativeInfo, C0MY6.LIZ(c0my6, AVDraftExtras.class, C0MY0.class, false, 12), awemeDraft.LJJJJIZL);
        List<DraftFileRestoreResult> listLIZIZ2 = LIZIZ(awemeDraft, creativeInfo, C0MY6.LIZ(c0my6, CreativeModel.class, C0MY0.class, false, 12), awemeDraft.LIZ);
        if (zLJFF) {
            DuetExtraInfo duetExtraInfo2 = awemeDraft.LJJJJIZL.duetExtraInfo;
            if (duetExtraInfo2 != null) {
                duetAudioPath2 = duetExtraInfo2.getDuetAudioPath();
            } else {
                duetAudioPath2 = null;
            }
            awemeDraft.LJII = duetAudioPath2;
        }
        ArrayList arrayList3 = new ArrayList();
        if (!awemeDraft.LIZ.stickerModel.textStickerModels.isEmpty()) {
            List<TextStickerModel> list2 = awemeDraft.LIZ.stickerModel.textStickerModels;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (TextStickerModel textStickerModel : list2) {
                arrayList4.add(new Pair(textStickerModel, C0F7U.LIZJ(textStickerModel)));
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : arrayList4) {
                String audioTrackFilePath2 = ((TextStickerData) ((Pair) obj).getSecond()).getAudioTrackFilePath();
                if (audioTrackFilePath2 != null && audioTrackFilePath2.length() != 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    arrayList5.add(obj);
                }
            }
            if (true ^ arrayList5.isEmpty()) {
                arrayList = arrayList5;
            }
            C576150Mij c576150MijLIZ = C0MY6.LIZ(C0MY6.LIZ, TextStickerData.class, C0MY0.class, false, 12);
            if (arrayList != null) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.addAll(LIZIZ(awemeDraft, creativeInfo, c576150MijLIZ, ((Pair) it4.next()).getSecond()));
                }
            }
        } else {
            InfoStickerModel infoStickerModel = awemeDraft.LJJJJIZL.infoStickerModel;
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                ArrayList<StickerItemModel> arrayList6 = new ArrayList();
                for (StickerItemModel stickerItemModel : list) {
                    if (stickerItemModel.isTextSticker()) {
                        arrayList6.add(stickerItemModel);
                    }
                }
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
                for (StickerItemModel stickerItemModel2 : arrayList6) {
                    try {
                        textStickerData = (TextStickerData) C0CHQ.LIZ().getGson().LJII(stickerItemModel2.extra, TextStickerData.class);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        textStickerData = null;
                    }
                    arrayList7.add(new Pair(stickerItemModel2, textStickerData));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : arrayList7) {
                    TextStickerData textStickerData2 = (TextStickerData) ((Pair) obj2).getSecond();
                    if (textStickerData2 != null) {
                        audioTrackFilePath = textStickerData2.getAudioTrackFilePath();
                    } else {
                        audioTrackFilePath = null;
                    }
                    if (audioTrackFilePath != null && audioTrackFilePath.length() != 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        arrayList8.add(obj2);
                    }
                }
                if (true ^ arrayList8.isEmpty()) {
                    arrayList = arrayList8;
                }
                if (arrayList != null) {
                    C576150Mij c576150MijLIZ2 = C0MY6.LIZ(C0MY6.LIZ, TextStickerData.class, C0MY0.class, false, 12);
                    for (Pair pair : arrayList) {
                        Object second = pair.getSecond();
                        if (second != null) {
                            arrayList3.addAll(LIZIZ(awemeDraft, creativeInfo, c576150MijLIZ2, second));
                            ((StickerItemModel) pair.getFirst()).extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), second);
                        }
                    }
                }
            }
        }
        ArrayList arrayList9 = new ArrayList();
        if (C1428470nHB.LLD(awemeDraft.LIZ) && (iStorySocialEventStickerService = (IStorySocialEventStickerService) PluggableExtentionKt.pluggableSpi$default(IStorySocialEventStickerService.class, false, false, false, 14, null)) != null && (c20169013vsLIZJ = iStorySocialEventStickerService.LIZJ()) != null && !c20169013vsLIZJ.LIZLLL(awemeDraft.LIZ.storyEventStickerData.getCommonStickerData())) {
            arrayList9.add(new DraftFileRestoreResult(0, 0, null, false, new DraftFileRestoreException(-3001, null, "Unknown")));
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C13BV.INSTANCE;
        C391360FWc.LJ("", new AwS249S0300000_5(awemeDraft, (AwemeDraft) creativeInfo, (CreativeInfo) c259800zU, (C259800zU<List<DraftFileRestoreResult>>) 28));
        List<DraftFileRestoreResult> listLJLIL = C13LP.LJLIL(arrayList9, C13LP.LJLIL((Iterable) c259800zU.element, C13LP.LJLIL(arrayList3, C13LP.LJLIL(listLIZIZ2, C13LP.LJLIL(listLIZIZ, C13LP.LJLILLLLZI(draftFileRestoreResult, new ArrayList()))))));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DraftCreativeRestoreHandler ; restore done ... ; results : ");
        sbLIZ2.append(listLJLIL);
        C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return listLJLIL;
    }

    public static final List<DraftFileRestoreResult> LJ(AwemeDraft awemeDraft, CreativeInfo creativeInfo) throws Throwable {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        EditVideoSegment editVideoSegmentLIZIZ;
        String str;
        Integer num;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_nle_creative_files_restore", true, false)) {
            return C13BV.INSTANCE;
        }
        C0FGC.LIZ(2);
        CreativeInfo creativeInfoLIZIZ = awemeDraft.LIZIZ();
        ArrayList arrayList = new ArrayList();
        NLEModel model = awemeDraft.LIZ.nleInfoModel.nleModel;
        if (!C350300DoK.LIZ() || awemeDraft.LIZ.nleInfoModel.nleDataChange || model == null) {
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(awemeDraft.LJIIJJI);
            model = nLEEditorLIZ.getModel();
            if (model == null) {
                return C13BV.INSTANCE;
            }
            if (C350300DoK.LIZ()) {
                NLEInfoModel nLEInfoModel = awemeDraft.LIZ.nleInfoModel;
                nLEInfoModel.nleModel = model;
                nLEInfoModel.nleDataChange = false;
            }
        }
        Iterator<NLEResourceNode> it2 = model.getAllResources().iterator();
        while (it2.hasNext()) {
            String resourceFile = it2.next().getResourceFile();
            if (resourceFile != null && !a0.LJJJIL(resourceFile) && !a0.LJJJIL(resourceFile) && u.LJJIIJZLJL(resourceFile, C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfoLIZIZ), false) && ((Regex) C20021913Vp.LJI.getValue()).matches(resourceFile) && ((str = awemeDraft.LJIJJ.get(resourceFile)) == null || a0.LJJJIL(str))) {
                Pair<DraftFileRestoreException, String> pairLIZ = C0MYE.LIZ(resourceFile, creativeInfoLIZIZ, creativeInfo, C2298008zS.LIZ);
                String second = pairLIZ.getSecond();
                if (pairLIZ.getFirst().isSuc() && second != null && second.length() != 0 && !Intrinsics.LJFF(second, resourceFile)) {
                    awemeDraft.LJIJJ.put(resourceFile, second);
                } else {
                    boolean zLIZIZ = C0MYY.LIZIZ(pairLIZ.getFirst());
                    if (zLIZIZ) {
                        num = 2131832436;
                    } else {
                        num = null;
                    }
                    arrayList.add(new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, num, zLIZIZ, pairLIZ.getFirst()));
                }
            }
        }
        if (awemeDraft.LJJJJIZL.previewInfo == null && C275840ArW.LIZJ) {
            C201955140j.LJ("DraftCreativeRestoreHandler: previewInfo is null, try restore preview info from nle model");
            NLETrack mainTrack = model.getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (editVideoSegmentLIZIZ = C0F1Y.LIZIZ(nLETrackSlot)) != null) {
                String videoPath = awemeDraft.LJIJJ.get(editVideoSegmentLIZIZ.getVideoPath());
                if (videoPath == null) {
                    videoPath = editVideoSegmentLIZIZ.getVideoPath();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DraftCreativeRestoreHandler: restore preview info from nle model, oldPath: ");
                sbLIZ.append(editVideoSegmentLIZIZ.getVideoPath());
                sbLIZ.append(", newVideoPath: ");
                sbLIZ.append(videoPath);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                editVideoSegmentLIZIZ.setVideoPath(videoPath);
                awemeDraft.LJJJJIZL.previewInfo = new C538330L9j(0, 0, 15).LIZ(editVideoSegmentLIZIZ);
                C1AF0.LJ(new C0MY1("Degraded from NLE"));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0DrQ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJFF(com.ss.android.ugc.aweme.draft.model.AwemeDraft r9, final com.ss.android.ugc.aweme.creative.model.CreativeInfo r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof X.C352380Drg
            if (r0 == 0) goto L8a
            r7 = r11
            X.0Drg r7 = (X.C352380Drg) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r8 = 1
            if (r0 == 0) goto L36
            if (r0 != r8) goto L90
            com.bytedance.ies.nle.editor_jni.NLEEditor r3 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r9 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            r3.commit()
            r3.done()
            java.lang.String r0 = r3.store()
            r9.LJIJJ(r0)
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = X.C346900Diq.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4a:
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r9.LJJJJIZL
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r5 = r0.audioRecorderParam
            if (r5 != 0) goto L53
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            java.lang.String r0 = r5.getAudioUrl()
            int r0 = r0.length()
            if (r0 <= 0) goto L33
            java.util.List r0 = r5.getMultiTrackAudio()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L33
            X.0DrQ r4 = new X.0DrQ
            r4.<init>(r10)
            com.bytedance.ies.nle.editor_jni.NLEEditor r3 = X.C346630DiP.LIZ()
            java.lang.String r0 = r9.LJIIJJI
            r3.restore(r0)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0Dr0 r1 = new X.0Dr0
            r0 = 0
            r1.<init>(r3, r5, r4, r0)
            r7.LL = r9
            r7.LLILLJJLI = r3
            r7.LLILZ = r8
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r6) goto L26
            return r6
        L8a:
            X.0Drg r7 = new X.0Drg
            r7.<init>(r11)
            goto L12
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C570200MXy.LJFF(com.ss.android.ugc.aweme.draft.model.AwemeDraft, com.ss.android.ugc.aweme.creative.model.CreativeInfo, X.05Vn):java.lang.Object");
    }

    public static final <HandleClass> List<DraftFileRestoreResult> LIZIZ(final AwemeDraft awemeDraft, final CreativeInfo creativeInfo, C576150Mij<HandleClass, C0MY0> c576150Mij, HandleClass handleclass) throws Throwable {
        final CreativeInfo creativeInfoLIZIZ = awemeDraft.LIZIZ();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final HashMap map = new HashMap();
        try {
            c576150Mij.LIZIZ(handleclass, new InterfaceC576180Mim<C0MY0>() { // from class: X.0MXz
                @Override // X.InterfaceC576180Mim
                public final void LJ(Field field, Object obj, Annotation annotation) throws Throwable {
                    C570200MXy.LIZJ(map, awemeDraft, creativeInfoLIZIZ, creativeInfo, arrayList, arrayList2, (String) field.get(obj), (C0MY0) annotation, new AwS374S0200000_8(field, obj, 202));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZ(Field field, String str, Annotation annotation, List list) throws Throwable {
                    C570200MXy.LIZJ(map, awemeDraft, creativeInfoLIZIZ, creativeInfo, arrayList, arrayList2, str, (C0MY0) annotation, new C020R(list, (List<Pair<String, String>>) str, (String) 7));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZIZ(Field field, Map map2, Object obj, Annotation annotation) throws Throwable {
                    C570200MXy.LIZJ(map, awemeDraft, creativeInfoLIZIZ, creativeInfo, arrayList, arrayList2, (String) map2.get(obj), (C0MY0) annotation, new AwS368S0200000_2(obj, map2, 132));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZJ(Field field, String[] strArr, int i, Annotation annotation) throws Throwable {
                    C570200MXy.LIZJ(map, awemeDraft, creativeInfoLIZIZ, creativeInfo, arrayList, arrayList2, strArr[i], (C0MY0) annotation, new AwS116S0101000_8(i, strArr, 9));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZLLL(Field field, List list, int i, Annotation annotation) throws Throwable {
                    C570200MXy.LIZJ(map, awemeDraft, creativeInfoLIZIZ, creativeInfo, arrayList, arrayList2, (String) ListProtector.get(list, i), (C0MY0) annotation, new AwS110S0101000_2(list, (List<String>) i, 14));
                }
            });
        } catch (C0MY2 e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C13LP.LJLIL(arrayList2, C13LP.LJLIL(arrayList, new ArrayList()));
    }

    public static final Object LIZ(String str, String str2, String str3, Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LIZ(C0CHQ.LIZ, str2, str3, null, bool, new C1418100n0S("draft_recover", str, EnumC1412640mre.CUT_SAME), new InterfaceC1428880nHq() { // from class: X.0L6t
            @Override // X.InterfaceC1428880nHq
            public final void LIZIZ(Exception exc) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZLLL(AVMusic aVMusic) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJI() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJII(int i) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZ(Integer num, String str4) {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download music failed, errCode: ");
                sbLIZ.append(num);
                sbLIZ.append(", errMsg: ");
                sbLIZ.append(str4);
                C098200Yq c098200Yq = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJFF(AVMusic aVMusic, String str4, boolean z, boolean z2) {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZJ(Map<String, String> map, AwemeDraft awemeDraft, CreativeInfo creativeInfo, CreativeInfo creativeInfo2, List<DraftFileRestoreResult> list, List<DraftFileRestoreResult> list2, String str, C0MY0 c0my0, Function1<? super String, Unit> function1) throws Throwable {
        boolean z;
        String second = map.get(str);
        String str2 = second;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Integer num = null;
        if (!(!z) || second == null) {
            Pair<DraftFileRestoreException, String> pairLIZ = C0MYE.LIZ(str, creativeInfo, creativeInfo2, C2298008zS.LIZ);
            boolean zLIZIZ = C0MYY.LIZIZ(pairLIZ.getFirst());
            int i = 2131832436;
            if (c0my0.blockCreative() && !pairLIZ.getFirst().isSuc()) {
                if (!zLIZIZ) {
                    i = 2131836216;
                }
                list.add(new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, Integer.valueOf(i), true, pairLIZ.getFirst()));
                final DraftFileRestoreException first = pairLIZ.getFirst();
                throw new C0MY3(first) { // from class: X.0MY2
                    public static final int $stable = 8;
                    public final DraftFileRestoreException LL;

                    public final DraftFileRestoreException getRestoreException() {
                        return this.LL;
                    }

                    {
                        this.LL = first;
                    }
                };
            }
            if (!c0my0.blockCreative() && !pairLIZ.getFirst().isSuc()) {
                if (zLIZIZ) {
                    num = 2131832436;
                }
                list2.add(new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, num, zLIZIZ, pairLIZ.getFirst()));
            } else {
                map.put(str, pairLIZ.getSecond());
            }
            second = pairLIZ.getSecond();
            if (second == null) {
                return;
            }
        }
        if (!Intrinsics.LJFF(second, str)) {
            function1.invoke(second);
            awemeDraft.LJIJJ.put(str, second);
        }
    }
}

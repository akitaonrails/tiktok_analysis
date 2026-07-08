package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.templatecore.templatedata.TextStickerBizModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0n0I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418000n0I {
    public static final C1418000n0I LIZ = new C1418000n0I();
    public static final Map<CutSource, List<MetaExt>> LIZIZ = new LinkedHashMap();

    public static CreativeInfo LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateUtils getCreativeInfo: extra = ");
        sbLIZ.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        try {
            CreativeInfo creativeInfo = (CreativeInfo) C7740030o.LIZ().getGson().LJII(str, CreativeInfo.class);
            if (creativeInfo == null) {
                C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, "AutoCutTemplateUtils failed to parse creativeInfo from extra");
                return creativeInfo;
            }
            return creativeInfo;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1398350mUb.LIZIZ, "AutoCutTemplateUtils", e);
            C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, "AutoCutTemplateUtils failed to parse creativeInfo from extra");
            return null;
        }
    }

    public static void LIZJ(NLETemplateModel nLETemplateModel, InterfaceC1635410sex interfaceC1635410sex) {
        Pair<String, String> pairLIZJ;
        String second;
        NLESegment mainSegment;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() == NLETrackType.STICKER) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack2.getSlots());
                if (nLETrackSlot != null) {
                    mainSegment = nLETrackSlot.getMainSegment();
                } else {
                    mainSegment = null;
                }
                if (NLESegmentTextSticker.dynamicCast((NLENode) mainSegment) != null) {
                    arrayList.add(nLETrack);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (it3.hasNext()) {
                    try {
                        TextStickerBizModel textStickerBizModel = (TextStickerBizModel) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), it3.next().getExtra("biz_data"), TextStickerBizModel.class);
                        if (textStickerBizModel != null && (pairLIZJ = C0FGD.LIZJ(textStickerBizModel.ttsInfo.voiceResId)) != null && (second = pairLIZJ.getSecond()) != null && second.length() > 0) {
                            linkedHashSet.add(second);
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJI("preloadTTSEffects error", e);
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel", "speaking-voice");
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.Cg(C13LP.LLIIII(linkedHashSet), linkedHashMap, new IFetchEffectListByIdsListener() { // from class: X.0EKJ
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetch voice res failed,code: ");
                    String msg = null;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(" msg: ");
                    if (exceptionResult != null) {
                        msg = exceptionResult.getMsg();
                    }
                    sbLIZ.append(msg);
                    C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                        for (Effect effect : data) {
                            C0LE8.LIZ.getClass();
                            C0LE8.LJFF.LIZJ(effect, "speaking-voice", effect.getResourceId());
                        }
                        return;
                    }
                    C201955140j.LJIIZILJ("fetch voice res success but data is empty");
                }
            });
        }
    }

    public static void LJI(NLETemplateModel nLETemplateModel, CreativeInfo creativeInfo) throws Throwable {
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment2;
        NLEResourceNode resource2;
        String first;
        File[] fileArrListFiles;
        NLESegment mainSegment3;
        NLEResourceNode resource3;
        for (NLETrack nLETrack : nLETemplateModel.getTracks()) {
            String extra = nLETrack.getExtra("biz_extra_type");
            if (Intrinsics.LJFF(extra, "dub")) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
                if (nLETrackSlot2 != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                    String resourceFile = resource.getResourceFile();
                    InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
                    EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.AUDIO_RECORD;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append(".wav");
                    String strLIZLLL = C2298208zU.LIZLLL(pathService, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false, 8);
                    if (C2471909mP.LIZJ(resourceFile, strLIZLLL)) {
                        resource.setResourceFile(strLIZLLL);
                    }
                    if (nLETrack.getTrackType() != NLETrackType.FILTER && !Intrinsics.LJFF(nLETrack.getExtra("biz_extra_type"), "normal_effect") && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null && (mainSegment2 = nLETrackSlot.getMainSegment()) != null && (resource2 = mainSegment2.getResource()) != null) {
                        Pair<String, String> pairLIZJ = C0FGD.LIZJ(resource2.getResourceId());
                        C0LE8.LIZ.getClass();
                        C389400FOo c389400FOo = C0LE8.LJFF;
                        String second = null;
                        if (pairLIZJ != null) {
                            first = pairLIZJ.getFirst();
                            second = pairLIZJ.getSecond();
                        } else {
                            first = null;
                        }
                        Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
                        if (effectLIZIZ != null) {
                            String strLIZIZ = C0CHQ.LIZ().LJJIL().LIZ().LIZIZ(effectLIZIZ.getEffectId());
                            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                            if (!c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null || fileArrListFiles.length == 0) {
                                C2286708xd.LJ(resource2.getResourceFile(), strLIZIZ);
                            }
                            resource2.setResourceFile(strLIZIZ);
                        }
                    }
                }
            } else {
                if (Intrinsics.LJFF(extra, "text_read")) {
                    NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
                    if (nLETrackSlot3 != null && (mainSegment3 = nLETrackSlot3.getMainSegment()) != null && (resource3 = mainSegment3.getResource()) != null) {
                        String resourceFile2 = resource3.getResourceFile();
                        InterfaceC570310MYj pathService2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
                        EnumC20228214Cy enumC20228214Cy2 = EnumC20228214Cy.TEXT_STICKER;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(System.currentTimeMillis());
                        sbLIZ2.append(".mp3");
                        String strLIZLLL2 = C2298208zU.LIZLLL(pathService2, creativeInfo, enumC20228214Cy2, C2188811AlT.LIZIZ(sbLIZ2), false, 8);
                        if (C2471909mP.LIZJ(resourceFile2, strLIZLLL2)) {
                            resource3.setResourceFile(strLIZLLL2);
                        }
                    }
                }
                if (nLETrack.getTrackType() != NLETrackType.FILTER) {
                }
            }
        }
    }

    public static void LJFF(InterfaceC1418120n0U interfaceC1418120n0U, List list, String str, Function1 function1, Function2 function2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateUtils startCompressMeta: metaList size = ");
        sbLIZ.append(list.size());
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MetaExt metaExt = (MetaExt) it2.next();
            if (!C2471909mP.LJJIII(metaExt.path, true, 4)) {
                C2356009La c2356009La = C2356009La.LIZ;
                String str2 = metaExt.path;
                c2356009La.getClass();
                if (C2356009La.LIZ(str2) != null) {
                    metaExt.setDuration(r0.duration);
                }
            }
            arrayList.add(metaExt);
        }
        if (interfaceC1418120n0U == null) {
            interfaceC1418120n0U = new C1419950n3R("CC", arrayList, str);
        }
        interfaceC1418120n0U.LIZ(function1);
        interfaceC1418120n0U.LIZJ(function2);
        interfaceC1418120n0U.LIZIZ();
    }

    public final synchronized void LJ(CutSource cutSource, NLETemplateModel nLETemplateModel, Context context, List<MetaExt> list, String str, int i, boolean z, C1417970n0F c1417970n0F) {
        NLETemplateModel nLETemplateModel2;
        NLEResType nLEResType;
        Map linkedHashMap;
        CreativeInfo creativeInfoLIZIZ;
        if (nLETemplateModel != null && list != null) {
            Map<CutSource, List<MetaExt>> map = LIZIZ;
            map.remove(cutSource);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoCutTemplateUtils template source response templateMetaMap size=");
            sbLIZ.append(map.size());
            C1417710mzp.LIZ(LogLevel.LEVEL_DEBUG, C2188811AlT.LIZIZ(sbLIZ));
            for (MetaExt metaExt : list) {
                if (!C2286708xd.LIZJ(metaExt.path)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoCutTemplateUtils -----------prepareTemplateSource: fail, checkCompress error, path = ");
                    sbLIZ2.append(metaExt.path);
                    C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ2));
                    c1417970n0F.onFailure("", SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "checkCompress error", new UnorderedMapStrStr());
                    return;
                }
            }
            for (InterfaceC1418260n0i interfaceC1418260n0i : c1417970n0F.LIZ) {
                if (interfaceC1418260n0i != null) {
                    interfaceC1418260n0i.LIZLLL("fill_media");
                }
            }
            if (i == EnumC1412640mre.PUGC_TEMPLATE.getValue() && (creativeInfoLIZIZ = LIZIZ(str)) != null) {
                LIZ.getClass();
                LJI(nLETemplateModel, creativeInfoLIZIZ);
            }
            com.ss.android.ugc.aweme.autocut.s.LIZ.getClass();
            com.ss.android.ugc.aweme.autocut.s.LJIIJJI(nLETemplateModel);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (MetaExt metaExt2 : list) {
                String str2 = metaExt2.path;
                if (metaExt2.isVideo()) {
                    nLEResType = NLEResType.VIDEO;
                } else {
                    nLEResType = NLEResType.IMAGE;
                }
                long j = metaExt2.duration;
                Long lValueOf = Long.valueOf(metaExt2.createTime);
                if (lValueOf.longValue() > 0) {
                    linkedHashMap = C2097608Jq.LJIIJ(new Pair("create_time", Long.valueOf(lValueOf.longValue())));
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                arrayList.add(new C0E4S(str2, nLEResType, j, 1.0f, 0L, j, null, linkedHashMap, 64));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0CHQ.LIZ().LJIILL().updateVideoInfoCache(((C0E4S) it2.next()).LIZ);
            }
            if (C298910Bnd.LIZ()) {
                nLETemplateModel2 = nLETemplateModel;
                ((ITemplateApplyService) ServiceManager.get().getService(ITemplateApplyService.class)).LIZ(nLETemplateModel2, arrayList, C1412390mrF.LJIIJ, C1412660mrg.LIZJ(i), context, C0E4V.CIRCLE_V2, true, z, false);
            } else {
                nLETemplateModel2 = nLETemplateModel;
                ((ITemplateApplyService) ServiceManager.get().getService(ITemplateApplyService.class)).LIZ(nLETemplateModel2, arrayList, C1412390mrF.LJIIJ, C1412660mrg.LIZJ(i), context, C0E4V.NONE, false, z, false);
            }
            NLEModel nLEModelSaveToDraft = NLETemplateModel.saveToDraft(nLETemplateModel2);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateUtils -----------prepareTemplateSource: end ------------");
            for (InterfaceC1418260n0i interfaceC1418260n0i2 : c1417970n0F.LIZ) {
                if (interfaceC1418260n0i2 != null) {
                    interfaceC1418260n0i2.LJIILLIIL("fill_media");
                }
            }
            c1417970n0F.onSuccess(nLEModelSaveToDraft, new UnorderedMapStrStr());
        }
    }

    public static void LIZ(CutSource cutSource, Context context, String str, boolean z, int i, boolean z2, NLEPrepareListener nLEPrepareListener, ICutReporter iCutReporter, LifecycleOwner lifecycleOwner) {
        boolean z3;
        boolean z4;
        boolean z5 = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateUtils, fetchTemplateResource[] enableAsyncRender=");
        sbLIZ.append(z5);
        sbLIZ.append(", value = ");
        sbLIZ.append(cutSource.value);
        sbLIZ.append(", md5 = ");
        sbLIZ.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (cutSource.value.length() == 0) {
            nLEPrepareListener.onError(-1, "empty url");
            return;
        }
        if (i != EnumC1412640mre.PUGC_TEMPLATE.getValue() ? !(!z5 || !C13LQ.LJIILJJIL(i, (int[]) C1418490n15.LIZIZ.getValue())) : !(!z5 || ((Boolean) C0AY8.LIZ.getValue()).booleanValue())) {
            z5 = false;
        }
        ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
        C1419810n3D.LIZ.getClass();
        NLEModelDownloader nLEModelDownloaderLIZIZ = C1419810n3D.LIZIZ(i);
        if (i == EnumC1412640mre.AIGT.getValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i == EnumC1412640mre.SGT.getValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        C0LB9.LIZ(iTemplateResourceService, context, cutSource, new C1428840nHm(str, Boolean.valueOf(z5), z2, nLEModelDownloaderLIZIZ, (EnumC539100LCi) null, iCutReporter, z3, z4, nLEPrepareListener, 40), lifecycleOwner, 16);
    }

    public static b LIZLLL(Context context, CutSource cutSource, List list, String str, boolean z, String str2, String str3, int i, InterfaceC1635410sex interfaceC1635410sex, boolean z2, InterfaceC1418120n0U interfaceC1418120n0U, LifecycleOwner lifecycleOwner) {
        return C09IC.LJ(new C1417950n0D(str2, str3, cutSource, list, context, "", z, i, z2, lifecycleOwner, interfaceC1418120n0U, str, interfaceC1635410sex, null));
    }
}

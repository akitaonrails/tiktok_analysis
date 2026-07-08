package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.TemplateInfo;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.ss.android.ugc.aweme.autocut.PreloadNLEConfig;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417340mzE implements InterfaceC1417610mzf<C1417310mzB> {
    public final VideoPublishEditModel LIZ;
    public final List<AutoCutMediaModel> LIZIZ;
    public final boolean LIZJ;
    public final ConcurrentLinkedDeque<C1417350mzF> LIZLLL = new ConcurrentLinkedDeque<>();
    public final ConcurrentHashMap<Pair<Integer, C0MJ9>, C1417350mzF> LJ = new ConcurrentHashMap<>();
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final PreloadNLEConfig LJI;
    public final AtomicInteger LJII;
    public Function2<? super Pair<Integer, ? extends C0MJ9>, ? super C1417310mzB, Unit> LJIIIIZZ;

    @Override // X.InterfaceC1417610mzf
    public final void LIZ() {
        this.LJFF.set(true);
    }

    @Override // X.InterfaceC1417610mzf
    public final void LIZIZ() {
        this.LJFF.set(false);
        LIZJ();
    }

    public final void LIZJ() {
        if (this.LJFF.get()) {
            return;
        }
        if (this.LJII.get() >= this.LJI.maxConcurrentCount) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("executeNext: over preloading count limit. maxConcurrentCount=");
            sbLIZ.append(this.LJI.maxConcurrentCount);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (this.LIZLLL.isEmpty()) {
            return;
        }
        Iterator<C1417350mzF> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            final C1417350mzF next = it2.next();
            String str = null;
            if ((next != null ? next.LJIIIIZZ : null) == EnumC1417510mzV.NONE) {
                this.LJII.incrementAndGet();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("executeNext: next task source =");
                sbLIZ2.append(next.LJII.LIZ);
                sbLIZ2.append(", next task theme=");
                sbLIZ2.append(new Pair(Integer.valueOf(next.LJII.LIZIZ), next.LJII.LIZ));
                sbLIZ2.append(", left task size=");
                sbLIZ2.append(this.LIZLLL.size());
                sbLIZ2.append(", preloadingCount=");
                sbLIZ2.append(this.LJII.get());
                C2188811AlT.LIZIZ(sbLIZ2);
                next.LJIIIZ = System.currentTimeMillis();
                next.LJIIIIZZ = EnumC1417510mzV.PRELOADING;
                C1417310mzB c1417310mzB = next.LJII;
                AutoCutThemeData autoCutThemeData = next.LIZ.LIZIZ;
                int i = autoCutThemeData.templateType;
                c1417310mzB.LIZJ = i;
                c1417310mzB.LJIIIZ = autoCutThemeData.templateId;
                c1417310mzB.LJIJJ = autoCutThemeData.musicId;
                c1417310mzB.LJIJI = autoCutThemeData.musicUrl;
                c1417310mzB.LJIJJLI = autoCutThemeData.musicPostUnavailable;
                c1417310mzB.LJIIJ = autoCutThemeData.templateGroupId;
                c1417310mzB.LJIIJJI = autoCutThemeData.templateTag;
                c1417310mzB.LJIIL = autoCutThemeData.sceneType;
                if (i == EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()) {
                    next.LIZIZ(next.LIZ.LIZIZ);
                    String str2 = next.LIZ.LIZIZ.autoPickNleDraft;
                    if (str2 != null && (true ^ a0.LJJJIL(str2))) {
                        str = str2;
                    }
                    if (str == null) {
                        next.LIZJ(1016, Integer.MIN_VALUE, "AutoPick nleSummary is null");
                        return;
                    }
                    NLETemplateModel nLETemplateModelRestore = NLETemplateModel.restore(str);
                    if (nLETemplateModelRestore == null) {
                        next.LIZJ(1016, Integer.MIN_VALUE, "NLETemplateModel.restore() returned null");
                        return;
                    }
                    TemplateInfo templateInfo = nLETemplateModelRestore.getTemplateInfo();
                    if (templateInfo != null) {
                        templateInfo.clearMutableItems();
                    }
                    String strStore = nLETemplateModelRestore.store();
                    ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) PluggableExtentionKt.pluggableSpi$default(ITemplateResourceService.class, false, false, false, 14, null);
                    if (iTemplateResourceService == null) {
                        next.LIZJ(1016, Integer.MIN_VALUE, "ITemplateResourceService not available");
                        return;
                    }
                    Application application = C0CHQ.LIZ;
                    CutSource cutSource = new CutSource(strStore, CutSourceType.JSON);
                    C1419810n3D.LIZ.getClass();
                    C0LB9.LIZ(iTemplateResourceService, application, cutSource, new C1428840nHm("", (Boolean) null, false, (NLEModelDownloader) C1419810n3D.LJIIIZ.getValue(), EnumC539100LCi.UGC, (ICutReporter) null, false, false, new NLEPrepareListener() { // from class: X.0LB5
                        @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                        public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                        }

                        @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                        public final void onProgress(float f, String str3) {
                        }

                        @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                        public final void onSuccess(NLETemplateModel nLETemplateModel) {
                            CreativeModel creativeModel;
                            AutoPickModel autoPickModel;
                            List<AutoPickMediaModel> list;
                            VecNLETrackSlotSPtr sortedSlots;
                            NLEResourceAV aVFile;
                            AutoPickMediaModel next2;
                            NLEResType nLEResType;
                            String resourceId;
                            if (nLETemplateModel == null) {
                                next.LIZJ(1016, Integer.MIN_VALUE, "downloadTemplate returned null model");
                                return;
                            }
                            C0EYQ.LJI(nLETemplateModel, EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue(), null);
                            VideoPublishEditModel videoPublishEditModel = next.LIZLLL;
                            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (autoPickModel = creativeModel.autoPickModel) != null && (list = autoPickModel.mediaList) != null) {
                                NLETrack mainTrack = nLETemplateModel.getMainTrack();
                                if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                                    int i2 = 0;
                                    for (NLETrackSlot nLETrackSlot : sortedSlots) {
                                        int i3 = i2 + 1;
                                        if (i2 >= 0) {
                                            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                                            if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null) {
                                                Iterator<AutoPickMediaModel> it3 = list.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next2 = it3.next();
                                                        String str3 = next2.resId;
                                                        NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                                                        if (resource == null || (resourceId = resource.getResourceId()) == null) {
                                                            resourceId = null;
                                                        }
                                                        if (Intrinsics.LJFF(str3, resourceId)) {
                                                            break;
                                                        }
                                                    } else {
                                                        next2 = null;
                                                        break;
                                                    }
                                                }
                                                AutoPickMediaModel autoPickMediaModel = next2;
                                                if (autoPickMediaModel == null && (autoPickMediaModel = (AutoPickMediaModel) C13LP.LJJJLZIJ(i2, list)) == null) {
                                                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("replaceLocalResources: no matching media for slot index=");
                                                    sbLIZ3.append(i2);
                                                    C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ3));
                                                } else if (!C2286708xd.LIZJ(autoPickMediaModel.filePath)) {
                                                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                    sbLIZ4.append("replaceLocalResources: skip slot ");
                                                    sbLIZ4.append(i2);
                                                    sbLIZ4.append(", file missing: ");
                                                    sbLIZ4.append(autoPickMediaModel.filePath);
                                                    C201955140j.LIZJ(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ4));
                                                } else {
                                                    aVFile.setResourceFile(autoPickMediaModel.filePath);
                                                    if (autoPickMediaModel.isVideoType) {
                                                        nLEResType = NLEResType.VIDEO;
                                                    } else {
                                                        nLEResType = NLEResType.IMAGE;
                                                    }
                                                    aVFile.setResourceType(nLEResType);
                                                }
                                            }
                                            i2 = i3;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                }
                                C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("replaceLocalResources: replaced ");
                                sbLIZ5.append(list.size());
                                sbLIZ5.append(" media items");
                                C201955140j.LIZJ(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ5));
                            }
                            C371410EhH.LIZJ(new AwS409S0200000_8(next, nLETemplateModel, 1));
                        }

                        @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                        public final void onError(int i2, String str3) {
                            next.LIZJ(1016, Integer.valueOf(i2), str3);
                        }
                    }, 458), null, 24);
                    return;
                }
                if (next.LIZ.LIZIZ.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
                    AutoCutThemeData autoCutThemeData2 = next.LIZ.LIZIZ;
                    String str3 = autoCutThemeData2.templateId;
                    String str4 = autoCutThemeData2.musicId;
                    final String strLIZ = C1414680muw.LIZ(str4 != null ? str4 : "", str3);
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("ENTRY key=");
                    sbLIZ3.append(strLIZ);
                    sbLIZ3.append(" musicId=");
                    sbLIZ3.append(str4);
                    sbLIZ3.append(" effectResourceId=");
                    sbLIZ3.append(str3);
                    sbLIZ3.append(" templateType=");
                    sbLIZ3.append(autoCutThemeData2.templateType);
                    C1426005i6.LIZ(c1398350mUb, "Preload.Bridge.AutoCut", C2188811AlT.LIZIZ(sbLIZ3));
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    if ((str3.length() == 0) || str4 == null || str4.length() == 0) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("REJECT key=");
                        sbLIZ4.append(strLIZ);
                        sbLIZ4.append(" empty musicId or effectResourceId");
                        C1426005i6.LIZJ(c1398350mUb, "Preload.Bridge.AutoCut", C2188811AlT.LIZIZ(sbLIZ4));
                        next.LIZJ(1002, Integer.MIN_VALUE, "empty musicId or effectResourceId for lyric rule template");
                        return;
                    }
                    ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = (ILyricsRuleTemplatePreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricsRuleTemplatePreloadService.class, false, false, false, 14, null);
                    if (iLyricsRuleTemplatePreloadService != null) {
                        iLyricsRuleTemplatePreloadService.LJ(contextLIZ, str4, str3, new InterfaceC1437705jz<AVMusic>() { // from class: X.0mxJ
                            @Override // X.InterfaceC1437705jz
                            public final void onProgress(int i2) {
                            }

                            @Override // X.InterfaceC1437705jz
                            public final void LIZ(Exception exc) {
                                String message;
                                String message2;
                                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("FAIL key=");
                                sbLIZ5.append(strLIZ);
                                sbLIZ5.append(" e=");
                                String message3 = null;
                                if (exc != null) {
                                    message = exc.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ5.append(message);
                                C1426005i6.LIZJ(c1398350mUb2, "Preload.Bridge.AutoCut", C2188811AlT.LIZIZ(sbLIZ5));
                                C1417350mzF c1417350mzF = next;
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("preloadLyricsRuleTemplate onFail: ");
                                if (exc != null) {
                                    message2 = exc.getMessage();
                                } else {
                                    message2 = null;
                                }
                                sbLIZ6.append(message2);
                                C2188811AlT.LIZIZ(sbLIZ6);
                                c1417350mzF.getClass();
                                C1417350mzF c1417350mzF2 = next;
                                if (exc != null) {
                                    message3 = exc.getMessage();
                                }
                                c1417350mzF2.LIZJ(1007, Integer.MIN_VALUE, message3);
                            }

                            @Override // X.InterfaceC1437705jz
                            public final void LIZIZ(AVMusic aVMusic, boolean z) {
                                AVMusic aVMusic2 = aVMusic;
                                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("SUCCESS key=");
                                sbLIZ5.append(strLIZ);
                                sbLIZ5.append(" fromCache=");
                                sbLIZ5.append(z);
                                sbLIZ5.append(" musicPath=");
                                sbLIZ5.append(aVMusic2.path);
                                C1426005i6.LIZ(c1398350mUb2, "Preload.Bridge.AutoCut", C2188811AlT.LIZIZ(sbLIZ5));
                                C1417350mzF c1417350mzF = next;
                                C1417310mzB c1417310mzB2 = c1417350mzF.LJII;
                                c1417310mzB2.LJ = aVMusic2;
                                c1417310mzB2.LJFF = aVMusic2.path;
                                c1417350mzF.LJ();
                            }
                        }, "autocut_upload_page");
                        return;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("REJECT key=");
                    sbLIZ5.append(strLIZ);
                    sbLIZ5.append(" ILyricsRuleTemplatePreloadService SPI not found");
                    C1426005i6.LIZJ(c1398350mUb, "Preload.Bridge.AutoCut", C2188811AlT.LIZIZ(sbLIZ5));
                    next.LIZJ(1007, Integer.MIN_VALUE, "ILyricsRuleTemplatePreloadService not found");
                    return;
                }
                EnumC1417520mzW enumC1417520mzW = (next.LIZ.LIZIZ.templateType == EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue() || next.LIZ.LIZIZ.templateType == EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()) ? EnumC1417520mzW.TEMPLATE_MUSIC : next.LIZ.LIZIZ.templateType == EnumC1412640mre.CUT_SAME.getValue() ? EnumC1417520mzW.TEMPLATE_CC : next.LIZ.LIZIZ.templateType == EnumC1412640mre.AIGT.getValue() ? EnumC1417520mzW.TEMPLATE_AIGT : next.LIZ.LIZIZ.templateType == EnumC1412640mre.SGT.getValue() ? EnumC1417520mzW.TEMPLATE_SGT : next.LIZ.LIZIZ.templateType == EnumC1412640mre.UGC_TEMPLATE.getValue() ? EnumC1417520mzW.TEMPLATE_UGC : EnumC1417520mzW.TEMPLATE_PUGC;
                if (enumC1417520mzW == EnumC1417520mzW.TEMPLATE_MUSIC || enumC1417520mzW == EnumC1417520mzW.TEMPLATE_PUGC || enumC1417520mzW == EnumC1417520mzW.TEMPLATE_AIGT || enumC1417520mzW == EnumC1417520mzW.TEMPLATE_SGT || enumC1417520mzW == EnumC1417520mzW.TEMPLATE_UGC) {
                    AutoCutThemeData autoCutThemeData3 = next.LIZ.LIZIZ;
                    if (autoCutThemeData3.musicId == null) {
                        return;
                    } else {
                        next.LIZIZ(autoCutThemeData3);
                    }
                }
                C0LCY c0lcy = C0LCY.LIZ;
                AutoCutThemeData autoCutThemeData4 = next.LIZ.LIZIZ;
                c0lcy.getClass();
                C0LCY.LIZJ(autoCutThemeData4, "edit_autocut");
                if (enumC1417520mzW == EnumC1417520mzW.TEMPLATE_CC && C1417320mzC.LIZ(next.LIZ.LIZIZ)) {
                    AutoCutThemeData autoCutThemeData5 = next.LIZ.LIZIZ;
                    String str5 = autoCutThemeData5.musicId;
                    final String str6 = autoCutThemeData5.musicUrl;
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(autoCutThemeData5.musicBuzModel);
                    AutoCutThemeData autoCutThemeData6 = next.LIZ.LIZIZ;
                    Boolean bool = autoCutThemeData6.musicPostUnavailable;
                    String str7 = autoCutThemeData6.templateId;
                    ITemplateResourceService iTemplateResourceService2 = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
                    C844470XAv.LIZ.getClass();
                    next.LJI = iTemplateResourceService2.LIZ(C844470XAv.LIZ(), str5, str6, aVMusicExtractAVMusic, bool, new C1418100n0S("edit_autocut", str7, EnumC1412640mre.CUT_SAME), new InterfaceC1428880nHq() { // from class: X.0mxK
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
                        public final void LJII(int i2) {
                        }

                        @Override // X.InterfaceC1428880nHq
                        public final void LJIIIIZZ() {
                        }

                        @Override // X.InterfaceC1428880nHq
                        public final void LIZ(Integer num, String str8) {
                            C1417350mzF c1417350mzF = next;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("fetchAndDownloadMusic onFailed: downloadMusic code=");
                            sbLIZ6.append(num);
                            sbLIZ6.append(", msg=");
                            sbLIZ6.append(str8);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            c1417350mzF.getClass();
                            next.LIZJ(1007, num, str8);
                        }

                        @Override // X.InterfaceC1428880nHq
                        public final void LJFF(AVMusic aVMusic, String str8, boolean z, boolean z2) {
                            C1417350mzF c1417350mzF = next;
                            C1417310mzB c1417310mzB2 = c1417350mzF.LJII;
                            c1417310mzB2.LJ = aVMusic;
                            c1417310mzB2.LJFF = str8;
                            c1417310mzB2.LJIJI = str6;
                            c1417350mzF.LJ();
                        }
                    });
                }
                C1417500mzU c1417500mzU = next.LIZ;
                String str8 = c1417500mzU.LIZJ;
                AutoCutThemeData autoCutThemeData7 = c1417500mzU.LIZIZ;
                String str9 = autoCutThemeData7.musicId;
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = autoCutThemeData7.templateId;
                String str11 = autoCutThemeData7.templateGroupId;
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = autoCutThemeData7.templateTag;
                String str13 = str12 != null ? str12 : "";
                final int i2 = autoCutThemeData7.templateType;
                final String str14 = autoCutThemeData7.templateUrl;
                String str15 = autoCutThemeData7.templateData;
                List<AutoCutMediaModel> list = c1417500mzU.LJ;
                Set<String> set = autoCutThemeData7.preloadUrsSet;
                CreativeInfo creativeInfo = c1417500mzU.LJFF;
                boolean zLIZ = C1417320mzC.LIZ(autoCutThemeData7);
                next.LJII.LJIILIIL = set;
                if (C295320Bhq.LIZ()) {
                    s sVar = s.LIZ;
                    C1417500mzU c1417500mzU2 = next.LIZ;
                    boolean z = c1417500mzU2.LJI;
                    String str16 = c1417500mzU2.LIZLLL;
                    InterfaceC1635410sex interfaceC1635410sex = (InterfaceC1635410sex) next.LJIIJ.getValue();
                    sVar.getClass();
                    next.LJFF = C09IC.LJJI(C2296808zG.LIZ(C0PEM.LIZJ), new C861640Xr8(new C1417420mzM(next, i2, str14, str11, str13, null), s.LJJJJLL(str8, str9, str10, str14, str15, enumC1417520mzW, list, set, creativeInfo, z, false, i2, "source_preload", str16, str11, interfaceC1635410sex, null, false, false, zLIZ, false, null)));
                    return;
                }
                C1417500mzU c1417500mzU3 = next.LIZ;
                boolean z2 = c1417500mzU3.LJI;
                String str17 = c1417500mzU3.LIZLLL;
                InterfaceC1635410sex interfaceC1635410sex2 = (InterfaceC1635410sex) next.LJIIJ.getValue();
                final C13BV c13bv = C13BV.INSTANCE;
                final String str18 = str11;
                final String str19 = str13;
                next.LJ = s.LJJJLIIL(str8, str9, str10, str14, str15, enumC1417520mzW, list, set, creativeInfo, z2, false, i2, "source_preload", str17, str11, interfaceC1635410sex2, null, false, false, zLIZ, false, null, new C1417970n0F(c13bv) { // from class: X.0mzJ
                    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                    public final void onCompressProgress(float f) {
                    }

                    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                    public final void onFetchProgress(float f) {
                    }

                    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                    public final void onNeedFetch(VecStr vecStr) {
                    }

                    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                    public final void onCompressDone(VecMeta vecMeta) {
                        next.LJII.LJIIIIZZ = vecMeta;
                    }

                    @Override // X.C1417970n0F
                    public final void LIZIZ(NLEModel nLEModel, Map<String, String> map) {
                        C371410EhH.LIZJ(new C1417380mzI(next, nLEModel, map, i2, str14, str18, str19));
                    }

                    @Override // X.C1417970n0F
                    public final void LIZJ(int i3, int i4, String str20) {
                        C1417350mzF c1417350mzF = next;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("requestNLEModel onTemplateFailure: code=");
                        sbLIZ6.append(i3);
                        sbLIZ6.append(", msg=");
                        sbLIZ6.append(str20);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        c1417350mzF.getClass();
                        next.LIZJ(Integer.valueOf(i3), Integer.valueOf(i4), str20);
                    }

                    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                    public final void onFailure(String str20, int i3, String str21, UnorderedMapStrStr unorderedMapStrStr) {
                        Map mapLJIIZILJ;
                        if (i3 != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
                            C1417350mzF c1417350mzF = next;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("requestNLEModel onFailure: code=");
                            sbLIZ6.append(i3);
                            sbLIZ6.append(", msg=");
                            sbLIZ6.append(str21);
                            sbLIZ6.append(", extraParams=");
                            sbLIZ6.append(unorderedMapStrStr);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            c1417350mzF.getClass();
                            next.LIZJ(Integer.valueOf(i3), Integer.MIN_VALUE, str21);
                            return;
                        }
                        if (unorderedMapStrStr != null) {
                            mapLJIIZILJ = C2097608Jq.LJIIZILJ(unorderedMapStrStr);
                        } else {
                            mapLJIIZILJ = null;
                        }
                        C1417710mzp.LJIJI("source_preload", str20, i3, str21, mapLJIIZILJ, null);
                    }
                });
                return;
            }
        }
    }

    @Override // X.InterfaceC1417610mzf
    public final void cancel() {
        for (C1417350mzF c1417350mzF : this.LIZLLL) {
            if (c1417350mzF != null) {
                c1417350mzF.LJIIIZ = -1L;
                String str = c1417350mzF.LJ;
                if (str != null) {
                    s.LJI(str);
                }
                c1417350mzF.LJIIIIZZ = EnumC1417510mzV.CANCEL;
                InterfaceC1429290nIV interfaceC1429290nIV = c1417350mzF.LJI;
                if (interfaceC1429290nIV != null) {
                    interfaceC1429290nIV.cancel();
                }
                AnonymousClass0956 anonymousClass0956 = c1417350mzF.LJFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }
        }
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LJFF.set(false);
        this.LJII.set(0);
    }

    public C1417340mzE(VideoPublishEditModel videoPublishEditModel, List<AutoCutMediaModel> list, boolean z) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = list;
        this.LIZJ = z;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PreloadNLEConfig preloadNLEConfig = C1178004jC.LIZ;
        PreloadNLEConfig preloadNLEConfig2 = (PreloadNLEConfig) c0c64LJIILLIIL.LJJII(PreloadNLEConfig.class, preloadNLEConfig, "autocut_selection_preload_NLE_config", true);
        preloadNLEConfig = preloadNLEConfig2 != null ? preloadNLEConfig2 : preloadNLEConfig;
        this.LJI = preloadNLEConfig;
        this.LJII = new AtomicInteger(0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload: ab config=");
        sbLIZ.append(preloadNLEConfig);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}

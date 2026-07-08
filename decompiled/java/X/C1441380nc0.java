package X;

import Y.ACallableS250S0200000_22;
import Y.ACallableS427S0100000_22;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.Intrinsics;
import v7.o;

/* JADX INFO: renamed from: X.0nc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441380nc0 {
    public static final C0M5Z LIZ() {
        C0M5Z c0m5z = new C0M5Z(AnonymousClass0207.get$arr$(78));
        List<C1441520ncE> listLIZLLL = C1441460nc8.LIZIZ(C0CHQ.LIZ).LIZLLL();
        if (!(!((ArrayList) listLIZLLL).isEmpty())) {
            listLIZLLL = null;
        }
        if (listLIZLLL != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
            Iterator<C1441520ncE> it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJI.getExtractFramesDir());
            }
            c0m5z.addAll(arrayList);
        }
        ArrayList<OriginalSoundUploadTask> arrayListLIZIZ = C1441580ncK.LIZ(C0CHQ.LIZ).LIZIZ();
        if (!arrayListLIZIZ.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayListLIZIZ, 10));
            Iterator<OriginalSoundUploadTask> it3 = arrayListLIZIZ.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().originalSoundPath);
            }
            c0m5z.addAll(arrayList2);
        }
        return c0m5z;
    }

    public static final void LIZIZ(final CreateBaseAwemeResponse createBaseAwemeResponse, final VideoPublishEditModel videoPublishEditModel, final CountDownLatch countDownLatch) {
        String str;
        int i;
        boolean z;
        final C1432910nOL c1432910nOL = new C1432910nOL();
        final Application application = C0CHQ.LIZ;
        final String str2 = "";
        if (!C1432680nNy.LIZIZ(videoPublishEditModel)) {
            countDownLatch.countDown();
            if ((videoPublishEditModel instanceof VideoPublishEditModel) && videoPublishEditModel.getExtractFramesModel() != null) {
                C15O7.LIZJ(new ACallableS427S0100000_22(videoPublishEditModel, 8));
            }
            C1432910nOL.LIZIZ(application, "");
            C201955140j.LJIIL("[Original Frame] No need to Upload Frame");
            return;
        }
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getAVConverter().getClass();
        AVAweme aVAwemeLambda$getAVConverter$0 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse);
        if (aVAwemeLambda$getAVConverter$0 != null) {
            str2 = aVAwemeLambda$getAVConverter$0.aid;
        }
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getAVConverter().getClass();
        AVAweme aVAwemeLambda$getAVConverter$02 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("stage", 1);
        if (aVAwemeLambda$getAVConverter$02 != null) {
            str = aVAwemeLambda$getAVConverter$02.aid;
        } else {
            str = null;
        }
        c543670LTx.LIZ.put("aweme_id", str);
        c543670LTx.LIZ.put("match_factors", Integer.valueOf(C1441640ncQ.LIZ(videoPublishEditModel).LIZ));
        String cameraIds = videoPublishEditModel.getCameraIds();
        if (cameraIds != null && cameraIds.length() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        c543670LTx.LIZ.put("origin", Integer.valueOf(i ^ 1));
        c543670LTx.LIZ.put("is_draft", Boolean.valueOf(videoPublishEditModel.mIsFromDraft));
        if (videoPublishEditModel.getRestoreType() == 2) {
            z = true;
        } else {
            z = false;
        }
        c543670LTx.LIZ.put("is_backup", Boolean.valueOf(z));
        c543670LTx.LIZ.put("video_type", Integer.valueOf(C1428470nHB.LJIIJJI(videoPublishEditModel)));
        C1637890six.LJ("av_video_audit", 1, c543670LTx.LJ());
        C1441430nc5 c1441430nc5 = new C1441430nc5();
        c1441430nc5.LIZLLL.LIZJ = String.valueOf(C1441640ncQ.LIZ(videoPublishEditModel).LIZ);
        if (TextUtils.isEmpty(videoPublishEditModel.getCameraIds())) {
            c1441430nc5.LJFF.LIZJ = CardStruct.IStatusCode.DEFAULT;
        } else {
            c1441430nc5.LJFF.LIZJ = "1";
        }
        C1441390nc1.LIZ.put(str2, "init");
        C1441390nc1.LIZIZ.put(str2, new StringBuilder("init"));
        C1441390nc1.LIZJ.put(str2, 0);
        C0CNO.LIZLLL(10000L, new AwS171S1100000_22(c1441430nc5, str2, 5));
        C1441390nc1.LIZ(str2, "audit_start");
        C580320MpS.LIZ(videoPublishEditModel, videoPublishEditModel.getExtractFramesModel(), false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Original Frame] Start extract frames -AwemeId:");
        sbLIZ.append(str2);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        final C1432620nNs c1432620nNs = new C1432620nNs(EnumC1432600nNq.POST, null);
        C15O7 c15o7LIZ = C1432910nOL.LIZ(c1432620nNs, videoPublishEditModel, str2);
        Objects.requireNonNull(c15o7LIZ);
        c15o7LIZ.LJI(new InterfaceC2385309Wh() { // from class: X.0nOM
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1432910nOL c1432910nOL2 = c1432910nOL;
                CreateBaseAwemeResponse createBaseAwemeResponse2 = createBaseAwemeResponse;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                C1432620nNs c1432620nNs2 = c1432620nNs;
                c1432910nOL2.getClass();
                C1C7U.LIZ("OriginFramesUploader@4db1.uploadFrames$2L");
                if (c15o7.LJIILL()) {
                    C1441450nc7.LIZLLL(createBaseAwemeResponse2, videoPublishEditModel2, Boolean.FALSE, -1001, "custom sticker");
                }
                o oVar = new o();
                C15O7.LIZ(new ACallableS250S0200000_22(videoPublishEditModel2, c1432620nNs2, oVar, 10));
                Object obj = oVar.LIZ;
                C1C7U.LIZIZ("OriginFramesUploader@4db1.uploadFrames$2L");
                return obj;
            }
        }).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0nbz
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1441410nc3 c1441410nc3;
                ExtractFramesModel extractFramesModel;
                int i2;
                int i3;
                boolean z2;
                C1432910nOL c1432910nOL2 = c1432910nOL;
                String str3 = str2;
                CreateBaseAwemeResponse createBaseAwemeResponse2 = createBaseAwemeResponse;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                CountDownLatch countDownLatch2 = countDownLatch;
                Context context = application;
                c1432910nOL2.getClass();
                C1C7U.LIZ("OriginFramesUploader@4db1.uploadFrames$3L");
                C1441390nc1.LIZ(str3, "extractor_done");
                if (c15o7.LJIILIIL() || c15o7.LJIILL()) {
                    C1441450nc7.LIZLLL(createBaseAwemeResponse2, videoPublishEditModel2, Boolean.FALSE, -1001, "");
                }
                countDownLatch2.countDown();
                lth.o.LJIJI.getClass();
                AVAweme aVAwemeLambda$getAVConverter$03 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse2);
                boolean z3 = true;
                if (aVAwemeLambda$getAVConverter$03 != null && (extractFramesModel = videoPublishEditModel2.getExtractFramesModel()) != null) {
                    extractFramesModel.setStickerIds(videoPublishEditModel2.getStickerID());
                    c1441410nc3 = new C1441410nc3();
                    C1441400nc2 c1441400nc2 = new C1441400nc2();
                    c1441400nc2.LIZ = aVAwemeLambda$getAVConverter$03.aid;
                    c1441400nc2.LIZIZ = C1428470nHB.LJIIJJI(videoPublishEditModel2);
                    if (C1428470nHB.LJJZZI(videoPublishEditModel2)) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    c1441400nc2.LJIILIIL = i2;
                    c1441400nc2.LIZJ = createBaseAwemeResponse2.materialId;
                    c1441400nc2.LIZLLL = "";
                    c1441400nc2.LJ = "";
                    c1441400nc2.LJFF = extractFramesModel;
                    c1441400nc2.LJIIIIZZ = C1441640ncQ.LIZ(videoPublishEditModel2).LIZ;
                    c1441400nc2.LJIIIZ = videoPublishEditModel2.mIsFromDraft;
                    String cameraIds2 = videoPublishEditModel2.getCameraIds();
                    if (cameraIds2 != null && cameraIds2.length() != 0) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    c1441400nc2.LJIIJ = i3 ^ 1;
                    if (videoPublishEditModel2.getRestoreType() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1441400nc2.LJIIJJI = z2;
                    c1441400nc2.LJI = System.currentTimeMillis();
                    ((ArrayList) c1441410nc3.LIZ).add(c1441400nc2.LIZ());
                } else {
                    c1441410nc3 = null;
                }
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("will insert: ");
                if (c1441410nc3 == null) {
                    z3 = false;
                }
                sbLIZ2.append(z3);
                c1437510nVlLJJLIIIJ.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ2));
                if (c1441410nc3 != null) {
                    try {
                        C1441390nc1.LIZ(str3, "database_insert");
                        C1441460nc8.LIZIZ(context).LIZ(c1441410nc3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1441450nc7.LIZLLL(createBaseAwemeResponse2, videoPublishEditModel2, Boolean.FALSE, -1002, e.getMessage());
                        C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("insert sql fail : ");
                        sbLIZ3.append(e.getMessage());
                        c1437510nVlLJJLIIIJ2.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                C1441390nc1.LIZ(str3, "enqueue_service");
                C1432910nOL.LIZIZ(context, str3);
                C1C7U.LIZIZ("OriginFramesUploader@4db1.uploadFrames$3L");
                return null;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0nc4] */
    public static final void LIZJ(final CreateBaseAwemeResponse createBaseAwemeResponse, final VideoPublishEditModel videoPublishEditModel, final CountDownLatch countDownLatch) {
        final ?? r3 = new Object() { // from class: X.0nc4
        };
        final Application application = C0CHQ.LIZ;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("upload_origin_audio_track", true)) {
            countDownLatch.countDown();
            return;
        }
        final boolean zLIZ = C1412770mrr.LIZ(videoPublishEditModel);
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("need upload original sound: ");
        sbLIZ.append(zLIZ);
        c1437510nVlLJJLIIIJ.LIZ("original_sound", C2188811AlT.LIZIZ(sbLIZ));
        C15O7.LIZJ(new Callable() { // from class: X.0ncL
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1441600ncM c1441600ncM;
                int size;
                TextStickerData textStickerData;
                C1441420nc4 c1441420nc4 = r3;
                boolean z = zLIZ;
                CreateBaseAwemeResponse createBaseAwemeResponse2 = createBaseAwemeResponse;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                Context context = application;
                CountDownLatch countDownLatch2 = countDownLatch;
                c1441420nc4.getClass();
                C1C7U.LIZ("PostPublishTrigger@8fc7.trigger$1L");
                if (z) {
                    ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getAVConverter().getClass();
                    AVAweme aVAwemeLambda$getAVConverter$0 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse2);
                    C543670LTx c543670LTx = new C543670LTx();
                    c543670LTx.LIZ.put("stage", 1);
                    c543670LTx.LIZ.put("aweme_id", aVAwemeLambda$getAVConverter$0 != null ? aVAwemeLambda$getAVConverter$0.aid : null);
                    c543670LTx.LIZ.put("match_factors", Integer.valueOf(C1446400nk6.LIZ(videoPublishEditModel2).LIZ));
                    String cameraIds = videoPublishEditModel2.getCameraIds();
                    c543670LTx.LIZ.put("origin", Integer.valueOf(((cameraIds == null || cameraIds.length() == 0) ? 1 : 0) ^ 1));
                    c543670LTx.LIZ.put("is_draft", Boolean.valueOf(videoPublishEditModel2.mIsFromDraft));
                    c543670LTx.LIZ.put("is_backup", Boolean.valueOf(videoPublishEditModel2.getRestoreType() == 2));
                    c543670LTx.LIZ.put("video_type", Integer.valueOf(C1428470nHB.LJIIJJI(videoPublishEditModel2)));
                    C1637890six.LJ("av_audio_audit", 1, c543670LTx.LJ());
                    new Object() { // from class: X.0ncT
                    }.getClass();
                    C201955140j.LJIIL("AVOriginalSoundSeparator start");
                    final C1441750ncb c1441750ncb = new C1441750ncb(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJZ(videoPublishEditModel2), C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJII(videoPublishEditModel2, ""));
                    AbstractC1441740nca abstractC1441740nca = C1418530n19.LIZIZ(videoPublishEditModel2) ? new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAF
                        public static final List<AutoCutMediaModel> LJFF(VideoPublishEditModel videoPublishEditModel3) {
                            Iterable arrayList;
                            NLEResType resourceType;
                            String resourceFile;
                            NLEResType resourceType2;
                            boolean z2;
                            NLEResType resourceType3;
                            NLEResType resourceType4;
                            String nleData = videoPublishEditModel3.getNleData();
                            s sVar = s.LIZ;
                            if (nleData == null) {
                                arrayList = C13BV.INSTANCE;
                            } else {
                                C0FGC.LIZ(2);
                                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                                nLEEditorLIZ.restore(nleData);
                                nLEEditorLIZ.commit();
                                nLEEditorLIZ.done();
                                NLEModel model = nLEEditorLIZ.getModel();
                                if (model == null) {
                                    arrayList = C13BV.INSTANCE;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    VecNLETrackSPtr tracks = model.getTracks();
                                    if (tracks != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator<NLETrack> it2 = tracks.iterator();
                                        while (it2.hasNext()) {
                                            Iterable slots = it2.next().getSlots();
                                            if (slots == null) {
                                                slots = C13BV.INSTANCE;
                                            }
                                            C19719612Di.LJJI(slots, arrayList3);
                                        }
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            NLESegment mainSegment = ((NLETrackSlot) it3.next()).getMainSegment();
                                            if (mainSegment != null) {
                                                NLEResourceNode resource = mainSegment.getResource();
                                                if (resource != null) {
                                                    resourceType = resource.getResourceType();
                                                } else {
                                                    resourceType = null;
                                                }
                                                NLEResType nLEResType = NLEResType.VIDEO;
                                                if (resourceType != nLEResType) {
                                                    NLEResourceNode resource2 = mainSegment.getResource();
                                                    if (resource2 != null) {
                                                        resourceType4 = resource2.getResourceType();
                                                    } else {
                                                        resourceType4 = null;
                                                    }
                                                    if (resourceType4 == NLEResType.IMAGE) {
                                                    }
                                                }
                                                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
                                                if (nLESegmentVideoDynamicCast != null) {
                                                    NLEResourceNode resource3 = nLESegmentVideoDynamicCast.getResource();
                                                    if (resource3 == null || (resourceFile = resource3.getResourceFile()) == null) {
                                                        resourceFile = "";
                                                    }
                                                    NLEResourceNode resource4 = nLESegmentVideoDynamicCast.getResource();
                                                    if (resource4 != null) {
                                                        resourceType2 = resource4.getResourceType();
                                                    } else {
                                                        resourceType2 = null;
                                                    }
                                                    if (resourceType2 == nLEResType) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                                                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                                                    AutoCutMediaModel autoCutMediaModel = new AutoCutMediaModel(resourceFile, null, null, 0, 0, z2, 0L, timeClipStart / j, (nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / j, 0.0f, false, null, null, 7774, null);
                                                    NLEResourceNode resource5 = mainSegment.getResource();
                                                    if (resource5 != null) {
                                                        resourceType3 = resource5.getResourceType();
                                                    } else {
                                                        resourceType3 = null;
                                                    }
                                                    if (resourceType3 == nLEResType) {
                                                        autoCutMediaModel.speed = nLESegmentVideoDynamicCast.getSpeed();
                                                        autoCutMediaModel.speed = nLESegmentVideoDynamicCast.getSpeed();
                                                    }
                                                    arrayList2.add(autoCutMediaModel);
                                                }
                                            }
                                        }
                                    }
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj : arrayList2) {
                                        if (hashSet.add(((AutoCutMediaModel) obj).filePath)) {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    arrayList = new ArrayList(arrayList4);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (((AutoCutMediaModel) obj2).isVideoType) {
                                    arrayList5.add(obj2);
                                }
                            }
                            return arrayList5;
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "CutSameTemplateSoundSeparator startSimple");
                            StringBuilder sb = new StringBuilder("CutSameTemplateSoundSeparator StartSimple \n");
                            List<AutoCutMediaModel> listLJFF = LJFF(videoPublishEditModel3);
                            int size2 = ((ArrayList) listLJFF).size();
                            String[] strArr = new String[size2];
                            long[] jArr = new long[size2];
                            long[] jArr2 = new long[size2];
                            long[] jArr3 = new long[2];
                            float[] fArr = new float[size2];
                            boolean zLJ = LJ(listLJFF, strArr, jArr, jArr2, fArr, jArr3, sb);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("CutSameTemplateSoundSeparator startSimple needUploadAudio: fileListExist = ");
                            sbLIZ2.append(zLJ);
                            sbLIZ2.append("\nvideoList = ");
                            sbLIZ2.append(C13LP.LJJLIIIJ(listLJFF, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(5), 31));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                            this.LIZIZ = VEUtils.detachAudioFromVideos(videoPublishEditModel3.getEncodedAudioOutputFile(), strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("CutSameTemplateSoundSeparator startSimple needUploadAudio: encodeResult = ");
                            sbLIZ3.append(this.LIZIZ);
                            sbLIZ3.append(", file = ");
                            sbLIZ3.append(videoPublishEditModel3.getEncodedAudioOutputFile());
                            sbLIZ3.append(", exist? ");
                            sbLIZ3.append(C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile()));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            EnumC1462670oAL enumC1462670oAL2 = EnumC1462670oAL.NO_NEEDED;
                            return new C1462680oAM("CutSameTemplateSoundSeparator", enumC1462670oAL2, enumC1462670oAL2, enumC1462670oAL, this.LIZIZ, sb.toString());
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            EnumC1462670oAL enumC1462670oAL3;
                            EnumC1462670oAL enumC1462670oAL4;
                            EnumC1462670oAL enumC1462670oAL5;
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "CutSameTemplateSoundSeparator startWithEditAudioRecord");
                            String str = "";
                            if (s.LIZJ(videoPublishEditModel3)) {
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "CutSameTemplateSoundSeparator startWithEditAudioRecord need upload original audio");
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("CutSameTemplateSoundSeparator VoiceVolume: ");
                                sbLIZ2.append(videoPublishEditModel3.getVoiceVolume());
                                sbLIZ2.append(" \n");
                                StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                                List<AutoCutMediaModel> listLJFF = LJFF(videoPublishEditModel3);
                                int size2 = ((ArrayList) listLJFF).size();
                                String[] strArr = new String[size2];
                                long[] jArr = new long[size2];
                                long[] jArr2 = new long[size2];
                                long[] jArr3 = new long[2];
                                float[] fArr = new float[size2];
                                boolean zLJ = LJ(listLJFF, strArr, jArr, jArr2, fArr, jArr3, sb);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("CutSameTemplateSoundSeparator startWithEditAudioRecord need upload original audio: fileListExist = ");
                                sbLIZ3.append(zLJ);
                                sbLIZ3.append("\nvideoList = ");
                                sbLIZ3.append(C13LP.LJJLIIIJ(listLJFF, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(6), 31));
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(this.LIZ.LIZ);
                                sbLIZ4.append(System.currentTimeMillis());
                                sbLIZ4.append("_autocut");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                    enumC1462670oAL = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                                }
                                this.LIZIZ = VEUtils.detachAudioFromVideos(strLIZIZ, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("CutSameTemplateSoundSeparator startWithEditAudioRecord need upload original audio: detachAudioFromVideos: encodeResult = ");
                                sbLIZ5.append(this.LIZIZ);
                                sbLIZ5.append(", file = ");
                                sbLIZ5.append(strLIZIZ);
                                sbLIZ5.append(", exist? ");
                                sbLIZ5.append(C2286708xd.LIZJ(strLIZIZ));
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ5));
                                if (C2286708xd.LIZJ(strLIZIZ)) {
                                    enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                                }
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(strLIZIZ);
                                arrayList.add(AbstractC1441740nca.LIZ(videoPublishEditModel3));
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile != null) {
                                    str = encodedAudioOutputFile;
                                }
                                this.LIZJ = VEUtils.mixAudio(arrayList, str, null);
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("CutSameTemplateSoundSeparator startWithEditAudioRecord need upload original audio: mixAudio: mixResult = ");
                                sbLIZ6.append(this.LIZJ);
                                sbLIZ6.append(", file = ");
                                sbLIZ6.append(videoPublishEditModel3.getEncodedAudioOutputFile());
                                sbLIZ6.append(", exist? ");
                                sbLIZ6.append(C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile()));
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ6));
                                C2354709Kn.LJIJJLI(strLIZIZ);
                                if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                    enumC1462670oAL3 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL3 = EnumC1462670oAL.ABSENCE;
                                }
                                return new C1462680oAM("CutSameTemplateSoundSeparator", enumC1462670oAL2, enumC1462670oAL, enumC1462670oAL3, this.LIZIZ, sb.toString());
                            }
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("CutSameTemplateSoundSeparator startWithEditAudioRecord need not upload original audio: audio record = ");
                            sbLIZ7.append(AbstractC1441740nca.LIZ(videoPublishEditModel3));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ7));
                            if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                enumC1462670oAL4 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL4 = EnumC1462670oAL.ABSENCE;
                            }
                            String strLIZ = AbstractC1441740nca.LIZ(videoPublishEditModel3);
                            String encodedAudioOutputFile2 = videoPublishEditModel3.getEncodedAudioOutputFile();
                            if (encodedAudioOutputFile2 != null) {
                                str = encodedAudioOutputFile2;
                            }
                            this.LIZIZ = VEUtils.transCodeAudio(strLIZ, str, 1, 88200);
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("CutSameTemplateSoundSeparator startWithEditAudioRecord need not upload original audio: encodeResult = ");
                            sbLIZ8.append(this.LIZIZ);
                            sbLIZ8.append(", file = ");
                            sbLIZ8.append(videoPublishEditModel3.getEncodedAudioOutputFile());
                            sbLIZ8.append(", exist? ");
                            sbLIZ8.append(C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile()));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ8));
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL5 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL5 = EnumC1462670oAL.ABSENCE;
                            }
                            return new C1462680oAM("CutSameTemplateSoundSeparator", EnumC1462670oAL.NO_NEEDED, enumC1462670oAL4, enumC1462670oAL5, this.LIZIZ);
                        }

                        public static final boolean LJ(List<AutoCutMediaModel> list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3, StringBuilder sb) {
                            int size2 = ((ArrayList) list).size();
                            boolean z2 = true;
                            for (int i = 0; i < size2; i++) {
                                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) ListProtector.get(list, i);
                                boolean zLIZJ = C2286708xd.LIZJ(autoCutMediaModel.filePath);
                                if (zLIZJ && z2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("index = ");
                                sbLIZ2.append(i);
                                sbLIZ2.append(", path = ");
                                sbLIZ2.append(autoCutMediaModel.filePath);
                                sbLIZ2.append(", file status: ");
                                sbLIZ2.append(zLIZJ);
                                sbLIZ2.append(" \n");
                                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                                strArr[i] = autoCutMediaModel.filePath;
                                long j = autoCutMediaModel.cutStartTime;
                                jArr[i] = j;
                                jArr2[i] = j + autoCutMediaModel.cutDuration;
                                fArr[i] = autoCutMediaModel.speed;
                            }
                            jArr3[0] = -1;
                            jArr3[1] = -1;
                            return z2;
                        }
                    } : videoPublishEditModel2.isCurrentAutoCutMode() ? new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAG
                        public static final List<AutoCutMediaModel> LJFF(VideoPublishEditModel videoPublishEditModel3) {
                            List<AutoCutMediaModel> listLJJI = s.LJJI(videoPublishEditModel3);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : (ArrayList) listLJJI) {
                                if (((AutoCutMediaModel) obj).isVideoType) {
                                    arrayList.add(obj);
                                }
                            }
                            return arrayList;
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startSimple");
                            StringBuilder sb = new StringBuilder("AutoCutSoundSeparator StartSimple \n");
                            if (!s.LIZJ(videoPublishEditModel3)) {
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startSimple not needUploadAudio");
                                this.LIZIZ = 0;
                                EnumC1462670oAL enumC1462670oAL2 = EnumC1462670oAL.NO_NEEDED;
                                return new C1462680oAM("AutoCutSoundSeparator", enumC1462670oAL2, enumC1462670oAL2, enumC1462670oAL2, 0);
                            }
                            List<AutoCutMediaModel> listLJFF = LJFF(videoPublishEditModel3);
                            int size2 = ((ArrayList) listLJFF).size();
                            String[] strArr = new String[size2];
                            long[] jArr = new long[size2];
                            long[] jArr2 = new long[size2];
                            long[] jArr3 = new long[2];
                            float[] fArr = new float[size2];
                            boolean zLJ = LJ(listLJFF, strArr, jArr, jArr2, fArr, jArr3, sb);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("AutoCutSoundSeparator startSimple needUploadAudio: fileListExist = ");
                            sbLIZ2.append(zLJ);
                            sbLIZ2.append("\nvideoList = ");
                            sbLIZ2.append(C13LP.LJJLIIIJ(listLJFF, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(3), 31));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                            this.LIZIZ = VEUtils.detachAudioFromVideos(videoPublishEditModel3.getEncodedAudioOutputFile(), strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("AutoCutSoundSeparator startSimple needUploadAudio: encodeResult = ");
                            sbLIZ3.append(this.LIZIZ);
                            sbLIZ3.append(", file = ");
                            sbLIZ3.append(videoPublishEditModel3.getEncodedAudioOutputFile());
                            sbLIZ3.append(", exist? ");
                            sbLIZ3.append(C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile()));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            EnumC1462670oAL enumC1462670oAL3 = EnumC1462670oAL.NO_NEEDED;
                            return new C1462680oAM("AutoCutSoundSeparator", enumC1462670oAL3, enumC1462670oAL3, enumC1462670oAL, this.LIZIZ, sb.toString());
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            EnumC1462670oAL enumC1462670oAL3;
                            EnumC1462670oAL enumC1462670oAL4;
                            EnumC1462670oAL enumC1462670oAL5;
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startWithEditAudioRecord");
                            String str = "";
                            if (s.LIZJ(videoPublishEditModel3)) {
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startWithEditAudioRecord need upload original audio");
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("AutoCutSoundSeparator VoiceVolume: ");
                                sbLIZ2.append(videoPublishEditModel3.getVoiceVolume());
                                sbLIZ2.append(" \n");
                                StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                                List<AutoCutMediaModel> listLJFF = LJFF(videoPublishEditModel3);
                                int size2 = ((ArrayList) listLJFF).size();
                                String[] strArr = new String[size2];
                                long[] jArr = new long[size2];
                                long[] jArr2 = new long[size2];
                                long[] jArr3 = new long[2];
                                float[] fArr = new float[size2];
                                boolean zLJ = LJ(listLJFF, strArr, jArr, jArr2, fArr, jArr3, sb);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("AutoCutSoundSeparator startWithEditAudioRecord need upload original audio: fileListExist = ");
                                sbLIZ3.append(zLJ);
                                sbLIZ3.append("\nvideoList = ");
                                sbLIZ3.append(C13LP.LJJLIIIJ(listLJFF, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(4), 31));
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(this.LIZ.LIZ);
                                sbLIZ4.append(System.currentTimeMillis());
                                sbLIZ4.append("_autocut");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                    enumC1462670oAL = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                                }
                                this.LIZIZ = VEUtils.detachAudioFromVideos(strLIZIZ, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("AutoCutSoundSeparator startWithEditAudioRecord need upload original audio: detachAudioFromVideos: encodeResult = ");
                                sbLIZ5.append(this.LIZIZ);
                                sbLIZ5.append(", file = ");
                                sbLIZ5.append(strLIZIZ);
                                sbLIZ5.append(", exist? ");
                                sbLIZ5.append(C2286708xd.LIZJ(strLIZIZ));
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ5));
                                if (C2286708xd.LIZJ(strLIZIZ)) {
                                    enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                                }
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(strLIZIZ);
                                arrayList.add(AbstractC1441740nca.LIZ(videoPublishEditModel3));
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile != null) {
                                    str = encodedAudioOutputFile;
                                }
                                this.LIZJ = VEUtils.mixAudio(arrayList, str, null);
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("AutoCutSoundSeparator startWithEditAudioRecord need upload original audio: mixAudio: mixResult = ");
                                sbLIZ6.append(this.LIZJ);
                                sbLIZ6.append(", file = ");
                                sbLIZ6.append(videoPublishEditModel3.getEncodedAudioOutputFile());
                                sbLIZ6.append(", exist? ");
                                sbLIZ6.append(C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile()));
                                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ6));
                                C2354709Kn.LJIJJLI(strLIZIZ);
                                if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                    enumC1462670oAL3 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL3 = EnumC1462670oAL.ABSENCE;
                                }
                                return new C1462680oAM("AutoCutSoundSeparator", enumC1462670oAL2, enumC1462670oAL, enumC1462670oAL3, this.LIZIZ, sb.toString());
                            }
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("AutoCutSoundSeparator startWithEditAudioRecord need not upload original audio: audio record = ");
                            sbLIZ7.append(AbstractC1441740nca.LIZ(videoPublishEditModel3));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ7));
                            if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                enumC1462670oAL4 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL4 = EnumC1462670oAL.ABSENCE;
                            }
                            String strLIZ = AbstractC1441740nca.LIZ(videoPublishEditModel3);
                            String encodedAudioOutputFile2 = videoPublishEditModel3.getEncodedAudioOutputFile();
                            if (encodedAudioOutputFile2 != null) {
                                str = encodedAudioOutputFile2;
                            }
                            this.LIZIZ = VEUtils.transCodeAudio(strLIZ, str, 1, 88200);
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("AutoCutSoundSeparator startWithEditAudioRecord need not upload original audio: encodeResult = ");
                            sbLIZ8.append(this.LIZIZ);
                            sbLIZ8.append(", file = ");
                            sbLIZ8.append(videoPublishEditModel3.getEncodedAudioOutputFile());
                            sbLIZ8.append(", exist? ");
                            sbLIZ8.append(C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile()));
                            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ8));
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL5 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL5 = EnumC1462670oAL.ABSENCE;
                            }
                            return new C1462680oAM("AutoCutSoundSeparator", EnumC1462670oAL.NO_NEEDED, enumC1462670oAL4, enumC1462670oAL5, this.LIZIZ);
                        }

                        public static final boolean LJ(List<AutoCutMediaModel> list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3, StringBuilder sb) {
                            int size2 = ((ArrayList) list).size();
                            boolean z2 = true;
                            for (int i = 0; i < size2; i++) {
                                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) ListProtector.get(list, i);
                                boolean zLIZJ = C2286708xd.LIZJ(autoCutMediaModel.filePath);
                                if (zLIZJ && z2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("index = ");
                                sbLIZ2.append(i);
                                sbLIZ2.append(", path = ");
                                sbLIZ2.append(autoCutMediaModel.filePath);
                                sbLIZ2.append(", file status: ");
                                sbLIZ2.append(zLIZJ);
                                sbLIZ2.append(" \n");
                                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                                strArr[i] = autoCutMediaModel.filePath;
                                long j = autoCutMediaModel.cutStartTime;
                                jArr[i] = j;
                                jArr2[i] = j + autoCutMediaModel.cutDuration;
                                fArr[i] = autoCutMediaModel.speed;
                            }
                            jArr3[0] = -1;
                            jArr3[1] = -1;
                            return z2;
                        }
                    } : videoPublishEditModel2.getEditorProModel().isAdvancedEditDraft() ? new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAD
                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            return LJ(videoPublishEditModel3);
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            return LJ(videoPublishEditModel3);
                        }

                        public final C1462680oAM LJ(VideoPublishEditModel videoPublishEditModel3) {
                            NLETrack next;
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            NLESegment mainSegment;
                            NLEResourceNode resource;
                            String nleData = videoPublishEditModel3.getNleData();
                            if (nleData != null && nleData.length() != 0) {
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile == null) {
                                    encodedAudioOutputFile = "";
                                }
                                AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(2);
                                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                                nLEEditorLIZ.restore(videoPublishEditModel3.getNleData());
                                NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEEditorLIZ.getModel().getStage().deepClone());
                                C347230DjN.LIZ(nLEModelDynamicCast);
                                Iterator<NLETrack> it2 = nLEModelDynamicCast.getTracks().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                NLETrack nLETrack = next;
                                if (nLETrack != null) {
                                    for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                                        if (nLETrackSlot.hasExtra("extra_origin_voice_file_path") && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                                            resource.setResourceFile(nLETrackSlot.getExtra("extra_origin_voice_file_path"));
                                        }
                                    }
                                }
                                C0E38.LIZ(encodedAudioOutputFile, nLEModelDynamicCast, null, aFwS261S0000000_22, 1, 88200, 44100, null, null, false, false, 1920);
                                if (C1428520nHG.LJJJJL(videoPublishEditModel3) && C0CH7.LIZ()) {
                                    if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                        enumC1462670oAL = EnumC1462670oAL.EXIT;
                                    } else {
                                        enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                                    }
                                } else {
                                    enumC1462670oAL = EnumC1462670oAL.NO_NEEDED;
                                }
                                if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                    enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                                }
                                EnumC1462670oAL enumC1462670oAL3 = EnumC1462670oAL.EXIT;
                                if (enumC1462670oAL2 == enumC1462670oAL3) {
                                    this.LIZIZ = 0;
                                } else {
                                    this.LIZIZ = -1;
                                }
                                return new C1462680oAM("AdvanceEditorSeparator", enumC1462670oAL3, enumC1462670oAL, enumC1462670oAL2, this.LIZIZ, "");
                            }
                            EnumC1462670oAL enumC1462670oAL4 = EnumC1462670oAL.ABSENCE;
                            return new C1462680oAM("AdvanceEditorSeparator", enumC1462670oAL4, enumC1462670oAL4, enumC1462670oAL4, -1, "nleModel is null or emtpy");
                        }
                    } : videoPublishEditModel2.isFastImport() ? new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAE
                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            List<EditVideoSegment> videoList;
                            EnumC1462670oAL enumC1462670oAL;
                            StringBuilder sb = new StringBuilder("StartSimple \n");
                            if (C1428470nHB.LJLIIIL(videoPublishEditModel3)) {
                                sb.append("Resource from : mediaListExcludeImage \n");
                                videoList = C538660LAq.LIZ(videoPublishEditModel3.getPreviewInfo());
                            } else {
                                sb.append("Resource from : videoList \n");
                                videoList = videoPublishEditModel3.getPreviewInfo().getVideoList();
                            }
                            int size2 = videoList.size();
                            String[] strArr = new String[size2];
                            long[] jArr = new long[size2];
                            long[] jArr2 = new long[size2];
                            long[] jArr3 = new long[2];
                            float[] fArr = new float[size2];
                            boolean zLJ = LJ(videoPublishEditModel3.getPreviewInfo(), videoList, strArr, jArr, jArr2, fArr, jArr3, sb);
                            this.LIZIZ = VEUtils.detachAudioFromVideos(videoPublishEditModel3.getEncodedAudioOutputFile(), strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                            String strLJJJ = C13LQ.LJJJ(strArr, ", ", null, null, null, 62);
                            String strLJJIZ = C13LQ.LJJIZ(jArr, ", ");
                            String strLJJIZ2 = C13LQ.LJJIZ(jArr2, ", ");
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("outputAudio: ");
                            sbLIZ2.append(videoPublishEditModel3.getEncodedAudioOutputFile());
                            sbLIZ2.append(", inputVideos: ");
                            sbLIZ2.append(strLJJJ);
                            sbLIZ2.append(", trimIns: ");
                            sbLIZ2.append(strLJJIZ);
                            sbLIZ2.append(", trimOuts: ");
                            sbLIZ2.append(strLJJIZ2);
                            sbLIZ2.append(", trimIn: ");
                            sbLIZ2.append(jArr3[0]);
                            sbLIZ2.append(", trimOut: ");
                            sbLIZ2.append(jArr3[1]);
                            sbLIZ2.append(", ratio: ");
                            sbLIZ2.append(fArr);
                            sbLIZ2.append(", channels: 1, bitRate: 88200, sampleRate: 44100");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            C0LAB c0lab = new C0LAB();
                            c0lab.LIZ(1, "method");
                            c0lab.LJ("scenario", "AudioAudit");
                            c0lab.LIZ(this.LIZIZ, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            c0lab.LJFF("frame_exist", zLJ);
                            c0lab.LJ("params", strLIZIZ);
                            C20684815ws.LJIILLIIL("ve_audio_frame", c0lab.LIZ);
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            EnumC1462670oAL enumC1462670oAL2 = EnumC1462670oAL.NO_NEEDED;
                            return new C1462680oAM("FastImportSeparator", enumC1462670oAL2, enumC1462670oAL2, enumC1462670oAL, this.LIZIZ, sb.toString());
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            List<EditVideoSegment> videoList;
                            EnumC1462670oAL enumC1462670oAL;
                            boolean z2;
                            EnumC1462670oAL enumC1462670oAL2;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("VoiceVolume: ");
                            sbLIZ2.append(videoPublishEditModel3.getVoiceVolume());
                            sbLIZ2.append(" \n");
                            StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                            if (C1428470nHB.LJLIIIL(videoPublishEditModel3)) {
                                sb.append("Resource from : mediaListExcludeImage \n");
                                videoList = C538660LAq.LIZ(videoPublishEditModel3.getPreviewInfo());
                            } else {
                                sb.append("Resource from : videoList \n");
                                videoList = videoPublishEditModel3.getPreviewInfo().getVideoList();
                            }
                            int size2 = videoList.size();
                            String[] strArr = new String[size2];
                            long[] jArr = new long[size2];
                            long[] jArr2 = new long[size2];
                            long[] jArr3 = new long[2];
                            float[] fArr = new float[size2];
                            LJ(videoPublishEditModel3.getPreviewInfo(), videoList, strArr, jArr, jArr2, fArr, jArr3, sb);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(this.LIZ.LIZ);
                            sbLIZ3.append(System.currentTimeMillis());
                            sbLIZ3.append("_a");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            EnumC1462670oAL enumC1462670oAL3 = EnumC1462670oAL.NO_NEEDED;
                            if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            if (videoPublishEditModel3.getVoiceVolume() == 0.0f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String str = "";
                            if (z2) {
                                String strLIZ = AbstractC1441740nca.LIZ(videoPublishEditModel3);
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile != null) {
                                    str = encodedAudioOutputFile;
                                }
                                this.LIZIZ = VEUtils.transCodeAudio(strLIZ, str, 1, 88200);
                            } else {
                                this.LIZIZ = VEUtils.detachAudioFromVideos(strLIZIZ, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                                if (C2286708xd.LIZJ(strLIZIZ)) {
                                    enumC1462670oAL3 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL3 = EnumC1462670oAL.ABSENCE;
                                }
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(strLIZIZ);
                                arrayList.add(AbstractC1441740nca.LIZ(videoPublishEditModel3));
                                String encodedAudioOutputFile2 = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile2 != null) {
                                    str = encodedAudioOutputFile2;
                                }
                                this.LIZJ = VEUtils.mixAudio(arrayList, str, null);
                                C2354709Kn.LJIJJLI(strLIZIZ);
                            }
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                            }
                            return new C1462680oAM("FastImportSeparator", enumC1462670oAL3, enumC1462670oAL, enumC1462670oAL2, this.LIZIZ, sb.toString());
                        }

                        public static boolean LJ(EditPreviewInfo editPreviewInfo, List list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3, StringBuilder sb) {
                            int size2 = list.size();
                            boolean z2 = true;
                            for (int i = 0; i < size2; i++) {
                                EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(list, i);
                                boolean zLIZJ = C2286708xd.LIZJ(editVideoSegment.getVideoPath());
                                if (zLIZJ && z2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("index = ");
                                sbLIZ2.append(i);
                                sbLIZ2.append(", path = ");
                                sbLIZ2.append(editVideoSegment.getVideoPath());
                                sbLIZ2.append(", file status: ");
                                sbLIZ2.append(zLIZJ);
                                sbLIZ2.append(" \n");
                                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                                strArr[i] = editVideoSegment.getVideoPath();
                                if (editVideoSegment.getVideoCutInfo() != null) {
                                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                                    jArr[i] = videoCutInfo.getStart();
                                    jArr2[i] = videoCutInfo.getEnd();
                                    fArr[i] = videoCutInfo.getSpeed();
                                } else {
                                    jArr[i] = -1;
                                    jArr2[i] = -1;
                                    fArr[i] = 1.0f;
                                }
                            }
                            if (editPreviewInfo.getSceneIn() <= 0 && editPreviewInfo.getSceneOut() <= 0) {
                                jArr3[0] = -1;
                                jArr3[1] = -1;
                                return z2;
                            }
                            jArr3[0] = editPreviewInfo.getSceneIn();
                            jArr3[1] = editPreviewInfo.getSceneOut();
                            return z2;
                        }
                    } : videoPublishEditModel2.isMultiVideoEdit() ? new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAI
                        public VERecordData LIZLLL;

                        @Override // X.AbstractC1441740nca
                        public final void LIZIZ(VideoPublishEditModel videoPublishEditModel3) {
                            MultiEditVideoRecordData multiEditVideoRecordData;
                            super.LIZIZ(videoPublishEditModel3);
                            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel3.getMultiEditVideoRecordData();
                            if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null) {
                                this.LIZLLL = C574800MgY.LIZJ(multiEditVideoRecordData);
                                Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
                                VERecordData vERecordData = this.LIZLLL;
                                if (vERecordData == null) {
                                    vERecordData = null;
                                }
                                vERecordData.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
                            }
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            VERecordData vERecordData = this.LIZLLL;
                            VERecordData vERecordData2 = null;
                            if (vERecordData == null) {
                                vERecordData = null;
                            }
                            if (C2286708xd.LIZJ(vERecordData.concatAudio)) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                            VERecordData vERecordData3 = this.LIZLLL;
                            if (vERecordData3 != null) {
                                vERecordData2 = vERecordData3;
                            }
                            this.LIZIZ = VEUtils.getAudioFromRecordData(encodedAudioOutputFile, vERecordData2, 1, 88200, 44100);
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                            }
                            return new C1462680oAM("RecordVideoSeparator", enumC1462670oAL, EnumC1462670oAL.NO_NEEDED, enumC1462670oAL2, this.LIZIZ);
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            boolean z2;
                            EnumC1462670oAL enumC1462670oAL2;
                            EnumC1462670oAL enumC1462670oAL3 = EnumC1462670oAL.NO_NEEDED;
                            if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            if (videoPublishEditModel3.getVoiceVolume() == 0.0f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String str = "";
                            if (!z2 && videoPublishEditModel3.hasOriginalSound()) {
                                VERecordData vERecordData = this.LIZLLL;
                                if (vERecordData == null) {
                                    vERecordData = null;
                                }
                                if (C2286708xd.LIZJ(vERecordData.concatAudio)) {
                                    enumC1462670oAL3 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL3 = EnumC1462670oAL.ABSENCE;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(this.LIZ.LIZ);
                                sbLIZ2.append(System.currentTimeMillis());
                                sbLIZ2.append("_a");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                VERecordData vERecordData2 = this.LIZLLL;
                                if (vERecordData2 == null) {
                                    vERecordData2 = null;
                                }
                                this.LIZIZ = VEUtils.getAudioFromRecordData(strLIZIZ, vERecordData2, 1, 88200, 44100);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(strLIZIZ);
                                arrayList.add(AbstractC1441740nca.LIZ(videoPublishEditModel3));
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile != null) {
                                    str = encodedAudioOutputFile;
                                }
                                this.LIZJ = VEUtils.mixAudio(arrayList, str, null);
                                C2354709Kn.LJIJJLI(strLIZIZ);
                            } else {
                                String strLIZ = AbstractC1441740nca.LIZ(videoPublishEditModel3);
                                String encodedAudioOutputFile2 = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile2 != null) {
                                    str = encodedAudioOutputFile2;
                                }
                                this.LIZIZ = VEUtils.transCodeAudio(strLIZ, str, 1, 88200);
                            }
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                            }
                            int i = this.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("hasOriginalSound = ");
                            sbLIZ3.append(videoPublishEditModel3.hasOriginalSound());
                            sbLIZ3.append(" \n voiceVolume: ");
                            sbLIZ3.append(videoPublishEditModel3.getVoiceVolume());
                            return new C1462680oAM("RecordVideoSeparator", enumC1462670oAL3, enumC1462670oAL, enumC1462670oAL2, i, C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } : videoPublishEditModel2.isStitchMode() ? new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAH
                        public String LIZLLL;

                        @Override // X.AbstractC1441740nca
                        public final void LIZIZ(VideoPublishEditModel videoPublishEditModel3) {
                            String concatAudioPath;
                            super.LIZIZ(videoPublishEditModel3);
                            StitchParams stitchParams = videoPublishEditModel3.getStitchParams();
                            String concatAudioPath2 = null;
                            if (stitchParams != null) {
                                concatAudioPath = stitchParams.getConcatAudioPath();
                            } else {
                                concatAudioPath = null;
                            }
                            if (TextUtils.isEmpty(concatAudioPath)) {
                                concatAudioPath2 = videoPublishEditModel3.audioPath();
                            } else {
                                StitchParams stitchParams2 = videoPublishEditModel3.getStitchParams();
                                if (stitchParams2 != null) {
                                    concatAudioPath2 = stitchParams2.getConcatAudioPath();
                                }
                            }
                            this.LIZLLL = concatAudioPath2;
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            if (C2286708xd.LIZJ(this.LIZLLL)) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            String str = this.LIZLLL;
                            if (str != null) {
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile == null) {
                                    encodedAudioOutputFile = "";
                                }
                                this.LIZIZ = VEUtils.transCodeAudio(str, encodedAudioOutputFile, 1, 88200);
                            }
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                            }
                            return new C1462680oAM("StitchSeparator", enumC1462670oAL, EnumC1462670oAL.NO_NEEDED, enumC1462670oAL2, this.LIZIZ);
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            boolean z2;
                            EnumC1462670oAL enumC1462670oAL;
                            NLETrack next;
                            EnumC1462670oAL enumC1462670oAL2;
                            NLESegment mainSegment;
                            NLEResourceNode resource;
                            boolean z3 = true;
                            int i = 0;
                            if (videoPublishEditModel3.getStitchParams() != null && this.LIZLLL != null) {
                                EnumC1462670oAL enumC1462670oAL3 = EnumC1462670oAL.NO_NEEDED;
                                if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                    enumC1462670oAL = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                                }
                                String nleData = videoPublishEditModel3.getNleData();
                                if (nleData != null && nleData.length() != 0) {
                                    if (videoPublishEditModel3.hasOriginalSound() && videoPublishEditModel3.getVoiceVolume() != 0.0f) {
                                        enumC1462670oAL3 = C2286708xd.LIZJ(this.LIZLLL) ? EnumC1462670oAL.EXIT : EnumC1462670oAL.ABSENCE;
                                    }
                                    String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                    if (encodedAudioOutputFile == null) {
                                        encodedAudioOutputFile = "";
                                    }
                                    AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(7);
                                    AFwS261S0000000_22 aFwS261S0000000_222 = AFwS261S0000000_22.get$arr$(8);
                                    NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                                    nLEEditorLIZ.restore(videoPublishEditModel3.getNleData());
                                    NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEEditorLIZ.getModel().getStage().deepClone());
                                    C347230DjN.LIZ(nLEModelDynamicCast);
                                    Iterator<NLETrack> it2 = nLEModelDynamicCast.getTracks().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    NLETrack nLETrack = next;
                                    if (nLETrack != null) {
                                        for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                                            if (nLETrackSlot.hasExtra("extra_origin_voice_file_path") && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                                                resource.setResourceFile(nLETrackSlot.getExtra("extra_origin_voice_file_path"));
                                            }
                                        }
                                    }
                                    C0E38.LIZ(encodedAudioOutputFile, nLEModelDynamicCast, aFwS261S0000000_222, aFwS261S0000000_22, 0, 0, 16000, null, null, false, false, 1968);
                                    if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                        enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                                    } else {
                                        enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                                    }
                                    if (enumC1462670oAL2 != EnumC1462670oAL.EXIT) {
                                        i = -1;
                                    }
                                    this.LIZIZ = i;
                                    return new C1462680oAM("StitchSeparator", enumC1462670oAL3, enumC1462670oAL, enumC1462670oAL2, i, "hasOriginalSound = " + videoPublishEditModel3.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel3.getVoiceVolume());
                                }
                                EnumC1462670oAL enumC1462670oAL4 = EnumC1462670oAL.ABSENCE;
                                return new C1462680oAM("StitchSeparator", enumC1462670oAL4, enumC1462670oAL4, enumC1462670oAL4, -1, "nleModel is null or emtpy");
                            }
                            EnumC1462670oAL enumC1462670oAL5 = EnumC1462670oAL.NO_NEEDED;
                            int i2 = this.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("model.stitchParams == null: ");
                            if (videoPublishEditModel3.getStitchParams() == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            sbLIZ2.append(z2);
                            sbLIZ2.append("  mediaFile == null: ");
                            if (this.LIZLLL != null) {
                                z3 = false;
                            }
                            sbLIZ2.append(z3);
                            return new C1462680oAM("StitchSeparator", enumC1462670oAL5, enumC1462670oAL5, enumC1462670oAL5, i2, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } : videoPublishEditModel2.isMvThemeVideoType() ? new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAK
                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            this.LIZIZ = 0;
                            EnumC1462670oAL enumC1462670oAL = EnumC1462670oAL.NO_NEEDED;
                            return new C1462680oAM("MVSeparator", enumC1462670oAL, enumC1462670oAL, enumC1462670oAL, 0);
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            String strLIZ = AbstractC1441740nca.LIZ(videoPublishEditModel3);
                            String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                            if (encodedAudioOutputFile == null) {
                                encodedAudioOutputFile = "";
                            }
                            this.LIZIZ = VEUtils.transCodeAudio(strLIZ, encodedAudioOutputFile, 1, 88200);
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                            }
                            return new C1462680oAM("MVSeparator", EnumC1462670oAL.NO_NEEDED, enumC1462670oAL, enumC1462670oAL2, this.LIZIZ);
                        }
                    } : new AbstractC1441740nca(c1441750ncb) { // from class: X.0oAJ
                        public String LIZLLL;

                        @Override // X.AbstractC1441740nca
                        public final void LIZIZ(VideoPublishEditModel videoPublishEditModel3) {
                            String strAudioPath;
                            super.LIZIZ(videoPublishEditModel3);
                            if (TextUtils.isEmpty(videoPublishEditModel3.audioPath())) {
                                strAudioPath = videoPublishEditModel3.videoPath();
                                strAudioPath.toString();
                            } else {
                                strAudioPath = videoPublishEditModel3.audioPath();
                            }
                            this.LIZLLL = strAudioPath;
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            if (C2286708xd.LIZJ(this.LIZLLL)) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            String str = this.LIZLLL;
                            if (str != null) {
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile == null) {
                                    encodedAudioOutputFile = "";
                                }
                                this.LIZIZ = VEUtils.transCodeAudio(str, encodedAudioOutputFile, 1, 88200);
                            }
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                            }
                            return new C1462680oAM("DefaultSeparator", enumC1462670oAL, EnumC1462670oAL.NO_NEEDED, enumC1462670oAL2, this.LIZIZ);
                        }

                        @Override // X.AbstractC1441740nca
                        public final C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel3) {
                            EnumC1462670oAL enumC1462670oAL;
                            EnumC1462670oAL enumC1462670oAL2;
                            if (this.LIZLLL == null) {
                                EnumC1462670oAL enumC1462670oAL3 = EnumC1462670oAL.NO_NEEDED;
                                return new C1462680oAM("DefaultSeparator", enumC1462670oAL3, enumC1462670oAL3, enumC1462670oAL3, this.LIZIZ, "mediaFile == null: true");
                            }
                            EnumC1462670oAL enumC1462670oAL4 = EnumC1462670oAL.NO_NEEDED;
                            if (C2286708xd.LIZJ(AbstractC1441740nca.LIZ(videoPublishEditModel3))) {
                                enumC1462670oAL = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL = EnumC1462670oAL.ABSENCE;
                            }
                            String str = "";
                            if (videoPublishEditModel3.hasOriginalSound() && videoPublishEditModel3.getVoiceVolume() != 0.0f) {
                                if (C2286708xd.LIZJ(this.LIZLLL)) {
                                    enumC1462670oAL4 = EnumC1462670oAL.EXIT;
                                } else {
                                    enumC1462670oAL4 = EnumC1462670oAL.ABSENCE;
                                }
                                this.LIZIZ = -999;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(this.LIZLLL);
                                arrayList.add(AbstractC1441740nca.LIZ(videoPublishEditModel3));
                                String encodedAudioOutputFile = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile != null) {
                                    str = encodedAudioOutputFile;
                                }
                                this.LIZJ = VEUtils.mixAudio(arrayList, str, null);
                            } else {
                                String strLIZ = AbstractC1441740nca.LIZ(videoPublishEditModel3);
                                String encodedAudioOutputFile2 = videoPublishEditModel3.getEncodedAudioOutputFile();
                                if (encodedAudioOutputFile2 != null) {
                                    str = encodedAudioOutputFile2;
                                }
                                this.LIZIZ = VEUtils.transCodeAudio(strLIZ, str, 1, 88200);
                            }
                            if (C2286708xd.LIZJ(videoPublishEditModel3.getEncodedAudioOutputFile())) {
                                enumC1462670oAL2 = EnumC1462670oAL.EXIT;
                            } else {
                                enumC1462670oAL2 = EnumC1462670oAL.ABSENCE;
                            }
                            int i = this.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("hasOriginalSound = ");
                            sbLIZ2.append(videoPublishEditModel3.hasOriginalSound());
                            sbLIZ2.append(" \n voiceVolume: ");
                            sbLIZ2.append(videoPublishEditModel3.getVoiceVolume());
                            return new C1462680oAM("DefaultSeparator", enumC1462670oAL4, enumC1462670oAL, enumC1462670oAL2, i, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    };
                    abstractC1441740nca.LIZIZ(videoPublishEditModel2);
                    C1462680oAM c1462680oAMLIZLLL = (C1428520nHG.LJJJJL(videoPublishEditModel2) && C0CH7.LIZ()) ? abstractC1441740nca.LIZLLL(videoPublishEditModel2) : abstractC1441740nca.LIZJ(videoPublishEditModel2);
                    int iLIZ = C2486109oh.LIZ(videoPublishEditModel2.getEncodedAudioOutputFile());
                    if (c1462680oAMLIZLLL.LJ == -999) {
                        C1441450nc7.LIZIZ(videoPublishEditModel2, createBaseAwemeResponse2, -1001, c1462680oAMLIZLLL.LIZ());
                    }
                    if (iLIZ < 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c1462680oAMLIZLLL.LIZ());
                        sbLIZ2.append(" \n checkResult: ");
                        sbLIZ2.append(iLIZ);
                        sbLIZ2.append(" \n doubleCheck outputFile: ");
                        sbLIZ2.append(new C0VSJ(videoPublishEditModel2.getEncodedAudioOutputFile()).exists());
                        sbLIZ2.append(" \n encodeResult: ");
                        sbLIZ2.append(abstractC1441740nca.LIZIZ);
                        C1441450nc7.LIZIZ(videoPublishEditModel2, createBaseAwemeResponse2, -1002, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("mixResult");
                    sbLIZ3.append(abstractC1441740nca.LIZJ);
                    sbLIZ3.append("encodeResult = ");
                    sbLIZ3.append(abstractC1441740nca.LIZIZ);
                    sbLIZ3.append(" checkResult = ");
                    sbLIZ3.append(iLIZ);
                    sbLIZ3.append(" path = ");
                    sbLIZ3.append(videoPublishEditModel2.getEncodedAudioOutputFile());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    C543670LTx c543670LTx2 = new C543670LTx();
                    c543670LTx2.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(iLIZ + 10000));
                    c543670LTx2.LIZ.put("errorDesc", strLIZIZ);
                    C1637890six.LIZ("aweme_movie_publish_log", "encode_audio_file", c543670LTx2.LJ());
                    lth.o.LJIJI.getClass();
                    AVAweme aVAwemeLambda$getAVConverter$02 = AVServiceProxyImpl.lambda$getAVConverter$0(createBaseAwemeResponse2);
                    if (aVAwemeLambda$getAVConverter$02 == null) {
                        c1441600ncM = null;
                        size = 0;
                    } else {
                        c1441600ncM = new C1441600ncM();
                        String str = aVAwemeLambda$getAVConverter$02.aid;
                        String str2 = createBaseAwemeResponse2.materialId;
                        String encodedAudioOutputFile = videoPublishEditModel2.getEncodedAudioOutputFile();
                        String str3 = encodedAudioOutputFile != null ? encodedAudioOutputFile : "";
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i = C1446400nk6.LIZ(videoPublishEditModel2).LIZ;
                        boolean z2 = videoPublishEditModel2.mIsFromDraft;
                        String cameraIds2 = videoPublishEditModel2.getCameraIds();
                        ((ArrayList) c1441600ncM.LIZ).add(new OriginalSoundUploadTask(str, str2, str3, jCurrentTimeMillis, null, null, i, z2, ((cameraIds2 == null || cameraIds2.length() == 0) ? 1 : 0) ^ 1, videoPublishEditModel2.getRestoreType() == 2, 0));
                        size = ((ArrayList) c1441600ncM.LIZ).size();
                    }
                    C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("will insert: ");
                    sbLIZ4.append(c1441600ncM != null);
                    sbLIZ4.append(", insertCount: ");
                    sbLIZ4.append(size);
                    c1437510nVlLJJLIIIJ2.LIZ("original_sound", C2188811AlT.LIZIZ(sbLIZ4));
                    C1441540ncG c1441540ncGLIZ = C1441580ncK.LIZ(context);
                    Iterator it2 = ((ArrayList) c1441600ncM.LIZ).iterator();
                    while (it2.hasNext()) {
                        c1441540ncGLIZ.LIZ((OriginalSoundUploadTask) it2.next());
                    }
                    if (C0CHT.LIZ() && videoPublishEditModel2.getInfoStickerModel() != null && videoPublishEditModel2.getInfoStickerModel().stickers != null && videoPublishEditModel2.hasTextSticker()) {
                        try {
                            for (StickerItemModel stickerItemModel : videoPublishEditModel2.getInfoStickerModel().stickers) {
                                if (stickerItemModel.isTextSticker() && (textStickerData = (TextStickerData) C0CHQ.LIZ().getGson().LJII(stickerItemModel.extra, TextStickerData.class)) != null) {
                                    Iterator<String> it3 = textStickerData.getAudioPathList().iterator();
                                    while (it3.hasNext()) {
                                        C2354709Kn.LJIJJLI(it3.next());
                                    }
                                }
                            }
                            for (TextStickerModel textStickerModel : videoPublishEditModel2.creativeModel.stickerModel.textStickerModels) {
                                if (textStickerModel.getTtsModel() == null) {
                                    break;
                                }
                                Iterator<String> it4 = textStickerModel.getTtsModel().audioPathList.iterator();
                                while (it4.hasNext()) {
                                    C2354709Kn.LJIJJLI(it4.next());
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("removeAudioFile failed: ");
                            sbLIZ5.append(th.getMessage());
                            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                }
                countDownLatch2.countDown();
                C1C7U.LIZIZ("PostPublishTrigger@8fc7.trigger$1L");
                return null;
            }
        }).LJI(new C854740Xg0(application, 4));
    }
}

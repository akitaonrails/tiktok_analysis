package X;

import Y.ARunnableS41S0300000_8;
import Y.ARunnableS83S0200000_14;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.0nWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437830nWH {
    public static final C1437830nWH LIZ = new C1437830nWH();

    public static List LIZ(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() != 0) {
            ArrayList<String> arrayListLIZLLL = C856940XjY.LIZLLL(str);
            ArrayList<Pair> arrayList2 = new ArrayList();
            int length = 0;
            for (String str2 : arrayListLIZLLL) {
                int iLJJJ = a0.LJJJ(str, str2, length, false, 4);
                if (iLJJJ >= 0) {
                    length = str2.length() + iLJJJ;
                    arrayList2.add(new Pair(Integer.valueOf(iLJJJ), Integer.valueOf(length)));
                }
            }
            for (Pair pair : arrayList2) {
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                aVTextExtraStruct.type = 1;
                aVTextExtraStruct.hashTagName = u.LJJIFFI(str.substring(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue()), "#", "", false);
                aVTextExtraStruct.start = ((Number) pair.getFirst()).intValue();
                aVTextExtraStruct.end = ((Number) pair.getSecond()).intValue();
                arrayList.add(aVTextExtraStruct);
            }
            return arrayList;
        }
        return arrayList;
    }

    public static void LIZJ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, String str, String str2) throws Throwable {
        C1402440mbC.LJIILLIIL(new C1402440mbC(), c19eg, videoPublishEditModel, false, null, false, null, null, null, 992);
        if (C123100dR.LIZ(str2)) {
            InterfaceC376620Epg interfaceC376620Epg = o.LIZJ;
            Intent intent = new Intent(c19eg, C19221910Hx.LIZJ());
            intent.addFlags(603979776);
            Publish.isNeedProcessPublish = true;
            intent.putExtra("extra_cc_failed_draft_key", str);
            intent.putExtra("extra_publish_failed_message", new PublishFailMsg(str2, true, true));
            C1428470nHB.LLIIZ(intent, videoPublishEditModel);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, c19eg);
            C2204961BRm.LLJJJJ(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq9YZPHzzowroHTNOCZGDUtm1gqVw==", null));
            return;
        }
        C1433230nOr c1433230nOr = new C1433230nOr("CC publish", null, 6);
        C1433500nPI c1433500nPI = C1433730nPf.LJIIIZ;
        if (c1433500nPI != null) {
            C1433730nPf.LJI.execute(new ARunnableS83S0200000_14(c1433500nPI, c1433230nOr, 20));
        }
        C0M5N c0m5n = C0M5N.LIZ;
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        C786410Ut5.LJJIZ(bundle, "extra_video_publish_args", videoPublishEditModel);
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        bundle.putInt("extra_stick_point_type", 0);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate());
        Publish.PublishBundle = bundle;
        C0M5P c0m5p = new C0M5P(c19eg, bundle, null);
        c0m5n.getClass();
        C0M5N.LIZ(c0m5p);
        c19eg.finish();
    }

    public static void LIZIZ(final C19EG c19eg, String str, BaseShareContext baseShareContext, String str2, String str3) {
        String str4;
        boolean z;
        final AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(c19eg, 631);
        final VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.mShootWay = str2;
        videoPublishEditModel.setMusicOrigin(str3);
        C1429890nJT c1429890nJT = new C1429890nJT();
        c1429890nJT.setShareContext((C1402840mbq) baseShareContext);
        videoPublishEditModel.getCreativeFlowData().setExtraShareOptions(c1429890nJT.getShareContext().mExtraShareOptions);
        videoPublishEditModel.setMainBusinessContext(c1429890nJT);
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = videoPublishEditModel.getCreativeFlowData().getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos != null) {
            autoSelectedAnchorInfos.setOpenPlatformClientKey(baseShareContext.mClientKey);
            autoSelectedAnchorInfos.setOpenPlatFormExtra(baseShareContext.mOpenPlatformExtra);
            autoSelectedAnchorInfos.setAnchorSourceType(baseShareContext.mAnchorSourceType);
        }
        C1416310mxZ.LIZIZ(videoPublishEditModel, baseShareContext.mPublishSettings);
        videoPublishEditModel.setOpenPlatformExtra(baseShareContext.mOpenPlatformExtra);
        videoPublishEditModel.setOpenPlatformClientKey(baseShareContext.mClientKey);
        videoPublishEditModel.getCreativeFlowData().setExtraShareOptions(baseShareContext.mExtraShareOptions);
        videoPublishEditModel.setCreativeInfo(new CreativeInfo(null, 0, null, 7, null));
        videoPublishEditModel.setOrigin(0);
        videoPublishEditModel.setFromCut(true);
        videoPublishEditModel.setFastImport(true);
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) == 0) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = null;
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, null, new VideoFileInfo(iArr[0], iArr[1], iArr[3], iArr[7], iArr[6], 0, 0, 0, 0.0f, 480, null));
            editVideoSegment.setVideoCutInfo(new VideoCutInfo(0L, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0));
            HashMap<String, String> metaData = TEVideoUtils.getMetaData(editVideoSegment.getVideoPath());
            if (metaData.get("LvMetaInfo") != null) {
                str4 = metaData.get("LvMetaInfo");
            } else {
                str4 = "";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(editVideoSegment);
            videoPublishEditModel.setPreviewInfo(new C538310L9h(C0CHQ.LIZ().LJJIIZ().getVideoWidth(), C0CHQ.LIZ().LJJIIZ().getVideoHeight(), 28).LIZ(arrayList));
            videoPublishEditModel.videoWidth();
            ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[6];
            int i4 = iArr[8];
            long j = iArr[3];
            arrayList2.add(new ImportVideoInfo(i, i2, i3, i4, str, j, j, str4, null, iArr[7], 1.0f, str, str, false, null, null, 0L, 114688, null));
            videoPublishEditModel.setImportInfoList(arrayList2);
            Workspace workspaceLIZ = C1436370nTv.LIZ(videoPublishEditModel);
            videoPublishEditModel.setOutputFile(workspaceLIZ.LJFF().getPath());
            videoPublishEditModel.setEncodedAudioOutputFile(workspaceLIZ.LIZJ().getPath());
            videoPublishEditModel.setParallelUploadOutputFile(workspaceLIZ.LIZLLL().getPath());
            videoPublishEditModel.setVideoCount(1);
            videoPublishEditModel.setVoiceVolume(1.0f);
            videoPublishEditModel.setShootMode(-1);
            videoPublishEditModel.setDuetFrom(null);
            videoPublishEditModel.setMusicVolume(1.0f);
            videoPublishEditModel.setNewVersion(3);
            videoPublishEditModel.generateVideoCoverPath();
            MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(videoPublishEditModel.getPreviewInfo().getVideoList());
            if (multiEditVideoRecordDataLIZIZ != null) {
                multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
                Iterator it2 = arrayList.iterator();
                int duration = 0;
                while (it2.hasNext()) {
                    duration += (int) ((EditVideoSegment) it2.next()).getVideoFileInfo().getDuration();
                }
                multiEditVideoRecordDataLIZIZ.endTime = Math.min(duration, C536240L1i.LIZ());
                if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                    if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    multiEditVideoRecordDataLIZIZ.isSingleVideo = z;
                    multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
                }
                multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
            }
            videoPublishEditModel.setMultiEditVideoRecordData(multiEditVideoStatusRecordData);
            C1416310mxZ.LJJII(videoPublishEditModel);
            new C1439340nYi(videoPublishEditModel).LJ(false, false);
            VEUtils.getVideoThumb(C574800MgY.LIZJ(videoPublishEditModel.getCurMultiEditVideoRecordData()), (int) ((videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT) + 1), -1, -1, false, new InterfaceC1286300jZs() { // from class: X.0MBh
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i5, int i6, int i7) {
                    EffectTextModel effectTextModel;
                    Bitmap bitmapMergeCoverText;
                    if (c19eg == null) {
                        return false;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                    if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapCreateBitmap)) != null) {
                        bitmapCreateBitmap = bitmapMergeCoverText;
                    }
                    new C443530HaJ(c19eg.getResources(), bitmapCreateBitmap).LIZJ(C12ES.LIZJ(4.0f, c19eg));
                    ExecutorC527170Klv.LLILLJJLI.execute(new ARunnableS41S0300000_8(videoPublishEditModel, bitmapCreateBitmap, awS601S0100000_22, 6));
                    return false;
                }
            });
        }
    }
}

package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQ3 implements NLEPrepareListener {
    public final /* synthetic */ C539020LCa LIZ;
    public final /* synthetic */ ArrayList<MediaItem> LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ CutsameDataItem LIZLLL;
    public final /* synthetic */ CountDownLatch LJ;

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onProgress(float f, String str) {
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
        ArrayList<MediaItem> arrayList;
        MediaItem next;
        NLEResType nLEResType;
        ItemCrop itemCropLIZ;
        if (nLETemplateModel == null) {
            return;
        }
        boolean zLIZ = C0LE5.LIZ();
        int i = LSPassThroughRecordSizeConfig.DEFAULT;
        if (zLIZ) {
            C539020LCa c539020LCa = this.LIZ;
            arrayList = this.LIZIZ;
            c539020LCa.getClass();
            if (!arrayList.isEmpty()) {
                ArrayList<MediaItem> arrayList2 = new ArrayList<>();
                VecNLETrackSlotSPtr mutableAssetItems = nLETemplateModel.getMutableAssetItems();
                ArrayList arrayList3 = new ArrayList();
                for (NLETrackSlot nLETrackSlot : mutableAssetItems) {
                    if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
                        arrayList3.add(nLETrackSlot);
                    }
                }
                int i2 = 0;
                for (Object obj : arrayList3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) obj;
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                        NLEStyClip clip = nLESegmentVideoDynamicCast.getClip();
                        if (clip != null) {
                            itemCropLIZ = C353040Dsk.LIZ(clip);
                        } else {
                            NLEStyCrop crop = nLESegmentVideoDynamicCast.getCrop();
                            if (crop != null) {
                                itemCropLIZ = C353040Dsk.LIZJ(crop);
                            } else {
                                itemCropLIZ = C353040Dsk.LIZ(new NLEStyClip());
                            }
                        }
                        MediaItem mediaItem = (MediaItem) ListProtector.get(arrayList, i2 % arrayList.size());
                        if (Intrinsics.LJFF(mediaItem.type, "photo")) {
                            long j = i;
                            arrayList2.add(MediaItem.LIZ(mediaItem, nLETrackSlot2.getUUID(), nLETrackSlot2.getStartTime() / j, nLETrackSlot2.getEndTime() / j, false, nLESegmentVideoDynamicCast.getVolume(), (int) nLESegmentVideoDynamicCast.getResource().getWidth(), (int) nLESegmentVideoDynamicCast.getResource().getHeight(), nLETrackSlot2.getDuration() / j, null, 0L, nLETrackSlot2.getScale(), itemCropLIZ, "photo", null, nLETrackSlot2.getSpeed(), 270840));
                        } else {
                            String uuid = nLETrackSlot2.getUUID();
                            long j2 = i;
                            long startTime = nLETrackSlot2.getStartTime() / j2;
                            long endTime = nLETrackSlot2.getEndTime() / j2;
                            long duration = nLETrackSlot2.getDuration() / j2;
                            long j3 = mediaItem.duration;
                            if (duration <= j3) {
                                j3 = duration;
                            }
                            arrayList2.add(MediaItem.LIZ(mediaItem, uuid, startTime, endTime, nLETrackSlot2.getRewind(), nLESegmentVideoDynamicCast.getVolume(), (int) nLESegmentVideoDynamicCast.getResource().getWidth(), (int) nLESegmentVideoDynamicCast.getResource().getHeight(), j3, null, 0L, nLETrackSlot2.getScale(), itemCropLIZ, "video", null, nLETrackSlot2.getSpeed(), 287160));
                        }
                        i2 = i3;
                        i = LSPassThroughRecordSizeConfig.DEFAULT;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = this.LIZIZ;
        }
        Context context = this.LIZJ;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (NLETrackSlot nLETrackSlot3 : nLETemplateModel.getMutableAssetItems()) {
                Iterator<MediaItem> it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.materialId, nLETrackSlot3.getUUID())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                MediaItem mediaItem2 = next;
                if (mediaItem2 != null) {
                    long j4 = mediaItem2.targetStartTime;
                    long j5 = LSPassThroughRecordSizeConfig.DEFAULT;
                    nLETrackSlot3.setStartTime(j4 * j5);
                    nLETrackSlot3.setEndTime(mediaItem2.targetEndTime * j5);
                    nLETrackSlot3.setScale(mediaItem2.cropScale);
                    NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment());
                    if (nLESegmentVideoDynamicCast2 != null) {
                        if (mediaItem2.isReverse) {
                            nLESegmentVideoDynamicCast2.getResource().setResourceFile(mediaItem2.mediaSrcPath);
                            nLESegmentVideoDynamicCast2.getReversedAVFile().setResourceFile(mediaItem2.source);
                        } else {
                            nLESegmentVideoDynamicCast2.getResource().setResourceFile(mediaItem2.source);
                        }
                        ItemCrop itemCropLIZIZ = C353040Dsk.LIZIZ(context, mediaItem2.crop, mediaItem2.alignMode, mediaItem2.source, mediaItem2.width, mediaItem2.height);
                        NLEResourceNode resource = nLESegmentVideoDynamicCast2.getResource();
                        String str = mediaItem2.type;
                        if (!Intrinsics.LJFF(str, "video") && Intrinsics.LJFF(str, "photo")) {
                            nLEResType = NLEResType.IMAGE;
                        } else {
                            nLEResType = NLEResType.VIDEO;
                        }
                        resource.setResourceType(nLEResType);
                        nLESegmentVideoDynamicCast2.setClip(C353040Dsk.LJ(itemCropLIZIZ));
                        nLESegmentVideoDynamicCast2.setCrop(C353040Dsk.LJFF(itemCropLIZIZ));
                        nLESegmentVideoDynamicCast2.setTimeClipStart(mediaItem2.sourceStartTime * j5);
                        nLESegmentVideoDynamicCast2.setVolume(mediaItem2.volume);
                        VecNLEPointSPtr curveSpeedPoints = nLESegmentVideoDynamicCast2.getCurveSpeedPoints();
                        if (curveSpeedPoints != null && !curveSpeedPoints.isEmpty() && nLESegmentVideoDynamicCast2.getSpeed() != 1.0f) {
                            nLESegmentVideoDynamicCast2.setTimeClipEnd(nLESegmentVideoDynamicCast2.getTimeClipStart() + ((long) (nLESegmentVideoDynamicCast2.getCurveAveSpeed() * nLETrackSlot3.getDuration())));
                            nLESegmentVideoDynamicCast2.setSpeed(1.0f);
                        }
                    }
                }
            }
        }
        s.LIZ.getClass();
        s.LJIIJJI(nLETemplateModel);
        C539020LCa c539020LCa2 = this.LIZ;
        Integer numValueOf = Integer.valueOf(this.LIZLLL.templateType);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (MediaItem mediaItem3 : arrayList) {
            arrayList4.add(new C443120HZe(mediaItem3.materialId, Long.valueOf(mediaItem3.sourceStartTime), Long.valueOf(mediaItem3.sourceStartTime + mediaItem3.duration)));
        }
        c539020LCa2.LJJIJL = s.LJJIJIIJIL(numValueOf, nLETemplateModel, arrayList4, null, false);
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onSuccess(NLETemplateModel nLETemplateModel) {
        if (nLETemplateModel != null) {
            Iterator<NLETrack> it2 = nLETemplateModel.getTracks().iterator();
            while (it2.hasNext()) {
                it2.next().setExtra("business", "cutsame");
            }
            nLETemplateModel.setCanvasRatio(nLETemplateModel.getCanvasRatio());
        }
        this.LIZ.LJJIJIIJIL = NLETemplateModel.saveToDraft(nLETemplateModel);
        C539020LCa c539020LCa = this.LIZ;
        NLEEditor nLEEditor = c539020LCa.LJJIJIL;
        NLEModel nLEModel = null;
        if (nLEEditor == null) {
            nLEEditor = null;
        }
        NLEModel nLEModel2 = c539020LCa.LJJIJIIJIL;
        if (nLEModel2 != null) {
            nLEModel = nLEModel2;
        }
        nLEEditor.setModel(nLEModel);
        this.LJ.countDown();
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onError(int i, String str) {
        this.LJ.countDown();
    }

    public C0FQ3(C539020LCa c539020LCa, ArrayList<MediaItem> arrayList, Context context, CutsameDataItem cutsameDataItem, CountDownLatch countDownLatch) {
        this.LIZ = c539020LCa;
        this.LIZIZ = arrayList;
        this.LIZJ = context;
        this.LIZLLL = cutsameDataItem;
        this.LJ = countDownLatch;
    }
}

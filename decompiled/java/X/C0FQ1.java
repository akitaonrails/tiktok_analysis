package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQ1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList<com.ss.android.ugc.cut_ui.MediaItem> LIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel r37) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FQ1.LIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel):java.util.ArrayList");
    }

    public static final ArrayList<TextItem> LIZIZ(NLETemplateModel nLETemplateModel) {
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : nLETemplateModel.getMutableTextItems()) {
            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentTextStickerDynamicCast != null) {
                TextItem textItem = new TextItem(nLETrackSlot.getDuration(), true, nLESegmentTextStickerDynamicCast.getUUID(), nLETrackSlot.getRotation(), nLETrackSlot.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), nLESegmentTextStickerDynamicCast.getContent());
                InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createTextItems ");
                sbLIZ.append(textItem);
                C559870LxZ.LIZ("NLETemplateUtils", C2188811AlT.LIZIZ(sbLIZ));
                arrayList.add(textItem);
            } else if (NLESegmentTextTemplate.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
                for (NLETextTemplateClip nLETextTemplateClip : nLETemplateModel.getAllMutableTextClipsFromSlot(nLETrackSlot)) {
                    long duration = nLETrackSlot.getDuration();
                    String uuid = nLETextTemplateClip.getUUID();
                    double rotation = nLETrackSlot.getRotation();
                    long startTime = nLETrackSlot.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    String content = nLETextTemplateClip.getContent();
                    if (content == null) {
                        content = "";
                    }
                    TextItem textItem2 = new TextItem(duration, true, uuid, rotation, startTime, content);
                    InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("createTextItems ");
                    sbLIZ2.append(textItem2);
                    C559870LxZ.LIZ("NLETemplateUtils", C2188811AlT.LIZIZ(sbLIZ2));
                    arrayList.add(textItem2);
                }
            }
        }
        return new ArrayList<>(arrayList);
    }

    public static final void LIZJ(NLETemplateModel nLETemplateModel, Context context, ArrayList<MediaItem> arrayList) {
        MediaItem next;
        NLEResType nLEResType;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (NLETrackSlot nLETrackSlot : nLETemplateModel.getMutableAssetItems()) {
                Iterator<MediaItem> it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.materialId, nLETrackSlot.getUUID())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                MediaItem mediaItem = next;
                if (mediaItem != null) {
                    long j = mediaItem.targetStartTime;
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    nLETrackSlot.setStartTime(j * j2);
                    nLETrackSlot.setEndTime(mediaItem.targetEndTime * j2);
                    nLETrackSlot.setScale(mediaItem.cropScale);
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        if (mediaItem.isReverse) {
                            nLESegmentVideoDynamicCast.getResource().setResourceFile(mediaItem.mediaSrcPath);
                            nLESegmentVideoDynamicCast.getReversedAVFile().setResourceFile(mediaItem.source);
                        } else {
                            nLESegmentVideoDynamicCast.getResource().setResourceFile(mediaItem.source);
                        }
                        ItemCrop itemCropLIZIZ = C353040Dsk.LIZIZ(context, mediaItem.crop, mediaItem.alignMode, mediaItem.source, mediaItem.width, mediaItem.height);
                        NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                        String str = mediaItem.type;
                        if (!Intrinsics.LJFF(str, "video") && Intrinsics.LJFF(str, "photo")) {
                            nLEResType = NLEResType.IMAGE;
                        } else {
                            nLEResType = NLEResType.VIDEO;
                        }
                        resource.setResourceType(nLEResType);
                        nLESegmentVideoDynamicCast.setClip(C353040Dsk.LJ(itemCropLIZIZ));
                        nLESegmentVideoDynamicCast.setCrop(C353040Dsk.LJFF(itemCropLIZIZ));
                        nLESegmentVideoDynamicCast.setTimeClipStart(mediaItem.sourceStartTime * j2);
                        nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getTimeClipStart() + (mediaItem.duration * j2));
                        nLESegmentVideoDynamicCast.setVolume(mediaItem.volume);
                        nLESegmentVideoDynamicCast.setSpeed(mediaItem.speed);
                    }
                    InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("insertMediaItems[] success:  NLETrackSlot = ");
                    sbLIZ.append(nLETrackSlot);
                    C559870LxZ.LIZ("NLETemplateUtils", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }
}

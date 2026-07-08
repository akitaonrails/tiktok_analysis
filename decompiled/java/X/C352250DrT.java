package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352250DrT {
    public static final List<String> LJ(NLEModel nLEModel) {
        List<NLETrackSlot> listLJFF = LJFF(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJFF).iterator();
        while (it2.hasNext()) {
            String strLJII = LJII((NLETrackSlot) it2.next());
            if (strLJII != null) {
                arrayList.add(strLJII);
            }
        }
        return arrayList;
    }

    public static final List<NLETrackSlot> LJFF(NLEModel nLEModel) {
        List<NLETrack> listLJI = LJI(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJI).iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList);
        }
        return arrayList;
    }

    public static final List<NLETrack> LJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final String LJII(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("creation_async_task_id");
        if (extra == null || extra.length() == 0) {
            return null;
        }
        return extra;
    }

    public static final void LJIIIIZZ(NLEModel nLEModel) {
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (nLETrack.getTrackType() == NLETrackType.EFFECT) {
                nLETrack.getSlots().size();
            }
        }
    }

    public static final boolean LJIIJJI(NLETrackSlot nLETrackSlot) {
        String extra;
        if (!nLETrackSlot.hasExtra("ep_async_param") || (extra = nLETrackSlot.getExtra("ep_async_param")) == null || !a0.LJJIIZI(extra, "image2image", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(NLEModel nLEModel) {
        ArrayList arrayList = (ArrayList) LJFF(nLEModel);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (LJIILIIL((NLETrackSlot) it2.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIILIIL(NLETrackSlot nLETrackSlot) {
        C0LSZ c0lszLJJII;
        String strLJII = LJII(nLETrackSlot);
        if (strLJII == null || strLJII.length() == 0) {
            return false;
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        String str = null;
        if (iCreationAsyncTaskManagerLIZ != null && (c0lszLJJII = iCreationAsyncTaskManagerLIZ.LJJII(strLJII)) != null) {
            str = c0lszLJJII.LJ;
        }
        return Intrinsics.LJFF(str, "STARTED");
    }

    public static final void LIZIZ(NLETrackSlot nLETrackSlot, String str) {
        NLENode nLENodeDeepClone;
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return;
        }
        long j = videoFileInfo.duration * LSPassThroughRecordSizeConfig.DEFAULT;
        nLETrackSlot.setDuration(j);
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + j);
        nLETrackSlot.setSpeed(1.0f);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        NLESegment nLESegment = null;
        if (mainSegment != null) {
            nLENodeDeepClone = mainSegment.deepClone();
        } else {
            nLENodeDeepClone = null;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast(nLENodeDeepClone);
        if (nLESegmentVideoDynamicCast != null) {
            nLESegmentVideoDynamicCast.setTimeClipStart(0L);
            nLESegmentVideoDynamicCast.setTimeClipEnd(j);
            nLESegmentVideoDynamicCast.setSpeed(1.0f);
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            resource.setResourceFile(str);
            resource.setResourceType(NLEResType.VIDEO);
            resource.setDuration(j);
            resource.setWidth(videoFileInfo.width);
            resource.setHeight(videoFileInfo.height);
            nLESegmentVideoDynamicCast.setCrop(null);
            nLESegmentVideoDynamicCast.setClip(null);
            nLESegment = nLESegmentVideoDynamicCast;
        }
        nLETrackSlot.setMainSegment(nLESegment);
        C351220Dpo.LIZJ(nLETrackSlot);
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        ArrayList arrayList = new ArrayList();
        for (NLEVideoEffect nLEVideoEffect : videoEffects) {
            if (Intrinsics.LJFF(nLEVideoEffect.getExtra("is_from_ep_magic"), "true")) {
                arrayList.add(nLEVideoEffect);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setExtra("I2V", "I2V");
        }
    }

    public static final void LIZLLL(NLETrackSlot nLETrackSlot, String str) {
        NLENode nLENodeDeepClone;
        NLEResourceNode resource;
        String extra;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            nLENodeDeepClone = mainSegment.deepClone();
        } else {
            nLENodeDeepClone = null;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast(nLENodeDeepClone);
        if (nLESegmentVideoDynamicCast == null || (resource = nLESegmentVideoDynamicCast.getResource()) == null) {
            return;
        }
        String resourceFile = resource.getResourceFile();
        if (resourceFile != null && !a0.LJJJIL(resourceFile) && !Intrinsics.LJFF(resourceFile, str) && ((extra = resource.getExtra("slot_extra_origin_resource_file")) == null || extra.length() == 0)) {
            nLETrackSlot.setExtra("slot_extra_origin_duration", String.valueOf(nLETrackSlot.getDuration()));
            nLESegmentVideoDynamicCast.setExtra("slot_extra_origin_clip_start_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipStart()));
            nLESegmentVideoDynamicCast.setExtra("slot_extra_origin_clip_end_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipEnd()));
            resource.setExtra("slot_extra_origin_resource_file", resourceFile);
            resource.setExtra("slot_extra_origin_resource_width", String.valueOf(resource.getWidth()));
            resource.setExtra("slot_extra_origin_resource_height", String.valueOf(resource.getHeight()));
        }
        NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
        if (resource2 != null) {
            resource2.setResourceFile(str);
            resource2.setResourceType(NLEResType.VIDEO);
        }
        if (!LJIIJJI(nLETrackSlot)) {
            nLESegmentVideoDynamicCast.setCrop(null);
            nLESegmentVideoDynamicCast.setClip(null);
        }
        nLETrackSlot.setMainSegment(nLESegmentVideoDynamicCast);
        if (!LJIIJJI(nLETrackSlot)) {
            C351220Dpo.LIZJ(nLETrackSlot);
        }
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        ArrayList arrayList = new ArrayList();
        for (NLEVideoEffect nLEVideoEffect : videoEffects) {
            if (Intrinsics.LJFF(nLEVideoEffect.getExtra("is_from_ep_magic"), "true")) {
                arrayList.add(nLEVideoEffect);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setExtra("I2V", "I2V");
        }
    }

    public static final NLETrackSlot LJIIIZ(NLEModel nLEModel, String str) {
        Object next;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLIIL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(LJII((NLETrackSlot) next), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (NLETrackSlot) next;
    }

    public static final NLETrackSlot LJIIJ(NLEModel nLEModel, String str) {
        NLETrackSlot next;
        Iterator<NLETrackSlot> it2 = LJFF(nLEModel).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(LJII(next), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final void LJIILJJIL(NLETrackSlot nLETrackSlot, String str) {
        nLETrackSlot.setExtra("creation_async_task_id", str);
    }

    public static final Map LIZ(NLEEditor nLEEditor, List list, Function1 function1) {
        ArrayList<C0LSZ> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (C0LSZ c0lsz : arrayList) {
            NLETrackSlot nLETrackSlotLJIIJ = LJIIJ(nLEEditor.getModel(), c0lsz.LIZ);
            if (nLETrackSlotLJIIJ != null) {
                LIZIZ(nLETrackSlotLJIIJ, c0lsz.LJIILIIL);
                nLETrackSlotLJIIJ.removeExtraWithKey("creation_async_task_id");
                linkedHashMap.put(c0lsz.LIZ, nLETrackSlotLJIIJ);
                z = true;
            }
        }
        if (z) {
            nLEEditor.commit();
        }
        return linkedHashMap;
    }

    public static final Map LIZJ(NLEEditor nLEEditor, List list, Function1 function1) {
        ArrayList<C0LSZ> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0LSZ c0lsz : arrayList) {
            NLETrackSlot nLETrackSlotLJIIJ = LJIIJ(nLEEditor.getModel(), c0lsz.LIZ);
            if (nLETrackSlotLJIIJ != null) {
                LIZLLL(nLETrackSlotLJIIJ, c0lsz.LJIILIIL);
                nLETrackSlotLJIIJ.removeExtraWithKey("creation_async_task_id");
                linkedHashMap.put(c0lsz.LIZ, nLETrackSlotLJIIJ);
            }
        }
        nLEEditor.commit();
        return linkedHashMap;
    }
}

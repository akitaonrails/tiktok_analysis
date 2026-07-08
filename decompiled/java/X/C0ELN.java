package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ELN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEModel nLEModel, final C19A3 c19a3) {
        NLEResourceAV aVFile;
        String resourceFile;
        final ArrayList<String> arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLLJ(nLETrack)) {
                arrayList2.add(nLETrack);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
            while (it3.hasNext()) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it3.next().getMainSegment());
                if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && !arrayList.contains(resourceFile)) {
                    arrayList.add(resourceFile);
                }
            }
        }
        if (arrayList.isEmpty() || !(c19a3 instanceof VideoEditContainerScene)) {
            return;
        }
        for (final String str : arrayList) {
            C2286708xd.LIZIZ(new InterfaceC2286808xe() { // from class: X.09qB
                @Override // X.InterfaceC2286808xe
                public final void LIZ(Object obj) {
                    if (obj != null && (obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
                        Scene scene = c19a3;
                        String str2 = str;
                        List<String> list = arrayList;
                        Activity activity = scene.mActivity;
                        if (activity != null) {
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.messageRes(2131850282);
                            C1390380mHk.LIZ(activity, 1040, creativeToastBuilder);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("video/pip file not exist: ");
                            sbLIZ.append(str2);
                            sbLIZ.append("; total files: ");
                            sbLIZ.append(list);
                            C356530DyN.LIZLLL("video", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }, str, C289360BVu.LIZ());
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        Object next;
        VecNLETrackSlotSPtr sortedSlots;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Edit page onResume -> check volume -> isFromDraft:");
        sbLIZ.append(videoPublishEditModel.creativeModel.draftInfoModel.isDraft);
        sbLIZ.append(", creationId=");
        sbLIZ.append(videoPublishEditModel.getCreationId());
        sbLIZ.append('\n');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Iterator it2 = ((ArrayList) C351220Dpo.LJIJJ(nLEModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack = (NLETrack) next;
                if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack2 = (NLETrack) next;
        if (nLETrack2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("has BGM, volume=");
            sbLIZ2.append(nLETrack2.getVolume());
            sbLIZ2.append('\n');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            int i = 0;
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                int i2 = i + 1;
                if (i >= 0) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        if (nLESegmentVideoDynamicCast.getType() == NLEResType.IMAGE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(i);
                        sbLIZ3.append(": volume=");
                        sbLIZ3.append(nLESegmentVideoDynamicCast.getVolume());
                        sbLIZ3.append(", isImage=");
                        sbLIZ3.append(z);
                        sbLIZ3.append(", path=");
                        sbLIZ3.append(nLESegmentVideoDynamicCast.getAVFile().getResourceFile());
                        sbLIZ3.append('\n');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("video");
            sbLIZ4.append('.');
            sbLIZ4.append("video");
            C201955140j.LJIILL(c563650M8t, C2188811AlT.LIZIZ(sbLIZ4), strLIZIZ);
        }
    }
}

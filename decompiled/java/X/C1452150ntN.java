package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ntN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452150ntN {
    public static String LIZ = "";
    public static boolean LIZIZ = true;
    public static final List<InterfaceC349110DmP> LIZJ = new ArrayList();
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final HashSet<String> LJ = new HashSet<>();
    public static NLENode LJFF;
    public static String LJI;
    public static String LJII;

    public static void LIZLLL() {
        Iterator it2 = ((ArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC349110DmP) it2.next()).LIZ();
        }
        LIZLLL.clear();
        LIZ = "";
        LIZIZ = true;
        ((ArrayList) LIZJ).clear();
    }

    public static boolean LJ() {
        Iterator it2 = ((ArrayList) LIZJ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC349110DmP) it2.next()).LJFF()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        ArrayList<TimeSpeedModelExtension> arrayList;
        if (LJ.contains(videoPublishEditModel.getCreationId())) {
            return true;
        }
        if (C1439180nYS.LIZ(videoPublishEditModel) && LJ() && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null && (arrayList = multiEditVideoRecordData.originalSegments) != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
                if (!C123100dR.LIZ(timeSpeedModelExtension.getCreateId())) {
                    break;
                }
                if (!C13LP.LJJJJ(timeSpeedModelExtension.getCreateId(), LIZLLL)) {
                    LJ.add(videoPublishEditModel.getCreationId());
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (LIZIZ(videoPublishEditModel, null)) {
            for (Object obj : (ArrayList) LIZJ) {
                if (((InterfaceC349110DmP) obj).LJ()) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, Function0 function0) {
        if (C1439180nYS.LIZ(videoPublishEditModel) && Intrinsics.LJFF(LIZ, videoPublishEditModel.getCreationId())) {
            if (function0 != null) {
                function0.invoke();
                return true;
            }
            return true;
        }
        LIZLLL();
        return false;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, Function0 function0) {
        if ((C1439180nYS.LIZ(videoPublishEditModel) || (C295830Bif.LIZ() && !videoPublishEditModel.isCurrentAutoCutMode() && !C1428470nHB.LLIIJI(videoPublishEditModel))) && Intrinsics.LJFF(LIZ, videoPublishEditModel.getCreationId())) {
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        LIZLLL();
        return false;
    }

    public static void LJI(List list, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List list2, int i) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        LIZLLL();
        LIZ = videoPublishEditModel.getCreationId();
        LIZIZ = videoPublishEditModel.creativeModel.editModel.showFirstTimeAnim;
        ArrayList arrayList2 = (ArrayList) LIZJ;
        arrayList2.clear();
        arrayList2.addAll(list);
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.originalSegments) != null) {
            Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String createId = it2.next().getCreateId();
                if (createId != null) {
                    LIZLLL.add(createId);
                }
            }
        }
        Iterator it3 = ((ArrayList) LIZJ).iterator();
        while (it3.hasNext()) {
            ((InterfaceC349110DmP) it3.next()).LJI(videoPublishEditModel, nLEModel, list2, i);
        }
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            List<InterfaceC349110DmP> list3 = LIZJ;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : (ArrayList) list3) {
                if (C347830DkL.LIZ(nLETrack) == ((InterfaceC349110DmP) obj).LIZIZ()) {
                    arrayList3.add(obj);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                ((InterfaceC349110DmP) it4.next()).LJIIL(nLETrack, videoPublishEditModel);
            }
        }
    }
}

package X;

import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0F1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F1Z {
    public static MultiEditVideoRecordData LIZIZ;
    public static C0E48 LIZJ;
    public static VideoPublishEditModel LIZLLL;
    public static MultiEditVideoRecordData LJ;
    public static MultiEditVideoRecordData LJFF;
    public static ArrayList<TimeSpeedModelExtension> LJI;
    public static ArrayList<TimeSpeedModelExtension> LJII;
    public static ArrayList<TimeSpeedModelExtension> LJIIIIZZ;
    public static AVMusic LJIIJ;
    public static int LJIIJJI;
    public static boolean LJIIL;
    public static final C0F1Z LIZ = new C0F1Z();
    public static final ArrayList<TimeSpeedModelExtension> LJIIIZ = new ArrayList<>();

    public static void LJII() {
        C0E48 c0e48;
        ArrayList<TimeSpeedModelExtension> arrayList = LJIIIZ;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = false;
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (LJIIIIZZ == null) {
                LJIIIIZZ = new ArrayList<>();
            }
            ArrayList<TimeSpeedModelExtension> arrayList2 = LJIIIIZZ;
            if (arrayList2 != null && !arrayList2.contains(timeSpeedModelExtension)) {
                ArrayList<TimeSpeedModelExtension> arrayList3 = LJIIIIZZ;
                if (arrayList3 != null) {
                    arrayList3.add(timeSpeedModelExtension);
                }
                z = true;
            }
        }
        if (!z || (c0e48 = LIZJ) == null) {
            return;
        }
        NLETrack nLETrackRn = c0e48.Rn();
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        VideoPublishEditModel videoPublishEditModel = LIZLLL;
        List<MultiEditVideoSegmentRecordData> listLIZLLL = C0F1Y.LIZLLL(nLETrackRn, nLEModelLJI, videoPublishEditModel != null ? videoPublishEditModel.getEditMusicSyncMode() : false);
        C0F1Z c0f1z = LIZ;
        NLETrack nLETrackRn2 = c0e48.Rn();
        c0f1z.getClass();
        ArrayList<TimeSpeedModelExtension> arrayListLIZIZ = LIZIZ(nLETrackRn2, listLIZLLL);
        LJIIIIZZ = arrayListLIZIZ;
        VideoPublishEditModel videoPublishEditModel2 = LIZLLL;
        if (videoPublishEditModel2 != null) {
            videoPublishEditModel2.setVideoSegmentsDesc(C2350709Iz.LIZ(arrayListLIZIZ));
        }
    }

    public static String LIZLLL(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegment nLESegment;
        NLEResourceNode resource;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        NLETrack nLETrack3 = (NLETrack) C13LP.LJJJLL(arrayList);
        if (nLETrack3 == null || (slots = nLETrack3.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) == null || (nLESegment = (NLESegment) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment())) == null || (resource = nLESegment.getResource()) == null) {
            return null;
        }
        return resource.getResourceFile();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension LIZ(com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData r5, com.bytedance.ies.nle.editor_jni.NLETrackSlot r6) {
        /*
            java.lang.String r4 = "extra_identity_key"
            boolean r0 = r6.hasExtra(r4)
            if (r0 == 0) goto L5a
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r0 = X.C0F1Z.LJIIIIZZ
            if (r0 == 0) goto L2f
            java.util.Iterator r3 = r0.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r0 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r0
            java.lang.String r1 = r6.getExtra(r4)
            java.lang.String r0 = r0.getIdentityKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L10
        L2b:
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r2 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r2
            if (r2 != 0) goto L34
        L2f:
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r2 = new com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension
            r2.<init>()
        L34:
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r4 = r2.m318clone()
            long r2 = r5.getEndTime()
            long r0 = r5.getStartTime()
            long r2 = r2 - r0
            float r1 = r5.getVideoSpeed()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L57
            float r1 = (float) r2
            float r0 = r5.getVideoSpeed()
            float r1 = r1 / r0
            int r0 = X.C814420VxA.LIZIZ(r1)
            r4.setDuration(r0)
        L57:
            return r4
        L58:
            r2 = 0
            goto L2b
        L5a:
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r2 = new com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension
            r2.<init>()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F1Z.LIZ(com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData, com.bytedance.ies.nle.editor_jni.NLETrackSlot):com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension");
    }

    public static ArrayList LIZIZ(NLETrack nLETrack, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (Object obj : (ArrayList) C13LP.LJJJJLI(nLETrack.getSortedSlots())) {
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                if (i < list.size()) {
                    C0F1Z c0f1z = LIZ;
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ListProtector.get(list, i);
                    c0f1z.getClass();
                    arrayList.add(LIZ(multiEditVideoSegmentRecordData, nLETrackSlot));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static void LJ(C0E48 c0e48, RetakeVideoContext retakeVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        if (c0e48 == null || (videoPublishEditModel = LIZLLL) == null) {
            return;
        }
        if (videoPublishEditModel.isStitchMode()) {
            retakeVideoContext.stitchParams = videoPublishEditModel.getStitchParams();
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        videoPublishEditModel.isFromRestoreRecover();
        c363500EMy.getClass();
        EditorProDraftModel editorProDraftModel = videoPublishEditModel.creativeModel.editorProDraftModel;
        editorProDraftModel.nleData = null;
        editorProDraftModel.nleDataPath = null;
        editorProDraftModel.nleCreativeResPaths.clear();
        editorProDraftModel.nlePublicResPaths.clear();
        SurfaceView surfaceViewLJIJJLI = c0e48.LJIJJLI();
        if (surfaceViewLJIJJLI != null) {
            C786410Ut5.LLIIII(surfaceViewLJIJJLI, 8);
            C1403010mc7.LIZ.getCommerceService();
            C1465270oEX.LIZ();
            if (C0EN2.LIZ(videoPublishEditModel)) {
                C786410Ut5.Nb(surfaceViewLJIJJLI, 1.0f);
                C786410Ut5.oc(surfaceViewLJIJJLI, 1.0f);
                C786410Ut5.Ic(surfaceViewLJIJJLI, 0.0f);
                C786410Ut5.dd(surfaceViewLJIJJLI, 0.0f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r4 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext LIZJ(X.C0E48 r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F1Z.LIZJ(X.0E48, boolean, boolean):com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext");
    }

    public static void LJI(MultiEditVideoRecordData multiEditVideoRecordData, NLEModel nLEModel, boolean z) {
        String str;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        boolean z4;
        String strLIZLLL;
        float f;
        float f2;
        int i;
        int iLIZIZ;
        MultiEditVideoRecordData multiEditVideoRecordData2 = LIZIZ;
        String str4 = null;
        if (multiEditVideoRecordData2 != null) {
            str = multiEditVideoRecordData2.concatVideo;
        } else {
            str = null;
        }
        multiEditVideoRecordData.concatVideo = str;
        if (multiEditVideoRecordData2 != null) {
            str2 = multiEditVideoRecordData2.concatAudio;
        } else {
            str2 = null;
        }
        multiEditVideoRecordData.concatAudio = str2;
        if (multiEditVideoRecordData2 != null) {
            str3 = multiEditVideoRecordData2.curRecordingDir;
        } else {
            str3 = null;
        }
        multiEditVideoRecordData.curRecordingDir = str3;
        if (multiEditVideoRecordData2 != null) {
            z2 = multiEditVideoRecordData2.hasRetake;
        } else {
            z2 = false;
        }
        multiEditVideoRecordData.hasRetake = z2;
        if (multiEditVideoRecordData2 != null) {
            str4 = multiEditVideoRecordData2.coverPath;
        }
        multiEditVideoRecordData.coverPath = str4;
        if (multiEditVideoRecordData2 != null) {
            z3 = multiEditVideoRecordData2.isSoundLoop;
        } else {
            z3 = false;
        }
        multiEditVideoRecordData.isSoundLoop = z3;
        if (multiEditVideoRecordData2 != null) {
            z4 = multiEditVideoRecordData2.useMusic;
        } else {
            z4 = false;
        }
        multiEditVideoRecordData.useMusic = z4;
        if (!z) {
            strLIZLLL = LIZLLL(nLEModel);
        } else {
            strLIZLLL = "";
        }
        multiEditVideoRecordData.musicPath = strLIZLLL;
        MultiEditVideoRecordData multiEditVideoRecordData3 = LIZIZ;
        float f3 = 0.0f;
        if (multiEditVideoRecordData3 != null) {
            f = multiEditVideoRecordData3.leftSlideX;
        } else {
            f = 0.0f;
        }
        multiEditVideoRecordData.leftSlideX = f;
        if (multiEditVideoRecordData3 != null) {
            f3 = multiEditVideoRecordData3.rightSlideX;
        }
        multiEditVideoRecordData.rightSlideX = f3;
        float f4 = 1.0f;
        if (multiEditVideoRecordData3 != null) {
            f2 = multiEditVideoRecordData3.originVolume;
        } else {
            f2 = 1.0f;
        }
        multiEditVideoRecordData.originVolume = f2;
        if (multiEditVideoRecordData3 != null) {
            f4 = multiEditVideoRecordData3.musicVolume;
        }
        multiEditVideoRecordData.musicVolume = f4;
        if (multiEditVideoRecordData3 != null) {
            i = multiEditVideoRecordData3.preVideoDuration;
        } else {
            i = 0;
        }
        multiEditVideoRecordData.preVideoDuration = i;
        if (!z) {
            if (multiEditVideoRecordData3 != null) {
                iLIZIZ = multiEditVideoRecordData3.musicDuration;
                if (iLIZIZ <= 0) {
                }
            } else {
                iLIZIZ = 0;
            }
            String strLIZLLL2 = LIZLLL(nLEModel);
            if (strLIZLLL2 != null) {
                iLIZIZ = C141Q.LIZIZ(-1, strLIZLLL2);
            }
        } else {
            iLIZIZ = 0;
        }
        multiEditVideoRecordData.musicDuration = iLIZIZ;
        if (z) {
            multiEditVideoRecordData.useMusic = false;
            multiEditVideoRecordData.isSoundLoop = false;
        }
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z, boolean z2) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        VideoPublishEditModel videoPublishEditModel2;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        ArrayList<TimeSpeedModelExtension> arrayList3;
        LIZJ = c0e48;
        LIZLLL = videoPublishEditModel;
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.curMultiEditVideoRecordData != null && !C1256140inE.LIZ(multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            LIZIZ = multiEditVideoRecordData.curMultiEditVideoRecordData;
            if (((Boolean) C273640Any.LIZ.getValue()).booleanValue()) {
                LJIIIIZZ = multiEditVideoRecordData.editSegments;
            }
            ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoRecordData.originalSegments;
            if (arrayList4 != null) {
                LJI = arrayList4;
                ArrayList<TimeSpeedModelExtension> arrayList5 = multiEditVideoRecordData.editSegments;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList<>(arrayList4);
                }
                LJIIIIZZ = arrayList5;
                ArrayList<TimeSpeedModelExtension> arrayList6 = multiEditVideoRecordData.restoreSegments;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList<>(LJIIIIZZ);
                }
                LJII = arrayList6;
            }
            if (z2 && (((arrayList2 = multiEditVideoRecordData.originalSegments) == null || arrayList2.isEmpty()) && (arrayList3 = multiEditVideoRecordData.editSegments) != null)) {
                LJIIIIZZ = arrayList3;
                ArrayList<TimeSpeedModelExtension> arrayList7 = multiEditVideoRecordData.restoreSegments;
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList<>(LJIIIIZZ);
                }
                LJII = arrayList7;
            }
            LJII();
            if (z && (arrayList = LJIIIIZZ) != null && (videoPublishEditModel2 = LIZLLL) != null) {
                videoPublishEditModel2.setVideoSegmentsDesc(C2350709Iz.LIZ(arrayList));
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoRecordData.curMultiEditVideoRecordData;
            LIZIZ = multiEditVideoRecordData2;
            MultiEditVideoRecordData multiEditVideoRecordData3 = multiEditVideoRecordData.restoreMultiEditVideoRecordData;
            if (multiEditVideoRecordData3 == null) {
                LJ = C383300F1c.LIZIZ(multiEditVideoRecordData2, null);
            } else {
                LJ = multiEditVideoRecordData3;
            }
            LJFF = C383300F1c.LIZIZ(LIZIZ, null);
            LJIIJ = multiEditVideoRecordData.recordMusic;
            LJIIJJI = multiEditVideoRecordData.originalMusicStart;
            LJIIL = true;
        }
    }
}

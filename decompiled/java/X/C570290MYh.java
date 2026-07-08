package X;

import Y.ACallableS21S1000000_3;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessException;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResult;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResults;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0MYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570290MYh {
    public static final DraftSavePreProcessResults LIZ(AwemeDraft awemeDraft, boolean z) {
        String str;
        EditPreviewInfo editPreviewInfoLJ;
        String strLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int i = 2;
        if (!z && awemeDraft.LJJJJIZL.isFastImport && !awemeDraft.LJIILLIIL() && (editPreviewInfoLJ = C0MZ9.LJ(awemeDraft, true)) != null) {
            CreativeInfo creativeInfoLIZIZ = awemeDraft.LIZIZ();
            ArrayList arrayList2 = new ArrayList();
            int size = editPreviewInfoLJ.getVideoList().size();
            int i2 = 0;
            while (i2 < size) {
                EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(editPreviewInfoLJ.getVideoList(), i2);
                if (C570490MZb.LIZLLL(editVideoSegment.getVideoPath()) && editVideoSegment.getVideoCutInfo() != null) {
                    int start = (int) editVideoSegment.getVideoCutInfo().getStart();
                    int end = (int) editVideoSegment.getVideoCutInfo().getEnd();
                    if (editVideoSegment.getVideoFileInfo().getDuration() - ((long) (end - start)) > Mp4ScreenVideoLoadTimeout.CONTROL) {
                        int[] iArr = new int[i];
                        iArr[0] = start;
                        iArr[1] = end;
                        if (C298240BmY.LIZ()) {
                            strLIZ = C354070DuP.LIZIZ(creativeInfoLIZIZ);
                        } else {
                            strLIZ = C354070DuP.LIZ(creativeInfoLIZIZ);
                        }
                        C0VSJ c0vsj = new C0VSJ(strLIZ);
                        if (c0vsj.exists()) {
                            c0vsj.delete();
                        }
                        C570490MZb.LJI(c0vsj);
                        String videoPath = editVideoSegment.getVideoPath();
                        int[] iArr2 = new int[i];
                        iArr2[0] = start;
                        iArr2[1] = end;
                        int iNativeTrimFile = TEVideoUtils.nativeTrimFile(videoPath, strLIZ, iArr2, iArr);
                        if (iNativeTrimFile != 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("VEUtils.trimToDraft invoke ; retCode : ");
                            sbLIZ.append(iNativeTrimFile);
                            arrayList2.add(new DraftSavePreProcessResult(1, new DraftSavePreProcessException(iNativeTrimFile - 20000, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)))));
                            if (C298240BmY.LIZ()) {
                                C15O7.LIZJ(new ACallableS21S1000000_3(strLIZ, 4));
                            }
                        } else {
                            List<EditVideoSegment> videoList = editPreviewInfoLJ.getVideoList();
                            String audioPath = editVideoSegment.getAudioPath();
                            VideoFileInfo videoFileInfo = editVideoSegment.getVideoFileInfo();
                            EditVideoSegment editVideoSegment2 = new EditVideoSegment(strLIZ, audioPath, videoFileInfo.copy(videoFileInfo.width, videoFileInfo.height, videoFileInfo.duration, videoFileInfo.fps, videoFileInfo.bitrate, videoFileInfo.codecType, videoFileInfo.keyFrameCount, videoFileInfo.gop, videoFileInfo.fpsFloat));
                            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                            if (videoCutInfo != null) {
                                editVideoSegment2.setVideoCutInfo(new VideoCutInfo(iArr[0], iArr[1], videoCutInfo.getSpeed(), videoCutInfo.getRotate()));
                            }
                            ListProtector.set(videoList, i2, editVideoSegment2);
                        }
                    }
                }
                i2++;
                i = 2;
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        if (C301570Brv.LIZ() || C0BYK.LIZ()) {
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
            if (aVDraftExtras.creationMode == 2 && aVDraftExtras.imageAlbumData == null && ((str = awemeDraft.LIZ.text2ImageModel.text) == null || str.length() == 0)) {
                arrayList3.add(new DraftSavePreProcessResult(0, new DraftSavePreProcessException(-513, new IllegalStateException("Image Mode album data is null"))));
            }
        }
        C0MZ0.LJIIIIZZ(awemeDraft);
        C365970EWl c365970EWl = C365970EWl.LIZ;
        EditorProDraftModel editorProDraftModel = awemeDraft.LIZ.editorProDraftModel;
        synchronized (c365970EWl) {
            String str2 = editorProDraftModel.nleData;
            if (str2 != null && str2.length() != 0) {
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                if (nLEEditorLIZ.restore(str2) != NLEError.SUCCESS) {
                    editorProDraftModel.nleData = null;
                } else {
                    C201955140j.LJIILJJIL(C0MAY.LIZIZ, "EditorProDraftHelper fillEditorProDraftResPath");
                    editorProDraftModel.nleCreativeResPaths.clear();
                    editorProDraftModel.nlePublicResPaths.clear();
                    NLEModel model = nLEEditorLIZ.getModel();
                    C365970EWl.LJ(model, editorProDraftModel);
                    C365970EWl.LJI(model, editorProDraftModel);
                    C365970EWl.LIZIZ(model, editorProDraftModel);
                    C365970EWl.LIZLLL(model, editorProDraftModel);
                    Iterator<NLETrackSlot> it2 = model.getMainTrack().getSlots().iterator();
                    while (it2.hasNext()) {
                        NLESegmentTransition endTransition = it2.next().getEndTransition();
                        if (endTransition != null) {
                            String resourceFile = endTransition.getEffectSDKTransition().getResourceFile();
                            if (!TextUtils.isEmpty(resourceFile)) {
                                editorProDraftModel.nlePublicResPaths.add(resourceFile);
                            }
                        }
                    }
                    C365970EWl.LIZJ(model, editorProDraftModel, nLEEditorLIZ);
                    C365970EWl.LJII(model, editorProDraftModel);
                    C365970EWl.LJIIIIZZ(model, editorProDraftModel);
                    C365970EWl.LJFF(model, editorProDraftModel);
                }
            }
        }
        return new DraftSavePreProcessResults(System.currentTimeMillis() - jCurrentTimeMillis, arrayList3, arrayList);
    }
}

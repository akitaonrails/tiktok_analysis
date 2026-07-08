package X;

import Y.AfS143S0200000_7;
import Y.AkS472S0100000_8;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.DraftMusicPermissionCheckApi;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ma9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570830Ma9 {
    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getMCurMusicLength() <= 0) {
            return false;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ() && ((!C1428470nHB.LJJZZI(videoPublishEditModel) || !C0EM4.LIZ()) && videoPublishEditModel.getVideoLength() >= videoPublishEditModel.getMCurMusicLength())) {
            return false;
        }
        return true;
    }

    public static final String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.promoId;
        }
        return null;
    }

    public static final String LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.recallReason;
        }
        return null;
    }

    public static final String LJ(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        String str;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel == null || (musicBuzModel = creativeModel.musicBuzModel) == null || (str = musicBuzModel.recommendSourceFrom) == null) {
            return "other_music";
        }
        return str;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.hasMusic()) {
            return false;
        }
        int i = videoPublishEditModel.creativeModel.musicBuzModel.musicType;
        if (i != 0 && i != 3 && i != 6) {
            return false;
        }
        return true;
    }

    public static final int LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        List<C347480Djm> listLIZ;
        int iHashCode;
        Object objValueOf;
        long start;
        C201955140j.LIZJ(C830690WiJ.LIZIZ, "AudioCopyrightDetect -> materialHash() start");
        Map mapLJ = videoPublishEditModel.creativeModel.nleInfoModel.copyResMap;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Set<Map.Entry> setEntrySet = mapLJ.entrySet();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        int i = 0;
        int iY2 = 0;
        for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AudioCopyrightDetect -> materialHash() -> segment.videoPath = ");
            sbLIZ.append(editVideoSegment.getVideoPath());
            C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
            if (linkedHashMap.containsKey(editVideoSegment.getVideoPath())) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AudioCopyrightDetect -> materialHash() -> HashCode = ");
                sbLIZ2.append((String) mapLJ.get(editVideoSegment.getVideoPath()));
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ2));
                Object obj = linkedHashMap.get(editVideoSegment.getVideoPath());
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AudioCopyrightDetect -> materialHash() -> HashCode = ");
                sbLIZ3.append(editVideoSegment.getVideoPath());
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ3));
                iHashCode = editVideoSegment.getVideoPath().hashCode();
            }
            int i2 = iY2 + iHashCode;
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                objValueOf = Float.valueOf(videoCutInfo.getSpeed());
            } else {
                objValueOf = 0;
            }
            int iHashCode2 = i2 + objValueOf.hashCode();
            VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
            long end = 0;
            if (videoCutInfo2 != null) {
                start = videoCutInfo2.getStart();
            } else {
                start = 0;
            }
            int iY22 = iHashCode2 + C786410Ut5.Y2(start);
            VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                end = videoCutInfo3.getEnd();
            }
            iY2 = iY22 + C786410Ut5.Y2(end);
        }
        if (nLEModel == null) {
            String nleData = videoPublishEditModel.getNleData();
            if (nleData != null && nleData.length() != 0) {
                if (C350300DoK.LIZ() && !videoPublishEditModel.getNleDataChange() && videoPublishEditModel.getNleModel() != null) {
                    listLIZ = C346720DiY.LIZ(videoPublishEditModel.getNleModel());
                } else {
                    NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                    nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
                    if (C350300DoK.LIZ()) {
                        videoPublishEditModel.setNleModel(nLEEditorLIZ.getModel());
                        videoPublishEditModel.setNleDataChange(false);
                    }
                    listLIZ = C346720DiY.LIZ(nLEEditorLIZ.getModel());
                }
            } else {
                listLIZ = new ArrayList();
            }
        } else {
            listLIZ = C346720DiY.LIZ(nLEModel);
        }
        for (C347480Djm c347480Djm : listLIZ) {
            iY2 += C786410Ut5.Y2(c347480Djm.LIZIZ + c347480Djm.LIZJ + c347480Djm.LJ + c347480Djm.LIZLLL);
        }
        if (videoPublishEditModel.getVoiceVolume() > 0.0f) {
            i = 1;
        }
        int i3 = iY2 + i;
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            return i3 + (veAudioRecorderParam.getHasOriginalSound() ? 1 : 0) + (veAudioRecorderParam.getNeedOriginalSound() ? 1 : 0);
        }
        return i3;
    }

    public static final void LJII(List list, Function1 function1) {
        ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AVMusic) it2.next()).getMusicId());
        }
        C570820Ma8 c570820Ma8 = new C570820Ma8();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (String str : arrayList) {
            DraftMusicPermissionCheckApi.PermissionCheckEntity permissionCheckEntity = new DraftMusicPermissionCheckApi.PermissionCheckEntity();
            permissionCheckEntity.setIdType(3);
            permissionCheckEntity.setId(str);
            permissionCheckEntity.setCheckType(3);
            arrayList2.add(permissionCheckEntity);
        }
        c570820Ma8.LIZ = arrayList2;
        ((DraftMusicPermissionCheckApi.CheckPermissionRequest) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, DraftMusicPermissionCheckApi.CheckPermissionRequest.class)).checkPermission(c570820Ma8).LJL(C11S5.LIZ()).LJJJJZI(new AkS472S0100000_8(c570820Ma8, 0)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(function1, 103), new AfS143S0200000_7((Object) arrayList, (EmoteModel) function1, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 13));
    }

    public static final boolean LIZ(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        int iLIZIZ;
        if (TextUtils.isEmpty(str) || videoPublishEditModel.isDuet() || videoPublishEditModel.isStickPointMode() || (iLIZIZ = C141Q.LIZIZ(i, str)) <= 0) {
            return false;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ() && videoPublishEditModel.getVideoLength() >= iLIZIZ) {
            return false;
        }
        return true;
    }
}

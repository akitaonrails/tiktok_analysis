package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Dwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355490Dwh {
    public static final void LIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Object next;
        String str;
        NLETrackSlot next2;
        String extra;
        int duration;
        int duration2;
        NLEModel nLEModelLJJJZ = nLEModel;
        boolean zHasExtendMusic = videoPublishEditModel.hasExtendMusic();
        List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            MusicObject musicObject = ((MusicBuzModel) it2.next()).music;
            if (musicObject != null) {
                next = MusicBeanUtilKt.getMusicId(musicObject);
            }
            arrayList.add(next);
        }
        if (zHasExtendMusic && !C1416310mxZ.LJJJJLI(videoPublishEditModel)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_multi_music", str);
        c0lab.LJ("music_id_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        if (nLEModelLJJJZ == null) {
            nLEModelLJJJZ = C1416310mxZ.LJJJZ(videoPublishEditModel);
        }
        if (nLEModelLJJJZ == null) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null) {
                c0lab.LIZ(aVMusicExtractAVMusic.getDuration(), "all_music_duration");
                c0lab.LIZ(1, "music_clip_cnt");
                c0lab.LJ("music_duration_list", C13LP.LJJLIIIJ(Collections.singletonList(Integer.valueOf(aVMusicExtractAVMusic.getDuration())), ",", null, null, 0, null, null, 62));
            }
            if (C349930Dnj.LIZ(videoPublishEditModel, null, false) && videoPublishEditModel.hasExtendMusic()) {
                Iterator it3 = ((ArrayList) C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel)).iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic((MusicBuzModel) next);
                        if (aVMusicExtractAVMusic2 != null) {
                            duration = aVMusicExtractAVMusic2.getDuration();
                        } else {
                            duration = 0;
                        }
                        do {
                            Object next3 = it3.next();
                            AVMusic aVMusicExtractAVMusic3 = MusicBeanUtilKt.extractAVMusic((MusicBuzModel) next3);
                            if (aVMusicExtractAVMusic3 != null) {
                                duration2 = aVMusicExtractAVMusic3.getDuration();
                            } else {
                                duration2 = 0;
                            }
                            if (duration < duration2) {
                                next = next3;
                                duration = duration2;
                            }
                        } while (it3.hasNext());
                    }
                }
                MusicBuzModel musicBuzModel = (MusicBuzModel) next;
                if (C1416310mxZ.LJJJJLI(videoPublishEditModel)) {
                    if (musicBuzModel != null && C123100dR.LIZ(C1429680nJ8.LIZJ(musicBuzModel))) {
                        c0lab.LJ("music_id", C1429680nJ8.LIZJ(musicBuzModel));
                        return;
                    }
                    return;
                }
                if (musicBuzModel == null) {
                    return;
                }
                c0lab.LJ("music_id", C1429680nJ8.LIZJ(musicBuzModel));
                return;
            }
            return;
        }
        NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModelLJJJZ);
        if (nLETrackLIZLLL == null) {
            return;
        }
        VecNLETrackSlotSPtr sortedSlots = nLETrackLIZLLL.getSortedSlots();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrackSlot nLETrackSlot : sortedSlots) {
            if (nLETrackSlot.getEnable()) {
                arrayList2.add(nLETrackSlot);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(((NLETimeSpaceNode) it4.next()).getDuration())));
        }
        long jLJZL = C13LP.LJZL(arrayList3);
        int size = arrayList3.size();
        c0lab.LIZIZ(jLJZL, "all_music_duration");
        c0lab.LIZ(size, "music_clip_cnt");
        c0lab.LJ("music_duration_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
        if (C349930Dnj.LIZ(videoPublishEditModel, nLEModelLJJJZ, false) && videoPublishEditModel.hasExtendMusic()) {
            Iterator<NLETrackSlot> it5 = sortedSlots.iterator();
            if (!it5.hasNext()) {
                next2 = null;
            } else {
                next2 = it5.next();
                if (it5.hasNext()) {
                    long duration3 = next2.getDuration();
                    do {
                        NLETrackSlot next4 = it5.next();
                        long duration4 = next4.getDuration();
                        if (duration3 < duration4) {
                            next2 = next4;
                            duration3 = duration4;
                        }
                    } while (it5.hasNext());
                }
            }
            NLETrackSlot nLETrackSlot2 = next2;
            if (nLETrackSlot2 != null) {
                extra = nLETrackSlot2.getExtra("ep_audio_music_id");
            } else {
                extra = null;
            }
            if (C1416310mxZ.LJJJJLI(videoPublishEditModel)) {
                if (C123100dR.LIZ(extra)) {
                    c0lab.LJ("music_id", extra);
                }
            } else {
                if (extra == null) {
                    return;
                }
                c0lab.LJ("music_id", extra);
            }
        }
    }
}

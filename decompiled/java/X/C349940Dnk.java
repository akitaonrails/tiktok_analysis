package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349940Dnk {
    public static final Pair<Integer, Integer> LIZJ(NLEModel nLEModel) {
        int size = 0;
        int size2 = 0;
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (!C351220Dpo.LLILLL(nLETrack) && !C351220Dpo.LLJILLL(nLETrack)) {
                if (C351220Dpo.LLLILZLLLI(nLETrack) || C351220Dpo.LLILL(nLETrack)) {
                    size2 += nLETrack.getSlots().size();
                }
            } else {
                size += nLETrack.getSlots().size();
            }
        }
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(size2));
    }

    public static boolean LIZ(C0E48 c0e48, VideoPublishEditModel videoPublishEditModel) {
        boolean zLIZIZ = true;
        if (videoPublishEditModel == null || !C1416310mxZ.LJJJJZI(videoPublishEditModel)) {
            zLIZIZ = C349930Dnj.LIZIZ(videoPublishEditModel, false);
            if (c0e48 != null && !zLIZIZ) {
                return C349930Dnj.LJII(C350870DpF.LJI(c0e48));
            }
        }
        return zLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.services.edit.MultiMusicEditStruct LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel r21, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r22) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349940Dnk.LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel):com.ss.android.ugc.aweme.services.edit.MultiMusicEditStruct");
    }

    public static final Integer LIZLLL(long j, C0E48 c0e48) {
        NLETrackSlot next;
        NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48);
        if (nLETrackLIZLLL == null) {
            return null;
        }
        VecNLETrackSlotSPtr sortedSlots = nLETrackLIZLLL.getSortedSlots();
        int i = 0;
        if (sortedSlots != null && !sortedSlots.isEmpty()) {
            Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (j >= next.getStartTime() && j < next.getEndTime()) {
                        break;
                    }
                } else {
                    while (i < sortedSlots.size()) {
                        if (j < sortedSlots.get(i).getStartTime()) {
                            if (i > 0) {
                                next = sortedSlots.get(i - 1);
                            } else {
                                next = sortedSlots.get(i);
                            }
                        } else if (j >= sortedSlots.get(i).getEndTime()) {
                            if (i == sortedSlots.size() - 1) {
                                next = sortedSlots.get(i);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        } else {
            next = null;
            if (nLETrackLIZLLL == null) {
                return null;
            }
        }
        return Integer.valueOf(nLETrackLIZLLL.getSlotIndex(next));
    }

    public static final boolean LJ(NLEModel nLEModel, Function1<? super NLETrackSlot, Boolean> function1) {
        VecNLETrackSlotSPtr slots;
        NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModel);
        if (nLETrackLIZLLL != null && (slots = nLETrackLIZLLL.getSlots()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                if (function1.invoke(nLETrackSlot).booleanValue()) {
                    arrayList.add(nLETrackSlot);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        if (C349930Dnj.LIZ(videoPublishEditModel, null, false) && videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(musicBuzModel);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                C1456960o18 c1456960o18 = ((MusicBuzModel) obj).stripMusicModel;
                if (c1456960o18 == null || !c1456960o18.getStrippedMusic()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (z) {
                    return true;
                }
                if ((arrayList.size() != 1 || Intrinsics.LJFF(C1429680nJ8.LIZJ((MusicBuzModel) C13LP.LJJJLL(arrayList)), str)) && arrayList.size() <= 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}

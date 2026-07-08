package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0EC2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EC2 {
    public static final long LIZ = TimeUnit.SECONDS.toMicros(1);
    public static final /* synthetic */ int LIZIZ = 0;

    public static long LIZJ(C0E48 c0e48) {
        VecNLETrackSlotSPtr sortedSlots;
        long maxEnd = 0;
        if (c0e48 == null) {
            return 0L;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModelLJI);
        if (nLETrackLIZLLL != null) {
            sortedSlots = nLETrackLIZLLL.getSortedSlots();
        } else {
            sortedSlots = null;
        }
        NLETrack mainTrack = nLEModelLJI.getMainTrack();
        if (mainTrack != null) {
            maxEnd = mainTrack.getMaxEnd();
        }
        boolean z = false;
        if (sortedSlots != null && !sortedSlots.isEmpty()) {
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(sortedSlots);
            if (nLETimeSpaceNode == null) {
                return C351220Dpo.LLLLLLL(maxEnd);
            }
            long endTime = maxEnd - nLETimeSpaceNode.getEndTime();
            long j = LIZ;
            if (endTime >= j) {
                return C351220Dpo.LLLLLLL(endTime);
            }
            if (Math.abs(endTime) <= 1000) {
                z = true;
            }
            long duration = nLETimeSpaceNode.getDuration();
            if (sortedSlots.size() == 1 && z && duration > ((long) 5) * j) {
                return C351220Dpo.LLLLLLL((long) (duration * 0.2f));
            }
            return C351220Dpo.LLLLLLL(j);
        }
        return C351220Dpo.LLLLLLL(maxEnd);
    }

    public static long LIZLLL(C0E48 c0e48) {
        NLEModel nLEModelLJI;
        long maxEnd;
        NLETimeSpaceNode nLETimeSpaceNode;
        VecNLETrackSlotSPtr sortedSlots = null;
        if (c0e48 != null) {
            nLEModelLJI = C350870DpF.LJI(c0e48);
        } else {
            nLEModelLJI = null;
        }
        if (nLEModelLJI == null) {
            return 0L;
        }
        NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModelLJI);
        if (nLETrackLIZLLL != null) {
            sortedSlots = nLETrackLIZLLL.getSortedSlots();
        }
        NLETrack mainTrack = nLEModelLJI.getMainTrack();
        if (mainTrack != null) {
            maxEnd = mainTrack.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        boolean z = false;
        if (sortedSlots == null || sortedSlots.isEmpty() || (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(sortedSlots)) == null) {
            return 0L;
        }
        long endTime = maxEnd - nLETimeSpaceNode.getEndTime();
        long j = LIZ;
        if (endTime >= j) {
            return nLETimeSpaceNode.getEndTime();
        }
        if (Math.abs(endTime) <= 1000) {
            z = true;
        }
        long duration = nLETimeSpaceNode.getDuration();
        if (sortedSlots.size() == 1 && z && duration > ((long) 5) * j) {
            return (long) (duration * 0.8f);
        }
        return maxEnd - j;
    }

    public static void LIZ(int i, List list) {
        if (i >= 0 && i < list.size() - 1) {
            C349420Dmu c349420Dmu = (C349420Dmu) ListProtector.get(list, i);
            C349420Dmu c349420Dmu2 = (C349420Dmu) ListProtector.get(list, i + 1);
            long j = c349420Dmu.LIZLLL;
            long j2 = c349420Dmu2.LIZJ;
            if (j > j2) {
                long j3 = j - j2;
                long j4 = j - c349420Dmu.LIZJ;
                long j5 = LIZ;
                if (j4 > j5 + j3) {
                    c349420Dmu.LIZLLL = j2;
                } else if (j4 > j5) {
                    if (c349420Dmu.LIZIZ) {
                        j5 = j4 - j3;
                    }
                    c349420Dmu.LIZLLL = j2;
                    c349420Dmu.LIZJ = j2 - j5;
                } else if (j4 > j3) {
                    if (c349420Dmu.LIZIZ) {
                        j4 -= j3;
                    }
                    c349420Dmu.LIZLLL = j2;
                    c349420Dmu.LIZJ = j2 - j4;
                } else if (c349420Dmu.LIZIZ) {
                    c349420Dmu.LIZLLL = j2;
                    c349420Dmu.LIZJ = j2;
                } else {
                    c349420Dmu.LIZLLL = j2;
                    c349420Dmu.LIZJ = j2 - j4;
                }
            }
            LIZ(i - 1, list);
        }
    }

    public static C0EC3 LIZIZ(C0E48 c0e48, MusicBuzModel musicBuzModel) {
        long maxEnd;
        MusicBuzModel musicBuzModel2;
        MusicObject musicObject;
        if (c0e48 == null) {
            return C0EC3.UNEXPECTED;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        NLETrack nLETrackLIZLLL = C349930Dnj.LIZLLL(nLEModelLJI);
        if (nLETrackLIZLLL == null) {
            return C0EC3.SUCCESS;
        }
        VecNLETrackSlotSPtr sortedSlots = nLETrackLIZLLL.getSortedSlots();
        if (sortedSlots == null) {
            return C0EC3.SUCCESS;
        }
        if (sortedSlots.size() >= 20) {
            return C0EC3.COUNT_LIMIT;
        }
        NLETrack mainTrack = nLEModelLJI.getMainTrack();
        if (mainTrack != null) {
            maxEnd = mainTrack.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        if (LIZ * ((long) (sortedSlots.size() + 1)) > maxEnd) {
            return C0EC3.TIME_LIMIT;
        }
        if (musicBuzModel != null) {
            List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(musicBuzModel);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                C1456960o18 c1456960o18 = ((MusicBuzModel) obj).stripMusicModel;
                if (c1456960o18 == null || !c1456960o18.getStrippedMusic()) {
                    arrayList.add(obj);
                }
            }
            if ((!arrayList.isEmpty()) && (musicBuzModel2 = (MusicBuzModel) C13LP.LJJLIIIJL(arrayList)) != null && (musicObject = musicBuzModel2.music) != null && !musicObject.canBeStitched) {
                return C0EC3.CAN_NOT_BE_STITCHED;
            }
        }
        return C0EC3.SUCCESS;
    }
}

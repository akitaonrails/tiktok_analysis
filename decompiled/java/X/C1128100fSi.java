package X;

import com.bytedance.android.livesdk.gift.model.GiftChallengeProgress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128100fSi {
    public static final /* synthetic */ int LIZ = 0;

    public static C1128160fSo LIZ(GiftChallengeProgress giftChallengeProgress) {
        long j = giftChallengeProgress.currentPoints;
        Iterator<GiftChallengeProgress.StageData> it2 = giftChallengeProgress.stageData.iterator();
        long j2 = 0;
        int i = 0;
        long j3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            GiftChallengeProgress.StageData next = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                GiftChallengeProgress.StageData stageData = next;
                long j4 = stageData.totalPoints;
                j -= (long) ((int) j4);
                j3 += j4;
                if (j < 0) {
                    j2 = stageData.giftId;
                    break;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new C1128160fSo((int) giftChallengeProgress.currentPoints, new C1128190fSr((int) Math.abs(j), j2), (int) j3);
    }

    public static boolean LIZIZ(long j, GiftChallengeProgress giftChallengeProgress) {
        List<GiftChallengeProgress.StageData> list;
        if (giftChallengeProgress != null && (list = giftChallengeProgress.stageData) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<GiftChallengeProgress.StageData> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().giftId));
            }
            if (arrayList.contains(Long.valueOf(j))) {
                return true;
            }
            return false;
        }
        return false;
    }
}

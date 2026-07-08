package Y;

import X.C20085613iQ;
import X.C948400ams;
import X.C953770avX;
import X.C954460awe;
import X.C981520beI;
import X.C982390bfh;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.playing.TakeStagePlayingManageAudienceFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.punish.TakeStagePunishManageFragment;
import com.bytedance.android.live.liveinteract.competition.takestage.connection.settlement.TakeStageSettlementManageFragment;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes16.dex */
public class AComparatorS514S0100000_15 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, t, t2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, t, t2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, t, t2);
            case 14:
                return compare$14(this, t, t2);
            case 15:
                return compare$15(this, t, t2);
            case 16:
                return compare$16(this, t, t2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS514S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        long j;
        C982390bfh c982390bfhPR = ((TakeStagePlayingManageAudienceFragment) aComparatorS514S0100000_15.l0).PR(((C954460awe) obj).LJ);
        long j2 = 0;
        if (c982390bfhPR != null) {
            j = c982390bfhPR.LIZJ;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        C982390bfh c982390bfhPR2 = ((TakeStagePlayingManageAudienceFragment) aComparatorS514S0100000_15.l0).PR(((C954460awe) obj2).LJ);
        if (c982390bfhPR2 != null) {
            j2 = c982390bfhPR2.LIZJ;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$1(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        long j;
        C982390bfh c982390bfhPR = ((TakeStagePunishManageFragment) aComparatorS514S0100000_15.l0).PR(((C954460awe) obj).LJ);
        long j2 = 0;
        if (c982390bfhPR != null) {
            j = c982390bfhPR.LIZJ;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        C982390bfh c982390bfhPR2 = ((TakeStagePunishManageFragment) aComparatorS514S0100000_15.l0).PR(((C954460awe) obj2).LJ);
        if (c982390bfhPR2 != null) {
            j2 = c982390bfhPR2.LIZJ;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$10(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj).LJIIJJI)), Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj2).LJIIJJI)));
    }

    public static final int compare$11(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj).LJIIJJI)), Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj2).LJIIJJI)));
    }

    public static final int compare$12(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj).LJIIJJI)), Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj2).LJIIJJI)));
    }

    public static final int compare$13(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        long j = ((C954460awe) obj).LJ;
        long j2 = 0;
        if (j == ((C981520beI) aComparatorS514S0100000_15.l0).LIZ.LJFF) {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        long j3 = ((C954460awe) obj2).LJ;
        if (j3 != ((C981520beI) aComparatorS514S0100000_15.l0).LIZ.LJFF) {
            j2 = j3;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$14(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C948400ams) obj).LIZIZ));
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C948400ams) obj2).LIZIZ));
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$15(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C948400ams) obj).LIZIZ));
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C948400ams) obj2).LIZIZ));
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$16(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C948400ams) obj).LIZIZ));
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C948400ams) obj2).LIZIZ));
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$17(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        long jLongValue;
        Long l = (Long) ((Map) aComparatorS514S0100000_15.l0).get(((LinkUser) obj).linkMicId);
        long jLongValue2 = Long.MAX_VALUE;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        Long l2 = (Long) ((Map) aComparatorS514S0100000_15.l0).get(((LinkUser) obj2).linkMicId);
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jLongValue2));
    }

    public static final int compare$2(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        boolean z;
        long j = ((Playbook) obj).playbookId;
        Long l = (Long) aComparatorS514S0100000_15.l0;
        boolean z2 = false;
        if (l != null && j == l.longValue()) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        long j2 = ((Playbook) obj2).playbookId;
        Long l2 = (Long) aComparatorS514S0100000_15.l0;
        if (l2 == null || j2 != l2.longValue()) {
            z2 = true;
        }
        return C20085613iQ.LIZIZ(boolValueOf, Boolean.valueOf(z2));
    }

    public static final int compare$3(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C953770avX) obj).LIZ)), (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C953770avX) obj2).LIZ)));
    }

    public static final int compare$4(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C953770avX) obj).LIZ)), (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C953770avX) obj2).LIZ)));
    }

    public static final int compare$5(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C953770avX) obj).LIZ)), (Integer) ((Map) aComparatorS514S0100000_15.l0).get(Integer.valueOf(((C953770avX) obj2).LIZ)));
    }

    public static final int compare$6(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        long j;
        C982390bfh c982390bfhPR = ((TakeStageSettlementManageFragment) aComparatorS514S0100000_15.l0).PR(((C954460awe) obj).LJ);
        long j2 = 0;
        if (c982390bfhPR != null) {
            j = c982390bfhPR.LIZJ;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        C982390bfh c982390bfhPR2 = ((TakeStageSettlementManageFragment) aComparatorS514S0100000_15.l0).PR(((C954460awe) obj2).LJ);
        if (c982390bfhPR2 != null) {
            j2 = c982390bfhPR2.LIZJ;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$7(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        int iIndexOf = ((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj).LJIIJJI);
        int i = Integer.MAX_VALUE;
        if (iIndexOf < 0) {
            iIndexOf = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        int iIndexOf2 = ((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj2).LJIIJJI);
        if (iIndexOf2 >= 0) {
            i = iIndexOf2;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i));
    }

    public static final int compare$8(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        int iIndexOf = ((List) aComparatorS514S0100000_15.l0).indexOf(Long.valueOf(((C954460awe) obj).LJ));
        int iIndexOf2 = ((List) aComparatorS514S0100000_15.l0).indexOf(Long.valueOf(((C954460awe) obj2).LJ));
        if (iIndexOf2 == -1) {
            return -1;
        }
        if (iIndexOf == -1) {
            return 1;
        }
        return Intrinsics.LJI(iIndexOf, iIndexOf2);
    }

    public static final int compare$9(AComparatorS514S0100000_15 aComparatorS514S0100000_15, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj).LJIIJJI)), Integer.valueOf(((List) aComparatorS514S0100000_15.l0).indexOf(((C954460awe) obj2).LJIIJJI)));
    }
}

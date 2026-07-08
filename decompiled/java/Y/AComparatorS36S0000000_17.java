package Y;

import X.AbstractC1126600fQI;
import X.AbstractC1134420fcu;
import X.AbstractC1140160fmA;
import X.C0KBR;
import X.C1094950ebF;
import X.C1102270en3;
import X.C1112670f3p;
import X.C1123320fL0;
import X.C1123980fM4;
import X.C1128510fTN;
import X.C1130990fXN;
import X.C1135810ff9;
import X.C1135940ffM;
import X.C1142430fpp;
import X.C13LP;
import X.C15DT;
import X.C20085613iQ;
import X.InterfaceC1112060f2q;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.dynamicstrategy.strategy.NormalRuleStrategy;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.livesetting.level.FeResourceChannelConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.Metrics2BizMapping;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.Gift;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public class AComparatorS36S0000000_17 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case 16:
                return compare$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, obj, obj2);
            case 19:
                return compare$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, obj, obj2);
            case 21:
                return compare$21(this, obj, obj2);
            case 22:
                return compare$22(this, obj, obj2);
            case 23:
                return compare$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return compare$24(this, obj, obj2);
            case 25:
                return compare$25(this, obj, obj2);
            case 26:
                return compare$26(this, obj, obj2);
            case 27:
                return compare$27(this, obj, obj2);
            case 28:
                return compare$28(this, obj, obj2);
            case 29:
                return compare$29(this, obj, obj2);
            case 30:
                return compare$30(this, obj, obj2);
            case 31:
                return compare$31(this, obj, obj2);
            case 32:
                return compare$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return compare$33(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS36S0000000_17(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        C0KBR c0kbr = (C0KBR) obj;
        C0KBR c0kbr2 = (C0KBR) obj2;
        if (c0kbr2 == null) {
            return -1;
        }
        if (c0kbr == null) {
            return 1;
        }
        return c0kbr2.LIZJ - c0kbr.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int compare$1(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((TaskInfo) ((AbstractC1134420fcu) obj2).LIZ).taskPriority), Long.valueOf(((TaskInfo) ((AbstractC1134420fcu) obj).LIZ).taskPriority));
    }

    public static final int compare$10(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((UniversalPopupButton) obj).position), Integer.valueOf(((UniversalPopupButton) obj2).position));
    }

    public static final int compare$11(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) C13LP.LJJJJZI(((Metrics2BizMapping) obj).metricsScore), (Integer) C13LP.LJJJJZI(((Metrics2BizMapping) obj2).metricsScore));
    }

    public static final int compare$12(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) C13LP.LJJJJZI(((Metrics2BizMapping) obj2).metricsScore), (Integer) C13LP.LJJJJZI(((Metrics2BizMapping) obj).metricsScore));
    }

    public static final int compare$13(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC1140160fmA) ((Map.Entry) obj).getKey()).LJIIIIZZ.LIZIZ), Integer.valueOf(((AbstractC1140160fmA) ((Map.Entry) obj2).getKey()).LJIIIIZZ.LIZIZ));
    }

    public static final int compare$14(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C15DT) obj).LIZ), Integer.valueOf(((C15DT) obj2).LIZ));
    }

    public static final int compare$15(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C15DT) obj).LIZ), Integer.valueOf(((C15DT) obj2).LIZ));
    }

    public static final int compare$16(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        Integer numValueOf;
        NormalRuleStrategy.CommonRule commonRule = (NormalRuleStrategy.CommonRule) obj;
        Integer numValueOf2 = null;
        if (commonRule != null) {
            numValueOf = Integer.valueOf(commonRule.order);
        } else {
            numValueOf = null;
        }
        NormalRuleStrategy.CommonRule commonRule2 = (NormalRuleStrategy.CommonRule) obj2;
        if (commonRule2 != null) {
            numValueOf2 = Integer.valueOf(commonRule2.order);
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$17(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) obj;
        InterfaceC1112060f2q interfaceC1112060f2q2 = (InterfaceC1112060f2q) obj2;
        long priority = interfaceC1112060f2q.getPriority() - interfaceC1112060f2q2.getPriority();
        if (priority != 0) {
            if (priority > 0) {
                return 1;
            }
            return -1;
        }
        if (interfaceC1112060f2q.LJIJJLI() == interfaceC1112060f2q2.LJIJJLI()) {
            return 0;
        }
        if (interfaceC1112060f2q.LJIJJLI() - interfaceC1112060f2q2.LJIJJLI() >= 0) {
            return 1;
        }
        return -1;
    }

    public static final int compare$18(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) obj;
        InterfaceC1112060f2q interfaceC1112060f2q2 = (InterfaceC1112060f2q) obj2;
        if (interfaceC1112060f2q.LJLILLLLZI() == interfaceC1112060f2q2.LJLILLLLZI()) {
            return 0;
        }
        if (interfaceC1112060f2q.LJLILLLLZI() - interfaceC1112060f2q2.LJLILLLLZI() > 0) {
            return -1;
        }
        return 1;
    }

    public static final int compare$19(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) obj;
        InterfaceC1112060f2q interfaceC1112060f2q2 = (InterfaceC1112060f2q) obj2;
        long priority = interfaceC1112060f2q.getPriority() - interfaceC1112060f2q2.getPriority();
        if (priority != 0) {
            if (priority > 0) {
                return 1;
            }
            return -1;
        }
        if (interfaceC1112060f2q.LJIJJLI() == interfaceC1112060f2q2.LJIJJLI()) {
            return 0;
        }
        if (interfaceC1112060f2q.LJIJJLI() - interfaceC1112060f2q2.LJIJJLI() < 0) {
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int compare$2(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((TaskInfo) ((AbstractC1134420fcu) obj2).LIZ).taskPriority), Long.valueOf(((TaskInfo) ((AbstractC1134420fcu) obj).LIZ).taskPriority));
    }

    public static final int compare$20(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) obj;
        InterfaceC1112060f2q interfaceC1112060f2q2 = (InterfaceC1112060f2q) obj2;
        long jLJIJI = interfaceC1112060f2q.LJIJI() - interfaceC1112060f2q2.LJIJI();
        if (jLJIJI != 0) {
            if (jLJIJI > 0) {
                return 1;
            }
            return -1;
        }
        if (interfaceC1112060f2q.LJIJJLI() - interfaceC1112060f2q2.LJIJJLI() > 0) {
            return 1;
        }
        return -1;
    }

    public static final int compare$21(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        long j = ((C1112670f3p) obj).LIZIZ - ((C1112670f3p) obj2).LIZIZ;
        if (j != 0) {
            if (j > 0) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public static final int compare$22(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1135810ff9) obj2).LJ), Integer.valueOf(((C1135810ff9) obj).LJ));
    }

    public static final int compare$23(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1128510fTN) obj).LIZIZ), Integer.valueOf(((C1128510fTN) obj2).LIZIZ));
    }

    public static final int compare$24(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1130990fXN) obj).LIZ), Integer.valueOf(((C1130990fXN) obj2).LIZ));
    }

    public static final int compare$25(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        Integer numValueOf;
        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) obj;
        Integer numValueOf2 = null;
        if (abstractC1126600fQI != null) {
            numValueOf = Integer.valueOf(abstractC1126600fQI.LIZLLL());
        } else {
            numValueOf = null;
        }
        AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) obj2;
        if (abstractC1126600fQI2 != null) {
            numValueOf2 = Integer.valueOf(abstractC1126600fQI2.LIZLLL());
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$26(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        Integer numValueOf;
        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) obj2;
        Integer numValueOf2 = null;
        if (abstractC1126600fQI != null) {
            numValueOf = Integer.valueOf(abstractC1126600fQI.LIZLLL());
        } else {
            numValueOf = null;
        }
        AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) obj;
        if (abstractC1126600fQI2 != null) {
            numValueOf2 = Integer.valueOf(abstractC1126600fQI2.LIZLLL());
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$27(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        Integer numValueOf;
        FeResourceChannelConfig feResourceChannelConfig = (FeResourceChannelConfig) obj;
        Integer numValueOf2 = null;
        if (feResourceChannelConfig != null) {
            numValueOf = Integer.valueOf(feResourceChannelConfig.minLevel);
        } else {
            numValueOf = null;
        }
        FeResourceChannelConfig feResourceChannelConfig2 = (FeResourceChannelConfig) obj2;
        if (feResourceChannelConfig2 != null) {
            numValueOf2 = Integer.valueOf(feResourceChannelConfig2.minLevel);
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$28(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1142430fpp) ((Pair) obj2).getSecond()).LJ), Long.valueOf(((C1142430fpp) ((Pair) obj).getSecond()).LJ));
    }

    public static final int compare$29(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1123320fL0) obj).LIZIZ, ((C1123320fL0) obj2).LIZIZ);
    }

    public static final int compare$3(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((ItemInfo4FE) obj).effectStartTimeSec), Long.valueOf(((ItemInfo4FE) obj2).effectStartTimeSec));
    }

    public static final int compare$30(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C15DT) obj).LIZ), Integer.valueOf(((C15DT) obj2).LIZ));
    }

    public static final int compare$31(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((EmoteWithIndex) obj).index), Integer.valueOf(((EmoteWithIndex) obj2).index));
    }

    public static final int compare$32(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1094950ebF) obj).LIZIZ), Long.valueOf(((C1094950ebF) obj2).LIZIZ));
    }

    public static final int compare$33(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1135940ffM) obj2).LJIILJJIL), Integer.valueOf(((C1135940ffM) obj).LJIILJJIL));
    }

    public static final int compare$4(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return ((C1123980fM4) obj).LIZ - ((C1123980fM4) obj2).LIZ;
    }

    public static final int compare$5(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return ((C1123980fM4) obj).LIZ - ((C1123980fM4) obj2).LIZ;
    }

    public static final int compare$6(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return ((C1123980fM4) obj).LIZ - ((C1123980fM4) obj2).LIZ;
    }

    public static final int compare$7(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        C1102270en3 c1102270en3 = (C1102270en3) obj;
        C1102270en3 c1102270en32 = (C1102270en3) obj2;
        if (c1102270en3 == null) {
            return -1;
        }
        if (c1102270en32 != null) {
            if (!c1102270en3.LIZLLL) {
                if (!c1102270en32.LIZLLL) {
                }
            } else if (!c1102270en32.LIZLLL) {
                return -1;
            }
            long j = c1102270en3.LJJJJ;
            long j2 = c1102270en32.LJJJJ;
            if (j <= j2) {
                if (j < j2) {
                    return -1;
                }
                long j3 = c1102270en3.LJIJ;
                long j4 = c1102270en32.LJIJ;
                if (j3 <= j4) {
                    if (j3 < j4) {
                        return -1;
                    }
                    return 0;
                }
            }
        }
        return 1;
    }

    public static final int compare$8(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((EmoteWithIndex) obj).index), Integer.valueOf(((EmoteWithIndex) obj2).index));
    }

    public static final int compare$9(AComparatorS36S0000000_17 aComparatorS36S0000000_17, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Gift) obj2).diamondCount), Integer.valueOf(((Gift) obj).diamondCount));
    }
}

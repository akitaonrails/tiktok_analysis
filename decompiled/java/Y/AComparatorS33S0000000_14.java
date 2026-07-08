package Y;

import X.AbstractC857880Xl4;
import X.C0Y9G;
import X.C0YCG;
import X.C0ZI7;
import X.C0ZIZ;
import X.C0ZLC;
import X.C13LP;
import X.C1433530nPL;
import X.C1750690vet;
import X.C20085613iQ;
import X.C2188811AlT;
import X.C860410Xp9;
import X.C869590Y9l;
import X.C869840YAk;
import X.C880460YgO;
import X.C907840ZjS;
import X.C912570Zr5;
import X.InterfaceC1891350zJl;
import X.InterfaceC884440Ymo;
import X.InterfaceC887560Yrq;
import X.InterfaceC888860Ytw;
import X.InterfaceC897100ZHg;
import X.InterfaceC902770ZbH;
import X.InterfaceC904620ZeG;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class AComparatorS33S0000000_14 implements Comparator {
    public final int $t;

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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, t, t2);
            case 19:
                return compare$19(this, t, t2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, t, t2);
            case 21:
                return compare$21(this, t, t2);
            case 22:
                return compare$22(this, t, t2);
            case 23:
                return compare$23(this, t, t2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return compare$24(this, t, t2);
            case 25:
                return compare$25(this, t, t2);
            case 26:
                return compare$26(this, t, t2);
            case 27:
                return compare$27(this, t, t2);
            case 28:
                return compare$28(this, t, t2);
            case 29:
                return compare$29(this, t, t2);
            case 30:
                return compare$30(this, t, t2);
            case 31:
                return compare$31(this, t, t2);
            case 32:
                return compare$32(this, t, t2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return compare$33(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS33S0000000_14(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC897100ZHg) obj).getType().ordinal()), Integer.valueOf(((InterfaceC897100ZHg) obj2).getType().ordinal()));
    }

    public static final int compare$1(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869590Y9l) obj2).getCreatedAt()), Long.valueOf(((C869590Y9l) obj).getCreatedAt()));
    }

    public static final int compare$10(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C880460YgO) obj2).priority), Integer.valueOf(((C880460YgO) obj).priority));
    }

    public static final int compare$11(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0ZIZ) obj2).LIZ), Integer.valueOf(((C0ZIZ) obj).LIZ));
    }

    public static final int compare$12(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        Long l;
        SellerMessage sellerMessage;
        SellerMessage sellerMessage2;
        List<SellerMessage> list = ((C1750690vet) obj2).LLJIJIL;
        Long l2 = null;
        if (list != null && (sellerMessage2 = (SellerMessage) C13LP.LJJLIIIJL(list)) != null) {
            l = sellerMessage2.createTime;
        } else {
            l = null;
        }
        List<SellerMessage> list2 = ((C1750690vet) obj).LLJIJIL;
        if (list2 != null && (sellerMessage = (SellerMessage) C13LP.LJJLIIIJL(list2)) != null) {
            l2 = sellerMessage.createTime;
        }
        return C20085613iQ.LIZIZ(l, l2);
    }

    public static final int compare$13(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LIZJ), Long.valueOf(((C869840YAk) obj2).LIZJ));
    }

    public static final int compare$14(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LIZJ), Long.valueOf(((C869840YAk) obj2).LIZJ));
    }

    public static final int compare$15(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LIZJ), Long.valueOf(((C869840YAk) obj2).LIZJ));
    }

    public static final int compare$16(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LIZJ), Long.valueOf(((C869840YAk) obj2).LIZJ));
    }

    public static final int compare$17(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC904620ZeG) obj).getInterceptOrdering().ordinal()), Integer.valueOf(((InterfaceC904620ZeG) obj2).getInterceptOrdering().ordinal()));
    }

    public static final int compare$18(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC902770ZbH) obj).getInterceptOrdering().ordinal()), Integer.valueOf(((InterfaceC902770ZbH) obj2).getInterceptOrdering().ordinal()));
    }

    public static final int compare$19(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC884440Ymo) obj2).getSortOrder()), Long.valueOf(((InterfaceC884440Ymo) obj).getSortOrder()));
    }

    public static final int compare$2(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        C907840ZjS c907840ZjS = (C907840ZjS) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c907840ZjS.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(c907840ZjS.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(c907840ZjS.LIZJ);
        sbLIZ.append('_');
        sbLIZ.append(c907840ZjS.LJFF);
        sbLIZ.append('_');
        sbLIZ.append(c907840ZjS.LJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C907840ZjS c907840ZjS2 = (C907840ZjS) obj2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c907840ZjS2.LIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(c907840ZjS2.LIZIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(c907840ZjS2.LIZJ);
        sbLIZ2.append('_');
        sbLIZ2.append(c907840ZjS2.LJFF);
        sbLIZ2.append('_');
        sbLIZ2.append(c907840ZjS2.LJI);
        return C20085613iQ.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final int compare$20(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC887560Yrq) obj).getPriorityInInbox()), Integer.valueOf(((InterfaceC887560Yrq) obj2).getPriorityInInbox()));
    }

    public static final int compare$21(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC888860Ytw) obj).getType().getPriority()), Integer.valueOf(((InterfaceC888860Ytw) obj2).getType().getPriority()));
    }

    public static final int compare$22(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1433530nPL) obj).LJFF), Long.valueOf(((C1433530nPL) obj2).LJFF));
    }

    public static final int compare$23(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C860410Xp9) obj).LLILLL), Long.valueOf(((C860410Xp9) obj2).LLILLL));
    }

    public static final int compare$24(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(((C860410Xp9) obj2).LLILZ.isSelf()), Boolean.valueOf(((C860410Xp9) obj).LLILZ.isSelf()));
    }

    public static final int compare$25(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C860410Xp9) obj2).LLILLL), Long.valueOf(((C860410Xp9) obj).LLILLL));
    }

    public static final int compare$26(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C0YCG) obj).LIZIZ), Long.valueOf(((C0YCG) obj2).LIZIZ));
    }

    public static final int compare$27(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC887560Yrq) obj).getPriorityInInbox()), Integer.valueOf(((InterfaceC887560Yrq) obj2).getPriorityInInbox()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$28(Y.AComparatorS33S0000000_14 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            X.0Ya5 r6 = (X.C876550Ya5) r6
            X.0YaF r0 = r6.LIZ
            X.0YaF r4 = X.EnumC876650YaF.MESSAGE
            r2 = 0
            if (r0 != r4) goto L3c
            X.0Y9l r0 = r6.LIZJ
            if (r0 == 0) goto L4b
            long r0 = r0.getIndex()
        L12:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.0Ya5 r5 = (X.C876550Ya5) r5
            X.0YaF r0 = r5.LIZ
            if (r0 != r4) goto L2d
            X.0Y9l r0 = r5.LIZJ
            if (r0 == 0) goto L24
            long r2 = r0.getIndex()
        L24:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            int r0 = X.C20085613iQ.LIZIZ(r1, r0)
            return r0
        L2d:
            X.0Y8T r0 = r5.LIZLLL
            if (r0 == 0) goto L24
            X.0Y9l r0 = r0.getLastShowMessage()
            if (r0 == 0) goto L24
            long r2 = r0.getIndex()
            goto L24
        L3c:
            X.0Y8T r0 = r6.LIZLLL
            if (r0 == 0) goto L4b
            X.0Y9l r0 = r0.getLastShowMessage()
            if (r0 == 0) goto L4b
            long r0 = r0.getIndex()
            goto L12
        L4b:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AComparatorS33S0000000_14.compare$28(Y.AComparatorS33S0000000_14, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$29(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C0Y9G) obj2).LJ), Long.valueOf(((C0Y9G) obj).LJ));
    }

    public static final int compare$3(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        Integer numValueOf;
        InterfaceC887560Yrq interfaceC887560Yrq;
        InterfaceC887560Yrq interfaceC887560Yrq2;
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
        Integer numValueOf2 = null;
        if ((interfaceC1891350zJl instanceof InterfaceC887560Yrq) && (interfaceC887560Yrq2 = (InterfaceC887560Yrq) interfaceC1891350zJl) != null) {
            numValueOf = Integer.valueOf(interfaceC887560Yrq2.getPriorityInInbox());
        } else {
            numValueOf = null;
        }
        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) obj2;
        if ((interfaceC1891350zJl2 instanceof InterfaceC887560Yrq) && (interfaceC887560Yrq = (InterfaceC887560Yrq) interfaceC1891350zJl2) != null) {
            numValueOf2 = Integer.valueOf(interfaceC887560Yrq.getPriorityInInbox());
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$30(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0ZLC) obj2).getPriority()), Integer.valueOf(((C0ZLC) obj).getPriority()));
    }

    public static final int compare$31(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC857880Xl4) obj).LIZIZ().ordinal()), Integer.valueOf(((AbstractC857880Xl4) obj2).LIZIZ().ordinal()));
    }

    public static final int compare$32(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return Integer.compare(((C0ZI7) obj).LIZIZ, ((C0ZI7) obj2).LIZIZ);
    }

    public static final int compare$33(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC884440Ymo) obj2).getSortOrder()), Long.valueOf(((InterfaceC884440Ymo) obj).getSortOrder()));
    }

    public static final int compare$4(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869590Y9l) obj2).getCreatedAt()), Long.valueOf(((C869590Y9l) obj).getCreatedAt()));
    }

    public static final int compare$5(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((RichTextInfo) obj).position), Integer.valueOf(((RichTextInfo) obj2).position));
    }

    public static final int compare$6(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C912570Zr5) obj2).LLILLJJLI.getCreatedAt()), Long.valueOf(((C912570Zr5) obj).LLILLJJLI.getCreatedAt()));
    }

    public static final int compare$7(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((PublishStuckEventTrackingLocalBean.ProgressBean) obj).progress, ((PublishStuckEventTrackingLocalBean.ProgressBean) obj2).progress);
    }

    public static final int compare$8(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((ActionBarButtonStrategyConf) obj).sequence, ((ActionBarButtonStrategyConf) obj2).sequence);
    }

    public static final int compare$9(AComparatorS33S0000000_14 aComparatorS33S0000000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C869590Y9l) obj).getIndex()), Long.valueOf(((C869590Y9l) obj2).getIndex()));
    }
}

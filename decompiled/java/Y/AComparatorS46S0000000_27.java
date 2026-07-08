package Y;

import X.C1785080wYM;
import X.C1798460wtw;
import X.C20085613iQ;
import X.C326880Cre;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.ss.android.ugc.aweme.bubble.record.BubbleRecord;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;

/* JADX INFO: loaded from: classes28.dex */
public class AComparatorS46S0000000_27 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS46S0000000_27(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1798460wtw) obj).LIZJ), Integer.valueOf(((C1798460wtw) obj2).LIZJ));
    }

    public static final int compare$1(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1798460wtw) obj).LIZJ), Integer.valueOf(((C1798460wtw) obj2).LIZJ));
    }

    public static final int compare$2(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1785080wYM) obj).LIZLLL), Integer.valueOf(((C1785080wYM) obj2).LIZLLL));
    }

    public static final int compare$3(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1785080wYM) obj).LIZLLL), Integer.valueOf(((C1785080wYM) obj2).LIZLLL));
    }

    public static final int compare$4(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((ITakoHighLightAnimProtocol) obj).Lm0()), Integer.valueOf(((ITakoHighLightAnimProtocol) obj2).Lm0()));
    }

    public static final int compare$5(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C326880Cre) obj).LLILLL.serverSeq), Long.valueOf(((C326880Cre) obj2).LLILLL.serverSeq));
    }

    public static final int compare$6(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        long j;
        RankListV2Response.NoticeConfig noticeConfig = ((RankListV2Response.Bulletin) obj2).noticeConfig;
        long j2 = 0;
        if (noticeConfig != null) {
            j = noticeConfig.priority;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        RankListV2Response.NoticeConfig noticeConfig2 = ((RankListV2Response.Bulletin) obj).noticeConfig;
        if (noticeConfig2 != null) {
            j2 = noticeConfig2.priority;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$7(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        int i;
        int i2 = ((BaseImage) obj).imageSceneType;
        int i3 = 0;
        if (i2 == 10002) {
            i = 0;
        } else {
            i = 1;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (((BaseImage) obj2).imageSceneType != 10002) {
            i3 = 1;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$8(Y.AComparatorS46S0000000_27 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            X.12Ez r5 = (X.C19723912Ez) r5
            X.0yR3 r0 = r5.LIZ
            if (r0 != 0) goto L35
            r0 = -1
        L7:
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == r3) goto L33
            if (r0 == r4) goto L31
            r0 = 2
        Lf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.12Ez r6 = (X.C19723912Ez) r6
            X.0yR3 r0 = r6.LIZ
            if (r0 == 0) goto L2f
            int[] r1 = X.C1857440yR4.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L26
            if (r0 != r4) goto L2f
            r5 = 1
        L26:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            int r0 = X.C20085613iQ.LIZIZ(r2, r0)
            return r0
        L2f:
            r5 = 2
            goto L26
        L31:
            r0 = 1
            goto Lf
        L33:
            r0 = 0
            goto Lf
        L35:
            int[] r1 = X.C1857440yR4.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AComparatorS46S0000000_27.compare$8(Y.AComparatorS46S0000000_27, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$9(AComparatorS46S0000000_27 aComparatorS46S0000000_27, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((BubbleRecord) obj).showTime), Long.valueOf(((BubbleRecord) obj2).showTime));
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.SuggestReason;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0QKM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QKM implements Serializable {
    public static final int $stable = 8;
    public final long accessedTime;
    public final int code;
    public final int currentRecommendPosition;
    public final int exposeCount;
    public final long exposeLastTime;
    public final boolean hasClicked;
    public final boolean hasClosed;
    public final String imprId;
    public final List<SuggestReason> interestRecommendList;
    public final String interestWord;
    public final String recallType;

    public C0QKM() {
        this("", null, false, false, 0, 0L, 0L, 0, "", 0, "");
    }

    public final C0QKM copy(String str, List<SuggestReason> list, boolean z, boolean z2, int i, long j, long j2, int i2, String str2, int i3, String str3) {
        return new C0QKM(str, list, z, z2, i, j, j2, i2, str2, i3, str3);
    }

    public final boolean exposeUpLimit() {
        return this.exposeCount >= C0QKO.LIZ().wordExposeLimit;
    }

    public final SuggestReason getTargetReason() {
        List<SuggestReason> list;
        int i = this.currentRecommendPosition;
        List<SuggestReason> list2 = this.interestRecommendList;
        if (i < (list2 != null ? list2.size() : 0) && (list = this.interestRecommendList) != null) {
            return (SuggestReason) ListProtector.get(list, this.currentRecommendPosition);
        }
        return null;
    }

    public final boolean isEffective() {
        List<SuggestReason> list;
        if (!C123100dR.LIZ(this.interestWord) || System.currentTimeMillis() - this.accessedTime >= C0QKO.LIZ().wordExpiredTime * 24 * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
            return false;
        }
        return ((this.exposeCount >= C0QKO.LIZ().wordExposeLimit && !C07IR.LIZ()) || (list = this.interestRecommendList) == null || list.isEmpty() || this.currentRecommendPosition >= this.interestRecommendList.size() || this.hasClicked || this.hasClosed) ? false : true;
    }

    public final boolean isTraverseFinished() {
        int i = this.currentRecommendPosition;
        List<SuggestReason> list = this.interestRecommendList;
        return i >= (list != null ? list.size() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[PHI: r0
      0x0033: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v9 java.lang.String) binds: [B:17:0x002e, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String targetQueryWord() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.SuggestReason r0 = r3.getTargetReason()
            if (r0 == 0) goto L31
            int r0 = r0.queryTextOption
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lc:
            java.lang.String r2 = ""
            if (r0 == 0) goto L1c
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L1c
            java.lang.String r0 = r3.interestWord
            if (r0 != 0) goto L33
        L1b:
            return r2
        L1c:
            com.ss.android.ugc.aweme.search.pages.reinforceinterest.repo.SuggestReason r0 = r3.getTargetReason()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.reason
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = kotlin.text.a0.LJLILLLLZI(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L33
            return r2
        L31:
            r0 = 0
            goto Lc
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QKM.targetQueryWord():java.lang.String");
    }

    public C0QKM(String str, List<SuggestReason> list, boolean z, boolean z2, int i, long j, long j2, int i2, String str2, int i3, String str3) {
        this.interestWord = str;
        this.interestRecommendList = list;
        this.hasClicked = z;
        this.hasClosed = z2;
        this.exposeCount = i;
        this.exposeLastTime = j;
        this.accessedTime = j2;
        this.currentRecommendPosition = i2;
        this.imprId = str2;
        this.code = i3;
        this.recallType = str3;
    }
}

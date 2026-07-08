package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877210Yb9 {
    public final FilterTabType LIZ;
    public final Set<EnumC880480YgQ> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C877210Yb9)) {
            return false;
        }
        C877210Yb9 c877210Yb9 = (C877210Yb9) obj;
        return this.LIZ == c877210Yb9.LIZ && Intrinsics.LJFF(this.LIZIZ, c877210Yb9.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationDataSourceArgsIdentifier(tabType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", filterOptions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C873950YQf LIZ() {
        EnumC877180Yb6 enumC877180Yb6 = EnumC877180Yb6.BUYER;
        return new C873950YQf(new C873970YQh(new C873970YQh(new C873980YQi(enumC877180Yb6.getKvKey(), null), C874030YQn.LIZ, new C874000YQk("1")), C874070YQr.LIZ, new C873970YQh(new C873980YQi(enumC877180Yb6.getKvKey(), null), C874050YQp.LIZ, new C874000YQk("null"))), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final C869290Y8h LIZIZ(String str) {
        Set setLJLIIL;
        C869290Y8h c869290Y8h = new C869290Y8h(str, 0, null, null, null, false, 4094);
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        int i = C877420YbU.LIZ[c19212010Ec.LIZJ().ordinal()];
        ?? r9 = 0;
        r9 = 0;
        r9 = 0;
        if (i != 1) {
            if (i == 2 && c19212010Ec.LJIIIIZZ().contains(FilterTabType.SPAM)) {
                C877220YbA c877220YbA = EnumC877300YbI.Companion;
                int value = this.LIZ.getValue();
                c877220YbA.getClass();
                EnumC877300YbI enumC877300YbILIZ = C877220YbA.LIZ(value);
                if (enumC877300YbILIZ == EnumC877300YbI.NULL || enumC877300YbILIZ == null) {
                    enumC877300YbILIZ = EnumC877300YbI.ALL;
                }
                c869290Y8h = C869290Y8h.LIZ(c869290Y8h, enumC877300YbILIZ.getValue(), null, null, false, null, null, null, 4093);
            }
        } else {
            r9 = 0;
            c869290Y8h = C869290Y8h.LIZ(c869290Y8h, 0, null, null, true, null, null, null, 4079);
        }
        switch (C877420YbU.LIZIZ[this.LIZ.ordinal()]) {
            case 1:
                if (C0CYM.LIZJ.LJIIIIZZ()) {
                    return C869290Y8h.LIZ(c869290Y8h, 1, null, null, r9, null, null, null, 4093);
                }
                return c869290Y8h;
            case 2:
                return C869290Y8h.LIZ(c869290Y8h, r9, null, null, r9, C0Y97.READ, null, null, 4063);
            case 3:
                return C869290Y8h.LIZ(c869290Y8h, r9 == true ? 1 : 0, Collections.singleton(EnumC879080YeA.LEAD.getFuzzyMatchStrForLegacyQuery()), null, r9, null, null, null, 4091);
            case 4:
                return C869290Y8h.LIZ(c869290Y8h, r9 == true ? 1 : 0, Collections.singleton(EnumC879080YeA.STARRED.getFuzzyMatchStrForLegacyQuery()), null, r9, null, null, null, 4091);
            case 5:
                return C869290Y8h.LIZ(c869290Y8h, r9 == true ? 1 : 0, Collections.singleton(EnumC879080YeA.SPAM.getFuzzyMatchStrForLegacyQuery()), null, r9, null, null, null, 4091);
            case 6:
                if (c19212010Ec.LJIIIIZZ().contains(FilterTabType.SPAM)) {
                    setLJLIIL = Collections.singleton(EnumC879080YeA.SECONDARY.getFuzzyMatchStrForLegacyQuery());
                } else {
                    String[] strArr = new String[2];
                    strArr[r9] = EnumC879080YeA.SECONDARY.getFuzzyMatchStrForLegacyQuery();
                    strArr[1] = EnumC879080YeA.SPAM.getFuzzyMatchStrForLegacyQuery();
                    setLJLIIL = C13LQ.LJLIIL(strArr);
                }
                return C869290Y8h.LIZ(c869290Y8h, r9 == true ? 1 : 0, null, setLJLIIL, r9, null, null, null, 4087);
            case 7:
                C873950YQf c873950YQfLIZ = LIZ();
                return C869290Y8h.LIZ(c869290Y8h, r9 == true ? 1 : 0, null, null, r9, null, Integer.valueOf(AbstractC1711506n3.LIZ), c873950YQfLIZ, 3775);
            default:
                return c869290Y8h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C877210Yb9(FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set) {
        this.LIZ = filterTabType;
        this.LIZIZ = set;
    }
}

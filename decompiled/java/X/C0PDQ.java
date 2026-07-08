package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS122S1000000_10;
import kotlin.jvm.internal.AwS190S1100000_9;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0PDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PDQ {
    public static final C0PDQ LIZ = new C0PDQ();
    public static final int LIZIZ = C07IQ.LIZ();

    public static int LIZJ(boolean z) {
        if (z) {
            return ((Number) AnonymousClass0794.LIZ.getValue()).intValue();
        }
        C01GW c01gw = AnonymousClass0795.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 0) {
            return ((Number) AnonymousClass0794.LIZ.getValue()).intValue();
        }
        return ((Number) c01gw.getValue()).intValue();
    }

    public static boolean LIZ(String str, String str2, C0PN8 c0pn8) {
        if (str != null && str.length() != 0) {
            if (str2 == null || c0pn8 == null) {
                return false;
            }
            return true;
        }
        C1AF0.LIZJ("DualS : ");
        return false;
    }

    public static Pair LIZIZ(C0PI7 c0pi7, C0PN8 c0pn8, boolean z) {
        String aid;
        C1846520y9S c1846520y9SLJIILJJIL;
        Aweme aweme;
        String aid2;
        String str;
        Iterator<SearchMixFeed> it2 = c0pn8.getItems().iterator();
        int i = 0;
        while (true) {
            String aid3 = null;
            if (!it2.hasNext()) {
                break;
            }
            Aweme aweme2 = it2.next().getAweme();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (u.LJIJI(aid, c0pi7.LIZIZ, false)) {
                if (i >= 0) {
                    if (z) {
                        c1846520y9SLJIILJJIL = C13LZ.LJIIIZ(i - 1, 0);
                    } else {
                        c1846520y9SLJIILJJIL = C13LZ.LJIILJJIL(i + 1, c0pn8.getItems().size());
                    }
                    int i2 = c1846520y9SLJIILJJIL.LL;
                    int i3 = c1846520y9SLJIILJJIL.LLILLJJLI;
                    int i4 = c1846520y9SLJIILJJIL.LLILLL;
                    if (i4 <= 0 ? i4 >= 0 || i3 > i2 : i2 > i3) {
                        str = null;
                    } else {
                        while (true) {
                            C0PLT c0plt = (C0PLT) C13LP.LJJJLZIJ(i2, c0pn8.getItems());
                            if (c0plt != null && c0plt.getFeedType() == 65280 && (aweme = c0plt.getAweme()) != null && !aweme.isAd()) {
                                if (C0PI4.LJ(c0plt.getAweme())) {
                                    aid3 = c0plt.getAweme().getAid();
                                    aid2 = c0pn8.LJJIIJ(aid3);
                                } else {
                                    aid2 = c0plt.getAweme().getAid();
                                }
                                str = aid3;
                                aid3 = aid2;
                            } else {
                                if (i2 == i3) {
                                    break;
                                }
                                i2 += i4;
                            }
                        }
                    }
                    return new Pair(aid3, str);
                }
            } else {
                i++;
            }
        }
        return new Pair(null, null);
    }

    public static C0PJH LIZLLL(C0PDQ c0pdq, String str, String str2, C0PN8 c0pn8, C0PI3 c0pi3, C0PJV c0pjv, C0PN8 c0pn82, C0PHT c0pht) {
        c0pdq.getClass();
        if (!LIZ(str, str2, c0pn8)) {
            return null;
        }
        return LJFF(c0pdq, new C639490P6l(new AwS122S1000000_10(str2, 1), false), str, str2, c0pn8, c0pi3, c0pjv, c0pn82, c0pht, null, null, 256);
    }

    public final C0PJH LJ(String str, String str2, C0PN8 c0pn8, C0PI3 c0pi3, C0PJV c0pjv, C0PN8 c0pn82, C0PHT c0pht, Integer num, String str3) {
        return LJFF(this, new C639490P6l(new AwS190S1100000_9(num, str2, 2), false), str, str2, c0pn8, c0pi3, c0pjv, c0pn82, c0pht, null, str3, 256);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x050f A[PHI: r3
      0x050f: PHI (r3v9 java.lang.String) = (r3v6 java.lang.String), (r3v11 java.lang.String) binds: [B:303:0x057f, B:277:0x050d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0582 A[PHI: r3
      0x0582: PHI (r3v7 java.lang.String) = (r3v6 java.lang.String), (r3v9 java.lang.String), (r3v9 java.lang.String) binds: [B:303:0x057f, B:279:0x0511, B:284:0x052f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0585 A[PHI: r2
      0x0585: PHI (r2v64 java.lang.String) = (r2v63 java.lang.String), (r2v82 java.lang.String), (r2v86 java.lang.String) binds: [B:264:0x04d5, B:306:0x0584, B:267:0x04e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x035d A[EDGE_INSN: B:378:0x035d->B:181:0x035d BREAK  A[LOOP:3: B:158:0x030d->B:176:0x0347], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x058e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x00e1 A[EDGE_INSN: B:420:0x00e1->B:47:0x00e1 BREAK  A[LOOP:10: B:72:0x0180->B:85:0x01bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0PJH LJFF(X.C0PDQ r32, X.C639490P6l r33, java.lang.String r34, java.lang.String r35, X.C0PN8 r36, X.C0PI3 r37, X.C0PJV r38, X.C0PDR r39, X.C0PHT r40, X.C0PLX r41, java.lang.String r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PDQ.LJFF(X.0PDQ, X.0P6l, java.lang.String, java.lang.String, X.0PN8, X.0PI3, X.0PJV, X.0PDR, X.0PHT, X.0PLX, java.lang.String, int):X.0PJH");
    }
}

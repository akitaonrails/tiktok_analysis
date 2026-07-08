package X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.06SL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06SL {
    public final C01GW LIZ = C452501pT.LIZIZ(new C04PV());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C04PW());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1093304Pj());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1123604aQ());
    public volatile String LJ = "";
    public volatile String LJFF = "";

    public final Map<String, Integer> LIZIZ() {
        return (Map) this.LIZ.getValue();
    }

    public final Map<String, Integer> LIZJ() {
        return (Map) this.LIZIZ.getValue();
    }

    public final void LIZLLL(long j, String str, C06SM... c06smArr) {
        int iIntValue;
        int i = (int) j;
        C06SM[] c06smArr2 = (C06SM[]) Arrays.copyOf(c06smArr, c06smArr.length);
        ((Map) this.LIZLLL.getValue()).put(str, Long.valueOf(i));
        ((Map) this.LIZJ.getValue()).put(str, C13LQ.LJJLL(c06smArr2));
        if (i > 0) {
            String strLJJJ = C13LQ.LJJJ(Arrays.copyOf(c06smArr2, c06smArr2.length), "_", null, null, null, 62);
            Integer num = LIZIZ().get(strLJJJ);
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            LIZIZ().put(strLJJJ, Integer.valueOf(iIntValue + 1));
            Integer num2 = LIZJ().get(strLJJJ);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            LIZJ().put(strLJJJ, Integer.valueOf(i + iIntValue2));
        }
    }

    public static void LIZ(C06SL c06sl, C0Y8T c0y8t, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        if ((i & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        c06sl.getClass();
        if (C884080YmE.LIZ().useUnreadCollector) {
            if (!z4) {
                c06sl.LIZLLL(c0y8t.getUnreadCount(), c0y8t.getConversationId(), C06SM.INVALID);
                return;
            }
            if (z) {
                c06sl.LIZLLL(c0y8t.getUnreadCount(), c0y8t.getConversationId(), C06SM.MUTED);
                return;
            }
            if (z2) {
                c06sl.LIZLLL(c0y8t.getUnreadCount(), c0y8t.getConversationId(), C06SM.SECONDARY);
            } else if (z3) {
                c06sl.LIZLLL(c0y8t.getUnreadCount(), c0y8t.getConversationId(), C06SM.FILTERED);
            } else {
                if (c0y8t.getUnreadCount() <= 0) {
                    return;
                }
                c06sl.LIZLLL(c0y8t.getUnreadCount(), c0y8t.getConversationId(), C06SM.NORMAL);
            }
        }
    }
}

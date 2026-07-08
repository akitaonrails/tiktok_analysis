package X;

import Y.ARunnableS4S1001000_14;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0ZA1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZA1 {
    public static final C0ZA1 LIZ = new C0ZA1();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static ARunnableS4S1001000_14 LIZJ;
    public static ARunnableS4S1001000_14 LIZLLL;
    public static boolean LJ;
    public static int LJFF;
    public static C0ZA3 LJI;
    public static AnonymousClass0956 LJII;
    public static boolean LJIIIIZZ;

    public static int LIZLLL() {
        C886330Ypr c886330Ypr;
        Map<FilterTabType, Integer> map;
        try {
            IMChatListApi.LJJIII.getClass();
            Pair pair = (Pair) C890330YwJ.LIZ().LJIIIZ().LIZ().getValue();
            if (pair == null || (c886330Ypr = (C886330Ypr) pair.getFirst()) == null || (map = c886330Ypr.LIZJ) == null) {
                return 0;
            }
            Integer num = map.get(FilterTabType.SECONDARY);
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = map.get(FilterTabType.REQUEST);
            iIntValue = (num2 != null ? num2.intValue() : 0) + iIntValue;
            return iIntValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return iIntValue;
        }
    }

    public static void LIZ() {
        LJFF++;
        ARunnableS4S1001000_14 aRunnableS4S1001000_14 = LIZJ;
        if (aRunnableS4S1001000_14 != null) {
            LIZIZ.removeCallbacks(aRunnableS4S1001000_14);
        }
        LIZJ = null;
        ARunnableS4S1001000_14 aRunnableS4S1001000_142 = LIZLLL;
        if (aRunnableS4S1001000_142 != null) {
            LIZIZ.removeCallbacks(aRunnableS4S1001000_142);
        }
        LIZLLL = null;
    }

    public static boolean LJ() {
        C0ZA3 c0za3;
        Pair<Pair<FilterTabType, Set<EnumC880480YgQ>>, List<C890610Ywl>> pairLLJLL;
        Pair<FilterTabType, Set<EnumC880480YgQ>> first;
        FilterTabType first2;
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        return c889930Yvf.LIZJ() == C05RV.PERSONAL_INBOX || (c0za3 = LJI) == null || (pairLLJLL = c0za3.LLJLL()) == null || (first = pairLLJLL.getFirst()) == null || (first2 = first.getFirst()) == null || first2 == c889930Yvf.LJI().getFirst();
    }

    public final void LJIIIZ() {
        LIZ();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        AnonymousClass0956 anonymousClass0956 = LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJII = null;
        LJI = null;
        LJ = false;
        LJIIIIZZ = false;
    }

    public static int LIZJ(C890610Ywl c890610Ywl) {
        AbstractC884010Ym7 abstractC884010Ym7LJII = LJII(c890610Ywl);
        if ((abstractC884010Ym7LJII instanceof C880340YgC) && abstractC884010Ym7LJII != null) {
            return abstractC884010Ym7LJII.getNum();
        }
        return 0;
    }

    public static AbstractC884010Ym7 LJII(C890610Ywl c890610Ywl) {
        VORightOperationType vORightOperationType;
        Object objLIZ = c890610Ywl.LIZ();
        if (objLIZ instanceof C0Z86) {
            C0Z74 rightViewVO = ((C0Z86) objLIZ).getRightViewVO();
            if (rightViewVO != null) {
                vORightOperationType = rightViewVO.rightOperationType;
            } else {
                vORightOperationType = null;
            }
            if (vORightOperationType instanceof C0Z8B) {
                return ((C0Z8B) vORightOperationType).getState();
            }
            if (!(vORightOperationType instanceof C0Z8F)) {
                return null;
            }
            return ((C0Z8F) vORightOperationType).getState();
        }
        if (!(objLIZ instanceof InterfaceC888500YtM)) {
            return null;
        }
        return ((InterfaceC888500YtM) objLIZ).getSessionUnreadViewState();
    }

    public static void LJIIIIZZ(String str) {
        long j;
        if (!C0BV6.LIZ() || !LJ || !LJ()) {
            return;
        }
        LIZ();
        ARunnableS4S1001000_14 aRunnableS4S1001000_14 = new ARunnableS4S1001000_14(LJFF, str, 1);
        LIZJ = aRunnableS4S1001000_14;
        BPEAHandler bPEAHandler = LIZIZ;
        int iIntValue = ((Number) C0ALM.LIZ.getValue()).intValue();
        if (iIntValue > 0) {
            j = iIntValue;
        } else {
            j = 1500;
        }
        C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS4S1001000_14);
    }

    public final void LJI(C0ZA3 c0za3) {
        if (!C0BV6.LIZ()) {
            return;
        }
        LJI = c0za3;
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        AnonymousClass0956 anonymousClass0956 = LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        LJII = C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C889310Yuf(null), 2);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChanged(C1619080sEc c1619080sEc) {
        LJIIIIZZ("tab_count");
    }

    public static final int LIZIZ(int i, boolean z) {
        if (z) {
            return Math.min(i, 1);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:579:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [int] */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.String r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 2330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZA1.LJFF(java.lang.String, boolean):void");
    }
}

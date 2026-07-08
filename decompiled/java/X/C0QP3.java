package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QP3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QP3 {
    public static void LIZJ(View view, C0QP5 c0qp5) {
        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        C19EG c19eg = null;
        if (view == null) {
            iSearchSuggestSubPageAbility = null;
        } else {
            try {
                iSearchSuggestSubPageAbility = (ISearchSuggestSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ISearchSuggestSubPageAbility.class, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C798270VTd.LIZ("EcSearchKeywordChangeMethodNew", e);
                return;
            }
        }
        String enterMethod = c0qp5.getEnterMethod();
        if (Intrinsics.LJFF(enterMethod, "search_history")) {
            if (iSearchSuggestSubPageAbility != null) {
                iSearchSuggestSubPageAbility.BP1();
            }
        } else if (Intrinsics.LJFF(enterMethod, "recom_search") && iSearchSuggestSubPageAbility != null) {
            iSearchSuggestSubPageAbility.Pa1();
        }
        SAFHelper.LIZ.getClass();
        Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
        if (activityLJIIIIZZ == null && C1205604ne.LIZ()) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZIZ = C737910Sx3.LIZIZ(activityLIZIZ2);
            } else {
                activityLIZIZ = null;
            }
            if (activityLIZIZ instanceof C19EG) {
                c19eg = (C19EG) activityLIZIZ;
            }
            if (((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIIJJI(c19eg)) {
                activityLJIIIIZZ = c19eg;
            }
        }
        if (activityLJIIIIZZ instanceof C19EG) {
            C0QP6.LIZ.getClass();
            if (C0QP6.LIZ((C19EG) activityLJIIIIZZ)) {
                LIZIZ(c0qp5, activityLJIIIIZZ, view);
                return;
            }
        }
        LIZ(c0qp5, activityLJIIIIZZ, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0QP5 r18, android.app.Activity r19, android.view.View r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QP3.LIZ(X.0QP5, android.app.Activity, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C0QP5 r20, android.app.Activity r21, android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QP3.LIZIZ(X.0QP5, android.app.Activity, android.view.View):void");
    }
}

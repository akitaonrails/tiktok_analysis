package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0QR6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QR6 {
    public static final /* synthetic */ int LIZ = 0;

    public static C0QCO LIZ(Fragment fragment) {
        Fragment fragment2;
        String str;
        C664000Q2s c664000Q2s;
        C0QR5.LIZ.getClass();
        Context context = GlobalContext.getContext();
        if (context == null) {
            return null;
        }
        C673320Qb4.LIZ.getClass();
        C673400QbC c673400QbC = C673320Qb4.LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJJIIJZLJL = 0;
            c673400QbC.LJIIIIZZ = System.currentTimeMillis();
        }
        if (C293970Bff.LIZ()) {
            fragment2 = null;
        } else {
            fragment2 = fragment;
        }
        C0QCO c0qco = new C0QCO(fragment2, context, null);
        if (C293970Bff.LIZ()) {
            C650950Pg5.Companion.getClass();
            C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, null);
            if (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
                str = "";
            }
            c0qco.LIZJ = str;
        }
        C673400QbC c673400QbC2 = C673320Qb4.LIZIZ;
        if (c673400QbC2 != null && c673400QbC2.LJIIIIZZ != 0) {
            c673400QbC2.LJIIIZ = System.currentTimeMillis() - c673400QbC2.LJIIIIZZ;
        }
        return (C0QCO) new Pair(c0qco, Boolean.FALSE).getFirst();
    }

    public static C0QCO LIZIZ(Fragment fragment, C0QWJ c0qwj) {
        C0QER c0qer;
        ECSearchEntranceData ecSearchEntranceData;
        if (C124100db.LIZ()) {
            return LIZ(fragment);
        }
        if (c0qwj != null && (c0qer = c0qwj.LIZ) != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("use_new_middle_view")) {
            return LIZ(fragment);
        }
        Pair pairLIZ = C0QR5.LIZ(C0QR5.LIZ, fragment);
        if (pairLIZ != null) {
            return (C0QCO) pairLIZ.getFirst();
        }
        return null;
    }
}

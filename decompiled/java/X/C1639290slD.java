package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.filter.repository.internal.main.FilterCategoryExtra;

/* JADX INFO: renamed from: X.0slD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639290slD {
    public static FilterCategoryExtra LIZ(String str) {
        if (str != null) {
            try {
                FilterCategoryExtra filterCategoryExtra = (FilterCategoryExtra) C2219091BtD.LIZJ().LJII(str, FilterCategoryExtra.class);
                if (filterCategoryExtra != null) {
                    return filterCategoryExtra;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}

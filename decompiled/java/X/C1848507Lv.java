package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1848507Lv extends C09AY implements Function0<String> {
    public C1848507Lv() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strLJJ = "";
        try {
            strLJJ = C0C64.LJIILLIIL().LJJ(31744, "search_preload_by_portrait", "", true);
            return strLJJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return strLJJ;
        }
    }
}

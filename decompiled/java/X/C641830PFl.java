package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641830PFl extends C09AY implements Function0<String> {
    public C641830PFl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        try {
            if (C641930PFv.LIZLLL().specifiedTabOrderList.isEmpty()) {
                return null;
            }
            C1227904rF c1227904rF = C1227904rF.LIZ;
            List<SearchTabInfo> list = C641930PFv.LIZLLL().specifiedTabOrderList;
            c1227904rF.getClass();
            return C1227904rF.LJI(list);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}

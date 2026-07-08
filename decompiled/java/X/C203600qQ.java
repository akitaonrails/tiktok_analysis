package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.00qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C203600qQ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(382));

    public static String LIZ() {
        Object c098200Yq;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C158B.LIZ());
            sbLIZ.append((String) LIZ.getValue());
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJI("LiveGiftGuidePredictManager", thM5exceptionOrNullimpl);
            c098200Yq = CardStruct.IStatusCode.DEFAULT;
        }
        return (String) c098200Yq;
    }
}

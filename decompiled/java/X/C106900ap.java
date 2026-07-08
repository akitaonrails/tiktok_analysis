package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.00ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C106900ap {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(int i, int i2, List list) {
        Object c098200Yq;
        List listSubList = C13BV.INSTANCE;
        try {
            listSubList = list.subList(i, i2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return listSubList;
    }
}

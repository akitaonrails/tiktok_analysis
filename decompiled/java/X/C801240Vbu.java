package X;

import android.app.Activity;
import android.util.Log;
import com.bytedance.helios.apimonitor.permission.PermissionPopUpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Vbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801240Vbu {
    public static C801200Vbq LIZ(Activity activity) {
        C801200Vbq c801200Vbq = (C801200Vbq) activity.getIntent().getSerializableExtra("_pns_permission_state");
        if (c801200Vbq == null) {
            C801200Vbq c801200Vbq2 = new C801200Vbq();
            activity.getIntent().putExtra("_pns_permission_state", c801200Vbq2);
            return c801200Vbq2;
        }
        return c801200Vbq;
    }

    public static void LIZJ(Activity activity) {
        Object c098200Yq;
        C801200Vbq c801200VbqLIZ = LIZ(activity);
        try {
            Iterator<InterfaceC801250Vbv> it2 = PermissionPopUpService.LLILLL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ((String[]) c801200VbqLIZ.getGrantResultsBeforeRequest().keySet().toArray(new String[0]));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    public static void LIZLLL(Activity activity, String[] strArr, int i) {
        Object c098200Yq;
        try {
            C801200Vbq c801200VbqLIZ = LIZ(activity);
            c801200VbqLIZ.markCurrentGrantStatus(activity, strArr, i);
            StringBuilder sb = new StringBuilder();
            sb.append("onRequestPermission: ");
            sb.append(C0C40.LIZIZ(C13LQ.LJJLL(strArr)));
            sb.append(' ');
            Collection<Pair<Integer, Boolean>> collectionValues = c801200VbqLIZ.getGrantResultsBeforeRequest().values();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((Number) ((Pair) it2.next()).getFirst()).intValue()));
            }
            sb.append(arrayList);
            c098200Yq = Integer.valueOf(Log.d("PermissionPopUpService", sb.toString()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    public static void LIZIZ(Activity activity, String[] strArr, int[] iArr, EnumC801210Vbr enumC801210Vbr) {
        Object c098200Yq;
        try {
            Iterator<InterfaceC801250Vbv> it2 = PermissionPopUpService.LLILLL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(strArr, enumC801210Vbr);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    public static void LJ(Activity activity, int i, String[] strArr, int[] iArr) {
        Object c098200Yq;
        try {
            C801200Vbq c801200VbqLIZ = LIZ(activity);
            if (c801200VbqLIZ.isRequestingPermission()) {
                c801200VbqLIZ.markRequestPermissionResults(activity, i, strArr, iArr);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }
}

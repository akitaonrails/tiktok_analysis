package X;

import Y.ARunnableS18S1100000_13;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQ6 {
    public static final Object LIZ(Object obj) {
        Object c098200Yq;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (obj instanceof C0WR6) {
            return LIZ(((C0WR6) obj).LIZ());
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                jSONArray.put(LIZ(it2.next()));
            }
            return jSONArray;
        }
        if (C19719512Dh.LJFF(0, obj)) {
            try {
                Object objInvoke = ((Function0) obj).invoke();
                if (objInvoke == null) {
                    return "pns-null";
                }
                return objInvoke;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return "pns-null";
            }
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
            return obj.toString();
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getReportJSONValue error: ");
            sbLIZ.append(obj);
            C823280WRi.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "ensure_not_reach_here", thM5exceptionOrNullimpl);
        }
        return "pns-null";
    }

    public static final void LIZIZ(Map<String, ? extends C0WR6> map) {
        String str;
        ExecutorC822880WPu executorC822880WPu;
        C0WR6 c0wr6;
        C0WR6 c0wr62 = map.get("trigger_biz");
        Object objLIZ = null;
        if (c0wr62 != null) {
            objLIZ = c0wr62.LIZ();
        }
        if ((objLIZ instanceof String) && (str = (String) objLIZ) != null) {
            if (map.containsKey("stack") && (c0wr6 = map.get("stack")) != null) {
                c0wr6.LIZ();
            }
            synchronized (PumbaaWorkerThread.class) {
                try {
                    PumbaaWorkerThread.LIZIZ();
                    executorC822880WPu = PumbaaWorkerThread.LLILLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            executorC822880WPu.execute(new ARunnableS18S1100000_13(map, str, 20));
        }
    }
}

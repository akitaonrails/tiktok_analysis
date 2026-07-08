package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyGroupStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.02Qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C587602Qw {
    public static HashMap<Long, ConsistencyGroupStruct> LIZ(String str, HashMap<Long, ConsistencyGroupStruct> map) {
        if (str == null) {
            return map;
        }
        try {
            return (HashMap) C7740030o.LIZ().getGson().LJIIIIZZ(str, new TypeToken<HashMap<Long, ConsistencyGroupStruct>>() { // from class: X.02Qv
            }.getType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return map;
        }
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0XIN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XIN<T> implements C0XIL<List<T>> {
    @Override // X.C0XIL
    public final Object LIZ(Object obj) {
        if (obj instanceof JSONArray) {
            try {
                return JsonParseUtils.LIZJ(null, obj.toString());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new C0XIO(th);
            }
        }
        throw new C0XIP() { // from class: X.0XIQ
        };
    }
}

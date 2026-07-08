package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0Wpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC835370Wpr<C, R> {
    public final C LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC835370Wpr(Object obj) {
        this.LIZ = obj;
    }

    public static Object LIZ(Object obj) {
        Object objInvoke;
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
                objInvoke = ((Function0) obj).invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (objInvoke == null) {
                return "pns-null";
            }
            return objInvoke;
        }
        if (obj == null) {
            return "pns-null";
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return obj.toString();
    }
}

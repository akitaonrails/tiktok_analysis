package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.MultiProcessSharedProvider;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790950V0z {
    public static volatile C790950V0z LIZJ;
    public final Context LIZ;
    public final C08I4<Long, C0V11> LIZIZ;

    public final List<C0V11> LIZ() {
        LinkedHashMap linkedHashMap;
        LinkedList linkedList = new LinkedList();
        if (!C790570Uzn.LIZIZ(this.LIZ).LJ) {
            this.LIZIZ.LIZ();
            return linkedList;
        }
        C08I4<Long, C0V11> c08i4 = this.LIZIZ;
        synchronized (c08i4) {
            linkedHashMap = new LinkedHashMap(c08i4.LIZ);
        }
        if (linkedHashMap.isEmpty()) {
            return linkedList;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry != null) {
                linkedList.add(entry.getValue());
            }
        }
        return linkedList;
    }

    public C790950V0z(Context context) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = contextN3;
        this.LIZIZ = new C08I4<>(C790570Uzn.LIZIZ(context).LIZLLL);
        try {
            ((C0V10) C790570Uzn.LJI).getClass();
            String strLIZIZ = MultiProcessSharedProvider.LIZJ(contextN3).LIZIZ("pop_window_message_cache_list");
            if (!C2093608Ic.LJ(strLIZIZ)) {
                JSONArray jSONArray = new JSONArray(strLIZIZ);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    C0V11 c0v11 = new C0V11();
                    c0v11.LIZ(jSONObjectOptJSONObject);
                    this.LIZIZ.LIZIZ(Long.valueOf(c0v11.LIZ), c0v11);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

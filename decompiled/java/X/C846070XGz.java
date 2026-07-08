package X;

import android.text.TextUtils;
import com.ss.android.account.TTAccountInit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C846070XGz {
    public String LIZ;
    public Map<String, String> LIZIZ;
    public List<C845840XGc> LIZJ;

    public final void LIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        TTAccountInit.LIZ();
        if (C848000XOk.LIZJ()) {
            this.LIZIZ.put("multi_login", "1");
        }
    }

    public final C845960XGo LIZIZ() {
        return new C845960XGo(this.LIZ, "get", this.LIZJ, this.LIZIZ);
    }

    public final C845960XGo LJFF() {
        return new C845960XGo(this.LIZ, "post", this.LIZJ, this.LIZIZ);
    }

    public final void LIZLLL(Map map) {
        if (this.LIZIZ == null) {
            this.LIZIZ = map;
            return;
        }
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.LIZIZ.put((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void LIZJ(String str, String str2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        this.LIZIZ.put(str, str2);
    }

    public final void LJ(Map map, Map map2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            this.LIZIZ.put((String) entry.getKey(), (String) entry.getValue());
        }
        if (map2 != null && !map2.isEmpty()) {
            for (String str : map2.keySet()) {
                if (!TextUtils.isEmpty(str) && map2.get(str) != null) {
                    this.LIZIZ.put(str, (String) map2.get(str));
                }
            }
        }
    }
}

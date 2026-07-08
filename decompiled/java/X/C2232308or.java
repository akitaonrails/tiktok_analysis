package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2232308or {
    public static volatile C2232308or LIZJ;
    public static SharedPreferences LIZLLL;
    public List<String> LIZ;
    public final Gson LIZIZ = C0CHQ.LIZ().getGson();

    public static C2232308or LIZIZ() {
        if (LIZJ == null) {
            synchronized (C2232308or.class) {
                try {
                    LIZLLL = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "commerce_sticker_unlock");
                    LIZJ = new C2232308or();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final List<String> LIZ() {
        List list;
        if (this.LIZ == null) {
            ArrayList arrayList = new ArrayList();
            try {
                String string = LIZLLL.getString("sticker_id_info", null);
                if (!TextUtils.isEmpty(string) && (list = (List) this.LIZIZ.LJIIIIZZ(string, new TypeToken<List<String>>() { // from class: X.04ZK
                }.getType())) != null) {
                    arrayList.addAll(list);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZ = arrayList;
        }
        return this.LIZ;
    }
}

package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0QTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670980QTo {
    public static final C670990QTp LIZIZ = new C670990QTp();
    public static C670980QTo LIZJ;
    public List<? extends Object> LIZ;

    public final String LIZ() {
        JSONArray jSONArray = new JSONArray();
        List<? extends Object> list = this.LIZ;
        if (list != null) {
            Iterator<? extends Object> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().toString());
            }
        }
        return Uri.encode(jSONArray.toString());
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.08Cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079908Cv {
    public final Keva LIZ;
    public final String LIZIZ = "key_order_list";

    public final List<String> LIZIZ() {
        JSONArray jSONArray = new JSONArray(this.LIZ.getString(this.LIZIZ, "[]"));
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
        }
        return arrayList;
    }

    public C2079908Cv(String str) {
        this.LIZ = Keva.getRepo(str);
    }

    public final String LIZ(String str) {
        String string = this.LIZ.getString(str, null);
        if (string == null) {
            return null;
        }
        List<String> listLIZIZ = LIZIZ();
        ArrayList arrayList = (ArrayList) listLIZIZ;
        if (arrayList.remove(str)) {
            arrayList.add(str);
            this.LIZ.storeString(this.LIZIZ, new JSONArray((Collection) listLIZIZ).toString());
        }
        return string;
    }

    public final void LIZJ(String str, String str2) {
        List<String> listLIZIZ = LIZIZ();
        ArrayList arrayList = (ArrayList) listLIZIZ;
        arrayList.remove(str);
        arrayList.add(str);
        if (arrayList.size() > 30) {
            this.LIZ.erase((String) ListProtector.remove(listLIZIZ, 0));
        }
        this.LIZ.storeString(str, str2);
        this.LIZ.storeString(this.LIZIZ, new JSONArray((Collection) listLIZIZ).toString());
    }
}

package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21186917vf extends C21186817ve {
    public final EnumC21187117vh LIZIZ;
    public final List<C21187017vg> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final String toString() throws JSONException {
        int value = EnumC21187117vh.SUCCESS.getValue();
        List<C21187017vg> list = this.LIZJ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return "";
        }
        Iterator<C21187017vg> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZ() >= value) {
                JSONObject jSONObject = new JSONObject();
                String str = this.LIZ;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                List<C21187017vg> list2 = this.LIZJ;
                ArrayList<C21187017vg> arrayList = new ArrayList();
                for (C21187017vg c21187017vg : list2) {
                    if (c21187017vg.LIZ() >= value) {
                        arrayList.add(c21187017vg);
                    }
                }
                for (C21187017vg c21187017vg2 : arrayList) {
                    jSONObject3.put(c21187017vg2.LIZ, c21187017vg2.LIZIZ.getValue());
                    if (c21187017vg2.LIZ() > value) {
                        value = c21187017vg2.LIZ();
                    }
                }
                jSONObject2.put("errors", jSONObject3);
                jSONObject2.put("result", value);
                jSONObject.put(str, jSONObject2);
                return C786410Ut5.J3(jSONObject);
            }
        }
        return "";
    }

    public C21186917vf(String str, EnumC21187117vh enumC21187117vh, List list, String str2, String str3, String str4) {
        super(str);
        this.LIZIZ = enumC21187117vh;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
    }
}

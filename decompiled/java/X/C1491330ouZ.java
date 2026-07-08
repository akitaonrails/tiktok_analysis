package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ouZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491330ouZ {
    public final List<String> LIZ = new ArrayList();
    public final boolean LIZIZ;

    public C1491330ouZ(Object obj) throws JSONException {
        boolean z;
        JSONArray jSONArray;
        int length;
        if (obj != null) {
            int i = 0;
            if ((obj instanceof String) && Intrinsics.LJFF(obj, "all")) {
                z = true;
            } else {
                z = false;
            }
            this.LIZIZ = z;
            if (!(obj instanceof JSONArray) || (length = (jSONArray = (JSONArray) obj).length()) <= 0) {
                return;
            }
            while (true) {
                int i2 = i + 1;
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    this.LIZ.add((String) obj2);
                }
                if (i2 < length) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}

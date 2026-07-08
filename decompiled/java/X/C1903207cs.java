package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1903207cs {
    public String LIZ;
    public String LIZIZ;
    public String[] LIZJ;

    public final void LIZ(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        String strOptString = jSONObject.optString("main_play_url");
        this.LIZ = strOptString;
        if (!TextUtils.isEmpty(strOptString)) {
            arrayList.add(this.LIZ);
        }
        String strOptString2 = jSONObject.optString("backup_play_url");
        this.LIZIZ = strOptString2;
        if (!TextUtils.isEmpty(strOptString2)) {
            arrayList.add(this.LIZIZ);
        }
        String[] strArr = new String[arrayList.size()];
        this.LIZJ = strArr;
        arrayList.toArray(strArr);
    }
}

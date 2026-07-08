package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC597020NbI {
    public final String LIZ;
    public final List<C596940NbA<?>> LIZIZ = new ArrayList();

    public final void LIZ() {
        JSONObject jSONObject = new JSONObject();
        for (C596940NbA c596940NbA : (ArrayList) this.LIZIZ) {
            if (c596940NbA.LLILLJJLI || c596940NbA.LLILLL != 0) {
                jSONObject.put(c596940NbA.LL, c596940NbA.LLILLL);
            }
        }
        C597050NbL.LIZ().LIZIZ(this.LIZ, jSONObject);
    }

    public AbstractC597020NbI(String str) {
        this.LIZ = str;
    }
}

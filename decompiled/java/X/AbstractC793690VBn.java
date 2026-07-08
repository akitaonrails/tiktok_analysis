package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793690VBn implements C0VBU {
    public int LIZ = 8192;

    public final C793730VBr LIZJ(JSONObject jSONObject) {
        boolean z;
        if (C792420V6q.LJIILL()) {
            int i = C792420V6q.LJIILLIIL.LIZJ;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = this.LIZ;
            }
            C08SI c08si = new C08SI(new C793720VBq(i));
            c08si.LJI(jSONObject);
            if (!z) {
                this.LIZ = (int) (((double) c08si.LIZ.LLILLJJLI) * 1.1d);
            }
            C793720VBq c793720VBq = c08si.LIZ;
            return new C793730VBr(c793720VBq.LL, c793720VBq.LLILLJJLI);
        }
        return new C793730VBr(C0VCR.LIZ(C786410Ut5.J3(jSONObject)));
    }
}

package X;

import org.json.JSONArray;

/* JADX INFO: renamed from: X.0VfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803450VfT {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final C803440VfS LIZLLL;

    public C803450VfT(int i, int i2, boolean z, JSONArray jSONArray) {
        C803440VfS c803440VfS;
        this.LIZ = C538540LAe.LLJJJIL;
        this.LIZIZ = i;
        if (i2 > 0) {
            this.LIZ = i2;
        }
        this.LIZJ = z;
        if (jSONArray != null && jSONArray.length() >= 2) {
            c803440VfS = new C803440VfS(jSONArray);
        } else {
            c803440VfS = null;
        }
        this.LIZLLL = c803440VfS;
    }
}

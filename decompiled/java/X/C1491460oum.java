package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1491460oum extends AbstractC1491380oue {
    public final String LIZJ;
    public AbstractC1491380oue LIZLLL;
    public AbstractC1491380oue LJ;

    @Override // X.InterfaceC1491370oud
    public String getType() {
        return this.LIZJ;
    }

    public C1491460oum(Object obj) {
        super(obj);
        this.LIZJ = "minus";
    }

    @Override // X.InterfaceC1491370oud
    public Long LIZ(JSONObject jSONObject) {
        int i;
        Long lLIZIZ = LIZIZ("_x", this.LIZLLL, jSONObject);
        Long lLIZIZ2 = LIZIZ("_y", this.LJ, jSONObject);
        if (lLIZIZ == null) {
            i = 1;
        } else {
            i = 0;
        }
        if (lLIZIZ2 == null) {
            i |= 2;
        }
        if (i != 0) {
            return Long.valueOf(-i);
        }
        long jLongValue = lLIZIZ.longValue() - lLIZIZ2.longValue();
        if (jLongValue < 0) {
            jLongValue = -999;
        }
        return Long.valueOf(jLongValue);
    }

    @Override // X.AbstractC1491380oue
    public final boolean LIZJ(C1491360ouc c1491360ouc) {
        Object obj = this.LIZ;
        if ((obj instanceof JSONArray) && ((JSONArray) obj).length() == 2) {
            this.LIZLLL = C1491440ouk.LIZ(((JSONArray) this.LIZ).get(0), c1491360ouc);
            AbstractC1491380oue abstractC1491380oueLIZ = C1491440ouk.LIZ(((JSONArray) this.LIZ).get(1), c1491360ouc);
            this.LJ = abstractC1491380oueLIZ;
            if (this.LIZLLL == null) {
                c1491360ouc.LIZ("the first element is missing");
                return false;
            }
            if (abstractC1491380oueLIZ != null) {
                return true;
            }
            c1491360ouc.LIZ("the second element is missing");
            return false;
        }
        c1491360ouc.LIZ(Intrinsics.LJIIJJI(this.LIZ, "Param is not a JSONArray or the size of it is not 2, "));
        return false;
    }
}

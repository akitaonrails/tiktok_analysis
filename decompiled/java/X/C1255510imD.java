package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0imD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255510imD extends AbstractC1255540imG {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1255510imD) && Intrinsics.LJFF(this.LIZIZ, ((C1255510imD) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1255510imD(String str) {
        super(EnumC1253890ijb.TEXT);
        this.LIZIZ = str;
    }

    @Override // X.AbstractC1255540imG
    public final void LIZ(JSONObject jSONObject) throws JSONException {
        super.LIZ(jSONObject);
        jSONObject.put("notification_text", this.LIZIZ);
    }

    @Override // X.AbstractC1255540imG
    public final boolean LIZIZ(AbstractC1255540imG abstractC1255540imG) {
        C1255510imD c1255510imD;
        if (abstractC1255540imG instanceof C1255510imD) {
            c1255510imD = (C1255510imD) abstractC1255540imG;
        } else {
            c1255510imD = null;
        }
        if (c1255510imD == null) {
            return true;
        }
        return !Intrinsics.LJFF(this.LIZIZ, c1255510imD.LIZIZ);
    }
}

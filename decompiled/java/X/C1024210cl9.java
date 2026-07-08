package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024210cl9 {
    public final String LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1024210cl9)) {
            return false;
        }
        C1024210cl9 c1024210cl9 = (C1024210cl9) obj;
        return Intrinsics.LJFF(this.LIZ, c1024210cl9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1024210cl9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1024210cl9.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1024210cl9.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraJsonContextProvider(label=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", adExtraData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extJson=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ() {
        return (a0.LJJJIL(this.LIZIZ) ^ true) && (a0.LJJJIL(this.LIZ) ^ true);
    }

    public static final String LIZ() {
        return UUID.randomUUID().toString();
    }

    public C1024210cl9(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        long jCurrentTimeMillis;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = jSONObject;
        this.LIZLLL = jSONObject2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ads_");
        sbLIZ.append(C1024210cl9.class.getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJ = jSONObject2.optString("refer");
        this.LJFF = jSONObject2.optString("tag");
        Long lLJIILIIL = C2095008Iq.LJIILIIL(jSONObject.optString("track_now_time"));
        if (lLJIILIIL != null) {
            jCurrentTimeMillis = lLJIILIIL.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LJI = jCurrentTimeMillis;
    }
}

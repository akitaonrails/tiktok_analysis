package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18JN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18JN {
    public final C18K1 LIZ;
    public final JSONObject LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18JN)) {
            return false;
        }
        C18JN c18jn = (C18JN) obj;
        return this.LIZ == c18jn.LIZ && Intrinsics.LJFF(this.LIZIZ, c18jn.LIZIZ);
    }

    public C18JN(C18K1 c18k1, JSONObject jSONObject) {
        this.LIZ = c18k1;
        this.LIZIZ = jSONObject;
    }
}

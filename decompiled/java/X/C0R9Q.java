package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0R9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9Q {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(279));

    public final C692150RCz LIZ(String str) {
        C692150RCz c692150RCz = (C692150RCz) ((Map) this.LIZ.getValue()).get(str);
        if (c692150RCz == null) {
            C692150RCz c692150RCz2 = new C692150RCz();
            ((Map) this.LIZ.getValue()).put(str, c692150RCz2);
            return c692150RCz2;
        }
        return c692150RCz;
    }
}

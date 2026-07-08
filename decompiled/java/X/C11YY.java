package X;

import java.util.Map;

/* JADX INFO: renamed from: X.11YY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11YY {
    public final Map<String, String> LIZ;
    public boolean LIZIZ;

    public final boolean LIZ() {
        String str;
        Integer numLJIIJJI;
        return this.LIZ.get("error_code") != null && ((str = this.LIZ.get("error_code")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 0);
    }

    public C11YY(Map<String, String> map) {
        this.LIZ = map;
    }
}

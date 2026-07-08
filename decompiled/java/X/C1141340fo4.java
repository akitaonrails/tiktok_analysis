package X;

import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0fo4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141340fo4 {
    public static final C01GW<Handler> LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(18));
    public final String LIZ;
    public final Double LIZJ;
    public final boolean LIZIZ = true;
    public final Map<String, String> LIZLLL = new LinkedHashMap();

    public C1141340fo4(String str, Double d) {
        this.LIZ = str;
        this.LIZJ = d;
    }

    public final void LIZ(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        if (lValueOf != null) {
            this.LIZLLL.put(str, lValueOf.toString());
        }
    }
}

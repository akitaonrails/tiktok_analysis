package X;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ciG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022420ciG {
    public static final Set<String> LJII;
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final JSONObject LJFF;
    public final C1022820ciu LJI;

    static {
        C1023320cji.LIZ.getClass();
        LJII = Collections.singleton(C1023320cji.LIZIZ);
    }

    public C1022420ciG(boolean z, String str, String str2, String str3, String str4, JSONObject jSONObject, C1022820ciu c1022820ciu, int i) {
        jSONObject = (i & 32) != 0 ? null : jSONObject;
        c1022820ciu = (i & 64) != 0 ? null : c1022820ciu;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = jSONObject;
        this.LJI = c1022820ciu;
    }
}

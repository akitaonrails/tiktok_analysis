package X;

import android.net.Uri;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1522680pj8 {
    public final String LIZ;
    public final Uri LIZIZ;
    public final Map<String, Object> LIZJ;
    public final long LIZLLL;
    public Map<String, String> LJ;
    public volatile String LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS567S0100000_23(this, 152));

    public abstract boolean cancel();

    public final String toString() {
        String str = this.LJFF;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(this.LIZ);
        Map<String, String> map = this.LJ;
        for (Map.Entry entry : (map != null ? new TreeMap(map) : C2097608Jq.LJ()).entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        String string = sb.toString();
        this.LJFF = string;
        return string;
    }

    public AbstractC1522680pj8(String str, Uri uri, Map map, long j, Map map2) {
        this.LIZ = str;
        this.LIZIZ = uri;
        this.LIZJ = map;
        this.LIZLLL = j;
        this.LJ = map2;
    }
}

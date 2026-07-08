package X;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.08AO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08AO {
    public final long LIZ;
    public final List<String> LIZIZ;
    public final Set<SharedPreferences.OnSharedPreferenceChangeListener> LIZJ;
    public final Map<String, Object> LIZLLL;
    public final CountDownLatch LJ = new CountDownLatch(1);
    public volatile boolean LJFF = false;

    public C08AO(long j, List list, Set set, Map map) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = set;
        this.LIZLLL = map;
    }
}

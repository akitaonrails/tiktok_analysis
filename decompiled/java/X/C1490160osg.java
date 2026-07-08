package X;

import com.bytedance.ttnet.throttle.TTNetThrottle;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0osg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490160osg {
    public static final String[] LJIIIZ = new String[0];
    public final Map<String, Integer> LIZ = new ConcurrentHashMap();
    public Set<String> LIZIZ = new CopyOnWriteArraySet();
    public Set<String> LIZJ = new CopyOnWriteArraySet();
    public Set<String> LIZLLL = new CopyOnWriteArraySet();
    public Set<String> LJ = new CopyOnWriteArraySet();
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;

    public final void LIZ() {
        Set<String> set = this.LIZIZ;
        String[] strArr = LJIIIZ;
        TTNetThrottle.stop((String[]) set.toArray(strArr), 1);
        TTNetThrottle.stop((String[]) this.LIZJ.toArray(strArr), 2);
        TTNetThrottle.stop((String[]) this.LIZLLL.toArray(strArr), 4);
        TTNetThrottle.stop((String[]) this.LJ.toArray(strArr), 8);
    }
}

package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722710SWn {
    public final Function2<Comment, Long, Unit> LIZ;
    public int LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public final ConcurrentHashMap<Comment, Long> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Comment, Long> LIZJ = new ConcurrentHashMap<>();
    public final Set<String> LJII = Collections.synchronizedSet(new HashSet());
    public final Set<String> LJIIIIZZ = Collections.synchronizedSet(new HashSet());

    public final void LIZ() {
        for (Map.Entry<Comment, Long> entry : this.LIZIZ.entrySet()) {
            Comment key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            if (jLongValue != 0) {
                this.LIZIZ.put(entry.getKey(), 0L);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                ConcurrentHashMap<Comment, Long> concurrentHashMap = this.LIZJ;
                Long l = concurrentHashMap.get(key);
                concurrentHashMap.put(key, Long.valueOf((l != null ? l.longValue() : 0L) + (jCurrentTimeMillis >= ((long) this.LIZLLL) ? jCurrentTimeMillis : 0L)));
            }
        }
    }

    public final void LIZLLL() {
        Iterator<T> it2 = this.LIZIZ.keySet().iterator();
        while (it2.hasNext()) {
            this.LIZIZ.put((Comment) it2.next(), Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C722710SWn(Function2<? super Comment, ? super Long, Unit> function2) {
        this.LIZ = function2;
    }

    public final void LIZIZ(Comment comment) {
        if (comment == null) {
            return;
        }
        this.LIZIZ.put(comment, Long.valueOf(System.currentTimeMillis()));
    }

    public final void LIZJ(Comment comment) {
        Long l;
        long jCurrentTimeMillis;
        String cid;
        if (comment != null && (l = this.LIZIZ.get(comment)) != null) {
            long jLongValue = l.longValue();
            long jLongValue2 = 0;
            if (jLongValue == 0) {
                jCurrentTimeMillis = 0;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            }
            if (this.LIZIZ.containsKey(comment)) {
                ConcurrentHashMap<Comment, Long> concurrentHashMap = this.LIZJ;
                Long l2 = concurrentHashMap.get(comment);
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                concurrentHashMap.put(comment, Long.valueOf(jLongValue2 + jCurrentTimeMillis));
            }
            this.LIZIZ.remove(comment);
            if (C292460BdE.LIZ() && (cid = comment.getCid()) != null && !this.LJII.contains(cid) && this.LJIIIIZZ.contains(cid)) {
                if (this.LJIIIIZZ.size() == 1) {
                    this.LJFF += System.currentTimeMillis() - this.LJI;
                }
                this.LJIIIIZZ.remove(cid);
            }
        }
    }
}

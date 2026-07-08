package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0NeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599030NeX {
    public final ConcurrentHashMap<String, Set<C598560Ndm>> LIZ;
    public final Map<String, Set<C598560Ndm>> LIZIZ;
    public final Set<String> LIZJ;
    public final Set<String> LIZLLL;

    public C599030NeX() {
        ConcurrentHashMap<String, Set<C598560Ndm>> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = concurrentHashMap;
        this.LIZIZ = concurrentHashMap;
        Set<String> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LIZJ = setNewSetFromMap;
        this.LIZLLL = setNewSetFromMap;
    }
}

package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.093Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C093Y extends C093Z {
    public static final C08CX LIZIZ() {
        return C08CX.INSTANCE;
    }

    public static final <T> HashSet<T> LIZJ(T... tArr) {
        HashSet<T> hashSet = new HashSet<>(C2097908Jt.LIZIZ(tArr.length));
        C13LQ.LJJLIIIJL(hashSet, tArr);
        return hashSet;
    }

    public static final <T> LinkedHashSet<T> LIZLLL(T... tArr) {
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(C2097908Jt.LIZIZ(tArr.length));
        C13LQ.LJJLIIIJL(linkedHashSet, tArr);
        return linkedHashSet;
    }

    public static final <T> Set<T> LJ(T... tArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(tArr.length));
        C13LQ.LJJLIIIJL(linkedHashSet, tArr);
        return linkedHashSet;
    }
}

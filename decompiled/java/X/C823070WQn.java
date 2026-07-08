package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823070WQn {
    public boolean LIZ;
    public List<C0WQX> LIZIZ;
    public List<String> LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public C823070WQn() {
        List<C0WQX> listEmptyList = Collections.emptyList();
        C823060WQm.LIZ(listEmptyList);
        this.LIZIZ = listEmptyList;
        List<String> listEmptyList2 = Collections.emptyList();
        C823060WQm.LIZ(listEmptyList2);
        this.LIZJ = listEmptyList2;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.LIZLLL = timeUnit.toMillis(5L);
        this.LJ = timeUnit.toMillis(5L);
        this.LJFF = timeUnit.toMillis(15L);
    }
}

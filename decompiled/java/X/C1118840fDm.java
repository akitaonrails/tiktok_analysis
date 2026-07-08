package X;

import android.graphics.Point;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118840fDm {
    public final C1118830fDl LIZ;
    public final Pair<Point, Point> LIZIZ;
    public int LIZJ;
    public final long LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1118840fDm(C1118830fDl c1118830fDl, Pair<? extends Point, ? extends Point> pair, int i, long j) {
        this.LIZ = c1118830fDl;
        this.LIZIZ = pair;
        this.LIZJ = i;
        this.LIZLLL = j;
    }

    public /* synthetic */ C1118840fDm(C1118830fDl c1118830fDl, Pair pair, int i, long j, int i2) {
        this(c1118830fDl, pair, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j);
    }
}

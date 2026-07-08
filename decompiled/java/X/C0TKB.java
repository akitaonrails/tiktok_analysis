package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TKB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKB<T> {
    public final String LIZ;
    public final C0TKE<T>[] LIZJ;
    public final String[] LJ;
    public final List<Pair<String, Float>> LJFF = new ArrayList();
    public final double LIZIZ = 0.0d;
    public final String LIZLLL = "app";

    public C0TKB(String str, String[] strArr, C0TKE... c0tkeArr) {
        this.LIZ = str;
        this.LJ = strArr;
        this.LIZJ = c0tkeArr;
        for (C0TKE c0tke : c0tkeArr) {
            ((ArrayList) this.LJFF).add(new Pair(c0tke.LIZ, Double.valueOf(c0tke.LIZIZ)));
        }
    }
}

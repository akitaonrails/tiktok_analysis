package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847260XLo {
    public final List<String> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final String LJFF;
    public String LJI;
    public long LJII;
    public Map<String, String> LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public List<Integer> LJIIJ;
    public boolean LJIIJJI;

    public C847260XLo(int i, int i2, int i3, long j, String str, List list) {
        if (!list.isEmpty()) {
            this.LIZ = list;
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = i3;
            this.LJ = j;
            this.LJFF = str;
            return;
        }
        throw new IllegalArgumentException("urls must not be empty.");
    }
}

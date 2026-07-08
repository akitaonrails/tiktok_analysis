package X;

import android.os.SystemClock;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0oyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1493660oyK {
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public List<String> LIZJ;
    public List<String> LIZLLL;
    public List<Pattern> LJ;
    public Set<Integer> LJFF;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public volatile long LJIIJ = SystemClock.uptimeMillis();
    public volatile int LJIIIZ = 0;
    public int LJII = Integer.MAX_VALUE;
    public int LJI = 0;
    public volatile boolean LJIIJJI = false;
    public final String LJIIIIZZ = UUID.randomUUID().toString();
    public boolean LJIILIIL = false;
    public int LJIIL = 4000;
    public boolean LJIILJJIL = true;
    public String LJIILL = null;

    public C1493660oyK(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}

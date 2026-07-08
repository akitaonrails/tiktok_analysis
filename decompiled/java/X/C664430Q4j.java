package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Q4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664430Q4j implements InterfaceC581770Mrn {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJFF;
    public static boolean LJI;
    public static long LJII;
    public static long LJIIIZ;
    public static final C664430Q4j LIZ = new C664430Q4j();
    public static long LJ = -1;
    public static long LJIIIIZZ = -1;

    @Override // X.InterfaceC581770Mrn
    public final void LIZJ() {
        LIZIZ = false;
        LIZJ = false;
        LIZLLL = false;
        LJFF = false;
        LJI = false;
        LJIIIIZZ = -1L;
        LJ = -1L;
        LJII = 0L;
        LJIIIZ = 0L;
    }

    @Override // X.InterfaceC581770Mrn
    public final long LIZIZ() {
        return LJIIIIZZ;
    }

    @Override // X.InterfaceC581770Mrn
    public final long LIZLLL() {
        return LJII;
    }

    @Override // X.InterfaceC581770Mrn
    public final long LJFF() {
        return LJIIIZ;
    }

    public static Map LJI(long j) {
        return C2097608Jq.LJIIIIZZ(new Pair("search_is_fullscreen_begin", C436190H8n.LIZIZ(LIZIZ)), new Pair("search_is_fullscreen_end", C436190H8n.LIZIZ(LIZJ)), new Pair("search_duration_inner", String.valueOf(LJII)), new Pair("search_duration_outer", String.valueOf(LJIIIZ)), new Pair("RD_play_duration_sum_differential", String.valueOf(Math.abs(j - (LJIIIZ + LJII)))));
    }

    @Override // X.InterfaceC581770Mrn
    public final void LIZ(long j) {
        if (!LIZLLL) {
            LIZLLL = true;
            LIZIZ = true;
        }
        if (LJFF) {
            LJFF = false;
        } else {
            LJIIIIZZ = j;
        }
    }

    @Override // X.InterfaceC581770Mrn
    public final Map LJ(long j, Aweme aweme) {
        LIZJ = true;
        aweme.getAid();
        if (LJIIIIZZ != -1) {
            LJII += System.currentTimeMillis() - LJIIIIZZ;
        }
        return LJI(j);
    }
}

package X;

import android.text.TextUtils;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Qod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681730Qod extends AbstractC681720Qoc {
    public static volatile C681730Qod LLIZ;

    public static C681730Qod LJIILIIL() {
        if (LLIZ == null) {
            synchronized (C681730Qod.class) {
                try {
                    if (LLIZ == null) {
                        LLIZ = new C681730Qod();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZ;
    }

    public C681730Qod() {
        this.LL = 10;
    }

    public static final void LJIIL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C844470XAv.LIZ.getClass();
        KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "music_sp", 0).erase("music_search_history");
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0QPN c0qpn = new C0QPN();
        c0qpn.LJIIZILJ("key", "music_search_history");
        c0qpn.LJIIZILJ("operation", "delete");
        c0qpn.LJIIZILJ("type", "keva");
        c0qpn.LJJIJL(jCurrentTimeMillis2);
        c0qpn.LJIILJJIL();
    }

    @Override // X.AbstractC681720Qoc
    public final String LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C844470XAv.LIZ.getClass();
        String string = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "music_sp", 0).getString("music_search_history_v2", "");
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0QPN c0qpn = new C0QPN();
        c0qpn.LJIIZILJ("key", "music_search_history_v2");
        c0qpn.LJIIZILJ("operation", "get");
        c0qpn.LJIIZILJ("type", "keva");
        c0qpn.LJJIJL(jCurrentTimeMillis2);
        c0qpn.LJIILJJIL();
        return string;
    }

    @Override // X.AbstractC681720Qoc
    public final List<MusicSearchHistory> LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C844470XAv.LIZ.getClass();
        String string = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "music_sp", 0).getString("music_search_history", "");
        List<MusicSearchHistory> listLIZJ = !TextUtils.isEmpty(string) ? JsonParseUtils.LIZJ(MusicSearchHistory.class, string) : new ArrayList<>();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0QPN c0qpn = new C0QPN();
        c0qpn.LJIIZILJ("key", "music_search_history");
        c0qpn.LJIIZILJ("operation", "get");
        c0qpn.LJIIZILJ("type", "keva");
        c0qpn.LJJIJL(jCurrentTimeMillis2);
        c0qpn.LJIILJJIL();
        return listLIZJ;
    }

    @Override // X.AbstractC681720Qoc
    public final void LJIIJ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C681770Qoh.LIZ(str, "music_search_history_v2");
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0QPN c0qpn = new C0QPN();
        c0qpn.LJIIZILJ("key", "music_search_history_v2");
        c0qpn.LJIIZILJ("operation", "update");
        c0qpn.LJIIZILJ("type", "keva");
        c0qpn.LJJIJL(jCurrentTimeMillis2);
        c0qpn.LJIILJJIL();
    }
}

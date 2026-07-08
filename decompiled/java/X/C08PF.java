package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.shadowhook.ShadowHook;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.08PF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PF {
    public static C08PF LIZ;

    static {
        LoadSoLancet.LIZJ("anrthanos");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("anrthanos");
        LoadSoLancet.LJ(jUptimeMillis, "anrthanos");
        LoadSoLancet.LIZLLL(jUptimeMillis, "anrthanos");
        LoadSoLancet.LIZIZ("anrthanos");
        C2112108Pf c2112108Pf = new C2112108Pf();
        c2112108Pf.LIZ = C08PL.SHARED.value;
        c2112108Pf.LIZIZ = true;
        ShadowHook.init(c2112108Pf.LIZ());
    }
}

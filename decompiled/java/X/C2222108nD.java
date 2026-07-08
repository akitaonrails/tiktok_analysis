package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.08nD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2222108nD {
    public static Context LIZ;

    public static void LIZ(String str) {
        Context context = LIZ;
        if (context == null) {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            return;
        }
        Librarian.LJI(context, str);
    }
}

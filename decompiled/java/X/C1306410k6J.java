package X;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k6J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306410k6J extends C09AY implements Function0<Object> {
    public C1306410k6J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C054G c054g = C1306520k6U.LIZ;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C1307940k8m.LIZIZ().isDebug();
        }
        try {
            LoadSoLancet.LIZJ("starship_wrapper");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("starship_wrapper");
            LoadSoLancet.LJ(jUptimeMillis, "starship_wrapper");
            LoadSoLancet.LIZLLL(jUptimeMillis, "starship_wrapper");
            LoadSoLancet.LIZIZ("starship_wrapper");
            return Unit.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadLibrary error:");
            sbLIZ.append(e.getMessage());
            return Integer.valueOf(Log.e("Starship-Strategy", C2188811AlT.LIZIZ(sbLIZ)));
        }
    }
}

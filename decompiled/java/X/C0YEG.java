package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: renamed from: X.0YEG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEG {
    public final Function0<Long> LIZ;
    public final Function0<Long> LIZIZ;
    public final Function2<Long, Long, Unit> LIZJ;
    public final C868780Y6i LIZLLL;
    public final C0Y7Q LJ;
    public final C0YEK LJFF;
    public final Function0<Boolean> LJI;
    public volatile long LJII;

    public final void LIZ(String str) {
        long jLIZ = this.LJ.LIZ();
        if (jLIZ - this.LJII < Mp4ScreenVideoLoadTimeout.CONTROL) {
            return;
        }
        this.LJII = jLIZ;
        long jLongValue = this.LIZ.invoke().longValue();
        long jLongValue2 = this.LIZIZ.invoke().longValue();
        C868780Y6i c868780Y6i = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("] invalid session access: expectedUid=");
        sbLIZ.append(jLongValue);
        sbLIZ.append(", actualUid=");
        sbLIZ.append(jLongValue2);
        c868780Y6i.LJIIIIZZ("InvalidSessionNotifier", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!this.LJI.invoke().booleanValue()) {
            C868780Y6i c868780Y6i2 = this.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(str);
            sbLIZ2.append("] onInvalidAccess suppressed (enableAutoLoginOnInvalidSession=false)");
            C868780Y6i.LJIILJJIL(c868780Y6i2, "InvalidSessionNotifier", C2188811AlT.LIZIZ(sbLIZ2), 4);
            return;
        }
        try {
            this.LIZJ.invoke(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6i3 = this.LIZLLL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onInvalidSessionAccess callback threw: ");
            sbLIZ3.append(e.getMessage());
            c868780Y6i3.LJIIIIZZ("InvalidSessionNotifier", C2188811AlT.LIZIZ(sbLIZ3), null);
        }
    }

    public C0YEG(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142, AwS628S0100000_14 awS628S0100000_14, C868780Y6i c868780Y6i, C0YEK c0yek, AwS558S0100000_14 awS558S0100000_143) {
        C0YCY c0ycy = new C0YCY();
        this.LIZ = awS558S0100000_14;
        this.LIZIZ = awS558S0100000_142;
        this.LIZJ = awS628S0100000_14;
        this.LIZLLL = c868780Y6i;
        this.LJ = c0ycy;
        this.LJFF = c0yek;
        this.LJI = awS558S0100000_143;
    }
}

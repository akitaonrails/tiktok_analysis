package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062850dlT {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ;
    public final C1057930ddX LIZIZ;
    public Function1<? super SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final long LJ;
    public EnumC1062840dlS LJFF;
    public Long LJI;

    public C1062850dlT() {
        throw null;
    }

    public final String toString() {
        C1537480q70 hybridContext;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IBECacheCell(containerId=");
        InterfaceC1541990qEH kitView = this.LIZ.getKitView();
        sbLIZ.append((kitView == null || (hybridContext = kitView.getHybridContext()) == null) ? null : hybridContext.containerId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1062850dlT(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, C1057930ddX c1057930ddX, Function1 function1, Function0 function0) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        EnumC1062840dlS enumC1062840dlS = EnumC1062840dlS.LL;
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LIZIZ = c1057930ddX;
        this.LIZJ = function1;
        this.LIZLLL = function0;
        this.LJ = jElapsedRealtime;
        this.LJFF = enumC1062840dlS;
        this.LJI = null;
    }
}

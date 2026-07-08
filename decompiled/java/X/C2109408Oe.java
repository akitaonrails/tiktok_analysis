package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2109408Oe extends C09AY implements Function0<String> {
    public C2109408Oe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        Application applicationLIZ = C1BWL.LIZ();
        try {
            return String.valueOf(C786410Ut5.Y3(applicationLIZ.getPackageManager(), applicationLIZ.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown_");
            sbLIZ.append(System.currentTimeMillis());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}

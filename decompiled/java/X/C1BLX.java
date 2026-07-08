package X;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.1BLX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLX extends C1BLC {
    public final Locale LJIILLIIL;

    @Override // X.C1BLC
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C1BLC
    public final boolean LJ() {
        return C1BLS.LIZIZ(this.LJIILLIIL);
    }

    @Override // X.C1BLC
    public final void LJI(Map<String, String> map) {
        map.put("task_type", String.valueOf(this.LJIIIIZZ));
        map.put("name", "df_language");
        map.put("language", C786410Ut5.t2(this.LJIILLIIL));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1BLX(Locale locale, boolean z, boolean z2, C1BLE c1ble, AnonymousClass1405 anonymousClass1405) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("df_language_");
        sbLIZ.append(C786410Ut5.t2(locale));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("com.ss.android.ugc.aweme.dflanguage.");
        sbLIZ2.append(C786410Ut5.t2(locale));
        super(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), z, z2, c1ble, anonymousClass1405, true);
        this.LJIILLIIL = locale;
    }
}

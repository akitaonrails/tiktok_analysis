package X;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: X.0eNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086340eNM {
    public boolean LIZ;
    public int LIZIZ;
    public C21626719kP LIZJ;

    public final C21627319kV LIZ() {
        return (this.LIZIZ == 2 && this.LIZJ == C21627319kV.LIZLLL) ? this.LIZ ? C21627319kV.LJII : C21627319kV.LJI : new C21627319kV(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C1086340eNM() {
        this.LIZ = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.LIZJ = C21627319kV.LIZLLL;
        this.LIZIZ = 2;
    }

    public C1086340eNM(boolean z) {
        this.LIZ = z;
        this.LIZJ = C21627319kV.LIZLLL;
        this.LIZIZ = 2;
    }
}

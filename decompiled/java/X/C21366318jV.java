package X;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: renamed from: X.18jV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21366318jV {
    public static final C1638280sja LIZLLL = new C1638280sja();
    public static final C1663470tOD<InterfaceC21358518iF> LJ = new C1663470tOD<>(new C21366418jW());
    public static InterfaceC2219141BtI LJFF;
    public final Context LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final void LIZ() {
        String str;
        if (this.LIZ == null || (str = this.LIZIZ) == null || str.length() == 0) {
            return;
        }
        C1638280sja c1638280sja = LIZLLL;
        c1638280sja.getClass();
        InterfaceC21358518iF value = LJ.getValue(c1638280sja, C1638280sja.LIZ[0]);
        if (value == null) {
            value = new InterfaceC21358518iF() { // from class: X.18iE
                @Override // X.InterfaceC21358518iF
                public final void LIZ(Context context, int i, String str2) {
                    if (context != null && str2 != null && str2.length() != 0) {
                        C786410Ut5.re(Toast.makeText(context, str2, i));
                    }
                }
            };
        }
        value.LIZ(this.LIZ, this.LIZJ, this.LIZIZ);
    }

    public C21366318jV(Context context, String str, int i, int i2) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}

package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.09fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2428709fR {
    public final String LIZ;
    public final SimpleDateFormat LIZIZ;

    public C2428709fR() {
        C0VSJ c0vsj = new C0VSJ(LIZIZ());
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        this.LIZ = c0vsj.getAbsolutePath();
        this.LIZIZ = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3());
        sbLIZ.append("/DCIM/Camera/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        return C786410Ut5.k4(Locale.getDefault(), "%s/IMG_%s.png", new Object[]{this.LIZ, this.LIZIZ.format(new Date())});
    }
}

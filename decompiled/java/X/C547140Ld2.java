package X;

import com.bytedance.aigc.proto.Level;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ld2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547140Ld2 {
    public final C547200Ld8 LIZ;

    public C547140Ld2(C547200Ld8 c547200Ld8, C547180Ld6 c547180Ld6) {
        this.LIZ = c547200Ld8;
    }

    public final void LIZ(String str, String str2) {
        C547130Ld1.LIZ(C547160Ld4.LIZIZ(), this.LIZ, str, str2);
    }

    public final void LIZJ(String str, String str2) {
        String strLIZIZ = C547160Ld4.LIZIZ();
        C547200Ld8 c547200Ld8 = this.LIZ;
        InterfaceC1631630sYr<? super String, ? super String, ? super String, ? super Throwable, Unit> interfaceC1631630sYr = C547130Ld1.LIZ;
        if (interfaceC1631630sYr != null) {
            String string = Level.INFO.toString();
            if (strLIZIZ == null) {
                strLIZIZ = C547160Ld4.LIZIZ();
            }
            interfaceC1631630sYr.invoke(string, C547150Ld3.LIZ(strLIZIZ, c547200Ld8.LIZIZ.toString(), str), str2, null);
        }
    }

    public final void LIZIZ(String str, String str2, Throwable th) {
        C547130Ld1.LIZIZ(C547160Ld4.LIZIZ(), this.LIZ, str, str2, th);
    }
}

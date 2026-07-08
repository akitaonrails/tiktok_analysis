package X;

import com.bytedance.aigc.proto.Level;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ld1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547130Ld1 {
    public static InterfaceC1631630sYr<? super String, ? super String, ? super String, ? super Throwable, Unit> LIZ;
    public static final C547140Ld2 LIZIZ = new C547140Ld2(C547300LdI.LIZ, C548010LeR.LIZ);

    public static void LIZ(String str, C547200Ld8 c547200Ld8, String str2, String str3) {
        InterfaceC1631630sYr<? super String, ? super String, ? super String, ? super Throwable, Unit> interfaceC1631630sYr = LIZ;
        if (interfaceC1631630sYr != null) {
            String string = Level.DEBUG.toString();
            if (str == null) {
                str = C547160Ld4.LIZIZ();
            }
            interfaceC1631630sYr.invoke(string, C547150Ld3.LIZ(str, c547200Ld8.LIZIZ.toString(), str2), str3, null);
        }
    }

    public static void LIZIZ(String str, C547200Ld8 c547200Ld8, String str2, String str3, Throwable th) {
        InterfaceC1631630sYr<? super String, ? super String, ? super String, ? super Throwable, Unit> interfaceC1631630sYr = LIZ;
        if (interfaceC1631630sYr != null) {
            String string = Level.ERROR.toString();
            if (str == null) {
                str = C547160Ld4.LIZIZ();
            }
            interfaceC1631630sYr.invoke(string, C547150Ld3.LIZ(str, c547200Ld8.LIZIZ.toString(), str2), str3, th);
        }
    }
}

package X;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.10qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19373810qu {
    public static final EnumC19373110qn LIZ = EnumC19373110qn.PUBLIC;

    static {
        LIZIZ();
        Logger.getLogger(C19373810qu.class.getName());
    }

    public static String LIZIZ() {
        return C786410Ut5.k4(Locale.US, "%d.%d.%d%s", new Object[]{4, 33, 0, ""});
    }

    public static void LIZ(EnumC19373110qn enumC19373110qn, String str) {
        EnumC19373110qn enumC19373110qn2;
        String str2 = System.getenv("TEMPORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if ((str2 != null && str2.equals("true")) || enumC19373110qn == (enumC19373110qn2 = LIZ)) {
            return;
        }
        final String strK4 = C786410Ut5.k4(Locale.US, "Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", new Object[]{str, enumC19373110qn, enumC19373110qn2});
        throw new RuntimeException(strK4) { // from class: X.10qv
        };
    }
}

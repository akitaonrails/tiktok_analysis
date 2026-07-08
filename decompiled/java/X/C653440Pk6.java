package X;

import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C653440Pk6 implements C0PTA {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static String LJ = "";
    public static String LJFF = "";
    public static int LJI = -1;
    public static Map<String, String> LJII;
    public static boolean LJIIIIZZ;

    @InterfaceC1294060jmO
    public static String LIZIZ() {
        C644910PRh c644910PRhLIZJ;
        String str;
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        return (interfaceC649890PeNLIZ == null || (c644910PRhLIZJ = interfaceC649890PeNLIZ.LIZJ()) == null || (str = c644910PRhLIZJ.LIZ) == null) ? "" : str;
    }

    public static void LIZ(int i, View view, String str, Map map) {
        if (view == null) {
            return;
        }
        LJFF = C660870Pw5.LIZ(view).LJ;
        if (str == null) {
            str = "";
        }
        LJ = str;
        LJI = i;
        LJII = map;
    }
}

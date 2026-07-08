package X;

import android.content.Context;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540230LGr {
    public static final boolean LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (C838410Wul.LIZ(context, "android.permission.READ_MEDIA_IMAGES") == 0 && C838410Wul.LIZ(context, "android.permission.READ_MEDIA_VIDEO") == 0) {
                return true;
            }
            return false;
        }
        if (C838410Wul.LIZ(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(C19EG c19eg, InterfaceC540220LGq interfaceC540220LGq, Function0 function0) {
        String[] strArr;
        String string = null;
        if (interfaceC540220LGq == null) {
            if (LIZ(c19eg)) {
                C1638280sja c1638280sja = C21366318jV.LIZLLL;
                if (c19eg != null) {
                    c1638280sja.getClass();
                    string = c19eg.getString(2131839204);
                }
                c1638280sja.getClass();
                new C21366318jV(c19eg, string, 0, 1).LIZ();
                return;
            }
            function0.invoke();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        interfaceC540220LGq.LIZIZ(c19eg, new AwS552S0100000_8((Function0) null, (Function0<Unit>) 960), new AwS552S0100000_8((Function0) null, (Function0<Unit>) 961), new AwS286S0300000_8(strArr, (String[]) null, (Function0<Unit>) function0, (Function0<Unit>) 9));
    }
}

package X;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0I8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461690I8p {
    public static C0ZSM LIZ(EnumC461660I8m enumC461660I8m, ViewGroup viewGroup, Function0 function0, Function0 function02, Function0 function03) {
        if (C444960Hcc.LIZIZ()) {
            int i = C461680I8o.LIZ[enumC461660I8m.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    enumC461660I8m = EnumC461660I8m.START;
                }
            } else {
                enumC461660I8m = EnumC461660I8m.END;
            }
        }
        return new C0ZSM(enumC461660I8m, viewGroup, function0, function02, function03);
    }
}

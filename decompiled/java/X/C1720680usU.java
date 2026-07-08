package X;

import android.content.Context;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0usU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720680usU {
    public static EnumC1720670usT LIZ(String str) {
        if (u.LJIJI(str, "light", true)) {
            str = EnumC1720670usT.LIGHT.getValue();
        } else if (u.LJIJI(str, "dark", true)) {
            str = EnumC1720670usT.DARK.getValue();
        }
        for (EnumC1720670usT enumC1720670usT : EnumC1720670usT.getEntries()) {
            if (u.LJIJI(enumC1720670usT.getValue(), str, true)) {
                return enumC1720670usT;
            }
        }
        return EnumC1720670usT.NORMAL;
    }

    public static Context LIZIZ(Context context, String str) {
        if (str != null && str.length() != 0) {
            EnumC1720670usT.Companion.getClass();
            return LIZJ(LIZ(str), context);
        }
        return context;
    }

    public static Context LIZJ(EnumC1720670usT enumC1720670usT, Context context) {
        if (enumC1720670usT == null) {
            return context;
        }
        boolean z = false;
        if (enumC1720670usT == EnumC1720670usT.DARK || (!C960203pA.LIZIZ(context) && enumC1720670usT == EnumC1720670usT.OPPOSITE)) {
            z = true;
        }
        return new C1361400lX0(context, C1385040m98.LIZJ(z));
    }
}

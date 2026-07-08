package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00Iy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C057400Iy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(566));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(568));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(567));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(565));
    public static final C01GW LJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(564));

    public static String LIZIZ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect_tool_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLIZ = LIZ(context, strLIZIZ, (Map) LIZ.getValue());
        if (strLIZ == null) {
            return LJ(context, strLIZIZ, a0.LJJLJLI(str, "_", str));
        }
        return strLIZ;
    }

    public static String LIZJ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AME_editEffect_inspector_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLIZ = LIZ(context, strLIZIZ, (Map) LIZIZ.getValue());
        if (strLIZ == null) {
            return LJ(context, strLIZIZ, a0.LJJLJLI(str, "_", str));
        }
        return strLIZ;
    }

    public static String LIZLLL(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect_tool_");
        sbLIZ.append(str);
        if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "effect_tool_Second")) {
            return context.getResources().getString(R.string.effect_tool_timerhits);
        }
        return LIZIZ(context, str);
    }

    public static String LIZ(Context context, String str, Map map) {
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return context.getString(num.intValue());
        }
        return null;
    }

    public static String LJ(Context context, String str, String str2) {
        int iN3 = C786410Ut5.n3(context.getResources(), str, "string", context.getPackageName());
        if (iN3 > 0) {
            return context.getResources().getString(iN3);
        }
        return str2;
    }
}

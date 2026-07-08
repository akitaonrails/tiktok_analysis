package X;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741660vQK {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(345));

    public static AbstractC21206917yt LIZ(Context context, EnumC1124020fM8 enumC1124020fM8) {
        Function1 function1 = (Function1) ((Map) LIZ.getValue()).get(enumC1124020fM8);
        if (function1 != null) {
            return (AbstractC21206917yt) function1.invoke(context);
        }
        return null;
    }

    public static void LIZIZ(EnumC1124020fM8 enumC1124020fM8, Function1 function1) {
        ((Map) LIZ.getValue()).put(enumC1124020fM8, function1);
    }
}

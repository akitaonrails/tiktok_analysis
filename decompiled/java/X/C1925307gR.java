package X;

import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.07gR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1925307gR {
    public static final boolean LIZ(n nVar, String str) {
        Boolean bool = (Boolean) LIZJ(nVar, str, AFwS231S0000000_3.get$arr$(202), AFwS231S0000000_3.get$arr$(203));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static String LIZIZ(n nVar, String str) {
        String str2 = (String) LIZJ(nVar, str, AFwS231S0000000_3.get$arr$(206), AFwS231S0000000_3.get$arr$(207));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static final <T> T LIZJ(n nVar, String str, Function1<? super q, Boolean> function1, Function1<? super q, ? extends T> function12) {
        k kVarLJJIIZ;
        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(204);
        AFwS231S0000000_3 aFwS231S0000000_32 = AFwS231S0000000_3.get$arr$(205);
        if (str == null || !nVar.LJJIJIIJIL(str) || (kVarLJJIIZ = nVar.LJJIIZ(str)) == null || !((Boolean) aFwS231S0000000_3.invoke(kVarLJJIIZ)).booleanValue()) {
            return null;
        }
        aFwS231S0000000_32.invoke(kVarLJJIIZ);
        if (!function1.invoke(kVarLJJIIZ).booleanValue()) {
            return null;
        }
        return function12.invoke(kVarLJJIIZ);
    }
}

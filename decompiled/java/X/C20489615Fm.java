package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20489615Fm {
    public static final Map<Pair<EnumC964170bCJ, EnumC964170bCJ>, Function0<Boolean>> LIZ;

    static {
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.PUNISH_START;
        EnumC964170bCJ enumC964170bCJ2 = EnumC964170bCJ.SETTLE_START;
        EnumC964170bCJ enumC964170bCJ3 = EnumC964170bCJ.DRAW;
        EnumC964170bCJ enumC964170bCJ4 = EnumC964170bCJ.MATCH_END;
        LIZ = C2097608Jq.LJIIIIZZ(new Pair(new Pair(enumC964170bCJ, enumC964170bCJ2), AFwS221S0000000_31.get$arr$(35)), new Pair(new Pair(enumC964170bCJ, enumC964170bCJ3), AFwS221S0000000_31.get$arr$(36)), new Pair(new Pair(enumC964170bCJ3, enumC964170bCJ2), AFwS221S0000000_31.get$arr$(37)), new Pair(new Pair(enumC964170bCJ4, enumC964170bCJ2), AFwS221S0000000_31.get$arr$(38)), new Pair(new Pair(enumC964170bCJ4, enumC964170bCJ), AFwS221S0000000_31.get$arr$(39)), new Pair(new Pair(enumC964170bCJ4, enumC964170bCJ3), AFwS221S0000000_31.get$arr$(40)), new Pair(new Pair(EnumC964170bCJ.NONE, enumC964170bCJ4), AFwS221S0000000_31.get$arr$(41)));
    }

    public static final boolean LIZ(EnumC964170bCJ enumC964170bCJ, EnumC964170bCJ enumC964170bCJ2) {
        Function0<Boolean> function0 = LIZ.get(new Pair(enumC964170bCJ, enumC964170bCJ2));
        if (function0 == null || function0.invoke().booleanValue()) {
            return false;
        }
        return true;
    }
}

package X;

import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048720dOg {
    public static final C01GW<C1048720dOg> LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS204S0000000_16.get$arr$(82));
    public final C603820NmG<String, C1048580dOS> LIZ = new C603820NmG<>(100);
    public final C603820NmG<String, C1048730dOh> LIZIZ = new C603820NmG<>(100);

    public final int LIZ(String str) {
        C603820NmG<String, C1048730dOh> c603820NmG;
        C1048730dOh c1048730dOhLIZJ;
        if (str == null || (c603820NmG = this.LIZIZ) == null || (c1048730dOhLIZJ = c603820NmG.LIZJ(str)) == null) {
            return 0;
        }
        return c1048730dOhLIZJ.LIZ;
    }

    public final boolean LIZIZ(String str) {
        C603820NmG<String, C1048730dOh> c603820NmG;
        C1048730dOh c1048730dOhLIZJ;
        if (str == null || (c603820NmG = this.LIZIZ) == null || (c1048730dOhLIZJ = c603820NmG.LIZJ(str)) == null) {
            return false;
        }
        return c1048730dOhLIZJ.LIZIZ;
    }
}

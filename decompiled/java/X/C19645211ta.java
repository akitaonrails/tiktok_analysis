package X;

import Y.ACallableS21S1000000_3;
import Y.AfS54S1100000_29;
import Y.AkS490S0100000_29;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19645211ta {
    public static C11JF LIZ(String str, long j, Function1 function1, Function1 function12, int i) {
        AFwS218S0000000_29 aFwS218S0000000_29;
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            function1 = AFwS273S0000000_29.get$arr$(346);
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = null;
        if ((i & 8) != 0) {
            aFwS218S0000000_29 = AFwS218S0000000_29.get$arr$(368);
        } else {
            aFwS218S0000000_29 = null;
        }
        if (str.length() > 100) {
            function12.invoke(new C19641511sz(str, false, C20467080b.LIZIZ(2131826546)));
        } else if (a0.LJJJIL(str)) {
            function12.invoke(new C19641511sz(str, false, C20467080b.LIZIZ(2131826645)));
        } else if (C19651811ue.LIZ(str)) {
            function12.invoke(new C19641511sz(str, false, C20467080b.LIZIZ(2131826547)));
        } else {
            if (str.length() == 100) {
                String strLIZIZ = C20467080b.LIZIZ(2131826545);
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                function1.invoke(strLIZIZ);
            }
            interfaceC420801kMLJJLL = C11NZ.LJJJJI(new ACallableS21S1000000_3(str, 8)).LJJI(j, TimeUnit.MILLISECONDS).LJJJ(new AkS490S0100000_29(aFwS218S0000000_29, 20), false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(function12, 206), new AfS54S1100000_29(str, function12, 0));
        }
        return (C11JF) interfaceC420801kMLJJLL;
    }
}

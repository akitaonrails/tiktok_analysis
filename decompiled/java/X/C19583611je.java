package X;

import Y.ACListenerS151S0100000_16;
import Y.ACListenerS162S0100000_28;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19583611je {
    public static C450820Hm4 LIZ(String str, Function0 function0) {
        C450820Hm4 c450820Hm4 = new C450820Hm4();
        c450820Hm4.LIZJ = str;
        c450820Hm4.LIZLLL = new ACListenerS151S0100000_16(function0, 54);
        return c450820Hm4;
    }

    public static C450840Hm6 LIZIZ(String str, int i, Integer num, Function0 function0) {
        C450840Hm6 c450840Hm6 = new C450840Hm6();
        c450840Hm6.LIZLLL = str;
        c450840Hm6.LIZ = i;
        if (num != null) {
            c450840Hm6.LIZIZ = num.intValue();
        }
        c450840Hm6.LJFF = new ACListenerS162S0100000_28(function0, 76);
        return c450840Hm6;
    }
}

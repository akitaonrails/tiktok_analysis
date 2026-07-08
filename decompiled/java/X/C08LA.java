package X;

import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS1S1010000_3;

/* JADX INFO: renamed from: X.08LA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LA {
    public static List LIZ(C0VSJ c0vsj) {
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            return C09RB.LJJII(C09RB.LJI(C09RB.LJIIIZ(new C08LY(C09RB.LJIIIZ(C08QB.LJIILIIL(c0vsj), AFwS231S0000000_3.get$arr$(187)), new AwS1S1010000_3(true, c0vsj.getAbsolutePath(), 2)), AFwS229S0000000_2.get$arr$(726))));
        }
        return C13BV.INSTANCE;
    }
}

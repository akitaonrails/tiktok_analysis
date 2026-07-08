package X;

import Y.AObjectS94S1100000_23;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478090oZD {
    public static final C01GW LIZ(Object obj, String str) {
        AObjectS94S1100000_23 aObjectS94S1100000_23 = new AObjectS94S1100000_23(obj, str, 1);
        if (C1480850odf.LIZJ.optGlobalAppAnr()) {
            return C452501pT.LIZ(EnumC452301pR.NONE, aObjectS94S1100000_23);
        }
        return C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, aObjectS94S1100000_23);
    }

    public static final C01GW LIZIZ(final Object obj, final String str) {
        Function0 function0 = new Function0() { // from class: X.0oZU
            public final /* synthetic */ boolean LLILLL = true;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new C1479060oam(obj, str, this.LLILLL).LIZ();
            }
        };
        if (C1480850odf.LIZJ.optGlobalAppAnr()) {
            return C452501pT.LIZ(EnumC452301pR.NONE, function0);
        }
        return C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, function0);
    }
}

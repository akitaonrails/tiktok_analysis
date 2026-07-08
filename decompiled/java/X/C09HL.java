package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09HL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HL {
    public static C1A3S LIZ(Context context, String str) {
        C5183020f c5183020f = new C5183020f(context, 369);
        if (Intrinsics.LJFF(str, "recently_viewed")) {
            String str2 = (String) c5183020f.invoke(2131833028);
            c5183020f.invoke(2131833017);
            return new C1A3S(str, str2, (String) c5183020f.invoke(2131833024), (String) c5183020f.invoke(2131833019), (String) c5183020f.invoke(2131833015), (String) c5183020f.invoke(2131833018), (String) c5183020f.invoke(2131833025), (String) c5183020f.invoke(2131833022), new C09HK() { // from class: X.09HB
                @Override // X.C09HK
                public final void LIZ(Function0<Unit> function0) {
                    C675950QfJ.LIZ.getClass();
                    C675950QfJ.LIZ().storeLong("delete_mall_history_record_time", System.currentTimeMillis());
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // X.C09HK
                public final void LIZIZ(InterfaceC497601wk interfaceC497601wk, C1A3P c1a3p, C1A3R c1a3r, AwS399S0200000_33 awS399S0200000_33) {
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C09FB(c1a3p, new C09G1(c1a3r, this, null), new C339801To(awS399S0200000_33, null), null), 3);
                }
            });
        }
        if (Intrinsics.LJFF(str, "search_history")) {
            String string = context.getResources().getString(2131833029);
            c5183020f.invoke(2131833017);
            return new C1A3S(str, string, (String) c5183020f.invoke(2131833023), (String) c5183020f.invoke(2131833020), (String) c5183020f.invoke(2131833016), (String) c5183020f.invoke(2131833018), (String) c5183020f.invoke(2131833025), (String) c5183020f.invoke(2131833022), new C09HI());
        }
        String str3 = (String) c5183020f.invoke(2131833028);
        c5183020f.invoke(2131833017);
        return new C1A3S(str, str3, (String) c5183020f.invoke(2131833024), (String) c5183020f.invoke(2131833019), (String) c5183020f.invoke(2131833015), (String) c5183020f.invoke(2131833018), (String) c5183020f.invoke(2131833025), (String) c5183020f.invoke(2131833022), new C09HK() { // from class: X.09HB
            @Override // X.C09HK
            public final void LIZ(Function0<Unit> function0) {
                C675950QfJ.LIZ.getClass();
                C675950QfJ.LIZ().storeLong("delete_mall_history_record_time", System.currentTimeMillis());
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // X.C09HK
            public final void LIZIZ(InterfaceC497601wk interfaceC497601wk, C1A3P c1a3p, C1A3R c1a3r, AwS399S0200000_33 awS399S0200000_33) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C09FB(c1a3p, new C09G1(c1a3r, this, null), new C339801To(awS399S0200000_33, null), null), 3);
            }
        });
    }
}

package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SOI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SOI {
    public static final C0SOH LIZIZ(Fragment fragment, String str) {
        C0RTY c0rtyLJ;
        if (C294990BhJ.LIZ()) {
            return (C0SOH) new C1559260qg8(new AwS127S1200000_11(fragment, (Fragment) C0SOH.class, (Class<Object>) str, (String) 14), true).getValue();
        }
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(fragment);
        if (assemSupervisorLIZJ != null && (c0rtyLJ = assemSupervisorLIZJ.LJ()) != null) {
            return (C0SOH) c0rtyLJ.LIZJ(C0SOH.class, str);
        }
        return null;
    }

    public static final C0SOH LIZ(Assembler assembler, Fragment fragment, String str) {
        C0SOH c0soh;
        C0RTY c0rtyLJ;
        C0RTY c0rtyLJ2;
        if (C294990BhJ.LIZ()) {
            C0SOH c0soh2 = (C0SOH) new C1559260qg8(new AwS127S1200000_11(fragment, (Fragment) C0SOH.class, (Class<Object>) str, (String) 14), true).getValue();
            if (c0soh2 == null) {
                C0SOH c0soh3 = new C0SOH();
                assembler.DQ2(fragment, new AwS590S0100000_11(c0soh3, 404));
                return c0soh3;
            }
            return c0soh2;
        }
        AssemSupervisor assemSupervisorCQ2 = assembler.CQ2(fragment);
        if (assemSupervisorCQ2 == null || (c0rtyLJ2 = assemSupervisorCQ2.LJ()) == null || (c0soh = (C0SOH) c0rtyLJ2.LIZJ(C0SOH.class, str)) == null) {
            c0soh = new C0SOH();
            AssemSupervisor assemSupervisorCQ22 = assembler.CQ2(fragment);
            if (assemSupervisorCQ22 != null && (c0rtyLJ = assemSupervisorCQ22.LJ()) != null) {
                c0rtyLJ.LIZLLL(c0soh, str, null);
            }
        }
        return c0soh;
    }
}

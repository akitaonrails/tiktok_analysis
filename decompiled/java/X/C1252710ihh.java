package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0ihh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252710ihh {
    public static InterfaceC724720Sbm LIZJ(Fragment fragment, C19719912Dl c19719912Dl) {
        InterfaceC724720Sbm interfaceC724720SbmLIZIZ;
        C724710Sbl c724710SblBQ2 = Assembler.BQ2(C0RPA.LIZ(fragment.requireActivity()), fragment);
        if (c724710SblBQ2 != null && (interfaceC724720SbmLIZIZ = c724710SblBQ2.LIZIZ(C09R7.LIZ(c19719912Dl), null)) != null) {
            return interfaceC724720SbmLIZIZ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static InterfaceC723730SaB LIZLLL(Fragment fragment, C19719912Dl c19719912Dl) {
        InterfaceC723730SaB interfaceC723730SaBLIZJ;
        C724710Sbl c724710SblBQ2 = Assembler.BQ2(C0RPA.LIZ(fragment.requireActivity()), fragment);
        if (c724710SblBQ2 != null && (interfaceC723730SaBLIZJ = c724710SblBQ2.LIZJ(C09R7.LIZ(c19719912Dl), null)) != null) {
            return interfaceC723730SaBLIZJ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static InterfaceC723730SaB LJII(Fragment fragment, C19719912Dl c19719912Dl) {
        C19EG activity;
        C724710Sbl c724710SblBQ2;
        if (!fragment.isAdded() || (activity = fragment.getActivity()) == null || activity.isFinishing() || (c724710SblBQ2 = Assembler.BQ2(C0RPA.LIZ(activity), fragment)) == null) {
            return null;
        }
        return c724710SblBQ2.LIZJ(C09R7.LIZ(c19719912Dl), null);
    }

    public static InterfaceC447510Hgj LJIIIIZZ(AbstractC738140SxQ abstractC738140SxQ, C19719912Dl c19719912Dl) {
        if (LJFF(abstractC738140SxQ, c19719912Dl, null) == null) {
            return null;
        }
        return abstractC738140SxQ.getSupervisor().LJFF().LIZ(C09R7.LIZ(c19719912Dl), null);
    }

    public static InterfaceC447510Hgj LJIIIZ(AssemViewModel assemViewModel, C19719912Dl c19719912Dl) {
        C724710Sbl c724710Sbl;
        C724710Sbl c724710Sbl2 = assemViewModel.hierarchyServiceStore;
        if (c724710Sbl2 == null || c724710Sbl2.LIZIZ(C09R7.LIZ(c19719912Dl), null) == null || (c724710Sbl = assemViewModel.hierarchyServiceStore) == null) {
            return null;
        }
        return c724710Sbl.LIZ(C09R7.LIZ(c19719912Dl), null);
    }

    public static final InterfaceC724720Sbm LIZ(AbstractC738140SxQ abstractC738140SxQ, C19719912Dl c19719912Dl, String str) {
        InterfaceC724720Sbm interfaceC724720SbmLIZIZ = abstractC738140SxQ.getSupervisor().LJFF().LIZIZ(C09R7.LIZ(c19719912Dl), str);
        if (interfaceC724720SbmLIZIZ != null) {
            return interfaceC724720SbmLIZIZ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static final InterfaceC723730SaB LIZIZ(AbstractC738140SxQ abstractC738140SxQ, C19719912Dl c19719912Dl, String str) {
        InterfaceC723730SaB interfaceC723730SaBLIZJ = abstractC738140SxQ.getSupervisor().LJFF().LIZJ(C09R7.LIZ(c19719912Dl), str);
        if (interfaceC723730SaBLIZJ != null) {
            return interfaceC723730SaBLIZJ;
        }
        "No such service or has not been registered.".toString();
        throw new IllegalArgumentException("No such service or has not been registered.");
    }

    public static final InterfaceC724720Sbm LJ(Fragment fragment, C19719912Dl c19719912Dl, String str) {
        C19EG activity;
        C724710Sbl c724710SblBQ2;
        if (!fragment.isAdded() || (activity = fragment.getActivity()) == null || activity.isFinishing() || (c724710SblBQ2 = Assembler.BQ2(C0RPA.LIZ(activity), fragment)) == null) {
            return null;
        }
        return c724710SblBQ2.LIZIZ(C09R7.LIZ(c19719912Dl), str);
    }

    public static final InterfaceC724720Sbm LJFF(AbstractC738140SxQ abstractC738140SxQ, C19719912Dl c19719912Dl, String str) {
        return abstractC738140SxQ.getSupervisor().LJFF().LIZIZ(C09R7.LIZ(c19719912Dl), str);
    }

    public static final InterfaceC723730SaB LJI(AbstractC738140SxQ abstractC738140SxQ, C19719912Dl c19719912Dl, String str) {
        return abstractC738140SxQ.getSupervisor().LJFF().LIZJ(C09R7.LIZ(c19719912Dl), str);
    }

    public static final void LJIIJ(AbstractC738140SxQ abstractC738140SxQ, C19719912Dl c19719912Dl, C2217381BqS c2217381BqS, Function1 function1) {
        abstractC738140SxQ.getSupervisor().LJFF().LJFF(abstractC738140SxQ, C09R7.LIZ(c19719912Dl), new AwS598S0100000_19(c2217381BqS, 918), new AwS381S0200000_15(function1, new C259800zU(), 173));
    }

    public static final void LJIIL(AssemViewModel assemViewModel, C19719912Dl c19719912Dl, C2217381BqS c2217381BqS, Function1 function1) {
        C259800zU c259800zU = new C259800zU();
        C724710Sbl c724710Sbl = assemViewModel.hierarchyServiceStore;
        if (c724710Sbl != null) {
            c724710Sbl.LJFF(assemViewModel, C09R7.LIZ(c19719912Dl), new AwS598S0100000_19(c2217381BqS, 917), new AwS381S0200000_15(function1, c259800zU, 172));
        }
    }

    public static final void LJIIJJI(AbstractC738140SxQ abstractC738140SxQ, C19719912Dl c19719912Dl, C2217381BqS c2217381BqS, C2217381BqS c2217381BqS2, Function2 function2) {
        abstractC738140SxQ.getSupervisor().LJFF().LJFF(abstractC738140SxQ, C09R7.LIZ(c19719912Dl), new AwS385S0200000_19(c2217381BqS, c2217381BqS2, 157), new AwS381S0200000_15(function2, new C259800zU(), 174));
    }
}

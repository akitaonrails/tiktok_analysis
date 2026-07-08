package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemContainerBridge;
import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724240Sb0 {
    public static final C19EG LIZ(LifecycleOwner lifecycleOwner) {
        Object objInvoke;
        if (lifecycleOwner instanceof Fragment) {
            return ((Fragment) lifecycleOwner).getActivity();
        }
        if (lifecycleOwner instanceof InterfaceC719640SKs) {
            return ((InterfaceC719640SKs) lifecycleOwner).getActivity();
        }
        if (lifecycleOwner instanceof C19EG) {
            return (C19EG) lifecycleOwner;
        }
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) lifecycleOwner;
            AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(lifecycleOwner, 1512);
            if (!C725080ScM.LJJIIZ || abstractC738140SxQ.isParentInit) {
                objInvoke = awS555S0100000_11.invoke();
            } else {
                objInvoke = null;
            }
            return (C19EG) objInvoke;
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static final InterfaceC719640SKs LIZIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof InterfaceC719640SKs) {
            return (InterfaceC719640SKs) lifecycleOwner;
        }
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            return LIZIZ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static final AssemSupervisor LIZJ(Fragment fragment) {
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return C0RPA.LIZ(activity).CQ2(fragment);
    }

    public static final AssemSupervisor LIZLLL(C19EG c19eg) {
        return C0RPA.LIZ(c19eg).CQ2(c19eg);
    }

    public static final AssemSupervisor LJ(AbstractC738140SxQ abstractC738140SxQ) {
        C19EG c19egLIZ = LIZ(abstractC738140SxQ);
        if (c19egLIZ == null) {
            return null;
        }
        return C0RPA.LIZ(c19egLIZ).CQ2(abstractC738140SxQ);
    }

    public static final AssemSupervisor LJFF(InterfaceC719640SKs interfaceC719640SKs) {
        C19EG activity = interfaceC719640SKs.getActivity();
        if (activity == null) {
            return null;
        }
        return C0RPA.LIZ(activity).CQ2(interfaceC719640SKs);
    }

    public static final Fragment LJI(LifecycleOwner lifecycleOwner) {
        Object objInvoke;
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        Object objInvoke2 = null;
        if (lifecycleOwner instanceof C19EG) {
            return null;
        }
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) lifecycleOwner;
            AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(lifecycleOwner, 1513);
            if (!C725080ScM.LJJIIZ) {
                objInvoke = awS555S0100000_11.invoke();
            } else {
                if (abstractC738140SxQ.isParentInit) {
                    objInvoke2 = awS555S0100000_11.invoke();
                }
                objInvoke = objInvoke2;
            }
            return (Fragment) objInvoke;
        }
        if (lifecycleOwner instanceof InterfaceC719640SKs) {
            LifecycleOwner lifecycleOwnerE82 = ((InterfaceC719640SKs) lifecycleOwner).E82();
            if (lifecycleOwnerE82 != null) {
                return LJI(lifecycleOwnerE82);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static final void LJII(final Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(C723850SaN.LIZ, new Runnable() { // from class: X.0R7L
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AssemExtKt@5435.runOnUIThread$1");
                    try {
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AssemExtKt@5435.runOnUIThread$1");
                }
            });
        }
    }

    @InterfaceC1294060jmO
    public static final void LJIIIIZZ(AbstractC738140SxQ abstractC738140SxQ, LifecycleOwner lifecycleOwner, Intent intent, int i, Bundle bundle, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Intent, Unit> interfaceC1631620sYq) throws Throwable {
        AssemContainerBridge assemContainerBridge;
        C19EG c19egLIZ = LIZ(abstractC738140SxQ);
        if (c19egLIZ == null) {
            return;
        }
        Fragment fragmentLJJJJZI = c19egLIZ.getSupportFragmentManager().LJJJJZI("AssemContainerBridge");
        if (!(fragmentLJJJJZI instanceof AssemContainerBridge) || (assemContainerBridge = (AssemContainerBridge) fragmentLJJJJZI) == null) {
            assemContainerBridge = new AssemContainerBridge();
            C19EH c19ehLJIIJ = c19egLIZ.getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZLLL(assemContainerBridge, "AssemContainerBridge");
            c19ehLJIIJ.LJIIJ();
        }
        if (assemContainerBridge.isAdded()) {
            C2204961BRm.LLLIL(assemContainerBridge, lifecycleOwner, intent, i, bundle, interfaceC1631620sYq, new C0WZX("dzBzEgAjS8/YVFkiQFyFdYMFRnha5bggw7RoQixeieIRVlGzD5PJ6mGXEr5s2g==", null));
        } else {
            assemContainerBridge.LLILLL.add(new C724250Sb1(c19egLIZ, lifecycleOwner, assemContainerBridge, intent, i, bundle, interfaceC1631620sYq));
        }
    }
}

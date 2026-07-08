package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713240RyM {
    public static final void LIZ(LifecycleOwner lifecycleOwner, Function1 function1) {
        C19EG activity;
        AbstractC738140SxQ next;
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            activity = C724240Sb0.LIZ(lifecycleOwner);
            if (activity == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("can not find activity for ");
                sbLIZ.append(lifecycleOwner);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
        } else if (lifecycleOwner instanceof Fragment) {
            activity = ((Fragment) lifecycleOwner).requireActivity();
        } else if (lifecycleOwner instanceof C19EG) {
            activity = (C19EG) lifecycleOwner;
        } else if (lifecycleOwner instanceof InterfaceC719640SKs) {
            activity = ((InterfaceC719640SKs) lifecycleOwner).getActivity();
            if (activity == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("can not find activity for ");
                sbLIZ2.append(lifecycleOwner);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
        } else {
            throw new IllegalArgumentException();
        }
        AssemSupervisor assemSupervisorCQ2 = C0RPA.LIZ(activity).CQ2(lifecycleOwner);
        if (assemSupervisorCQ2 != null) {
            C628830OlV c628830OlV = new C628830OlV() { // from class: X.0OlX
            };
            function1.invoke(c628830OlV);
            Iterator<AbstractC738140SxQ> it2 = assemSupervisorCQ2.LLJILLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AbstractC738140SxQ abstractC738140SxQ = next;
                    if ((abstractC738140SxQ instanceof DynamicAssem) && Intrinsics.LJFF(C13LE.LIZ(abstractC738140SxQ.getClass()), c628830OlV.LL) && ((UISlotAssem) abstractC738140SxQ).LLIZ == c628830OlV.LLIZLLLIL) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            UIAssem uIAssem = (UIAssem) next;
            if (uIAssem == null) {
                Iterator it3 = c628830OlV.LIZIZ(assemSupervisorCQ2.LLIZLLLIL.LL).iterator();
                while (it3.hasNext()) {
                    assemSupervisorCQ2.LJII((AbstractC738140SxQ) it3.next(), null);
                    assemSupervisorCQ2.LIZIZ(null);
                }
                return;
            }
            C0RUT<? extends UIAssem> config = uIAssem.getConfig();
            uIAssem.setConfig(c628830OlV);
            uIAssem.didUpdateConfig(config);
        }
    }
}

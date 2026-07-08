package X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.provider.impl.GScope;
import com.bytedance.provider.vm.ScopeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558420qem {
    public static final InterfaceC665370Q7z LIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof C19EG) {
            return C1558360qeg.LJI((C19EG) lifecycleOwner, null);
        }
        if (lifecycleOwner instanceof Fragment) {
            return C1558360qeg.LJFF((Fragment) lifecycleOwner, null);
        }
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) lifecycleOwner;
            LIZJ(abstractC738140SxQ);
            return abstractC738140SxQ;
        }
        if (lifecycleOwner instanceof InterfaceC713360RyY) {
            return LIZIZ((InterfaceC713360RyY) lifecycleOwner);
        }
        if (!(lifecycleOwner instanceof InterfaceC665370Q7z)) {
            return null;
        }
        return (InterfaceC665370Q7z) lifecycleOwner;
    }

    public static final InterfaceC665370Q7z LIZIZ(InterfaceC713360RyY interfaceC713360RyY) {
        String strValueOf = String.valueOf(interfaceC713360RyY.hashCode());
        C1561870qkL c1561870qkL = C1561870qkL.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c1561870qkL);
                }
            }
            if (C725480Sd0.LIZ(c1561870qkL)) {
                C725430Scv.LIZ(new C723520SZq(c1561870qkL, strValueOf, SystemClock.elapsedRealtimeNanos()));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append("_vscopeble");
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C665430Q8f.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC665370Q7zLIZ != null) {
            InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC713360RyY.k0();
            if (interfaceC665370Q7zK0 != null) {
                interfaceC665370Q7zLIZ.getTree().LIZIZ(interfaceC665370Q7zK0);
            }
            C1561870qkL c1561870qkL2 = C1561870qkL.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                if (arrayList2.size() > 0) {
                    Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onEventEnd(c1561870qkL2);
                    }
                }
                if (C725480Sd0.LIZ(c1561870qkL2)) {
                    C725430Scv.LIZ(new C1558600qf4(c1561870qkL2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), interfaceC713360RyY));
                }
            }
            return interfaceC665370Q7zLIZ;
        }
        InterfaceC665370Q7z interfaceC665370Q7zWQ2 = ((ScopeViewModel) new ViewModelProvider(interfaceC713360RyY.LLIIIILZ()).get(ScopeViewModel.class)).wQ2("assem_logic_scope", new C1558440qeo(interfaceC713360RyY));
        InterfaceC665370Q7z interfaceC665370Q7zK02 = interfaceC713360RyY.k0();
        if (interfaceC665370Q7zK02 != null) {
            interfaceC665370Q7zWQ2.getTree().LIZIZ(interfaceC665370Q7zK02);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strValueOf);
        sbLIZ2.append("_vscopeble");
        C665430Q8f.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), interfaceC665370Q7zWQ2, interfaceC713360RyY);
        C1561870qkL c1561870qkL3 = C1561870qkL.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
            if (arrayList3.size() > 0) {
                Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    it4.next().onEventEnd(c1561870qkL3);
                }
            }
            if (C725480Sd0.LIZ(c1561870qkL3)) {
                C725430Scv.LIZ(new C1558590qf3(c1561870qkL3, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), interfaceC713360RyY));
            }
        }
        return interfaceC665370Q7zWQ2;
    }

    public static final void LIZJ(final AbstractC738140SxQ abstractC738140SxQ) {
        String strValueOf = String.valueOf(abstractC738140SxQ.hashCode());
        C1561870qkL c1561870qkL = C1561870qkL.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c1561870qkL);
                }
            }
            if (C725480Sd0.LIZ(c1561870qkL)) {
                C725430Scv.LIZ(new C1558560qf0(c1561870qkL, strValueOf, SystemClock.elapsedRealtimeNanos()));
            }
        }
        if (!Intrinsics.LJFF(abstractC738140SxQ.getTree().LJIIIIZZ(), GScope.LL)) {
            C1561870qkL c1561870qkL2 = C1561870qkL.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                if (arrayList2.size() > 0) {
                    Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onEventEnd(c1561870qkL2);
                    }
                }
                if (C725480Sd0.LIZ(c1561870qkL2)) {
                    C725430Scv.LIZ(new C1558620qf6(c1561870qkL2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), abstractC738140SxQ));
                    return;
                }
                return;
            }
            return;
        }
        if (C1557550qdN.LJFF) {
            abstractC738140SxQ.getTree().LIZ(new InterfaceC1554770qYt() { // from class: X.0qen
                @Override // X.InterfaceC1554770qYt
                public final InterfaceC665370Q7z LIZ() throws IllegalAccessException {
                    InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1558420qem.LIZ(abstractC738140SxQ.getParent());
                    if (interfaceC665370Q7zLIZ != null) {
                        return interfaceC665370Q7zLIZ;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("can not find parent scope for assem: ");
                    sbLIZ.append(abstractC738140SxQ);
                    sbLIZ.append(".parent");
                    throw new IllegalAccessException(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        } else {
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = LIZ(abstractC738140SxQ.getParent());
            if (interfaceC665370Q7zLIZ != null) {
                abstractC738140SxQ.getTree().LIZIZ(interfaceC665370Q7zLIZ);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("can not find parent scope for assem: ");
                sbLIZ.append(abstractC738140SxQ);
                sbLIZ.append(".parent");
                throw new IllegalAccessException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C1561870qkL c1561870qkL3 = C1561870qkL.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
            if (arrayList3.size() > 0) {
                Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    it4.next().onEventEnd(c1561870qkL3);
                }
            }
            if (C725480Sd0.LIZ(c1561870qkL3)) {
                C725430Scv.LIZ(new C1558630qf7(c1561870qkL3, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), abstractC738140SxQ));
            }
        }
    }
}

package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushContentAssem;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS89S0201000_2;

/* JADX INFO: renamed from: X.04z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1276604z6 {
    public static final int LIZ(int i) {
        switch (i) {
            case 1:
                return R.id.kor;
            case 2:
                return R.id.kos;
            case 3:
                return R.id.kox;
            case 4:
                return R.id.kp2;
            case 5:
                return R.id.kok;
            case 6:
                return R.id.koi;
            case 7:
                return R.id.koj;
            default:
                return R.id.kot;
        }
    }

    public static final AbstractC738140SxQ LIZIZ(AssemSupervisor assemSupervisor, int i) {
        AbstractC738140SxQ next;
        Iterator<AbstractC738140SxQ> it2 = assemSupervisor.LLJILLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AbstractC738140SxQ abstractC738140SxQ = next;
                if (((abstractC738140SxQ instanceof BaseInnerPushSlotAssem) && ((BaseInnerPushSlotAssem) abstractC738140SxQ).hp() == i) || ((abstractC738140SxQ instanceof BaseInnerPushContentAssem) && ((BaseInnerPushContentAssem) abstractC738140SxQ).Go() == i)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final boolean LJ(AssemSupervisor assemSupervisor, ViewGroup viewGroup, AbstractC738140SxQ abstractC738140SxQ) {
        if (abstractC738140SxQ == null) {
            return false;
        }
        assemSupervisor.LJIIIZ(null, C13LE.LIZ(abstractC738140SxQ.getClass()));
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
            return true;
        }
        return true;
    }

    public static final void LIZJ(AssemSupervisor assemSupervisor, int i, InnerPushMessage innerPushMessage, LifecycleOwner lifecycleOwner, ViewGroup viewGroup, Function0<Unit> function0, Function1<? super AbstractC738140SxQ, Unit> function1) {
        InterfaceC719640SKs interfaceC719640SKs;
        Object first;
        Object first2;
        UIAssem uIAssem;
        Iterator it2 = ((ConcurrentHashMap) C1276704z7.LIZIZ.getValue()).entrySet().iterator();
        while (true) {
            interfaceC719640SKs = null;
            if (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Pair pair = (Pair) entry.getKey();
                first = pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                Function1 function12 = (Function1) entry.getValue();
                if (iIntValue == i && ((Boolean) function12.invoke(innerPushMessage)).booleanValue()) {
                    break;
                }
            } else {
                first = null;
                break;
            }
        }
        Iterator it3 = ((ConcurrentHashMap) C1276704z7.LIZ.getValue()).entrySet().iterator();
        while (true) {
            if (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                Pair pair2 = (Pair) entry2.getKey();
                first2 = pair2.getFirst();
                int iIntValue2 = ((Number) pair2.getSecond()).intValue();
                Function1 function13 = (Function1) entry2.getValue();
                if (iIntValue2 == i && ((Boolean) function13.invoke(innerPushMessage)).booleanValue()) {
                    break;
                }
            } else {
                first2 = null;
                break;
            }
        }
        Pair pair3 = new Pair(first, first2);
        C13IQ c13iq = (C13IQ) pair3.getFirst();
        C13IQ c13iq2 = (C13IQ) pair3.getSecond();
        AbstractC738140SxQ abstractC738140SxQLIZIZ = LIZIZ(assemSupervisor, i);
        int iLIZ = LIZ(i);
        if (lifecycleOwner instanceof UIAssem) {
            uIAssem = (UIAssem) lifecycleOwner;
        } else {
            uIAssem = null;
        }
        if (lifecycleOwner instanceof InterfaceC719640SKs) {
            interfaceC719640SKs = (InterfaceC719640SKs) lifecycleOwner;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateAreaAssem], area = ");
        sbLIZ.append(i);
        sbLIZ.append(", lifecycleOwner = ");
        sbLIZ.append(lifecycleOwner);
        sbLIZ.append(", existedAreaAssem = ");
        sbLIZ.append(abstractC738140SxQLIZIZ);
        C19290510dT.LIZLLL("ExtFunc", C2188811AlT.LIZIZ(sbLIZ));
        if (c13iq == null && c13iq2 == null) {
            C19290510dT.LIZLLL("ExtFunc", "[updateAreaAssem], no new custom assem, do default logic");
            if (function1 != null) {
                function1.invoke(abstractC738140SxQLIZIZ);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[updateAreaAssem], has custom assem, newSlotAssem = ");
        sbLIZ2.append(c13iq);
        sbLIZ2.append(", newContentAssem = ");
        sbLIZ2.append(c13iq2);
        C19290510dT.LIZLLL("ExtFunc", C2188811AlT.LIZIZ(sbLIZ2));
        if (abstractC738140SxQLIZIZ != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[updateAreaAssem], unload existed assem = ");
            sbLIZ3.append(abstractC738140SxQLIZIZ);
            C19290510dT.LIZLLL("ExtFunc", C2188811AlT.LIZIZ(sbLIZ3));
            LJ(assemSupervisor, viewGroup, abstractC738140SxQLIZIZ);
        }
        if (function0 != null) {
            function0.invoke();
        }
        if (c13iq != null) {
            if (uIAssem != null) {
                C723850SaN.LIZLLL(uIAssem, new AwS89S0201000_2(lifecycleOwner, (LifecycleOwner) c13iq, (C13IQ<? extends BaseInnerPushSlotAssem>) iLIZ, 1));
                return;
            } else {
                if (interfaceC719640SKs == null) {
                    return;
                }
                C723850SaN.LJ(interfaceC719640SKs, new AwS89S0201000_2(lifecycleOwner, (LifecycleOwner) c13iq, (C13IQ<? extends BaseInnerPushSlotAssem>) iLIZ, 2));
                return;
            }
        }
        if (c13iq2 == null) {
            return;
        }
        if (uIAssem != null) {
            C723850SaN.LIZLLL(uIAssem, new AwS89S0201000_2(lifecycleOwner, (LifecycleOwner) c13iq2, (C13IQ<? extends BaseInnerPushSlotAssem>) iLIZ, 3));
        } else {
            if (interfaceC719640SKs == null) {
                return;
            }
            C723850SaN.LJ(interfaceC719640SKs, new AwS89S0201000_2(lifecycleOwner, (LifecycleOwner) c13iq2, (C13IQ<? extends BaseInnerPushSlotAssem>) iLIZ, 4));
        }
    }
}

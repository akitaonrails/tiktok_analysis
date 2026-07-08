package X;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS2S1210100_11;
import kotlin.jvm.internal.Intrinsics;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: renamed from: X.0SaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723740SaC {
    public static final void LIZ(LifecycleOwner lifecycleOwner, Assembler assembler, Function1 function1) {
        AbstractC738140SxQ next;
        ComposeView composeView;
        if (!(lifecycleOwner instanceof Activity) && !(lifecycleOwner instanceof Fragment) && !(lifecycleOwner instanceof UIAssem) && !(lifecycleOwner instanceof InterfaceC719640SKs)) {
            "You can only assemble UIContentAssem in Activity/Fragment/UIAssem/IAssembleContainer".toString();
            throw new IllegalStateException("You can only assemble UIContentAssem in Activity/Fragment/UIAssem/IAssembleContainer");
        }
        AssemSupervisor assemSupervisorCQ2 = assembler.CQ2(lifecycleOwner);
        if (assemSupervisorCQ2 == null) {
            return;
        }
        AbstractC724210Sax abstractC724210SaxAQ2 = assembler.AQ2(lifecycleOwner);
        C725210ScZ c725210ScZ = C725210ScZ.LIZ;
        String strValueOf = String.valueOf(assembler.hashCode());
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725210ScZ);
                }
            }
            if (C725480Sd0.LIZ(c725210ScZ)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725210ScZ, strValueOf, SystemClock.elapsedRealtimeNanos(), 0));
            }
        }
        C723750SaD c723750SaD = new C723750SaD();
        function1.invoke(c723750SaD);
        Iterator<AbstractC738140SxQ> it3 = assemSupervisorCQ2.LLJILLL.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                AbstractC738140SxQ abstractC738140SxQ = next;
                if ((abstractC738140SxQ instanceof UiComposableAssem) && Intrinsics.LJFF(C13LE.LIZ(abstractC738140SxQ.getClass()), c723750SaD.LL) && (composeView = c723750SaD.LLIZLLLIL) != null && ((UIAssem) abstractC738140SxQ).LJJIJL().getId() == composeView.getId() && Intrinsics.LJFF(abstractC738140SxQ.assemTagInternal, c723750SaD.LLILLJJLI)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C725210ScZ c725210ScZ2 = C725210ScZ.LIZ;
        String strValueOf2 = String.valueOf(assembler.hashCode());
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    it4.next().onEventEnd(c725210ScZ2);
                }
            }
            if (C725480Sd0.LIZ(c725210ScZ2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c725210ScZ2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c723750SaD, 0));
            }
        }
        Pair pair = new Pair(next, c723750SaD);
        AbstractC738140SxQ abstractC738140SxQ2 = (AbstractC738140SxQ) pair.getFirst();
        C0RUV c0ruv = (C0RUV) pair.getSecond();
        c0ruv.getClass();
        assembler.SQ2(assemSupervisorCQ2, abstractC738140SxQ2, c0ruv, abstractC724210SaxAQ2);
    }
}

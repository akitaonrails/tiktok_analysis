package X;

import Y.AObserverS226S0100000_24;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599630rjF implements InterfaceC1597940rgW {
    public static final C1599630rjF LIZ = new C1599630rjF();
    public static AObserverS226S0100000_24 LIZIZ;
    public static DataCenter LIZJ;

    @Override // X.InterfaceC1597940rgW
    public final void LIZJ() {
        AObserverS226S0100000_24 aObserverS226S0100000_24 = LIZIZ;
        if (aObserverS226S0100000_24 == null) {
            return;
        }
        DataCenter dataCenter = LIZJ;
        if (dataCenter != null) {
            dataCenter.AQ2(aObserverS226S0100000_24);
        }
        LIZJ = null;
        LIZIZ = null;
    }

    @Override // X.InterfaceC1597940rgW
    public final boolean LIZLLL() {
        C1599920rji.LIZ.getClass();
        if (C1599920rji.LIZIZ()) {
            return true;
        }
        if (C1599920rji.LIZ() >= 5) {
            C1599920rji.LIZLLL();
        }
        return C1599920rji.LIZIZ();
    }

    @Override // X.InterfaceC1597940rgW
    public final boolean LJFF() {
        C604440NnG.LIZ.getClass();
        return C604440NnG.LIZIZ();
    }

    @Override // X.InterfaceC1597940rgW
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        C19EG c19eg;
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            LIZIZ = new AObserverS226S0100000_24(lifecycleOwner, 16);
            DataCenter dataCenterVQ2 = DataCenter.vQ2(ViewModelProviders.of(c19eg), lifecycleOwner);
            LIZJ = dataCenterVQ2;
            dataCenterVQ2.yQ2("changeTabAfterPublish", LIZIZ, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1597940rgW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer LIZIZ(java.util.List<? extends X.InterfaceC1891350zJl> r8) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1599630rjF.LIZIZ(java.util.List):java.lang.Integer");
    }

    @Override // X.InterfaceC1597940rgW
    public final void LJ(LifecycleOwner lifecycleOwner, boolean z, Integer num) {
        InterfaceC1600130rk3 interfaceC1600130rk3LIZLLL;
        List<InterfaceC1891350zJl> listLLILIL;
        Integer numLIZIZ;
        InterfaceC712570RxH interfaceC712570RxH;
        Object c098200Yq;
        if (lifecycleOwner == null || (listLLILIL = (interfaceC1600130rk3LIZLLL = ((ISkylightOutBridge) ServiceManager.get().getService(ISkylightOutBridge.class)).LIZLLL(lifecycleOwner)).LLILIL()) == null) {
            return;
        }
        int i = -1;
        for (InterfaceC1891350zJl interfaceC1891350zJl : listLLILIL) {
            i++;
            if (interfaceC1891350zJl instanceof C1598870ri1) {
                if (interfaceC1891350zJl != null && (numLIZIZ = LIZIZ(listLLILIL)) != null) {
                    int iIntValue = numLIZIZ.intValue();
                    if (i != iIntValue + 1) {
                        LIZ.getClass();
                        int size = listLLILIL.size() - 1;
                        if (i >= 0 && i <= size && iIntValue >= 0 && iIntValue <= size) {
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("moveOnThisDayByOverallReplacement, currentIndex: ");
                            sbLIZ.append(i);
                            sbLIZ.append(", targetIndex: ");
                            sbLIZ.append(iIntValue);
                            sbLIZ.append(", lastIndex: ");
                            sbLIZ.append(size);
                            C1720106oR.LJI("OnThisDay-Exit", C2188811AlT.LIZIZ(sbLIZ));
                            try {
                                ArrayList arrayList = new ArrayList(listLLILIL);
                                arrayList.add(iIntValue, (InterfaceC1891350zJl) arrayList.remove(i));
                                interfaceC1600130rk3LIZLLL.Zc2(arrayList);
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                            if (thM5exceptionOrNullimpl != null) {
                                int i3 = C2187451AjH.LIZ;
                                C1720106oR.LIZIZ("OnThisDay-Exit", "moveOnThisDayByOverallReplacement error", thM5exceptionOrNullimpl);
                                C614770O9j.LIZIZ.LJ().LJIILLIIL("notification_page", thM5exceptionOrNullimpl, C2097908Jt.LIZJ(new Pair("checkpoint", "OnThisDay-Exit#moveOnThisDayByOverallReplacement")));
                            }
                        }
                        if (z && (interfaceC1600130rk3LIZLLL instanceof InterfaceC712570RxH) && (interfaceC712570RxH = (InterfaceC712570RxH) interfaceC1600130rk3LIZLLL) != null) {
                            if (num != null) {
                                iIntValue = num.intValue();
                            }
                            interfaceC712570RxH.sA1(iIntValue, null, false, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}

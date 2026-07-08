package X;

import X.AbstractC1773210wFD;
import X.AbstractC1773460wFc;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0wGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1773820wGC<D extends AbstractC1773210wFD, VH extends AbstractC1773460wFc<D>> extends C0J8P<D, VH> implements InterfaceC1773840wGE<D> {
    public InterfaceC1774140wGi LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1545));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1544));
    public InterfaceC1773310wFN LJ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // X.C0J8P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
        /*
            r2 = this;
            X.0wFc r3 = (X.AbstractC1773460wFc) r3
            D extends X.0wFD r0 = r3.LLILLL
            if (r0 == 0) goto L24
            int r0 = r0.LJIIIIZZ()
            r1 = 1
            if (r0 != r1) goto L24
        Ld:
            android.view.View r0 = r3.itemView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.19tI r0 = (X.C21681819tI) r0
            r0.LLILLJJLI = r1
            kotlin.jvm.internal.AwS570S0100000_26 r1 = new kotlin.jvm.internal.AwS570S0100000_26
            r0 = 1546(0x60a, float:2.166E-42)
            r1.<init>(r3, r0)
            java.lang.String r0 = "onViewAttachedToWindow"
            r2.LJIIIIZZ(r0, r1)
            return
        L24:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1773820wGC.LJFF(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        LJIIIIZZ("onDetachedFromWindow", new AwS570S0100000_26((AbstractC1773460wFc) viewHolder, (AbstractC1773460wFc<Object>) 1547));
    }

    @Override // X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        LJIIIIZZ("onViewHolderRecycled", new AwS570S0100000_26((AbstractC1773460wFc) viewHolder, (AbstractC1773460wFc<Object>) 1548));
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        boolean zLJI = MethodIDManager.LJI(202204);
        boolean zLJI2 = MethodIDManager.LJI(202204);
        LJIIIIZZ("onBindViewHolder", new AwS270S0300000_26((AbstractC1773210wFD) obj, (AbstractC1773210wFD) this, (AbstractC1773820wGC<AbstractC1773210wFD, AbstractC1773460wFc<Object>>) viewHolder, (AbstractC1773460wFc<Object>) 139));
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        AwS270S0300000_26 awS270S0300000_26 = new AwS270S0300000_26((AbstractC1773820wGC) this, (AbstractC1773820wGC<AbstractC1773210wFD, AbstractC1773460wFc<Object>>) layoutInflater, (LayoutInflater) viewGroup, (ViewGroup) 141);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = awS270S0300000_26.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            String simpleName = getClass().getSimpleName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCreateViewHolder");
            sbLIZ.append(" cost duration ->");
            sbLIZ.append(jCurrentTimeMillis2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ(simpleName, strLIZIZ);
        }
        return (RecyclerView.ViewHolder) objInvoke;
    }

    public final void LJIIIIZZ(String str, Function0<Unit> function0) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        long jCurrentTimeMillis = System.currentTimeMillis();
        function0.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            String simpleName = getClass().getSimpleName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" cost duration ->");
            sbLIZ.append(jCurrentTimeMillis2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ(simpleName, strLIZIZ);
        }
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        boolean zLJI = MethodIDManager.LJI(202204);
        AbstractC1773460wFc abstractC1773460wFc = (AbstractC1773460wFc) viewHolder;
        AbstractC1773210wFD abstractC1773210wFD = (AbstractC1773210wFD) obj;
        boolean zLJI2 = MethodIDManager.LJI(202204);
        if (list.isEmpty()) {
            boolean zLJI3 = MethodIDManager.LJI(202204);
            LJIIIIZZ("onBindViewHolder", new AwS270S0300000_26(abstractC1773210wFD, (AbstractC1773210wFD) this, (AbstractC1773820wGC<AbstractC1773210wFD, AbstractC1773460wFc<Object>>) abstractC1773460wFc, (AbstractC1773460wFc<Object>) 139));
            if (zLJI3) {
                MethodIDManager.LJ();
            }
        } else {
            LJIIIIZZ("onBindViewHolderPayload", new AwS270S0300000_26(abstractC1773460wFc, (AbstractC1773460wFc<Object>) abstractC1773210wFD, (AbstractC1773210wFD) list, (List<Object>) 140));
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}

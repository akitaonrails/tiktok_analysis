package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.model.SeaPdpPopupData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.AwS640S0100000_26;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759940vto {
    public final C1757400vpi LIZ;
    public final ViewGroup LIZIZ;
    public C1760040vty LIZJ;
    public SeaPdpPopupData LIZLLL;

    public C1759940vto(C1757400vpi c1757400vpi) {
        SeaPdpFragment seaPdpFragment;
        Object parent;
        C16G0 c16g0ZR;
        ViewGroup viewGroup;
        this.LIZ = c1757400vpi;
        SeaPdpViewModel seaPdpViewModelLIZIZ = c1757400vpi.LIZIZ();
        if ((seaPdpViewModelLIZIZ != null && seaPdpViewModelLIZIZ.LLIZLLLIL) || (seaPdpFragment = c1757400vpi.LIZ.get()) == null || (c16g0ZR = seaPdpFragment.ZR()) == null || (parent = c16g0ZR.getParent()) == null) {
            parent = (View) c1757400vpi.LIZIZ.get();
        }
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        this.LIZIZ = viewGroup;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ = c1757400vpi.LIZ();
        if (iSeaPdpCommunicationServiceLIZ != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceLIZ, this, "pdpSeaSubmitPopup", new AwS636S0100000_22(this, 68));
        }
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ2 = c1757400vpi.LIZ();
        if (iSeaPdpCommunicationServiceLIZ2 != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceLIZ2, this, "pdpSeaHidePopup", new AwS640S0100000_26(this, 166));
        }
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ3 = c1757400vpi.LIZ();
        if (iSeaPdpCommunicationServiceLIZ3 != null) {
            C1502500pCa.LIZ(iSeaPdpCommunicationServiceLIZ3, this, "pdpSeaDestroyPopup", new AwS640S0100000_26(this, 167));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2 A[PHI: r1 r2 r10
      0x01a2: PHI (r1v13 java.util.LinkedHashMap) = (r1v12 java.util.LinkedHashMap), (r1v19 java.util.LinkedHashMap) binds: [B:73:0x019f, B:53:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r2v16 java.lang.String) = (r2v15 java.lang.String), (r2v18 java.lang.String) binds: [B:73:0x019f, B:53:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r10v8 X.0vtr) = (r10v7 X.0vtr), (r10v10 X.0vtr) binds: [B:73:0x019f, B:53:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1502460pCW LIZ(org.json.JSONObject r26) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759940vto.LIZ(org.json.JSONObject):X.0pCW");
    }

    public final void LIZIZ(SeaPdpPopupData seaPdpPopupData) {
        IECommerceHostService iECommerceHostService;
        Object c098200Yq;
        String strLJIIIIZZ;
        SeaPdpFragment seaPdpFragment;
        String strLJIIIIZZ2;
        boolean z;
        String name;
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
        boolean zIsLocalTest = ((IApplicationDependencyService) iECommerceHostService).isLocalTest();
        String str = "{}";
        if (zIsLocalTest) {
            if (seaPdpPopupData != null && (strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(seaPdpPopupData)) != null) {
                str = strLJIIIIZZ2;
            }
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } else {
            try {
                if (seaPdpPopupData != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(seaPdpPopupData)) != null) {
                    str = strLJIIIIZZ;
                }
                c098200Yq = new JSONObject(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject != null && (seaPdpFragment = this.LIZ.LIZ.get()) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C948503nH.LJ(C948503nH.LIZIZ(seaPdpFragment), C2107308Nj.LIZ.LLIILII(), new C1406960miU(this, jSONObject, null));
        }
    }
}

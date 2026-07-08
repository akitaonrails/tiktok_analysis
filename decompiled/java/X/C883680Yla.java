package X;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Yla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883680Yla extends C883710Yld {
    public static final C01GW<C883680Yla> LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(370));

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZJ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view) {
        C0Z8P c0z8p;
        C879540Yeu c879540YeuLJIJI;
        IMAIServiceAPI.LIZ.getClass();
        if (AnonymousClass0629.LIZ().LIZ().LIZLLL(false) != 0 && (interfaceC888500YtM instanceof C0Z8P) && (c0z8p = (C0Z8P) interfaceC888500YtM) != null) {
            C878950Ydx pageKey = c0z8p.getPageKey();
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            if (C881500Yi4.LJ() != null && (c879540YeuLJIJI = AbstractC883730Ylf.LJIJI(pageKey, c0z8p.getSessionId())) != null) {
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                if (C289900BXw.LIZ()) {
                    c13dvLIZIZ.add(new C877470YbZ(c19eg, c879540YeuLJIJI, pageKey));
                }
                c13dvLIZIZ.add(new C877750Yc1(c19eg, c879540YeuLJIJI, pageKey));
                c13dvLIZIZ.add(new C880110Yfp(c19eg, c879540YeuLJIJI, pageKey));
                c13dvLIZIZ.add(new C883700Ylc(c19eg, c879540YeuLJIJI));
                if (C19212010Ec.LIZJ.LIZLLL()) {
                    c13dvLIZIZ.add(new C877710Ybx(c19eg, c879540YeuLJIJI, pageKey));
                    c13dvLIZIZ.add(new C877770Yc3(c19eg, c879540YeuLJIJI, pageKey));
                }
                List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                C887690Ys3.LIZ.getClass();
                C887690Ys3.LIZ(c19eg, c879540YeuLJIJI, listLIZ, view);
            }
        }
    }

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view, Map<String, String> map) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().LJIJI(c19eg, true);
        if (C289910BXx.LIZ()) {
            view.setLongClickable(false);
            Object context = view.getContext();
            if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2190908iB(view, null), 2);
            }
        }
        C1440005kM.LIZ(new C883690Ylb());
    }

    @Override // X.C883710Yld, X.InterfaceC883640YlW
    public final void LIZIZ(InterfaceC888500YtM interfaceC888500YtM, C19EG c19eg, View view, Map<String, String> map) {
        LIZ(interfaceC888500YtM, c19eg, view, map);
    }
}

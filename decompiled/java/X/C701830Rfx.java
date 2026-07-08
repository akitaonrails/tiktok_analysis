package X;

import Y.AObjectS354S0100000_11;
import com.ss.android.ugc.IFcpReduxService;
import com.ss.android.ugc.feed.platform.componentmanager.data.FCPConfigState;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;

/* JADX INFO: renamed from: X.0Rfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701830Rfx implements InterfaceC2753014t {
    public C701880Rg2 LL;

    public final void LIZ(Function2 function2) {
        AwS616S0100000_2 awS616S0100000_2LJ;
        Function1 function1LIZJ;
        IFcpReduxService iFcpReduxService;
        Function1 function1LIZ;
        C701880Rg2 c701880Rg2 = new C701880Rg2();
        if (C299840Bp8.LIZ()) {
            C01GW c01gw = C702280Rgg.LIZ;
            IFcpReduxService iFcpReduxService2 = (IFcpReduxService) c01gw.getValue();
            InterfaceC1449905lx<FCPConfigState> interfaceC1449905lxLIZIZ = null;
            aObjectS354S0100000_11 = null;
            aObjectS354S0100000_11 = null;
            aObjectS354S0100000_11 = null;
            AObjectS354S0100000_11 aObjectS354S0100000_11 = null;
            if (iFcpReduxService2 != null) {
                IFcpReduxService iFcpReduxService3 = (IFcpReduxService) c01gw.getValue();
                if (iFcpReduxService3 != null) {
                    HashMap map = new HashMap();
                    map.put("cold_start_action", AFwS294S0000000_11.get$arr$(4));
                    map.put("runtime_action", AFwS294S0000000_11.get$arr$(5));
                    map.put("cache_action", AFwS294S0000000_11.get$arr$(7));
                    awS616S0100000_2LJ = iFcpReduxService3.LJ(map);
                } else {
                    awS616S0100000_2LJ = null;
                }
                FCPConfigState fCPConfigState = new FCPConfigState(null, null, null, null, null, null);
                IFcpReduxService iFcpReduxService4 = (IFcpReduxService) c01gw.getValue();
                if (iFcpReduxService4 != null && (function1LIZJ = iFcpReduxService4.LIZJ(new AwS651S0100000_2(function2, (Function2<? super String, ? super Long, Unit>) 0))) != null && (iFcpReduxService = (IFcpReduxService) c01gw.getValue()) != null && (function1LIZ = iFcpReduxService.LIZ(function1LIZJ)) != null) {
                    aObjectS354S0100000_11 = new AObjectS354S0100000_11(new Function1[]{function1LIZ, AFwS243S0000000_11.get$arr$(2)}, 0);
                }
                interfaceC1449905lxLIZIZ = iFcpReduxService2.LIZIZ(fCPConfigState, aObjectS354S0100000_11, awS616S0100000_2LJ);
            }
            c701880Rg2.LIZIZ = interfaceC1449905lxLIZIZ;
        } else {
            HashMap map2 = new HashMap();
            map2.put("cold_start_action", new C702170RgV());
            map2.put("runtime_action", new C700670Re5());
            map2.put("cache_action", new C702160RgU());
            c701880Rg2.LIZ = C1451905mH.LIZ(new FCPConfigState(null, null, null, null, null, null), new C702140RgS(new Function1[]{new C701930Rg7(new Function1[]{new C1452305mL(new C701890Rg3(function2))}), new C701980RgC()}), new C1531105z3(new Function2[]{new C701950Rg9(map2)}));
        }
        this.LL = c701880Rg2;
    }
}

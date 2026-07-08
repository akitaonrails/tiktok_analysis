package X;

import com.ss.android.ugc.IFcpReduxService;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS335S0000000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Rfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701820Rfw extends C09AY implements Function0<C701860Rg0> {
    public final /* synthetic */ C701470RfN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701820Rfw(C701470RfN c701470RfN) {
        super(0);
        this.LL = c701470RfN;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C701860Rg0 invoke() {
        InterfaceC1449905lx<C700730ReB> interfaceC1449905lxLIZIZ;
        AwS616S0100000_2 awS616S0100000_2LJ;
        Function1 function1LIZJ;
        IFcpReduxService iFcpReduxService;
        C701860Rg0 c701860Rg0 = new C701860Rg0();
        C701470RfN c701470RfN = this.LL;
        C700720ReA c700720ReA = (C700720ReA) c701470RfN.LJIIJ.getValue();
        Function0<ClientStandardModel> function0 = c701470RfN.LJI;
        if (!C299840Bp8.LIZ()) {
            Map<String, InterfaceC1631630sYr<C700720ReA, C700760ReE, List<String>, List<String>, List<String>>> map = C700690Re7.LIZ;
            HashMap map2 = new HashMap();
            map2.put("update_bind_handle_action", new C701970RgB(c700720ReA, function0));
            map2.put("update_mount_slot_component_action", new C702090RgN(c700720ReA));
            map2.put("update_calculate_slot_component_action", new C702080RgM(c700720ReA));
            map2.put("update_result_slot_action", new C702100RgO(c700720ReA));
            map2.put("update_unmount_slot_handle_action", new C702110RgP(c700720ReA));
            map2.put("update_unbind_handle_action", new C701960RgA());
            C701950Rg9 c701950Rg9 = new C701950Rg9(map2);
            C13BV c13bv = C13BV.INSTANCE;
            c701860Rg0.LIZ = C1451905mH.LIZ(new C700730ReB(c13bv, c13bv, c13bv, c13bv, c13bv), new C701930Rg7(new Function1[]{new C1452305mL(new C702050RgJ())}), c701950Rg9);
            return c701860Rg0;
        }
        C01GW c01gw = C702310Rgj.LIZ;
        IFcpReduxService iFcpReduxService2 = (IFcpReduxService) c01gw.getValue();
        if (iFcpReduxService2 != null) {
            IFcpReduxService iFcpReduxService3 = (IFcpReduxService) c01gw.getValue();
            if (iFcpReduxService3 != null) {
                HashMap map3 = new HashMap();
                map3.put("update_bind_handle_action", new AwS447S0200000_11(c700720ReA, (C700720ReA) function0, (Function0<ClientStandardModel>) 23));
                map3.put("update_mount_slot_component_action", new AwS625S0100000_11(c700720ReA, 154));
                map3.put("update_calculate_slot_component_action", new AwS625S0100000_11(c700720ReA, 153));
                map3.put("update_result_slot_action", new AwS625S0100000_11(c700720ReA, 155));
                map3.put("update_unmount_slot_handle_action", new AwS625S0100000_11(c700720ReA, 156));
                map3.put("update_unbind_handle_action", AFwS294S0000000_11.get$arr$(282));
                awS616S0100000_2LJ = iFcpReduxService3.LJ(map3);
            } else {
                awS616S0100000_2LJ = null;
            }
            Map<String, InterfaceC1631630sYr<C700720ReA, C700760ReE, List<String>, List<String>, List<String>>> map4 = C700690Re7.LIZ;
            C13BV c13bv2 = C13BV.INSTANCE;
            C700730ReB c700730ReB = new C700730ReB(c13bv2, c13bv2, c13bv2, c13bv2, c13bv2);
            IFcpReduxService iFcpReduxService4 = (IFcpReduxService) c01gw.getValue();
            interfaceC1449905lxLIZIZ = iFcpReduxService2.LIZIZ(c700730ReB, (iFcpReduxService4 == null || (function1LIZJ = iFcpReduxService4.LIZJ(AFwS335S0000000_11.get$arr$(5))) == null || (iFcpReduxService = (IFcpReduxService) c01gw.getValue()) == null) ? null : iFcpReduxService.LIZ(function1LIZJ), awS616S0100000_2LJ);
        } else {
            interfaceC1449905lxLIZIZ = null;
        }
        c701860Rg0.LIZIZ = interfaceC1449905lxLIZIZ;
        return c701860Rg0;
    }
}

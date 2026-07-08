package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.IFcpReduxService;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.api.ComponentElementChangeAbility;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import wzm.b;

/* JADX INFO: renamed from: X.0Rio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703600Rio<ITEM, ELEMENT extends b> implements InterfaceC702850Rhb {
    public final C703610Rip<ITEM, ELEMENT> LL = new C703610Rip<>();

    @Override // X.InterfaceC702850Rhb
    public final ELEMENT gc() {
        C703730Rj1 c703730Rj1LIZIZ;
        C703730Rj1 c703730Rj1LIZIZ2;
        C703610Rip<ITEM, ELEMENT> c703610Rip = this.LL;
        C703580Rim c703580Rim = c703610Rip.LIZ;
        boolean z = false;
        if (c703580Rim != null && (c703730Rj1LIZIZ2 = c703580Rim.LIZIZ()) != null && c703730Rj1LIZIZ2.LIZIZ == 1) {
            z = true;
        }
        if (z) {
            C703580Rim c703580Rim2 = c703610Rip.LIZ;
            InterfaceC703750Rj3 interfaceC703750Rj3 = (c703580Rim2 == null || (c703730Rj1LIZIZ = c703580Rim2.LIZIZ()) == null) ? null : c703730Rj1LIZIZ.LIZ;
            if (interfaceC703750Rj3 instanceof InterfaceC703750Rj3) {
                return interfaceC703750Rj3;
            }
        }
        return null;
    }

    public final void LIZ(ITEM item) {
        InterfaceC703750Rj3 interfaceC703750Rj3Invoke;
        Function0<Unit> function0LIZJ;
        C703610Rip<ITEM, ELEMENT> c703610Rip = this.LL;
        Function1<? super ITEM, ? extends InterfaceC703750Rj3> function1 = c703610Rip.LIZIZ;
        Function0 function0LIZJ2 = null;
        if (function1 != null) {
            interfaceC703750Rj3Invoke = function1.invoke(item);
        } else {
            interfaceC703750Rj3Invoke = null;
        }
        C703580Rim c703580Rim = c703610Rip.LIZ;
        if (c703580Rim != null) {
            c703580Rim.LIZ(interfaceC703750Rj3Invoke, "update_init_element_action");
        }
        Function0<Unit> function0 = c703610Rip.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = c703610Rip.LJ;
        if (function02 != null) {
            function02.invoke();
        }
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c703610Rip, (C703610Rip<Object, InterfaceC703750Rj3>) 1679);
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(c703610Rip, (C703610Rip<Object, InterfaceC703750Rj3>) 609);
        C703580Rim c703580Rim2 = c703610Rip.LIZ;
        if (c703580Rim2 != null) {
            function0LIZJ = c703580Rim2.LIZJ(new C2217371BqR() { // from class: X.0Rj2
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C703730Rj1) obj).LIZ;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C703730Rj1) obj).LIZ = (InterfaceC703750Rj3) obj2;
                }
            }, awS555S0100000_11, awS590S0100000_11);
        } else {
            function0LIZJ = null;
        }
        c703610Rip.LIZLLL = function0LIZJ;
        Function0 awS555S0100000_112 = new AwS555S0100000_11(c703610Rip, (C703610Rip<Object, InterfaceC703750Rj3>) 1680);
        Function1 awS590S0100000_112 = new AwS590S0100000_11(c703610Rip, (C703610Rip<Object, InterfaceC703750Rj3>) 610);
        C703580Rim c703580Rim3 = c703610Rip.LIZ;
        if (c703580Rim3 != null) {
            function0LIZJ2 = c703580Rim3.LIZJ(new C2217371BqR() { // from class: X.0Riq
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C703730Rj1) obj).LIZIZ);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C703730Rj1) obj).LIZIZ = ((Number) obj2).intValue();
                }
            }, awS555S0100000_112, awS590S0100000_112);
        }
        c703610Rip.LJ = function0LIZJ2;
    }

    public final void LIZIZ(Function1 function1, ComponentElementChangeAbility componentElementChangeAbility) {
        Function2 function2LJ;
        C703610Rip<ITEM, ELEMENT> c703610Rip = this.LL;
        c703610Rip.getClass();
        c703610Rip.LIZJ = new C703770Rj5(componentElementChangeAbility);
        C703580Rim c703580Rim = new C703580Rim();
        InterfaceC1449905lx interfaceC1449905lxLIZIZ = null;
        if (C299840Bp8.LIZ()) {
            C01GW c01gw = C703720Rj0.LIZ;
            IFcpReduxService iFcpReduxService = (IFcpReduxService) c01gw.getValue();
            if (iFcpReduxService != null) {
                IFcpReduxService iFcpReduxService2 = (IFcpReduxService) c01gw.getValue();
                if (iFcpReduxService2 != null) {
                    HashMap map = new HashMap();
                    map.put("update_init_element_action", AFwS294S0000000_11.get$arr$(301));
                    map.put("update_element_change_content_action", AFwS294S0000000_11.get$arr$(304));
                    map.put("update_hide_element_content_action", AFwS294S0000000_11.get$arr$(302));
                    map.put("clear_store_action", AFwS294S0000000_11.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                    map.put("update_show_element_action", AFwS294S0000000_11.get$arr$(303));
                    function2LJ = iFcpReduxService2.LJ(map);
                } else {
                    function2LJ = null;
                }
                interfaceC1449905lxLIZIZ = iFcpReduxService.LIZIZ(new C703730Rj1(null, 0), null, function2LJ);
            }
            c703580Rim.LIZ = interfaceC1449905lxLIZIZ;
        } else {
            HashMap map2 = new HashMap();
            map2.put("update_init_element_action", AFwS294S0000000_11.get$arr$(306));
            map2.put("update_element_change_content_action", AFwS294S0000000_11.get$arr$(309));
            map2.put("update_hide_element_content_action", AFwS294S0000000_11.get$arr$(307));
            map2.put("clear_store_action", AFwS294S0000000_11.get$arr$(305));
            map2.put("update_show_element_action", AFwS294S0000000_11.get$arr$(308));
            c703580Rim.LIZIZ = C1451905mH.LIZ(new C703730Rj1(null, 0), null, new C701950Rg9(map2));
        }
        c703610Rip.LIZ = c703580Rim;
        c703610Rip.LIZIZ = function1;
    }

    public final void LIZJ(String str, Function1<? super ELEMENT, Unit> function1) {
        C703580Rim c703580Rim;
        C703580Rim c703580Rim2;
        C703730Rj1 c703730Rj1LIZIZ;
        int iHashCode = str.hashCode();
        InterfaceC703750Rj3 interfaceC703750Rj3 = null;
        if (iHashCode != -1901827785) {
            if (iHashCode != -487631236) {
                if (iHashCode == -179684605 && str.equals("update_content")) {
                    C703610Rip<ITEM, ELEMENT> c703610Rip = this.LL;
                    C703580Rim c703580Rim3 = c703610Rip.LIZ;
                    if (c703580Rim3 != null && (c703730Rj1LIZIZ = c703580Rim3.LIZIZ()) != null) {
                        interfaceC703750Rj3 = c703730Rj1LIZIZ.LIZ;
                    }
                    if ((interfaceC703750Rj3 instanceof InterfaceC703750Rj3) && interfaceC703750Rj3 != null) {
                        C698160Ra2 c698160Ra2LIZ = interfaceC703750Rj3.LIZ();
                        if ((c698160Ra2LIZ instanceof InterfaceC703750Rj3) && c698160Ra2LIZ != null) {
                            if (function1 != null) {
                                function1.invoke(c698160Ra2LIZ);
                            }
                            C703580Rim c703580Rim4 = c703610Rip.LIZ;
                            if (c703580Rim4 != null) {
                                c703580Rim4.LIZ(c698160Ra2LIZ, "update_element_change_content_action");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!str.equals("hide_content") || (c703580Rim2 = this.LL.LIZ) == null) {
                return;
            }
            c703580Rim2.LIZ(null, "update_hide_element_content_action");
            return;
        }
        if (!str.equals("show_content") || (c703580Rim = this.LL.LIZ) == null) {
            return;
        }
        c703580Rim.LIZ(null, "update_show_element_action");
    }
}

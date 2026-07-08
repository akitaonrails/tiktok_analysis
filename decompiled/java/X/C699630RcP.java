package X;

import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699630RcP extends C09AY implements Function1<InterfaceC699620RcO, Unit> {
    public final /* synthetic */ List<C699090RbX<ComponentPriorityProtocol>> LL;
    public final /* synthetic */ Map<C699090RbX<ComponentPriorityProtocol>, Map<String, Object>> LLILLJJLI;
    public final /* synthetic */ List<C699090RbX<ComponentPriorityProtocol>> LLILLL;
    public final /* synthetic */ List<C699090RbX<ComponentPriorityProtocol>> LLILZ;
    public final /* synthetic */ Set<C699090RbX<ComponentPriorityProtocol>> LLILZIL;
    public final /* synthetic */ Set<C699090RbX<ComponentPriorityProtocol>> LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ List<C699090RbX<ComponentPriorityProtocol>> LLIZLLLIL;
    public final /* synthetic */ List<C699090RbX<ComponentPriorityProtocol>> LLJ;
    public final /* synthetic */ List<C699090RbX<ComponentPriorityProtocol>> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C699630RcP(List<C699090RbX<ComponentPriorityProtocol>> list, Map<C699090RbX<ComponentPriorityProtocol>, ? extends Map<String, ? extends Object>> map, List<C699090RbX<ComponentPriorityProtocol>> list2, List<C699090RbX<ComponentPriorityProtocol>> list3, Set<C699090RbX<ComponentPriorityProtocol>> set, Set<C699090RbX<ComponentPriorityProtocol>> set2, List<String> list4, List<C699090RbX<ComponentPriorityProtocol>> list5, List<C699090RbX<ComponentPriorityProtocol>> list6, List<C699090RbX<ComponentPriorityProtocol>> list7) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = map;
        this.LLILLL = list2;
        this.LLILZ = list3;
        this.LLILZIL = set;
        this.LLILZLL = set2;
        this.LLIZ = list4;
        this.LLIZLLLIL = list5;
        this.LLJ = list6;
        this.LLJI = list7;
    }

    public static final String LIZ(C699090RbX<ComponentPriorityProtocol> c699090RbX) {
        String componentKey = c699090RbX.LLILLJJLI.getComponentKey();
        if (componentKey == null) {
            String strH3 = c699090RbX.LL.H3();
            if (strH3 == null) {
                return "unknown";
            }
            return strH3;
        }
        return componentKey;
    }

    public static final String LIZIZ(C699090RbX<ComponentPriorityProtocol> c699090RbX) {
        if (c699090RbX.LL.Qm0()) {
            return "STANDARD";
        }
        return "NORMAL";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC699620RcO interfaceC699620RcO) {
        Map<String, String> mapLIZJ;
        Map<String, String> mapLIZJ2;
        C443120HZe c443120HZe;
        String str;
        Map<String, ? extends Object> map;
        InterfaceC699620RcO interfaceC699620RcO2 = interfaceC699620RcO;
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX : this.LL) {
            boolean zContainsKey = this.LLILLJJLI.containsKey(c699090RbX);
            String strLIZ = LIZ(c699090RbX);
            String strLIZIZ = LIZIZ(c699090RbX);
            Boolean bool = Boolean.TRUE;
            Boolean boolValueOf = Boolean.valueOf(!zContainsKey);
            if (zContainsKey) {
                str = "density check failed";
                map = (Map) this.LLILLJJLI.get(c699090RbX);
            } else {
                str = null;
                map = null;
            }
            interfaceC699620RcO2.LIZLLL(strLIZ, strLIZIZ, bool, null, null, null, null, null, boolValueOf, str, map, bool, null, null, null);
        }
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX2 : this.LLILLL) {
            interfaceC699620RcO2.LIZLLL(LIZ(c699090RbX2), LIZIZ(c699090RbX2), Boolean.TRUE, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null);
        }
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX3 : this.LLILZ) {
            String strLIZ2 = LIZ(c699090RbX3);
            String strLIZIZ2 = LIZIZ(c699090RbX3);
            Boolean bool2 = Boolean.TRUE;
            interfaceC699620RcO2.LIZLLL(strLIZ2, strLIZIZ2, bool2, "auto-win", C2097908Jt.LIZJ(new Pair("skip_decision", bool2)), bool2, null, null, bool2, null, null, bool2, null, null, null);
        }
        for (C699090RbX c699090RbX4 : (ArrayList) C13LP.LJLIL(this.LLILZ, C13LP.LJLIL(this.LLILLL, this.LL))) {
            if (this.LLILZIL.contains(c699090RbX4)) {
                c443120HZe = new C443120HZe(Boolean.FALSE, Boolean.TRUE, "low_priority");
            } else if (this.LLILZLL.contains(c699090RbX4)) {
                Boolean bool3 = Boolean.TRUE;
                c443120HZe = new C443120HZe(bool3, bool3, null);
            } else {
                Boolean bool4 = Boolean.FALSE;
                c443120HZe = new C443120HZe(bool4, bool4, null);
            }
            interfaceC699620RcO2.LJ(LIZ(c699090RbX4), LIZIZ(c699090RbX4), ((Boolean) c443120HZe.getFirst()).booleanValue(), "passed global decision", ((Boolean) c443120HZe.getSecond()).booleanValue(), "root_container", this.LLIZ, (String) c443120HZe.getThird(), null, null);
        }
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX5 : this.LLIZLLLIL) {
            interfaceC699620RcO2.LJ(LIZ(c699090RbX5), LIZIZ(c699090RbX5), false, "passed global decision", true, "root_container", this.LLIZ, "filtered", null, null);
        }
        Iterator<C699090RbX<ComponentPriorityProtocol>> it2 = this.LLJ.iterator();
        while (true) {
            String str2 = "unknown";
            if (!it2.hasNext()) {
                break;
            }
            C699090RbX<ComponentPriorityProtocol> next = it2.next();
            if (!next.LL.PT1()) {
                String str3 = next.LLILZ;
                if (str3 != null && !Intrinsics.LJFF(str3, next.LLILLJJLI.getComponentKey())) {
                    String str4 = next.LLILZ;
                    if (str4 == null) {
                        str4 = "unknown";
                    }
                    mapLIZJ2 = C2097908Jt.LIZJ(new Pair("real_component_key", str4));
                } else {
                    mapLIZJ2 = null;
                }
                String componentKey = next.LLILLJJLI.getComponentKey();
                if (componentKey != null) {
                    str2 = componentKey;
                }
                Boolean bool5 = Boolean.TRUE;
                interfaceC699620RcO2 = interfaceC699620RcO2;
                interfaceC699620RcO2.LIZIZ(str2, "NORMAL", bool5, bool5, mapLIZJ2, null);
            }
        }
        for (C699090RbX<ComponentPriorityProtocol> c699090RbX6 : this.LLJI) {
            if (!c699090RbX6.LL.Qm0()) {
                String str5 = c699090RbX6.LLILZ;
                if (str5 != null && !Intrinsics.LJFF(str5, c699090RbX6.LLILLJJLI.getComponentKey())) {
                    String str6 = c699090RbX6.LLILZ;
                    if (str6 == null) {
                        str6 = "unknown";
                    }
                    mapLIZJ = C2097908Jt.LIZJ(new Pair("real_visible_component", str6));
                } else {
                    mapLIZJ = null;
                }
                String componentKey2 = c699090RbX6.LLILLJJLI.getComponentKey();
                if (componentKey2 == null) {
                    componentKey2 = "unknown";
                }
                Boolean bool6 = Boolean.TRUE;
                interfaceC699620RcO2.LIZIZ(componentKey2, "NORMAL", bool6, bool6, mapLIZJ, null);
            }
        }
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821750WLl {
    public static InterfaceC821860WLw LIZ(final int i, String str, boolean z) {
        Map<Integer, List<Object>> map;
        InterfaceC821860WLw interfaceC821860WLw;
        List<Object> list;
        final String str2;
        Map<String, Map<Integer, List<Object>>> value;
        C04PY c04py = C821780WLo.LIZJ;
        final Boolean bool = null;
        if (c04py != null && (value = c04py.getValue()) != null) {
            map = value.get(str);
        } else {
            map = null;
        }
        if (Intrinsics.LJFF(str, "SparkSecurityGeckoCDNWriteService")) {
            EnumC821800WLq.Companion.getClass();
            interfaceC821860WLw = EnumC821800WLq.codeMap.get(Integer.valueOf(i));
        } else if (Intrinsics.LJFF(str, "SparkSecurityWebRouterService")) {
            EnumC821690WLf.Companion.getClass();
            interfaceC821860WLw = EnumC821690WLf.codeMap.get(Integer.valueOf(i));
        } else if (Intrinsics.LJFF(str, "SparkSecurityJSBService")) {
            EnumC821670WLd.Companion.getClass();
            interfaceC821860WLw = EnumC821670WLd.codeMap.get(Integer.valueOf(i));
        } else if (Intrinsics.LJFF(str, "SparkSecurityJSIService")) {
            EnumC821710WLh.Companion.getClass();
            interfaceC821860WLw = EnumC821710WLh.codeMap.get(Integer.valueOf(i));
        } else if (Intrinsics.LJFF(str, "SparkSecurityJSInjectionService")) {
            EnumC821730WLj.Companion.getClass();
            interfaceC821860WLw = EnumC821730WLj.codeMap.get(Integer.valueOf(i));
        } else if (Intrinsics.LJFF(str, "SparkSecurityWebNavigationService")) {
            EnumC821770WLn.Companion.getClass();
            interfaceC821860WLw = EnumC821770WLn.codeMap.get(Integer.valueOf(i));
        } else if (Intrinsics.LJFF(str, "SparkSecurityLynxService")) {
            EnumC821760WLm.Companion.getClass();
            interfaceC821860WLw = EnumC821760WLm.codeMap.get(Integer.valueOf(i));
        } else {
            interfaceC821860WLw = null;
        }
        if (z) {
            if (interfaceC821860WLw == null) {
                if (map != null && (list = map.get(Integer.valueOf(i))) != null) {
                    Object obj = ListProtector.get(list, 0);
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        str2 = null;
                    }
                    Object obj2 = ListProtector.get(list, 1);
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    }
                    return new InterfaceC821860WLw() { // from class: X.0WLr
                        @Override // X.InterfaceC821860WLw
                        public final String getDescription() {
                            String str3 = str2;
                            return str3 == null ? "" : str3;
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("code:");
                            sbLIZ.append(i);
                            sbLIZ.append("; message:");
                            sbLIZ.append(getDescription());
                            sbLIZ.append("; intercept:");
                            sbLIZ.append(bool);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC821860WLw
                        public final int getCode() {
                            return i;
                        }

                        @Override // X.InterfaceC821860WLw
                        public final Boolean getIntercept() {
                            return bool;
                        }
                    };
                }
            } else {
                return interfaceC821860WLw;
            }
        } else if (interfaceC821860WLw != null) {
            return interfaceC821860WLw;
        }
        return EnumC821790WLp.ACTION_UNKNOWN;
    }
}

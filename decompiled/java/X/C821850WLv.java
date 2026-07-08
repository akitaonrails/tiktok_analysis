package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821850WLv {
    public final boolean LIZ;
    public final Map<?, ?> LIZIZ;
    public String LIZJ;
    public C821880WLy LIZLLL;
    public C821780WLo LJ;
    public C0WLP LJFF;
    public Map<String, String> LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkSecurityResult(shouldIntercept=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C821780WLo LIZ(String str) {
        Object obj;
        Map map;
        Integer num;
        Map map2;
        int code;
        String description;
        Boolean intercept;
        InterfaceC821860WLw interfaceC821860WLw;
        InterfaceC821860WLw interfaceC821860WLw2;
        C821780WLo c821780WLo = this.LJ;
        LinkedHashMap linkedHashMap = null;
        InterfaceC821860WLw interfaceC821860WLw3 = null;
        linkedHashMap = null;
        if (c821780WLo != null) {
            InterfaceC821860WLw interfaceC821860WLw4 = c821780WLo.LIZ;
            if (interfaceC821860WLw4 != null) {
                code = interfaceC821860WLw4.getCode();
            } else {
                code = 0;
            }
            InterfaceC821860WLw interfaceC821860WLwLIZ = C821750WLl.LIZ(code, str, false);
            EnumC821790WLp enumC821790WLp = EnumC821790WLp.ACTION_UNKNOWN;
            if (interfaceC821860WLwLIZ != enumC821790WLp) {
                String description2 = interfaceC821860WLwLIZ.getDescription();
                C821780WLo c821780WLo2 = this.LJ;
                if (c821780WLo2 != null && (interfaceC821860WLw2 = c821780WLo2.LIZ) != null) {
                    description = interfaceC821860WLw2.getDescription();
                } else {
                    description = null;
                }
                boolean zLJFF = Intrinsics.LJFF(description2, description);
                Boolean intercept2 = interfaceC821860WLwLIZ.getIntercept();
                C821780WLo c821780WLo3 = this.LJ;
                if (c821780WLo3 != null && (interfaceC821860WLw = c821780WLo3.LIZ) != null) {
                    intercept = interfaceC821860WLw.getIntercept();
                } else {
                    intercept = null;
                }
                boolean zLJFF2 = Intrinsics.LJFF(intercept2, intercept);
                if (zLJFF && zLJFF2) {
                    C821780WLo c821780WLo4 = this.LJ;
                    if (c821780WLo4 != null) {
                        interfaceC821860WLw3 = c821780WLo4.LIZ;
                    }
                    if (!Intrinsics.LJFF(interfaceC821860WLw3, interfaceC821860WLwLIZ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("bad action obj, current:");
                        sbLIZ.append(this.LJ);
                        this.LIZLLL = new C821880WLy(10000, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return this.LJ;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mismatched action found, current:");
                sbLIZ2.append(this.LJ);
                sbLIZ2.append(", require:{");
                sbLIZ2.append(interfaceC821860WLwLIZ);
                sbLIZ2.append('}');
                this.LIZLLL = new C821880WLy(505, C2188811AlT.LIZIZ(sbLIZ2));
                this.LJ = null;
                return new C821780WLo(enumC821790WLp);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("missing action, current action is ");
            sbLIZ3.append(this.LJ);
            this.LIZLLL = new C821880WLy(404, C2188811AlT.LIZIZ(sbLIZ3));
            this.LJ = null;
            return new C821780WLo(enumC821790WLp);
        }
        Map<?, ?> map3 = this.LIZIZ;
        if (map3 != null) {
            obj = map3.get("action");
        } else {
            obj = null;
        }
        if ((obj instanceof Map) && (map = (Map) obj) != null) {
            Object obj2 = map.get("code");
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                InterfaceC821860WLw interfaceC821860WLwLIZ2 = C821750WLl.LIZ(num.intValue(), str, true);
                EnumC821790WLp enumC821790WLp2 = EnumC821790WLp.ACTION_UNKNOWN;
                if (interfaceC821860WLwLIZ2 != enumC821790WLp2) {
                    String description3 = interfaceC821860WLwLIZ2.getDescription();
                    Object obj3 = map.get("message");
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    boolean zLJFF3 = Intrinsics.LJFF(description3, obj3);
                    Boolean intercept3 = interfaceC821860WLwLIZ2.getIntercept();
                    Object obj4 = map.get("intercept");
                    if (!(obj4 instanceof Boolean)) {
                        obj4 = null;
                    }
                    boolean zLJFF4 = Intrinsics.LJFF(intercept3, obj4);
                    if (zLJFF3 && zLJFF4) {
                        Object obj5 = map.get("data");
                        if ((obj5 instanceof Map) && (map2 = (Map) obj5) != null) {
                            linkedHashMap = new LinkedHashMap(map2);
                        }
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        C821780WLo c821780WLo5 = new C821780WLo(interfaceC821860WLwLIZ2, linkedHashMap);
                        this.LJ = c821780WLo5;
                        return c821780WLo5;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("mismatched action found, required:");
                    sbLIZ4.append(map);
                    sbLIZ4.append(", found:{");
                    sbLIZ4.append(interfaceC821860WLwLIZ2);
                    sbLIZ4.append('}');
                    this.LIZLLL = new C821880WLy(505, C2188811AlT.LIZIZ(sbLIZ4));
                    return new C821780WLo(enumC821790WLp2);
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("missing action, required action is ");
                sbLIZ5.append(map);
                this.LIZLLL = new C821880WLy(404, C2188811AlT.LIZIZ(sbLIZ5));
                return new C821780WLo(enumC821790WLp2);
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("bad action is ");
            sbLIZ6.append(map);
            this.LIZLLL = new C821880WLy(500, C2188811AlT.LIZIZ(sbLIZ6));
            return new C821780WLo(EnumC821790WLp.ACTION_UNKNOWN);
        }
        return new C821780WLo(EnumC821790WLp.ACTION_NO);
    }

    public C821850WLv(boolean z, Map<?, ?> map) {
        this.LIZ = z;
        this.LIZIZ = map;
    }
}

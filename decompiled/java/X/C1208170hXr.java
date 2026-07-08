package X;

import android.app.Activity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208170hXr {
    public final InterfaceC19359210oY LIZ;
    public final InterfaceC19359210oY LIZIZ;
    public final InterfaceC19359210oY LIZJ;
    public final Map<Pair<String, EnumC1208400hYE>, InterfaceC19359210oY> LIZLLL = Collections.synchronizedMap(new HashMap());

    public C1208170hXr(InterfaceC19359210oY interfaceC19359210oY, InterfaceC19359210oY interfaceC19359210oY2, InterfaceC19359210oY interfaceC19359210oY3) {
        this.LIZ = interfaceC19359210oY;
        this.LIZIZ = interfaceC19359210oY2;
        this.LIZJ = interfaceC19359210oY3;
    }

    public final C12Q8 LIZ(Activity activity, EnumC1208400hYE enumC1208400hYE, String str) {
        C12Q8 c12q8LIZ;
        if (str != null) {
            InterfaceC19359210oY interfaceC19359210oY = this.LIZLLL.get(new Pair(str, enumC1208400hYE));
            if (interfaceC19359210oY != null) {
                C12Q8 c12q8LIZ2 = interfaceC19359210oY.LIZ(activity, C1207970hXX.LIZ);
                if (c12q8LIZ2 != null) {
                    return c12q8LIZ2;
                }
                C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Custom DialogMaker '");
                sbLIZ.append(str);
                sbLIZ.append("' returned null for Default, falling back");
                C1798620wuC.LIZLLL("DialogManager", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DialogMaker with name '");
                sbLIZ2.append(str);
                sbLIZ2.append("' for target ");
                sbLIZ2.append(enumC1208400hYE);
                sbLIZ2.append(" not registered, falling back to default");
                C1798620wuC.LJ("DialogManager", C2188811AlT.LIZIZ(sbLIZ2), null);
            }
        }
        int i = C1208380hYC.LIZ[enumC1208400hYE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                c12q8LIZ = this.LIZJ.LIZ(activity, C1207970hXX.LIZ);
                if (c12q8LIZ == null) {
                    "Default system dialog maker returned null".toString();
                    throw new IllegalArgumentException("Default system dialog maker returned null");
                }
            } else {
                c12q8LIZ = this.LIZIZ.LIZ(activity, C1207970hXX.LIZ);
                if (c12q8LIZ == null) {
                    "Default in-app promote dialog maker returned null".toString();
                    throw new IllegalArgumentException("Default in-app promote dialog maker returned null");
                }
            }
        } else {
            c12q8LIZ = this.LIZ.LIZ(activity, C1207970hXX.LIZ);
            if (c12q8LIZ == null) {
                "Default system promote dialog maker returned null".toString();
                throw new IllegalArgumentException("Default system promote dialog maker returned null");
            }
        }
        return c12q8LIZ;
    }

    public final C12Q8 LIZIZ(Activity activity, AbstractC1207960hXW abstractC1207960hXW, String str, InterfaceC19359210oY interfaceC19359210oY) {
        if (interfaceC19359210oY != null) {
            C12Q8 c12q8LIZ = interfaceC19359210oY.LIZ(activity, abstractC1207960hXW);
            if (c12q8LIZ != null) {
                return c12q8LIZ;
            }
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Parameter DialogMaker returned null for ");
            sbLIZ.append(abstractC1207960hXW);
            sbLIZ.append(", falling back");
            C1798620wuC.LIZLLL("DialogManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (str != null) {
            InterfaceC19359210oY interfaceC19359210oY2 = this.LIZLLL.get(new Pair(str, EnumC1208400hYE.System));
            if (interfaceC19359210oY2 != null) {
                C12Q8 c12q8LIZ2 = interfaceC19359210oY2.LIZ(activity, abstractC1207960hXW);
                if (c12q8LIZ2 != null) {
                    return c12q8LIZ2;
                }
                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Custom DialogMaker '");
                sbLIZ2.append(str);
                sbLIZ2.append("' returned null for ");
                sbLIZ2.append(abstractC1207960hXW);
                sbLIZ2.append(", falling back to default");
                C1798620wuC.LIZLLL("DialogManager", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("DialogMaker with name '");
                sbLIZ3.append(str);
                sbLIZ3.append("' for System not registered, falling back to default");
                C1798620wuC.LJ("DialogManager", C2188811AlT.LIZIZ(sbLIZ3), null);
            }
        }
        C12Q8 c12q8LIZ3 = this.LIZJ.LIZ(activity, abstractC1207960hXW);
        if (c12q8LIZ3 == null && (c12q8LIZ3 = this.LIZJ.LIZ(activity, C1207970hXX.LIZ)) == null) {
            "Default system dialog maker returned null".toString();
            throw new IllegalArgumentException("Default system dialog maker returned null");
        }
        return c12q8LIZ3;
    }
}

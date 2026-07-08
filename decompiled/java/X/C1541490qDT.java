package X;

import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qDT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541490qDT {
    public static C1521250pgp LIZ;
    public static boolean LIZJ;
    public static String LJI;
    public static int LIZIZ = 1;
    public static C1541400qDK LIZLLL = new C1541400qDK();
    public static C1541700qDo LJ = new C1541700qDo();
    public static Function1<? super C1541520qDW, Unit> LJFF = new C1541750qDt();

    public static InterfaceC1541880qE6 LIZ(C1538050q7v c1538050q7v, InterfaceC1529520puA interfaceC1529520puA, HybridSchemaParam hybridSchemaParam) {
        C1541580qDc c1541580qDc;
        Object obj;
        String str;
        Object obj2;
        String str2;
        C1535690q47 c1535690q47;
        if ((interfaceC1529520puA instanceof C1535690q47) && (c1535690q47 = (C1535690q47) interfaceC1529520puA) != null) {
            c1541580qDc = c1535690q47.LIZ;
        } else {
            c1541580qDc = null;
        }
        if (!(c1541580qDc instanceof C1541580qDc)) {
            return null;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needSecLink: ");
        sbLIZ.append(hybridSchemaParam.getNeedSecLink());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
        if (!hybridSchemaParam.getNeedSecLink()) {
            return null;
        }
        if (c1538050q7v != null) {
            obj = c1538050q7v.get("appLanguage");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (c1538050q7v != null) {
            obj2 = c1538050q7v.get("aid");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            c1541580qDc.getClass();
            String secLinkScene = hybridSchemaParam.getSecLinkScene();
            if (secLinkScene != null && secLinkScene.length() != 0) {
                c1541580qDc.LIZ = hybridSchemaParam.getSecLinkScene();
            }
            return c1541580qDc;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("secLink miss config, appLanguage: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", aid: ");
        sbLIZ2.append(str2);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ2), null, null, 6);
        return null;
    }
}

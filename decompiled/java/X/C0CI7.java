package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0CI7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CI7 {
    public static final String[] LIZ;

    static {
        C0CI4[] c0ci4ArrValues = C0CI4.values();
        ArrayList arrayList = new ArrayList(c0ci4ArrValues.length);
        for (C0CI4 c0ci4 : c0ci4ArrValues) {
            arrayList.add(c0ci4.getSceneName());
        }
        LIZ = (String[]) arrayList.toArray(new String[0]);
    }

    public static List LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Object[] objArr = LIZ;
        Object[] objArr2 = (Object[]) c0c64LJIILLIIL.LJJIII("studio_editor_pro_adjust_unsupport_template_scenes", 0, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        return C13LQ.LJJLL(objArr);
    }

    public static boolean LIZIZ() {
        return LIZ().contains(C0CI4.TEMPLATE_ANCHOR.getSceneName());
    }
}

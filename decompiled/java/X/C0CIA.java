package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0CIA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIA {
    public static final String[] LIZ;

    static {
        C0CI4[] c0ci4ArrValues = C0CI4.values();
        ArrayList arrayList = new ArrayList(c0ci4ArrValues.length);
        for (C0CI4 c0ci4 : c0ci4ArrValues) {
            arrayList.add(c0ci4.getSceneName());
        }
        LIZ = (String[]) arrayList.toArray(new String[0]);
    }

    public static String[] LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        String[] strArr = LIZ;
        String[] strArr2 = (String[]) c0c64LJIILLIIL.LJJIII("studio_editor_pro_text_effect_style_unsupport_template_scenes", 0, strArr);
        return strArr2 != null ? strArr2 : strArr;
    }

    public static boolean LIZIZ() {
        return C13LQ.LJIILLIIL(C0CI4.TEMPLATE_ANCHOR.getSceneName(), LIZ());
    }
}

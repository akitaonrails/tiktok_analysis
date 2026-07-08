package X;

import java.util.List;

/* JADX INFO: renamed from: X.0CIE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIE {
    public static final String[] LIZ = new String[0];

    public static List LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Object[] objArr = LIZ;
        Object[] objArr2 = (Object[]) c0c64LJIILLIIL.LJJIII("studio_editor_pro_caption_anim_unsupport_template_scenes", 0, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        return C13LQ.LJJLL(objArr);
    }

    public static boolean LIZIZ() {
        return LIZ().contains(C0CI4.TEMPLATE_ANCHOR.getSceneName());
    }
}

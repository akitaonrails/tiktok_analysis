package X;

/* JADX INFO: renamed from: X.0CIH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIH {
    public static final String[] LIZ = {C0CI4.AUTOCUT_LIST.getSceneName()};

    public static boolean LIZ(C0CI4 c0ci4) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Object[] objArr = LIZ;
        Object[] objArr2 = (Object[]) c0c64LJIILLIIL.LJJIII("studio_editor_pro_magic_unsupport_template_scenes", 0, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        if (C13LQ.LJJLL(objArr).contains(c0ci4.getSceneName())) {
            return false;
        }
        int i = C2520409uE.LIZ;
        C1432940nOO.LIZ.getClass();
        float fLJ = C1432940nOO.LJ();
        int i2 = C2520409uE.LIZ;
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (fLJ <= i2) {
            return false;
        }
        return true;
    }
}

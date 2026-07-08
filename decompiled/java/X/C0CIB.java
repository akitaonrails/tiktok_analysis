package X;

/* JADX INFO: renamed from: X.0CIB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIB {
    public static final String[] LIZ = {C0CI4.AUTOCUT_LIST.getSceneName()};

    public static boolean LIZ(C0CI4 c0ci4) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Object[] objArr = LIZ;
        Object[] objArr2 = (Object[]) c0c64LJIILLIIL.LJJIII("studio_editor_pro_i2v_unsupport_template_scenes_v2", 0, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        return !C13LQ.LJJLL(objArr).contains(c0ci4.getSceneName());
    }
}

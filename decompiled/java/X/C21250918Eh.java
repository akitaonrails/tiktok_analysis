package X;

import android.app.Dialog;

/* JADX INFO: renamed from: X.18Eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21250918Eh extends C18E4<Dialog> {
    public static final C21250918Eh LIZ = new C21250918Eh();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogFilter_");
        sbLIZ.append("onCreated");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DialogFilter_");
        sbLIZ2.append("buildPageTree");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("DialogFilter_");
        sbLIZ3.append("isResumeFiltered");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // X.C18E4
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final EnumC21251518En LIZIZ(Dialog dialog, EnumC21250718Ef enumC21250718Ef) {
        String name = dialog.getClass().getName();
        String str = LIZLLL;
        C18CK.LJI(str, new C21254918Fv(name, enumC21250718Ef));
        EnumC21251518En enumC21251518EnLIZIZ = super.LIZIZ(dialog, enumC21250718Ef);
        if (enumC21251518EnLIZIZ != null) {
            C18CK.LJI(str, new C18FZ(name));
            return enumC21251518EnLIZIZ;
        }
        if (!dialog.isShowing()) {
            C18CK.LJI(str, new C21252818Fa(name));
            return EnumC21251518En.DialogNotShowing;
        }
        return null;
    }
}

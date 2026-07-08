package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.18EM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EM extends C18E7 {
    public static final C18EM LJ = new C18EM();
    public static final String LJFF;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackActivityResumer_");
        sbLIZ.append("tryResumePageWhenPaused");
        LJFF = C2188811AlT.LIZIZ(sbLIZ);
    }

    public C18EM() {
        super(EnumC21250718Ef.BackActivity, 1027, 1024);
    }

    @Override // X.C18E7
    public final void LJ(Activity activity, C18E9 c18e9) {
        if (C18CS.LIZ.LIZIZ().LIZJ() == 1) {
            super.LJ(activity, c18e9);
            return;
        }
        if (LJII(activity, c18e9) || LJIIIZ(activity, c18e9)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseBackResumer_");
        sbLIZ.append("tryResumeTopOrPrePages");
        C18CK.LJFF(C2188811AlT.LIZIZ(sbLIZ), new C21257818Gy(this));
        InterfaceC21252118Et interfaceC21252118EtLIZJ = c18e9.LIZJ(c18e9.LLILZIL);
        C118300cf c118300cf = new C118300cf();
        while (interfaceC21252118EtLIZJ != null && c118300cf.element < 5) {
            Object objLJIIJ = interfaceC21252118EtLIZJ.LJIIJ();
            if (objLJIIJ != null) {
                String str = C18EO.LIZ;
                if (C18EO.LIZJ(objLJIIJ, this.LIZ) == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BaseBackResumer_");
                    sbLIZ2.append("tryResumeTopOrPrePages");
                    C18CK.LJFF(C2188811AlT.LIZIZ(sbLIZ2), new C117900cb(c118300cf));
                    return;
                }
            }
            interfaceC21252118EtLIZJ = interfaceC21252118EtLIZJ.LJIILIIL();
            c118300cf.element++;
        }
        LIZJ(activity, "");
    }
}

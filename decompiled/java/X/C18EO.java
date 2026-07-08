package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.18EO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EO {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterDispatcher_");
        sbLIZ.append("onCreated");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("FilterDispatcher_");
        sbLIZ2.append("onResumed");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("FilterDispatcher_");
        sbLIZ3.append("onPaused");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("FilterDispatcher_");
        sbLIZ4.append("onDestroyed");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ4);
    }

    public static EnumC21251518En LIZ(Object obj, EnumC21250718Ef enumC21250718Ef) {
        if (obj instanceof Activity) {
            return C18EA.LIZ.LIZIZ((Activity) obj, enumC21250718Ef);
        }
        if (obj instanceof Fragment) {
            return C18EB.LIZ.LIZIZ((Fragment) obj, enumC21250718Ef);
        }
        if (obj instanceof Dialog) {
            return C21250918Eh.LIZ.LIZIZ((Dialog) obj, enumC21250718Ef);
        }
        if (obj instanceof View) {
            return C18FH.LIZ.LIZIZ(obj, enumC21250718Ef);
        }
        return EnumC21251518En.Other;
    }

    public static void LIZIZ(Object obj, EnumC21251218Ek enumC21251218Ek) {
        C18CK.LJI(LIZJ, new C18HM(obj.getClass().getName()));
        if (obj instanceof Activity) {
            C18E4.LIZLLL(obj, enumC21251218Ek);
            return;
        }
        if (obj instanceof Fragment) {
            C18E4.LIZLLL(obj, enumC21251218Ek);
            return;
        }
        if (obj instanceof Dialog) {
            C21250918Eh c21250918Eh = C21250918Eh.LIZ;
            C18E4.LIZLLL(obj, enumC21251218Ek);
        } else {
            if (!(obj instanceof View)) {
                return;
            }
            C18FH c18fh = C18FH.LIZ;
            C18E4.LIZLLL(obj, enumC21251218Ek);
        }
    }

    public static EnumC21251518En LIZJ(Object obj, EnumC21250718Ef enumC21250718Ef) {
        C18CK.LJI(LIZIZ, new C21257718Gx(obj.getClass().getName()));
        if (obj instanceof Activity) {
            return C18EA.LIZ.LJ(obj, enumC21250718Ef);
        }
        if (obj instanceof Fragment) {
            return C18EB.LIZ.LJ(obj, enumC21250718Ef);
        }
        if (obj instanceof Dialog) {
            return C21250918Eh.LIZ.LJ(obj, enumC21250718Ef);
        }
        if (obj instanceof View) {
            return C18FH.LIZ.LJ(obj, enumC21250718Ef);
        }
        return EnumC21251518En.Other;
    }

    public static void LIZLLL(Object obj, EnumC21250718Ef enumC21250718Ef) {
        if (obj instanceof Activity) {
            C18E4.LJFF(obj, enumC21250718Ef);
            return;
        }
        if (obj instanceof Fragment) {
            C18E4.LJFF(obj, enumC21250718Ef);
            return;
        }
        if (obj instanceof Dialog) {
            C21250918Eh c21250918Eh = C21250918Eh.LIZ;
            C18E4.LJFF(obj, enumC21250718Ef);
        } else {
            if (!(obj instanceof View)) {
                return;
            }
            C18FH c18fh = C18FH.LIZ;
            C18E4.LJFF(obj, enumC21250718Ef);
        }
    }
}

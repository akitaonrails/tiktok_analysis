package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Drp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352470Drp {
    public static final C352470Drp LIZ = new C352470Drp();
    public static final Map<String, C352510Drt> LIZIZ = new LinkedHashMap();
    public static final Map<String, C352510Drt> LIZJ = new LinkedHashMap();

    public static final void LIZ() {
        C352470Drp c352470Drp = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelJobs: jobMap = ");
        sbLIZ.append(C13LP.LJJLIIIJ(((LinkedHashMap) LIZIZ).keySet(), null, null, null, 0, null, null, 63));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c352470Drp.getClass();
        LIZLLL(strLIZIZ);
        Iterator it2 = ((LinkedHashMap) LIZJ).values().iterator();
        while (it2.hasNext()) {
            ((C352510Drt) it2.next()).LIZ();
        }
        ((LinkedHashMap) LIZJ).clear();
        Iterator it3 = ((LinkedHashMap) LIZIZ).values().iterator();
        while (it3.hasNext()) {
            ((C352510Drt) it3.next()).LIZ();
        }
        ((LinkedHashMap) LIZIZ).clear();
    }

    public static C352510Drt LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZJ;
        if (linkedHashMap.get(str) != null) {
            return (C352510Drt) linkedHashMap.get(str);
        }
        C352510Drt c352510Drt = (C352510Drt) ((LinkedHashMap) LIZIZ).get(str);
        if (c352510Drt == null) {
            return null;
        }
        return c352510Drt;
    }

    public static void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResizeMediasTask ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LIZIZ(String str, String str2, String str3, boolean z) {
        String strLIZIZ;
        String strLIZIZ2;
        String path;
        C0VSJ c0vsjLJJIJLIJ = C2471909mP.LIZ.LJJIJLIJ(str2);
        String lowerCase = null;
        if (c0vsjLJJIJLIJ == null) {
            c0vsjLJJIJLIJ = null;
        }
        if (c0vsjLJJIJLIJ != null && ((Boolean) C0B7S.LIZ.getValue()).booleanValue()) {
            strLIZIZ = u.LJJIFFI(u.LJJIFFI(C20130113pb.LJ(c0vsjLJJIJLIJ), ":", "_", false), ";", "", false);
        } else {
            strLIZIZ = C08F1.LIZIZ(str2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        if (!C123100dR.LIZ(str3)) {
            strLIZIZ2 = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('_');
            sbLIZ2.append(str3);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ3.length() == 0) {
            strLIZIZ3 = String.valueOf(System.currentTimeMillis());
        }
        if (!z) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append('/');
            sbLIZ3.append(strLIZIZ3);
            sbLIZ3.append(".mp4");
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (c0vsjLJJIJLIJ != null && (path = c0vsjLJJIJLIJ.getPath()) != null) {
            str2 = path;
        }
        boolean zLIZ = C309720CCc.LIZ(C2471909mP.LJIJI(str2));
        String strLJJLJ = a0.LJJLJ('.', str2, "");
        if (strLJJLJ.length() > 0) {
            lowerCase = strLJJLJ.toLowerCase(Locale.ROOT);
        }
        if (zLIZ && lowerCase != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append('/');
            sbLIZ4.append(strLIZIZ3);
            sbLIZ4.append('.');
            sbLIZ4.append(lowerCase);
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(str);
        sbLIZ5.append('/');
        sbLIZ5.append(strLIZIZ3);
        sbLIZ5.append(".png");
        return C2188811AlT.LIZIZ(sbLIZ5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C099G LJ(android.content.Context r19, com.bytedance.ies.nle.editor_jni.NLETrackSlot r20, java.lang.String r21, boolean r22, X.C2473609mg r23) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352470Drp.LJ(android.content.Context, com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.String, boolean, X.09mg):X.099G");
    }
}

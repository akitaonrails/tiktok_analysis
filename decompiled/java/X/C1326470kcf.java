package X;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326470kcf {
    public static boolean LIZJ() {
        return C2281551ESb.LIZIZ.LJJIIJZLJL();
    }

    public static <DATA> String LIZLLL(InterfaceC1326460kce<DATA> interfaceC1326460kce, DATA data) {
        String lastPathSegment;
        Uri uriLJ = interfaceC1326460kce.LJ(data);
        if (uriLJ == null || (lastPathSegment = uriLJ.getLastPathSegment()) == null) {
            lastPathSegment = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("icon_cache_");
        sbLIZ.append(lastPathSegment);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJ(InterfaceC1326460kce interfaceC1326460kce, Object obj, C0VSJ c0vsj) {
        if (c0vsj.exists() && c0vsj.getName().equals(interfaceC1326460kce.LIZIZ(obj))) {
            return true;
        }
        return false;
    }

    public static <DATA> boolean LIZ(InterfaceC1326460kce<DATA> interfaceC1326460kce, DATA data, C1322110kVd c1322110kVd, int i, int i2, Bitmap.Config config, InterfaceC1325670kbN interfaceC1325670kbN, C1320700kTM<InterfaceC1330440kj4> c1320700kTM, Function0<Unit> function0) {
        String strLIZJ = interfaceC1326460kce.LIZJ(data);
        if (strLIZJ != null) {
            C0VSJ c0vsj = new C0VSJ(strLIZJ);
            if (LJ(interfaceC1326460kce, data, c0vsj)) {
                C1324750kZt.LJ(c1322110kVd, Uri.fromFile(c0vsj), i, i2, null, config, interfaceC1326460kce.LIZLLL(c1320700kTM, function0), interfaceC1325670kbN);
                return true;
            }
        }
        function0.invoke();
        return false;
    }
}

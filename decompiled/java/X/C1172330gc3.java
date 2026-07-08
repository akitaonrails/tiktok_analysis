package X;

import Y.ACListenerS0S2400000_18;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0gc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172330gc3 {
    public static final C1172330gc3 LIZ = new C1172330gc3();

    public static void LIZ(C1172330gc3 c1172330gc3, View view, int i, String str, View view2, String str2, HashMap map, PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, int i2) {
        int i3;
        InterfaceC665370Q7z interfaceC665370Q7zLJ = interfaceC665370Q7z;
        HashMap map2 = map;
        String str3 = str;
        if ((i2 & 4) != 0) {
            str3 = "poi_detail";
        }
        if ((i2 & 8) != 0) {
            view2 = null;
        }
        if ((i2 & 32) != 0) {
            map2 = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC665370Q7zLJ = null;
        }
        c1172330gc3.getClass();
        C1389910mGz c1389910mGz = new C1389910mGz(view);
        c1389910mGz.LIZ.LJIIIZ = view2;
        c1389910mGz.LJI(R.style.y2);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 2;
        c1389910mGz.LJFF(2131858568);
        if (C1206904nr.LIZ()) {
            i3 = 2131844689;
        } else {
            i3 = 2131858569;
        }
        c1389910mGz.LJIIIZ(i3);
        c1389910mGz.LIZIZ(i);
        c1389910mGz.LJ(3000L);
        c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS0S2400000_18(str3, map2, interfaceC665370Q7zLJ, view, str2, pageFinder, 1);
        c1389910mGz.LJIIJJI();
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        if (interfaceC665370Q7zLJ == null) {
            interfaceC665370Q7zLJ = C1558360qeg.LJ(view, null);
        }
        c1185430gxB.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJ);
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_poi_favourite_toast_show", linkedHashMap, c1185050gwZ);
    }
}

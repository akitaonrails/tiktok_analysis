package X;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C990503u3 {
    public static final C990503u3 LIZ = new C990503u3();

    public static int LIZIZ() {
        return AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, EnumC955203oM.TTS, "product_review", null, null, 12);
    }

    public static void LIZJ(HashMap map) {
        String string;
        Object objRemove = map.remove("track_params");
        if (objRemove != null) {
            if (!(objRemove instanceof Number) && !(objRemove instanceof String) && !(objRemove instanceof Character)) {
                string = C1741890vQh.LJIIIIZZ(objRemove);
            } else {
                string = objRemove.toString();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("track_params_");
            sbLIZ.append(System.currentTimeMillis());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C212391189t.LIZ.getClass();
            C212391189t.LIZIZ("product_review_gallery", strLIZIZ, string);
            map.put("track_params_key", strLIZIZ);
        }
    }

    public static void LIZ(C426160GnO c426160GnO, List list, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq) {
        int i;
        if (list != null && !list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLZ(i, c426160GnO);
        if (!Intrinsics.LJFF(c426160GnO.getTag(), list) && list != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View childAt = c426160GnO.getChildAt(i2);
                    if (childAt == null) {
                        View view = (View) function1.invoke(obj);
                        c426160GnO.addView(view);
                        interfaceC1631620sYq.invoke(view, obj, Integer.valueOf(i2));
                    } else {
                        C786410Ut5.LJLLLLLL(0, childAt);
                        interfaceC1631620sYq.invoke(childAt, obj, Integer.valueOf(i2));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (c426160GnO.getChildCount() > list.size()) {
                int childCount = c426160GnO.getChildCount();
                for (int size = list.size(); size < childCount; size++) {
                    C786410Ut5.LJLLLLLL(8, c426160GnO.getChildAt(size));
                }
                return;
            }
            return;
        }
        c426160GnO.setTag(list);
    }
}

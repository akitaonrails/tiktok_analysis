package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.03pM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C961403pM {
    public static final void LIZ(View view, List<Float> list) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4 = 0;
        if (list != null && list.size() == 4) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 3)));
        } else {
            iLIZIZ = 0;
        }
        if (list != null && list.size() == 4) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 0)));
        } else {
            iLIZIZ2 = 0;
        }
        if (list != null && list.size() == 4) {
            iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 1)));
        } else {
            iLIZIZ3 = 0;
        }
        if (list != null && list.size() == 4) {
            iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 2)));
        }
        if (view.getPaddingLeft() == iLIZIZ && view.getPaddingTop() == iLIZIZ2 && view.getPaddingRight() == iLIZIZ3 && view.getPaddingBottom() == iLIZIZ4) {
            return;
        }
        view.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ3, iLIZIZ4);
    }
}

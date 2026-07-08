package X;

import android.graphics.Color;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0EZ3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZ3 {
    public static final int LIZ = C12ES.LJIIJ(C0CHQ.LIZ) - (((int) C12ES.LIZJ(24.0f, C0CHQ.LIZ)) * 2);
    public static int[] LIZIZ;

    public static int[] LIZ() {
        int color;
        List<String> listLIZJ = C0CHQ.LIZ().LJJJ().LIZJ();
        if (listLIZJ == null || listLIZJ.isEmpty()) {
            int[] iArr = LIZIZ;
            if (iArr != null) {
                return iArr;
            }
            int[] intArray = C0CHQ.LIZ.getResources().getIntArray(R.array.y);
            LIZIZ = intArray;
            return intArray;
        }
        int[] iArr2 = new int[listLIZJ.size()];
        for (int i = 0; i < listLIZJ.size(); i++) {
            try {
                color = Color.parseColor((String) ListProtector.get(listLIZJ, i));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                color = -1;
            }
            iArr2[i] = color;
        }
        return iArr2;
    }
}

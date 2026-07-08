package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600250NgV {
    public static final void LIZ(C0N6M c0n6m, EnumC600270NgX enumC600270NgX) {
        boolean zLIZIZ;
        List<String> listLIZ;
        int i = C600260NgW.LIZ[enumC600270NgX.ordinal()];
        if (i != 1) {
            if (i == 2) {
                zLIZIZ = C1833207Fy.LIZ();
            } else {
                throw new C1954807lC();
            }
        } else {
            zLIZIZ = C1833207Fy.LIZIZ();
        }
        if (!zLIZIZ) {
            return;
        }
        try {
            listLIZ = c0n6m.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            listLIZ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listLIZ) {
            if (!a0.LJJJIL(str)) {
                arrayList.add(str);
            }
        }
        List listLL = C13LP.LL(C13LP.LJJJJI(arrayList), 6);
        if (listLL.isEmpty()) {
            return;
        }
        enumC600270NgX.name().toLowerCase(Locale.ROOT);
        c0n6m.LIZ.name();
        C0I99.LIZ(listLL, 1, false, null);
    }
}

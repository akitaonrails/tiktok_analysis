package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HFT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HFT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(395));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(396));

    public static C0HFS LIZ(int i) {
        Object next;
        Iterator it2 = ((List) LIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C0HFS) next).LIZ == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C0HFS) next;
    }

    public static Integer LIZIZ(String str) {
        boolean z;
        Integer numValueOf = null;
        if (str != null) {
            try {
                if (str.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    str = null;
                }
                if (str != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(str);
                    numValueOf = Integer.valueOf(Color.parseColor(C2188811AlT.LIZIZ(sbLIZ)));
                    return numValueOf;
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return numValueOf;
    }
}

package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030790cvl {
    public static final C1030790cvl LIZ = new C1030790cvl();
    public static boolean LIZIZ;
    public static C1031040cwA LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList LIZ(boolean r16) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030790cvl.LIZ(boolean):java.util.ArrayList");
    }

    public static int LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("topview brand safety parse number");
            return 0;
        }
    }

    public static boolean LIZIZ(String str, ArrayList arrayList) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((C1030780cvk) it2.next()).LIZ, str)) {
                return true;
            }
        }
        return false;
    }
}

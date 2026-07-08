package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468610oJv {
    public final C1468620oJw LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public Map<Integer, List<Integer>> LJFF;
    public final Map<String, Object> LJI;

    public C1468610oJv() {
        C1468620oJw c1468620oJw = new C1468620oJw();
        this.LIZ = c1468620oJw;
        this.LIZIZ = 1;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = -1;
        this.LJFF = new HashMap();
        HashMap map = new HashMap();
        this.LJI = map;
        c1468620oJw.LIZ();
        Boolean bool = Boolean.FALSE;
        c1468620oJw.LIZ = bool;
        c1468620oJw.LJIIJJI = bool;
        c1468620oJw.LJIIZILJ = bool;
        this.LIZIZ = 1;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = -1;
        map.clear();
        this.LJFF.put(2, new ArrayList(Arrays.asList(3)));
    }

    public static int LIZ(C1474520oTS c1474520oTS) {
        int index;
        EnumC2281151EQn resolution = c1474520oTS.getResolution();
        if (resolution != null) {
            index = resolution.getIndex();
        } else {
            index = -1;
        }
        String strLIZ = c1474520oTS.LIZ(32);
        if (strLIZ != null) {
            try {
                index = CastIntegerProtector.parseInt(strLIZ);
                return index;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return index;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x012f, code lost:
    
        if (r2.compareTo(java.lang.Integer.valueOf(r0.intValue() & r2.intValue())) != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x016c, code lost:
    
        if (r2.compareTo(java.lang.Integer.valueOf(r0.intValue() & r2.intValue())) != 0) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C1468620oJw r8) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468610oJv.LIZJ(X.0oJw):void");
    }

    public final void LIZIZ(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && !((HashMap) this.LJI).containsKey(str)) {
            ((HashMap) this.LJI).put(str, obj);
        }
    }
}

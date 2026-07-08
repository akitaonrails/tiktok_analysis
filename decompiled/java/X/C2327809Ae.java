package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2327809Ae extends C2327709Ad {
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJI(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2327809Ae.LJI(java.lang.String):boolean");
    }

    public static final Double LJII(String str) {
        Double dValueOf = null;
        try {
            if (LJI(str)) {
                dValueOf = Double.valueOf(CastDoubleProtector.parseDouble(str));
                return dValueOf;
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return dValueOf;
    }

    public static final Float LJIIIIZZ(String str) {
        Float fValueOf = null;
        try {
            if (LJI(str)) {
                fValueOf = Float.valueOf(CastFloatProtector.parseFloat(str));
                return fValueOf;
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return fValueOf;
    }
}

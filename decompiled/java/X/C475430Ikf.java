package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ikf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475430Ikf {
    public static String LIZ(String str) {
        try {
            Integer numValueOf = CastIntegerProtector.valueOf(str);
            InterfaceC475400Ikc.LIZ.getClass();
            return C1583980rK0.LIZ(numValueOf);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}

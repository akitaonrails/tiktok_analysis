package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0enz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102850enz {
    public static EnumC1102740eno LIZ(EnumC1102750enp enumC1102750enp) {
        try {
            return EnumC1102740eno.valueOf(enumC1102750enp.name());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZIZ(EnumC1102750enp enumC1102750enp) {
        if (LIZ(enumC1102750enp) != null) {
            return true;
        }
        return false;
    }
}

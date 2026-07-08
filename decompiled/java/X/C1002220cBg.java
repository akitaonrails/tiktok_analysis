package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002220cBg implements InterfaceC1037120d5y {
    public static final C1002220cBg LIZ = new C1002220cBg();
    public static Boolean LIZIZ;

    @Override // X.InterfaceC1037120d5y
    public final String getTag() {
        return "sparkWarmupTask";
    }

    @Override // X.InterfaceC1037120d5y
    public final C0CFU getType() {
        return C0CFU.COMMON;
    }

    @Override // X.InterfaceC1037120d5y
    public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
        Boolean bool = LIZIZ;
        if (bool == null) {
            return EnumC1002230cBh.READY;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            return EnumC1002230cBh.PENDING;
        }
        return EnumC1002230cBh.DONE;
    }

    @Override // X.InterfaceC1037120d5y
    public final String LIZIZ(C1037110d5x c1037110d5x) {
        LIZIZ = Boolean.FALSE;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1002210cBf(null), 3);
        return "sparkWarmupTask";
    }
}

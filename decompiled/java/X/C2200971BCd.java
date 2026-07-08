package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200971BCd extends C09AY implements Function0<EnumC1016770cZ9> {
    public C2200971BCd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final EnumC1016770cZ9 invoke() {
        InterfaceC2201071BCn interfaceC2201071BCn = C798170VSt.LIZ;
        return interfaceC2201071BCn != null ? interfaceC2201071BCn.getDeviceType() : (C798170VSt.LIZ() >= 2 || C798170VSt.LIZIZ() >= 2147483648L) ? (C798170VSt.LIZ() >= 4 || C798170VSt.LIZIZ() >= 4294967296L) ? (C798170VSt.LIZ() >= 6 || C798170VSt.LIZIZ() >= 6442450944L) ? (C798170VSt.LIZ() >= 8 || C798170VSt.LIZIZ() >= 8589934592L) ? EnumC1016770cZ9.HIGH_END : EnumC1016770cZ9.MIDDLE_END : EnumC1016770cZ9.LOW_END : EnumC1016770cZ9.ULTRA_LOW_END : EnumC1016770cZ9.EXTREMELY_LOW_END;
    }
}

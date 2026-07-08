package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Opz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC631610Opz {
    public static final EnumC631610Opz DISABLE_PINNED;
    public static final EnumC631610Opz ENABLE_PINNED;
    public static final /* synthetic */ EnumC631610Opz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC631610Opz PINNED;

    public static InterfaceC2044707zh<EnumC631610Opz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC631610Opz enumC631610Opz = new EnumC631610Opz("PINNED", 0);
        PINNED = enumC631610Opz;
        EnumC631610Opz enumC631610Opz2 = new EnumC631610Opz("ENABLE_PINNED", 1);
        ENABLE_PINNED = enumC631610Opz2;
        EnumC631610Opz enumC631610Opz3 = new EnumC631610Opz("DISABLE_PINNED", 2);
        DISABLE_PINNED = enumC631610Opz3;
        EnumC631610Opz[] enumC631610OpzArr = {enumC631610Opz, enumC631610Opz2, enumC631610Opz3};
        LL = enumC631610OpzArr;
        LLILLJJLI = new C2254308sP(enumC631610OpzArr);
    }

    public static EnumC631610Opz[] values() {
        return (EnumC631610Opz[]) LL.clone();
    }

    public static EnumC631610Opz valueOf(String str) {
        return (EnumC631610Opz) C08FF.LIZ(EnumC631610Opz.class, str);
    }

    public EnumC631610Opz(String str, int i) {
    }
}

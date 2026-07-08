package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1220390hrZ {
    public static final EnumC1220390hrZ BOTTOM;
    public static final /* synthetic */ EnumC1220390hrZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1220390hrZ MIDDLE;
    public static final EnumC1220390hrZ TOP;

    public static InterfaceC2044707zh<EnumC1220390hrZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1220390hrZ enumC1220390hrZ = new EnumC1220390hrZ("TOP", 0);
        TOP = enumC1220390hrZ;
        EnumC1220390hrZ enumC1220390hrZ2 = new EnumC1220390hrZ("MIDDLE", 1);
        MIDDLE = enumC1220390hrZ2;
        EnumC1220390hrZ enumC1220390hrZ3 = new EnumC1220390hrZ("BOTTOM", 2);
        BOTTOM = enumC1220390hrZ3;
        EnumC1220390hrZ[] enumC1220390hrZArr = {enumC1220390hrZ, enumC1220390hrZ2, enumC1220390hrZ3};
        LL = enumC1220390hrZArr;
        LLILLJJLI = new C2254308sP(enumC1220390hrZArr);
    }

    public static EnumC1220390hrZ[] values() {
        return (EnumC1220390hrZ[]) LL.clone();
    }

    public static EnumC1220390hrZ valueOf(String str) {
        return (EnumC1220390hrZ) C08FF.LIZ(EnumC1220390hrZ.class, str);
    }

    public EnumC1220390hrZ(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995060c08 {
    public static final /* synthetic */ EnumC995060c08[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995060c08 RED;
    public static final EnumC995060c08 WHITE;

    public static InterfaceC2044707zh<EnumC995060c08> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995060c08 enumC995060c08 = new EnumC995060c08("RED", 0);
        RED = enumC995060c08;
        EnumC995060c08 enumC995060c082 = new EnumC995060c08("WHITE", 1);
        WHITE = enumC995060c082;
        EnumC995060c08[] enumC995060c08Arr = {enumC995060c08, enumC995060c082};
        LL = enumC995060c08Arr;
        LLILLJJLI = new C2254308sP(enumC995060c08Arr);
    }

    public static EnumC995060c08[] values() {
        return (EnumC995060c08[]) LL.clone();
    }

    public static EnumC995060c08 valueOf(String str) {
        return (EnumC995060c08) C08FF.LIZ(EnumC995060c08.class, str);
    }

    public EnumC995060c08(String str, int i) {
    }
}

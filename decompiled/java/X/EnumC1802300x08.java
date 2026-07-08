package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x08, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1802300x08 {
    public static final /* synthetic */ EnumC1802300x08[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1802300x08 NONE;
    public static final EnumC1802300x08 V2;
    public static final EnumC1802300x08 V3;

    public static InterfaceC2044707zh<EnumC1802300x08> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1802300x08 enumC1802300x08 = new EnumC1802300x08("NONE", 0);
        NONE = enumC1802300x08;
        EnumC1802300x08 enumC1802300x082 = new EnumC1802300x08("V2", 1);
        V2 = enumC1802300x082;
        EnumC1802300x08 enumC1802300x083 = new EnumC1802300x08("V3", 2);
        V3 = enumC1802300x083;
        EnumC1802300x08[] enumC1802300x08Arr = {enumC1802300x08, enumC1802300x082, enumC1802300x083};
        LL = enumC1802300x08Arr;
        LLILLJJLI = new C2254308sP(enumC1802300x08Arr);
    }

    public static EnumC1802300x08[] values() {
        return (EnumC1802300x08[]) LL.clone();
    }

    public static EnumC1802300x08 valueOf(String str) {
        return (EnumC1802300x08) C08FF.LIZ(EnumC1802300x08.class, str);
    }

    public EnumC1802300x08(String str, int i) {
    }
}

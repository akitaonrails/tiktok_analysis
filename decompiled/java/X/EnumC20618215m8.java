package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15m8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20618215m8 {
    public static final EnumC20618215m8 GROUP_CHAT;
    public static final /* synthetic */ EnumC20618215m8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20618215m8 USER;

    public static InterfaceC2044707zh<EnumC20618215m8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20618215m8 enumC20618215m8 = new EnumC20618215m8("USER", 0);
        USER = enumC20618215m8;
        EnumC20618215m8 enumC20618215m82 = new EnumC20618215m8("GROUP_CHAT", 1);
        GROUP_CHAT = enumC20618215m82;
        EnumC20618215m8[] enumC20618215m8Arr = {enumC20618215m8, enumC20618215m82};
        LL = enumC20618215m8Arr;
        LLILLJJLI = new C2254308sP(enumC20618215m8Arr);
    }

    public static EnumC20618215m8[] values() {
        return (EnumC20618215m8[]) LL.clone();
    }

    public static EnumC20618215m8 valueOf(String str) {
        return (EnumC20618215m8) C08FF.LIZ(EnumC20618215m8.class, str);
    }

    public EnumC20618215m8(String str, int i) {
    }
}

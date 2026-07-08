package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05e8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1401405e8 {
    public static final EnumC1401405e8 ALREADY_REFRESHED;
    public static final /* synthetic */ EnumC1401405e8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1401405e8 NEED_REFRESH;

    public static InterfaceC2044707zh<EnumC1401405e8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1401405e8 enumC1401405e8 = new EnumC1401405e8("NEED_REFRESH", 0);
        NEED_REFRESH = enumC1401405e8;
        EnumC1401405e8 enumC1401405e82 = new EnumC1401405e8("ALREADY_REFRESHED", 1);
        ALREADY_REFRESHED = enumC1401405e82;
        EnumC1401405e8[] enumC1401405e8Arr = {enumC1401405e8, enumC1401405e82};
        LL = enumC1401405e8Arr;
        LLILLJJLI = new C2254308sP(enumC1401405e8Arr);
    }

    public static EnumC1401405e8[] values() {
        return (EnumC1401405e8[]) LL.clone();
    }

    public static EnumC1401405e8 valueOf(String str) {
        return (EnumC1401405e8) C08FF.LIZ(EnumC1401405e8.class, str);
    }

    public EnumC1401405e8(String str, int i) {
    }
}

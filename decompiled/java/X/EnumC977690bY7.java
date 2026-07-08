package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bY7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC977690bY7 {
    public static final EnumC977690bY7 CANCELING;
    public static final EnumC977690bY7 INVITED;
    public static final EnumC977690bY7 INVITING;
    public static final /* synthetic */ EnumC977690bY7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC977690bY7 NONE;

    public static InterfaceC2044707zh<EnumC977690bY7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC977690bY7 enumC977690bY7 = new EnumC977690bY7("NONE", 0);
        NONE = enumC977690bY7;
        EnumC977690bY7 enumC977690bY72 = new EnumC977690bY7("INVITING", 1);
        INVITING = enumC977690bY72;
        EnumC977690bY7 enumC977690bY73 = new EnumC977690bY7("INVITED", 2);
        INVITED = enumC977690bY73;
        EnumC977690bY7 enumC977690bY74 = new EnumC977690bY7("CANCELING", 3);
        CANCELING = enumC977690bY74;
        EnumC977690bY7[] enumC977690bY7Arr = {enumC977690bY7, enumC977690bY72, enumC977690bY73, enumC977690bY74};
        LL = enumC977690bY7Arr;
        LLILLJJLI = new C2254308sP(enumC977690bY7Arr);
    }

    public static EnumC977690bY7[] values() {
        return (EnumC977690bY7[]) LL.clone();
    }

    public static EnumC977690bY7 valueOf(String str) {
        return (EnumC977690bY7) C08FF.LIZ(EnumC977690bY7.class, str);
    }

    public EnumC977690bY7(String str, int i) {
    }
}

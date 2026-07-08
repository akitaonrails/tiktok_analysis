package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09o7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2482509o7 {
    public static final /* synthetic */ EnumC2482509o7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2482509o7 NORMAL;
    public static final EnumC2482509o7 SMALL;

    public static InterfaceC2044707zh<EnumC2482509o7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2482509o7 enumC2482509o7 = new EnumC2482509o7("NORMAL", 0);
        NORMAL = enumC2482509o7;
        EnumC2482509o7 enumC2482509o72 = new EnumC2482509o7("SMALL", 1);
        SMALL = enumC2482509o72;
        EnumC2482509o7[] enumC2482509o7Arr = {enumC2482509o7, enumC2482509o72};
        LL = enumC2482509o7Arr;
        LLILLJJLI = new C2254308sP(enumC2482509o7Arr);
    }

    public static EnumC2482509o7[] values() {
        return (EnumC2482509o7[]) LL.clone();
    }

    public static EnumC2482509o7 valueOf(String str) {
        return (EnumC2482509o7) C08FF.LIZ(EnumC2482509o7.class, str);
    }

    public EnumC2482509o7(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0em8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1101700em8 {
    public static final EnumC1101700em8 Add;
    public static final /* synthetic */ EnumC1101700em8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1101700em8 Remove;

    public static InterfaceC2044707zh<EnumC1101700em8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1101700em8 enumC1101700em8 = new EnumC1101700em8("Add", 0);
        Add = enumC1101700em8;
        EnumC1101700em8 enumC1101700em82 = new EnumC1101700em8("Remove", 1);
        Remove = enumC1101700em82;
        EnumC1101700em8[] enumC1101700em8Arr = {enumC1101700em8, enumC1101700em82};
        LL = enumC1101700em8Arr;
        LLILLJJLI = new C2254308sP(enumC1101700em8Arr);
    }

    public static EnumC1101700em8[] values() {
        return (EnumC1101700em8[]) LL.clone();
    }

    public static EnumC1101700em8 valueOf(String str) {
        return (EnumC1101700em8) C08FF.LIZ(EnumC1101700em8.class, str);
    }

    public EnumC1101700em8(String str, int i) {
    }
}

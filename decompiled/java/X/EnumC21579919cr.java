package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21579919cr {
    public static final EnumC21579919cr Center;
    public static final /* synthetic */ EnumC21579919cr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21579919cr Left;
    public static final EnumC21579919cr Null;
    public static final EnumC21579919cr Right;
    public static final EnumC21579919cr Sort;

    public static InterfaceC2044707zh<EnumC21579919cr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21579919cr enumC21579919cr = new EnumC21579919cr("Sort", 0);
        Sort = enumC21579919cr;
        EnumC21579919cr enumC21579919cr2 = new EnumC21579919cr("Left", 1);
        Left = enumC21579919cr2;
        EnumC21579919cr enumC21579919cr3 = new EnumC21579919cr("Right", 2);
        Right = enumC21579919cr3;
        EnumC21579919cr enumC21579919cr4 = new EnumC21579919cr("Center", 3);
        Center = enumC21579919cr4;
        EnumC21579919cr enumC21579919cr5 = new EnumC21579919cr("Null", 4);
        Null = enumC21579919cr5;
        EnumC21579919cr[] enumC21579919crArr = {enumC21579919cr, enumC21579919cr2, enumC21579919cr3, enumC21579919cr4, enumC21579919cr5};
        LL = enumC21579919crArr;
        LLILLJJLI = new C2254308sP(enumC21579919crArr);
    }

    public static EnumC21579919cr[] values() {
        return (EnumC21579919cr[]) LL.clone();
    }

    public static EnumC21579919cr valueOf(String str) {
        return (EnumC21579919cr) C08FF.LIZ(EnumC21579919cr.class, str);
    }

    public EnumC21579919cr(String str, int i) {
    }
}

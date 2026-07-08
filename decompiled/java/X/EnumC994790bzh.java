package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994790bzh {
    public static final EnumC994790bzh DEGRADE;
    public static final EnumC994790bzh HIDE;
    public static final /* synthetic */ EnumC994790bzh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994790bzh NONE;

    public static InterfaceC2044707zh<EnumC994790bzh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994790bzh enumC994790bzh = new EnumC994790bzh("HIDE", 0);
        HIDE = enumC994790bzh;
        EnumC994790bzh enumC994790bzh2 = new EnumC994790bzh("DEGRADE", 1);
        DEGRADE = enumC994790bzh2;
        EnumC994790bzh enumC994790bzh3 = new EnumC994790bzh("NONE", 2);
        NONE = enumC994790bzh3;
        EnumC994790bzh[] enumC994790bzhArr = {enumC994790bzh, enumC994790bzh2, enumC994790bzh3};
        LL = enumC994790bzhArr;
        LLILLJJLI = new C2254308sP(enumC994790bzhArr);
    }

    public static EnumC994790bzh[] values() {
        return (EnumC994790bzh[]) LL.clone();
    }

    public static EnumC994790bzh valueOf(String str) {
        return (EnumC994790bzh) C08FF.LIZ(EnumC994790bzh.class, str);
    }

    public EnumC994790bzh(String str, int i) {
    }
}

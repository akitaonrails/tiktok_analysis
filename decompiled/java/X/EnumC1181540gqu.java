package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1181540gqu {
    public static final EnumC1181540gqu COMMON;
    public static final EnumC1181540gqu CUSTOM;
    public static final /* synthetic */ EnumC1181540gqu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1181540gqu NONE;
    public static final EnumC1181540gqu UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC1181540gqu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1181540gqu enumC1181540gqu = new EnumC1181540gqu("NONE", 0);
        NONE = enumC1181540gqu;
        EnumC1181540gqu enumC1181540gqu2 = new EnumC1181540gqu("CUSTOM", 1);
        CUSTOM = enumC1181540gqu2;
        EnumC1181540gqu enumC1181540gqu3 = new EnumC1181540gqu("UNAVAILABLE", 2);
        UNAVAILABLE = enumC1181540gqu3;
        EnumC1181540gqu enumC1181540gqu4 = new EnumC1181540gqu("COMMON", 3);
        COMMON = enumC1181540gqu4;
        EnumC1181540gqu[] enumC1181540gquArr = {enumC1181540gqu, enumC1181540gqu2, enumC1181540gqu3, enumC1181540gqu4};
        LL = enumC1181540gquArr;
        LLILLJJLI = new C2254308sP(enumC1181540gquArr);
    }

    public static EnumC1181540gqu[] values() {
        return (EnumC1181540gqu[]) LL.clone();
    }

    public static EnumC1181540gqu valueOf(String str) {
        return (EnumC1181540gqu) C08FF.LIZ(EnumC1181540gqu.class, str);
    }

    public EnumC1181540gqu(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1284970jXj {
    public static final EnumC1284970jXj EXTERNAL;
    public static final EnumC1284970jXj INTERNAL;
    public static final /* synthetic */ EnumC1284970jXj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1284970jXj NA;

    public static InterfaceC2044707zh<EnumC1284970jXj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1284970jXj enumC1284970jXj = new EnumC1284970jXj("INTERNAL", 0);
        INTERNAL = enumC1284970jXj;
        EnumC1284970jXj enumC1284970jXj2 = new EnumC1284970jXj("EXTERNAL", 1);
        EXTERNAL = enumC1284970jXj2;
        EnumC1284970jXj enumC1284970jXj3 = new EnumC1284970jXj("NA", 2);
        NA = enumC1284970jXj3;
        EnumC1284970jXj[] enumC1284970jXjArr = {enumC1284970jXj, enumC1284970jXj2, enumC1284970jXj3};
        LL = enumC1284970jXjArr;
        LLILLJJLI = new C2254308sP(enumC1284970jXjArr);
    }

    public static EnumC1284970jXj[] values() {
        return (EnumC1284970jXj[]) LL.clone();
    }

    public static EnumC1284970jXj valueOf(String str) {
        return (EnumC1284970jXj) C08FF.LIZ(EnumC1284970jXj.class, str);
    }

    public EnumC1284970jXj(String str, int i) {
    }
}

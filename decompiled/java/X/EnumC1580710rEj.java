package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1580710rEj {
    public static final EnumC1580710rEj ADD;
    public static final EnumC1580710rEj ADD_ALL;
    public static final EnumC1580710rEj DELETE;
    public static final /* synthetic */ EnumC1580710rEj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1580710rEj REFRESH;
    public static final EnumC1580710rEj REPLACE;

    public static InterfaceC2044707zh<EnumC1580710rEj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1580710rEj enumC1580710rEj = new EnumC1580710rEj("REFRESH", 0);
        REFRESH = enumC1580710rEj;
        EnumC1580710rEj enumC1580710rEj2 = new EnumC1580710rEj("ADD", 1);
        ADD = enumC1580710rEj2;
        EnumC1580710rEj enumC1580710rEj3 = new EnumC1580710rEj("ADD_ALL", 2);
        ADD_ALL = enumC1580710rEj3;
        EnumC1580710rEj enumC1580710rEj4 = new EnumC1580710rEj("REPLACE", 3);
        REPLACE = enumC1580710rEj4;
        EnumC1580710rEj enumC1580710rEj5 = new EnumC1580710rEj("DELETE", 4);
        DELETE = enumC1580710rEj5;
        EnumC1580710rEj[] enumC1580710rEjArr = {enumC1580710rEj, enumC1580710rEj2, enumC1580710rEj3, enumC1580710rEj4, enumC1580710rEj5};
        LL = enumC1580710rEjArr;
        LLILLJJLI = new C2254308sP(enumC1580710rEjArr);
    }

    public static EnumC1580710rEj[] values() {
        return (EnumC1580710rEj[]) LL.clone();
    }

    public static EnumC1580710rEj valueOf(String str) {
        return (EnumC1580710rEj) C08FF.LIZ(EnumC1580710rEj.class, str);
    }

    public EnumC1580710rEj(String str, int i) {
    }
}

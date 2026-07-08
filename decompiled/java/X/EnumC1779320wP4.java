package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wP4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779320wP4 {
    public static final EnumC1779320wP4 CREATE_GROUP;
    public static final /* synthetic */ EnumC1779320wP4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779320wP4 NEXT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1779320wP4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779320wP4 enumC1779320wP4 = new EnumC1779320wP4("NEXT", 0, "next");
        NEXT = enumC1779320wP4;
        EnumC1779320wP4 enumC1779320wP42 = new EnumC1779320wP4("CREATE_GROUP", 1, "create_group");
        CREATE_GROUP = enumC1779320wP42;
        EnumC1779320wP4[] enumC1779320wP4Arr = {enumC1779320wP4, enumC1779320wP42};
        LLILLJJLI = enumC1779320wP4Arr;
        LLILLL = new C2254308sP(enumC1779320wP4Arr);
    }

    public static EnumC1779320wP4[] values() {
        return (EnumC1779320wP4[]) LLILLJJLI.clone();
    }

    public final String getEvent() {
        return this.LL;
    }

    public static EnumC1779320wP4 valueOf(String str) {
        return (EnumC1779320wP4) C08FF.LIZ(EnumC1779320wP4.class, str);
    }

    public EnumC1779320wP4(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1674690tgJ {
    public static final EnumC1674690tgJ CREATE;
    public static final EnumC1674690tgJ DELETE;
    public static final /* synthetic */ EnumC1674690tgJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1674690tgJ UPDATE;

    public static InterfaceC2044707zh<EnumC1674690tgJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1674690tgJ enumC1674690tgJ = new EnumC1674690tgJ("CREATE", 0);
        CREATE = enumC1674690tgJ;
        EnumC1674690tgJ enumC1674690tgJ2 = new EnumC1674690tgJ("UPDATE", 1);
        UPDATE = enumC1674690tgJ2;
        EnumC1674690tgJ enumC1674690tgJ3 = new EnumC1674690tgJ("DELETE", 2);
        DELETE = enumC1674690tgJ3;
        EnumC1674690tgJ[] enumC1674690tgJArr = {enumC1674690tgJ, enumC1674690tgJ2, enumC1674690tgJ3};
        LL = enumC1674690tgJArr;
        LLILLJJLI = new C2254308sP(enumC1674690tgJArr);
    }

    public static EnumC1674690tgJ[] values() {
        return (EnumC1674690tgJ[]) LL.clone();
    }

    public static EnumC1674690tgJ valueOf(String str) {
        return (EnumC1674690tgJ) C08FF.LIZ(EnumC1674690tgJ.class, str);
    }

    public EnumC1674690tgJ(String str, int i) {
    }
}

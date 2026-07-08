package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994350byz {
    public static final /* synthetic */ EnumC994350byz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994350byz TIME;
    public static final EnumC994350byz VALUE;

    public static InterfaceC2044707zh<EnumC994350byz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994350byz enumC994350byz = new EnumC994350byz("TIME", 0);
        TIME = enumC994350byz;
        EnumC994350byz enumC994350byz2 = new EnumC994350byz("VALUE", 1);
        VALUE = enumC994350byz2;
        EnumC994350byz[] enumC994350byzArr = {enumC994350byz, enumC994350byz2};
        LL = enumC994350byzArr;
        LLILLJJLI = new C2254308sP(enumC994350byzArr);
    }

    public static EnumC994350byz[] values() {
        return (EnumC994350byz[]) LL.clone();
    }

    public static EnumC994350byz valueOf(String str) {
        return (EnumC994350byz) C08FF.LIZ(EnumC994350byz.class, str);
    }

    public EnumC994350byz(String str, int i) {
    }
}

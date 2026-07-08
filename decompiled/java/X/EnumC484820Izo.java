package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Izo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC484820Izo {
    public static final /* synthetic */ EnumC484820Izo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC484820Izo NORMAL;
    public static final EnumC484820Izo SMALLER;
    public static final EnumC484820Izo SMALLEST;

    public static InterfaceC2044707zh<EnumC484820Izo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC484820Izo enumC484820Izo = new EnumC484820Izo("NORMAL", 0);
        NORMAL = enumC484820Izo;
        EnumC484820Izo enumC484820Izo2 = new EnumC484820Izo("SMALLER", 1);
        SMALLER = enumC484820Izo2;
        EnumC484820Izo enumC484820Izo3 = new EnumC484820Izo("SMALLEST", 2);
        SMALLEST = enumC484820Izo3;
        EnumC484820Izo[] enumC484820IzoArr = {enumC484820Izo, enumC484820Izo2, enumC484820Izo3};
        LL = enumC484820IzoArr;
        LLILLJJLI = new C2254308sP(enumC484820IzoArr);
    }

    public static EnumC484820Izo[] values() {
        return (EnumC484820Izo[]) LL.clone();
    }

    public static EnumC484820Izo valueOf(String str) {
        return (EnumC484820Izo) C08FF.LIZ(EnumC484820Izo.class, str);
    }

    public EnumC484820Izo(String str, int i) {
    }
}

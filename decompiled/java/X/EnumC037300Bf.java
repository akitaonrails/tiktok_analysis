package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037300Bf {
    public static final EnumC037300Bf FROM_ALREADY_FINISH;
    public static final EnumC037300Bf FROM_CONTINUE_LOAD;
    public static final /* synthetic */ EnumC037300Bf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC037300Bf NOT_INIT;

    public static InterfaceC2044707zh<EnumC037300Bf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC037300Bf enumC037300Bf = new EnumC037300Bf("NOT_INIT", 0);
        NOT_INIT = enumC037300Bf;
        EnumC037300Bf enumC037300Bf2 = new EnumC037300Bf("FROM_CONTINUE_LOAD", 1);
        FROM_CONTINUE_LOAD = enumC037300Bf2;
        EnumC037300Bf enumC037300Bf3 = new EnumC037300Bf("FROM_ALREADY_FINISH", 2);
        FROM_ALREADY_FINISH = enumC037300Bf3;
        EnumC037300Bf[] enumC037300BfArr = {enumC037300Bf, enumC037300Bf2, enumC037300Bf3};
        LL = enumC037300BfArr;
        LLILLJJLI = new C2254308sP(enumC037300BfArr);
    }

    public static EnumC037300Bf[] values() {
        return (EnumC037300Bf[]) LL.clone();
    }

    public static EnumC037300Bf valueOf(String str) {
        return (EnumC037300Bf) C08FF.LIZ(EnumC037300Bf.class, str);
    }

    public EnumC037300Bf(String str, int i) {
    }
}

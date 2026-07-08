package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778640wNy {
    public static final EnumC1778640wNy COMPLETED;
    public static final /* synthetic */ EnumC1778640wNy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778640wNy NOT_SHOWN;
    public static final EnumC1778640wNy SHOWN;

    public static InterfaceC2044707zh<EnumC1778640wNy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778640wNy enumC1778640wNy = new EnumC1778640wNy("NOT_SHOWN", 0);
        NOT_SHOWN = enumC1778640wNy;
        EnumC1778640wNy enumC1778640wNy2 = new EnumC1778640wNy("SHOWN", 1);
        SHOWN = enumC1778640wNy2;
        EnumC1778640wNy enumC1778640wNy3 = new EnumC1778640wNy("COMPLETED", 2);
        COMPLETED = enumC1778640wNy3;
        EnumC1778640wNy[] enumC1778640wNyArr = {enumC1778640wNy, enumC1778640wNy2, enumC1778640wNy3};
        LL = enumC1778640wNyArr;
        LLILLJJLI = new C2254308sP(enumC1778640wNyArr);
    }

    public static EnumC1778640wNy[] values() {
        return (EnumC1778640wNy[]) LL.clone();
    }

    public static EnumC1778640wNy valueOf(String str) {
        return (EnumC1778640wNy) C08FF.LIZ(EnumC1778640wNy.class, str);
    }

    public EnumC1778640wNy(String str, int i) {
    }
}

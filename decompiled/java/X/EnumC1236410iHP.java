package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1236410iHP {
    public static final EnumC1236410iHP CLOSE;
    public static final EnumC1236410iHP FAILED;
    public static final /* synthetic */ EnumC1236410iHP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1236410iHP LOADING;
    public static final EnumC1236410iHP SUCCESS;

    public static InterfaceC2044707zh<EnumC1236410iHP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1236410iHP enumC1236410iHP = new EnumC1236410iHP("LOADING", 0);
        LOADING = enumC1236410iHP;
        EnumC1236410iHP enumC1236410iHP2 = new EnumC1236410iHP("SUCCESS", 1);
        SUCCESS = enumC1236410iHP2;
        EnumC1236410iHP enumC1236410iHP3 = new EnumC1236410iHP("FAILED", 2);
        FAILED = enumC1236410iHP3;
        EnumC1236410iHP enumC1236410iHP4 = new EnumC1236410iHP("CLOSE", 3);
        CLOSE = enumC1236410iHP4;
        EnumC1236410iHP[] enumC1236410iHPArr = {enumC1236410iHP, enumC1236410iHP2, enumC1236410iHP3, enumC1236410iHP4};
        LL = enumC1236410iHPArr;
        LLILLJJLI = new C2254308sP(enumC1236410iHPArr);
    }

    public static EnumC1236410iHP[] values() {
        return (EnumC1236410iHP[]) LL.clone();
    }

    public static EnumC1236410iHP valueOf(String str) {
        return (EnumC1236410iHP) C08FF.LIZ(EnumC1236410iHP.class, str);
    }

    public EnumC1236410iHP(String str, int i) {
    }
}

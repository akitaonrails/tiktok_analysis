package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC045500Ej {
    public static final /* synthetic */ EnumC045500Ej[] LL;

    static {
        EnumC045500Ej[] enumC045500EjArr = {new EnumC045500Ej("UNLOGGED_IN", 0, 0), new EnumC045500Ej("KIDS_MODE", 1, 1), new EnumC045500Ej("NORMAL_MODE", 2, 2)};
        LL = enumC045500EjArr;
        new C2254308sP(enumC045500EjArr);
    }

    public static EnumC045500Ej[] values() {
        return (EnumC045500Ej[]) LL.clone();
    }

    public static EnumC045500Ej valueOf(String str) {
        return (EnumC045500Ej) C08FF.LIZ(EnumC045500Ej.class, str);
    }

    public EnumC045500Ej(String str, int i, int i2) {
    }
}

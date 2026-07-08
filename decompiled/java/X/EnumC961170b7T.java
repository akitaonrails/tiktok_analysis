package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961170b7T {
    public static final EnumC961170b7T CONTROL_GROUP;
    public static final /* synthetic */ EnumC961170b7T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC961170b7T TEST_GROUP_ONE;
    public static final EnumC961170b7T TEST_GROUP_TWO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC961170b7T> getEntries() {
        return LLILLL;
    }

    static {
        EnumC961170b7T enumC961170b7T = new EnumC961170b7T("CONTROL_GROUP", 0, 0);
        CONTROL_GROUP = enumC961170b7T;
        EnumC961170b7T enumC961170b7T2 = new EnumC961170b7T("TEST_GROUP_ONE", 1, 1);
        TEST_GROUP_ONE = enumC961170b7T2;
        EnumC961170b7T enumC961170b7T3 = new EnumC961170b7T("TEST_GROUP_TWO", 2, 2);
        TEST_GROUP_TWO = enumC961170b7T3;
        EnumC961170b7T[] enumC961170b7TArr = {enumC961170b7T, enumC961170b7T2, enumC961170b7T3};
        LLILLJJLI = enumC961170b7TArr;
        LLILLL = new C2254308sP(enumC961170b7TArr);
    }

    public static EnumC961170b7T[] values() {
        return (EnumC961170b7T[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC961170b7T valueOf(String str) {
        return (EnumC961170b7T) C08FF.LIZ(EnumC961170b7T.class, str);
    }

    public EnumC961170b7T(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083670eJ3 {
    public static final /* synthetic */ EnumC1083670eJ3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083670eJ3 ROUND_1;
    public static final EnumC1083670eJ3 ROUND_2;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1083670eJ3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083670eJ3 enumC1083670eJ3 = new EnumC1083670eJ3("ROUND_1", 0, 1L);
        ROUND_1 = enumC1083670eJ3;
        EnumC1083670eJ3 enumC1083670eJ32 = new EnumC1083670eJ3("ROUND_2", 1, 2L);
        ROUND_2 = enumC1083670eJ32;
        EnumC1083670eJ3[] enumC1083670eJ3Arr = {enumC1083670eJ3, enumC1083670eJ32};
        LLILLJJLI = enumC1083670eJ3Arr;
        LLILLL = new C2254308sP(enumC1083670eJ3Arr);
    }

    public static EnumC1083670eJ3[] values() {
        return (EnumC1083670eJ3[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1083670eJ3 valueOf(String str) {
        return (EnumC1083670eJ3) C08FF.LIZ(EnumC1083670eJ3.class, str);
    }

    public EnumC1083670eJ3(String str, int i, long j) {
        this.LL = j;
    }
}

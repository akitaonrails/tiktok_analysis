package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00tA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC220600tA {
    public static final EnumC220600tA CACHE;
    public static final EnumC220600tA FILE_API;
    public static final /* synthetic */ EnumC220600tA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC220600tA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC220600tA enumC220600tA = new EnumC220600tA("CACHE", 0, 1);
        CACHE = enumC220600tA;
        EnumC220600tA enumC220600tA2 = new EnumC220600tA("FILE_API", 1, 2);
        FILE_API = enumC220600tA2;
        EnumC220600tA[] enumC220600tAArr = {enumC220600tA, enumC220600tA2};
        LLILLJJLI = enumC220600tAArr;
        LLILLL = new C2254308sP(enumC220600tAArr);
    }

    public static EnumC220600tA[] values() {
        return (EnumC220600tA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC220600tA valueOf(String str) {
        return (EnumC220600tA) C08FF.LIZ(EnumC220600tA.class, str);
    }

    public EnumC220600tA(String str, int i, int i2) {
        this.LL = i2;
    }
}

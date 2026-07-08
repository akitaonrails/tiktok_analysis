package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551560LkA {
    public static final EnumC551560LkA DONE;
    public static final EnumC551560LkA INIT;
    public static final /* synthetic */ EnumC551560LkA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC551560LkA RETRY;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC551560LkA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC551560LkA enumC551560LkA = new EnumC551560LkA("INIT", 0, 0);
        INIT = enumC551560LkA;
        EnumC551560LkA enumC551560LkA2 = new EnumC551560LkA("DONE", 1, 1);
        DONE = enumC551560LkA2;
        EnumC551560LkA enumC551560LkA3 = new EnumC551560LkA("RETRY", 2, 2);
        RETRY = enumC551560LkA3;
        EnumC551560LkA[] enumC551560LkAArr = {enumC551560LkA, enumC551560LkA2, enumC551560LkA3};
        LLILLJJLI = enumC551560LkAArr;
        LLILLL = new C2254308sP(enumC551560LkAArr);
    }

    public static EnumC551560LkA[] values() {
        return (EnumC551560LkA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC551560LkA valueOf(String str) {
        return (EnumC551560LkA) C08FF.LIZ(EnumC551560LkA.class, str);
    }

    public EnumC551560LkA(String str, int i, int i2) {
        this.LL = i2;
    }
}

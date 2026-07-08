package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551570LkB {
    public static final EnumC551570LkB FINISHED;
    public static final EnumC551570LkB INIT;
    public static final /* synthetic */ EnumC551570LkB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC551570LkB RETRY;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC551570LkB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC551570LkB enumC551570LkB = new EnumC551570LkB("INIT", 0, 0);
        INIT = enumC551570LkB;
        EnumC551570LkB enumC551570LkB2 = new EnumC551570LkB("FINISHED", 1, 1);
        FINISHED = enumC551570LkB2;
        EnumC551570LkB enumC551570LkB3 = new EnumC551570LkB("RETRY", 2, 2);
        RETRY = enumC551570LkB3;
        EnumC551570LkB[] enumC551570LkBArr = {enumC551570LkB, enumC551570LkB2, enumC551570LkB3};
        LLILLJJLI = enumC551570LkBArr;
        LLILLL = new C2254308sP(enumC551570LkBArr);
    }

    public static EnumC551570LkB[] values() {
        return (EnumC551570LkB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC551570LkB valueOf(String str) {
        return (EnumC551570LkB) C08FF.LIZ(EnumC551570LkB.class, str);
    }

    public EnumC551570LkB(String str, int i, int i2) {
        this.LL = i2;
    }
}

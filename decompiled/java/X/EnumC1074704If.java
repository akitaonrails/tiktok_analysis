package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04If, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1074704If {
    public static final /* synthetic */ EnumC1074704If[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1074704If NEGATIVE;
    public static final EnumC1074704If NEUTRAL;
    public static final EnumC1074704If POSITIVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1074704If> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1074704If enumC1074704If = new EnumC1074704If("NEUTRAL", 0, 0);
        NEUTRAL = enumC1074704If;
        EnumC1074704If enumC1074704If2 = new EnumC1074704If("NEGATIVE", 1, 1);
        NEGATIVE = enumC1074704If2;
        EnumC1074704If enumC1074704If3 = new EnumC1074704If("POSITIVE", 2, 2);
        POSITIVE = enumC1074704If3;
        EnumC1074704If[] enumC1074704IfArr = {enumC1074704If, enumC1074704If2, enumC1074704If3};
        LLILLJJLI = enumC1074704IfArr;
        LLILLL = new C2254308sP(enumC1074704IfArr);
    }

    public static EnumC1074704If[] values() {
        return (EnumC1074704If[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1074704If valueOf(String str) {
        return (EnumC1074704If) C08FF.LIZ(EnumC1074704If.class, str);
    }

    public EnumC1074704If(String str, int i, int i2) {
        this.LL = i2;
    }
}

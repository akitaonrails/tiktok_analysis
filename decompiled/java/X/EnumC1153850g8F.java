package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153850g8F {
    public static final EnumC1153850g8F BOUND;
    public static final EnumC1153850g8F FAKE_BIND;
    public static final /* synthetic */ EnumC1153850g8F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153850g8F NEED_BIND;
    public static final EnumC1153850g8F NONE_BIND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153850g8F> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153850g8F enumC1153850g8F = new EnumC1153850g8F("BOUND", 0, 1);
        BOUND = enumC1153850g8F;
        EnumC1153850g8F enumC1153850g8F2 = new EnumC1153850g8F("NEED_BIND", 1, 0);
        NEED_BIND = enumC1153850g8F2;
        EnumC1153850g8F enumC1153850g8F3 = new EnumC1153850g8F("FAKE_BIND", 2, 2);
        FAKE_BIND = enumC1153850g8F3;
        EnumC1153850g8F enumC1153850g8F4 = new EnumC1153850g8F("NONE_BIND", 3, -1);
        NONE_BIND = enumC1153850g8F4;
        EnumC1153850g8F[] enumC1153850g8FArr = {enumC1153850g8F, enumC1153850g8F2, enumC1153850g8F3, enumC1153850g8F4};
        LLILLJJLI = enumC1153850g8FArr;
        LLILLL = new C2254308sP(enumC1153850g8FArr);
    }

    public static EnumC1153850g8F[] values() {
        return (EnumC1153850g8F[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153850g8F valueOf(String str) {
        return (EnumC1153850g8F) C08FF.LIZ(EnumC1153850g8F.class, str);
    }

    public EnumC1153850g8F(String str, int i, int i2) {
        this.LL = i2;
    }
}

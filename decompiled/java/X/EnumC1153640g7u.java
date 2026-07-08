package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153640g7u {
    public static final /* synthetic */ EnumC1153640g7u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153640g7u OL;
    public static final EnumC1153640g7u UL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153640g7u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153640g7u enumC1153640g7u = new EnumC1153640g7u("UL", 0, 1);
        UL = enumC1153640g7u;
        EnumC1153640g7u enumC1153640g7u2 = new EnumC1153640g7u("OL", 1, 2);
        OL = enumC1153640g7u2;
        EnumC1153640g7u[] enumC1153640g7uArr = {enumC1153640g7u, enumC1153640g7u2};
        LLILLJJLI = enumC1153640g7uArr;
        LLILLL = new C2254308sP(enumC1153640g7uArr);
    }

    public static EnumC1153640g7u[] values() {
        return (EnumC1153640g7u[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153640g7u valueOf(String str) {
        return (EnumC1153640g7u) C08FF.LIZ(EnumC1153640g7u.class, str);
    }

    public EnumC1153640g7u(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1984807q2 {
    public static final /* synthetic */ EnumC1984807q2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1984807q2 SELECTION;
    public static final EnumC1984807q2 TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1984807q2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1984807q2 enumC1984807q2 = new EnumC1984807q2("SELECTION", 0, 0);
        SELECTION = enumC1984807q2;
        EnumC1984807q2 enumC1984807q22 = new EnumC1984807q2("TEXT", 1, 1);
        TEXT = enumC1984807q22;
        EnumC1984807q2[] enumC1984807q2Arr = {enumC1984807q2, enumC1984807q22};
        LLILLJJLI = enumC1984807q2Arr;
        LLILLL = new C2254308sP(enumC1984807q2Arr);
    }

    public static EnumC1984807q2[] values() {
        return (EnumC1984807q2[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1984807q2 valueOf(String str) {
        return (EnumC1984807q2) C08FF.LIZ(EnumC1984807q2.class, str);
    }

    public EnumC1984807q2(String str, int i, int i2) {
        this.LL = i2;
    }
}

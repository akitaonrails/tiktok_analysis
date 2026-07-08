package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994107rX {
    public static final EnumC1994107rX ACTIVITY;
    public static final /* synthetic */ EnumC1994107rX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1994107rX NORMAL;
    public static final EnumC1994107rX UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1994107rX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994107rX enumC1994107rX = new EnumC1994107rX("UNKNOWN", 0, 0);
        UNKNOWN = enumC1994107rX;
        EnumC1994107rX enumC1994107rX2 = new EnumC1994107rX("NORMAL", 1, 1);
        NORMAL = enumC1994107rX2;
        EnumC1994107rX enumC1994107rX3 = new EnumC1994107rX("ACTIVITY", 2, 2);
        ACTIVITY = enumC1994107rX3;
        EnumC1994107rX[] enumC1994107rXArr = {enumC1994107rX, enumC1994107rX2, enumC1994107rX3};
        LLILLJJLI = enumC1994107rXArr;
        LLILLL = new C2254308sP(enumC1994107rXArr);
    }

    public static EnumC1994107rX[] values() {
        return (EnumC1994107rX[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1994107rX valueOf(String str) {
        return (EnumC1994107rX) C08FF.LIZ(EnumC1994107rX.class, str);
    }

    public EnumC1994107rX(String str, int i, int i2) {
        this.LL = i2;
    }
}

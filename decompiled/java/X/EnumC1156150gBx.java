package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1156150gBx {
    public static final EnumC1156150gBx BANNER;
    public static final /* synthetic */ EnumC1156150gBx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1156150gBx SMALL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1156150gBx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1156150gBx enumC1156150gBx = new EnumC1156150gBx("SMALL", 0, 1);
        SMALL = enumC1156150gBx;
        EnumC1156150gBx enumC1156150gBx2 = new EnumC1156150gBx("BANNER", 1, 2);
        BANNER = enumC1156150gBx2;
        EnumC1156150gBx[] enumC1156150gBxArr = {enumC1156150gBx, enumC1156150gBx2};
        LLILLJJLI = enumC1156150gBxArr;
        LLILLL = new C2254308sP(enumC1156150gBxArr);
    }

    public static EnumC1156150gBx[] values() {
        return (EnumC1156150gBx[]) LLILLJJLI.clone();
    }

    public final int getStyle() {
        return this.LL;
    }

    public static EnumC1156150gBx valueOf(String str) {
        return (EnumC1156150gBx) C08FF.LIZ(EnumC1156150gBx.class, str);
    }

    public EnumC1156150gBx(String str, int i, int i2) {
        this.LL = i2;
    }
}

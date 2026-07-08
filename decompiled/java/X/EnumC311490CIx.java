package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311490CIx {
    public static final EnumC311490CIx FALSE_MORE;
    public static final /* synthetic */ EnumC311490CIx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC311490CIx TRUE_MORE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC311490CIx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC311490CIx enumC311490CIx = new EnumC311490CIx("TRUE_MORE", 0, 1);
        TRUE_MORE = enumC311490CIx;
        EnumC311490CIx enumC311490CIx2 = new EnumC311490CIx("FALSE_MORE", 1, 0);
        FALSE_MORE = enumC311490CIx2;
        EnumC311490CIx[] enumC311490CIxArr = {enumC311490CIx, enumC311490CIx2};
        LLILLJJLI = enumC311490CIxArr;
        LLILLL = new C2254308sP(enumC311490CIxArr);
    }

    public static EnumC311490CIx[] values() {
        return (EnumC311490CIx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC311490CIx valueOf(String str) {
        return (EnumC311490CIx) C08FF.LIZ(EnumC311490CIx.class, str);
    }

    public EnumC311490CIx(String str, int i, int i2) {
        this.LL = i2;
    }
}

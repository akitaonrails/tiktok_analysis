package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC903810Zcx {
    public static final EnumC903810Zcx DISPLAY;
    public static final /* synthetic */ EnumC903810Zcx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC903810Zcx SENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC903810Zcx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC903810Zcx enumC903810Zcx = new EnumC903810Zcx("DISPLAY", 0, 1);
        DISPLAY = enumC903810Zcx;
        EnumC903810Zcx enumC903810Zcx2 = new EnumC903810Zcx("SENT", 1, 2);
        SENT = enumC903810Zcx2;
        EnumC903810Zcx[] enumC903810ZcxArr = {enumC903810Zcx, enumC903810Zcx2};
        LLILLJJLI = enumC903810ZcxArr;
        LLILLL = new C2254308sP(enumC903810ZcxArr);
    }

    public static EnumC903810Zcx[] values() {
        return (EnumC903810Zcx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC903810Zcx valueOf(String str) {
        return (EnumC903810Zcx) C08FF.LIZ(EnumC903810Zcx.class, str);
    }

    public EnumC903810Zcx(String str, int i, int i2) {
        this.LL = i2;
    }
}

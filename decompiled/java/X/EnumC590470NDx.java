package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590470NDx {
    public static final EnumC590470NDx EMPTY;
    public static final /* synthetic */ EnumC590470NDx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC590470NDx NOT_EXIST;
    public static final EnumC590470NDx SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC590470NDx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC590470NDx enumC590470NDx = new EnumC590470NDx("SUCCESS", 0, 0);
        SUCCESS = enumC590470NDx;
        EnumC590470NDx enumC590470NDx2 = new EnumC590470NDx("EMPTY", 1, 1);
        EMPTY = enumC590470NDx2;
        EnumC590470NDx enumC590470NDx3 = new EnumC590470NDx("NOT_EXIST", 2, 2);
        NOT_EXIST = enumC590470NDx3;
        EnumC590470NDx[] enumC590470NDxArr = {enumC590470NDx, enumC590470NDx2, enumC590470NDx3};
        LLILLJJLI = enumC590470NDxArr;
        LLILLL = new C2254308sP(enumC590470NDxArr);
    }

    public static EnumC590470NDx[] values() {
        return (EnumC590470NDx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC590470NDx valueOf(String str) {
        return (EnumC590470NDx) C08FF.LIZ(EnumC590470NDx.class, str);
    }

    public EnumC590470NDx(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC464630IJx {
    public static final /* synthetic */ EnumC464630IJx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC464630IJx MASK;
    public static final EnumC464630IJx NORMAL;
    public static final EnumC464630IJx PAY_SUCCESS;
    public static final EnumC464630IJx PREVIEW;

    public static InterfaceC2044707zh<EnumC464630IJx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC464630IJx enumC464630IJx = new EnumC464630IJx("NORMAL", 0);
        NORMAL = enumC464630IJx;
        EnumC464630IJx enumC464630IJx2 = new EnumC464630IJx("PREVIEW", 1);
        PREVIEW = enumC464630IJx2;
        EnumC464630IJx enumC464630IJx3 = new EnumC464630IJx("MASK", 2);
        MASK = enumC464630IJx3;
        EnumC464630IJx enumC464630IJx4 = new EnumC464630IJx("PAY_SUCCESS", 3);
        PAY_SUCCESS = enumC464630IJx4;
        EnumC464630IJx[] enumC464630IJxArr = {enumC464630IJx, enumC464630IJx2, enumC464630IJx3, enumC464630IJx4};
        LL = enumC464630IJxArr;
        LLILLJJLI = new C2254308sP(enumC464630IJxArr);
    }

    public static EnumC464630IJx[] values() {
        return (EnumC464630IJx[]) LL.clone();
    }

    public static EnumC464630IJx valueOf(String str) {
        return (EnumC464630IJx) C08FF.LIZ(EnumC464630IJx.class, str);
    }

    public EnumC464630IJx(String str, int i) {
    }
}

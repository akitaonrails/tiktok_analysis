package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1652120t5u implements InterfaceC1652140t5w {
    public static final EnumC1652120t5u BEAUTY;
    public static final EnumC1652120t5u FILTER;
    public static final EnumC1652120t5u FLASH;
    public static final /* synthetic */ EnumC1652120t5u[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1652120t5u M_BEAUTY;
    public static final EnumC1652120t5u REVERSE_CAMERA;
    public final EnumC1651310t4b LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1652120t5u> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = EnumC1651310t4b.FIXED;
        EnumC1652120t5u enumC1652120t5u = new EnumC1652120t5u("REVERSE_CAMERA", 0, enumC1651310t4b, "reverse_camera", 0);
        REVERSE_CAMERA = enumC1652120t5u;
        EnumC1652120t5u enumC1652120t5u2 = new EnumC1652120t5u("FLASH", 1, enumC1651310t4b, "flash", 19);
        FLASH = enumC1652120t5u2;
        EnumC1652120t5u enumC1652120t5u3 = new EnumC1652120t5u("FILTER", 2, enumC1651310t4b, "filter", 4);
        FILTER = enumC1652120t5u3;
        EnumC1652120t5u enumC1652120t5u4 = new EnumC1652120t5u("M_BEAUTY", 3, enumC1651310t4b, "beauty", 2);
        M_BEAUTY = enumC1652120t5u4;
        EnumC1652120t5u enumC1652120t5u5 = new EnumC1652120t5u("BEAUTY", 4, enumC1651310t4b, "beauty", 6);
        BEAUTY = enumC1652120t5u5;
        EnumC1652120t5u[] enumC1652120t5uArr = {enumC1652120t5u, enumC1652120t5u2, enumC1652120t5u3, enumC1652120t5u4, enumC1652120t5u5};
        LLILZ = enumC1652120t5uArr;
        LLILZIL = new C2254308sP(enumC1652120t5uArr);
    }

    public static EnumC1652120t5u[] values() {
        return (EnumC1652120t5u[]) LLILZ.clone();
    }

    @Override // X.InterfaceC1652140t5w
    public /* bridge */ /* synthetic */ int getOrdinal() {
        return ordinal();
    }

    @Override // X.InterfaceC1652140t5w
    public String getItemTag() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1652140t5w
    public EnumC1651310t4b getSection() {
        return this.LL;
    }

    @Override // X.InterfaceC1652140t5w
    public int getType() {
        return this.LLILLL;
    }

    public static EnumC1652120t5u valueOf(String str) {
        return (EnumC1652120t5u) C08FF.LIZ(EnumC1652120t5u.class, str);
    }

    public EnumC1652120t5u(String str, int i, EnumC1651310t4b enumC1651310t4b, String str2, int i2) {
        this.LL = enumC1651310t4b;
        this.LLILLJJLI = str2;
        this.LLILLL = i2;
    }
}

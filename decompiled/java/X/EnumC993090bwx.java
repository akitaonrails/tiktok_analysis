package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993090bwx {
    public static final EnumC993090bwx CLICK;
    public static final /* synthetic */ EnumC993090bwx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993090bwx PROP_ON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993090bwx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993090bwx enumC993090bwx = new EnumC993090bwx("CLICK", 0, "click");
        CLICK = enumC993090bwx;
        EnumC993090bwx enumC993090bwx2 = new EnumC993090bwx("PROP_ON", 1, "prop_on");
        PROP_ON = enumC993090bwx2;
        EnumC993090bwx[] enumC993090bwxArr = {enumC993090bwx, enumC993090bwx2};
        LLILLJJLI = enumC993090bwxArr;
        LLILLL = new C2254308sP(enumC993090bwxArr);
    }

    public static EnumC993090bwx[] values() {
        return (EnumC993090bwx[]) LLILLJJLI.clone();
    }

    public final String getMob() {
        return this.LL;
    }

    public static EnumC993090bwx valueOf(String str) {
        return (EnumC993090bwx) C08FF.LIZ(EnumC993090bwx.class, str);
    }

    public EnumC993090bwx(String str, int i, String str2) {
        this.LL = str2;
    }
}

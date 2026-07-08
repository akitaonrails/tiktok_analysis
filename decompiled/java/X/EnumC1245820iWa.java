package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1245820iWa {
    public static final EnumC1245820iWa CLICK;
    public static final EnumC1245820iWa CLOSE;
    public static final EnumC1245820iWa CLOSE_BLANK;
    public static final /* synthetic */ EnumC1245820iWa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1245820iWa SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1245820iWa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1245820iWa enumC1245820iWa = new EnumC1245820iWa("SHOW", 0, "show");
        SHOW = enumC1245820iWa;
        EnumC1245820iWa enumC1245820iWa2 = new EnumC1245820iWa("CLICK", 1, "click");
        CLICK = enumC1245820iWa2;
        EnumC1245820iWa enumC1245820iWa3 = new EnumC1245820iWa("CLOSE", 2, "close");
        CLOSE = enumC1245820iWa3;
        EnumC1245820iWa enumC1245820iWa4 = new EnumC1245820iWa("CLOSE_BLANK", 3, "close_blank");
        CLOSE_BLANK = enumC1245820iWa4;
        EnumC1245820iWa[] enumC1245820iWaArr = {enumC1245820iWa, enumC1245820iWa2, enumC1245820iWa3, enumC1245820iWa4};
        LLILLJJLI = enumC1245820iWaArr;
        LLILLL = new C2254308sP(enumC1245820iWaArr);
    }

    public static EnumC1245820iWa[] values() {
        return (EnumC1245820iWa[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC1245820iWa valueOf(String str) {
        return (EnumC1245820iWa) C08FF.LIZ(EnumC1245820iWa.class, str);
    }

    public EnumC1245820iWa(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC360140EAa {
    public static final /* synthetic */ EnumC360140EAa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC360140EAa MOVE;
    public static final EnumC360140EAa ZOOM_IN;
    public static final EnumC360140EAa ZOOM_OUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC360140EAa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC360140EAa enumC360140EAa = new EnumC360140EAa("ZOOM_OUT", 0, "zoom_out");
        ZOOM_OUT = enumC360140EAa;
        EnumC360140EAa enumC360140EAa2 = new EnumC360140EAa("ZOOM_IN", 1, "zoom_in");
        ZOOM_IN = enumC360140EAa2;
        EnumC360140EAa enumC360140EAa3 = new EnumC360140EAa("MOVE", 2, "move");
        MOVE = enumC360140EAa3;
        EnumC360140EAa[] enumC360140EAaArr = {enumC360140EAa, enumC360140EAa2, enumC360140EAa3};
        LLILLJJLI = enumC360140EAaArr;
        LLILLL = new C2254308sP(enumC360140EAaArr);
    }

    public static EnumC360140EAa[] values() {
        return (EnumC360140EAa[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC360140EAa valueOf(String str) {
        return (EnumC360140EAa) C08FF.LIZ(EnumC360140EAa.class, str);
    }

    public EnumC360140EAa(String str, int i, String str2) {
        this.LL = str2;
    }
}

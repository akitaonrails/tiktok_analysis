package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21157517qv {
    public static final EnumC21157517qv BOTTOM;
    public static final EnumC21157517qv END;
    public static final /* synthetic */ EnumC21157517qv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21157517qv START;
    public static final EnumC21157517qv TOP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21157517qv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21157517qv enumC21157517qv = new EnumC21157517qv("START", 0, "start");
        START = enumC21157517qv;
        EnumC21157517qv enumC21157517qv2 = new EnumC21157517qv("TOP", 1, "top");
        TOP = enumC21157517qv2;
        EnumC21157517qv enumC21157517qv3 = new EnumC21157517qv("END", 2, "end");
        END = enumC21157517qv3;
        EnumC21157517qv enumC21157517qv4 = new EnumC21157517qv("BOTTOM", 3, "bottom");
        BOTTOM = enumC21157517qv4;
        EnumC21157517qv[] enumC21157517qvArr = {enumC21157517qv, enumC21157517qv2, enumC21157517qv3, enumC21157517qv4};
        LLILLJJLI = enumC21157517qvArr;
        LLILLL = new C2254308sP(enumC21157517qvArr);
    }

    public static EnumC21157517qv[] values() {
        return (EnumC21157517qv[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21157517qv valueOf(String str) {
        return (EnumC21157517qv) C08FF.LIZ(EnumC21157517qv.class, str);
    }

    public EnumC21157517qv(String str, int i, String str2) {
        this.LL = str2;
    }
}

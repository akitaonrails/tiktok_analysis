package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC975440bUU {
    public static final /* synthetic */ EnumC975440bUU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC975440bUU PERIODIC;
    public static final EnumC975440bUU SHOW_RESULT;
    public static final EnumC975440bUU START_ANIMATION_END;
    public final String LL;

    public static InterfaceC2044707zh<EnumC975440bUU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC975440bUU enumC975440bUU = new EnumC975440bUU("PERIODIC", 0, "periodic");
        PERIODIC = enumC975440bUU;
        EnumC975440bUU enumC975440bUU2 = new EnumC975440bUU("START_ANIMATION_END", 1, "start_animation_end");
        START_ANIMATION_END = enumC975440bUU2;
        EnumC975440bUU enumC975440bUU3 = new EnumC975440bUU("SHOW_RESULT", 2, "show_result");
        SHOW_RESULT = enumC975440bUU3;
        EnumC975440bUU[] enumC975440bUUArr = {enumC975440bUU, enumC975440bUU2, enumC975440bUU3};
        LLILLJJLI = enumC975440bUUArr;
        LLILLL = new C2254308sP(enumC975440bUUArr);
    }

    public static EnumC975440bUU[] values() {
        return (EnumC975440bUU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC975440bUU valueOf(String str) {
        return (EnumC975440bUU) C08FF.LIZ(EnumC975440bUU.class, str);
    }

    public EnumC975440bUU(String str, int i, String str2) {
        this.LL = str2;
    }
}

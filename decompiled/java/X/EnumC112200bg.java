package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC112200bg {
    public static final EnumC112200bg FINISH;
    public static final /* synthetic */ EnumC112200bg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC112200bg SHOW_CONTROL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC112200bg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC112200bg enumC112200bg = new EnumC112200bg("SHOW_CONTROL", 0, "show_control");
        SHOW_CONTROL = enumC112200bg;
        EnumC112200bg enumC112200bg2 = new EnumC112200bg("FINISH", 1, "finish");
        FINISH = enumC112200bg2;
        EnumC112200bg[] enumC112200bgArr = {enumC112200bg, enumC112200bg2};
        LLILLJJLI = enumC112200bgArr;
        LLILLL = new C2254308sP(enumC112200bgArr);
    }

    public static EnumC112200bg[] values() {
        return (EnumC112200bg[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC112200bg valueOf(String str) {
        return (EnumC112200bg) C08FF.LIZ(EnumC112200bg.class, str);
    }

    public EnumC112200bg(String str, int i, String str2) {
        this.LL = str2;
    }
}

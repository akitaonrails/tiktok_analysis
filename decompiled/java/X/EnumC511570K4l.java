package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC511570K4l {
    public static final EnumC511570K4l FAILED;
    public static final EnumC511570K4l HANDLED;
    public static final /* synthetic */ EnumC511570K4l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC511570K4l NOT_HANDLED;

    public static InterfaceC2044707zh<EnumC511570K4l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC511570K4l enumC511570K4l = new EnumC511570K4l("NOT_HANDLED", 0);
        NOT_HANDLED = enumC511570K4l;
        EnumC511570K4l enumC511570K4l2 = new EnumC511570K4l("HANDLED", 1);
        HANDLED = enumC511570K4l2;
        EnumC511570K4l enumC511570K4l3 = new EnumC511570K4l("FAILED", 2);
        FAILED = enumC511570K4l3;
        EnumC511570K4l[] enumC511570K4lArr = {enumC511570K4l, enumC511570K4l2, enumC511570K4l3};
        LL = enumC511570K4lArr;
        LLILLJJLI = new C2254308sP(enumC511570K4lArr);
    }

    public static EnumC511570K4l[] values() {
        return (EnumC511570K4l[]) LL.clone();
    }

    public static EnumC511570K4l valueOf(String str) {
        return (EnumC511570K4l) C08FF.LIZ(EnumC511570K4l.class, str);
    }

    public EnumC511570K4l(String str, int i) {
    }
}

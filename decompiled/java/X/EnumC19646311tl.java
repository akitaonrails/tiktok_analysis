package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19646311tl {
    public static final EnumC19646311tl CLEAR;

    @InterfaceC1294060jmO
    public static final EnumC19646311tl ERROR;
    public static final EnumC19646311tl GREEN;
    public static final /* synthetic */ EnumC19646311tl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19646311tl NONE;
    public static final EnumC19646311tl PROGRESS;

    public static InterfaceC2044707zh<EnumC19646311tl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19646311tl enumC19646311tl = new EnumC19646311tl("NONE", 0);
        NONE = enumC19646311tl;
        EnumC19646311tl enumC19646311tl2 = new EnumC19646311tl("CLEAR", 1);
        CLEAR = enumC19646311tl2;
        EnumC19646311tl enumC19646311tl3 = new EnumC19646311tl("PROGRESS", 2);
        PROGRESS = enumC19646311tl3;
        EnumC19646311tl enumC19646311tl4 = new EnumC19646311tl("GREEN", 3);
        GREEN = enumC19646311tl4;
        EnumC19646311tl enumC19646311tl5 = new EnumC19646311tl("ERROR", 4);
        ERROR = enumC19646311tl5;
        EnumC19646311tl[] enumC19646311tlArr = {enumC19646311tl, enumC19646311tl2, enumC19646311tl3, enumC19646311tl4, enumC19646311tl5};
        LL = enumC19646311tlArr;
        LLILLJJLI = new C2254308sP(enumC19646311tlArr);
    }

    public static EnumC19646311tl[] values() {
        return (EnumC19646311tl[]) LL.clone();
    }

    public static EnumC19646311tl valueOf(String str) {
        return (EnumC19646311tl) C08FF.LIZ(EnumC19646311tl.class, str);
    }

    public EnumC19646311tl(String str, int i) {
    }
}

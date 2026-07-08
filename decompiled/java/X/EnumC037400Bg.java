package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037400Bg {
    public static final EnumC037400Bg ERROR;
    public static final EnumC037400Bg FINISH;
    public static final /* synthetic */ EnumC037400Bg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC037400Bg LOADING;
    public static final EnumC037400Bg NONE;

    public static InterfaceC2044707zh<EnumC037400Bg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC037400Bg enumC037400Bg = new EnumC037400Bg("NONE", 0);
        NONE = enumC037400Bg;
        EnumC037400Bg enumC037400Bg2 = new EnumC037400Bg("LOADING", 1);
        LOADING = enumC037400Bg2;
        EnumC037400Bg enumC037400Bg3 = new EnumC037400Bg("FINISH", 2);
        FINISH = enumC037400Bg3;
        EnumC037400Bg enumC037400Bg4 = new EnumC037400Bg("ERROR", 3);
        ERROR = enumC037400Bg4;
        EnumC037400Bg[] enumC037400BgArr = {enumC037400Bg, enumC037400Bg2, enumC037400Bg3, enumC037400Bg4};
        LL = enumC037400BgArr;
        LLILLJJLI = new C2254308sP(enumC037400BgArr);
    }

    public static EnumC037400Bg[] values() {
        return (EnumC037400Bg[]) LL.clone();
    }

    public static EnumC037400Bg valueOf(String str) {
        return (EnumC037400Bg) C08FF.LIZ(EnumC037400Bg.class, str);
    }

    public EnumC037400Bg(String str, int i) {
    }
}

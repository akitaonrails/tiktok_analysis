package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1907390zjd {
    public static final /* synthetic */ EnumC1907390zjd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1907390zjd Left;
    public static final EnumC1907390zjd Middle;
    public static final EnumC1907390zjd Right;
    public static final EnumC1907390zjd Root;

    public static InterfaceC2044707zh<EnumC1907390zjd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1907390zjd enumC1907390zjd = new EnumC1907390zjd("Left", 0);
        Left = enumC1907390zjd;
        EnumC1907390zjd enumC1907390zjd2 = new EnumC1907390zjd("Middle", 1);
        Middle = enumC1907390zjd2;
        EnumC1907390zjd enumC1907390zjd3 = new EnumC1907390zjd("Right", 2);
        Right = enumC1907390zjd3;
        EnumC1907390zjd enumC1907390zjd4 = new EnumC1907390zjd("Root", 3);
        Root = enumC1907390zjd4;
        EnumC1907390zjd[] enumC1907390zjdArr = {enumC1907390zjd, enumC1907390zjd2, enumC1907390zjd3, enumC1907390zjd4};
        LL = enumC1907390zjdArr;
        LLILLJJLI = new C2254308sP(enumC1907390zjdArr);
    }

    public static EnumC1907390zjd[] values() {
        return (EnumC1907390zjd[]) LL.clone();
    }

    public static EnumC1907390zjd valueOf(String str) {
        return (EnumC1907390zjd) C08FF.LIZ(EnumC1907390zjd.class, str);
    }

    public EnumC1907390zjd(String str, int i) {
    }
}

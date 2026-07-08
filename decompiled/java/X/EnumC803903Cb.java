package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC803903Cb {
    public static final EnumC803903Cb HAS_ICON;
    public static final /* synthetic */ EnumC803903Cb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC803903Cb NO_ICON;

    public static InterfaceC2044707zh<EnumC803903Cb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC803903Cb enumC803903Cb = new EnumC803903Cb("HAS_ICON", 0);
        HAS_ICON = enumC803903Cb;
        EnumC803903Cb enumC803903Cb2 = new EnumC803903Cb("NO_ICON", 1);
        NO_ICON = enumC803903Cb2;
        EnumC803903Cb[] enumC803903CbArr = {enumC803903Cb, enumC803903Cb2};
        LL = enumC803903CbArr;
        LLILLJJLI = new C2254308sP(enumC803903CbArr);
    }

    public static EnumC803903Cb[] values() {
        return (EnumC803903Cb[]) LL.clone();
    }

    public static EnumC803903Cb valueOf(String str) {
        return (EnumC803903Cb) C08FF.LIZ(EnumC803903Cb.class, str);
    }

    public EnumC803903Cb(String str, int i) {
    }
}

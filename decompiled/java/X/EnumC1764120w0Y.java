package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1764120w0Y {
    public static final EnumC1764120w0Y BLACK_PAGE;
    public static final EnumC1764120w0Y DEFAULT_SELECT;
    public static final /* synthetic */ EnumC1764120w0Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1764120w0Y NONE;
    public static final EnumC1764120w0Y TAB;

    public static InterfaceC2044707zh<EnumC1764120w0Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1764120w0Y enumC1764120w0Y = new EnumC1764120w0Y("NONE", 0);
        NONE = enumC1764120w0Y;
        EnumC1764120w0Y enumC1764120w0Y2 = new EnumC1764120w0Y("TAB", 1);
        TAB = enumC1764120w0Y2;
        EnumC1764120w0Y enumC1764120w0Y3 = new EnumC1764120w0Y("BLACK_PAGE", 2);
        BLACK_PAGE = enumC1764120w0Y3;
        EnumC1764120w0Y enumC1764120w0Y4 = new EnumC1764120w0Y("DEFAULT_SELECT", 3);
        DEFAULT_SELECT = enumC1764120w0Y4;
        EnumC1764120w0Y[] enumC1764120w0YArr = {enumC1764120w0Y, enumC1764120w0Y2, enumC1764120w0Y3, enumC1764120w0Y4};
        LL = enumC1764120w0YArr;
        LLILLJJLI = new C2254308sP(enumC1764120w0YArr);
    }

    public static EnumC1764120w0Y[] values() {
        return (EnumC1764120w0Y[]) LL.clone();
    }

    public static EnumC1764120w0Y valueOf(String str) {
        return (EnumC1764120w0Y) C08FF.LIZ(EnumC1764120w0Y.class, str);
    }

    public EnumC1764120w0Y(String str, int i) {
    }
}

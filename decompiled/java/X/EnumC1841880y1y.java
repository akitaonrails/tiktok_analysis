package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1841880y1y {
    public static final EnumC1841880y1y FALLBACK;
    public static final /* synthetic */ EnumC1841880y1y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1841880y1y PREFETCH;

    public static InterfaceC2044707zh<EnumC1841880y1y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1841880y1y enumC1841880y1y = new EnumC1841880y1y("FALLBACK", 0);
        FALLBACK = enumC1841880y1y;
        EnumC1841880y1y enumC1841880y1y2 = new EnumC1841880y1y("PREFETCH", 1);
        PREFETCH = enumC1841880y1y2;
        EnumC1841880y1y[] enumC1841880y1yArr = {enumC1841880y1y, enumC1841880y1y2};
        LL = enumC1841880y1yArr;
        LLILLJJLI = new C2254308sP(enumC1841880y1yArr);
    }

    public static EnumC1841880y1y[] values() {
        return (EnumC1841880y1y[]) LL.clone();
    }

    public static EnumC1841880y1y valueOf(String str) {
        return (EnumC1841880y1y) C08FF.LIZ(EnumC1841880y1y.class, str);
    }

    public EnumC1841880y1y(String str, int i) {
    }
}

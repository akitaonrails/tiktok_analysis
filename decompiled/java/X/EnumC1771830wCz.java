package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771830wCz {
    public static final /* synthetic */ EnumC1771830wCz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1771830wCz LOAD_MORE;
    public static final EnumC1771830wCz REFRESH;

    public static InterfaceC2044707zh<EnumC1771830wCz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1771830wCz enumC1771830wCz = new EnumC1771830wCz("REFRESH", 0);
        REFRESH = enumC1771830wCz;
        EnumC1771830wCz enumC1771830wCz2 = new EnumC1771830wCz("LOAD_MORE", 1);
        LOAD_MORE = enumC1771830wCz2;
        EnumC1771830wCz[] enumC1771830wCzArr = {enumC1771830wCz, enumC1771830wCz2};
        LL = enumC1771830wCzArr;
        LLILLJJLI = new C2254308sP(enumC1771830wCzArr);
    }

    public static EnumC1771830wCz[] values() {
        return (EnumC1771830wCz[]) LL.clone();
    }

    public static EnumC1771830wCz valueOf(String str) {
        return (EnumC1771830wCz) C08FF.LIZ(EnumC1771830wCz.class, str);
    }

    public EnumC1771830wCz(String str, int i) {
    }
}

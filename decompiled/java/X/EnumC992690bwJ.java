package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992690bwJ {
    public static final /* synthetic */ EnumC992690bwJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992690bwJ PROGRAMMATIC;
    public static final EnumC992690bwJ SYSTEM_OR_UNKNOWN;

    public static InterfaceC2044707zh<EnumC992690bwJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992690bwJ enumC992690bwJ = new EnumC992690bwJ("PROGRAMMATIC", 0);
        PROGRAMMATIC = enumC992690bwJ;
        EnumC992690bwJ enumC992690bwJ2 = new EnumC992690bwJ("SYSTEM_OR_UNKNOWN", 1);
        SYSTEM_OR_UNKNOWN = enumC992690bwJ2;
        EnumC992690bwJ[] enumC992690bwJArr = {enumC992690bwJ, enumC992690bwJ2};
        LL = enumC992690bwJArr;
        LLILLJJLI = new C2254308sP(enumC992690bwJArr);
    }

    public static EnumC992690bwJ[] values() {
        return (EnumC992690bwJ[]) LL.clone();
    }

    public static EnumC992690bwJ valueOf(String str) {
        return (EnumC992690bwJ) C08FF.LIZ(EnumC992690bwJ.class, str);
    }

    public EnumC992690bwJ(String str, int i) {
    }
}

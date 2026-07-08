package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19357710oJ {
    public static final EnumC19357710oJ COLOR;
    public static final /* synthetic */ EnumC19357710oJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19357710oJ TEXT_FONT;

    public static InterfaceC2044707zh<EnumC19357710oJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19357710oJ enumC19357710oJ = new EnumC19357710oJ("TEXT_FONT", 0);
        TEXT_FONT = enumC19357710oJ;
        EnumC19357710oJ enumC19357710oJ2 = new EnumC19357710oJ("COLOR", 1);
        COLOR = enumC19357710oJ2;
        EnumC19357710oJ[] enumC19357710oJArr = {enumC19357710oJ, enumC19357710oJ2};
        LL = enumC19357710oJArr;
        LLILLJJLI = new C2254308sP(enumC19357710oJArr);
    }

    public static EnumC19357710oJ[] values() {
        return (EnumC19357710oJ[]) LL.clone();
    }

    public static EnumC19357710oJ valueOf(String str) {
        return (EnumC19357710oJ) C08FF.LIZ(EnumC19357710oJ.class, str);
    }

    public EnumC19357710oJ(String str, int i) {
    }
}

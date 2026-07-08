package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1540340qBc {
    public static final EnumC1540340qBc DARK;
    public static final EnumC1540340qBc LIGHT;
    public static final /* synthetic */ EnumC1540340qBc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1540340qBc OTHER;

    public static InterfaceC2044707zh<EnumC1540340qBc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1540340qBc enumC1540340qBc = new EnumC1540340qBc("DARK", 0);
        DARK = enumC1540340qBc;
        EnumC1540340qBc enumC1540340qBc2 = new EnumC1540340qBc("LIGHT", 1);
        LIGHT = enumC1540340qBc2;
        EnumC1540340qBc enumC1540340qBc3 = new EnumC1540340qBc("OTHER", 2);
        OTHER = enumC1540340qBc3;
        EnumC1540340qBc[] enumC1540340qBcArr = {enumC1540340qBc, enumC1540340qBc2, enumC1540340qBc3};
        LL = enumC1540340qBcArr;
        LLILLJJLI = new C2254308sP(enumC1540340qBcArr);
    }

    public static EnumC1540340qBc[] values() {
        return (EnumC1540340qBc[]) LL.clone();
    }

    public static EnumC1540340qBc valueOf(String str) {
        return (EnumC1540340qBc) C08FF.LIZ(EnumC1540340qBc.class, str);
    }

    public EnumC1540340qBc(String str, int i) {
    }
}

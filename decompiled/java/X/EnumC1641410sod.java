package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641410sod {
    public static final EnumC1641410sod COMBINED;
    public static final EnumC1641410sod HORIZONTAL;
    public static final /* synthetic */ EnumC1641410sod[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641410sod PANEL;

    public static InterfaceC2044707zh<EnumC1641410sod> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641410sod enumC1641410sod = new EnumC1641410sod("HORIZONTAL", 0);
        HORIZONTAL = enumC1641410sod;
        EnumC1641410sod enumC1641410sod2 = new EnumC1641410sod("PANEL", 1);
        PANEL = enumC1641410sod2;
        EnumC1641410sod enumC1641410sod3 = new EnumC1641410sod("COMBINED", 2);
        COMBINED = enumC1641410sod3;
        EnumC1641410sod[] enumC1641410sodArr = {enumC1641410sod, enumC1641410sod2, enumC1641410sod3};
        LL = enumC1641410sodArr;
        LLILLJJLI = new C2254308sP(enumC1641410sodArr);
    }

    public static EnumC1641410sod[] values() {
        return (EnumC1641410sod[]) LL.clone();
    }

    public static EnumC1641410sod valueOf(String str) {
        return (EnumC1641410sod) C08FF.LIZ(EnumC1641410sod.class, str);
    }

    public EnumC1641410sod(String str, int i) {
    }
}

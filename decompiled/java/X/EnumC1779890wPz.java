package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779890wPz {
    public static final EnumC1779890wPz FOLDED;
    public static final /* synthetic */ EnumC1779890wPz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779890wPz UNFOLDED;
    public static final EnumC1779890wPz UNKNOWN;

    public static InterfaceC2044707zh<EnumC1779890wPz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779890wPz enumC1779890wPz = new EnumC1779890wPz("FOLDED", 0);
        FOLDED = enumC1779890wPz;
        EnumC1779890wPz enumC1779890wPz2 = new EnumC1779890wPz("UNFOLDED", 1);
        UNFOLDED = enumC1779890wPz2;
        EnumC1779890wPz enumC1779890wPz3 = new EnumC1779890wPz("UNKNOWN", 2);
        UNKNOWN = enumC1779890wPz3;
        EnumC1779890wPz[] enumC1779890wPzArr = {enumC1779890wPz, enumC1779890wPz2, enumC1779890wPz3};
        LL = enumC1779890wPzArr;
        LLILLJJLI = new C2254308sP(enumC1779890wPzArr);
    }

    public static EnumC1779890wPz[] values() {
        return (EnumC1779890wPz[]) LL.clone();
    }

    public static EnumC1779890wPz valueOf(String str) {
        return (EnumC1779890wPz) C08FF.LIZ(EnumC1779890wPz.class, str);
    }

    public EnumC1779890wPz(String str, int i) {
    }
}

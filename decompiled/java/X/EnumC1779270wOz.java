package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779270wOz {
    public static final EnumC1779270wOz ATTR;
    public static final EnumC1779270wOz DRAWABLE;
    public static final /* synthetic */ EnumC1779270wOz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1779270wOz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779270wOz enumC1779270wOz = new EnumC1779270wOz("ATTR", 0);
        ATTR = enumC1779270wOz;
        EnumC1779270wOz enumC1779270wOz2 = new EnumC1779270wOz("DRAWABLE", 1);
        DRAWABLE = enumC1779270wOz2;
        EnumC1779270wOz[] enumC1779270wOzArr = {enumC1779270wOz, enumC1779270wOz2};
        LL = enumC1779270wOzArr;
        LLILLJJLI = new C2254308sP(enumC1779270wOzArr);
    }

    public static EnumC1779270wOz[] values() {
        return (EnumC1779270wOz[]) LL.clone();
    }

    public static EnumC1779270wOz valueOf(String str) {
        return (EnumC1779270wOz) C08FF.LIZ(EnumC1779270wOz.class, str);
    }

    public EnumC1779270wOz(String str, int i) {
    }
}

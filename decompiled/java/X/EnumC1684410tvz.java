package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1684410tvz {
    public static final EnumC1684410tvz Cursor;
    public static final /* synthetic */ EnumC1684410tvz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1684410tvz None;
    public static final EnumC1684410tvz Selection;

    public static InterfaceC2044707zh<EnumC1684410tvz> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1684410tvz valueOf(String str) {
        return (EnumC1684410tvz) C08FF.LIZ(EnumC1684410tvz.class, str);
    }

    public static EnumC1684410tvz[] values() {
        return (EnumC1684410tvz[]) LL.clone();
    }

    static {
        EnumC1684410tvz enumC1684410tvz = new EnumC1684410tvz("None", 0);
        None = enumC1684410tvz;
        EnumC1684410tvz enumC1684410tvz2 = new EnumC1684410tvz("Selection", 1);
        Selection = enumC1684410tvz2;
        EnumC1684410tvz enumC1684410tvz3 = new EnumC1684410tvz("Cursor", 2);
        Cursor = enumC1684410tvz3;
        EnumC1684410tvz[] enumC1684410tvzArr = {enumC1684410tvz, enumC1684410tvz2, enumC1684410tvz3};
        LL = enumC1684410tvzArr;
        LLILLJJLI = new C2254308sP(enumC1684410tvzArr);
    }

    public EnumC1684410tvz(String str, int i) {
    }
}

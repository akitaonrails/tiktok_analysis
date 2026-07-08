package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1692020u8G {
    public static final EnumC1692020u8G Cursor;
    public static final /* synthetic */ EnumC1692020u8G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1692020u8G SelectionEnd;
    public static final EnumC1692020u8G SelectionStart;

    public static InterfaceC2044707zh<EnumC1692020u8G> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1692020u8G valueOf(String str) {
        return (EnumC1692020u8G) C08FF.LIZ(EnumC1692020u8G.class, str);
    }

    public static EnumC1692020u8G[] values() {
        return (EnumC1692020u8G[]) LL.clone();
    }

    static {
        EnumC1692020u8G enumC1692020u8G = new EnumC1692020u8G("Cursor", 0);
        Cursor = enumC1692020u8G;
        EnumC1692020u8G enumC1692020u8G2 = new EnumC1692020u8G("SelectionStart", 1);
        SelectionStart = enumC1692020u8G2;
        EnumC1692020u8G enumC1692020u8G3 = new EnumC1692020u8G("SelectionEnd", 2);
        SelectionEnd = enumC1692020u8G3;
        EnumC1692020u8G[] enumC1692020u8GArr = {enumC1692020u8G, enumC1692020u8G2, enumC1692020u8G3};
        LL = enumC1692020u8GArr;
        LLILLJJLI = new C2254308sP(enumC1692020u8GArr);
    }

    public EnumC1692020u8G(String str, int i) {
    }
}

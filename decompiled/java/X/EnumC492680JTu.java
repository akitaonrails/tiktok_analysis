package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC492680JTu {
    public static final EnumC492680JTu CANCEL;
    public static final EnumC492680JTu CONTINUE;
    public static final /* synthetic */ EnumC492680JTu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC492680JTu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC492680JTu enumC492680JTu = new EnumC492680JTu("CONTINUE", 0, "continue");
        CONTINUE = enumC492680JTu;
        EnumC492680JTu enumC492680JTu2 = new EnumC492680JTu("CANCEL", 1, "cancel");
        CANCEL = enumC492680JTu2;
        EnumC492680JTu[] enumC492680JTuArr = {enumC492680JTu, enumC492680JTu2};
        LLILLJJLI = enumC492680JTuArr;
        LLILLL = new C2254308sP(enumC492680JTuArr);
    }

    public static EnumC492680JTu[] values() {
        return (EnumC492680JTu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC492680JTu valueOf(String str) {
        return (EnumC492680JTu) C08FF.LIZ(EnumC492680JTu.class, str);
    }

    public EnumC492680JTu(String str, int i, String str2) {
        this.LL = str2;
    }
}

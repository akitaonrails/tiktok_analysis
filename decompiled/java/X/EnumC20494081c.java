package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20494081c {
    public static final EnumC20494081c FALSE;
    public static final /* synthetic */ EnumC20494081c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20494081c TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20494081c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20494081c enumC20494081c = new EnumC20494081c("FALSE", 0, "false");
        FALSE = enumC20494081c;
        EnumC20494081c enumC20494081c2 = new EnumC20494081c("TRUE", 1, "true");
        TRUE = enumC20494081c2;
        EnumC20494081c[] enumC20494081cArr = {enumC20494081c, enumC20494081c2};
        LLILLJJLI = enumC20494081cArr;
        LLILLL = new C2254308sP(enumC20494081cArr);
    }

    public static EnumC20494081c[] values() {
        return (EnumC20494081c[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20494081c valueOf(String str) {
        return (EnumC20494081c) C08FF.LIZ(EnumC20494081c.class, str);
    }

    public EnumC20494081c(String str, int i, String str2) {
        this.LL = str2;
    }
}

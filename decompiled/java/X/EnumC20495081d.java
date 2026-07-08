package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20495081d {
    public static final EnumC20495081d FALSE;
    public static final /* synthetic */ EnumC20495081d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20495081d TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20495081d> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20495081d enumC20495081d = new EnumC20495081d("FALSE", 0, "false");
        FALSE = enumC20495081d;
        EnumC20495081d enumC20495081d2 = new EnumC20495081d("TRUE", 1, "true");
        TRUE = enumC20495081d2;
        EnumC20495081d[] enumC20495081dArr = {enumC20495081d, enumC20495081d2};
        LLILLJJLI = enumC20495081dArr;
        LLILLL = new C2254308sP(enumC20495081dArr);
    }

    public static EnumC20495081d[] values() {
        return (EnumC20495081d[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20495081d valueOf(String str) {
        return (EnumC20495081d) C08FF.LIZ(EnumC20495081d.class, str);
    }

    public EnumC20495081d(String str, int i, String str2) {
        this.LL = str2;
    }
}

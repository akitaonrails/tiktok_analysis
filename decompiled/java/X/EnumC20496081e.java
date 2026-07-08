package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20496081e {
    public static final EnumC20496081e FALSE;
    public static final /* synthetic */ EnumC20496081e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20496081e TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20496081e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20496081e enumC20496081e = new EnumC20496081e("FALSE", 0, "false");
        FALSE = enumC20496081e;
        EnumC20496081e enumC20496081e2 = new EnumC20496081e("TRUE", 1, "true");
        TRUE = enumC20496081e2;
        EnumC20496081e[] enumC20496081eArr = {enumC20496081e, enumC20496081e2};
        LLILLJJLI = enumC20496081eArr;
        LLILLL = new C2254308sP(enumC20496081eArr);
    }

    public static EnumC20496081e[] values() {
        return (EnumC20496081e[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20496081e valueOf(String str) {
        return (EnumC20496081e) C08FF.LIZ(EnumC20496081e.class, str);
    }

    public EnumC20496081e(String str, int i, String str2) {
        this.LL = str2;
    }
}

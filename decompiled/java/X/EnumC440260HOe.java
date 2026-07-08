package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440260HOe {
    public static final EnumC440260HOe CLOSE;
    public static final /* synthetic */ EnumC440260HOe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440260HOe UPGRADE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440260HOe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440260HOe enumC440260HOe = new EnumC440260HOe("UPGRADE", 0, "upgrade");
        UPGRADE = enumC440260HOe;
        EnumC440260HOe enumC440260HOe2 = new EnumC440260HOe("CLOSE", 1, "close");
        CLOSE = enumC440260HOe2;
        EnumC440260HOe[] enumC440260HOeArr = {enumC440260HOe, enumC440260HOe2};
        LLILLJJLI = enumC440260HOeArr;
        LLILLL = new C2254308sP(enumC440260HOeArr);
    }

    public static EnumC440260HOe[] values() {
        return (EnumC440260HOe[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440260HOe valueOf(String str) {
        return (EnumC440260HOe) C08FF.LIZ(EnumC440260HOe.class, str);
    }

    public EnumC440260HOe(String str, int i, String str2) {
        this.LL = str2;
    }
}

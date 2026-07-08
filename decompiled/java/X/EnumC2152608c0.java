package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2152608c0 {
    public static final EnumC2152608c0 CREATE;
    public static final EnumC2152608c0 ENCODE;
    public static final /* synthetic */ EnumC2152608c0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2152608c0 TOKEN;
    public static final EnumC2152608c0 UPLOAD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2152608c0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2152608c0 enumC2152608c0 = new EnumC2152608c0("ENCODE", 0, "encode");
        ENCODE = enumC2152608c0;
        EnumC2152608c0 enumC2152608c02 = new EnumC2152608c0("TOKEN", 1, "token");
        TOKEN = enumC2152608c02;
        EnumC2152608c0 enumC2152608c03 = new EnumC2152608c0("UPLOAD", 2, "upload");
        UPLOAD = enumC2152608c03;
        EnumC2152608c0 enumC2152608c04 = new EnumC2152608c0("CREATE", 3, "create");
        CREATE = enumC2152608c04;
        EnumC2152608c0[] enumC2152608c0Arr = {enumC2152608c0, enumC2152608c02, enumC2152608c03, enumC2152608c04};
        LLILLJJLI = enumC2152608c0Arr;
        LLILLL = new C2254308sP(enumC2152608c0Arr);
    }

    public static EnumC2152608c0[] values() {
        return (EnumC2152608c0[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC2152608c0 valueOf(String str) {
        return (EnumC2152608c0) C08FF.LIZ(EnumC2152608c0.class, str);
    }

    public EnumC2152608c0(String str, int i, String str2) {
        this.LL = str2;
    }
}

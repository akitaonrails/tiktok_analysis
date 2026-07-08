package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC664960Q6k {
    public static final EnumC664960Q6k INIT;
    public static final /* synthetic */ EnumC664960Q6k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC664960Q6k PUBLISH_FAILED;
    public static final EnumC664960Q6k PUBLISH_SUCCESS;

    public static InterfaceC2044707zh<EnumC664960Q6k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC664960Q6k enumC664960Q6k = new EnumC664960Q6k("INIT", 0);
        INIT = enumC664960Q6k;
        EnumC664960Q6k enumC664960Q6k2 = new EnumC664960Q6k("PUBLISH_SUCCESS", 1);
        PUBLISH_SUCCESS = enumC664960Q6k2;
        EnumC664960Q6k enumC664960Q6k3 = new EnumC664960Q6k("PUBLISH_FAILED", 2);
        PUBLISH_FAILED = enumC664960Q6k3;
        EnumC664960Q6k[] enumC664960Q6kArr = {enumC664960Q6k, enumC664960Q6k2, enumC664960Q6k3};
        LL = enumC664960Q6kArr;
        LLILLJJLI = new C2254308sP(enumC664960Q6kArr);
    }

    public static EnumC664960Q6k[] values() {
        return (EnumC664960Q6k[]) LL.clone();
    }

    public static EnumC664960Q6k valueOf(String str) {
        return (EnumC664960Q6k) C08FF.LIZ(EnumC664960Q6k.class, str);
    }

    public EnumC664960Q6k(String str, int i) {
    }
}

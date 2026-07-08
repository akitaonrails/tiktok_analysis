package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC462000I9u {
    public static final EnumC462000I9u ADD;
    public static final EnumC462000I9u FAILED;
    public static final /* synthetic */ EnumC462000I9u[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC462000I9u SUCCESS;
    public static final EnumC462000I9u UPDATE_COVER;

    public static InterfaceC2044707zh<EnumC462000I9u> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC462000I9u enumC462000I9u = new EnumC462000I9u("ADD", 0);
        ADD = enumC462000I9u;
        EnumC462000I9u enumC462000I9u2 = new EnumC462000I9u("SUCCESS", 1);
        SUCCESS = enumC462000I9u2;
        EnumC462000I9u enumC462000I9u3 = new EnumC462000I9u("FAILED", 2);
        FAILED = enumC462000I9u3;
        EnumC462000I9u enumC462000I9u4 = new EnumC462000I9u("UPDATE_COVER", 3);
        UPDATE_COVER = enumC462000I9u4;
        EnumC462000I9u[] enumC462000I9uArr = {enumC462000I9u, enumC462000I9u2, enumC462000I9u3, enumC462000I9u4};
        LL = enumC462000I9uArr;
        LLILLJJLI = new C2254308sP(enumC462000I9uArr);
    }

    public static EnumC462000I9u[] values() {
        return (EnumC462000I9u[]) LL.clone();
    }

    public static EnumC462000I9u valueOf(String str) {
        return (EnumC462000I9u) C08FF.LIZ(EnumC462000I9u.class, str);
    }

    public EnumC462000I9u(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869410Y8t {
    public static final EnumC869410Y8t ALL;
    public static final /* synthetic */ EnumC869410Y8t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC869410Y8t NONE_MESSAGE_REQUEST;
    public static final EnumC869410Y8t ONLY_MESSAGE_REQUEST;

    public static InterfaceC2044707zh<EnumC869410Y8t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC869410Y8t enumC869410Y8t = new EnumC869410Y8t("ALL", 0);
        ALL = enumC869410Y8t;
        EnumC869410Y8t enumC869410Y8t2 = new EnumC869410Y8t("NONE_MESSAGE_REQUEST", 1);
        NONE_MESSAGE_REQUEST = enumC869410Y8t2;
        EnumC869410Y8t enumC869410Y8t3 = new EnumC869410Y8t("ONLY_MESSAGE_REQUEST", 2);
        ONLY_MESSAGE_REQUEST = enumC869410Y8t3;
        EnumC869410Y8t[] enumC869410Y8tArr = {enumC869410Y8t, enumC869410Y8t2, enumC869410Y8t3};
        LL = enumC869410Y8tArr;
        LLILLJJLI = new C2254308sP(enumC869410Y8tArr);
    }

    public static EnumC869410Y8t[] values() {
        return (EnumC869410Y8t[]) LL.clone();
    }

    public static EnumC869410Y8t valueOf(String str) {
        return (EnumC869410Y8t) C08FF.LIZ(EnumC869410Y8t.class, str);
    }

    public EnumC869410Y8t(String str, int i) {
    }
}

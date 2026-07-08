package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153540g7k {
    public static final /* synthetic */ EnumC1153540g7k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153540g7k LOGIN_CONSENT;
    public static final EnumC1153540g7k NUJ_COMPONENT;
    public static final EnumC1153540g7k OTHER;

    public static InterfaceC2044707zh<EnumC1153540g7k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153540g7k enumC1153540g7k = new EnumC1153540g7k("NUJ_COMPONENT", 0);
        NUJ_COMPONENT = enumC1153540g7k;
        EnumC1153540g7k enumC1153540g7k2 = new EnumC1153540g7k("LOGIN_CONSENT", 1);
        LOGIN_CONSENT = enumC1153540g7k2;
        EnumC1153540g7k enumC1153540g7k3 = new EnumC1153540g7k("OTHER", 2);
        OTHER = enumC1153540g7k3;
        EnumC1153540g7k[] enumC1153540g7kArr = {enumC1153540g7k, enumC1153540g7k2, enumC1153540g7k3};
        LL = enumC1153540g7kArr;
        LLILLJJLI = new C2254308sP(enumC1153540g7kArr);
    }

    public static EnumC1153540g7k[] values() {
        return (EnumC1153540g7k[]) LL.clone();
    }

    public static EnumC1153540g7k valueOf(String str) {
        return (EnumC1153540g7k) C08FF.LIZ(EnumC1153540g7k.class, str);
    }

    public EnumC1153540g7k(String str, int i) {
    }
}

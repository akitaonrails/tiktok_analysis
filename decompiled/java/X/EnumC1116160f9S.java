package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1116160f9S {
    public static final EnumC1116160f9S BLANK;
    public static final EnumC1116160f9S DISPLAYING;
    public static final /* synthetic */ EnumC1116160f9S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1116160f9S SELF_WAITING;
    public static final EnumC1116160f9S UNKNOWN;

    public static InterfaceC2044707zh<EnumC1116160f9S> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1116160f9S enumC1116160f9S = new EnumC1116160f9S("UNKNOWN", 0);
        UNKNOWN = enumC1116160f9S;
        EnumC1116160f9S enumC1116160f9S2 = new EnumC1116160f9S("SELF_WAITING", 1);
        SELF_WAITING = enumC1116160f9S2;
        EnumC1116160f9S enumC1116160f9S3 = new EnumC1116160f9S("BLANK", 2);
        BLANK = enumC1116160f9S3;
        EnumC1116160f9S enumC1116160f9S4 = new EnumC1116160f9S("DISPLAYING", 3);
        DISPLAYING = enumC1116160f9S4;
        EnumC1116160f9S[] enumC1116160f9SArr = {enumC1116160f9S, enumC1116160f9S2, enumC1116160f9S3, enumC1116160f9S4};
        LL = enumC1116160f9SArr;
        LLILLJJLI = new C2254308sP(enumC1116160f9SArr);
    }

    public static EnumC1116160f9S[] values() {
        return (EnumC1116160f9S[]) LL.clone();
    }

    public static EnumC1116160f9S valueOf(String str) {
        return (EnumC1116160f9S) C08FF.LIZ(EnumC1116160f9S.class, str);
    }

    public EnumC1116160f9S(String str, int i) {
    }
}

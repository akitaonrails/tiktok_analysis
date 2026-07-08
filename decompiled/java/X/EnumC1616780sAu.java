package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1616780sAu {
    public static final C1616790sAv Companion;
    public static final /* synthetic */ EnumC1616780sAu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1616780sAu SHORT_DRAMA;
    public static final EnumC1616780sAu SUBSCRIPTION;
    public static final EnumC1616780sAu UNSPECIFIED;
    public final int LL;

    public static final EnumC1616780sAu fromValue(int i) {
        Companion.getClass();
        return C1616790sAv.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC1616780sAu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1616780sAu enumC1616780sAu = new EnumC1616780sAu("UNSPECIFIED", 0, 0);
        UNSPECIFIED = enumC1616780sAu;
        EnumC1616780sAu enumC1616780sAu2 = new EnumC1616780sAu("SHORT_DRAMA", 1, 1);
        SHORT_DRAMA = enumC1616780sAu2;
        EnumC1616780sAu enumC1616780sAu3 = new EnumC1616780sAu("SUBSCRIPTION", 2, 2);
        SUBSCRIPTION = enumC1616780sAu3;
        EnumC1616780sAu[] enumC1616780sAuArr = {enumC1616780sAu, enumC1616780sAu2, enumC1616780sAu3};
        LLILLJJLI = enumC1616780sAuArr;
        LLILLL = new C2254308sP(enumC1616780sAuArr);
        Companion = new C1616790sAv();
    }

    public static EnumC1616780sAu[] values() {
        return (EnumC1616780sAu[]) LLILLJJLI.clone();
    }

    public final boolean isSubscription() {
        return this == SUBSCRIPTION;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1616780sAu valueOf(String str) {
        return (EnumC1616780sAu) C08FF.LIZ(EnumC1616780sAu.class, str);
    }

    public EnumC1616780sAu(String str, int i, int i2) {
        this.LL = i2;
    }
}

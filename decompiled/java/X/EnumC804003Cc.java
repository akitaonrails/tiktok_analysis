package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804003Cc {
    public static final EnumC804003Cc ACTIVITY_TEMPLATE;
    public static final EnumC804003Cc ANCHOR_TEMPLATE;
    public static final /* synthetic */ EnumC804003Cc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804003Cc SEARCH_TEMPLATE;
    public static final EnumC804003Cc UNKNOWN_TEMPLATE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804003Cc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804003Cc enumC804003Cc = new EnumC804003Cc("UNKNOWN_TEMPLATE", 0, 0);
        UNKNOWN_TEMPLATE = enumC804003Cc;
        EnumC804003Cc enumC804003Cc2 = new EnumC804003Cc("ANCHOR_TEMPLATE", 1, 1);
        ANCHOR_TEMPLATE = enumC804003Cc2;
        EnumC804003Cc enumC804003Cc3 = new EnumC804003Cc("SEARCH_TEMPLATE", 2, 2);
        SEARCH_TEMPLATE = enumC804003Cc3;
        EnumC804003Cc enumC804003Cc4 = new EnumC804003Cc("ACTIVITY_TEMPLATE", 3, 3);
        ACTIVITY_TEMPLATE = enumC804003Cc4;
        EnumC804003Cc[] enumC804003CcArr = {enumC804003Cc, enumC804003Cc2, enumC804003Cc3, enumC804003Cc4};
        LLILLJJLI = enumC804003CcArr;
        LLILLL = new C2254308sP(enumC804003CcArr);
    }

    public static EnumC804003Cc[] values() {
        return (EnumC804003Cc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804003Cc valueOf(String str) {
        return (EnumC804003Cc) C08FF.LIZ(EnumC804003Cc.class, str);
    }

    public EnumC804003Cc(String str, int i, int i2) {
        this.LL = i2;
    }
}

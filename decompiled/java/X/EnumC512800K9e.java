package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC512800K9e {
    public static final EnumC512800K9e CLICK_CONTENT;
    public static final EnumC512800K9e CONFLICT_CONTROLLED;
    public static final EnumC512800K9e END_LIFECYCLE;
    public static final EnumC512800K9e FREQUENCY_CONTROLLED;
    public static final /* synthetic */ EnumC512800K9e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC512800K9e MANUALLY_CLOSE;
    public static final EnumC512800K9e OTHERS;
    public static final EnumC512800K9e TIMEOUT;

    public static InterfaceC2044707zh<EnumC512800K9e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC512800K9e enumC512800K9e = new EnumC512800K9e("TIMEOUT", 0);
        TIMEOUT = enumC512800K9e;
        EnumC512800K9e enumC512800K9e2 = new EnumC512800K9e("MANUALLY_CLOSE", 1);
        MANUALLY_CLOSE = enumC512800K9e2;
        EnumC512800K9e enumC512800K9e3 = new EnumC512800K9e("CLICK_CONTENT", 2);
        CLICK_CONTENT = enumC512800K9e3;
        EnumC512800K9e enumC512800K9e4 = new EnumC512800K9e("FREQUENCY_CONTROLLED", 3);
        FREQUENCY_CONTROLLED = enumC512800K9e4;
        EnumC512800K9e enumC512800K9e5 = new EnumC512800K9e("CONFLICT_CONTROLLED", 4);
        CONFLICT_CONTROLLED = enumC512800K9e5;
        EnumC512800K9e enumC512800K9e6 = new EnumC512800K9e("END_LIFECYCLE", 5);
        END_LIFECYCLE = enumC512800K9e6;
        EnumC512800K9e enumC512800K9e7 = new EnumC512800K9e("OTHERS", 6);
        OTHERS = enumC512800K9e7;
        EnumC512800K9e[] enumC512800K9eArr = {enumC512800K9e, enumC512800K9e2, enumC512800K9e3, enumC512800K9e4, enumC512800K9e5, enumC512800K9e6, enumC512800K9e7};
        LL = enumC512800K9eArr;
        LLILLJJLI = new C2254308sP(enumC512800K9eArr);
    }

    public static EnumC512800K9e[] values() {
        return (EnumC512800K9e[]) LL.clone();
    }

    public static EnumC512800K9e valueOf(String str) {
        return (EnumC512800K9e) C08FF.LIZ(EnumC512800K9e.class, str);
    }

    public EnumC512800K9e(String str, int i) {
    }
}

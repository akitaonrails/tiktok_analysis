package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21268018Kw {
    public static final EnumC21268018Kw ALLOW;
    public static final EnumC21268018Kw DEAD_ZONE_BLOCK;
    public static final /* synthetic */ EnumC21268018Kw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21268018Kw UNSAFE_ZONE_NO_CALLER_FOUND;
    public static final EnumC21268018Kw UNSAFE_ZONE_ROUTER_NO_CALLER_FOUND;
    public static final EnumC21268018Kw UNSAFE_ZONE_SENSITIVE_BLOCK;

    public static InterfaceC2044707zh<EnumC21268018Kw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21268018Kw enumC21268018Kw = new EnumC21268018Kw("ALLOW", 0);
        ALLOW = enumC21268018Kw;
        EnumC21268018Kw enumC21268018Kw2 = new EnumC21268018Kw("DEAD_ZONE_BLOCK", 1);
        DEAD_ZONE_BLOCK = enumC21268018Kw2;
        EnumC21268018Kw enumC21268018Kw3 = new EnumC21268018Kw("UNSAFE_ZONE_SENSITIVE_BLOCK", 2);
        UNSAFE_ZONE_SENSITIVE_BLOCK = enumC21268018Kw3;
        EnumC21268018Kw enumC21268018Kw4 = new EnumC21268018Kw("UNSAFE_ZONE_NO_CALLER_FOUND", 3);
        UNSAFE_ZONE_NO_CALLER_FOUND = enumC21268018Kw4;
        EnumC21268018Kw enumC21268018Kw5 = new EnumC21268018Kw("UNSAFE_ZONE_ROUTER_NO_CALLER_FOUND", 4);
        UNSAFE_ZONE_ROUTER_NO_CALLER_FOUND = enumC21268018Kw5;
        EnumC21268018Kw[] enumC21268018KwArr = {enumC21268018Kw, enumC21268018Kw2, enumC21268018Kw3, enumC21268018Kw4, enumC21268018Kw5};
        LL = enumC21268018KwArr;
        LLILLJJLI = new C2254308sP(enumC21268018KwArr);
    }

    public static EnumC21268018Kw[] values() {
        return (EnumC21268018Kw[]) LL.clone();
    }

    public final int getCode() {
        return ordinal() + 400;
    }

    public static EnumC21268018Kw valueOf(String str) {
        return (EnumC21268018Kw) C08FF.LIZ(EnumC21268018Kw.class, str);
    }

    public EnumC21268018Kw(String str, int i) {
    }
}

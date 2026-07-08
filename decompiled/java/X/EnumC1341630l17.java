package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341630l17 {
    public static final EnumC1341630l17 DETAIL;
    public static final /* synthetic */ EnumC1341630l17[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1341630l17 PROFILE;

    public static InterfaceC2044707zh<EnumC1341630l17> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1341630l17 enumC1341630l17 = new EnumC1341630l17("DETAIL", 0);
        DETAIL = enumC1341630l17;
        EnumC1341630l17 enumC1341630l172 = new EnumC1341630l17("PROFILE", 1);
        PROFILE = enumC1341630l172;
        EnumC1341630l17[] enumC1341630l17Arr = {enumC1341630l17, enumC1341630l172};
        LL = enumC1341630l17Arr;
        LLILLJJLI = new C2254308sP(enumC1341630l17Arr);
    }

    public static EnumC1341630l17[] values() {
        return (EnumC1341630l17[]) LL.clone();
    }

    public static EnumC1341630l17 valueOf(String str) {
        return (EnumC1341630l17) C08FF.LIZ(EnumC1341630l17.class, str);
    }

    public EnumC1341630l17(String str, int i) {
    }
}

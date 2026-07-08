package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895080Z9m {
    public static final /* synthetic */ EnumC895080Z9m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC895080Z9m NOTICE;
    public static final EnumC895080Z9m STREAK;

    public static InterfaceC2044707zh<EnumC895080Z9m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC895080Z9m enumC895080Z9m = new EnumC895080Z9m("NOTICE", 0);
        NOTICE = enumC895080Z9m;
        EnumC895080Z9m enumC895080Z9m2 = new EnumC895080Z9m("STREAK", 1);
        STREAK = enumC895080Z9m2;
        EnumC895080Z9m[] enumC895080Z9mArr = {enumC895080Z9m, enumC895080Z9m2};
        LL = enumC895080Z9mArr;
        LLILLJJLI = new C2254308sP(enumC895080Z9mArr);
    }

    public static EnumC895080Z9m[] values() {
        return (EnumC895080Z9m[]) LL.clone();
    }

    public static EnumC895080Z9m valueOf(String str) {
        return (EnumC895080Z9m) C08FF.LIZ(EnumC895080Z9m.class, str);
    }

    public EnumC895080Z9m(String str, int i) {
    }
}

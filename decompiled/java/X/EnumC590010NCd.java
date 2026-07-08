package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590010NCd {
    public static final /* synthetic */ EnumC590010NCd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC590010NCd PNS_USER_TYPE_KIDS;
    public static final EnumC590010NCd PNS_USER_TYPE_NORMAL;
    public static final EnumC590010NCd PNS_USER_TYPE_UNDERAGE;

    public static InterfaceC2044707zh<EnumC590010NCd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC590010NCd enumC590010NCd = new EnumC590010NCd("PNS_USER_TYPE_NORMAL", 0);
        PNS_USER_TYPE_NORMAL = enumC590010NCd;
        EnumC590010NCd enumC590010NCd2 = new EnumC590010NCd("PNS_USER_TYPE_KIDS", 1);
        PNS_USER_TYPE_KIDS = enumC590010NCd2;
        EnumC590010NCd enumC590010NCd3 = new EnumC590010NCd("PNS_USER_TYPE_UNDERAGE", 2);
        PNS_USER_TYPE_UNDERAGE = enumC590010NCd3;
        EnumC590010NCd[] enumC590010NCdArr = {enumC590010NCd, enumC590010NCd2, enumC590010NCd3};
        LL = enumC590010NCdArr;
        LLILLJJLI = new C2254308sP(enumC590010NCdArr);
    }

    public static EnumC590010NCd[] values() {
        return (EnumC590010NCd[]) LL.clone();
    }

    public static EnumC590010NCd valueOf(String str) {
        return (EnumC590010NCd) C08FF.LIZ(EnumC590010NCd.class, str);
    }

    public EnumC590010NCd(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154930g9z {
    public static final EnumC1154930g9z FYP_AND_FRIENDS_MUF_POST;
    public static final EnumC1154930g9z FYP_AND_FRIENDS_REPOST;
    public static final /* synthetic */ EnumC1154930g9z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154930g9z REPOST;

    public static InterfaceC2044707zh<EnumC1154930g9z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154930g9z enumC1154930g9z = new EnumC1154930g9z("REPOST", 0);
        REPOST = enumC1154930g9z;
        EnumC1154930g9z enumC1154930g9z2 = new EnumC1154930g9z("FYP_AND_FRIENDS_MUF_POST", 1);
        FYP_AND_FRIENDS_MUF_POST = enumC1154930g9z2;
        EnumC1154930g9z enumC1154930g9z3 = new EnumC1154930g9z("FYP_AND_FRIENDS_REPOST", 2);
        FYP_AND_FRIENDS_REPOST = enumC1154930g9z3;
        EnumC1154930g9z[] enumC1154930g9zArr = {enumC1154930g9z, enumC1154930g9z2, enumC1154930g9z3};
        LL = enumC1154930g9zArr;
        LLILLJJLI = new C2254308sP(enumC1154930g9zArr);
    }

    public static EnumC1154930g9z[] values() {
        return (EnumC1154930g9z[]) LL.clone();
    }

    public static EnumC1154930g9z valueOf(String str) {
        return (EnumC1154930g9z) C08FF.LIZ(EnumC1154930g9z.class, str);
    }

    public EnumC1154930g9z(String str, int i) {
    }
}

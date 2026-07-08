package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992450bvv {
    public static final EnumC992450bvv ICONMARK;
    public static final /* synthetic */ EnumC992450bvv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992450bvv NONE;
    public static final EnumC992450bvv REDDOT;
    public static final EnumC992450bvv REDNUM;

    public static InterfaceC2044707zh<EnumC992450bvv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992450bvv enumC992450bvv = new EnumC992450bvv("NONE", 0);
        NONE = enumC992450bvv;
        EnumC992450bvv enumC992450bvv2 = new EnumC992450bvv("REDDOT", 1);
        REDDOT = enumC992450bvv2;
        EnumC992450bvv enumC992450bvv3 = new EnumC992450bvv("REDNUM", 2);
        REDNUM = enumC992450bvv3;
        EnumC992450bvv enumC992450bvv4 = new EnumC992450bvv("ICONMARK", 3);
        ICONMARK = enumC992450bvv4;
        EnumC992450bvv[] enumC992450bvvArr = {enumC992450bvv, enumC992450bvv2, enumC992450bvv3, enumC992450bvv4};
        LL = enumC992450bvvArr;
        LLILLJJLI = new C2254308sP(enumC992450bvvArr);
    }

    public static EnumC992450bvv[] values() {
        return (EnumC992450bvv[]) LL.clone();
    }

    public static EnumC992450bvv valueOf(String str) {
        return (EnumC992450bvv) C08FF.LIZ(EnumC992450bvv.class, str);
    }

    public EnumC992450bvv(String str, int i) {
    }
}

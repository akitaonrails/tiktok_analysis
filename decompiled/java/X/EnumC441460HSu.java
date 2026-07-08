package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441460HSu {
    public static final /* synthetic */ EnumC441460HSu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC441460HSu NETWORK_EXCEPTION;
    public static final EnumC441460HSu TIMEOUT;

    public static InterfaceC2044707zh<EnumC441460HSu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC441460HSu enumC441460HSu = new EnumC441460HSu("NETWORK_EXCEPTION", 0);
        NETWORK_EXCEPTION = enumC441460HSu;
        EnumC441460HSu enumC441460HSu2 = new EnumC441460HSu("TIMEOUT", 1);
        TIMEOUT = enumC441460HSu2;
        EnumC441460HSu[] enumC441460HSuArr = {enumC441460HSu, enumC441460HSu2};
        LL = enumC441460HSuArr;
        LLILLJJLI = new C2254308sP(enumC441460HSuArr);
    }

    public static EnumC441460HSu[] values() {
        return (EnumC441460HSu[]) LL.clone();
    }

    public static EnumC441460HSu valueOf(String str) {
        return (EnumC441460HSu) C08FF.LIZ(EnumC441460HSu.class, str);
    }

    public EnumC441460HSu(String str, int i) {
    }
}

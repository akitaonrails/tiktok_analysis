package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC877180Yb6 {
    public static final EnumC877180Yb6 BUYER;
    public static final /* synthetic */ EnumC877180Yb6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "conv_relation_buyer";

    public static InterfaceC2044707zh<EnumC877180Yb6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC877180Yb6 enumC877180Yb6 = new EnumC877180Yb6();
        BUYER = enumC877180Yb6;
        EnumC877180Yb6[] enumC877180Yb6Arr = {enumC877180Yb6};
        LLILLJJLI = enumC877180Yb6Arr;
        LLILLL = new C2254308sP(enumC877180Yb6Arr);
    }

    public static EnumC877180Yb6[] values() {
        return (EnumC877180Yb6[]) LLILLJJLI.clone();
    }

    public final String getKvKey() {
        return this.LL;
    }

    public static EnumC877180Yb6 valueOf(String str) {
        return (EnumC877180Yb6) C08FF.LIZ(EnumC877180Yb6.class, str);
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1458240o3C {
    public static final EnumC1458240o3C ALL;
    public static final /* synthetic */ EnumC1458240o3C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1458240o3C POST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1458240o3C> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1458240o3C enumC1458240o3C = new EnumC1458240o3C("ALL", 0, "Sounds");
        ALL = enumC1458240o3C;
        EnumC1458240o3C enumC1458240o3C2 = new EnumC1458240o3C("POST", 1, "Posts");
        POST = enumC1458240o3C2;
        EnumC1458240o3C[] enumC1458240o3CArr = {enumC1458240o3C, enumC1458240o3C2};
        LLILLJJLI = enumC1458240o3CArr;
        LLILLL = new C2254308sP(enumC1458240o3CArr);
    }

    public static EnumC1458240o3C[] values() {
        return (EnumC1458240o3C[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1458240o3C valueOf(String str) {
        return (EnumC1458240o3C) C08FF.LIZ(EnumC1458240o3C.class, str);
    }

    public EnumC1458240o3C(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pE0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1503380pE0 {
    public static final EnumC1503380pE0 DELETE;
    public static final EnumC1503380pE0 DOWNLOAD;
    public static final EnumC1503380pE0 GET;
    public static final /* synthetic */ EnumC1503380pE0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1503380pE0 POST;
    public static final EnumC1503380pE0 PUT;

    public static InterfaceC2044707zh<EnumC1503380pE0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1503380pE0 enumC1503380pE0 = new EnumC1503380pE0("GET", 0);
        GET = enumC1503380pE0;
        EnumC1503380pE0 enumC1503380pE02 = new EnumC1503380pE0("POST", 1);
        POST = enumC1503380pE02;
        EnumC1503380pE0 enumC1503380pE03 = new EnumC1503380pE0("PUT", 2);
        PUT = enumC1503380pE03;
        EnumC1503380pE0 enumC1503380pE04 = new EnumC1503380pE0("DELETE", 3);
        DELETE = enumC1503380pE04;
        EnumC1503380pE0 enumC1503380pE05 = new EnumC1503380pE0("DOWNLOAD", 4);
        DOWNLOAD = enumC1503380pE05;
        EnumC1503380pE0[] enumC1503380pE0Arr = {enumC1503380pE0, enumC1503380pE02, enumC1503380pE03, enumC1503380pE04, enumC1503380pE05};
        LL = enumC1503380pE0Arr;
        LLILLJJLI = new C2254308sP(enumC1503380pE0Arr);
    }

    public static EnumC1503380pE0[] values() {
        return (EnumC1503380pE0[]) LL.clone();
    }

    public static EnumC1503380pE0 valueOf(String str) {
        return (EnumC1503380pE0) C08FF.LIZ(EnumC1503380pE0.class, str);
    }

    public EnumC1503380pE0(String str, int i) {
    }
}

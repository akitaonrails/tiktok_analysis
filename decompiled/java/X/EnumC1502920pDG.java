package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1502920pDG {
    public static final EnumC1502920pDG DELETE;
    public static final EnumC1502920pDG DOWNLOAD;
    public static final EnumC1502920pDG GET;
    public static final /* synthetic */ EnumC1502920pDG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1502920pDG POST;
    public static final EnumC1502920pDG PUT;

    public static InterfaceC2044707zh<EnumC1502920pDG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1502920pDG enumC1502920pDG = new EnumC1502920pDG("GET", 0);
        GET = enumC1502920pDG;
        EnumC1502920pDG enumC1502920pDG2 = new EnumC1502920pDG("POST", 1);
        POST = enumC1502920pDG2;
        EnumC1502920pDG enumC1502920pDG3 = new EnumC1502920pDG("PUT", 2);
        PUT = enumC1502920pDG3;
        EnumC1502920pDG enumC1502920pDG4 = new EnumC1502920pDG("DELETE", 3);
        DELETE = enumC1502920pDG4;
        EnumC1502920pDG enumC1502920pDG5 = new EnumC1502920pDG("DOWNLOAD", 4);
        DOWNLOAD = enumC1502920pDG5;
        EnumC1502920pDG[] enumC1502920pDGArr = {enumC1502920pDG, enumC1502920pDG2, enumC1502920pDG3, enumC1502920pDG4, enumC1502920pDG5};
        LL = enumC1502920pDGArr;
        LLILLJJLI = new C2254308sP(enumC1502920pDGArr);
    }

    public static EnumC1502920pDG[] values() {
        return (EnumC1502920pDG[]) LL.clone();
    }

    public static EnumC1502920pDG valueOf(String str) {
        return (EnumC1502920pDG) C08FF.LIZ(EnumC1502920pDG.class, str);
    }

    public EnumC1502920pDG(String str, int i) {
    }
}

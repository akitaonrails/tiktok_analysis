package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1223630hwn {
    public static final EnumC1223630hwn CONTENT_PAGE;
    public static final /* synthetic */ EnumC1223630hwn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1223630hwn SEARCH_PAGE;

    public static InterfaceC2044707zh<EnumC1223630hwn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1223630hwn enumC1223630hwn = new EnumC1223630hwn("CONTENT_PAGE", 0);
        CONTENT_PAGE = enumC1223630hwn;
        EnumC1223630hwn enumC1223630hwn2 = new EnumC1223630hwn("SEARCH_PAGE", 1);
        SEARCH_PAGE = enumC1223630hwn2;
        EnumC1223630hwn[] enumC1223630hwnArr = {enumC1223630hwn, enumC1223630hwn2};
        LL = enumC1223630hwnArr;
        LLILLJJLI = new C2254308sP(enumC1223630hwnArr);
    }

    public static EnumC1223630hwn[] values() {
        return (EnumC1223630hwn[]) LL.clone();
    }

    public static EnumC1223630hwn valueOf(String str) {
        return (EnumC1223630hwn) C08FF.LIZ(EnumC1223630hwn.class, str);
    }

    public EnumC1223630hwn(String str, int i) {
    }
}

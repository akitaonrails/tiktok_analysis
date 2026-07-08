package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ppx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657070Ppx {
    public static final EnumC657070Ppx BEST_MATCH_TAG;
    public static final EnumC657070Ppx BOTTOM_RECOMMEND_INFO;
    public static final EnumC657070Ppx DESC;
    public static final /* synthetic */ EnumC657070Ppx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC657070Ppx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC657070Ppx enumC657070Ppx = new EnumC657070Ppx("DESC", 0);
        DESC = enumC657070Ppx;
        EnumC657070Ppx enumC657070Ppx2 = new EnumC657070Ppx("BOTTOM_RECOMMEND_INFO", 1);
        BOTTOM_RECOMMEND_INFO = enumC657070Ppx2;
        EnumC657070Ppx enumC657070Ppx3 = new EnumC657070Ppx("BEST_MATCH_TAG", 2);
        BEST_MATCH_TAG = enumC657070Ppx3;
        EnumC657070Ppx[] enumC657070PpxArr = {enumC657070Ppx, enumC657070Ppx2, enumC657070Ppx3};
        LL = enumC657070PpxArr;
        LLILLJJLI = new C2254308sP(enumC657070PpxArr);
    }

    public static EnumC657070Ppx[] values() {
        return (EnumC657070Ppx[]) LL.clone();
    }

    public static EnumC657070Ppx valueOf(String str) {
        return (EnumC657070Ppx) C08FF.LIZ(EnumC657070Ppx.class, str);
    }

    public EnumC657070Ppx(String str, int i) {
    }
}
